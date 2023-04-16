package com.kwaishou.merchant.daccore.mount.PendantMountService;
import g08.a;
import com.kwaishou.merchant.daccore.mount.PendantMountService$a;
import nsd.u;
import java.util.Map;
import java.lang.String;
import java.lang.Object;
import com.kwaishou.merchant.daccore.mount.PendantMountService$mountDelegates$2;
import msd.a;
import qrd.p;
import qrd.s;
import gw3.l;
import dw3.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.dynamicpendant.mount.LiteLiveArea;
import java.lang.Enum;
import com.kuaishou.live.lite.tempplay.LiveLiteTempPlayService;
import f08.f;
import f08.f$a;
import java.lang.Throwable;
import dw3.b;
import i08.a;
import ew3.a;
import f93.c;
import com.kuaishou.merchant.dynamicpendant.mount.litelive.delegate.bottombubble.LiteBottomBubbleAreaMountDelegate;
import gw3.c;
import com.kuaishou.merchant.dynamicpendant.mount.LiveArea;
import ls3.a;
import gw3.b;
import gw3.e;
import b14.b;
import lp3.i;
import com.kuaishou.merchant.dynamicpendant.mount.live.delegate.BottomBubbleMountDelegate;
import tp5.j;
import gw3.j;
import zq5.b;
import com.kuaishou.merchant.dynamicpendant.mount.live.delegate.floatingscreen.LiveMerchantCommentTopBarrageData;
import gw3.k;
import gr5.a;
import kr5.a;
import gw3.n;
import gw3.m;
import gw3.p;
import ks5.g;
import com.kuaishou.merchant.dynamicpendant.mount.live.delegate.LiveTopAreaMountDelegate;
import gw3.r;
import yq5.c;
import com.kuaishou.merchant.dynamicpendant.mount.live.delegate.LiveWatchAvatarAreaMountDelegate;
import gw3.t;
import com.kuaishou.merchant.api.live.service.LiveMerchantTopPendantService;
import com.kuaishou.merchant.dynamicpendant.mount.live.delegate.MerchantLeftTopAreaMountDelegate;
import gw3.v;
import pq5.c;
import com.kuaishou.merchant.dynamicpendant.mount.live.delegate.RightBottomAreaMountDelegate;
import gw3.w;
import ks3.l0;
import com.kuaishou.merchant.dynamicpendant.mount.live.delegate.RightBottomSlideAreaMountDelegate;
import gw3.y;
import ls3.b;
import com.kuaishou.merchant.dynamicpendant.mount.live.delegate.RightCenterAreaMountDelegate;
import android.view.View;
import com.kwaishou.merchant.daccore.data.model.PendantMountInfo;
import java.lang.StringBuilder;

public final class PendantMountService implements a	// class@001324
{
    public final p a;
    public Map b;
    public String c;
    public static final PendantMountService$a d;

