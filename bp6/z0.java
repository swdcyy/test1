package bp6.z0;
import java.lang.Runnable;
import com.kwai.imsdk.internal.v;
import java.lang.String;
import java.lang.Object;
import qo6.p;
import java.util.concurrent.atomic.AtomicBoolean;
import bp6.j2;
import com.kwai.imsdk.internal.client.t;
import java.lang.StringBuilder;
import l85.b;
import bp6.c2;
import com.kwai.imsdk.internal.util.f$d;
import com.kwai.imsdk.internal.util.f;

public final class z0 implements Runnable	// class@000560
{
    public final v b;
    public final String c;
    public final long d;

    public void z0(v p0,String p1,long p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       z0 tb = this.b;
       z0 tc = this.c;
       z0 td = this.d;
       tb.z(v.w);
       v g = tb.g;
       _monitor_enter(g);
       if (!tb.g.get()) {
          j2 b = tb.f.b;
          if (!t.o(tb.a).v(tc, b, "imcResourceVersionInfo")) {
             _monitor_exit(g);
          label_0067 :
             return;
          }else {
             b.i("KwaiIMManagerInternal", "requestResourceConfig begin localVersion = "+b+" mSubBiz = "+tb.a);
             f.f(tb.a, b, tb.f(), "", tb.y(), p.b(), tb.f.j, new c2(tb, td));
          }
       }
       _monitor_exit(g);
       goto label_0067 ;
    }
}
