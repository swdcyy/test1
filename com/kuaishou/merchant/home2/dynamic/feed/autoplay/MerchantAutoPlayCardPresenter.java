package com.kuaishou.merchant.home2.dynamic.feed.autoplay.MerchantAutoPlayCardPresenter;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.home2.dynamic.feed.autoplay.MerchantAutoPlayCardPresenter$resizeRunnable$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.merchant.home2.dynamic.feed.autoplay.MerchantAutoPlayCardPresenter$autoPlayCardFeedListener$2;
import com.kuaishou.merchant.home2.dynamic.feed.autoplay.MerchantAutoPlayCardPresenter$mInterceptor$2;
import com.kuaishou.merchant.home2.dynamic.feed.autoplay.MerchantAutoPlayCardPresenter$onLiveAutoPlayerListener$2;
import io.reactivex.subjects.PublishSubject;
import brd.t;
import android.widget.ImageView;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import ba9.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule;
import t99.y;
import w99.g;
import java.lang.Runnable;
import s99.i;
import s99.d;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import v99.a;
import io4.d;
import io4.e;
import java.lang.Integer;
import java.lang.Number;
import android.view.View;
import ex3.d;
import android.content.Context;
import com.yxcorp.utility.n;
import android.view.ViewOutlineProvider;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import brd.y;
import com.kuaishou.android.live.model.QLivePlayConfig;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView;
import go4.a;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.bowl.core.component.a;
import px3.a;
import java.lang.StringBuilder;
import p74.a;
import o74.a;
import com.kuaishou.merchant.home2.dynamic.feed.autoplay.MerchantAutoPlayCardPresenter$a;
import com.kuaishou.merchant.home2.dynamic.feed.autoplay.MerchantAutoPlayCardPresenter$b;
import android.app.Activity;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import ox3.h;
import com.kuaishou.merchant.home2.feed.a;
import com.kwai.feature.api.live.base.model.LiveAudienceParam$a;
import com.kwai.feature.api.live.base.model.LivePassThruParamExtraInfo;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayEnterParam$b;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayEnterParam;
import tkd.b;
import tkd.d;
import os5.e;
import com.tkruntime.v8.JsValueRef;
import com.tkruntime.v8.V8Function;
import com.tkruntime.v8.V8Object;
import tx4.y;
import com.kuaishou.merchant.home2.dynamic.feed.autoplay.MerchantAutoPlayCardPresenter$c;
import java.lang.Throwable;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import px3.i;
import java.util.Map;
import java.util.HashMap;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import ny3.b;
import com.kuaishou.merchant.home2.feed.model.LiveFeed;
import com.yxcorp.gifshow.autoplay.live.e$a;
import fs5.a;
import com.yxcorp.gifshow.autoplay.live.e;

public final class MerchantAutoPlayCardPresenter extends PresenterV2 implements g	// class@001751
{
    public a A;
    public final p B;
    public final p C;
    public final p D;
    public final p E;
    public c F;
    public RecyclerView G;
    public JsValueRef H;
    public e I;
    public int J;
    public t K;
    public LivePlayTextureView p;
    public KwaiImageView q;
    public a r;
    public ImageView s;
    public BaseFragment t;
    public b u;
    public QPhoto v;
    public Integer w;
    public String x;
    public String y;
    public LiveAutoPlayModule z;

