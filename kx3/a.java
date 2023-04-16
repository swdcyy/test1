package kx3.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import io4.d;
import io4.e;
import java.lang.Integer;
import java.lang.Number;
import qt3.j;
import android.content.Context;
import com.yxcorp.utility.n;
import android.view.ViewOutlineProvider;
import android.view.View;
import ekd.m1;

public abstract class a extends PresenterV2	// class@0031d7
{
    public e p;
    public View q;

    public void a(){
       super();
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "2")) {
          return;
       }
       a tp = this.p;
       if (tp != null) {
          d uod = tp.d();
          if (uod != null) {
             Integer integer = Integer.valueOf(uod.a());
             j oj = (integer.intValue() > 0)? 1: null;
             if (oj) {
                objArray = integer;
             }
             if (objArray != null) {
                int i = objArray.intValue();
                a tq = this.q;
                if (tq != null) {
                   tq.setOutlineProvider(new j(n.c(this.getContext(), (float)i)));
                }
                tp = this.q;
                if (tp != null) {
                   tp.setClipToOutline(true);
                }
             }
          }
       }
       return;
    }
    public abstract int P8();
    public final e R8(){
       return this.p;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       this.q = m1.f(p0, this.P8());
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.t8("MERCHANT_HOME_FEED_STYLE");
       return;
    }
}
