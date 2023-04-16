package com.kwai.library.wolverine.elements.battery.BatteryDataAdapter$d$a;
import java.lang.Runnable;
import com.kwai.library.wolverine.elements.battery.BatteryDataAdapter$d;
import java.lang.Object;
import o27.a;
import com.kwai.library.wolverine.elements.battery.BatteryDataAdapter;
import l27.a;
import w27.a;
import kotlin.Pair;
import qrd.r0;
import java.lang.Integer;
import com.kwai.library.wolverine.elements.battery.helper.BatteryStatus;
import java.util.HashMap;
import trd.t0;
import java.lang.String;

public final class BatteryDataAdapter$d$a implements Runnable	// class@000aa2
{
    public final BatteryDataAdapter$d b;

    public void BatteryDataAdapter$d$a(BatteryDataAdapter$d p0){
       this.b = p0;
       super();
    }
    public final void run(){
       this.b.b.k(a.a());
       this.b.b.a();
       Pair[] pairArray = new Pair[]{r0.a("type", "battery"),r0.a("value", Integer.valueOf(this.b.b.g())),r0.a("status", this.b.b.j())};
       a.a.b("wpl_type_change_watcher", t0.M(pairArray));
    }
}