    static {
       PendantMountService.d = new PendantMountService$a(null);
    }
    public void PendantMountService(Map p0,String p1){
       LiveArea iNTERACTIVE_;
       Object obj1;
       LiveArea cENTER_MSG_B;
       Object obj2;
       LiteLiveArea lITE_BOTTOM_;
       super();
       this.b = p0;
       this.c = p1;
       this.a = s.c(PendantMountService$mountDelegates$2.INSTANCE);
       l ol = l.class;
       Object obj = null;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(this, obj, c.class, str)) {
       }else {
          lITE_BOTTOM_ = LiteLiveArea.LITE_TEMP_PLAY;
          obj1 = this.f(lITE_BOTTOM_.name());
          if (!obj1 instanceof LiveLiteTempPlayService) {
             if (obj1 != null) {
                f$a.o(f.a, this.d(), "liteTempPlayService is not correct type", null, null, 12, null);
             }
          }else {
             this.g(lITE_BOTTOM_.name(), new b(obj1));
          }
       }
       if (!PatchProxy.applyVoidOneRefs(this, obj, a.class, str)) {
          lITE_BOTTOM_ = LiteLiveArea.LITE_BOTTOM_BUBBLE;
          obj1 = this.f(lITE_BOTTOM_.name());
          if (!obj1 instanceof c) {
             if (obj1 != null) {
                f$a.o(f.a, this.d(), "liveLiteBenefitCardService is not correct type", null, null, 12, null);
             }
          }else {
             this.g(lITE_BOTTOM_.name(), new LiteBottomBubbleAreaMountDelegate(obj1));
          }
       }
       if (!PatchProxy.applyVoidOneRefs(this, obj, c.class, str)) {
          cENTER_MSG_B = LiveArea.ATMOSPHERE_AREA;
          obj1 = this.f(cENTER_MSG_B.name());
          if (obj1 instanceof a) {
             this.g(cENTER_MSG_B.name(), new b(obj1));
          }
       }
       String str1 = "liveServiceManager";
       if (!PatchProxy.applyVoidOneRefs(this, obj, e.class, str)) {
          cENTER_MSG_B = LiveArea.BOTTOM_BUBBLE_AREA;
          obj2 = this.f(cENTER_MSG_B.name());
          if (!obj2 instanceof b) {
             if (obj2 != null) {
                f$a.o(f.a, this.d(), "bottomBubbleMountService is not correct type", null, null, 12, null);
             }
          }else {
             Object obj3 = this.f(str1);
             if (!obj3 instanceof i) {
                obj3 = obj;
             }
             if (obj3 == null) {
                f$a.l(f.a, this.d(), "bottomBubble registerMountDelegate failed:liveServiceManager null", null, 4, null);
             }else {
                this.g(cENTER_MSG_B.name(), new BottomBubbleMountDelegate(obj2, obj3));
             }
          }
       }
       if (!PatchProxy.applyVoidOneRefs(this, obj, ol, "2")) {
          cENTER_MSG_B = LiveArea.CENTER_MSG_BARRAGE;
          obj2 = this.f(cENTER_MSG_B.name());
          if (!obj2 instanceof j) {
             if (obj2 != null) {
                f$a.o(f.a, this.d(), "centerBarrageMountService is not correct type", null, null, 12, null);
             }
          }else {
             this.g(cENTER_MSG_B.name(), new j(obj2, obj));
          }
       }
       if (!PatchProxy.applyVoidOneRefs(this, obj, ol, str)) {
          iNTERACTIVE_ = LiveArea.COMMENT_TOP_BARRAGE;
          p1 = this.f(iNTERACTIVE_.name());
          if (p1 instanceof b) {
             p1.v9(11, LiveMerchantCommentTopBarrageData.class, obj, new k());
             this.g(iNTERACTIVE_.name(), new j(obj, p1));
          }else if(p1 != null){
             f$a.o(f.a, this.d(), "commentTopBarrageMountService is not correct type", null, null, 12, null);
          }
       }
       if (!PatchProxy.applyVoidOneRefs(this, obj, n.class, str)) {
          ol = this.f(str1);
          if (!ol instanceof i) {
             ol = obj;
          }
          if (ol == null) {
             f$a.l(f.a, this.d(), "tempMessage registerMountDelegate failed:liveServiceManager null", null, 4, null);
          }else {
             this.g(LiveArea.TEMP_ENHANCE_MESSAGE.name(), new m(ol));
          }
       }
       if (!PatchProxy.applyVoidOneRefs(this, obj, p.class, str)) {
          iNTERACTIVE_ = LiveArea.TEMP_PLAY_AREA;
          p1 = this.f(iNTERACTIVE_.name());
          if (!p1 instanceof g) {
             if (p1 != null) {
                f$a.o(f.a, this.d(), "liveTopAreaMountService is not correct type", null, null, 12, null);
             }
          }else {
             obj1 = this.f(str1);
             if (!obj1 instanceof i) {
                obj1 = obj;
             }
             if (obj1 == null) {
                f$a.l(f.a, this.d(), "liveTopAreaMount failed:liveServiceManager is null", null, 4, null);
             }else {
                LiveTopAreaMountDelegate liveTopAreaM = new LiveTopAreaMountDelegate(p1, obj1);
                this.g(iNTERACTIVE_.name(), liveTopAreaM);
                this.g(LiveArea.ASSOCIATED_CONTENT_AREA.name(), liveTopAreaM);
             }
          }
       }
       if (!PatchProxy.applyVoidOneRefs(this, obj, r.class, str)) {
          iNTERACTIVE_ = LiveArea.LIVE_WATCH_AVATAR;
          p1 = this.f(iNTERACTIVE_.name());
          if (!p1 instanceof c) {
             if (p1 != null) {
                f$a.o(f.a, this.d(), "liveAvatarAreaMountService is not correct type", null, null, 12, null);
             }
          }else {
             this.g(iNTERACTIVE_.name(), new LiveWatchAvatarAreaMountDelegate(p1));
          }
       }
       if (!PatchProxy.applyVoidOneRefs(this, obj, t.class, str)) {
          iNTERACTIVE_ = LiveArea.MERCHANT_TOP_LEFT_AREA;
          p1 = this.f(iNTERACTIVE_.name());
          if (!p1 instanceof LiveMerchantTopPendantService) {
             if (p1 != null) {
                f$a.o(f.a, this.d(), "liveMerchantLeftTopAreaMountService is not correct type", null, null, 12, null);
             }
          }else {
             this.g(iNTERACTIVE_.name(), new MerchantLeftTopAreaMountDelegate(p1));
          }
       }
       if (!PatchProxy.applyVoidOneRefs(this, obj, v.class, str)) {
          iNTERACTIVE_ = LiveArea.CONTENT_ASSIST_AREA;
          p1 = this.f(iNTERACTIVE_.name());
          if (!p1 instanceof c) {
             if (p1 != null) {
                f$a.o(f.a, this.d(), "rightBottomMountService is not correct type", null, null, 12, null);
             }
          }else {
             this.g(iNTERACTIVE_.name(), new RightBottomAreaMountDelegate(p1));
          }
       }
       if (!PatchProxy.applyVoidOneRefs(this, obj, w.class, str)) {
          iNTERACTIVE_ = LiveArea.RIGHT_BOTTOM_SLIDE_AREA;
          p1 = this.f(iNTERACTIVE_.name());
          if (!p1 instanceof l0) {
             if (p1 != null) {
                f$a.o(f.a, this.d(), "rightBottomSlideMountService is not correct type", null, null, 12, null);
             }
          }else {
             this.g(iNTERACTIVE_.name(), new RightBottomSlideAreaMountDelegate(p1));
          }
       }
       if (!PatchProxy.applyVoidOneRefs(this, obj, y.class, str)) {
          iNTERACTIVE_ = LiveArea.INTERACTIVE_PLAY_AREA;
          p1 = this.f(iNTERACTIVE_.name());
          if (!p1 instanceof b) {
             if (p1 != null) {
                f$a.o(f.a, this.d(), "rightCenterMountService is not correct type", null, null, 12, null);
             }
          }else {
             this.g(iNTERACTIVE_.name(), new RightCenterAreaMountDelegate(p1));
          }
       }
       return;
    }
    public boolean a(View p0,PendantMountInfo p1){
       boolean b = false;
       if (p1 == null) {
          f$a.o(f.a, this.c, "mount failed: pendantMountInfo is null", null, null, 12, null);
          return b;
       }else {
          a uoa = this.c(p1.getArea());
          if (uoa != null) {
             b = uoa.a(p0, p1);
          }
          return b;
       }
    }
    public boolean b(View p0,PendantMountInfo p1){
       boolean b = false;
       if (p1 == null) {
          f$a.o(f.a, this.c, "unMount failed: pendantMountInfo is null", null, null, 12, null);
          return b;
       }else {
          a uoa = this.c(p1.getArea());
          if (uoa != null) {
             b = uoa.b(p0, p1);
          }
          return b;
       }
    }
    public a c(String p0){
       a uoa = this.e().get(p0);
       if (uoa == null) {
          f$a.o(f.a, this.c, "Area "+p0+" not found mountDelegate", null, null, 12, null);
       }
       return uoa;
    }
    public final String d(){
       return this.c;
    }
    public final Map e(){
       return this.a.getValue();
    }
    public final Object f(String p0){
       PendantMountService tb = this.b;
       p0 = (tb != null)? tb.get(p0): null;
       return p0;
    }
    public final void g(String p0,a p1){
       this.e().put(p0, p1);
    }
}
