package com.kwai.library.wolverine.elements.battery.BatteryDataAdapter$mReceiver$1;
import android.content.BroadcastReceiver;
import com.kwai.library.wolverine.elements.battery.BatteryDataAdapter;
import android.content.Context;
import android.content.Intent;
import o27.a;
import w27.a;
import java.lang.Boolean;
import java.lang.String;
import java.lang.Object;
import qrd.l1;
import l27.a;

public final class BatteryDataAdapter$mReceiver$1 extends BroadcastReceiver	// class@000aa9
{
    public final BatteryDataAdapter a;

    public void BatteryDataAdapter$mReceiver$1(BatteryDataAdapter p0){
       this.a = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       boolean b = a.d();
       a.a.b("wpl_power_save_mode_broadcast_receive", Boolean.valueOf(b));
       this.a.l(b);
       this.a.a();
    }
}
