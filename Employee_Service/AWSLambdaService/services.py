from AWSLambdaService.serializers import UserUpdateSerializer, UsercreateSerializer
from AWSLambdaService.models import User
from django.shortcuts import get_object_or_404

class Services:
    
    @staticmethod
    def retrieveuserBymail(emailfield):
        queryset = User.objects.all()
        user = get_object_or_404(queryset, email=emailfield)
        return UsercreateSerializer(user).data
