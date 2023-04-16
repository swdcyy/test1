package n7a.f$a;
import yg5.t0;
import n7a.f;
import java.lang.Object;
import yg5.s0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import java.lang.String;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d6a.u;
import ekd.e0;
import android.content.Context;
import com.yxcorp.utility.n;
import n7a.a;
import o7a.d;
import yg5.r0;

public class f$a implements t0	// class@0030f6
{
    public final f b;

    public void f$a(f p0){
       this.b = p0;
       super();
    }
    public void s(boolean p0){
       s0.a(this, p0);
    }
    public void wd(int p0,int p1,int p2,float p3,int p4){
       a u;
       int i = 1;
       if (PatchProxy.isSupport(f$a.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Float.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, f$a.class, "1")) {
             return;
          }
       }
       p0 = this.b.m8().getHeight();
       if (!u.a()) {
          p0 = p0 + n.A(e0.b);
       }
       p0 = ((float)(p0 - p2) / (float)p1) - null;
       if (p0 > 0) {
          this.b.R8();
       }
       f$a tb = this.b;
       boolean b = (p0)? true: false;
       tb.C = b;
       u = tb.u;
       if (u != null) {
          if (b || (!tb.S8(tb.D) || this.b.X8())) {
             i = false;
          }
          u.setEnabled(i);
       }
       return;
    }
    public void xe(boolean p0,r0 p1){
       s0.b(this, p0, p1);
    }
}
