package androidx.core.app.CoreComponentFactory;
import android.app.AppComponentFactory;
import java.lang.Object;
import androidx.core.app.CoreComponentFactory$a;
import java.lang.ClassLoader;
import java.lang.String;
import android.content.Intent;
import android.app.Activity;
import android.app.Application;
import android.content.ContentProvider;
import android.content.BroadcastReceiver;
import android.app.Service;

public class CoreComponentFactory extends AppComponentFactory	// class@000217
{

    public void CoreComponentFactory(){
       super();
    }
    public static Object a(Object p0){
       if (p0 instanceof CoreComponentFactory$a) {
          Object obj = p0.a();
          if (obj != null) {
             return obj;
          }
       }
       return p0;
    }
    public Activity instantiateActivity(ClassLoader p0,String p1,Intent p2){
       return CoreComponentFactory.a(super.instantiateActivity(p0, p1, p2));
    }
    public Application instantiateApplication(ClassLoader p0,String p1){
       return CoreComponentFactory.a(super.instantiateApplication(p0, p1));
    }
    public ContentProvider instantiateProvider(ClassLoader p0,String p1){
       return CoreComponentFactory.a(super.instantiateProvider(p0, p1));
    }
    public BroadcastReceiver instantiateReceiver(ClassLoader p0,String p1,Intent p2){
       return CoreComponentFactory.a(super.instantiateReceiver(p0, p1, p2));
    }
    public Service instantiateService(ClassLoader p0,String p1,Intent p2){
       return CoreComponentFactory.a(super.instantiateService(p0, p1, p2));
    }
}
