package ew1.a$a;
import com.kuaishou.live.common.core.basic.widget.LiveViewFlipper$a;
import ew1.a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import yq5.b;
import android.widget.ViewFlipper;
import ekd.q;

public class a$a implements LiveViewFlipper$a	// class@002203
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void a(View p0,int p1){
       if (PatchProxy.isSupport(a$a.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, a$a.class, "2")) {
          return;
       }
       b uob = this.b.c.get(p1);
       if (uob != null) {
          uob.onShow();
       }
       return;
    }
    public void b(View p0,int p1){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       a$a tb = this.b;
       b uob = q.d(tb.c, tb.b.getDisplayedChild());
       b uob1 = this.b.c.get(p1);
       if (uob1 != null) {
          uob1 = (int)uob1.c1();
          a b = this.b.b;
          if (uob1 <= 0) {
             uob1 = 3000;
          }
          b.setFlipInterval(uob1);
       }
       if (uob != null) {
          uob.D();
       }
       return;
    }
}