    public void MerchantAutoPlayCardPresenter(){
       super();
       this.B = s.c(new MerchantAutoPlayCardPresenter$resizeRunnable$2(this));
       this.C = s.c(new MerchantAutoPlayCardPresenter$autoPlayCardFeedListener$2(this));
       this.D = s.c(new MerchantAutoPlayCardPresenter$mInterceptor$2(this));
       this.E = s.c(new MerchantAutoPlayCardPresenter$onLiveAutoPlayerListener$2(this));
       PublishSubject publishSubje = PublishSubject.g();
       this.F = publishSubje;
       this.J = 4;
       this.K = publishSubje.hide();
    }
    public static final ImageView P8(MerchantAutoPlayCardPresenter p0){
       p0 = p0.s;
       if (p0 == null) {
          a.S("liveBackgroundView");
       }
       return p0;
    }
    public static final LivePlayTextureView R8(MerchantAutoPlayCardPresenter p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("playTextureView");
       }
       return p0;
    }
    public static final a S8(MerchantAutoPlayCardPresenter p0){
       p0 = p0.r;
       if (p0 == null) {
          a.S("playView");
       }
       return p0;
    }
    public void E8(){
       MerchantAutoPlayCardPresenter merchantAuto = MerchantAutoPlayCardPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, merchantAuto, "7")) {
          return;
       }
       MerchantAutoPlayCardPresenter tv = this.v;
       if (tv != null) {
          MerchantAutoPlayCardPresenter tz = this.z;
          if (tz != null) {
             String str = "playView";
             if (!PatchProxy.applyVoidOneRefs(tz, this, merchantAuto, "15")) {
                merchantAuto = this.p;
                if (merchantAuto == null) {
                   a.S("playTextureView");
                }
                tz.h0(merchantAuto);
                tz.O(this.X8());
                merchantAuto = this.r;
                if (merchantAuto == null) {
                   a.S(str);
                }
                merchantAuto.setAutoPlayModule(tz);
             }
             merchantAuto = this.q;
             if (merchantAuto != null) {
                merchantAuto.removeCallbacks(this.Y8());
             }
             merchantAuto = this.q;
             if (merchantAuto != null) {
                merchantAuto.post(this.Y8());
             }
             merchantAuto = this.r;
             if (merchantAuto == null) {
                a.S(str);
             }
             merchantAuto.y(this.V8());
             merchantAuto = this.r;
             if (merchantAuto == null) {
                a.S(str);
             }
             merchantAuto.B(this.W8());
             merchantAuto = this.r;
             if (merchantAuto == null) {
                a.S(str);
             }
             merchantAuto.setItemWeight(r1.k1(tv.mEntity));
             merchantAuto = this.A;
             if (merchantAuto == null) {
                a.S("autoPlayManager");
             }
             tv = this.r;
             if (tv == null) {
                a.S(str);
             }
             merchantAuto.a(tv);
             merchantAuto = this.r;
             if (merchantAuto == null) {
                a.S(str);
             }
             tv = this.I;
             if (tv != null) {
                d uod = tv.d();
                if (uod != null) {
                   Integer integer = Integer.valueOf(uod.a());
                   Context uContext = (integer.intValue() > 0)? 1: null;
                   if (uContext) {
                      objArray = integer;
                   }
                   if (objArray != null) {
                      this.J = objArray.intValue();
                   }
                }
             }
             merchantAuto.getView().setOutlineProvider(new d(n.c(this.getContext(), (float)this.J)));
             merchantAuto.getView().setClipToOutline(true);
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, MerchantAutoPlayCardPresenter.class, "8")) {
          return;
       }
       MerchantAutoPlayCardPresenter tq = this.q;
       if (tq != null) {
          tq.removeCallbacks(this.Y8());
       }
       tq = this.r;
       if (tq == null) {
          a.S("playView");
       }
       tq.v(this.W8());
       tq = this.z;
       if (tq != null) {
          tq.e0(this.X8());
       }
       tq = this.r;
       if (tq == null) {
          a.S("playView");
       }
       tq.A(this.V8());
       this.e9("unbind");
       tq = this.r;
       if (tq == null) {
          a.S("playView");
       }
       tq.q();
       tq = this.A;
       if (tq == null) {
          a.S("autoPlayManager");
       }
       MerchantAutoPlayCardPresenter tr = this.r;
       if (tr == null) {
          a.S("playView");
       }
       tq.n(tr);
       return;
    }
    public final i V8(){
       Object obj = PatchProxy.apply(null, this, MerchantAutoPlayCardPresenter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.C.getValue();
    }
    public final d W8(){
       Object obj = PatchProxy.apply(null, this, MerchantAutoPlayCardPresenter.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.D.getValue();
    }
    public final y X8(){
       Object obj = PatchProxy.apply(null, this, MerchantAutoPlayCardPresenter.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.E.getValue();
    }
    public final Runnable Y8(){
       Object obj = PatchProxy.apply(null, this, MerchantAutoPlayCardPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.B.getValue();
    }
    public final void Z8(){
       if (PatchProxy.applyVoid(null, this, MerchantAutoPlayCardPresenter.class, "19")) {
          return;
       }
       this.F.onNext(Boolean.TRUE);
       MerchantAutoPlayCardPresenter tq = this.q;
       if (tq != null) {
          tq.setVisibility(4);
       }
       this.c9(true);
       return;
    }
    public final boolean a9(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MerchantAutoPlayCardPresenter.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       QLivePlayConfig livePlayConf = (p0 != null)? p0.getLivePlayConfig(): null;
       if (livePlayConf != null) {
          return false;
       }else {
          return true;
       }
    }
    public final void b9(int p0){
       List list;
       MerchantAutoPlayCardPresenter merchantAuto = MerchantAutoPlayCardPresenter.class;
       if (PatchProxy.isSupport(merchantAuto) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, merchantAuto, "22")) {
          return;
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       LiveAudienceParam$a obj = PatchProxy.apply(objArray, this, merchantAuto, "24");
       String str = "MerchantAutoPlayCardPresenter";
       if (obj != patchProxyRe) {
       }else {
          MerchantAutoPlayCardPresenter tG = this.G;
          if (tG != null) {
             list = a.t(tG);
             if (list != null) {
             label_0035 :
                Object[] obj1 = PatchProxy.applyOneRefs(list, this, merchantAuto, "25");
                if (obj1 != patchProxyRe) {
                   obj = obj1;
                }else {
                   ArrayList uArrayList = new ArrayList();
                   Iterator iterator = list.iterator();
                   while (iterator.hasNext()) {
                      obj1 = iterator.next().getTkModelFiledObj();
                      if (!obj1 instanceof QPhoto) {
                         obj1 = objArray;
                      }
                      if (obj1 != null) {
                         if (obj1.isLiveStream() && !this.a9(obj1)) {
                            uArrayList.add(obj1);
                         }else {
                            a.g(a.b, str, "qphoto:"+obj1+", liveplayConfig: "+this.a9(obj1));
                         }
                      }
                   }
                   obj = uArrayList;
                }
             }
          }
          list = Collections.emptyList();
          goto label_0035 ;
       }
       MerchantAutoPlayCardPresenter tv = this.v;
       if (tv == null) {
          a.g(MerchantAutoPlayCardPresenter$a.b, str, "qphoto is null");
          return;
       }else if(this.a9(tv)){
          a.g(MerchantAutoPlayCardPresenter$b.b, str, "livePlay config is null");
          return;
       }else {
          Activity activity = this.getActivity();
          Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
          View view = this.m8();
          MerchantAutoPlayCardPresenter tv1 = this.v;
          a.m(tv1);
          String str1 = String.valueOf(obj.size());
          if (PatchProxy.isSupport(merchantAuto)) {
             Object[] objArray1 = new Object[]{activity,view,tv1,str1,obj,Integer.valueOf(p0)};
             if (PatchProxy.applyVoid(objArray1, this, merchantAuto, "28")) {
             label_0146 :
                return;
             }
          }
          String str2 = h.a.a(new a(obj, str1));
          obj = new LiveAudienceParam$a();
          obj.i(tv1.getLiveStreamId());
          LivePassThruParamExtraInfo livePassThru = LivePassThruParamExtraInfo.extraFromSourceUrl(this.y);
          LiveSlidePlayEnterParam$b uob = new LiveSlidePlayEnterParam$b();
          uob.o(p0);
          uob.C(tv1);
          if (livePassThru != null) {
             uob.h(livePassThru);
          }
          uob.d(1);
          uob.F(str2);
          uob.m(obj.a());
          uob.j(activity.R2(view));
          d.a(-1835681758).b1(activity, uob.a());
          goto label_0146 ;
       }
    }
    public final void c9(boolean p0){
       MerchantAutoPlayCardPresenter merchantAuto = MerchantAutoPlayCardPresenter.class;
       if (PatchProxy.isSupport(merchantAuto) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, merchantAuto, "18")) {
          return;
       }
       merchantAuto = this.H;
       if (merchantAuto != null) {
          Object obj = merchantAuto.get();
          if (obj != null && (obj instanceof V8Function && y.a(obj))) {
             try{
                Object[] objArray = new Object[]{Boolean.valueOf(p0)};
                obj.call(null, objArray);
             }catch(java.lang.Exception e5){
                a.l(MerchantAutoPlayCardPresenter$c.b, "MerchantAutoPlayCardPresenter", "native call js failed", e5);
             }
          }
       }
    }
    public final void d9(){
       if (PatchProxy.applyVoid(null, this, MerchantAutoPlayCardPresenter.class, "17")) {
          return;
       }
       this.F.onNext(Boolean.FALSE);
       MerchantAutoPlayCardPresenter tq = this.q;
       if (tq != null) {
          tq.setVisibility(0);
       }
       this.c9(0);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantAutoPlayCardPresenter.class, "5")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a2666);
       this.q = m1.f(p0, 0x7f0a300b);
       this.r = m1.f(p0, 0x7f0a30e1);
       this.s = m1.f(p0, 0x7f0a1a68);
       return;
    }
    public final void e9(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantAutoPlayCardPresenter.class, "16")) {
          return;
       }
       MerchantAutoPlayCardPresenter tA = this.A;
       if (tA == null) {
          a.S("autoPlayManager");
       }
       MerchantAutoPlayCardPresenter tr = this.r;
       if (tr == null) {
          a.S("playView");
       }
       tA.v(p0, tr);
       this.d9();
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MerchantAutoPlayCardPresenter.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new i();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, MerchantAutoPlayCardPresenter.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(MerchantAutoPlayCardPresenter.class, new i());
       }else {
          obj.put(MerchantAutoPlayCardPresenter.class, null);
       }
       return obj;
    }
    public void j8(){
       Object[] objArray1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MerchantAutoPlayCardPresenter.class, "6")) {
          return;
       }
       this.t = this.r8("FEED_FRAGMENT");
       b uob = this.s8(b.class);
       this.u = uob;
       uob = (uob != null)? uob.c: objArray;
       if (!uob instanceof LiveFeed) {
          objArray1 = objArray;
       }
       String str = "fragment";
       if (objArray1 != null) {
          MerchantAutoPlayCardPresenter tt = this.t;
          if (tt == null) {
             a.S(str);
          }
          objArray = objArray1.getAutoPlayModule(tt);
       }
       this.z = objArray;
       this.v = this.t8("MERCHANT_AUTO_PLAY_QPHOTO");
       this.w = this.t8("MERCHANT_HOME_VIEW_POSITION");
       this.x = this.t8("MERCHANT_HOME_QPHOTO_LLSID");
       this.y = this.t8("MERCHANT_HOME_QPHOTO_JUMP_URL");
       this.A = this.r8("MERCHANT_AUTO_PLAY_MANAGER");
       this.I = this.t8("MERCHANT_HOME_FEED_STYLE");
       if (this.z == null) {
          MerchantAutoPlayCardPresenter tv = this.v;
          if (tv != null) {
             a.m(tv);
             QPhoto mEntity = tv.mEntity;
             MerchantAutoPlayCardPresenter tt1 = this.t;
             if (tt1 == null) {
                a.S(str);
             }
             e$a uoa = new e$a(mEntity, tt1, 23, ":ks-features:ft-merchant:merchant-home:home2");
             uoa.i(0);
             uoa.d(true);
             uoa.e(true);
             uoa.c("MERCHANT_BUYER_INDEX");
             uoa.j(true);
             uoa.l(d.a(-1397441499).l2());
             e uoe = uoa.b();
             this.z = new LiveAutoPlayModule(uoe);
             this.G = this.t8("MERCHANT_HOME_RECYCLER_VIEW");
          }
       }
       return;
    }
}
