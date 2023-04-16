package com.kuaishou.live.preview.item.fragment.LivePreviewFragment;
import com.kuaishou.live.preview.item.base.LiveGrootPreviewBaseFragment;
import uk3.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import uk3.a;
import java.lang.IllegalArgumentException;
import uk3.a$b;
import tkd.b;
import tkd.d;
import hv5.c;
import com.kwai.framework.model.user.QCurrentUser;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ul3.a;
import dl3.x;
import com.kuaishou.live.preview.item.lifecycle.LivePreviewLifecyclePresenter;
import xk3.g;
import com.kuaishou.live.preview.item.presenter.g;
import com.yxcorp.gifshow.entity.QPhoto;
import ll3.k;
import com.kuaishou.live.preview.item.presenter.c;
import le5.f;
import com.kwai.component.photo.detail.slide.groot.DetailSlidePlayFragment;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kuaishou.live.preview.item.presenter.LivePreviewAutoPlayPresenter;
import bl3.i;
import com.kuaishou.live.preview.item.presenter.j0;
import com.kuaishou.live.preview.item.presenter.g0;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import ll3.j;
import java.lang.Boolean;
import ll3.b;
import ll3.c;
import ll3.g;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import com.kuaishou.live.preview.item.presenter.k;
import com.kuaishou.live.preview.item.presenter.u;
import com.kuaishou.live.preview.item.presenter.c0;
import gl3.a;
import rk3.h;
import com.kuaishou.live.preview.item.presenter.y;
import nl9.r;
import u53.b;
import com.kuaishou.android.live.model.QLivePlayConfig;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import com.kuaishou.android.live.model.LiveStreamModel;
import com.kuaishou.android.live.model.LiveSimpleSkinConfig;
import yb7.a;
import com.kuaishou.live.preview.item.presenter.n;
import iz1.a;
import com.kuaishou.live.preview.item.winter.a;
import tk3.k;
import tk3.c;
import ek3.c;
import vk3.f;
import dl3.k;
import hv5.a;
import com.kuaishou.live.preview.item.feedback.b;
import com.kwai.framework.abtest.f;
import sk3.i;
import com.kuaishou.live.preview.item.feedback.a;
import com.kuaishou.live.preview.item.feedback.c;
import dl3.f0;
import yk3.j;
import yk3.f;
import yk3.r;
import yk3.y;
import vt5.c;
import dl3.h0;
import a43.n;
import dl3.s0;
import dl3.i;
import com.kuaishou.live.preview.item.voiceparty.LivePreviewVoicePartyPresenter;
import yt5.g;
import al3.d;
import xf6.f;
import qk3.c;
import com.kuaishou.live.preview.item.presenter.a0;
import u51.a;
import rkd.b;
import tl3.a;
import com.kwai.sdk.switchconfig.a;
import sl3.d;
import kl3.a;
import com.kuaishou.live.preview.item.useraction.LivePreviewRecoEnterActionPresenter;
import com.kwai.framework.model.feed.BaseFeed;
import yp.x;
import java.lang.Number;
import d61.a0;
import vo5.q;
import com.kwai.library.groot.slide.fragment.GrootBaseFragment;
import java.util.Objects;
import java.lang.StringBuilder;
import mv5.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import dz1.a;
import android.view.View;
import android.os.Bundle;
import uk3.c;
import uw9.v3;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import yk3.i;
import hf3.a;
import hf3.e;
import hf3.b;
import ck3.b;
import rj3.c;
import java.util.Map;
import com.kwai.feature.api.feed.detail.router.DetailLogParam;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import xk3.b;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.kwai.library.slide.base.exp.SlidePerformanceExp;
import com.kuaishou.ax2c.AX2C;
import android.content.Context;

public class LivePreviewFragment extends LiveGrootPreviewBaseFragment	// class@000de7
{
    public final int O;
    public final a P;

