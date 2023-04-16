package com.kuaishou.live.lite.adapter.component.gift.giftguide.a;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$b;
import com.kuaishou.live.lite.adapter.component.gift.giftguide.LiveLiteGiftGuideManager$handleGuideNotice$1;
import w73.p;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage$DefaultImpls;
import java.lang.Number;
import msd.p;
import java.util.Objects;
import androidx.collection.ArrayMap;
import java.util.Map;
import fg6.a;
import com.google.gson.Gson;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.adapter.component.gift.giftguide.LiveLiteGiftGuideManager;
import com.kuaishou.live.lite.adapter.component.gift.giftguide.entry.a;
import brd.t;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.System;
import com.kuaishou.live.lite.sidebar.e;
import com.kuaishou.live.lite.adapter.component.gift.giftguide.entry.bottombar.a;
import java.lang.Integer;
import android.widget.ImageView;
import android.view.View;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiImageView;
import hc.b;
import com.kuaishou.live.common.core.basic.tools.l;
import t73.d;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.kuaishou.live.lite.adapter.component.gift.giftguide.entry.sidebar.b;
import t73.e;
import z1.k;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager;
import com.kuaishou.live.core.basic.model.LiveGiftGuideConfig;
import w73.o;
import lnc.b9;
import java.util.List;
import w73.v;
import w73.k;
import erd.o;
import w73.m;
import t45.d;
import brd.z;
import w73.g;
import w73.i;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class a implements LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage, LiveLiteGuidanceMessageQueueManager$b	// class@001dd9
{
    public boolean a;
    public long b;
    public final LiveLiteGiftGuideManager$handleGuideNotice$1 c;
    public final p d;

    public void a(LiveLiteGiftGuideManager$handleGuideNotice$1 p0,p p1){
       this.c = p0;
       this.d = p1;
       super();
       this.b = p1.c();
    }
    public String a(){
       Object obj = PatchProxy.apply(null, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage$DefaultImpls.a(this);
    }
    public long b(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.d.c;
    }
    public long c(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.d.b;
    }
    public void d(long p0){
       this.b = p0;
    }
    public long e(){
       return this.b;
    }
    public p f(){
       Object obj = PatchProxy.apply(null, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage$DefaultImpls.b(this);
    }
    public String g(){
       return "LITE_ATTACH_GIFT_NOTICE_ANIMATION";
    }
    public String getExtraInfo(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, a.class, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.d;
       Objects.requireNonNull(obj);
       String str = PatchProxy.apply(objArray, obj, p.class, "1");
       if (str != patchProxyRe) {
       }else {
          ArrayMap uArrayMap = new ArrayMap();
          uArrayMap.put("gift_notice", String.valueOf(obj.f));
          str = a.a.q(uArrayMap);
          a.o(str, "Gsons.KWAI_GSON.toJson\(extraInfo\)");
       }
       return str;
    }
    public LiveLiteGuidanceMessageQueueManager$b h(){
       return this;
    }
    public void i(LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage p0){
       String str1;
       boolean b;
       a d2;
       int i;
       Object obj = this;
       Object obj1 = p0;
       String str = "5";
       if (PatchProxy.applyVoidOneRefs(obj1, obj, a.class, str)) {
          return;
       }
       a.p(obj1, "message");
       LiveLiteGiftGuideManager g = obj.c.b.g;
       a d = obj.d;
       Objects.requireNonNull(g);
       a uoa = a.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj2 = PatchProxy.applyOneRefs(d, g, uoa, "11");
       if (obj2 != patchProxyRe) {
          str1 = obj2;
       }else {
          p e = d.e;
          String str2 = "12";
          if (PatchProxy.isSupport(uoa)) {
             Object obj3 = PatchProxy.applyOneRefs(Long.valueOf(e), g, uoa, str2);
             if (obj3 != patchProxyRe) {
                b = obj3.booleanValue();
             }else if((System.currentTimeMillis() - g.m) - e < 0){
                b = true;
             }else {
                b = false;
             }
          }else {
             goto label_004c ;
          }
          str1 = null;
          if (!b) {
             if (g.a.j()) {
                a f = g.f;
                if (f != null) {
                   i = d.b();
                   a uoa1 = a.class;
                   if (PatchProxy.isSupport(uoa1)) {
                      CDNUrl[] obj4 = PatchProxy.applyOneRefs(Integer.valueOf(i), f, uoa1, str2);
                      if (obj4 != patchProxyRe) {
                         str1 = obj4;
                      }else if(f.f.getVisibility() && f.e.getVisibility()){
                         f.f.setTag(Integer.valueOf(i));
                         int i1 = 0;
                         f.f.setVisibility(i1);
                         obj4 = new CDNUrl[]{new CDNUrl(str1, "https://static.yximgs.com/udata/pkg/kwai-client-image/live_lite_attach/live_lite_quick_gift_effect.webp")};
                         l.c(f.f, obj4, Integer.MAX_VALUE, str1);
                         str1 = f.g;
                      }
                   }else {
                      goto label_0083 ;
                   }
                   if (str1 != null && g.o == null) {
                      g.o = str1.subscribe(new d(g), Functions.d());
                   }
                }
             }
             if (!g.a.j()) {
                d2 = g.e;
                if (d2 != null) {
                   t ot = d2.r(d.b());
                   if (ot != null && g.n == null) {
                      g.n = ot.subscribe(new e(g), Functions.d());
                   }
                   str1 = ot;
                }
             }
          }
       }
    label_00f8 :
       if (str1 == null) {
          obj.c.b.b().get().c(obj);
          obj.a = true;
       }else if(obj.d.a() != null){
          LiveLiteGiftGuideManager d1 = obj.c.b.d;
          d2 = obj.d;
          Objects.requireNonNull(d1);
          if (!PatchProxy.applyVoidTwoRefs(d2, str1, d1, o.class, str)) {
             LiveGiftGuideConfig liveGiftGuid = d2.a();
             Objects.requireNonNull(liveGiftGuid);
             b9.a(d1.n);
             d1.n = d1.i.a(liveGiftGuid.mExplicitGiftIds.get(0).intValue()).map(new k(d1, liveGiftGuid, d2)).flatMap(new m(str1, d2)).observeOn(d.a).subscribe(new g(d1, d2), i.b);
          label_0172 :
             LiveGiftTag lIVE_GIFT_GU = LiveGiftTag.LIVE_GIFT_GUIDE_NOTICE;
             b = (str1 != null)? true: false;
             b.d0(lIVE_GIFT_GU, "onStartConsume: ", "guideNoticeStarted", Boolean.valueOf(b), "message", p0.a());
             return;
          }
       }
       uoa = 0;
       goto label_0172 ;
    }
    public void j(LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "6")) {
          return;
       }
       a.p(p0, "message");
       LiveLiteGiftGuideManager g = this.c.b.g;
       Objects.requireNonNull(g);
       if (!PatchProxy.applyVoid(null, g, a.class, "13")) {
          if (g.a.j()) {
             a f = g.f;
             if (f != null) {
                f.m(true);
             }
          }
          if (!g.a.j()) {
             a e = g.e;
             if (e != null) {
                e.s(true);
             }
          }
       }
    label_0045 :
       b.c0(LiveGiftTag.LIVE_GIFT_GUIDE_NOTICE, "onFinishConsume: ", "message", p0.a());
       return;
    }
    public boolean k(){
       return this.a;
    }
    public String l(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.a;
    }
}
