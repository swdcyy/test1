package com.yxcorp.gifshow.relation.explore.presenter.n;
import com.yxcorp.gifshow.relation.feed.presenter.FeedBigCardStatePresenter;
import com.yxcorp.gifshow.permission.ContactPermissionHolder;
import xwb.b;
import xwb.c;
import xwb.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.relation.explore.presenter.n$c;
import erd.g;
import crd.b;
import brd.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.relation.explore.presenter.n$d;
import bac.h;
import y8c.g;
import android.animation.AnimatorSet;
import g9c.a;
import android.widget.TextView;
import qvb.n0;
import com.kwai.framework.model.user.RecoUser;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.pymk.PymkGuideCard;
import com.yxcorp.gifshow.pymk.PymkGuideCardExtraInfo;
import java.lang.CharSequence;
import com.kwai.framework.model.user.UserExtraInfo;
import com.kwai.framework.model.user.RichTextMeta;
import com.kwai.user.base.RichTextMetaExt;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import hcc.j;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import hcc.j$a;
import android.content.Context;
import fac.c;
import com.yxcorp.utility.n;
import java.util.List;
import qvb.a;
import com.kwai.framework.model.user.User$FollowStatus;
import com.yxcorp.gifshow.relation.explore.presenter.n$a;
import java.lang.Runnable;
import android.view.ViewGroup;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import hac.w0;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.relation.explore.presenter.n$b;
import java.util.Collection;
import ekd.q;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import io.reactivex.subjects.PublishSubject;
import java.lang.Integer;
import com.yxcorp.gifshow.relation.explore.view.StackLayoutManager;
import android.content.res.Resources;
import eg.a;
import com.yxcorp.gifshow.pymk.f;
import gac.b;
import gbc.b;
import f7c.c;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import hac.x0;
import hcc.b;
import android.widget.ImageView;
import android.animation.ObjectAnimator;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import android.view.animation.LinearInterpolator;
import android.animation.Animator;
import com.yxcorp.gifshow.relation.explore.presenter.o;
import android.animation.Animator$AnimatorListener;
import ija.t;
import ok.h;
import com.google.common.collect.Lists;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import tkd.b;
import tkd.d;
import gx5.d;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import qvb.i;
import androidx.fragment.app.Fragment;
import d6a.f;
import com.yxcorp.gifshow.detail.slideplay.SlideMediaType;
import d6a.i;
import d6a.j;
import com.yxcorp.gifshow.detail.slideplay.b;
import vm5.e;
import f7c.d;
import a7c.h;
import com.kwai.framework.model.feed.BaseFeed;
import ki5.b;
import zf6.j;

public class n extends FeedBigCardStatePresenter	// class@00185b
{
    public RecyclerView V0;
    public TextView W0;
    public TextView X0;
    public TextView Y0;
    public g Z0;
    public PublishSubject a1;
    public PublishSubject b1;
    public h c1;
    public int d1;
    public AnimatorSet e1;
    public boolean f1;
    public final ContactPermissionHolder g1;

