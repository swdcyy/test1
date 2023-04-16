package nz0.f$b;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftBoxPopupView$d;
import nz0.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.List;
import jk1.c;
import jk1.d;
import java.util.Objects;
import mk1.h;
import xk1.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import ik1.a0;
import java.lang.Integer;
import lp3.i;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import om1.a;
import com.kuaishou.live.common.core.component.trace.gift.bean.LiveSendGiftTraceInfo;
import mk1.b;
import mm1.c;
import mm1.e;
import mm1.g;
import km1.b;
import com.kuaishou.android.live.log.b;
import wk1.b;
import vk1.a;
import mk1.a;
import mk1.c;
import com.yxcorp.gifshow.models.Gift;
import cl1.c;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import mk1.c$a;
import java.lang.Enum;
import mk1.d;
import mk1.e;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import gy2.f;
import gy2.c;
import gy2.a;

public class f$b implements LiveGiftBoxPopupView$d	// class@003438
{
    public final f a;

    public void f$b(f p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, f$b.class, "2")) {
          return;
       }
       f$b ta = this.a;
       if (ta.r != null) {
          Iterator iterator = ta.F.iterator();
          while (iterator.hasNext()) {
             iterator.next().f(this.a.r);
          }
       }
       return;
    }
    public void b(){
       c uoc;
       f uof = f.class;
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, this, f$b.class, str)) {
          return;
       }
       f$b ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, uof, "7")) {
          ta.w.p.m();
          ta.w.p.e();
       }
       Iterator iterator = this.a.F.iterator();
       while (iterator.hasNext()) {
          iterator.next().c(this.a.r);
       }
       if (this.a.getActivity() instanceof GifshowActivity) {
          a0.r(this.a.getActivity());
       }else {
          a0.r(objArray);
       }
       ta = this.a;
       f a = ta.A;
       Objects.requireNonNull(ta);
       if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidFourRefs(a, "CLIENT_GIFT_BOX_COLLAPSE", "[LiveAudienceGiftBoxClosePresenter][onDismissEnd]gift box dismiss", Integer.valueOf(1), ta, f.class, "9")) {
          if (!ta.y.b()) {
             ta.z.yk(ta.z.o6().D(a)).d("CLIENT_GIFT_BOX_COLLAPSE").f("PRE_SEND_GIFT").g(1).e("[LiveAudienceGiftBoxClosePresenter][onDismissEnd]gift box dismiss").a();
          }else {
             b.P(b.a, "[LiveAudienceGiftBoxClosePresenter][logTraceInfo]service manager cleared");
          }
       }
       if (!this.a.w.A.c()) {
          this.a.w.z.b();
       }
       f$b ta1 = this.a;
       a a1 = ta1.u.a;
       uof = ta1.w;
       Objects.requireNonNull(a1);
       if (!PatchProxy.applyVoidOneRefs(uof, a1, c.class, str)) {
          h e = uof.e;
          h k = uof.K;
          Gift mId = (k != null)? k.mId: -1;
          int i = uof.t.g();
          GiftTab giftTab = e.d();
          int i1 = c$a.a[giftTab.ordinal()];
          if (i1 != 1) {
             if (i1 != 2) {
                if (i1 != 3) {
                   a1.e.b(mId, i);
                }else {
                   a1.h.b(mId, i);
                }
             }else {
                a1.g.b(mId, i);
             }
          }else {
             a1.f.b(mId, i);
          }
          if (giftTab != GiftTab.PropsPanel) {
             uoc = a1.d;
             uoc.a = giftTab;
             uoc.b = mId;
          }
          if (!a.t().u("SOURCE_LIVE").d("enableSaveAndRecoverLastGiftWithAudience", false) && !e.l()) {
             a1.e.a();
             a1.f.a();
             a1.g.a();
             a1.h.a();
             uoc = a1.d;
             Objects.requireNonNull(uoc);
             uoc.a = GiftTab.NormalGift;
             uoc.b = -1;
          }
          b.c0(LiveLogTag.GIFT, "GiftBoxViewRecoveryData.save", "value", a1.toString());
       }
       ta1 = this.a;
       ta1.C = false;
       ClientContent$LiveStreamPackage liveStreamPa = ta1.v.Z2.a();
       if (!PatchProxy.applyVoidOneRefs(liveStreamPa, objArray, a0.class, "14")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.type = 18;
          uElementPack.name = "collapse_gift_dialog";
          uElementPack.action = 998;
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          u1.u(1, uElementPack, uContentPack);
       }
       uoc = f.e.a(this.a.getActivity());
       if (uoc != null) {
          h m = this.a.w.m;
          if (m != null) {
             uoc.a(m);
          }
       }
       return;
    }
}
