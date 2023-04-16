package com.yxcorp.gifshow.detail.common.rightactionbar.like.LikeElement;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hs7.d;
import rp7.a;
import jh5.a;
import crd.a;
import qp7.a;
import v6a.m0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import le5.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import rq7.a;
import com.kwai.robust.PatchProxyResult;
import com.kwai.slide.play.detail.rightactionbar.like.b;
import java.lang.Boolean;
import uy6.h;
import uy6.b;
import androidx.lifecycle.Lifecycle;
import com.yxcorp.gifshow.detail.common.rightactionbar.like.LikeElement$1;
import androidx.lifecycle.LifecycleObserver;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.yxcorp.gifshow.entity.QPhoto;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import pz9.n;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import qp7.b;
import pz9.l;
import xx9.a;
import com.yxcorp.gifshow.detail.common.rightactionbar.like.LikeElement$a;
import qp7.b1;
import qp7.x0;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import qp7.t0;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import e8a.d1;
import com.yxcorp.gifshow.detail.common.rightactionbar.like.b;
import java.lang.Runnable;
import ekd.k1;
import lnc.b9;
import pz9.e;
import wkd.b;
import pnc.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.util.cdnresource.f;
import pz9.d;
import mvb.c;
import java.lang.Math;
import com.smile.gifmaker.mvps.utils.DefaultSyncable;
import pz9.a;
import w4.j;
import sf5.e;
import qp7.d;
import com.kwai.slide.play.detail.rightactionbar.like.a;
import qp7.c;
import qs7.j;
import java.lang.Integer;
import tkd.b;
import tkd.d;
import ou5.b;
import pz9.i;
import android.content.Context;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import n3d.d;
import lnc.u1;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.n;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import pz9.c;
import eda.l;
import pz9.b;
import com.yxcorp.gifshow.detail.common.rightactionbar.like.a;
import pz9.m;
import pz9.j;
import pz9.k;
import uf5.x;
import java.lang.StringBuilder;
import android.content.Intent;
import android.app.Activity;
import pz9.h;
import de5.a;
import p5a.e;
import com.kwai.framework.player.core.b;

public class LikeElement extends DispatchBaseElement	// class@0014a4
{
    public BaseFragment A;
    public a B;
    public SlidePlayViewModel C;
    public a D;
    public a E;
    public OppoPreventBurnInHelper F;
    public b G;
    public final GifshowActivity t;
    public a u;
    public QPhoto v;
    public PhotoDetailParam w;
    public a x;
    public String y;
    public LikeAnimationEnum z;

