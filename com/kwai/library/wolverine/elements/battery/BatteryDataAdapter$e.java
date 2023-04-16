package com.kwai.library.wolverine.elements.battery.BatteryDataAdapter$e;
import o27.b;
import com.kwai.library.wolverine.elements.battery.BatteryDataAdapter;
import java.lang.Object;
import w27.a;
import java.lang.String;
import com.kwai.library.wolverine.elements.battery.BatteryDataAdapter$e$b;
import java.lang.Runnable;
import com.kwai.library.wolverine.elements.battery.BatteryDataAdapter$e$a;
import com.kwai.library.wolverine.elements.battery.helper.BatteryStatus;
import kotlin.jvm.internal.a;
import java.lang.Enum;
import java.util.Objects;
import kotlin.Pair;
import qrd.r0;
import o27.a;
import java.lang.Boolean;
import java.util.HashMap;
import trd.t0;
import com.kwai.library.wolverine.elements.battery.BatteryDataAdapter$e$c;

public final class BatteryDataAdapter$e implements b	// class@000aa7
{
    public final BatteryDataAdapter a;

    public void BatteryDataAdapter$e(BatteryDataAdapter p0){
       this.a = p0;
       super();
    }
    public void a(){
       a.a.c("wpl_battery_change", "onBatteryLevelOKAY");
       this.a.f(new BatteryDataAdapter$e$b(this));
    }
    public void b(){
       a.a.c("wpl_battery_change", "onBatteryLevelLOW");
       this.a.f(new BatteryDataAdapter$e$a(this));
    }
    public void c(BatteryStatus p0){
       a a;
       a.p(p0, "batteryStatus");
       if (this.a.j() == p0) {
          return;
       }
       a = a.a;
       a.c("wpl_battery_status_change", p0.toString());
       BatteryDataAdapter$e ta = this.a;
       Objects.requireNonNull(ta);
       a.p(p0, "<set-?>");
       ta.f = p0;
       Pair[] pairArray = new Pair[]{r0.a("type", "charging"),r0.a("value", Boolean.valueOf(a.b(p0))),r0.a("status", p0)};
       a.b("wpl_type_change_watcher", t0.M(pairArray));
       this.a.f(new BatteryDataAdapter$e$c(this));
       return;
    }
}
