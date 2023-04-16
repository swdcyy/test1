package com.kwai.library.wolverine.elements.battery.BatteryDataAdapter$e$b;
import java.lang.Runnable;
import com.kwai.library.wolverine.elements.battery.BatteryDataAdapter$e;
import java.lang.Object;
import o27.a;
import com.kwai.library.wolverine.elements.battery.BatteryDataAdapter;
import l27.a;
import w27.a;
import kotlin.Pair;
import qrd.r0;
import java.lang.Integer;
import java.util.HashMap;
import trd.t0;
import java.lang.String;

public final class BatteryDataAdapter$e$b implements Runnable	// class@000aa5
{
    public final BatteryDataAdapter$e b;

    public void BatteryDataAdapter$e$b(BatteryDataAdapter$e p0){
       this.b = p0;
       super();
    }
    public final void run(){
       this.b.a.k(a.a());
       this.b.a.a();
       Pair[] pairArray = new Pair[]{r0.a("type", "battery"),r0.a("value", Integer.valueOf(this.b.a.g())),r0.a("status", "BATTERY_OKAY")};
       a.a.b("wpl_type_change_watcher", t0.M(pairArray));
    }
}
