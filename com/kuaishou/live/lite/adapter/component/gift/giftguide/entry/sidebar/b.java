package com.kuaishou.live.lite.adapter.component.gift.giftguide.entry.sidebar.b;
import com.kuaishou.live.lite.sidebar.e$a;
import t73.b;
import w73.s;
import z1.k;
import java.lang.String;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import fd3.l;
import lnc.a1;
import android.view.View;
import ekd.p1;
import com.google.gson.JsonObject;
import com.kwai.robust.PatchProxyResult;
import w73.a;
import android.widget.ImageView;
import androidx.collection.ArrayMap;
import java.util.Map;
import ug1.v0;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;
import com.kuaishou.live.lite.sidebar.e$b;
import fd3.m;
import android.content.Context;
import java.lang.Boolean;
import fg6.a;
import com.kuaishou.live.lite.adapter.component.gift.giftguide.entry.sidebar.LiveLiteGiftGuideSideBarConfig;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import com.kuaishou.live.lite.adapter.component.gift.giftguide.entry.sidebar.LiveLiteGiftGuideSideBarButton;
import v73.g;
import ec3.f;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import com.kuaishou.live.lite.performance.LiveLiteViewRecycler;
import msd.a;
import com.kuaishou.live.lite.performance.LiveLiteViewRecycler$a;
import java.util.Objects;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.CharSequence;
import android.widget.TextView;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.common.core.component.gift.domain.giftguide.view.LiveGuideGiftAnimationView;
import com.yxcorp.widget.selector.view.SelectShapeView;
import w51.a;
import brd.t;
import w73.s$a;
import w73.s$b;
import com.yxcorp.gifshow.models.Gift;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.live.lite.sidebar.LiveLiteSideBarIconHelper$Request;
import v73.f;
import com.kuaishou.live.lite.sidebar.LiveLiteSideBarIconHelper;
import v73.a;
import android.view.View$OnClickListener;
import android.widget.FrameLayout;
import v73.b;
import v73.d;
import com.kuaishou.live.common.core.component.gift.domain.giftguide.view.LiveGuideGiftAnimationView$b;
import v73.c;
import com.kuaishou.live.core.basic.model.LiveGiftGuideConfig;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.kuaishou.live.lite.sidebar.d;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kuaishou.live.lite.adapter.component.gift.giftguide.entry.sidebar.a;
import msd.l;
import java.lang.Integer;
import hc.b;
import com.kuaishou.live.common.core.basic.tools.l;
import v73.e;
import java.lang.Runnable;
import java.util.concurrent.Future;
import ec3.d;

public class b implements e$a	// class@001de2
{
    public final b a;
    public final int b;
    public final String c;
    public LiveLiteGiftGuideSideBarButton d;
    public KwaiImageView e;
    public KwaiImageView f;
    public LiveGuideGiftAnimationView g;
    public KwaiImageView h;
    public SelectShapeView i;
    public TextView j;
    public PublishSubject k;
    public a l;
    public s m;
    public LiveLiteGiftGuideSideBarConfig n;
    public final k o;
    public final k p;
    public final k q;
    public LiveLiteViewRecycler$a r;
    public final String s;
    public boolean t;
    public boolean u;

