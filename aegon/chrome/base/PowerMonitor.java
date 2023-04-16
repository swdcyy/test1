package aegon.chrome.base.PowerMonitor;
import java.lang.Object;
import aegon.chrome.base.ThreadUtils;
import android.content.Context;
import a0.f;
import android.content.IntentFilter;
import java.lang.String;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import aegon.chrome.base.PowerMonitor$1;
import android.os.BatteryManager;
import a0.o;
import K.S;

public class PowerMonitor	// class@000150
{
    public boolean a;
    public static PowerMonitor b;
    public static final boolean c;

    public void PowerMonitor(){
       super();
    }
    public static void a(){
       if (PowerMonitor.b != null) {
          return;
       }
       Context uContext = f.a();
       PowerMonitor.b = new PowerMonitor();
       Intent intent = UniversalReceiver.e(uContext, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
       if (intent != null) {
          int i = 0;
          if (!intent.getIntExtra("plugged", i)) {
             i = true;
          }
          PowerMonitor.c(i);
       }
       IntentFilter intentFilter = new IntentFilter();
       intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
       intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
       UniversalReceiver.e(uContext, new PowerMonitor$1(), intentFilter);
       return;
    }
    public static int b(){
       return f.a().getSystemService("batterymanager").getIntProperty(1);
    }
    public static void c(boolean p0){
       PowerMonitor.b.a = p0;
       o.a(false);
       S.MCImhGql();
    }
    public static int getRemainingBatteryCapacity(){
       if (PowerMonitor.b == null) {
          PowerMonitor.a();
       }
       return PowerMonitor.b();
    }
    public static boolean isBatteryPower(){
       if (PowerMonitor.b == null) {
          PowerMonitor.a();
       }
       return PowerMonitor.b.a;
    }
}
