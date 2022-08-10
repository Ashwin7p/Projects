from rest_framework import serializers
from rest_framework.validators import UniqueValidator
from .models import User

#expossed to clients and constarints on their side data
class UsercreateSerializer(serializers.ModelSerializer):
    id = serializers.IntegerField(validators=[UniqueValidator(queryset=User.objects.all(),message="Unique Id Required")])
    email = serializers.EmailField(validators=[UniqueValidator(queryset=User.objects.all(), message="Unique EmailId-Required")])
    location = serializers.CharField()
    first_name = serializers.CharField()
    last_name = serializers.CharField()
    role = serializers.CharField(required=False, default='EMPLOYEE')
    #created_at = serializers.IntegerField(read_only=True)#ignored if input
    active_user = serializers.IntegerField()
    manager = serializers.IntegerField(required=False, allow_null=True)
    vp = serializers.IntegerField(required=False, allow_null=True)

    class Meta:
        model = User
        #fields = ('__all__') #all fields to be serialized and send(exposed)
        fields = ['id','email','location','first_name','last_name','role','created_at','active_user','manager','vp']


#expossed to clients and constarints on their side data
class UserUpdateSerializer(serializers.ModelSerializer):
    id = serializers.IntegerField(read_only=True)
    email = serializers.EmailField(validators=[UniqueValidator(queryset=User.objects.all(), message="Unique EmailId-Required")])
    location = serializers.CharField()
    first_name = serializers.CharField()
    last_name = serializers.CharField()
    role = serializers.CharField(required=False, default='EMPLOYEE')
    active_user = serializers.IntegerField()
    manager = serializers.IntegerField(required=False, allow_null=True)
    vp = serializers.IntegerField(required=False, allow_null=True)

    class Meta:
        model = User
        #fields = ('__all__') #all fields to be serialized and send
        fields = ['id','email','location','first_name','last_name','role','updated_at','active_user','manager','vp']
