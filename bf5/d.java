package bf5.d;
import android.content.Context;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import bf5.d$a;

public abstract class d	// class@000479
{
    public boolean a;
    public boolean b;
    public long c;
    public d$a d;
    public final View e;

    public void d(Context p0,View p1){
       a.p(p0, "context");
       a.p(p1, "view");
       super();
       this.e = p1;
       this.b = true;
    }
    public abstract void a();
    public abstract void b();
    public abstract void c();
    public abstract void d(boolean p0,long p1,int p2);
    public final View e(){
       return this.e;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       this.e.setVisibility(8);
       return;
    }
    public final boolean g(){
       Object obj = PatchProxy.apply(null, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!this.e.getVisibility())? true: false;
       return b;
    }
    public abstract void h(boolean p0);
    public abstract void i(boolean p0);
    public abstract void j(boolean p0);
    public final void k(boolean p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "1")) {
          return;
       }
       this.b = p0;
       this.h(p0);
       return;
    }
    public abstract void l(float p0);
    public abstract void m(boolean p0);
    public abstract void n(boolean p0);
    public abstract void o(int p0);
    public abstract void p(float p0);
    public final void q(d$a p0){
       this.d = p0;
    }
    public final void r(boolean p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "2")) {
          return;
       }
       this.a = p0;
       this.i(p0);
       return;
    }
    public final void s(){
       if (PatchProxy.applyVoid(null, this, d.class, "5")) {
          return;
       }
       this.e.setVisibility(0);
       return;
    }
    public abstract void t();
    public abstract void u(int p0);
    public abstract void v(int p0);
}
