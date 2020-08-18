package chromeball;
 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class BallTrialOb {
    static int totalX = 0;
    static JFrame frame = new JFrame("Ball Game");

    public static void main(String[] args) {
        BallTrialOb b = new BallTrialOb();
    }

    public BallTrialOb() {
        EventQueue.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
            }
            
            //Creates the Game Frame
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new FlowLayout());
            frame.add(new BallObstacle());
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }

    public static class BallObstacle extends JPanel {
        
        //Features of the Ball
        protected static final int ballh = 20; //Height of ball
        protected static final int ballw = 20; //Width of Ball
        private float jumpvelocity;            
        private int yPos;
        //Action of gravity while jumping to reduce jumpvelocity
        private float gravity;                 
        private boolean bounce = false;
        
        private Timer GameBegins;
        
        //Features of the obstacle
        protected static final int obstacleh = 30; //Obstacle Height
        protected static final int obstaclew = 15; //Obstacle Width
        private int approachvelocity;            
        private int xPos;
        private int obstacleProb;                  //Probability of obstacle apperance 
        private boolean charge = false;

        public BallObstacle() {

            yPos = 200 - ballh;
            jumpvelocity = 0;
            gravity = 0.5f;
            
            xPos = 515;
            approachvelocity = 0;
            
            //to make ball jump on pressing space
            InputMap im = getInputMap(WHEN_IN_FOCUSED_WINDOW);
            ActionMap am = getActionMap();
            im.put(KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0), "Jump");
            am.put("Jump", new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Can only bound when we're on the ground
                    if (yPos + ballh == getHeight()) {
                        jumpvelocity = -7;
                        bounce = true;
                    }
                }
            });

            GameBegins = new Timer(40, (ActionEvent e) -> {
                int width1 = 500;
                totalX = totalX + 7;
                //generates probablity only if there is no obstacle on the screen
                if(obstacleProb!=1)
                    obstacleProb = (int)(2 * Math.random());
                //obstacle emerges depending on probability
                if((obstacleProb == 1)&&(xPos - obstaclew == 500)){
                    approachvelocity = 7;
                    charge = true;
                }
                if (xPos + 15 > 0) {
                    if (charge) {
                        //Subtract approach velocity from xPos to
                        //make the obstacle approach the ball
                        xPos = xPos - approachvelocity;
                    }
                } else {
                    //Once obstacle crosses the ball reset the
                    //obstacle to its initial position until next occurance
                    xPos = width1 + obstaclew;
                    approachvelocity = 0;
                    charge = false;
                }
                int height1 = 200;
                if (height1 > 0) {
                    if (bounce) {
                        // Add the jumpvelocity to the yPos
                        // jumpvelocity may be postive or negative, allowing
                        // for both up and down movement
                        yPos += jumpvelocity;
                        // Add the gravity to the jumpvelocity, this will slow down
                        // the upward movement and speed up the downward movement
                        jumpvelocity += gravity;
                        if (yPos + ballh >= height1) {
                            // Seat the sprite on the ground
                            yPos = height1 - ballh;
                            //Stop bouncing
                            bounce = false;
                        }
                    }
                }
                repaint();
            });
            GameBegins.start();
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(500, 200);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D ball = (Graphics2D) g.create();
            Graphics2D floor = (Graphics2D) g.create();
            Graphics2D wall = (Graphics2D) g.create();
            Graphics2D back = (Graphics2D) g.create();
            
            back.setColor(Color.WHITE);
            back.fillRect(0, 0, 500, 110);
            
            wall.setColor(Color.BLACK);
            wall.fillRect(xPos,80,15,30);
            
            floor.setColor(Color.BLACK);
            floor.fillRect(0,110,500,90);
            
            ball.setColor(Color.RED);
            ball.fillOval(30,yPos-90,20,20);
            
            back.dispose();
            ball.dispose();
            wall.dispose();
            floor.dispose();
            
            int Score = totalX/500,maxScore=0;
            FileWriter fout;
            Scanner fin;
            
            
            
            
            if((Math.abs(40-xPos-7.5)<=17.5)&&(Math.abs(yPos-90-95)<=25)){
                GameBegins.stop();
                try {
                fin = new Scanner(new File("HighScore.txt"));
                while(fin.hasNextInt()){
                    maxScore = fin.nextInt();
                }
                fin.close();
                } 
                catch (FileNotFoundException ex) {
                }
                if(Score>maxScore){
                    try {
                        fout = new FileWriter("HighScore.txt");
                        fout.write(Score+"\n");
                        fout.close();
                    } 
                    catch (IOException ex) {
                    }
                    JOptionPane.showMessageDialog(null, "Game Over. New Highscore : " + Score);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Game Over. Highscore : " + maxScore);
                }
                frame.setVisible(false); 
                frame.dispose();
            }
        }
    }
}