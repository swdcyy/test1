package vv8.a;
import java.util.concurrent.CountDownLatch;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.Log;
import android.os.HandlerThread;
import com.yxcorp.utility.NetworkUtilsCached;
import java.lang.InterruptedException;

public class a	// class@0026f8
{
    public static final CountDownLatch a;
    public static boolean b;

    static {
       a.a = new CountDownLatch(1);
       a.b = false;
    }
    public void a(){
       super();
    }
    public static synchronized void a(){
       _monitor_enter(a.class);
       if (PatchProxy.applyVoid(null, null, a.class, "1")) {
          _monitor_exit(a.class);
          return;
       }else if(a.b){
          _monitor_exit(a.class);
          return;
       }else {
          a.b = true;
          Log.g("NetworkInitializerAccelerator", "init\(\)");
          NetworkUtilsCached.i(new HandlerThread("k-plt-ipc-loop"), 3000);
          a.a.countDown();
          _monitor_exit(a.class);
          return;
       }
    }
    public static synchronized void b(){
       _monitor_enter(a.class);
       if (PatchProxy.applyVoid(null, null, a.class, "2")) {
          _monitor_exit(a.class);
          return;
       }else if(!a.b){
          a.a();
       }
       try{
          a.a.await();
       }catch(java.lang.InterruptedException e1){
          e1.printStackTrace();
       }
       _monitor_exit(a.class);
       return;
    }
}
