package com.kwai.performance.overhead.battery.monitor.BatteryInfo$Companion$init$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import qrd.l1;
import ag7.c;
import com.kwai.performance.overhead.battery.monitor.BatteryInfo;
import com.kwai.performance.overhead.battery.monitor.BatteryInfo$Companion;
import java.util.Objects;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import java.util.ArrayList;

public final class BatteryInfo$Companion$init$1 extends Lambda implements a	// class@001116
{
    public static final BatteryInfo$Companion$init$1 INSTANCE;

    static {
       BatteryInfo$Companion$init$1.INSTANCE = new BatteryInfo$Companion$init$1();
    }
    public void BatteryInfo$Companion$init$1(){
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       c b = c.b;
       BatteryInfo$Companion t = BatteryInfo.T;
       boolean i = t.j();
       Objects.requireNonNull(b);
       SharedPreferences a = c.a;
       if (a == null) {
          a.S("mPreferences");
       }
       g.a(a.edit().putInt("cpuCores", i));
       i = t.i();
       Objects.requireNonNull(b);
       a = c.a;
       if (a == null) {
          a.S("mPreferences");
       }
       g.a(a.edit().putInt("cpuJiffiesToMs", i));
       String str = String.valueOf(t.d());
       Objects.requireNonNull(b);
       a.q(str, "policy");
       a = c.a;
       if (a == null) {
          a.S("mPreferences");
       }
       g.a(a.edit().putString("cpuPolicy", str));
       str = String.valueOf(t.a());
       Objects.requireNonNull(b);
       a.q(str, "capacity");
       a = c.a;
       if (a == null) {
          a.S("mPreferences");
       }
       g.a(a.edit().putString("cpuCapacity", str));
       double d = t.c();
       Objects.requireNonNull(b);
       SharedPreferences a1 = c.a;
       if (a1 == null) {
          a.S("mPreferences");
       }
       g.a(a1.edit().putLong("cpuFreqMax", (long)d));
       str = t.h();
       if (str == null) {
          a.L();
       }
       Objects.requireNonNull(b);
       a.q(str, "isolationFile");
       a = c.a;
       if (a == null) {
          a.S("mPreferences");
       }
       g.a(a.edit().putString("cpuIsolationFile", str));
       b.e(BatteryInfo.R);
       i = t.e();
       Objects.requireNonNull(b);
       a = c.a;
       if (a == null) {
          a.S("mPreferences");
       }
       g.a(a.edit().putBoolean("cpuTimeFileExist", i));
       int i1 = t.b();
       Objects.requireNonNull(b);
       SharedPreferences a2 = c.a;
       if (a2 == null) {
          a.S("mPreferences");
       }
       g.a(a2.edit().putInt("cpuIdleInfo", i1));
       b.d(true);
       return;
    }
}
