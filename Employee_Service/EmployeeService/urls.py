#from rest_framework.routers import DefaultRouter
#from AWSLambdaService.views import UserViews
#from django.urls import path, include
from django.contrib import admin
from django.conf.urls import url, include
from django.urls import path

urlpatterns = urlpatterns = [
    url(r'^', include('AWSLambdaService.urls')),
]