    public void LikeElement(GifshowActivity p0){
       super(d.f, null);
       this.D = new a();
       this.t = p0;
    }
    public void LikeElement(GifshowActivity p0,a p1){
       super(d.f, p1);
       this.D = new a();
       this.t = p0;
    }
    public void P(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, LikeElement.class, "1")) {
       }else {
          m0 j = p0.j;
          this.u = j;
          a c = p0.c;
          this.v = c.mPhoto;
          this.w = c;
          this.x = p0.o;
          c = p0.b;
          this.A = c;
          this.E = p0.r;
          this.B = j;
          this.C = SlidePlayViewModel.S0(c.getParentFragment());
          PatchProxy.onMethodExit(LikeElement.class, "1");
       }
       return;
    }
    public a f0(a p0){
       b uob = PatchProxy.applyOneRefs(p0, this, LikeElement.class, "23");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = new b(p0);
       }
       return uob;
    }
    public void j0(boolean p0){
       LikeElement likeElement = LikeElement.class;
       if (PatchProxy.isSupport(likeElement) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, likeElement, "2")) {
          return;
       }
       if (h.a.i == null) {
          this.t0();
       }
       LikeElement tA = this.A;
       if (tA != null) {
          tA.getLifecycle().addObserver(new LikeElement$1(this));
       }
       this.j(this.v.getPhotoMeta().observable().subscribe(new n(this), Functions.e));
       this.j(this.E.h(new l(this)));
       this.i(new LikeElement$a(this));
       if (!PatchProxy.applyVoid(null, this, likeElement, "3")) {
          this.E().k(this.v.numberOfLike(), r1.g1(this.v.mEntity, R.string.arg_RES_7f101cb7, "like_new"), this.v.isMine());
       }
       this.o0();
       this.E().i(this.v.isLiked());
       if (this.H().b2.c != null) {
          k1.o(new b(this));
       }
       return;
    }
    public void k0(boolean p0){
       if (PatchProxy.isSupport(LikeElement.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LikeElement.class, "26")) {
          return;
       }
       if (h.a.i != null) {
          this.t0();
       }
       return;
    }
    public void l0(boolean p0){
       if (PatchProxy.isSupport(LikeElement.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LikeElement.class, "27")) {
          return;
       }
       if (h.a.i != null) {
          this.v0();
       }
       return;
    }
    public void m0(boolean p0){
       if (PatchProxy.isSupport(LikeElement.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LikeElement.class, "17")) {
          return;
       }
       if (h.a.i == null) {
          this.v0();
       }
       b9.a(this.G);
       k1.o(new e(this));
       return;
    }
    public final void n0(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LikeElement.class, "6")) {
          return;
       }
       this.D.c(p0);
       return;
    }
    public final void o0(){
       LikeElement likeElement = LikeElement.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, likeElement, "10")) {
          return;
       }
       int i = 0x44c00a7;
       b uob = b.a(i);
       String str = PatchProxy.apply(objArray, this, likeElement, "11");
       if (str != PatchProxyResult.class) {
       }else if(TextUtils.x(this.v.getLikeActivityResourceId())){
          str = "ACTIVITY_RESOURCE";
       }else {
          str = this.v.getLikeActivityResourceId();
       }
       this.E().g(str, this.v);
       b9.a(this.G);
       if (!uob.d(str)) {
          if (!str.equals("ACTIVITY_RESOURCE")) {
             f.k();
          }
          this.G = b.a(i).e(str).subscribe(new d(this, str));
       }
       return;
    }
    public void onEventMainThread(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LikeElement.class, "18")) {
          return;
       }
       if (this.v == null) {
          return;
       }
       if (p0 != null) {
          c a = p0.a;
          if (a != null && TextUtils.n(a.getPhotoId(), this.v.getPhotoId())) {
             LikeElement tv = this.v;
             if (tv != p0.a) {
                PhotoMeta photoMeta = tv.getPhotoMeta();
                PhotoMeta photoMeta1 = p0.a.getPhotoMeta();
                if (photoMeta != null && photoMeta1 != null) {
                   PhotoMeta mLiked = photoMeta1.mLiked;
                   if (photoMeta.mLiked != mLiked) {
                      photoMeta.mLiked = mLiked;
                      PhotoMeta mLikeCount = photoMeta1.mLikeCount;
                      if (mLikeCount <= null) {
                         int i = (photoMeta1.mLiked > null)? photoMeta.mLikeCount + 1: Math.max(0, (photoMeta.mLikeCount - 1));
                         photoMeta.mLikeCount = i;
                      }else {
                         photoMeta.mLikeCount = mLikeCount;
                      }
                      photoMeta.fireSync();
                   }
                }
             }
             this.E().i(this.v.isLiked());
             this.E().k(this.v.numberOfLike(), r1.g1(this.v.mEntity, R.string.arg_RES_7f101cb7, "like_new"), this.v.isMine());
          }
       }
       return;
    }
    public final String p0(boolean p0){
       LikeElement likeElement = LikeElement.class;
       if (PatchProxy.isSupport(likeElement)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, likeElement, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return e.a(p0, new a(this, p0), this.v.getLikeActivityResourceId(), this.v);
    }
    public d q(){
       a uoa = PatchProxy.apply(null, this, LikeElement.class, "25");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new a();
       }
       return uoa;
    }
    public final void q0(){
       if (PatchProxy.applyVoid(null, this, LikeElement.class, "9")) {
          return;
       }
       this.o0();
       this.y = this.p0(true);
       return;
    }
    public c r(){
       j oj = PatchProxy.apply(null, this, LikeElement.class, "24");
       if (oj != PatchProxyResult.class) {
       }else {
          oj = new j();
       }
       return oj;
    }
    public final void r0(){
       if (PatchProxy.applyVoid(null, this, LikeElement.class, "8")) {
          return;
       }
       this.o0();
       this.y = this.p0(false);
       return;
    }
    public final void s0(GifshowActivity p0,String p1,int p2){
       if (PatchProxy.isSupport(LikeElement.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, LikeElement.class, "22")) {
          return;
       }
       d.a(-1712118428).ne(p0, this.v.getFullSource(), "photo_like", p2, p1, this.v.mEntity, null, null, new i(this)).h();
       return;
    }
    public final void t0(){
       if (PatchProxy.applyVoid(null, this, LikeElement.class, "4")) {
          return;
       }
       u1.a(this);
       RxBus f = RxBus.f;
       RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
       this.n0(f.g(n.class, mAIN).subscribe(new c(this)));
       this.n0(f.g(l.class, mAIN).subscribe(new b(this)));
       g e = Functions.e;
       this.n0(this.i.e(new a(this), e));
       this.n0(this.i.d(new m(this), e));
       this.n0(this.i.c(new j(this), e));
       this.n0(this.H().x1.subscribe(new k(this), e));
       return;
    }
    public final void u0(){
       if (PatchProxy.applyVoid(null, this, LikeElement.class, "13")) {
          return;
       }
       new x(this.v, this.t.getUrl()+"#unlike", this.t.getIntent().getStringExtra("arg_photo_exp_tag")).i(this.t, new h(this), this.B.c(), this.B.getPlayer().getCurrentPosition());
       return;
    }
    public final void v0(){
       if (PatchProxy.applyVoid(null, this, LikeElement.class, "5")) {
          return;
       }
       u1.b(this);
       this.D.dispose();
       this.D = new a();
       return;
    }
}
