package aegon.chrome.base.JavaHandlerThread;
import java.lang.String;
import java.lang.Object;
import android.os.HandlerThread;
import java.lang.Throwable;
import aegon.chrome.base.JavaHandlerThread$c;
import java.lang.Thread$UncaughtExceptionHandler;
import android.os.Handler;
import android.os.Looper;
import aegon.chrome.base.JavaHandlerThread$b;
import java.lang.Runnable;
import java.lang.Thread$State;
import aegon.chrome.base.JavaHandlerThread$a;

public class JavaHandlerThread	// class@000141
{
    public final HandlerThread a;
    public Throwable b;
    public static final boolean c;

    public void JavaHandlerThread(String p0,int p1){
       super();
       this.a = new HandlerThread(p0, p1);
    }
    public static JavaHandlerThread create(String p0,int p1){
       return new JavaHandlerThread(p0, p1);
    }
    public final Throwable getUncaughtExceptionIfAny(){
       return this.b;
    }
    public final boolean isAlive(){
       return this.a.isAlive();
    }
    public final void joinThread(){
       int i = 0;
       while (!i) {
          try{
             this.a.join();
             i = 1;
          }catch(java.lang.InterruptedException e0){
             goto label_0001 ;
          }
       }
       return;
    }
    public final void listenForUncaughtExceptionsForTesting(){
       this.a.setUncaughtExceptionHandler(new JavaHandlerThread$c(this));
    }
    public final void quitThreadSafely(long p0){
       new Handler(this.a.getLooper()).post(new JavaHandlerThread$b(this, p0));
       this.a.getLooper().quitSafely();
    }
    public final void startAndInitialize(long p0,long p1){
       Handler handler = (this.a.getState() != Thread$State.NEW)? 1: null;
       if (!handler) {
          this.a.start();
       }
       JavaHandlerThread$a uoa = new JavaHandlerThread$a(this, p0, p1);
       new Handler(this.a.getLooper()).post(v1);
       return;
    }
}