    public void LivePreviewFragment(int p0){
       a uoa;
       boolean b;
       a$b uob1;
       a$b uob2;
       a$b uob3;
       String str1;
       super();
       this.O = p0;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          uoa = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uob, "1");
          if (uoa != PatchProxyResult.class) {
          }else {
          label_0020 :
             int i = 4;
             int i1 = 1;
             if (p0 != i1) {
                int i2 = 104;
                int i3 = 2;
                if (p0 != i3) {
                   String str = "NEWS_SLIDE";
                   b = false;
                   switch (p0){
                       case 5:
                         uob1 = new a$b(p0, 301, i2, "DETAIL");
                         uob1.b(i);
                         uob1.d(i1);
                         uob1.e(i1);
                         uob1.f(i1);
                         uob1.c(i1);
                         uob1.g(b);
                         uoa = uob1.a();
                         break;
                       case 6:
                         uob2 = new a$b(p0, 190, 99, "FRIENDS");
                         uob2.b(i);
                         uoa = uob2.a();
                         break;
                       case 7:
                         uob2 = new a$b(p0, 281, 101, str);
                         uob2.b(i);
                         uoa = uob2.a();
                         break;
                       case 8:
                         uob3 = new a$b(p0, 197, 100, str);
                         uob3.b(i);
                         uob3.c(i1);
                         uob3.g(b);
                         uoa = uob3.a();
                         break;
                       case 9:
                         i2 = d.a(0x4999d7cf).bs();
                         if (i2 >= 0) {
                            i3 = i2;
                         }
                         uob3 = new a$b(p0, 278, 102, "FOLLOW");
                         uob3.b(i);
                         uob3.d(i1);
                         uob3.e(i1);
                         uob3.f(i1);
                         uob3.k = i3;
                         uoa = uob3.a();
                         break;
                       case 10:
                         uob3 = new a$b(p0, 324, 120, "POPULAR_PAGE");
                         uob3.b(i);
                         uob3.f(i1);
                         uob3.d(i1);
                         uoa = uob3.a();
                         break;
                       case 11:
                         uob3 = new a$b(p0, 337, 125, "FEATURED_DETAIL");
                         uob3.b(i);
                         uob3.f(i1);
                         uob3.d(i1);
                         uob3.e(i1);
                         uoa = uob3.a();
                         break;
                       default:
                         throw new IllegalArgumentException("请输入合法的scene");
                   }
                }else if(QCurrentUser.ME.isLogined()){
                   str1 = "THANOS_FIND";
                }else {
                   str1 = "THANOS_HOT";
                }
                uob1 = new a$b(p0, i2, 52, str1);
                uob1.b(i);
                uob1.f(i1);
                uob1.d(i1);
                uob1.e(i1);
                uoa = uob1.a();
             }else {
                uob3 = new a$b(p0, 130, 54, "FEATURED_PAGE");
                uob3.b(i);
                uob3.f(i1);
                uob3.d(i1);
                uob3.e(i1);
                uoa = uob3.a();
             }
          }
       }else {
          goto label_0020 ;
       }
       this.P = uoa;
       return;
    }
    public PresenterV2 B2(){
       boolean b2;
       a uoa = a.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, LivePreviewFragment.class, "9");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new x());
       obj.U7(new LivePreviewLifecyclePresenter());
       boolean b = true;
       obj.U7(new g(b));
       obj.U7(new g());
       if (k.c(this.F)) {
          obj.U7(new c());
       }
       if (f.g() || f.m(this.x)) {
          obj.U7(new LivePreviewAutoPlayPresenter());
       }
       obj.U7(new i());
       obj.U7(new j0());
       obj.U7(new g0());
       QPhoto mEntity = this.F.mEntity;
       Object obj1 = PatchProxy.applyOneRefs(mEntity, null, j.class, "2");
       boolean b1 = (obj1 != patchProxyRe)? obj1.booleanValue(): k0.c(mEntity, b.a, c.a, g.a).or(Boolean.FALSE).booleanValue() ^ b;
       if (b1) {
          obj.U7(new k());
       }
       obj.U7(new u());
       obj.U7(new c0());
       obj.U7(new a());
       obj.U7(new h());
       obj.U7(new y());
       r or = d.a(0x691527a8);
       obj.U7(or.GP(10));
       obj.U7(or.GP(11));
       if (this.P.g != null) {
          LiveStreamFeed mConfig = this.F.mEntity.mConfig;
          Object obj2 = PatchProxy.applyOneRefs(mConfig, null, b.class, "7");
          if (obj2 != patchProxyRe) {
             b1 = obj2.booleanValue();
          }else if(mConfig != null && (mConfig.isGamePatternType() && mConfig.isLandscape())){
             b1 = true;
          }else {
             b1 = false;
          }
          if (b1) {
             LiveGrootPreviewBaseFragment tJ = this.J;
             obj2 = PatchProxy.applyOneRefs(tJ, null, uoa, "3");
             if (obj2 != patchProxyRe) {
                b1 = obj2.booleanValue();
             }else {
                LiveAudienceParam mPhoto = tJ.mPhoto;
                if (mPhoto != null) {
                   LiveStreamModel mLiveSimpleS = mPhoto.mLiveStreamModel.mLiveSimpleSkinConfig;
                   if (mLiveSimpleS != null && !a.c(mLiveSimpleS.mBelowPlayerBackgroundImgUrls)) {
                      b1 = true;
                   }
                }
                b1 = false;
             }
             if (!b1) {
                obj.U7(new n());
             }
          }
       }
    label_0156 :
       if (a.d(this.F)) {
          obj.U7(new a());
       }else {
          obj.U7(new k());
       }
       obj.U7(new c());
       if (j.a(this.F.mEntity)) {
          obj.U7(new c());
       }
       obj.U7(new f());
       if (this.P.d()) {
          obj.U7(new k());
       }
       LivePreviewFragment tO = this.O;
       if (tO == 9 || tO == 5) {
          obj.U7(d.a(0x6c2883df).lk());
          obj.U7(d.a(0x6c2883df).aE());
       }
       obj.U7(new b());
       Object obj3 = PatchProxy.apply(null, null, uoa, "4");
       if (obj3 != patchProxyRe) {
          b2 = obj3.booleanValue();
       }else if(f.a("simpleLiveRoomNegativeType") && f.a("simpleLiveRoomNegativeType_V2")){
          b = 0;
       }
       b2 = b;
       if (b2) {
          obj.U7(new i());
       }else {
          obj.U7(new a());
       }
       obj.U7(new c());
       obj.U7(new f0());
       if (j.b(this.F)) {
          obj.U7(new f());
          obj.U7(new r());
          obj.U7(new y());
       }
       obj.U7(d.a(0x2e5315fc).ve());
       obj.U7(new h0());
       if (n.b()) {
          obj.U7(new s0());
       }
       obj.U7(new i());
       if (LivePreviewVoicePartyPresenter.X8()) {
          obj.U7(new LivePreviewVoicePartyPresenter());
       }
       d.a(-626371061).Et(obj);
       obj.U7(new d());
       if (f.h()) {
          obj.U7(new c());
       }
       obj.U7(new a0(this.F));
       obj.U7(new a());
       if (b.g()) {
          obj.U7(new a());
       }
       if (a.t().d("enable_merchant_preview_atmosphere", false)) {
          obj.U7(new d());
       }
       obj.U7(new a());
       obj.U7(new LivePreviewRecoEnterActionPresenter());
       PatchProxy.onMethodExit(LivePreviewFragment.class, "9");
       return obj;
    }
    public void Ch(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LivePreviewFragment.class, "5")) {
          return;
       }
       LivePreviewFragment tO = this.O;
       if (tO == 7 || tO == 8) {
          x.A(this.F.mEntity, true);
       }
       DetailSlidePlayFragment tx = this.x;
       Object obj = PatchProxy.apply(objArray, this, LivePreviewFragment.class, "10");
       int i = (obj != patchProxyRe)? obj.intValue(): this.P.d;
       tx.setBizType(i);
       LiveGrootPreviewBaseFragment tJ = this.J;
       Object obj1 = PatchProxy.apply(objArray, this, LivePreviewFragment.class, "11");
       int i1 = (obj1 != patchProxyRe)? obj1.intValue(): this.P.c();
       tJ.mLiveStreamStartPlaySourceForEnterPrompt = i1;
       x.y(a0.c(this.P.b()), this.F.mEntity);
       return;
    }
    public int M(){
       return 5;
    }
    public int f(){
       return 8;
    }
    public int getLayoutResId(){
       return 0x7f0d0d3e;
    }
    public String getPageParams(){
       StringBuilder str2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.apply(null, this, LivePreviewFragment.class, "8");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = d.a(0x6cf1532f).I6(this.x, this.ih());
       LivePreviewFragment tP = this.P;
       Objects.requireNonNull(tP);
       String str = PatchProxy.applyOneRefs(obj, tP, a.class, "1");
       if (str != patchProxyRe) {
       }else {
          a e = tP.e;
          if (e == 9) {
             str = obj+d.a(0x6c2883df).wL();
          }else if(e == 6){
             obj = obj+d.a(0x3ee97dc2).v40();
          }
          str = obj;
       }
       LiveGrootPreviewBaseFragment tF = this.F;
       if (tF == null) {
          return str;
       }else {
          String str1 = x.g(tF.mEntity);
          boolean b = b.f(this.F.mEntity.mConfig);
          if (TextUtils.x(str1)) {
             return str+"&is_game_live="+b;
          }else if(TextUtils.x(str)){
             str2 = "lv_params="+str1+"&is_game_live="+b;
             if (a.d(this.F)) {
                str2 = str2+"&ks_order_id="+this.F.getKsOrderId();
             }
             return str2;
          }else {
             str2 = str+"&lv_params="+str1+"&is_game_live="+b;
             str1 = a.f(this.F);
             if (!TextUtils.x(str1)) {
                str2 = str2+"&gzone_live_type="+str1;
             }
             if (a.d(this.F)) {
                str2 = str2+"&ks_order_id="+this.F.getKsOrderId();
             }
             return str2;
          }
       }
    }
    public String getUrl(){
       return "ks://photo";
    }
    public String o(){
       Object obj = PatchProxy.apply(null, this, LivePreviewFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.P.b;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LivePreviewFragment.class, "1")) {
          return;
       }
       super.onViewCreated(p0, p1);
       return;
    }
    public Object xh(){
       e uoe;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c obj = PatchProxy.apply(null, this, LivePreviewFragment.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new c();
       obj.b = this;
       obj.c = this.hh();
       obj.i = this.J;
       DetailSlidePlayFragment ty = this.y;
       if (ty != null) {
          obj.d = ty.M0();
       }
       if (j.b(this.F)) {
          i oi = new i();
          obj.k = oi;
          LiveGrootPreviewBaseFragment tF = this.F;
          LiveAudienceParam mLiveStreamS = this.J.mLiveStreamStartPlaySourceForEnterPrompt;
          if (PatchProxy.isSupport(j.class)) {
             uoe = PatchProxy.applyThreeRefs(oi, tF, Integer.valueOf(mLiveStreamS), null, j.class, "1");
             if (uoe != patchProxyRe) {
             label_0063 :
                obj.j = uoe;
             }
          }
          uoe = new e(j.a(oi, tF, mLiveStreamS));
          goto label_0063 ;
       }
       obj.h = this.K;
       return obj;
    }
    public b yh(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, LivePreviewFragment.class, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       QPhoto mEntity = this.F.mEntity;
       String str = c.a(mEntity);
       LiveGrootPreviewBaseFragment tM = this.M;
       Object obj1 = PatchProxy.apply(objArray, this, LivePreviewFragment.class, "12");
       if (obj1 != patchProxyRe) {
          objArray = obj1;
       }else {
          DetailSlidePlayFragment tx = this.x;
          if (tx != null && tx.getDetailLogParam() != null) {
             objArray = this.x.getDetailLogParam().getPageUrlParamMap();
          }
       }
       Object[] objArray1 = objArray;
       b uob = new b(mEntity, this, str, tM, objArray1, this.O, this.P);
       return obj;
    }
    public View zh(LayoutInflater p0,ViewGroup p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LivePreviewFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (SlidePerformanceExp.g()) {
          return new AX2C(p0.getContext()).inflateSync(this.getLayoutResId(), p1, false);
       }
       return super.zh(p0, p1);
    }
}
