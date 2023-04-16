package com.kuaishou.live.lite.adapter.component.gift.giftguide.vice.LiveLiteViceGiftGuideManager;
import com.kuaishou.live.common.core.component.gift.base.LifecycleManager;
import com.kuaishou.live.lite.adapter.component.gift.giftguide.vice.LiveLiteViceGiftGuideManager$a;
import nsd.u;
import androidx.lifecycle.LifecycleOwner;
import td3.o;
import or5.d;
import com.kuaishou.live.lite.sidebar.e;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService;
import z1.k;
import com.kuaishou.live.common.core.component.gift.domain.giftsend.LiveGiftSendModel;
import ih1.l;
import om1.e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import x73.a;
import w73.o;
import com.kuaishou.live.lite.adapter.component.gift.giftguide.vice.LiveLiteViceGiftGuideManager$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import com.kuaishou.live.lite.adapter.component.gift.giftguide.vice.LiveLiteViceGiftGuideManager$2;
import com.kuaishou.live.lite.adapter.component.gift.giftguide.entry.LiveLiteGiftGuideType;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import java.util.List;
import pp.c;
import java.lang.Boolean;
import com.kuaishou.android.live.log.b;
import w73.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import w73.s$b;
import com.kuaishou.live.lite.adapter.component.gift.giftguide.entry.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import w73.a;
import java.lang.Integer;
import v91.b;
import y73.b;
import com.kuaishou.live.lite.adapter.component.gift.giftguide.vice.LiveLiteViceGiftGuideManager$getFrequencyConsumerByReplacePlan$1;
import msd.a;
import v91.e;
import y73.c;
import y73.a;
import lj1.c;
import com.kwai.framework.model.user.UserInfo;
import java.util.ArrayList;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import y73.a$b;
import com.kuaishou.live.lite.adapter.component.gift.giftguide.vice.LiveLiteViceGiftGuideManager$b;
import t73.b;
import com.kuaishou.live.lite.adapter.component.gift.giftguide.entry.a$a;

public final class LiveLiteViceGiftGuideManager extends LifecycleManager	// class@001de8
{
    public final a c;
    public final o d;
    public a e;
    public final d f;
    public final e g;
    public final LiveLiteBottomBarService h;
    public final k i;
    public final k j;
    public final k k;
    public final LiveGiftSendModel l;
    public final e m;
    public final k n;
    public static final LiveLiteViceGiftGuideManager$a o;

