package com.yxcorp.gifshow.growth.home.pymk.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import vna.t;
import vna.r;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import com.yxcorp.gifshow.growth.home.pymk.e;
import erd.g;
import crd.b;
import brd.t;
import px6.b;
import com.kwai.library.kwaiplayerkit.framework.KwaiPlayerKitView;
import nx6.a;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Integer;
import com.facebook.drawee.view.DraweeView;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import jp.a;
import com.kwai.framework.model.feed.BaseFeed;
import ub.b;
import jd.c;
import wb5.g;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.growth.home.pymk.widget.RecommendAvatarWithLiving;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.NewRecommendStyleInfo;
import java.util.Objects;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import wna.g;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.Animator;
import android.animation.AnimatorSet$Builder;
import wna.h;
import android.animation.Animator$AnimatorListener;
import qrd.l1;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lu7.f;
import rnc.i;
import java.util.List;
import java.util.Collection;
import ekd.q;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kwai.widget.customer.foldavatar.KwaiFoldAvatarLayout;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import android.view.LayoutInflater;
import ag6.a;
import ac.b;
import yb.a;
import com.facebook.drawee.generic.RoundingParams;
import hx7.a;
import java.lang.StringBuilder;
import com.kwai.framework.model.user.RichTextMeta;
import com.yxcorp.gifshow.growth.home.pymk.f$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.growth.home.pymk.f$b;
import com.yxcorp.gifshow.growth.home.pymk.f$c;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.kwai.video.wayne.player.main.IPlayerListener;
import gi5.d;
import wx6.d;
import ekd.m1;
import android.text.TextPaint;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.entity.RecommendUserWrapper;
import y8c.d;
import io.reactivex.subjects.PublishSubject;
import java.lang.Boolean;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class f extends PresenterV2	// class@0013a4
{
    public TextView A;
    public TextView B;
    public t C;
    public RecommendUserWrapper D;
    public User E;
    public QPhoto F;
    public d G;
    public PublishSubject H;
    public boolean I;
    public int J;
    public int K;
    public int L;
    public BaseFragment M;
    public IWaynePlayer N;
    public boolean O;
    public final IMediaPlayer$OnPreparedListener P;
    public View p;
    public KwaiPlayerKitView q;
    public View r;
    public View s;
    public RecommendAvatarWithLiving t;
    public TextView u;
    public View v;
    public TextView w;
    public TextView x;
    public TextView y;
    public KwaiFoldAvatarLayout z;
    public static int Q;
    public static int R;

    static {
       int i = a1.e(264.00f);
       f.Q = i;
       f.R = (i * 4) / 3;
    }
    public void f(t p0){
       super();
       this.P = new r(this);
       this.C = p0;
    }
    public void E8(){
       int i;
       int i1;
       KwaiImageView kwaiImageVie;
       User obj;
       int i2;
       User mNewRecommen;
       String str3;
       int i3;
       f tt;
       float f;
       f uof = f.class;
       Object[] objArray = null;
       String str = "3";
       if (PatchProxy.applyVoid(objArray, this, uof, str)) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uof, "4")) {
          ConstraintLayout$LayoutParams layoutParams2 = this.p.getLayoutParams();
          if (this.I != null) {
             layoutParams2.width = this.J;
             layoutParams2.topMargin = a1.e(4.00f);
             this.L = this.K;
          }else {
             layoutParams2.topMargin = a1.e(0x41f00000) + (((this.K - f.R) - a1.e(0x41f00000)) / 2);
             this.L = f.R;
          }
          layoutParams2.height = this.L;
          this.p.setLayoutParams(layoutParams2);
       }
       String str1 = "7";
       if (!PatchProxy.applyVoid(objArray, this, uof, str1)) {
          this.X7(this.H.subscribe(new e(this)));
          if (this.F != null) {
             a uoa = this.q.getPlayerKitContext().e(a.class);
             if (uoa != null) {
                KwaiImageView cover = uoa.getCover();
                f tF = this.F;
                int color = tF.getColor();
                if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidThreeRefs(cover, tF, Integer.valueOf(color), this, f.class, "9")) {
                   cover.setAspectRatio(tF.getDetailDisplayAspectRatio());
                   cover.setPlaceHolderImage(new ColorDrawable(color));
                   a$a uoa1 = a.d();
                   uoa1.b(":ks-features:ft-feed:kwai-growth");
                   uoa1.d(ImageSource.DETAIL_COVER_IMAGE);
                   a uoa2 = uoa1.a();
                   g.m(cover, tF.mEntity, a.b, null, null, uoa2, a1.a(R.color.arg_RES_7f061ed9));
                }
             }
             f = ((float)this.F.getWidth() * 0x3f800000) / (float)this.F.getHeight();
             if (f - 0x3f400000 > 0) {
                tt = this.L;
                i1 = (int)((float)tt * f);
             }else {
                tt = this.J;
                f uof2 = tt;
                int i4 = (int)((float)tt / f);
                f uof3 = uof2;
             }
             ViewGroup$LayoutParams layoutParams1 = this.q.getLayoutParams();
             layoutParams1.width = i1;
             layoutParams1.height = tt;
             this.q.setLayoutParams(layoutParams1);
          }
       }
       String str2 = "13";
       if (!PatchProxy.applyVoid(objArray, this, uof, str2)) {
          g.k(this.t.getMAvatarView(), this.E, HeadImageSize.BIG);
          User mNewRecommen1 = this.E.mNewRecommendStyleInfo;
          f uof1 = 1;
          if (mNewRecommen1 != null && mNewRecommen1.mIsLiving != null) {
             this.t.b(0);
             tt = this.t;
             Objects.requireNonNull(tt);
             if (!PatchProxy.applyVoid(objArray, tt, RecommendAvatarWithLiving.class, str)) {
                tt.a(uof1);
                tt.e.setVisibility(0);
                if (!PatchProxy.applyVoid(objArray, tt, RecommendAvatarWithLiving.class, str1)) {
                   tt.g.clearAnimation();
                   if (tt.c == null) {
                      AnimatorSet uAnimatorSet = new AnimatorSet();
                      ValueAnimator valueAnimato = new ValueAnimator();
                      valueAnimato.setRepeatCount(-1);
                      valueAnimato.setFloatValues(new float[3]{0x3f7ae148,0x3f866666,0x3f7ae148});
                      valueAnimato.addUpdateListener(new g(tt));
                      uAnimatorSet.setDuration(1200);
                      uAnimatorSet.play(valueAnimato);
                      uAnimatorSet.addListener(new h(tt));
                      tt.c = uAnimatorSet;
                   }
                   RecommendAvatarWithLiving c = tt.c;
                   if (c != null) {
                      c.start();
                   }
                }
             }
          }else {
             this.t.c();
             this.t.b(uof1);
          }
       }
       str = "14";
       if (!PatchProxy.applyVoid(objArray, this, uof, str)) {
          this.v.setVisibility(8);
          f tE = this.E;
          if (!PatchProxy.applyVoidOneRefs(tE, this, uof, "15")) {
             SpannableStringBuilder spannableStr = new SpannableStringBuilder();
             if (tE.isMale()) {
                str3 = a1.p(R.string.arg_RES_7f103196);
                i3 = 0x7f080d2e;
             }else if(tE.isFemale()){
                str3 = a1.p(R.string.arg_RES_7f100f40);
                i3 = 0x7f080d33;
             }else {
                str3 = objArray;
                i3 = 0;
             }
             if (str3 != null) {
                this.w.setCompoundDrawablesRelativeWithIntrinsicBounds(i3, 0, 0, 0);
                this.w.setCompoundDrawablePadding(a1.e(3.00f));
                spannableStr.append(str3);
             }else {
                this.w.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
                this.w.setCompoundDrawablePadding(0);
             }
             obj = tE.mNewRecommendStyleInfo;
             if (obj != null && !TextUtils.x(obj.mAge)) {
                if (str3 != null) {
                   spannableStr.append(" ¡¤ ");
                }
                spannableStr.append(tE.mNewRecommendStyleInfo.mAge);
                spannableStr.append("Ëê");
             }
             if (TextUtils.x(spannableStr)) {
                this.w.setVisibility(8);
             }else {
                this.v.setVisibility(0);
                this.w.setVisibility(0);
                this.w.setText(spannableStr);
             }
          }
          tE = this.E;
          if (!PatchProxy.applyVoidOneRefs(tE, this, uof, "16")) {
             mNewRecommen = tE.mNewRecommendStyleInfo;
             if (mNewRecommen != null && !TextUtils.x(mNewRecommen.mConstellation)) {
                this.y.setText(tE.mNewRecommendStyleInfo.mConstellation);
                this.y.setVisibility(0);
                this.v.setVisibility(0);
             }else {
                this.y.setVisibility(8);
             }
          }
          tE = this.E;
          if (!PatchProxy.applyVoidOneRefs(tE, this, uof, "17")) {
             mNewRecommen = tE.mNewRecommendStyleInfo;
             if (mNewRecommen != null && !TextUtils.x(mNewRecommen.mCityName)) {
                this.x.setVisibility(0);
                this.x.setText(tE.mNewRecommendStyleInfo.mCityName);
                this.v.setVisibility(0);
             }else {
                this.x.setVisibility(8);
             }
          }
       }
       this.u.setText(i.j(f.a(this.E)));
       str1 = "12";
       if (!PatchProxy.applyVoid(objArray, this, uof, str1)) {
          List recoCommonFr = this.E.getRecoCommonFriends();
          if (!q.f(recoCommonFr)) {
             this.z.setVisibility(0);
             this.A.setVisibility(0);
             this.B.setVisibility(8);
             ArrayList uArrayList = new ArrayList();
             Iterator iterator = recoCommonFr.iterator();
             while (iterator.hasNext()) {
                uArrayList.add(iterator.next().getAvatars());
             }
             uof = this.z;
             Objects.requireNonNull(uof);
             if (!PatchProxy.applyVoidOneRefs(uArrayList, uof, KwaiFoldAvatarLayout.class, str1) && (!PatchProxy.applyVoidTwoRefs(uArrayList, objArray, uof, KwaiFoldAvatarLayout.class, str2) && uArrayList.size())) {
                uof.g = objArray;
                i = uArrayList.size();
                i1 = 0;
                while (i1 < i) {
                   View childAt = uof.getChildAt(i1);
                   if (childAt instanceof KwaiImageView) {
                      childAt.setVisibility(0);
                   }else if(childAt != null){
                      uof.removeView(childAt);
                   }
                   childAt = objArray;
                   if (childAt == null) {
                      KwaiFoldAvatarLayout b = uof.b;
                      if (PatchProxy.isSupport(KwaiFoldAvatarLayout.class)) {
                         kwaiImageVie = PatchProxy.applyOneRefs(Integer.valueOf(b), uof, KwaiFoldAvatarLayout.class, str);
                         if (kwaiImageVie != PatchProxyResult.class) {
                         }else {
                         label_034f :
                            kwaiImageVie = a.c(LayoutInflater.from(uof.getContext()), R.layout.arg_RES_7f0d170f, uof, 0);
                            ViewGroup$LayoutParams layoutParams = kwaiImageVie.getLayoutParams();
                            i2 = uof.d + uof.c;
                            layoutParams.height = i2;
                            layoutParams.width = i2;
                            kwaiImageVie.setLayoutParams(layoutParams);
                            if (uof.c > null) {
                               RoundingParams roundingPara = kwaiImageVie.getHierarchy().n();
                               if (roundingPara == null) {
                                  roundingPara = new RoundingParams();
                               }
                               roundingPara.j(a1.a(b), (float)uof.c);
                               kwaiImageVie.getHierarchy().L(roundingPara);
                            }
                         }
                      }else {
                         goto label_034f ;
                      }
                      childAt = kwaiImageVie;
                      uof.addView(childAt);
                   }
                   obj = uArrayList.get(i1);
                   if (!PatchProxy.applyVoidTwoRefs(childAt, obj, objArray, a.class, "1")) {
                      i2 = 0x7f0a458d;
                      if (obj instanceof String) {
                         childAt.L(obj);
                         childAt.setTag(i2, obj);
                      }else if(obj instanceof CDNUrl[]){
                         childAt.U(obj);
                         childAt.setTag(i2, obj);
                      }
                   }
                   i1 = i1 + 1;
                }
                int childCount = uof.getChildCount();
                while (i1 < childCount) {
                   View childAt1 = uof.getChildAt(i1);
                   if (childAt1 != null) {
                      childAt1.setVisibility(8);
                   }
                   i1 = i1 + 1;
                }
             }
             this.A.setText(this.E.mMainRecoReason.mUserCount+"Î»"+this.E.mMainRecoReason.mTitle);
          }else {
             this.z.setVisibility(8);
             this.A.setVisibility(8);
             this.B.setVisibility(0);
          }
       }
       this.r.setOnClickListener(new f$a(this));
       this.s.setOnClickListener(new f$b(this));
       this.q.setOnClickListener(new f$c(this));
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, f.class, "6")) {
          return;
       }
       f tq = this.q;
       if (tq != null) {
          tq.release();
          this.N = null;
          this.q = null;
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, f.class, "5")) {
          return;
       }
       f tt = this.t;
       if (tt != null) {
          tt.c();
       }
       this.P8();
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, f.class, "8")) {
          return;
       }
       this.O = false;
       f tN = this.N;
       if (tN != null) {
          tN.removeOnPreparedListener(this.P);
          this.N = null;
       }
       tN = this.q;
       if (tN != null) {
          tN.reset();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       this.p = p0.findViewById(0x7f0a3121);
       KwaiPlayerKitView kwaiPlayerKi = p0.findViewById(R.id.pymk_player_view);
       this.q = kwaiPlayerKi;
       kwaiPlayerKi.c();
       this.q.setSessionKeyGenerator(new d());
       this.r = m1.f(p0, 0x7f0a336f);
       this.s = m1.f(p0, 0x7f0a437a);
       this.t = m1.f(p0, 0x7f0a4359);
       TextView textView = m1.f(p0, R.id.user_name);
       this.u = textView;
       textView.getPaint().setFakeBoldText(true);
       this.v = m1.f(p0, 0x7f0a3cf6);
       this.w = m1.f(p0, 0x7f0a3d22);
       this.x = m1.f(p0, 0x7f0a3cc8);
       this.y = m1.f(p0, 0x7f0a3cd5);
       this.z = m1.f(p0, 0x7f0a0f3a);
       this.A = m1.f(p0, 0x7f0a0f3b);
       this.B = m1.f(p0, 0x7f0a3464);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       RecommendUserWrapper recommendUse = this.q8(RecommendUserWrapper.class);
       this.D = recommendUse;
       this.E = recommendUse.mUser;
       this.F = recommendUse.mFeed;
       this.G = this.r8("ADAPTER_POSITION_GETTER");
       this.H = this.r8("PLAYER_STATUS_CHANGE");
       this.I = this.r8("SMALL_MODE").booleanValue();
       this.J = this.r8("PLAYER_WIDTH").intValue();
       this.K = this.r8("PLAYER_HEIGHT").intValue();
       this.M = this.q8(BaseFragment.class);
       return;
    }
}
