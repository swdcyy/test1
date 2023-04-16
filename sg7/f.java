package sg7.f;
import sg7.d;
import sg7.b;
import sg7.a;
import sg7.f$a;
import com.kwai.performance.monitor.base.MonitorBuildConfig;
import java.lang.Exception;
import java.lang.String;
import java.lang.Class;
import java.lang.reflect.Field;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.Throwable;
import android.util.Log;
import yf7.h;
import java.lang.reflect.Method;

public class f extends d	// class@002422
{
    public static boolean f;

    public void f(b p0){
       super(p0);
    }
    public static a e(){
       return new f$a();
    }
    public boolean a(){
       if (MonitorBuildConfig.b()) {
          return true;
       }
       return super.a();
    }
    public boolean b(Exception p0){
       return false;
    }
    public void d(){
       if (!f.f && !this.a()) {
          f.f = true;
          Class uClass = Class.forName("java.lang.Daemons$FinalizerWatchdogDaemon");
          Field declaredFiel = uClass.getDeclaredField("INSTANCE");
          declaredFiel.setAccessible(true);
          Field declaredFiel1 = uClass.getSuperclass().getDeclaredField("thread");
          declaredFiel1.setAccessible(true);
          declaredFiel1.set(declaredFiel.get(null), null);
       }
    label_00b4 :
       return;
    }
}
