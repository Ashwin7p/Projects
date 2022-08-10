from django.urls import path, include
from django.conf.urls import url
from rest_framework import routers
from . import views
router = routers.DefaultRouter()
router.register(r'users', views.UserViews)
 
 
urlpatterns = [
    path('', include(router.urls)),
    url(r'users?$', view=views.UserViews.as_view({'get':'retrieveuser'})),
]