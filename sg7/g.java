package sg7.g;
import android.app.Instrumentation;
import java.lang.reflect.Field;
import java.lang.Class;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Throwable;
import com.kwai.performance.monitor.base.MonitorBuildConfig;
import com.kwai.performance.stability.crash.monitor.message.JavaExceptionMessage;
import com.kwai.performance.stability.crash.monitor.internal.ExceptionHandler$ExceptionType;
import com.kwai.performance.stability.crash.monitor.message.ExceptionMessage;
import com.kwai.performance.stability.crash.monitor.CrashMonitor;

public final class g extends Instrumentation	// class@002423
{

    public void g(Instrumentation p0){
       try{
          super();
          Field[] declaredFiel = Instrumentation.class.getDeclaredFields();
          int len = declaredFiel.length;
          for (int i = 0; i < len; i = i + 1) {
             object oobject = declaredFiel[i];
             oobject.setAccessible(true);
             oobject.set(this, oobject.get(p0));
          }
       }catch(java.lang.Exception e6){
          e6.printStackTrace();
       }
       return;
    }
    public boolean onException(Object p0,Throwable p1){
       if (p0 != null || MonitorBuildConfig.b()) {
          return false;
       }
       CrashMonitor.handleException(p1, new JavaExceptionMessage(), ExceptionHandler$ExceptionType.FAKE_EXCEPTION_RANDOM);
       return true;
    }
}
