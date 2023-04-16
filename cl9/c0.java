package cl9.c0;
import com.yxcorp.gifshow.widget.m;
import cl9.y;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.entity.QPhoto;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import com.yxcorp.gifshow.comment.utils.e;
import android.content.DialogInterface$OnDismissListener;
import yk9.d;
import k2b.e0;

public class c0 extends m	// class@00060d
{
    public final y c;

    public void c0(y p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c0.class, "1")) {
          return;
       }
       c0 tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, y.class, "13")) {
          y d = tc.D;
          if (d != null) {
             d.setPressed(true);
          }
          if (!tc.q.isAllowComment()) {
             i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f10078c));
          }else {
             y f = tc.F;
             f.D(f.k(), true, null, Integer.MAX_VALUE, tc.P8());
             d uod = tc.F.d();
             if (uod != null) {
                uod.B(tc.M);
             }
          }
       }
       return;
    }
}