    public void b(b p0,s p1,k p2,k p3,k p4,int p5,String p6,String p7){
       super();
       this.k = PublishSubject.g();
       this.t = false;
       this.u = false;
       this.a = p0;
       this.o = p2;
       this.p = p3;
       this.q = p4;
       this.m = p1;
       this.b = p5;
       this.c = p6;
       this.s = p7;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       l.c(this);
       int i = a1.e(10.00f);
       p1.c(this.d, i, i, i, i);
       p1.c(this.g, i, i, i, i);
       p1.c(this.h, i, i, i, i);
       this.t = true;
       this.t();
       return;
    }
    public JsonObject b(){
       b obj = PatchProxy.apply(null, this, b.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.l;
       if (obj == null) {
          return l.a(this);
       }
       JsonObject jsonObject = this.m(obj);
       if (!this.h.getVisibility()) {
          ArrayMap uArrayMap = new ArrayMap();
          uArrayMap.put("if_effect", "TRUE");
          uArrayMap.put("gift_notice", String.valueOf(this.h.getTag()));
          jsonObject.a(jsonObject, uArrayMap);
       }
       return jsonObject;
    }
    public boolean c(){
       return false;
    }
    public JsonObject d(){
       b obj = PatchProxy.apply(null, this, b.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.l;
       if (obj != null) {
          return this.m(obj);
       }
       return l.b(this);
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       l.d(this);
       return;
    }
    public View f(){
       if (this.d == null) {
          return null;
       }
       return this.j;
    }
    public List g(){
       View[] obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.d == null) {
          return Collections.emptyList();
       }
       obj = new View[]{this.g,this.f,this.e,this.h,this.i};
       return Arrays.asList(obj);
    }
    public String getLogName(){
       return this.c;
    }
    public void h(){
       m.c(this);
    }
    public void i(){
       m.d(this);
    }
    public int j(){
       return this.b;
    }
    public View k(Context p0,JsonObject p1,boolean p2){
       View view;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(b.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, b.class, "2");
          if (p0 != patchProxyRe) {
             return p0;
          }
       }
       b uob = null;
       LiveLiteGiftGuideSideBarConfig liveLiteGift = (p1 != null)? a.a.c(p1, LiveLiteGiftGuideSideBarConfig.class): uob;
       this.n = liveLiteGift;
       if (this.d == null) {
          if (PatchProxy.isSupport(b.class)) {
             view = PatchProxy.applyOneRefs(Boolean.valueOf(p2), this, b.class, "16");
             if (view != patchProxyRe) {
             }else {
             label_0048 :
                g og = new g(p2);
                String str = (p2)? "SIDEBAR_GIFT_GUIDE_BOTTOM": "SIDEBAR_GIFT_GUIDE_NORMAL";
                if (f.h()) {
                   uob = PatchProxy.apply(uob, uob, f.class, "14");
                   b = (uob != patchProxyRe)? uob.booleanValue(): a.t().u("SOURCE_LIVE").d("liteJankOptSidebarGiftGuideViewRecycle", false);
                   if (b) {
                      LiveLiteViewRecycler$a uoa = LiveLiteViewRecycler.d.a(str, og);
                      this.r = uoa;
                      view = uoa.getView();
                   }
                }
                view = og.invoke();
             }
          }else {
             goto label_0048 ;
          }
          this.d = view;
       }
       uob = this.d;
       Objects.requireNonNull(uob);
       if (!PatchProxy.isSupport(LiveLiteGiftGuideSideBarButton.class) || !PatchProxy.applyVoidTwoRefs(liveLiteGift, Boolean.valueOf(p2), uob, LiveLiteGiftGuideSideBarButton.class, "2")) {
          if (liveLiteGift == null) {
             b.P(LiveGiftTag.LIVE_GIFT_GUIDE.appendTag("LiveGiftGuideSideBarButton"), "sideBarConfig is null");
          }else {
             LiveLiteGiftGuideSideBarButton c = uob.c;
             if (c != null) {
                c.setText(liveLiteGift.mLiteSideButtonText);
             }
          }
       }
       uob = this.d;
       if (!PatchProxy.applyVoidOneRefs(uob, this, b.class, "1")) {
          this.e = m1.f(uob, 0x7f0a2576);
          this.f = m1.f(uob, 0x7f0a2573);
          this.g = m1.f(uob, 0x7f0a2571);
          this.h = m1.f(uob, 0x7f0a2575);
          this.i = m1.f(uob, 0x7f0a2570);
          this.j = m1.f(uob, 0x7f0a2574);
       }
       this.l(this.m);
       if (a.E()) {
          this.r(2);
       }
       return this.d;
    }
    public void l(s p0){
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "6")) {
          return;
       }
       this.m = p0;
       String str = "[LiveLiteGiftGuideSideBarItem]LiveGiftGuideEntryItem";
       if (this.d == null) {
          b.P(LiveGiftTag.LIVE_GIFT_GUIDE.appendTag(str), "bindData, mLiveGiftGuideRootButton == null");
          return;
       }else if(p0 == null){
          b.P(LiveGiftTag.LIVE_GIFT_GUIDE.appendTag(str), "bindData, liveLiteGiftGuideStatus == null");
          return;
       }else {
          this.t();
          if (p0 instanceof s$a) {
             this.f.setVisibility(0);
          }else if(p0 instanceof s$b){
             a uoa = p0.a();
             if (!PatchProxy.applyVoidOneRefs(uoa, this, uob, "8")) {
                this.l = uoa;
                Gift mImageUrl = uoa.a.mImageUrl;
                if (mImageUrl != null) {
                   CDNUrl[] uCDNUrlArray = new CDNUrl[mImageUrl.size()];
                   LiveLiteSideBarIconHelper$Request request = new LiveLiteSideBarIconHelper$Request(6, this.e, this.f, mImageUrl.toArray(uCDNUrlArray));
                   request.f(new f(this));
                   LiveLiteSideBarIconHelper.a(request);
                }
                this.d.setOnClickListener(new a(this));
                this.g.setOnClickListener(new b(this));
                this.g.setAnimationFinishListener(new d(this));
                this.h.setOnClickListener(new c(this));
             }
          }
          return;
       }
    }
    public final JsonObject m(a p0){
       JsonObject obj = PatchProxy.applyOneRefs(p0, this, b.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JsonObject();
       obj.c0("gift_id", String.valueOf(p0.a.mId));
       obj.c0("gift_llsid", p0.b.mRecoGiftLlsid);
       obj.a(obj, this.q.get());
       return obj;
    }
    public final void n(){
       if (PatchProxy.applyVoid(null, this, b.class, "15")) {
          return;
       }
       d.a(this.b(), this.getLogName(), this.o.get(), this.p.get());
       return;
    }
    public void o(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "17")) {
          return;
       }
       if (this.r != null) {
          b td = this.d;
          if (td != null) {
             Objects.requireNonNull(td);
             if (!PatchProxy.applyVoid(objArray, td, LiveLiteGiftGuideSideBarButton.class, "4")) {
                LiveLiteGiftGuideSideBarButton c = td.c;
                if (c != null) {
                   c.setText("");
                }
                td.b.setBackground(objArray);
             }
             LiveLiteViewRecycler d = LiveLiteViewRecycler.d;
             d.e(this.d);
             this.d.setOnClickListener(objArray);
             this.e.i0();
             d.e(this.g);
             this.g.setOnClickListener(objArray);
             this.g.setAnimationFinishListener(objArray);
             this.g.setVisibility(8);
             d.e(this.h);
             this.h.setOnClickListener(objArray);
             this.h.setVisibility(8);
             this.h.setTag(objArray);
             this.h.i0();
             d.d(this.r, a.b);
          }
       }
       return;
    }
    public void p(boolean p0){
       int i;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "9")) {
          return;
       }
       uob = this.g;
       if (uob == null) {
          b.S(LiveGiftTag.LIVE_GIFT_GUIDE.appendTag("[LiveLiteGiftGuideSideBarItem]LiveGiftGuideEntryItem"), "setAnimViewVisible ignore, mGuideGiftAnimationView == null", "visible", Boolean.valueOf(p0));
          return;
       }else if(p0){
          i = 0;
       }else {
          i = 8;
       }
       uob.setVisibility(i);
       if (!p0) {
          this.g.a();
       }else {
          this.s(false);
       }
       return;
    }
    public void q(){
       if (PatchProxy.applyVoid(null, this, b.class, "10")) {
          return;
       }
       b tg = this.g;
       if (tg == null) {
          b.P(LiveGiftTag.LIVE_GIFT_GUIDE.appendTag("[LiveLiteGiftGuideSideBarItem]LiveGiftGuideEntryItem"), "startAnimViewAnimation ignore, mGuideGiftAnimationView == null");
          return;
       }else {
          tg.b();
          return;
       }
    }
    public t r(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "18");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       uob = this.h;
       t ot = null;
       if (uob == null) {
          b.P(LiveGiftTag.LIVE_GIFT_GUIDE.appendTag("[LiveLiteGiftGuideSideBarItem]LiveGiftGuideEntryItem"), "startGuideNotice ignore, mGuideGiftNoticeView == null");
          return ot;
       }else if(uob.getVisibility() && this.g.getVisibility()){
          this.h.setTag(Integer.valueOf(p0));
          this.h.setVisibility(0);
          CDNUrl[] uCDNUrlArray = new CDNUrl[]{new CDNUrl(ot, this.s)};
          l.c(this.h, uCDNUrlArray, Integer.MAX_VALUE, ot);
          ot = this.k;
       }
       return ot;
    }
    public void s(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "19")) {
          return;
       }
       uob = this.h;
       if (uob == null) {
          b.P(LiveGiftTag.LIVE_GIFT_GUIDE.appendTag("[LiveLiteGiftGuideSideBarItem]LiveGiftGuideEntryItem"), "stopGuideNotice ignore, mGuideGiftNoticeView == null");
          return;
       }else if(uob != null && !uob.getVisibility()){
          this.h.setVisibility(8);
          this.k.onNext(Boolean.valueOf(p0));
       }
       return;
    }
    public final void t(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "7")) {
          return;
       }
       if (this.u != null || (this.t != null && this.m != null)) {
          if (!PatchProxy.applyVoid(objArray, this, uob, "14")) {
             d.a(new e(this, this.getLogName(), this.d(), this.o.get()));
          }
          this.u = true;
       }
    label_003d :
       return;
    }
}
