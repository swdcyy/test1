package com.yxcorp.gifshow.map.map.markerStyle.MarkerViewStyleCircleCard;
import com.yxcorp.gifshow.map.map.markerStyle.BaseMarkerViewStyle;
import com.yxcorp.gifshow.map.map.markerStyle.MarkerViewStyleCircleCard$a;
import nsd.u;
import lnc.a1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.widget.ImageView;
import com.yxcorp.gifshow.nearby.common.map.MapExperimentUtils;
import android.content.Context;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewGroup;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import s0d.e;
import com.kwai.framework.model.user.User;
import s0d.f;
import com.yxcorp.gifshow.model.CDNUrl;
import com.facebook.imagepipeline.request.ImageRequest$CacheChoice;
import s0d.a;
import com.yxcorp.gifshow.widget.cdn.KwaiLottieAnimationView;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.LinearLayout;
import h6b.a;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$Tag;
import com.yxcorp.utility.n;
import fi5.s;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kwai.components.nearbymodel.model.NearbyMapFeed;
import java.util.Objects;
import android.graphics.drawable.Drawable;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$RoleInfo;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$RoleInfo$Moment;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import zf6.k;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.airbnb.lottie.LottieAnimationView;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import h6b.e;
import h6b.f;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.AnimatorSet;
import h6b.d;
import android.animation.Animator$AnimatorListener;

public final class MarkerViewStyleCircleCard extends BaseMarkerViewStyle	// class@001c94
{
    public ImageView liveBorder;
    public ImageView liveTip;
    public Animator mAnimator;
    public ImageView mBgBorderImageView;
    public View mClView;
    public KwaiImageView mCoverImage;
    public boolean mHasRelation;
    public boolean mIsOnLineStateHide;
    public boolean mIsStateHide;
    public final int mMarkerCircleCardImageHeight;
    public final int mMarkerCircleCardImageWidth;
    public KwaiLottieAnimationView mSelectLottieView;
    public ImageView onLineTip;
    public static final MarkerViewStyleCircleCard$a Companion;
    public static final long serialVersionUID;

