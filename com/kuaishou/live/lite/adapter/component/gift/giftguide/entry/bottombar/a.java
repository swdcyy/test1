package com.kuaishou.live.lite.adapter.component.gift.giftguide.entry.bottombar.a;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$a;
import t73.b;
import w73.a;
import z1.k;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$BottomBarType;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import com.kuaishou.live.lite.adapter.component.gift.giftguide.entry.bottombar.LiveLiteGiftGuideBottomBarButton;
import android.app.Application;
import o56.a;
import android.content.Context;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.common.core.component.gift.domain.giftguide.view.LiveGuideGiftAnimationView;
import com.google.gson.JsonObject;
import com.kwai.robust.PatchProxyResult;
import android.widget.ImageView;
import androidx.collection.ArrayMap;
import java.util.Map;
import ug1.v0;
import i93.j;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.yxcorp.gifshow.models.Gift;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import u73.a;
import android.view.View$OnClickListener;
import android.widget.FrameLayout;
import u73.b;
import u73.d;
import com.kuaishou.live.common.core.component.gift.domain.giftguide.view.LiveGuideGiftAnimationView$b;
import u73.c;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$BottomBarItemChangeReason;
import com.kuaishou.live.core.basic.model.LiveGiftGuideConfig;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.kuaishou.live.lite.bottombar.g;
import java.lang.Boolean;

public class a implements LiveLiteBottomBarService$a	// class@001dde
{
    public final b a;
    public final LiveLiteBottomBarService$BottomBarType b;
    public LiveLiteGiftGuideBottomBarButton c;
    public KwaiImageView d;
    public LiveGuideGiftAnimationView e;
    public KwaiImageView f;
    public PublishSubject g;
    public a h;
    public final k i;
    public final k j;
    public final k k;
    public boolean l;
    public final AtomicBoolean m;

    public void a(b p0,a p1,k p2,k p3,k p4,LiveLiteBottomBarService$BottomBarType p5,AtomicBoolean p6){
       super();
       this.g = PublishSubject.g();
       this.l = false;
       this.a = p0;
       this.i = p2;
       this.j = p3;
       this.k = p4;
       this.m = p6;
       LiveLiteGiftGuideBottomBarButton liveLiteGift = new LiveLiteGiftGuideBottomBarButton(a.b());
       this.c = liveLiteGift;
       this.b = p5;
       if (PatchProxy.applyVoidOneRefs(liveLiteGift, this, a.class, "1")) {
       }else {
          this.d = m1.f(liveLiteGift, 0x7f0a1a9d);
          this.e = m1.f(liveLiteGift, 0x7f0a1a99);
          this.f = m1.f(liveLiteGift, 0x7f0a1a9c);
       }
       this.e(p1);
       return;
    }
    public View a(Context p0){
       return this.c;
    }
    public JsonObject b(){
       a obj = PatchProxy.apply(null, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.h;
       if (obj == null) {
          return j.a(this);
       }
       JsonObject jsonObject = this.h(obj);
       if (!this.f.getVisibility()) {
          ArrayMap uArrayMap = new ArrayMap();
          uArrayMap.put("if_effect", "TRUE");
          uArrayMap.put("gift_notice", String.valueOf(this.f.getTag()));
          jsonObject.a(jsonObject, uArrayMap);
       }
       return jsonObject;
    }
    public boolean c(){
       return false;
    }
    public JsonObject d(){
       a obj = PatchProxy.apply(null, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.h;
       if (obj != null) {
          return this.h(obj);
       }
       return j.b(this);
    }
    public void e(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       this.h = p0;
       String str = "[LiveLiteGiftGuideBottomBarItem]LiveGiftGuideEntryItem";
       if (p0 == null) {
          this.d.setAlpha(0);
          b.P(LiveGiftTag.LIVE_GIFT_GUIDE.appendTag(str), "bindData, liveGiftGuideData == null");
          return;
       }else {
          this.n();
          this.d.P(p0.a.mImageUrl);
          LiveGiftTag lIVE_GIFT_GU = LiveGiftTag.LIVE_GIFT_GUIDE;
          lIVE_GIFT_GU.appendTag(str);
          LiveGiftTag liveGiftTag = lIVE_GIFT_GU;
          b.P(liveGiftTag, "bindData, startAlphaAnimation");
          this.c.setOnClickListener(new a(this, p0));
          this.e.setOnClickListener(new b(this, p0));
          this.e.setAnimationFinishListener(new d(this));
          this.f.setOnClickListener(new c(this, p0));
          return;
       }
    }
    public void f(LiveLiteBottomBarService$BottomBarItemChangeReason p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.l = true;
       this.n();
       return;
    }
    public void g(LiveLiteBottomBarService$BottomBarItemChangeReason p0){
       j.c(this, p0);
    }
    public LiveLiteBottomBarService$BottomBarType getType(){
       return this.b;
    }
    public final JsonObject h(a p0){
       JsonObject obj = PatchProxy.applyOneRefs(p0, this, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JsonObject();
       obj.c0("gift_id", String.valueOf(p0.a.mId));
       obj.c0("gift_llsid", p0.b.mRecoGiftLlsid);
       obj.a(obj, this.k.get());
       return obj;
    }
    public boolean i(){
       return j.f(this);
    }
    public final void j(){
       if (PatchProxy.applyVoid(null, this, a.class, "11")) {
          return;
       }
       g.a(this, this.i.get(), this.j.get());
       return;
    }
    public void k(boolean p0){
       int i;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "5")) {
          return;
       }
       uoa = this.e;
       if (uoa == null) {
          b.S(LiveGiftTag.LIVE_GIFT_GUIDE.appendTag("[LiveLiteGiftGuideBottomBarItem]LiveGiftGuideEntryItem"), "[setAnimViewVisible]ignore, mGuideGiftAnimationView == null", "visible", Boolean.valueOf(p0));
          return;
       }else if(p0){
          i = 0;
       }else {
          i = 8;
       }
       uoa.setVisibility(i);
       if (!p0) {
          this.e.a();
       }else {
          this.m(false);
       }
       return;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       a te = this.e;
       if (te == null) {
          b.P(LiveGiftTag.LIVE_GIFT_GUIDE.appendTag("[LiveLiteGiftGuideBottomBarItem]LiveGiftGuideEntryItem"), "[startAnimViewAnimation]ignore, mGuideGiftAnimationView == null");
          return;
       }else {
          te.b();
          return;
       }
    }
    public void m(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "13")) {
          return;
       }
       if (!this.f.getVisibility()) {
          this.f.setVisibility(8);
          this.g.onNext(Boolean.valueOf(p0));
       }
       return;
    }
    public final void n(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "4")) {
          return;
       }
       if (this.m.get() || (this.l != null && this.h != null)) {
          if (!PatchProxy.applyVoid(objArray, this, uoa, "10")) {
             g.b(this, this.i.get(), this.j.get());
          }
          this.m.set(true);
       }
    label_003f :
       return;
    }
}
