package com.yxcorp.gifshow.ad.detail.vm.rightactionbar.like.AdLikeElement;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import hs7.d;
import rp7.a;
import jh5.a;
import qp7.a;
import w19.d;
import rq7.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.slide.play.detail.rightactionbar.like.b;
import java.lang.Boolean;
import lnc.u1;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.like.AdLikeElement$1;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.n;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import i29.i;
import erd.g;
import crd.b;
import eda.l;
import i29.h;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.yxcorp.gifshow.entity.QPhoto;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import i29.g;
import io.reactivex.internal.functions.Functions;
import qp7.b;
import qs7.j;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.like.a;
import i29.f;
import i29.d;
import qp7.t0;
import w19.e;
import i29.e;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.like.AdLikeElement$a;
import qp7.b1;
import qp7.x0;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import lnc.b9;
import java.util.Objects;
import i29.a;
import sf5.e;
import w4.j;
import mvb.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Math;
import com.smile.gifmaker.mvps.utils.DefaultSyncable;
import qp7.d;
import com.kwai.slide.play.detail.rightactionbar.like.a;
import qp7.c;
import uf5.x;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.Intent;
import android.app.Activity;
import i29.c;
import de5.a;
import p5a.e;
import com.kwai.framework.player.core.b;
import n3d.a;

public class AdLikeElement extends DispatchBaseElement	// class@001725
{
    public a A;
    public b B;
    public b C;
    public GifshowActivity t;
    public QPhoto u;
    public PhotoDetailParam v;
    public a w;
    public String x;
    public LikeAnimationEnum y;
    public BaseFragment z;

    public void AdLikeElement(){
       super(d.f, null);
    }
    public void P(a p0){
       this.t = p0.a;
       this.u = p0.j;
       this.v = p0.c;
       this.w = p0.h;
       this.z = p0.b;
       this.A = p0.f;
    }
    public a f0(a p0){
       b uob = PatchProxy.applyOneRefs(p0, this, AdLikeElement.class, "15");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = new b(p0);
       }
       return uob;
    }
    public void j0(boolean p0){
       AdLikeElement uAdLikeEleme = AdLikeElement.class;
       if (PatchProxy.isSupport(uAdLikeEleme) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAdLikeEleme, "1")) {
          return;
       }
       u1.a(this);
       AdLikeElement tz = this.z;
       if (tz != null) {
          tz.getLifecycle().addObserver(new AdLikeElement$1(this));
       }
       RxBus f = RxBus.f;
       RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
       this.B = f.g(n.class, mAIN).subscribe(new i(this));
       this.C = f.g(l.class, mAIN).subscribe(new h(this));
       g e = Functions.e;
       this.j(this.u.getPhotoMeta().observable().subscribe(new g(this), e));
       this.j(this.i.e(new a(this), e));
       this.j(this.i.d(new f(this), e));
       this.j(this.i.c(new d(this), e));
       this.j(this.H().M.subscribe(new e(this), e));
       this.i(new AdLikeElement$a(this));
       this.E().k(this.u.numberOfLike(), r1.g1(this.u.mEntity, R.string.arg_RES_7f101cb7, "like_new"), this.u.isMine());
       this.n0();
       this.E().i(this.u.isLiked());
       return;
    }
    public void m0(boolean p0){
       if (PatchProxy.isSupport(AdLikeElement.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, AdLikeElement.class, "11")) {
          return;
       }
       u1.b(this);
       b9.a(this.B);
       b9.a(this.C);
       return;
    }
    public final void n0(){
       if (PatchProxy.applyVoid(null, this, AdLikeElement.class, "5")) {
          return;
       }
       b uob = this.E();
       Objects.requireNonNull(uob);
       if (!PatchProxy.applyVoid(null, uob, b.class, "7")) {
          uob.g(null, null);
       }
       return;
    }
    public final String o0(boolean p0){
       a obj;
       String str;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AdLikeElement uAdLikeEleme = AdLikeElement.class;
       if (PatchProxy.isSupport(uAdLikeEleme)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uAdLikeEleme, "6");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = new a(this, p0);
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          str = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), obj, null, uoe, "1");
          if (str != patchProxyRe) {
          label_003c :
             return str;
          }
       }
       str = e.a(p0, obj, "ACTIVITY_RESOURCE", null);
       goto label_003c ;
    }
    public void onEventMainThread(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdLikeElement.class, "12")) {
          return;
       }
       if (p0 != null) {
          c a = p0.a;
          if (a != null && TextUtils.n(a.getPhotoId(), this.u.getPhotoId())) {
             AdLikeElement tu = this.u;
             if (tu != p0.a) {
                PhotoMeta photoMeta = tu.getPhotoMeta();
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
             this.E().i(this.u.isLiked());
             this.E().k(this.u.numberOfLike(), r1.g1(this.u.mEntity, R.string.arg_RES_7f101cb7, "like_new"), this.u.isMine());
          }
       }
       return;
    }
    public final void p0(){
       if (PatchProxy.applyVoid(null, this, AdLikeElement.class, "4")) {
          return;
       }
       this.n0();
       this.x = this.o0(true);
       return;
    }
    public d q(){
       a uoa = PatchProxy.apply(null, this, AdLikeElement.class, "17");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new a();
       }
       return uoa;
    }
    public final void q0(){
       if (PatchProxy.applyVoid(null, this, AdLikeElement.class, "3")) {
          return;
       }
       this.n0();
       this.x = this.o0(false);
       return;
    }
    public c r(){
       j oj = PatchProxy.apply(null, this, AdLikeElement.class, "16");
       if (oj != PatchProxyResult.class) {
       }else {
          oj = new j();
       }
       return oj;
    }
    public final void r0(){
       if (PatchProxy.applyVoid(null, this, AdLikeElement.class, "7")) {
          return;
       }
       new x(this.u, this.t.getUrl()+"#unlike", this.t.getIntent().getStringExtra("arg_photo_exp_tag")).i(this.t, new c(this), this.A.c(), this.A.getPlayer().getCurrentPosition());
       return;
    }
}
