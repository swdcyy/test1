package e21.b;
import erd.g;
import com.kuaishou.live.audience.component.multiline.LiveAudienceMultiLinePresenterV2;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import t02.a0;
import p91.m;
import wkd.b;
import ad5.a;
import brd.t;
import io.reactivex.internal.functions.Functions;
import sfc.a;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import jk1.e;
import e21.a;
import f21.e;

public final class b implements g	// class@00208f
{
    public final LiveAudienceMultiLinePresenterV2 b;

    public void b(LiveAudienceMultiLinePresenterV2 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       LiveAudienceMultiLinePresenterV2 d1;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else {
          String str = null;
          LiveTimeConsumingUserStatusResponse mLiveGiftGui = (p0 != null)? p0.mLiveGiftGuideConfig: str;
          if (mLiveGiftGui == null) {
             b.Z(LiveLogTag.GIFT_GUIDE, "no mLiveGiftGuideConfig");
          }else {
             b.Z(LiveLogTag.GIFT_GUIDE, "[LiveAudienceGiftGuidePresenter][monitorUserStatus]userIoStatus return, show gift guide");
             b tb = this.b;
             Objects.requireNonNull(tb);
             LiveAudienceMultiLinePresenterV2 liveAudience = LiveAudienceMultiLinePresenterV2.class;
             if (!PatchProxy.applyVoidOneRefs(p0, tb, liveAudience, "8")) {
                String str1 = "livePlayCallerContext";
                if (!PatchProxy.applyVoid(str, tb, liveAudience, "9")) {
                   QCurrentUser qCurrentUser = QCurrentUser.me();
                   a.o(qCurrentUser, "QCurrentUser.me\(\)");
                   if (qCurrentUser.isLogined()) {
                      d1 = tb.O;
                      if (d1 == null) {
                         a.S(str1);
                      }
                      if (!d1.Z2.U()) {
                         b.a(0x4c90014d).l();
                         Object obj = b.a(0x4c90014d);
                         a.o(obj, "Singleton.get\(PaymentManager::class.java\)");
                         tb.X7(obj.a().subscribe(Functions.d(), new a()));
                      }
                   }
                }
                tb.V0 = p0.mLiveGiftGuideConfig;
                p0 = tb.O;
                if (p0 == null) {
                   a.S(str1);
                }
                p0 = p0.x1;
                a.o(p0, "livePlayCallerContext.mLiveAudienceGiftBoxService");
                tb.c1 = p0.Wf().subscribe(new a(tb), new a());
                p0 = tb.W0;
                if (p0 != null) {
                   d1 = tb.d1;
                   if (d1 != null) {
                      d1.b(p0);
                   }
                }
             }
          }
       }
    label_00bd :
       return;
    }
}
