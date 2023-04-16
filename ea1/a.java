package ea1.a;
import com.kuaishou.live.common.core.basic.optimizeui.ViewElement;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ea1.a$a;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import crd.b;
import lnc.b9;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import ea1.a$b;
import erd.g;

public final class a	// class@0020c3
{
    public final c a;
    public boolean b;
    public boolean c;
    public b d;
    public final ViewElement e;
    public final Runnable f;

    public void a(ViewElement p0,Runnable p1){
       a.p(p0, "element");
       a.p(p1, "showRunnable");
       super();
       this.e = p0;
       this.f = p1;
       a$a b = a$a.b;
       this.a = b;
       b.Z(b, p0.getKey$live_common_release()+" LiveViewChoreographer create");
    }
    public final boolean a(){
       return this.c;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       b.Z(this.a, this.e.getKey$live_common_release()+" release");
       b9.a(this.d);
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       b.Z(this.a, this.e.getKey$live_common_release()+" show");
       if (this.e.getDelayTime() - null <= 0) {
          this.d();
       }else if(this.d == null){
          this.d = t.timer(this.e.getDelayTime(), TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new a$b(this));
       }
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       if (this.b == null) {
          this.c = true;
          this.f.run();
          this.b = true;
          b.Z(this.a, this.e.getKey$live_common_release()+" showImmediately");
       }
       return;
    }
}
