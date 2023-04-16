package androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver$a;
import java.lang.Runnable;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver$PendingResult;
import java.lang.Object;
import java.lang.String;
import k3.h;
import java.lang.Boolean;
import java.lang.Throwable;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import java.lang.Class;
import v3.e;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;

public class ConstraintProxyUpdateReceiver$a implements Runnable	// class@000a76
{
    public final Intent b;
    public final Context c;
    public final BroadcastReceiver$PendingResult d;
    public final ConstraintProxyUpdateReceiver e;

    public void ConstraintProxyUpdateReceiver$a(ConstraintProxyUpdateReceiver p0,Intent p1,Context p2,BroadcastReceiver$PendingResult p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void run(){
       boolean booleanExtra = this.b.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
       boolean booleanExtra1 = this.b.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
       boolean booleanExtra2 = this.b.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
       boolean booleanExtra3 = this.b.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
       Object[] objArray = new Object[]{Boolean.valueOf(booleanExtra),Boolean.valueOf(booleanExtra1),Boolean.valueOf(booleanExtra2),Boolean.valueOf(booleanExtra3)};
       Throwable[] throwableArr = new Throwable[false];
       h.c().a(ConstraintProxyUpdateReceiver.a, String.format("Updating proxies: BatteryNotLowProxy enabled \(%s\), BatteryChargingProxy enabled \(%s\), StorageNotLowProxy \(%s\), NetworkStateProxy enabled \(%s\)", objArray), throwableArr);
       e.a(this.c, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
       e.a(this.c, ConstraintProxy$BatteryChargingProxy.class, booleanExtra1);
       e.a(this.c, ConstraintProxy$StorageNotLowProxy.class, booleanExtra2);
       e.a(this.c, ConstraintProxy$NetworkStateProxy.class, booleanExtra3);
       this.d.finish();
    }
}
