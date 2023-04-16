package l7a.a$b;
import yg5.t0;
import l7a.a;
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
import com.yxcorp.gifshow.detail.slideplay.presenter.recreation.helper.RecreationHotAreaHelper;
import yg5.r0;

public class a$b implements t0	// class@002d5c
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public void s(boolean p0){
       s0.a(this, p0);
    }
    public void wd(int p0,int p1,int p2,float p3,int p4){
       int i = 1;
       if (PatchProxy.isSupport(a$b.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Float.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, a$b.class, "1")) {
             return;
          }
       }
       p0 = this.b.m8().getHeight();
       if (!u.a()) {
          p0 = p0 + n.A(e0.b);
       }
       float f = (float)(p0 - p2) / (float)p1;
       a s = this.b.s;
       a uoa = null;
       if (s != null && f - uoa > 0) {
          s.b();
       }
       a$b tb = this.b;
       boolean b = (f - uoa)? true: false;
       tb.B = b;
       uoa = tb.s;
       if (uoa != null) {
          if (b || tb.P8()) {
             i = false;
          }
          uoa.i(i);
       }
       return;
    }
    public void xe(boolean p0,r0 p1){
       s0.b(this, p0, p1);
    }
}
