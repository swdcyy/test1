package mo7.c;
import java.lang.Runnable;
import com.kwai.sdk.switchconfig.v1.internal.a;
import java.lang.Object;
import com.kwai.sdk.switchconfig.v1.internal.SwitchConfigUpdateReceiver;
import lo7.f;
import android.content.IntentFilter;
import java.lang.String;
import android.content.Context;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;

public final class c implements Runnable	// class@001eb5
{
    public final a b;

    public void c(a p0){
       this.b = p0;
    }
    public final void run(){
       try{
          a a = this.b.a;
          SwitchConfigUpdateReceiver switchConfig = new SwitchConfigUpdateReceiver();
          if (!f.d()) {
          }else {
             IntentFilter intentFilter = new IntentFilter();
             intentFilter.addAction("com.kwai.sdk.switchconfig.internal.SwitchConfigUpdateReceiver");
             UniversalReceiver.e(a, switchConfig, intentFilter);
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
