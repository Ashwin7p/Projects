## Pre-Requisite:
- pip install virtualenv
****
- create venv for Django Project.<br /> 
python3 -m venv env<br />

- Git-bash:<br />
source env/Scripts/activate<br />

- Install the required modules.<br />
pip install -r requirements.txt

****
##### setup RDS(for local), refer settings.py file
- python manage.py makemigrations
- python manage.py showmigrations
- python manage.py migrate
****
- python manage.py runserver