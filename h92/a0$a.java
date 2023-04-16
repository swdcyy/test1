package h92.a0$a;
import h92.c;
import h92.a0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import zo1.a;
import h92.b;
import java.util.Objects;
import ok.x;
import com.kuaishou.live.core.basic.model.LiveGiftGuideConfig;
import com.yxcorp.gifshow.models.Gift;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public class a0$a implements c	// class@002cfc
{
    public final a0 a;

    public void a0$a(a0 p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, a0$a.class, "3")) {
          return;
       }
       this.a.p.N2.qi();
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, a0$a.class, "1")) {
          return;
       }
       if (this.a.P8()) {
          this.a.R8("CLIENT_BOTTOM_BAR_GIFT_GUIDE_SHOW", "[LiveAudienceMagicBoxGiftGuidePresenter][onGiftGuideViewShow]gift icon show", 1);
       }
       return;
    }
    public void c(){
       b.b(this);
    }
    public void d(){
       Gift gift;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a0$a.class, "2")) {
          return;
       }
       if (this.a.P8()) {
          this.a.R8("CLIENT_BOTTOM_BAR_GIFT_CONFIRM_CLICK", "[LiveAudienceMagicBoxGiftGuidePresenter][onGiftGuideViewClick]gift icon click", 1);
          a0$a ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(objArray, ta, a0.class, "4")) {
             gift = ta.t.get();
             if (ta.s.get() != null && gift != null) {
                b.Z(LiveLogTag.GIFT_GUIDE, "showMagicBoxIntroductionDialog for magicBoxGiftGuideClick");
                ta.p.N2.Eb(gift.mId, null, false, "OUTMOST", "");
             }
          }
       }
       return;
    }
    public void e(){
       b.c(this);
    }
}
