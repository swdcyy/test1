package m9a.b0;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.util.RegisterSysHomeButtonClickReceiverThread;
import java.lang.Object;
import java.lang.ref.WeakReference;
import android.app.Activity;
import android.content.Context;
import android.content.BroadcastReceiver;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import java.lang.Exception;
import java.lang.String;
import java.lang.Throwable;
import com.yxcorp.utility.Log;

public final class b0 implements Runnable	// class@002f72
{
    public final RegisterSysHomeButtonClickReceiverThread b;

    public void b0(RegisterSysHomeButtonClickReceiverThread p0){
       this.b = p0;
    }
    public final void run(){
       b0 tb = this.b;
       Activity uActivity = tb.b.get();
       if (uActivity != null) {
          RegisterSysHomeButtonClickReceiverThread c = tb.c;
          _monitor_enter(c);
          if (tb.e != null) {
             try{
                UniversalReceiver.f(uActivity, tb.c);
             }catch(java.lang.Exception e1){
                e1.printStackTrace();
                Log.e("unregisterReceiver", "Exception", e1);
             }
             tb.e = false;
          }
          _monitor_exit(c);
       }
       return;
    }
}