    static {
       LiveLiteViceGiftGuideManager.o = new LiveLiteViceGiftGuideManager$a(null);
    }
    public void LiveLiteViceGiftGuideManager(LifecycleOwner p0,o p1,d p2,e p3,LiveLiteBottomBarService p4,k p5,k p6,k p7,LiveGiftSendModel p8,l p9,e p10,k p11,boolean p12){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "userStatusManager");
       a.p(p2, "audienceInfoManager");
       a.p(p3, "liteSideBarService");
       a.p(p4, "liteBottomBarService");
       a.p(p5, "anchorInfo");
       a.p(p6, "liveStreamPackage");
       a.p(p7, "feedLogCtxSupplier");
       a.p(p8, "giftSendModel");
       a.p(p9, "giftStoreRepository");
       a.p(p10, "sendGiftTracer");
       a.p(p11, "bizLogParams");
       super(p0);
       this.f = p2;
       this.g = p3;
       this.h = p4;
       this.i = p5;
       this.j = p6;
       this.k = p7;
       this.l = p8;
       this.m = p10;
       this.n = p11;
       a uoa = new a(p12);
       this.c = uoa;
       o oo = new o(p1, uoa, p9);
       this.d = oo;
       uoa.b(p0, new LiveLiteViceGiftGuideManager$1(this));
       oo.b(p0, new LiveLiteViceGiftGuideManager$2(this));
       oo.e(LiveLiteGiftGuideType.ViceGiftGuide);
       LiveGiftTag lIVE_VICE_GI = LiveGiftTag.LIVE_VICE_GIFT_GUIDE;
       lIVE_VICE_GI.appendTag("LiveViceGiftGuideManager");
       b.T(lIVE_VICE_GI, "LiveGiftGuideManager onCreate", "isInitialSwitchOpened", Boolean.valueOf(p12), "LiveGiftGuideData", oo.a());
    }
    public final void b(s p0,Boolean p1){
       boolean b;
       int i;
       c uoc1;
       Object obj = this;
       LiveLiteViceGiftGuideManager obj1 = p0;
       PatchProxyResult obj2 = p1;
       LiveLiteViceGiftGuideManager liveLiteVice = LiveLiteViceGiftGuideManager.class;
       if (PatchProxy.applyVoidTwoRefs(obj1, obj2, obj, liveLiteVice, "1")) {
          return;
       }
       if (!(v4 = obj1 instanceof s$b)) {
          b.Z(LiveGiftTag.LIVE_VICE_GIFT_GUIDE, "getGiftGuideHandler -> data load failed");
          return;
       }else {
          a uoa = null;
          if (a.g(obj2, Boolean.TRUE) ^ 0x01) {
             obj1 = obj.e;
             if (obj1 != null) {
                obj1.e();
             }
             obj.e = uoa;
          }else {
             obj2 = PatchProxyResult.class;
             LiveLiteViceGiftGuideManager obj3 = PatchProxy.applyOneRefs(obj1, obj, liveLiteVice, "5");
             if (obj3 != obj2) {
                uoa = obj3;
             }else {
                obj3 = obj.e;
                if (obj3 != null) {
                   uoa = obj3;
                }else {
                   b obj4 = PatchProxy.applyOneRefs(obj1, obj, liveLiteVice, "7");
                   b = 4;
                   if (obj4 != obj2) {
                      i = obj4.intValue();
                   }else if(v4){
                      i = obj1.a().c;
                      if (i != 3 && i != b) {
                      }
                   }else {
                   }
                label_006b :
                   if (i == null) {
                      b.Z(LiveGiftTag.LIVE_VICE_GIFT_GUIDE, "getGiftGuideHandler -> not support replace");
                   }else if(PatchProxy.isSupport(liveLiteVice)){
                      obj4 = PatchProxy.applyOneRefs(Integer.valueOf(i), obj, liveLiteVice, "6");
                      if (obj4 != obj2) {
                      }else if(i == b){
                         obj4 = new b(new LiveLiteViceGiftGuideManager$getFrequencyConsumerByReplacePlan$1(obj));
                      }else {
                         e uoe = new e();
                      }
                   }else {
                      goto label_008b ;
                   }
                   if (!obj4.b()) {
                      b.Z(LiveGiftTag.LIVE_VICE_GIFT_GUIDE, "getGiftGuideHandler -> frequency blocked");
                   }else {
                      c uoc = new c(obj);
                      LiveLiteViceGiftGuideManager f = obj.f;
                      LiveLiteViceGiftGuideManager l = obj.l;
                      ArrayList obj5 = PatchProxy.apply(uoa, obj, liveLiteVice, "3");
                      if (obj5 != obj2) {
                         uoc1 = obj5;
                      }else {
                         Object obj6 = obj.i.get();
                         a.m(obj6);
                         obj5 = new ArrayList();
                         obj5.add(obj6);
                         uoc1 = new c(obj6, obj5);
                      }
                      a uoa1 = new a(f, l, uoc1, obj.m.o6(), uoc);
                      LiveLiteViceGiftGuideManager g = obj.g;
                      a uoa2 = new a(g, v15, obj.j, obj.k, obj.n, LiveLiteGiftGuideType.ViceGiftGuide, new LiveLiteViceGiftGuideManager$b(g, obj.h, i, obj4));
                      obj.e = uoa;
                   }
                }
             }
             if (uoa != null) {
                uoa.b(obj1);
             }
          }
          return;
       }
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteViceGiftGuideManager.class, "4")) {
          return;
       }
       a.p(p0, "owner");
       super.onDestroy(p0);
       this.d.f();
       LiveLiteViceGiftGuideManager te = this.e;
       if (te != null) {
          te.c();
       }
       return;
    }
}
