package c2c.g$i;
import erd.g;
import c2c.g;
import java.io.File;
import java.lang.Object;
import java.lang.Number;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import jxb.a;
import e17.i;

public final class g$i implements g	// class@000507
{
    public final g b;
    public final File c;

    public void g$i(g p0,File p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       int i = p0.intValue();
       g$i oi = g$i.class;
       if (!PatchProxy.isSupport(oi) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), this, oi, "1")) {
          int i1 = 100;
          if (i == i1) {
             g t = this.b.t;
             if (t != null) {
                t.Fh(i, i1, true);
             }
             i = this.b.t;
             if (i != null) {
                i.dismiss();
             }
             a.d(this.b.getContext(), this.c);
             i.a(R.style.arg_RES_7f11066a, 0x7f10163c);
          }else {
             g t1 = this.b.t;
             if (t1 != null) {
                t1.Nh(i);
             }
          }
       }
       return;
    }
}
