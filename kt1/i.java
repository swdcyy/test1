package kt1.i;
import erd.g;
import com.kuaishou.live.common.core.component.multipk.game.vc.anim.a;
import com.kuaishou.live.common.core.component.multipk.utils.LiveMultiPkResourceTypes;
import msd.a;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import com.kuaishou.live.common.core.component.multipk.game.vc.anim.LiveMultiPkGameWithBottomAreaAnimView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import java.util.Objects;
import lnc.a1;
import kt1.l;
import pu1.d;
import hc.b;
import ht1.a;

public final class i implements g	// class@002dfc
{
    public final a b;
    public final LiveMultiPkResourceTypes c;
    public final a d;

    public void i(a p0,LiveMultiPkResourceTypes p1,a p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
       }else {
          this.b.j.getBottomTextView().setBackground(p0);
          if (this.c != null) {
             this.b.j.getBottomLeftTopIconView().setVisibility(0);
             p0 = this.b;
             i tc = this.c;
             i td = this.d;
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoidTwoRefs(tc, td, p0, a.class, "8")) {
                p0.j.getBottomTextView().setPadding(a1.e(0x41f00000), p0.j.getBottomTextView().getPaddingTop(), p0.j.getBottomTextView().getPaddingRight(), p0.j.getBottomTextView().getPaddingBottom());
                p0.p.c(p0.j.getBottomLeftTopIconView(), tc, p0.l, new l(p0, td));
             }
          }else {
             this.b.V2(2, this.d);
          }
       }
       return;
    }
}
