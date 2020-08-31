from django.shortcuts import render
from django.http import HttpResponse

def index(Request):
    return render(Request,"pages/index.html")

def about(Request):
    return render(Request,"pages/about.html")