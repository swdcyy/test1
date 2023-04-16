package com.kwai.performance.stability.crash.monitor.c;
import lg7.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.os.Build$VERSION;
import android.os.Build;
import java.util.Locale;
import sg7.a;
import com.kwai.performance.stability.crash.monitor.excluded.b;
import sg7.b;
import sg7.d;
import com.kwai.performance.monitor.base.MonitorBuildConfig;
import sg7.f;
import com.kwai.performance.stability.crash.monitor.excluded.d;
import lg7.e;
import com.kwai.performance.stability.crash.monitor.excluded.c$a;
import com.kwai.performance.stability.crash.monitor.excluded.c;
import com.kwai.performance.stability.crash.monitor.excluded.c$b;
import com.kwai.performance.stability.crash.monitor.excluded.ExcludedHwNsdImplNpe;

public final class c	// class@000e17
{

    public static final void a(c p0){
       b uob;
       a.p(p0, "config");
       int sDK_INT = Build$VERSION.SDK_INT;
       String mANUFACTURER = Build.MANUFACTURER;
       a.o(mANUFACTURER, "MANUFACTURER");
       mANUFACTURER = mANUFACTURER.toUpperCase(Locale.ROOT);
       a.o(mANUFACTURER, "\(this as java.lang.Strin¡­.toUpperCase\(Locale.ROOT\)");
       String str = null;
       int i = 24;
       if (i <= sDK_INT && 28 >= sDK_INT) {
          uob = b.e();
          uob.b(i, 28);
          uob.a(str);
          uob.build().d();
       }
       i = 30;
       if (i >= sDK_INT || MonitorBuildConfig.b()) {
          a uoa = f.e();
          uoa.b(18, i);
          uoa.a(str);
          uoa.build().d();
       }
       int i1 = 27;
       if (i1 == sDK_INT && a.g("OPPO", mANUFACTURER)) {
          uob = d.e();
          uob.b(i1, i1);
          uob.a("OPPO");
          uob.build().d();
       }
       if (p0.g != null || (sDK_INT < 29 || (a.g("VIVO", mANUFACTURER) || 28 >= sDK_INT))) {
          c.f(new e(p0));
          c$b uob1 = c.e();
          uob1.c(p0.g);
          uob1.build().d();
       }
       int i2 = 23;
       if (i2 <= sDK_INT && (26 >= sDK_INT && a.g("HUAWEI", mANUFACTURER))) {
          b uob2 = ExcludedHwNsdImplNpe.e();
          uob2.b(i2, 26);
          uob2.a("HUAWEI");
          uob2.build().d();
       }
    label_00c0 :
       return;
    }
}
