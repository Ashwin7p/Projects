from django.db import models
from django.utils import timezone
from django_unixdatetimefield import UnixDateTimeField

# Create your models here.Used constraints in Database.
class User(models.Model):
    id = models.IntegerField(primary_key=True)
    email = models.EmailField(unique=True)
    location = models.TextField(blank=True, null=True)
    first_name = models.TextField(blank=True, null=True)
    last_name = models.TextField(blank=True, null=True)
    role = models.TextField(blank=True, null=True)
    created_at = UnixDateTimeField(auto_now_add=True)
    updated_at = UnixDateTimeField(auto_now=True)
    active_user = models.IntegerField()
    #author = models.ForeignKey(User, on_delete=models.CASCADE, related_name='stories')
    manager = models.ForeignKey('self', models.DO_NOTHING, blank=True, null=True,related_name='Rel_manager')
    vp = models.ForeignKey('self', models.DO_NOTHING, blank=True, null=True,related_name='Rel_vp')


    #def save(self, *args, **kwargs):
     #   ''' On save, update timestamps '''
      #  if not self.id:
       #     self.created = timezone.now()
        #self.modified = timezone.now()
        #return super(User, self).save(*args, **kwargs)


    class Meta:
        managed = True
        db_table = 'user'