    public void n(){
       super();
       this.d1 = 0;
       this.f1 = false;
       this.g1 = new ContactPermissionHolder(new b(new c()));
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, n.class, "10")) {
          return;
       }
       super.E8();
       this.U = 5;
       this.X7(this.a1.subscribe(new n$c(this)));
       this.c1.e = new n$d(this);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, n.class, "16")) {
          return;
       }
       super.J8();
       n tZ0 = this.Z0;
       if (tZ0 != null) {
          tZ0.Z0();
       }
       tZ0 = this.e1;
       if (tZ0 != null && tZ0.isRunning()) {
          this.e1.cancel();
       }
       return;
    }
    public void S8(){
    }
    public void a9(){
       RecoUser recoUser;
       RecoUser mPymkGuideCa;
       if (PatchProxy.applyVoid(null, this, n.class, "13")) {
          return;
       }
       if (this.Z0.getItemCount() <= 0) {
          this.W0.setVisibility(8);
          this.u.setVisibility(8);
          return;
       }else if(this.Z0.N0(0) != null){
          recoUser = this.Z0.N0(0);
       }else {
          recoUser = this.v.getItem(0);
       }
       if (recoUser == null) {
          return;
       }else if(recoUser.mType == 2){
          this.X0.setText(R.string.arg_RES_7f100d16);
          this.x9();
       }else {
          this.X0.setText(R.string.arg_RES_7f10256e);
          mPymkGuideCa = recoUser.mUser;
          if (mPymkGuideCa != null && mPymkGuideCa.mVisitorBeFollowed != null) {
             this.Y0.setText(R.string.arg_RES_7f10408e);
          }else if(mPymkGuideCa != null){
             this.Y0.setText(R.string.arg_RES_7f100f8f);
          }
       }
       mPymkGuideCa = recoUser.mPymkGuideCard;
       if (mPymkGuideCa != null) {
          PymkGuideCard mExtraInfo = mPymkGuideCa.mExtraInfo;
          if (mExtraInfo != null) {
             this.u.setText(mExtraInfo.mAggrCardTitle);
             this.W0.setText(recoUser.mPymkGuideCard.mExtraInfo.mAggrSubCardTitle);
          label_00a9 :
             RelativeLayout$LayoutParams layoutParams = this.u.getLayoutParams();
             layoutParams.topMargin = j.c.h(this.z) + n.c(this.W0.getContext(), (this.A.e() * 22.00f));
             this.u.setLayoutParams(layoutParams);
             this.u.setVisibility(0);
             layoutParams = this.W0.getLayoutParams();
             layoutParams.topMargin = n.c(this.W0.getContext(), (this.A.e() * 6.00f));
             this.W0.setLayoutParams(layoutParams);
             this.W0.setVisibility(0);
          }else {
          label_008b :
             mPymkGuideCa = recoUser.mUser;
             if (mPymkGuideCa != null) {
                User mExtraInfo1 = mPymkGuideCa.mExtraInfo;
                if (mExtraInfo1 != null) {
                   this.u.setText(mExtraInfo1.mAggrCardTitle);
                   this.W0.setText(RichTextMetaExt.g(recoUser.mUser.mExtraInfo.mAggrSubCardTitle));
                   goto label_00a9 ;
                }
             }
          }
       }else {
          goto label_008b ;
       }
       return;
    }
    public void b9(){
       if (PatchProxy.applyVoid(null, this, n.class, "5")) {
          return;
       }
       if (this.S != null) {
          this.S = false;
          this.Z0.W0(this.v.getItems());
          this.R8();
       }else if(!this.v.hasMore()){
          this.h9();
       }else {
          this.e9();
       }
       return;
    }
    public void c9(){
       if (PatchProxy.applyVoid(null, this, n.class, "2")) {
          return;
       }
       RecoUser recoUser = this.Z0.N0(0);
       if (this.Z0.getItemCount() > 1 && recoUser != null) {
          RecoUser mUser = recoUser.mUser;
          if (mUser != null && (mUser.getFollowStatus() == User$FollowStatus.FOLLOWING || recoUser.mUser.getFollowStatus() == User$FollowStatus.FOLLOW_REQUESTING)) {
             this.V0.postDelayed(new n$a(this), 200);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "8")) {
          return;
       }
       super.doBindView(p0);
       this.V0 = p0.findViewById(0x7f0a336c);
       this.W0 = p0.findViewById(0x7f0a3bd4);
       this.X0 = p0.findViewById(0x7f0a06ab);
       this.Y0 = p0.findViewById(0x7f0a0f4c);
       this.X0.setOnClickListener(new w0(this));
       this.Y0.setOnClickListener(new n$b(this));
       return;
    }
    public void e9(){
       if (PatchProxy.applyVoid(null, this, n.class, "19")) {
          return;
       }
       int i = 1;
       if (this.v.getCount() > i && !q.f(this.Z0.Q0())) {
          this.Z0.W0(this.v.getItems());
          this.s9(i);
       }
       this.K.setVisibility(0);
       this.R.setVisibility(8);
       if (this.p.H(this.V)) {
          this.t.setVisibility(0);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, n.class, "1")) {
          return;
       }
       super.j8();
       this.a1 = this.r8("PYMK_ACCESS_IDSbigcard_btn");
       this.b1 = this.r8("relation_btn_click");
       this.Z0 = this.r8("ADAPTER");
       this.d1 = this.r8("PYMK_ACCESS_IDSportal").intValue();
       this.c1 = this.q8(h.class);
       return;
    }
    public void l9(){
       if (PatchProxy.applyVoid(null, this, n.class, "17")) {
          return;
       }
       RelativeLayout$LayoutParams layoutParams = this.L.getLayoutParams();
       layoutParams.topMargin = this.A.a();
       layoutParams.bottomMargin = a.c((StackLayoutManager.d * 2.00f), this.l8());
       this.L.setLayoutParams(layoutParams);
       this.Z0.W0(this.v.getItems());
       RecoUser recoUser = this.Z0.N0(0);
       if (recoUser != null && recoUser.mType == 2) {
          b.a(recoUser, this.v.l2(), this.v.m2());
       }else {
          b.b(this.x, recoUser);
       }
       this.Z0.k0();
       this.m9();
       return;
    }
    public void m9(){
       if (PatchProxy.applyVoid(null, this, n.class, "18")) {
          return;
       }
       this.P8(this.Z0.N0(0));
       return;
    }
    public void n9(){
       if (PatchProxy.applyVoid(null, this, n.class, "6")) {
          return;
       }
       this.o9();
       this.d9();
       this.a9();
       RecoUser recoUser = this.Z0.N0(0);
       if (recoUser != null && recoUser.mType == 2) {
          b.a(recoUser, this.v.l2(), this.v.m2());
       }else if(recoUser != null){
          b.b(this.x, recoUser);
       }
       this.m9();
       return;
    }
    public void o9(){
    }
    public void q9(){
    }
    public final void s9(int p0){
       if (PatchProxy.isSupport(n.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, n.class, "4")) {
          return;
       }
       this.q9();
       AnimatorSet uAnimatorSet = b.b(this.V0, this.Z0, p0, new x0(this));
       this.e1 = uAnimatorSet;
       if (uAnimatorSet != null) {
          uAnimatorSet.start();
       }
       return;
    }
    public void t9(int p0){
       if (PatchProxy.isSupport(n.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, n.class, "3")) {
          return;
       }
       boolean b = false;
       if (this.Z0.getItemCount() == 1) {
          if (this.v.hasMore() && this.S == null) {
             this.v.load();
             this.S = b;
          }else {
             this.h9();
          }
       }else {
          n te1 = this.e1;
          if (te1 == null || (te1.isRunning() || this.f1 != null)) {
             return;
          }else if(p0 == 1){
             this.s9(p0);
          }else if(PatchProxy.applyVoid(null, this, n.class, "7")){
             p0 = 200;
             te1 = this.V0;
             View childAt = te1.getChildAt((te1.getChildCount() - 1));
             if (childAt != null) {
                ImageView imageView = childAt.findViewById(R.id.follow_animation);
                imageView.setVisibility(b);
                imageView.setAlpha(0);
                imageView.setScaleX(0x3f000000);
                imageView.setScaleY(0x3f000000);
                ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(imageView, "alpha", new float[2]{0,0x3f800000});
                objectAnimat.setInterpolator(new DecelerateInterpolator(0x3fc00000));
                objectAnimat.setDuration(100);
                ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(imageView, "scaleX", new float[2]{0x3f000000,0x3f800000});
                ObjectAnimator objectAnimat2 = ObjectAnimator.ofFloat(imageView, "scaleY", new float[2]{0x3f000000,0x3f800000});
                objectAnimat1.setInterpolator(new LinearInterpolator());
                objectAnimat2.setInterpolator(new LinearInterpolator());
                long l = (long)p0;
                objectAnimat1.setDuration(l);
                objectAnimat2.setDuration(l);
                AnimatorSet uAnimatorSet = new AnimatorSet();
                uAnimatorSet.setDuration(l);
                Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1,objectAnimat2};
                uAnimatorSet.playTogether(uAnimatorArr);
                uAnimatorSet.addListener(new o(this, imageView));
                uAnimatorSet.start();
             }
          }
       }
       return;
    }
    public void u9(RecoUser p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "11")) {
          return;
       }
       QPhoto qPhoto = Lists.h(p0.mFeedList, t.b).get(0);
       PhotoDetailParam photoDetailP = new PhotoDetailParam(qPhoto);
       String str = f.b(this.z);
       b.g(j.e(d.a(-1188553266).gx(p0, this.getActivity().getUrl()), str, SlideMediaType.PHOTO));
       photoDetailP.setSlidePlayId(str);
       d.a(-1818031860).L5(this.getActivity(), 1025, photoDetailP, null);
       RecoUser mUser = p0.mUser;
       this.y.u().Qe(qPhoto.mEntity, p0, mUser, mUser.mPosition);
       return;
    }
    public void x9(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, n.class, "12")) {
          return;
       }
       if (this.g1.d()) {
          if (!PatchProxy.applyVoid(objArray, this, n.class, "14")) {
             this.Y0.setText(b.b().c(R.string.arg_RES_7f100121));
             this.Y0.setBackgroundResource(R.drawable.arg_RES_7f0801dd);
             n tY0 = this.Y0;
             tY0.setTextColor(j.b(tY0.getContext(), R.color.arg_RES_7f061d77));
          }
       }else if(PatchProxy.applyVoid(objArray, this, n.class, "15")){
          this.Y0.setText(b.b().c(R.string.arg_RES_7f1007fe));
          this.Y0.setBackgroundResource(R.drawable.arg_RES_7f0801bd);
       }
       return;
    }
}
