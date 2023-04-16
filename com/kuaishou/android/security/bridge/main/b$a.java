package com.kuaishou.android.security.bridge.main.b$a;
import com.kuaishou.android.security.internal.init.c$a;
import com.kuaishou.android.security.bridge.main.b;
import com.kuaishou.android.security.internal.common.h;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.android.security.base.util.KSecurityTrack;
import com.kuaishou.android.security.base.perf.b;
import android.os.ConditionVariable;
import com.kuaishou.android.security.base.perf.e$b;
import com.kuaishou.android.security.base.perf.e;
import com.kuaishou.android.security.base.perf.d$b;
import com.kuaishou.android.security.base.perf.d;
import com.kuaishou.android.security.base.util.j;
import com.kuaishou.android.security.base.log.KSecuritySdkILog;
import java.util.Locale;
import com.kuaishou.android.security.base.perf.c;

public class b$a implements c$a	// class@000f2e
{
    public final int[] a;
    public final h b;
    public final b c;

    public void b$a(b p0,int[] p1,h p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(int p0){
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       b.a(this.c, false);
       KSecurityTrack.sLog(63);
       this.a[0] = b.b;
       b.a(this.c).open();
       e.a(e$b.c, this.b, "async Init onerror", p0);
       d.a(d$b.a, "async Init onerror", b.e);
       j.d().a(b.e);
       KSecurityTrack.setbEnableTrack(false);
       return;
    }
    public void b(int p0){
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       b.a(this.c, false);
       this.a[0] = p0;
       KSecurityTrack.sLog(60);
       b.a(this.c).open();
       if (p0 == b.a) {
          KSecurityTrack.sLog(61);
          this.c.j().e().onSecuriySuccess();
          j.d().j();
       }else {
          KSecurityTrack.sLog(62);
          Object[] objArray = new Object[]{c.a(),Integer.valueOf(p0)};
          String str = String.format(Locale.getDefault(), "async Init onsuccess ret fail t[%s] retcode[%d]", objArray);
          e.a(e$b.c, this.b, str, p0);
          d.a(d$b.d, str, b.d);
          j.d().a(b.d);
       }
       KSecurityTrack.setbEnableTrack(false);
       return;
    }
}