    static {
       MarkerViewStyleCircleCard.Companion = new MarkerViewStyleCircleCard$a(null);
    }
    public void MarkerViewStyleCircleCard(){
       super();
       this.mMarkerCircleCardImageWidth = a1.e(44.00f);
       this.mMarkerCircleCardImageHeight = a1.e(44.00f);
    }
    public final void a(boolean p0){
       MarkerViewStyleCircleCard tliveTip;
       if (PatchProxy.isSupport(MarkerViewStyleCircleCard.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, MarkerViewStyleCircleCard.class, "16")) {
          return;
       }
       if (p0) {
          tliveTip = this.liveTip;
          if (tliveTip == null || tliveTip.getVisibility()) {
             tliveTip = this.liveBorder;
             if (tliveTip != null && !tliveTip.getVisibility()) {
             label_0030 :
                this.mIsStateHide = true;
                tliveTip = this.liveTip;
                if (tliveTip != null) {
                   tliveTip.setVisibility(8);
                }
                tliveTip = this.liveBorder;
                if (tliveTip != null) {
                   tliveTip.setVisibility(8);
                }
             }
          }else {
             goto label_0030 ;
          }
          tliveTip = this.onLineTip;
          if (tliveTip != null && !tliveTip.getVisibility()) {
             this.mIsOnLineStateHide = true;
             tliveTip = this.onLineTip;
             if (tliveTip != null) {
                tliveTip.setVisibility(8);
             }
          }
       }else if(this.mIsStateHide != null){
          this.mIsStateHide = false;
          tliveTip = this.liveTip;
          if (tliveTip != null) {
             tliveTip.setVisibility(false);
          }
          if (!MapExperimentUtils.g.e()) {
             tliveTip = this.liveBorder;
             if (tliveTip != null) {
                tliveTip.setVisibility(false);
             }
          }
       }
    label_0071 :
       if (this.mIsOnLineStateHide != null) {
          tliveTip = this.onLineTip;
          if (tliveTip != null) {
             tliveTip.setVisibility(false);
          }
       }
    label_007c :
       return;
    }
    public int cardType(){
       return 4;
    }
    public int coverHeight(){
       return this.mMarkerCircleCardImageHeight;
    }
    public int coverWidth(){
       return this.mMarkerCircleCardImageWidth;
    }
    public View createView(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MarkerViewStyleCircleCard.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       View view = View.inflate(p0, R.layout.arg_RES_7f0d080c, null);
       a.o(view, "View.inflate\(context, R.бн_photo_circle_card, null\)");
       return view;
    }
    public e imageRequest(QPhoto p0){
       e uoe;
       f obj = PatchProxy.applyOneRefs(p0, this, MarkerViewStyleCircleCard.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       if (p0 != null) {
          User user = p0.getUser();
          if (user != null) {
             uoe = f.x().r(user.getAvatars()).t(user.getAvatar()).f(ImageRequest$CacheChoice.SMALL).o(this.coverWidth(), this.coverHeight()).v();
          }
       }
       return uoe;
    }
    public void initView(Context p0,View p1,QPhoto p2){
       ImageView this;
       ImageView imageView2;
       MarkerViewStyleCircleCard tliveTip;
       ViewGroup$LayoutParams layoutParams3;
       ViewGroup$LayoutParams layoutParams4;
       View view;
       int i5;
       View[] viewArray;
       s a;
       ViewGroup$LayoutParams i5;
       a a1;
       View[] viewArray3;
       View[] i51;
       View[] viewArray4;
       View[] viewArray5;
       ViewGroup$LayoutParams layoutParams5;
       Object obj1;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, MarkerViewStyleCircleCard.class, "1")) {
          return;
       }
       if (!PatchProxy.applyVoidTwoRefs(p1, p2, this, MarkerViewStyleCircleCard.class, "3")) {
          int i = 0x7f0a2607;
          ViewGroup$LayoutParams layoutParams = null;
          ImageView imageView = (p1 != null)? p1.findViewById(i): layoutParams;
          this.liveBorder = imageView;
          int i1 = 0x7f0a2698;
          ImageView imageView1 = (p1 != null)? p1.findViewById(i1): layoutParams;
          this.liveTip = imageView1;
          int i2 = 0x7f0a2eb5;
          this = (p1 != null)? p1.findViewById(i2): layoutParams;
          this.onLineTip = this;
          if (!PatchProxy.applyVoidOneRefs(p1, this, MarkerViewStyleCircleCard.class, "9")) {
             KwaiLottieAnimationView kwaiLottieAn = (p1 != null)? p1.findViewById(R.id.select_lottie_view): layoutParams;
             this.mSelectLottieView = kwaiLottieAn;
             if (MapExperimentUtils.g.e()) {
                MarkerViewStyleCircleCard kwaiLottieAn1 = this.mSelectLottieView;
                i5 = (kwaiLottieAn1 != null)? kwaiLottieAn1.getLayoutParams(): layoutParams;
                if (!i5 instanceof ViewGroup$MarginLayoutParams) {
                   i5 = layoutParams;
                }
                if (i5 != null) {
                   i5.width = a1.e(86.00f);
                   i5.height = a1.e(86.00f);
                   i5.topMargin = a1.e(3.00f);
                }
             }
          }
       label_0094 :
          int i3 = 8;
          int i4 = 1;
          if (!PatchProxy.applyVoidTwoRefs(p1, p2, this, MarkerViewStyleCircleCard.class, "8")) {
             LinearLayout linearLayout = (p1 != null)? p1.findViewById(R.id.tag_content): layoutParams;
             if (p2 != null) {
                if (linearLayout != null) {
                   List list = a.a.b(p2);
                   ArrayList uArrayList = PatchProxy.applyOneRefs(list, this, MarkerViewStyleCircleCard.class, "10");
                   if (uArrayList != PatchProxyResult.class) {
                   }else {
                      uArrayList = new ArrayList();
                      Iterator iterator = list.iterator();
                      while (iterator.hasNext()) {
                         Object obj = iterator.next();
                         if (obj.mType == i4 && this.mHasRelation == null) {
                            this.mHasRelation = i4;
                            obj1 = 1;
                         }else {
                            obj1 = null;
                         }
                         if (obj1) {
                            uArrayList.add(obj);
                         }
                      }
                   }
                   if (MapExperimentUtils.g.e()) {
                      ViewGroup$LayoutParams layoutParams6 = linearLayout.getLayoutParams();
                      if (!layoutParams6 instanceof ViewGroup$MarginLayoutParams) {
                         layoutParams6 = layoutParams;
                      }
                      if (layoutParams6 != null) {
                         layoutParams6.topMargin = a1.e(8.00f);
                      }
                   }
                   a.a.g(linearLayout, uArrayList);
                }
             }else {
                View[] viewArray6 = new View[i4];
                viewArray6[0] = linearLayout;
                n.Z(i3, viewArray6);
             }
          }
          if (!PatchProxy.applyVoidTwoRefs(p1, p2, this, MarkerViewStyleCircleCard.class, "7")) {
             a1 = a.a;
             s a2 = s.a;
             CommonMeta commonMeta1 = (p2 != null)? p2.getCommonMeta(): layoutParams;
             NearbyMapFeed nearbyMapFee1 = a2.f(commonMeta1);
             Objects.requireNonNull(a1);
             if (!PatchProxy.applyVoidTwoRefs(p1, nearbyMapFee1, a1, a.class, "2")) {
                imageView2 = (p1 != null)? p1.findViewById(i): layoutParams;
                imageView = (p1 != null)? p1.findViewById(i1): layoutParams;
                imageView1 = (p1 != null)? p1.findViewById(i2): layoutParams;
                if (nearbyMapFee1 != null) {
                   NearbyMapFeed mAuthorHeade = nearbyMapFee1.mAuthorHeaderTagType;
                   if (mAuthorHeade == null) {
                      viewArray3 = new View[i4];
                      viewArray3[0] = imageView1;
                      n.Z(i3, viewArray3);
                   }else if(mAuthorHeade != i4){
                      if (mAuthorHeade == 2) {
                         if (MapExperimentUtils.g.e()) {
                            i5 = 0x7f08160d;
                         label_018e :
                            if (i5) {
                               if (imageView1 != null) {
                                  imageView1.setImageDrawable(a1.f(i5));
                               }
                               i51 = new View[i4];
                               i51[0] = imageView1;
                               n.Z(0, i51);
                               viewArray4 = new View[i4];
                               viewArray4[0] = imageView;
                               n.Z(i3, viewArray4);
                               viewArray5 = new View[i4];
                               viewArray5[0] = imageView2;
                               n.Z(i3, viewArray5);
                            }else {
                               viewArray3 = new View[i4];
                               viewArray3[0] = imageView1;
                               n.Z(i3, viewArray3);
                            }
                         }else {
                            a1.c(imageView2, imageView, nearbyMapFee1);
                         }
                      }
                   }else {
                      a1.c(imageView2, imageView, nearbyMapFee1);
                   }
                   i5 = 0;
                   goto label_018e ;
                }else {
                   i51 = new View[i4];
                   i51[0] = imageView1;
                   n.Z(i3, i51);
                   viewArray4 = new View[i4];
                   viewArray4[0] = imageView;
                   n.Z(i3, viewArray4);
                   viewArray5 = new View[i4];
                   viewArray5[0] = imageView2;
                   n.Z(i3, viewArray5);
                }
             }
          }
          float f = 11.00f;
          if (!PatchProxy.applyVoidTwoRefs(p1, p2, this, MarkerViewStyleCircleCard.class, "5")) {
             view = (p1 != null)? p1.findViewById(R.id.bubble_container): layoutParams;
             i5 = 0x7f0a2957;
             View view1 = (p1 != null)? p1.findViewById(i5): layoutParams;
             if (MapExperimentUtils.g.e()) {
                viewArray = new View[]{view,view1};
                n.Z(i3, viewArray);
             }else {
                a = s.a;
                CommonMeta commonMeta = (p2 != null)? p2.getCommonMeta(): layoutParams;
                NearbyMapFeed nearbyMapFee = a.f(commonMeta);
                if (nearbyMapFee != null) {
                   nearbyMapFee = nearbyMapFee.mRoleInfo;
                   if (nearbyMapFee != null) {
                      NearbyMapFeed$RoleInfo mMoment = nearbyMapFee.mMoment;
                      if (mMoment != null) {
                         if (TextUtils.x(mMoment.mMessage)) {
                            viewArray = new View[]{view,view1};
                            n.Z(i3, viewArray);
                         }else {
                            View[] viewArray1 = new View[]{view,view1};
                            n.Z(0, viewArray1);
                            TextView textView = (view != null)? view.findViewById(R.id.bubble_title): layoutParams;
                            View[] viewArray2 = new View[i4];
                            viewArray2[0] = view;
                            n.Z(0, viewArray2);
                            view = (p1 != null)? p1.findViewById(i5): layoutParams;
                            i5 = (view != null)? view.getLayoutParams(): layoutParams;
                            Objects.requireNonNull(i5, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            i5.topMargin = a1.e(f);
                            view.requestLayout();
                            if (textView != null) {
                               textView.setText(mMoment.mMessage);
                            }
                         }
                      }
                   }
                }
             }
          }
       label_0271 :
          if (!PatchProxy.applyVoidOneRefs(p1, this, MarkerViewStyleCircleCard.class, "6")) {
             imageView2 = (p1 != null)? p1.findViewById(R.id.bg_border): layoutParams;
             this.mBgBorderImageView = imageView2;
             if (k.d()) {
                tliveTip = this.mCoverImage;
                if (tliveTip != null) {
                   tliveTip.setPlaceHolderImage(R.color.arg_RES_7f061da4);
                }
             }else {
                tliveTip = this.mCoverImage;
                if (tliveTip != null) {
                   tliveTip.setPlaceHolderImage(R.color.arg_RES_7f061dbf);
                }
             }
          }
       label_02a6 :
          if (!MapExperimentUtils.g.e() || (!PatchProxy.applyVoidOneRefs(p1, this, MarkerViewStyleCircleCard.class, "4") && p1 != null)) {
             imageView2 = p1.findViewById(R.id.iv_shadow);
             ViewGroup$LayoutParams layoutParams1 = (imageView2 != null)? imageView2.getLayoutParams(): layoutParams;
             if (!layoutParams1 instanceof ViewGroup$MarginLayoutParams) {
                layoutParams1 = layoutParams;
             }
             if (layoutParams1 != null) {
                layoutParams1.width = a1.e(f);
                layoutParams1.height = a1.e(0x3f000000);
                layoutParams1.bottomMargin = 0;
             }
             imageView2.setImageDrawable(a1.f(R.drawable.arg_RES_7f081645));
             tliveTip = this.liveTip;
             ViewGroup$LayoutParams layoutParams2 = (tliveTip != null)? tliveTip.getLayoutParams(): layoutParams;
             if (!layoutParams2 instanceof ViewGroup$MarginLayoutParams) {
                layoutParams2 = layoutParams;
             }
             if (layoutParams2 != null) {
                layoutParams2.bottomMargin = 0;
                layoutParams2.width = a1.e(33.00f);
                layoutParams2.height = a1.e(15.00f);
             }
             tliveTip = this.onLineTip;
             layoutParams2 = (tliveTip != null)? tliveTip.getLayoutParams(): layoutParams;
             if (!layoutParams2 instanceof ConstraintLayout$LayoutParams) {
                layoutParams2 = layoutParams;
             }
             if (layoutParams2 != null) {
                layoutParams2.bottomMargin = 0;
                layoutParams2.width = a1.e(10.00f);
                layoutParams2.height = a1.e(10.00f);
                layoutParams2.k = 0;
                layoutParams2.bottomMargin = a1.e(0x3f800000);
                layoutParams2.setMarginEnd(a1.e(3.00f));
             }
             tliveTip = this.mBgBorderImageView;
             if (tliveTip != null) {
                layoutParams2 = tliveTip.getLayoutParams();
                if (layoutParams2 != null) {
                   layoutParams2.width = a1.e(44.00f);
                }
             }
             tliveTip = this.mBgBorderImageView;
             if (tliveTip != null) {
                layoutParams2 = tliveTip.getLayoutParams();
                if (layoutParams2 != null) {
                   layoutParams2.height = a1.e(48.00f);
                }
             }
             tliveTip = this.mBgBorderImageView;
             if (tliveTip != null) {
                tliveTip.setBackgroundResource(R.drawable.arg_RES_7f08162a);
             }
             ViewGroup viewGroup = p1.findViewById(R.id.view_rounded);
             float f1 = 42.00f;
             if (viewGroup != null) {
                layoutParams3 = viewGroup.getLayoutParams();
                if (layoutParams3 != null) {
                   layoutParams3.width = a1.e(f1);
                }
             }
             if (viewGroup != null) {
                layoutParams3 = viewGroup.getLayoutParams();
                if (layoutParams3 != null) {
                   layoutParams3.height = a1.e(f1);
                }
             }
             if (viewGroup != null) {
                layoutParams = viewGroup.getLayoutParams();
             }
             Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
             layoutParams.topMargin = a1.e(2.00f);
             layoutParams.leftMargin = 0;
             layoutParams.rightMargin = 0;
             KwaiImageView kwaiImageVie = p1.findViewById(R.id.cover_image);
             this.mCoverImage = kwaiImageVie;
             f1 = 40.00f;
             if (kwaiImageVie != null) {
                layoutParams4 = kwaiImageVie.getLayoutParams();
                if (layoutParams4 != null) {
                   layoutParams4.height = a1.e(f1);
                }
             }
             MarkerViewStyleCircleCard tmCoverImage = this.mCoverImage;
             if (tmCoverImage != null) {
                layoutParams4 = tmCoverImage.getLayoutParams();
                if (layoutParams4 != null) {
                   layoutParams4.width = a1.e(f1);
                }
             }
             viewGroup.requestLayout();
          }
       }
    label_03e3 :
       return;
    }
    public void onCancelSelectMarker(){
       if (PatchProxy.applyVoid(null, this, MarkerViewStyleCircleCard.class, "13")) {
          return;
       }
       super.onCancelSelectMarker();
       boolean b = false;
       this.a(b);
       MarkerViewStyleCircleCard tmBgBorderIm = this.mBgBorderImageView;
       if (tmBgBorderIm != null) {
          tmBgBorderIm.setVisibility(b);
       }
       MarkerViewStyleCircleCard tmSelectLott = this.mSelectLottieView;
       if (tmSelectLott != null) {
          tmSelectLott.f();
       }
       tmSelectLott = this.mSelectLottieView;
       if (tmSelectLott != null) {
          tmSelectLott.setVisibility(4);
       }
       if (!PatchProxy.applyVoid(null, this, MarkerViewStyleCircleCard.class, "14")) {
          tmSelectLott = this.mAnimator;
          if (tmSelectLott != null) {
             tmSelectLott.cancel();
          }
          tmSelectLott = this.mAnimator;
          if (tmSelectLott != null) {
             tmSelectLott.removeAllListeners();
          }
          this.mAnimator = null;
       }
       return;
    }
    public void onSelectMarker(){
       Object[] objArray1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MarkerViewStyleCircleCard.class, "15")) {
          return;
       }
       super.onSelectMarker();
       boolean b = true;
       this.a(b);
       MarkerViewStyleCircleCard tmSelectLott = this.mSelectLottieView;
       if (tmSelectLott != null) {
          tmSelectLott.setProgress(0);
       }
       tmSelectLott = this.mSelectLottieView;
       if (tmSelectLott != null) {
          tmSelectLott.setVisibility(0);
       }
       tmSelectLott = this.mSelectLottieView;
       if (tmSelectLott != null) {
          int i = (MapExperimentUtils.g.e())? 0x7f102fae: 0x7f102fb0;
          tmSelectLott.D(i);
       }
       tmSelectLott = this.mSelectLottieView;
       if (tmSelectLott != null) {
          tmSelectLott.s();
       }
       tmSelectLott = this.mBgBorderImageView;
       if (tmSelectLott != null) {
          tmSelectLott.setVisibility(4);
       }
       View mView = this.getMView();
       mView = (mView != null)? mView.findViewById(R.id.cl_icon): objArray;
       this.mClView = mView;
       if (!PatchProxy.applyVoid(objArray, this, MarkerViewStyleCircleCard.class, "17") && (this.mClView != null && this.mSelectLottieView != null)) {
          ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[3]{0x3f800000,0x3f8ccccd,0x3f800000});
          valueAnimato.setDuration(1000);
          valueAnimato.setInterpolator(new LinearInterpolator());
          int i1 = -1;
          valueAnimato.setRepeatCount(i1);
          ValueAnimator valueAnimato1 = ValueAnimator.ofFloat(new float[3]{0x3f800000,0x3f8ccccd,0x3f800000});
          valueAnimato1.setDuration(1000);
          valueAnimato1.setInterpolator(new LinearInterpolator());
          valueAnimato1.setRepeatCount(i1);
          MarkerViewStyleCircleCard tmClView = this.mClView;
          int i2 = 2;
          if (tmClView != null) {
             tmClView.setPivotY((float)tmClView.getMeasuredHeight());
             tmClView.setPivotX((float)(tmClView.getMeasuredWidth() / i2));
          }
          e uoe = new e(this);
          MarkerViewStyleCircleCard tmSelectLott1 = this.mSelectLottieView;
          if (tmSelectLott1 != null) {
             tmSelectLott1.setPivotY(((float)tmSelectLott1.getMeasuredHeight() - 40.00f));
             tmSelectLott1.setPivotX((float)(tmSelectLott1.getMeasuredWidth() / i2));
          }
          valueAnimato.addUpdateListener(uoe);
          valueAnimato1.addUpdateListener(new f(this));
          AnimatorSet uAnimatorSet = new AnimatorSet();
          uAnimatorSet.addListener(new d(valueAnimato, valueAnimato1));
          Animator[] uAnimatorArr = new Animator[i2];
          uAnimatorArr[0] = valueAnimato1;
          uAnimatorArr[b] = valueAnimato;
          uAnimatorSet.playTogether(uAnimatorArr);
          this.mAnimator = uAnimatorSet;
       }
    label_00f5 :
       MarkerViewStyleCircleCard tmAnimator = this.mAnimator;
       if (tmAnimator != null) {
          tmAnimator.start();
       }
       return;
    }
    public void onUnbind(){
       if (PatchProxy.applyVoid(null, this, MarkerViewStyleCircleCard.class, "12")) {
          return;
       }
       super.onUnbind();
       a.a.a(this.mSelectLottieView);
       MarkerViewStyleCircleCard tmAnimator = this.mAnimator;
       if (tmAnimator != null) {
          tmAnimator.cancel();
       }
       tmAnimator = this.mAnimator;
       if (tmAnimator != null) {
          tmAnimator.removeAllListeners();
       }
       this.mAnimator = null;
       this.mSelectLottieView = null;
       this.mClView = null;
       return;
    }
}
