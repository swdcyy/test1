package h92.i0$b;
import h92.c;
import h92.i0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.KwaiDialogFragment;
import z12.x;
import java.lang.Runnable;
import ekd.k1;
import hg2.e;
import crd.b;
import lnc.b9;
import ok.x;
import com.yxcorp.gifshow.models.Gift;
import lm1.i;
import java.util.Objects;
import i92.l$a;
import i92.l;
import com.kuaishou.live.common.core.component.gift.domain.giftguide.view.LiveGuideGiftAnimationView$b;
import h92.c0;
import android.view.View$OnClickListener;
import java.lang.Boolean;
import h92.b;

public class i0$b implements c	// class@002d0e
{
    public final i0 a;

    public void i0$b(i0 p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, i0$b.class, "4")) {
          return;
       }
       x.E(this.a.L);
       k1.m(this.a.Q);
       this.a.P8();
       this.a.u.ma();
       b9.a(this.a.I);
       return;
    }
    public void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, i0$b.class, "3")) {
          return;
       }
       if (this.a.X8()) {
          i0$b ta = this.a;
          this.a.Y8(ta.S8(ta.s.get(), 6, 1), "PRE_SEND_GIFT", "CLIENT_BOTTOM_BAR_GIFT_GUIDE_SHOW", "[LiveAudienceNormalGiftGuidePresenter][onGiftGuideViewShow]gift icon show", 1);
          ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(objArray, ta, i0.class, "16")) {
             ta.w.a().i(ta.P);
             ta.w.a().h(new c0(ta));
          }
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, i0$b.class, "2")) {
          return;
       }
       this.a.R8();
       return;
    }
    public void d(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, i0$b.class, "1")) {
          return;
       }
       if (this.a.X8()) {
          i0$b ta = this.a;
          this.a.Y8(ta.S8(ta.s.get(), 6, 1), "PRE_SEND_GIFT", "CLIENT_BOTTOM_BAR_GIFT_GUIDE_CLICK", "[LiveAudienceNormalGiftGuidePresenter][onGiftGuideViewClick]gift icon click", 1);
          ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(objArray, ta, i0.class, "6") && (!PatchProxy.isSupport(i0.class) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, ta, i0.class, "7"))) {
             ta.W8(1, 38);
          }
       }
       return;
    }
    public void e(){
       b.c(this);
    }
}
