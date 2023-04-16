package com.yxcorp.gifshow.detail.slidev2.presenter.feature.NasaProfileSideLikePresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.NasaProfileSideLikePresenter$a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.NasaProfileSideLikePresenter$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import android.view.View;
import m9a.k;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.n;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import e8a.a0;
import erd.g;
import crd.b;
import eda.l;
import e8a.b0;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.yxcorp.gifshow.entity.QPhoto;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import e8a.c0;
import io.reactivex.internal.functions.Functions;
import com.yxcorp.gifshow.util.cdnresource.CdnResource$ResourceKey;
import android.graphics.drawable.Drawable;
import lnc.a1;
import com.yxcorp.gifshow.util.cdnresource.f;
import java.lang.Boolean;
import e8a.w;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import w4.j;
import com.yxcorp.gifshow.util.cdnresource.e;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Integer;
import tkd.b;
import tkd.d;
import ou5.b;
import e8a.z;
import android.content.Context;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import n3d.d;
import com.kwai.framework.model.user.QCurrentUser;
import uf5.b$a;
import o56.a;
import android.app.Application;
import gx5.d;
import lnc.i3;
import p1a.a$a;
import e8a.x;
import tl8.g;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import p1a.a;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import uf5.x;
import java.lang.StringBuilder;
import de5.a;
import p5a.e;
import com.kwai.framework.player.core.b;
import com.kuaishou.android.model.music.Music;
import java.lang.Long;
import java.lang.Number;
import android.content.Intent;
import e8a.y;
import uw9.o;
import q87.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class NasaProfileSideLikePresenter extends PresenterV2	// class@00191c
{
    public a A;
    public a B;
    public final a C;
    public final DefaultLifecycleObserver D;
    public View p;
    public View q;
    public LottieAnimationView r;
    public TextView s;
    public PhotoDetailParam t;
    public QPhoto u;
    public BaseFragment v;
    public SlidePlayViewModel w;
    public a x;
    public boolean y;
    public AnimatorSet z;

    public void NasaProfileSideLikePresenter(){
       super();
       this.C = new NasaProfileSideLikePresenter$a(this);
       this.D = new NasaProfileSideLikePresenter$2(this);
    }
    public void E8(){
       NasaProfileSideLikePresenter nasaProfileS = NasaProfileSideLikePresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, nasaProfileS, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, nasaProfileS, "2") && this.p == null) {
          View view = k.a(this.getActivity(), this.v, R.id.slide_global_edit_layout);
          View view1 = view.findViewById(R.id.profile_side_like_button);
          this.p = view1;
          view1.setVisibility(0);
          this.s = view.findViewById(0x7f0a32c3);
          this.q = view.findViewById(0x7f0a32c4);
          this.r = view.findViewById(0x7f0a32c1);
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.v.getParentFragment());
       this.w = slidePlayVie;
       slidePlayVie.P(this.v, this.C);
       this.v.getLifecycle().addObserver(this.D);
       RxBus f = RxBus.f;
       RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
       this.X7(f.g(n.class, mAIN).subscribe(new a0(this)));
       this.X7(f.g(l.class, mAIN).subscribe(new b0(this)));
       this.X7(this.u.getPhotoMeta().observable().subscribe(new c0(this), Functions.e));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, NasaProfileSideLikePresenter.class, "4")) {
          return;
       }
       this.v.getLifecycle().removeObserver(this.D);
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, NasaProfileSideLikePresenter.class, "18")) {
          return;
       }
       if (this.y == null) {
          return;
       }
       this.q.setBackground(f.h(this.u.getLikeActivityResourceId(), CdnResource$ResourceKey.normal_detail_like_image, CdnResource$ResourceKey.normal_detail_unlike_image, a1.f(R.drawable.arg_RES_7f0819b5)));
       return;
    }
    public final void R8(boolean p0){
       NasaProfileSideLikePresenter nasaProfileS = NasaProfileSideLikePresenter.class;
       if (PatchProxy.isSupport(nasaProfileS) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, nasaProfileS, "11")) {
          return;
       }
       w ow = new w(this, p0);
       String likeActivity = this.u.getLikeActivityResourceId();
       if (PatchProxy.isSupport(nasaProfileS) && PatchProxy.applyThreeRefs(Boolean.valueOf(p0), ow, likeActivity, this, NasaProfileSideLikePresenter.class, "12") != PatchProxyResult.class) {
       }else {
          CdnResource$ResourceKey detail_nav_l = CdnResource$ResourceKey.detail_nav_like;
          CdnResource$ResourceKey detail_nav_u = CdnResource$ResourceKey.detail_nav_unlike_b;
          int i = 0x7f0f0012;
          if (TextUtils.x(likeActivity)) {
             likeActivity = "ACTIVITY_RESOURCE";
          }
          if (!p0) {
             detail_nav_l = detail_nav_u;
          }
          if (p0) {
             i = 0x7f0f0013;
          }
          e.a(likeActivity, detail_nav_l, i, ow);
       }
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, NasaProfileSideLikePresenter.class, "15")) {
          return;
       }
       this.r.f();
       this.r.t();
       return;
    }
    public final void V8(GifshowActivity p0,String p1,int p2){
       if (PatchProxy.isSupport(NasaProfileSideLikePresenter.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, NasaProfileSideLikePresenter.class, "17")) {
          return;
       }
       d.a(-1712118428).ne(p0, this.u.getFullSource(), "photo_like", p2, p1, this.u.mEntity, null, null, new z(this)).h();
       return;
    }
    public void W8(){
       NasaProfileSideLikePresenter nasaProfileS = NasaProfileSideLikePresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, nasaProfileS, "6")) {
          return;
       }
       String str = "";
       if (!QCurrentUser.ME.isLogined() && !b$a.a()) {
          if (!PatchProxy.applyVoid(objArray, this, nasaProfileS, "16")) {
             GifshowActivity activity = this.getActivity();
             String str1 = a.B.getString(R.string.arg_RES_7f103079);
             if (!TextUtils.x(activity.U2()) && d.a(-1188553266).VA(activity.U2(), str)) {
                this.V8(activity, str1, 27);
             }else {
                this.V8(activity, str1, 18);
             }
          }
          return;
       }else {
          String str2 = "SLIDE_BAR";
          boolean b = false;
          if (this.u.isLiked()) {
             this.X8();
             if (!PatchProxy.applyVoid(objArray, this, nasaProfileS, "9")) {
                this.P8();
                this.R8(b);
             }
             if (QCurrentUser.ME.isLogined()) {
                NasaProfileSideLikePresenter tu = this.u;
                if (!PatchProxy.applyVoidOneRefs(tu, this, nasaProfileS, "21")) {
                   i3 oi3 = i3.f();
                   oi3.d("show_pos", str2);
                   a$a uoa = a$a.a(1, str);
                   uoa.r(1);
                   uoa.h(new x(tu));
                   uoa.f("DISLIKE_PHOTO");
                   uoa.m(oi3.e());
                   uoa.j(tu.getFeedLogCtx());
                   this.A.a(uoa);
                }
             }
          }else if(PatchProxy.isSupport(nasaProfileS) && PatchProxy.applyVoidOneRefs(Boolean.FALSE, this, nasaProfileS, "8")){
             Activity uActivity = this.getActivity();
             Object[] objArray1 = new Object[2];
             String str3 = "_";
             str = (this.t.getDetailCommonParam().getPreUserId() == null)? str3: this.t.getDetailCommonParam().getPreUserId();
             objArray1[b] = str;
             if (this.t.getDetailCommonParam().getPrePhotoId() != null) {
                str3 = this.t.getDetailCommonParam().getPrePhotoId();
             }
             objArray1[1] = str3;
             new x(this.u, uActivity.getUrl()+"#like", this.t.getDetailCommonParam().getPreExpTag(), String.format("%s/%s", objArray1)).b(uActivity, false, this.x.c(), this.x.getPlayer().getCurrentPosition());
          }
          if (!PatchProxy.applyVoid(objArray, this, nasaProfileS, "10")) {
             this.P8();
             this.R8(1);
          }
          if (!PatchProxy.isSupport(nasaProfileS) || (!PatchProxy.applyVoidOneRefs(Boolean.FALSE, this, nasaProfileS, "22") && b$a.c())) {
             a$a uoa1 = new a$a(1, 306, "like_photo");
             uoa1.r(1);
             i3 oi31 = i3.f();
             oi31.d("show_pos", str2);
             if (this.u.getVideoDuration() > 0 || this.u.getMusic() != null) {
                oi31.c("like_photo_duration", Long.valueOf(this.B.getPlayer().getCurrentPosition()));
             }
             uoa1.m(oi31.e());
             uoa1.j(this.u.getFeedLogCtx());
             uoa1.r(1);
             this.A.a(uoa1);
          }
       label_01cb :
          this.Y8();
          return;
       }
    }
    public final void X8(){
       if (PatchProxy.applyVoid(null, this, NasaProfileSideLikePresenter.class, "7")) {
          return;
       }
       Activity uActivity = this.getActivity();
       new x(this.u, uActivity.getUrl()+"#unlike", uActivity.getIntent().getStringExtra("arg_photo_exp_tag")).i(uActivity, new y(this), this.x.c(), this.x.getPlayer().getCurrentPosition());
       return;
    }
    public void Y8(){
       if (PatchProxy.applyVoid(null, this, NasaProfileSideLikePresenter.class, "19")) {
          return;
       }
       if (this.y == null) {
          return;
       }
       Object[] objArray = new Object[0];
       o.C().w("NasaProfileSideLikePresenter", "updateLikeStatus: photo "+this.u.getPhotoId()+", like "+this.u.isLiked()+", number "+this.u.numberOfLike(), objArray);
       this.p.setSelected(this.u.isLiked());
       this.s.setText(TextUtils.N((long)this.u.numberOfLike()));
       return;
    }
    public void j8(){
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, this, NasaProfileSideLikePresenter.class, "1")) {
          return;
       }
       this.u = this.q8(QPhoto.class);
       this.v = this.r8("DETAIL_FRAGMENT");
       this.t = this.q8(PhotoDetailParam.class);
       this.x = this.q8(uoa);
       this.A = this.r8("LOG_LISTENER");
       this.B = this.q8(uoa);
       return;
    }
}
