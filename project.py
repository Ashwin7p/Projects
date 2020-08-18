# -*- coding: utf-8 -*-
"""
Spyder Editor

This is a temporary script file.
"""
import nltk
nltk.download()

import os

from senticnet.senticnet import SenticNet
sn = SenticNet()
sn.concept('')



def fun1(d):
    try:
       from senticnet.senticnet import SenticNet
       sn = SenticNet()
       sn.semantics(d)
       return True
    except KeyError as error:
       return False
fun1('day')  
    

    
from nltk.corpus import wordnet
sk=wordnet.synset('ssd')    



os.environ['STANFORD_PARSER'] ='C:/Users/Mahe/Desktop/New folder (2)'
os.environ['STANFORD_MODELS'] = 'C:/Users/Mahe/Desktop/New folder (2)'
os.environ['JAVA_HOME']='C:/Program Files/Java/jdk1.8.0_73'


from nltk.parse.stanford import StanfordParser 
parser=StanfordParser(model_path="C:/Users/Mahe/Desktop/New folder (2)/edu/stanford/nlp/models/lexparser/englishPCFG.ser.gz")
s="I shot an elephant in my sleep"

from nltk.corpus import words
'day' in words.words()
import nltk
nltk.download()

sentences=list(parser.raw_parse((s)))

for line in sentences:
    for sentence in line:
        sentence.draw()
        
from nltk.parse.stanford import StanfordDependencyParser
path_to_jar = 'C:/Users/Mahe/Desktop/New folder (2)'
path_to_models_jar = 'C:/Users/Mahe/Desktop/New folder (2)'
dependency_parser = StanfordDependencyParser(model_path="C:/Users/Mahe/Desktop/New folder (2)/edu/stanford/nlp/models/lexparser/englishPCFG.ser.gz")

#result = dependency_parser.raw_parse('I shot an elephant in my sleep')
import nltk
from nltk.tokenize import word_tokenize
a='I was having a problem with its appearance'
b = word_tokenize(a)


result = dependency_parser.raw_parse('I like the beauty of the screen')
dep = result.__next__()
x=list(dep.triples()) 
a=[] 
ax=['be','am', 'are', 'is', 'was', 'were', 'being', 'been', 'can', 'could', 'dare', 'do' ,'does', 'did', 'have','has', 'had', 'having', 'may', 'might', 'must', 'need', 'ought', 'shall', 'should', 'will', 'would']      

for i in x:
    flag=1
    for j in b:
         if j  in ax:
             flag=0
    if flag==1:
        if i[1]=='nsubj' and i[2][-1]=='NN':
            a.append(i[2][0])
                   
        if i[1]=='xcomp' and i[2][-1]=='JJ' and i[0][1]=='VBZ':
            a.append(i[0][0])
        
       
        
         
        
       
       
       
       
       
nltk.download()
        
       

        
        





