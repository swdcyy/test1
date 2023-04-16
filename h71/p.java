package h71.p;
import yc1.d;
import com.kuaishou.live.bridge.commands.LiveJsCmdSendGiftToAnchorV2;
import asd.c;
import com.yxcorp.gifshow.models.Gift;
import com.kuaishou.live.bridge.commands.LiveJsCmdSendGiftToAnchorV2$a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.kuaishou.live.jsbridge.LiveJsBridgeLogTag;
import java.lang.StringBuilder;
import java.lang.Integer;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.yxcorp.retrofit.model.KwaiException;
import kotlin.Result;
import o63.m;
import o63.m$a;
import com.yxcorp.gifshow.model.response.LiveSendNoPanelGiftResponse;
import com.kuaishou.live.bridge.commands.LiveJsCmdSendGiftToAnchorV2$b;
import java.util.Objects;
import lp3.e;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import jk1.f;
import lp3.c;
import java.util.List;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem;
import rm1.f;
import com.kuaishou.android.live.log.LiveLogTag;

public final class p implements d	// class@002642
{
    public final LiveJsCmdSendGiftToAnchorV2 a;
    public final c b;
    public final Gift c;
    public final LiveJsCmdSendGiftToAnchorV2$a d;

    public void p(LiveJsCmdSendGiftToAnchorV2 p0,c p1,Gift p2,LiveJsCmdSendGiftToAnchorV2$a p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public boolean onError(Throwable p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, p.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "error");
       b.Z(LiveJsBridgeLogTag.COMMON, "sendGiftToAnchorV2 "+this.d.b()+' '+"error "+p0);
       if (p0 instanceof KwaiException) {
          this.b.resumeWith(Result.constructor-impl(m.g.a(p0.mErrorCode, p0.mErrorMessage)));
       }else {
          this.b.resumeWith(Result.constructor-impl(m$a.e(m.g, null, 1, null)));
       }
       return false;
    }
    public void onSuccess(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "1")) {
       }else {
          this.b.resumeWith(Result.constructor-impl(m$a.g(m.g, new LiveJsCmdSendGiftToAnchorV2$b(p0), false, 2, null)));
          p0 = this.a;
          p tc = this.c;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidOneRefs(tc, p0, LiveJsCmdSendGiftToAnchorV2.class, "6")) {
             p0 = p0.h().a(f.class);
             a.o(p0, "serviceManager.getServic¡­ftBoxService::class.java\)");
             GiftPanelItem giftPanelIte = f.b(tc, p0.O3());
             if (giftPanelIte != null && giftPanelIte.isCustomGift()) {
                b.j0(LiveLogTag.CUSTOM_GIFT, "KRN custom gift handleSendSuccess hideGiftBox");
                p0.B1();
             }else {
                b.j0(LiveLogTag.CUSTOM_GIFT, "KRN custom gift handleSendSuccess missed");
             }
          }
       }
       return;
    }
}
