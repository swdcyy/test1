package m01.c;
import com.yxcorp.gifshow.widget.m;
import m01.b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import mk1.b;
import java.util.Objects;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem;
import ql1.d$b;
import mk1.h;
import wk1.b;
import android.widget.LinearLayout;
import xk1.a;
import hl1.a;
import com.yxcorp.gifshow.models.Gift;
import bl1.a;
import m01.n;
import cl1.c;
import com.kuaishou.live.common.core.component.gift.DrawingGiftEditView;
import brd.y;

public class c extends m	// class@00309c
{
    public final b c;

    public void c(b p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       b w;
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       c tc = this.c;
       GiftTab normalGift = GiftTab.NormalGift;
       tc.S8(tc.s, normalGift, "CLIENT_GIFT_BOX_TAB_CLICK", "[LiveAudienceGiftBoxTabChangePresenter][initGiftTabInfos]click normal gift tab", 1);
       tc = this.c;
       Objects.requireNonNull(tc);
       b uob = b.class;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tc, uob, "7")) {
          int i = 0;
          if (tc.X8()) {
             tc.V8();
             tc.s.m(normalGift);
             w = tc.w;
             if (w != null) {
                w.g(normalGift, objArray, i, objArray);
             }
          }else {
             w = tc.w;
             if (w != null) {
                w.g(normalGift, objArray, i, objArray);
             }
             tc.V8();
             tc.s.m(normalGift);
          }
          tc.W8(normalGift);
          tc.q.A.d("[LiveAudienceGiftBoxTabChangePresenter][changeToNormalGift]");
          tc.C.setVisibility(i);
          tc.Y8(normalGift);
          if (tc.s.l()) {
             tc.r.a(true);
          }else {
             tc.r.a(i);
          }
          tc.y.d();
          w = tc.q;
          w.K = w.o.M2();
          tc.q.o.D2();
          tc.Z8();
          tc.q.t.c(tc.R8(normalGift).a());
          if (!PatchProxy.applyVoid(objArray, tc, uob, "17") && tc.r.f().isEnabled()) {
             h k = tc.q.K;
             if (k != null && k.mDrawable != null) {
                tc.r.k(k);
                tc.r.j(true);
                b d = tc.D;
                if (!(tc.r.n() ^ true)) {
                   i = 8;
                }
                d.setVisibility(i);
             }
          }
          tc.A.onNext(normalGift);
       }
       return;
    }
}
