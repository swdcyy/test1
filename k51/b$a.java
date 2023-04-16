package k51.b$a;
import java.lang.Runnable;
import java.lang.String;
import msd.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import o56.a;
import android.os.Trace;
import qrd.l1;
import com.yxcorp.utility.SystemUtil;
import com.kuaishou.android.live.log.LiveLogTag;
import nsd.r0;
import java.lang.Float;
import java.util.Arrays;
import kotlin.jvm.internal.a;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class b$a implements Runnable	// class@002c8c
{
    public final String b;
    public final Runnable c;
    public final a d;

    public void b$a(String p0,Runnable p1,a p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "1")) {
          return;
       }
       b$a tb = this.b;
       long l = System.nanoTime();
       if (a.d()) {
          Trace.beginSection(tb);
       }
       this.c.run();
       if (a.d()) {
          Trace.endSection();
       }
       float f = (float)(System.nanoTime() - l) / 1000000.00f;
       if (a.d() && !SystemUtil.R()) {
          Object[] objArray = new Object[]{tb,Float.valueOf(f)};
          String str = String.format("%s - %.3fms", Arrays.copyOf(objArray, 2));
          a.o(str, "java.lang.String.format\(format, *args\)");
          b.Z(LiveLogTag.LIVE_PERFORMANCE, str);
       }
       tb = this.d;
       if (tb != null) {
          tb.invoke();
       }
       return;
    }
}
