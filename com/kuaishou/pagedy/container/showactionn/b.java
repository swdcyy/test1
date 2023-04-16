package com.kuaishou.pagedy.container.showactionn.b;
import lo4.d;
import java.lang.Object;
import lo4.j;
import com.kuaishou.pagedy.container.showactionn.b$a;
import lo4.c;
import java.lang.String;
import android.view.ViewGroup;
import com.kuaishou.bowl.core.component.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lo4.k;
import su.g;
import java.util.Map;
import tu.d;
import lo4.i;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$r;
import lo4.n;
import lo4.l;
import lo4.m;
import lo4.a;
import com.kwai.robust.PatchProxyResult;
import msd.l;
import msd.a;
import lo4.a$a;

public class b implements d	// class@000a64
{
    public ViewGroup a;
    public a b;
    public int c;
    public final j d;
    public final k e;

    public void b(){
       super();
       this.c = 0;
       this.d = new j();
       this.e = new b$a(this);
    }
    public void a(){
       c.a(this);
    }
    public String b(){
       return "suspending";
    }
    public void c(ViewGroup p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "1")) {
          return;
       }
       this.d.h();
       this.e.release();
       this.d.n(this.e);
       this.a = p0;
       d uod = g.a(p1.pageHashCode).p.get("KEY_RELATED_SHOW_SUSPENDING_CALLBACK");
       if (uod == null || (uod.e() != null && uod.e() instanceof ViewGroup)) {
          if (!p0 instanceof i) {
             return;
          }else {
             this.d.k(uod.e());
             this.d.j(p1);
             i oi = p0;
             this.d.o(oi);
             this.d.i(this.e.b());
             oi.e(this.d);
             oi.n(this.d);
             n on = new n(this);
             l ol = new l(this);
             m om = new m(this);
             a uoa = a.class;
             if (PatchProxy.isSupport(uoa)) {
                Object[] objArray = new Object[]{oi,p1,on,ol,om};
                uoa = PatchProxy.apply(objArray, null, uoa, "5");
                if (uoa != PatchProxyResult.class) {
                label_00b1 :
                   this.b = uoa;
                }
             }
             uoa = a.g.a(oi, p1, on, ol, om);
             goto label_00b1 ;
          }
       }
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       b tb = this.b;
       if (tb != null) {
          tb.d();
       }
       this.c = 0;
       this.d.h();
       tb = this.a;
       if (tb != null) {
          if (tb instanceof i) {
             tb.e(this.d);
          }
          this.a = null;
       }
       return;
    }
}
