package aegon.chrome.base.PowerMonitor$1;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.String;
import java.lang.Object;
import aegon.chrome.base.PowerMonitor;

public class PowerMonitor$1 extends BroadcastReceiver	// class@00014e
{

    public void PowerMonitor$1(){
       super();
    }
    public void onReceive(Context p0,Intent p1){
       PowerMonitor.c((p1.getAction()).equals("android.intent.action.ACTION_POWER_DISCONNECTED"));
    }
}
