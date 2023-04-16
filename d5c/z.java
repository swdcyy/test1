package d5c.z;
import android.view.View$OnClickListener;
import d5c.g0;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.widget.NestedScrollViewPager;
import android.widget.ImageView;
import com.kwai.library.widget.popup.common.c;
import qrd.l1;
import z5c.u;
import androidx.recyclerview.widget.RecyclerView;
import com.kwai.framework.model.user.User;
import z5c.y1;
import k2b.h;
import lnc.i3;
import k2b.e0;
import android.animation.Animator;

public final class z implements View$OnClickListener	// class@00211b
{
    public final g0 b;

    public void z(g0 p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       z tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, g0.class, "36")) {
       }else {
          tb.B.k();
          if (tb.k9()) {
             g0 y0 = tb.Y0;
             if (y0 != null && (y0.getVisibility() != 8 && tb.y != null)) {
                u.c(tb.Z0);
                tb.y.scrollToPosition(0);
                y0 = tb.s;
                String id = tb.p.getId();
                if (!PatchProxy.applyVoidTwoRefs(y0, id, objArray, y1.class, "140")) {
                   h oh = h.k("BACK_TO_TOP_ITEM");
                   i3 oi3 = i3.f();
                   oi3.d("visited_uid", id);
                   oh.n(oi3.e());
                   oh.i(y0);
                }
                if (tb.e1 != null) {
                   tb.e1 = false;
                   tb.R8().start();
                }
             }
          }
       }
       return;
    }
}
