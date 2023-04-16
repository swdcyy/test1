package sg7.c;
import android.os.Handler$Callback;
import com.kwai.performance.stability.crash.monitor.excluded.a;
import java.lang.Object;
import android.os.Message;
import java.util.Objects;
import android.os.Handler;
import java.lang.Exception;
import java.lang.String;
import java.lang.Class;
import java.lang.CharSequence;
import com.kwai.performance.stability.crash.monitor.message.JavaExceptionMessage;
import com.kwai.performance.stability.crash.monitor.internal.ExceptionHandler$ExceptionType;
import java.lang.Throwable;
import com.kwai.performance.stability.crash.monitor.message.ExceptionMessage;
import com.kwai.performance.stability.crash.monitor.CrashMonitor;

public final class c implements Handler$Callback	// class@00241f
{
    public final a b;

    public void c(a p0){
       this.b = p0;
    }
    public final boolean handleMessage(Message p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       try{
          int i = 1;
          a g = tb.g;
          if (g != null) {
             g.handleMessage(p0);
          }
       label_0087 :
          return i;
       }catch(java.lang.Exception e5){
          e5.printStackTrace();
          String str = null;
          if (e5.getMessage() != null) {
             String str1 = (("RemoteServiceException").equals(e5.getClass().getSimpleName()) || (("ForegroundServiceDidNotStartInTimeException").equals(e5.getClass().getSimpleName()) && (e5.getMessage() != null && ((e5.getMessage()).contains("Bad notification") || (e5.getMessage()).contains("startForegroundService")))))? 1: null;
             if (str1) {
                str = 1;
             }
          }
          if (str) {
             if (e5.getMessage() != null && (e5.getMessage()).contains("PushService")) {
                CrashMonitor.handleException(e5, new JavaExceptionMessage(), ExceptionHandler$ExceptionType.KNOWN_EXCEPTION);
                goto label_0087 ;
             }else {
                CrashMonitor.handleException(e5, new JavaExceptionMessage(), ExceptionHandler$ExceptionType.FAKE_EXCEPTION_RANDOM);
                goto label_0087 ;
             }
          }else {
             throw e5;
          }
       }
    }
}
