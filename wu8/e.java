package wu8.e;
import java.lang.Runnable;
import android.content.Context;
import com.yxcorp.experiment.ABConfigUpdateReceiver;
import java.lang.Object;
import android.content.IntentFilter;
import java.lang.String;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;

public final class e implements Runnable	// class@002787
{
    public final Context b;
    public final ABConfigUpdateReceiver c;

    public void e(Context p0,ABConfigUpdateReceiver p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       e tb = this.b;
       e tc = this.c;
       IntentFilter intentFilter = new IntentFilter();
       try{
          intentFilter.addAction("com.yxcorp.experiment.ABConfigUpdateReceiver");
          UniversalReceiver.e(tb.getApplicationContext(), tc, intentFilter);
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
