package com.kuaishou.live.lite.adapter.component.gift.giftguide.LiveLiteGiftGuideManager;
import com.kuaishou.live.common.core.component.gift.base.LifecycleManager;
import com.kuaishou.live.lite.adapter.component.gift.giftguide.LiveLiteGiftGuideManager$a;
import nsd.u;
import androidx.lifecycle.LifecycleOwner;
import hf3.a;
import td3.o;
import or5.d;
import com.kuaishou.live.lite.sidebar.e;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService;
import z1.k;
import ug1.u0;
import com.kuaishou.live.common.core.component.gift.domain.giftsend.LiveGiftSendModel;
import ih1.l;
import om1.e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import x73.a;
import w73.o;
import w73.q;
import s73.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lj1.c;
import l73.i;
import com.kwai.framework.model.user.UserInfo;
import java.util.ArrayList;
import java.util.List;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import com.kuaishou.live.lite.adapter.component.gift.giftguide.LiveLiteGiftGuideManager$giftGuideEntryCallback$1;
import msd.a;
import com.kuaishou.live.lite.adapter.component.gift.giftguide.entry.a;
import com.kuaishou.live.lite.adapter.component.gift.giftguide.entry.LiveLiteGiftGuideType;
import com.kuaishou.live.lite.adapter.component.gift.giftguide.LiveLiteGiftGuideManager$b;
import t73.b;
import com.kuaishou.live.lite.adapter.component.gift.giftguide.entry.a$a;
import com.kuaishou.live.lite.adapter.component.gift.giftguide.LiveLiteGiftGuideManager$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import com.kuaishou.live.lite.adapter.component.gift.giftguide.LiveLiteGiftGuideManager$2;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import pp.c;
import java.lang.Boolean;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.lite.adapter.component.gift.giftguide.LiveLiteGiftGuideManager$task$1;
import ec3.f;
import w73.s;
import java.util.Objects;
import lf3.g;

public final class LiveLiteGiftGuideManager extends LifecycleManager	// class@001dd8
{
    public final a c;
    public final o d;
    public final q e;
    public final b f;
    public final a g;
    public final d h;
    public final k i;
    public final k j;
    public final LiveGiftSendModel k;
    public final e l;
    public final k m;
    public final boolean n;
    public static final LiveLiteGiftGuideManager$a o;

    static {
       LiveLiteGiftGuideManager.o = new LiveLiteGiftGuideManager$a(null);
    }
    public void LiveLiteGiftGuideManager(LifecycleOwner p0,a p1,o p2,d p3,e p4,LiveLiteBottomBarService p5,k p6,u0 p7,k p8,k p9,k p10,LiveGiftSendModel p11,l p12,e p13,k p14,boolean p15){
       d uod = this;
       LiveLiteGiftGuideManager$task$1 obj = p0;
       a obj1 = p1;
       ArrayList obj2 = p2;
       Object obj3 = p3;
       Object obj4 = p4;
       Object obj5 = p5;
       o obj6 = p6;
       c obj7 = p8;
       Object obj8 = p11;
       LiveLiteGiftGuideType obj9 = p12;
       o obj10 = p13;
       Object obj11 = p14;
       boolean b = p15;
       a.p(obj, "lifecycleOwner");
       a.p(obj1, "longConnection");
       a.p(obj2, "userStatusManager");
       a.p(obj3, "audienceInfoManager");
       a.p(obj4, "liteSideBarService");
       a.p(obj5, "liteBottomBarService");
       a.p(obj6, "guideMessageService");
       a.p(obj7, "anchorInfo");
       a.p(p9, "liveStreamPackage");
       a.p(p10, "feedLogCtxSupplier");
       a.p(obj8, "giftSendModel");
       a.p(obj9, "giftStoreRepository");
       a.p(obj10, "sendGiftTracer");
       a.p(obj11, "bizLogParams");
       super(p0);
       uod.h = obj3;
       uod.i = obj6;
       uod.j = obj7;
       uod.k = obj8;
       uod.l = obj10;
       uod.m = obj11;
       uod.n = b;
       a uoa = new a(b);
       uod.c = uoa;
       obj6 = new o(obj2, uoa, obj9);
       uod.d = obj6;
       uod.e = new q(obj1);
       obj1 = PatchProxy.apply(null, uod, LiveLiteGiftGuideManager.class, "1");
       if (obj1 != PatchProxyResult.class) {
          obj7 = obj1;
       }else {
          Object obj12 = obj7.get();
          a.m(obj12);
          obj2 = new ArrayList();
          obj2.add(obj12);
          obj7 = new c(obj12, obj2);
       }
       obj10 = obj6;
       obj1 = new a(p3, p11, obj7, p13.o6(), new LiveLiteGiftGuideManager$giftGuideEntryCallback$1(uod));
       uod.f = obj9;
       obj1 = obj8;
       obj9 = LiveLiteGiftGuideType.GiftGuide;
       a uoa1 = obj8;
       obj1 = new a(p4, obj9, p9, p10, p14, obj9, new LiveLiteGiftGuideManager$b(obj4, obj5));
       uod.g = uoa1;
       uoa.b(obj, new LiveLiteGiftGuideManager$1(uod));
       obj10.b(obj, new LiveLiteGiftGuideManager$2(uod));
       obj10.e(obj9);
       b.T(LiveGiftTag.LIVE_GIFT_GUIDE.appendTag("LiveGiftGuideManager"), "LiveGiftGuideManager onCreate", "isInitialSwitchOpened", Boolean.valueOf(p15), "LiveGiftGuideData", obj10.a());
       obj = new LiveLiteGiftGuideManager$task$1(uod);
       if (f.h()) {
          u0 ou0 = p7;
          if (ou0) {
             ou0.W1("LiveGiftGuideManager::handleGuideNotice", obj);
          label_0142 :
             return;
          }
       }
       obj.invoke();
       goto label_0142 ;
    }
    public final k b(){
       return this.i;
    }
    public final void c(Boolean p0,s p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteGiftGuideManager.class, "5")) {
          return;
       }
       if (a.g(p0, Boolean.FALSE)) {
          this.g.e();
          return;
       }else {
          this.g.b(p1);
          return;
       }
    }
    public void onDestroy(LifecycleOwner p0){
       String str = "4";
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteGiftGuideManager.class, str)) {
          return;
       }
       a.p(p0, "owner");
       super.onDestroy(p0);
       this.d.f();
       LiveLiteGiftGuideManager te = this.e;
       Objects.requireNonNull(te);
       if (!PatchProxy.applyVoid(null, te, q.class, str)) {
          te.j.o(1050, te);
       }
       this.g.c();
       return;
    }
}
