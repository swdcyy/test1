package h92.p;
import erd.g;
import h92.s;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;
import t02.a0;
import p91.m;
import wkd.b;
import ad5.a;
import brd.t;
import io.reactivex.internal.functions.Functions;
import sfc.a;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Iterator;
import java.util.HashSet;
import h92.c;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.b;
import m91.b;
import jk1.e;
import h92.n;

public final class p implements g	// class@002d20
{
    public final s b;

    public void p(s p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       p tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 == null || p0.mLiveGiftGuideConfig == null) {
          b.Z(LiveLogTag.GIFT_GUIDE, "no mLiveGiftGuideConfig");
       }else {
          b.Z(LiveLogTag.GIFT_GUIDE, "[LiveAudienceGiftGuidePresenter][monitorUserStatus]userIoStatus return, show gift guide");
          s os = s.class;
          if (!PatchProxy.applyVoidOneRefs(p0, tb, os, "8")) {
             if (!PatchProxy.applyVoid(null, tb, os, "11") && (QCurrentUser.me().isLogined() && !tb.K.Z2.U())) {
                b.a(0x4c90014d).l();
                tb.X7(b.a(0x4c90014d).a().subscribe(Functions.d(), new a()));
             }
          label_0066 :
             tb.S = p0.mLiveGiftGuideConfig;
             p0 = tb.W.iterator();
             while (p0.hasNext()) {
                p0.next().c();
             }
             tb.c9();
             a[] uoaArray = new a[]{AudienceBizRelation.RECHARGE_ACTIVITY};
             tb.K.Y0.u5(tb.Z0, uoaArray);
             tb.U = tb.K.x1.Wf().subscribe(new n(tb), new a());
          }
       }
       return;
    }
}
