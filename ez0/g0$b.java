package ez0.g0$b;
import erd.g;
import ez0.g0;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.giftstore.api.GiftPanelListResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.effect.resource.download.switc.LiveEffectDownloadSwitchInfo;
import com.kuaishou.live.effect.resource.download.switc.LiveEffectDownloadSwitchContainer;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import wz2.a$a;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import wz2.a;
import com.kuaishou.live.effect.resource.download.common.e;
import vz2.a;
import t02.a0;
import p91.m;
import mk1.d0;

public final class g0$b implements g	// class@002244
{
    public final g0 b;
    public final boolean c;

    public void g0$b(g0 p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g0$b.class, "1")) {
       }else {
          LiveEffectDownloadSwitchInfo matchedSwitc = LiveEffectDownloadSwitchContainer.getMatchedSwitchInfo();
          if (this.c == null) {
             QCurrentUser qCurrentUser = QCurrentUser.me();
             a.o(qCurrentUser, "QCurrentUser.me\(\)");
             if (qCurrentUser.isLogined() && matchedSwitc.enablePreDownloadOnUpdateGift != null) {
                a$a uoa = new a$a();
                uoa.e(4);
                uoa.c(1);
                uoa.d(3);
                uoa.h(1);
                uoa.f((matchedSwitc.enablePreDownloadOnUpdateGift ^ 1));
                uoa.j(RequestTiming.DEFAULT);
                a uoa1 = uoa.a();
                a.o(uoa1, "DownloadConfig.Builder\(\)¡­ULT\)\n            .build\(\)");
                a0 z2 = this.b.f.Z2;
                a.o(z2, "livePlayCallerContext.mLiveBasicContext");
                e.b().he().c(z2.getLiveStreamId(), false, uoa1);
             }
          }
          d0 uod0 = this.b.a();
          if (uod0 != null) {
             uod0.a(p0.mGiftToken, 1);
          }
       }
       return;
    }
}
