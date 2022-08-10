from rest_framework import status
from rest_framework import viewsets
from rest_framework.decorators import action
from rest_framework.response import Response
from AWSLambdaService.serializers import UserUpdateSerializer, UsercreateSerializer
from AWSLambdaService.models import User
from django.shortcuts import get_object_or_404
from .services import Services
from django.core.exceptions import ValidationError
from django.db import DatabaseError,IntegrityError

class UserViews(viewsets.ModelViewSet):
    """
    A pre-defined viewset
    """
    queryset = User.objects.all()
    serializer_class = UserUpdateSerializer
    #def get_queryset(self):
        #email = self.request.query_params.get('email')
        #queryset = User.objects.filter(email=email)
        #return queryset
        #queryset = User.objects.all()
        #emailfield = self.request.query_params.get('email', None)
        #if emailfield is not None:
            #queryset = queryset.filter(email=emailfield)
        #return queryset


    def create(self, request):
        try:
            serializer = UsercreateSerializer(data=request.data)
            serializer.is_valid(raise_exception=True) # check all fields is valid before attempting to save
            serializer.save()
            return Response(serializer.data, status=status.HTTP_201_CREATED)

        #except (IntegrityError, DatabaseError) as e:
            #return Response({"error": e.args}, status=status.HTTP_400_BAD_REQUEST)

        #except ValidationError:
            #return Response(ValidationError.errors, status=status.HTTP_400_BAD_REQUEST)

        except Exception as e:
             return Response({"detail": e.args}, status=status.HTTP_400_BAD_REQUEST)


    def list(self, request):
        queryset = User.objects.all()
        serializer = UsercreateSerializer(queryset, many=True)
        return Response({"status": "success", "data": serializer.data}, status=status.HTTP_200_OK)
        

    @action(detail=True, methods=['GET'])
    def retrieveuser(self, request):
        emailfield = self.request.query_params.get('email')
        #print(self.request.query_params), can loop over map and match as per fields
        print(emailfield)
        if emailfield:
            data = Services.retrieveuserBymail(emailfield)
            return Response({"status": "success", "data": data}, status=status.HTTP_200_OK)
        else:
            return Response("{\"detail\": \"no data found\"}")

    #customize id needed, overridded
    def retrieve(self, request, pk=None):
        queryset = User.objects.all()
        fields = self.request.query_params.get('email')
        print(fields)
        if pk:
            user = get_object_or_404(queryset, pk=pk)
            return Response({"status": "success", "data": UsercreateSerializer(user).data}, status=status.HTTP_200_OK)


    def partial_update(self, request, pk=None):
        try:
            queryset = User.objects.all()
            user = get_object_or_404(queryset, pk=pk)
            serializer = UserUpdateSerializer(user, data=request.data, partial=True)
            serializer.is_valid(raise_exception=True) # check all fields is valid before attempting to save
            serializer.save()
            return Response(serializer.data, status=status.HTTP_201_CREATED)

        #except (IntegrityError, DatabaseError) as e:
            #return Response({"error": e.args}, status=status.HTTP_400_BAD_REQUEST)

        #except ValidationError:
            #return Response({"error": ValidationError.errors}, status=status.HTTP_400_BAD_REQUEST)

        except Exception as e:
             return Response({"error": e.args}, status=status.HTTP_400_BAD_REQUEST)
        
  
  
