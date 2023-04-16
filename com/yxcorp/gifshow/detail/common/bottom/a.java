package com.yxcorp.gifshow.detail.common.bottom.a;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import jh5.a;
import sp7.c;
import rp7.a;
import qp7.a;
import v6a.m0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import le5.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import lnc.i3;
import com.kuaishou.android.model.mix.CommonMeta;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kwai.components.feedmodel.PhotoJudgementStatusInfo;
import java.lang.Integer;
import java.lang.Number;
import k2b.u1;
import rq7.a;
import com.kwai.robust.PatchProxyResult;
import xp7.h;
import java.lang.Boolean;
import java.lang.CharSequence;
import qp7.b;
import qp7.x0;
import java.util.Objects;
import kotlin.jvm.internal.a;
import pp7.b;
import qp7.t0;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import qp7.c;
import xp7.g;
import brd.t;
import ox9.j;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import qp7.d;
import xp7.f;

public class a extends DispatchBaseElement	// class@0013a3
{
    public QPhoto t;
    public Activity u;
    public PhotoJudgementStatusInfo v;
    public BaseFragment w;

    public void a(a p0){
       super(c.c, p0);
    }
    public void P(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a.class, "1")) {
       }else {
          PhotoDetailParam mPhoto = p0.c.mPhoto;
          this.t = mPhoto;
          this.u = p0.a;
          this.w = p0.b;
          this.v = mPhoto.getPhotoMeta().mPhotoJudgementStatusInfo;
          PatchProxy.onMethodExit(a.class, "1");
       }
       return;
    }
    public void S(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "5")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "9") && this.v != null) {
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          QPhoto mEntity = this.t.mEntity;
          if (mEntity != null) {
             uContentPack.photoPackage = w1.f(mEntity);
          }
          ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
          urlPackage.page2 = this.w.o();
          i3 oi3 = i3.f();
          oi3.d("exp_tag", TextUtils.I(this.t.getCommonMeta().mExpTag));
          urlPackage.params = oi3.e();
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "PHOTO_STATUS_BUTTON";
          i3 oi31 = i3.f();
          oi31.c("title_id", Integer.valueOf(this.v.mId));
          oi31.d("link_url", this.v.mActionUrl);
          uElementPack.params = oi31.e();
          u1.y0(urlPackage, 6, uElementPack, uContentPack);
       }
       return;
    }
    public a f0(a p0){
       h oh = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (oh != PatchProxyResult.class) {
       }else {
          oh = new h(p0);
       }
       return oh;
    }
    public void j0(boolean p0){
       boolean b;
       h oh = h.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "6")) {
          return;
       }
       Object[] objArray = null;
       h obj = PatchProxy.apply(objArray, this, uoa, "8");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          uoa = this.v;
          String str = 1;
          if (uoa == null) {
             b = true;
          }else {
             CharSequence[] uCharSequenc = new CharSequence[]{uoa.mActionUrl,uoa.mTitle,uoa.mIconUrl};
             b = TextUtils.y(uCharSequenc);
          }
       }
       if (b) {
          this.b0();
          return;
       }else if(this.v != null){
          obj = this.E();
          a tv = this.v;
          Objects.requireNonNull(obj);
          if (!PatchProxy.applyVoidOneRefs(tv, obj, oh, "1")) {
             a.p(tv, "judgementStatusInfo");
             if (!PatchProxy.applyVoidOneRefs(tv, obj, oh, "2")) {
                if (!TextUtils.x(tv.mPreTitle)) {
                   obj.d.f(tv.mPreTitle);
                }else {
                   obj.d.f("");
                }
             }
             if (!PatchProxy.applyVoidOneRefs(tv, obj, oh, "3")) {
                obj.e.f(tv.mTitle);
             }
             if (!PatchProxy.applyVoidOneRefs(tv, obj, oh, "4")) {
                obj.f.f(tv.mIconUrl);
             }
          }
          if (this.H().h0()) {
             obj = this.E();
             Objects.requireNonNull(obj);
             if (!PatchProxy.applyVoid(objArray, obj, oh, "5")) {
                obj.g.f(Boolean.TRUE);
             }
          }
       }
    label_00cd :
       g og = this.A();
       Objects.requireNonNull(og);
       t ot = PatchProxy.apply(objArray, og, g.class, "2");
       if (ot != patchProxyRe) {
       }else {
          ot = og.a.hide();
       }
       this.j(ot.subscribe(new j(this), Functions.d()));
       return;
    }
    public d q(){
       f uof = PatchProxy.apply(null, this, a.class, "3");
       if (uof != PatchProxyResult.class) {
       }else {
          uof = new f();
       }
       return uof;
    }
    public c r(){
       g og = PatchProxy.apply(null, this, a.class, "4");
       if (og != PatchProxyResult.class) {
       }else {
          og = new g();
       }
       return og;
    }
}
