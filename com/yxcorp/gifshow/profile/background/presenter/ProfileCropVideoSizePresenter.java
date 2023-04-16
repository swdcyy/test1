package com.yxcorp.gifshow.profile.background.presenter.ProfileCropVideoSizePresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.profile.background.presenter.ProfileCropVideoSizePresenter$a;
import nsd.u;
import com.yxcorp.gifshow.profile.background.presenter.ProfileCropVideoSizePresenter$mShowPreviewAnimation$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.profile.background.presenter.ProfileCropVideoSizePresenter$mBackGroundRatio$2;
import android.view.View;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.profile.background.presenter.ProfileCropVideoSizePresenter$g;
import com.kwai.library.widget.scrollview.ScrollViewEx$c;
import com.kwai.library.widget.scrollview.ScrollViewEx;
import com.yxcorp.gifshow.profile.background.player.ProfileBgVideoInfo;
import com.yxcorp.gifshow.profile.background.presenter.ProfileCropVideoSizePresenter$h;
import erd.g;
import crd.b;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.animation.AnimatorSet;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import com.yxcorp.gifshow.profile.background.presenter.ProfileCropVideoSizePresenter$f;
import android.animation.Animator$AnimatorListener;
import qrd.l1;
import android.app.Activity;
import com.yxcorp.utility.n;
import z5c.k0;
import android.view.ViewGroup$LayoutParams;
import android.widget.ScrollView;
import com.yxcorp.gifshow.profile.background.presenter.ProfileCropVideoSizePresenter$i;
import ekd.m1;
import lnc.j2;
import java.util.Objects;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.a1;
import com.yxcorp.gifshow.profile.background.presenter.ProfileCropVideoSizePresenter$b;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.profile.background.presenter.ProfileCropVideoSizePresenter$c;
import android.view.View$OnTouchListener;
import com.yxcorp.gifshow.profile.background.presenter.ProfileCropVideoSizePresenter$d;
import com.yxcorp.gifshow.profile.background.presenter.ProfileCropVideoSizePresenter$e;
import io.reactivex.subjects.PublishSubject;

public final class ProfileCropVideoSizePresenter extends PresenterV2	// class@00125e
{
    public AnimatorSet A;
    public int B;
    public boolean C;
    public final p D;
    public final p E;
    public View p;
    public View q;
    public ScrollViewEx r;
    public View s;
    public View t;
    public View u;
    public View v;
    public View w;
    public ProfileBgVideoInfo x;
    public PublishSubject y;
    public AnimatorSet z;
    public static final ProfileCropVideoSizePresenter$a F;

    static {
       ProfileCropVideoSizePresenter.F = new ProfileCropVideoSizePresenter$a(null);
    }
    public void ProfileCropVideoSizePresenter(){
       super();
       this.D = s.c(new ProfileCropVideoSizePresenter$mShowPreviewAnimation$2(this));
       this.E = s.c(ProfileCropVideoSizePresenter$mBackGroundRatio$2.INSTANCE);
    }
    public static final View P8(ProfileCropVideoSizePresenter p0){
       p0 = p0.u;
       if (p0 == null) {
          a.S("mCropRect");
       }
       return p0;
    }
    public static final View R8(ProfileCropVideoSizePresenter p0){
       p0 = p0.v;
       if (p0 == null) {
          a.S("mCropTipView");
       }
       return p0;
    }
    public static final View S8(ProfileCropVideoSizePresenter p0){
       p0 = p0.t;
       if (p0 == null) {
          a.S("mPreviewBottom");
       }
       return p0;
    }
    public static final View V8(ProfileCropVideoSizePresenter p0){
       p0 = p0.s;
       if (p0 == null) {
          a.S("mPreviewTop");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, ProfileCropVideoSizePresenter.class, "5")) {
          return;
       }
       k1.r(this.X8(), 1000);
       ProfileCropVideoSizePresenter tr = this.r;
       if (tr == null) {
          a.S("mScrollView");
       }
       tr.setScrollViewListener(new ProfileCropVideoSizePresenter$g(this));
       tr = this.x;
       String str = "mVideoInfo";
       if (tr == null) {
          a.S(str);
       }
       if (tr.getVideoWidth()) {
          tr = this.x;
          if (tr == null) {
             a.S(str);
          }
          if (tr.getVideoHeight()) {
             this.Z8();
             return;
          }
       }
       tr = this.y;
       if (tr == null) {
          a.S("mMediaPreparedSubject");
       }
       this.X7(tr.subscribe(new ProfileCropVideoSizePresenter$h(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, ProfileCropVideoSizePresenter.class, "9")) {
          return;
       }
       ProfileCropVideoSizePresenter tr = this.r;
       if (tr == null) {
          a.S("mScrollView");
       }
       tr.setScrollViewListener(null);
       k1.m(this.X8());
       return;
    }
    public final float W8(){
       Object obj = PatchProxy.apply(null, this, ProfileCropVideoSizePresenter.class, "2");
       if (obj == PatchProxyResult.class) {
          obj = this.E.getValue();
       }
       return obj.floatValue();
    }
    public final Runnable X8(){
       Object obj = PatchProxy.apply(null, this, ProfileCropVideoSizePresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.D.getValue();
    }
    public final void Y8(){
       if (PatchProxy.applyVoid(null, this, ProfileCropVideoSizePresenter.class, "7")) {
          return;
       }
       if (this.C != null) {
          ProfileCropVideoSizePresenter tz = this.z;
          int i = 1;
          if (tz == null || tz.isRunning() != i) {
             tz = this.A;
             if (tz == null || tz.isRunning() != i) {
                boolean b = false;
                this.C = b;
                ProfileCropVideoSizePresenter ts = this.s;
                if (ts == null) {
                   a.S("mPreviewTop");
                }
                int i1 = 2;
                ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(ts, View.ALPHA, new float[i1]{0x3f800000,0});
                a.o(objectAnimat, "ObjectAnimator.ofFloat\(m¡­op, View.ALPHA, 1.0f, 0f\)");
                ProfileCropVideoSizePresenter tt = this.t;
                if (tt == null) {
                   a.S("mPreviewBottom");
                }
                ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(tt, View.ALPHA, new float[i1]{0x3f800000,0});
                a.o(objectAnimat1, "ObjectAnimator.ofFloat\(m¡­om, View.ALPHA, 1.0f, 0f\)");
                AnimatorSet uAnimatorSet = new AnimatorSet();
                Animator[] uAnimatorArr = new Animator[i1];
                uAnimatorArr[b] = objectAnimat;
                uAnimatorArr[i] = objectAnimat1;
                uAnimatorSet.playTogether(uAnimatorArr);
                uAnimatorSet.setDuration(500);
                uAnimatorSet.addListener(new ProfileCropVideoSizePresenter$f(uAnimatorSet, this, objectAnimat, objectAnimat1));
                uAnimatorSet.start();
                this.A = uAnimatorSet;
                k1.r(this.X8(), 1500);
             }
          }
       }
       return;
    }
    public final void Z8(){
       ProfileCropVideoSizePresenter tx1;
       ViewGroup$LayoutParams layoutParams;
       int i;
       ProfileCropVideoSizePresenter tr;
       if (PatchProxy.applyVoid(null, this, ProfileCropVideoSizePresenter.class, "10")) {
          return;
       }
       Activity activity = this.getActivity();
       if (activity != null) {
          a.o(activity, "activity ?: return");
          ProfileCropVideoSizePresenter tx = this.x;
          String str = "mVideoInfo";
          if (tx == null) {
             a.S(str);
          }
          if (tx.getVideoWidth()) {
             tx = this.x;
             if (tx == null) {
                a.S(str);
             }
             if (tx.getVideoHeight()) {
                this.B = n.k(activity);
                String str1 = "mMediaContainer";
                String str2 = "mTextureView";
                String str3 = "mScrollView";
                if (k0.s()) {
                   tx1 = this.x;
                   if (tx1 == null) {
                      a.S(str);
                   }
                   float f = 0x3f8ccccd;
                   if ((float)tx1.getVideoHeight() - ((float)this.B * f) < 0) {
                      tx1 = this.r;
                      if (tx1 == null) {
                         a.S(str3);
                      }
                      layoutParams = tx1.getLayoutParams();
                      i = (int)((float)this.B * f);
                      layoutParams.height = i;
                      ProfileCropVideoSizePresenter tx2 = this.x;
                      if (tx2 == null) {
                         a.S(str);
                      }
                      i = i * tx2.getVideoWidth();
                      tx2 = this.x;
                      if (tx2 == null) {
                         a.S(str);
                      }
                      layoutParams.width = i / tx2.getVideoHeight();
                      tr = this.r;
                      if (tr == null) {
                         a.S(str3);
                      }
                      tr.setLayoutParams(layoutParams);
                      tx1 = this.p;
                      if (tx1 == null) {
                         a.S(str1);
                      }
                      layoutParams = tx1.getLayoutParams();
                      int i1 = (int)((float)this.B * f);
                      layoutParams.height = i1;
                      tr = this.x;
                      if (tr == null) {
                         a.S(str);
                      }
                      i1 = i1 * tr.getVideoWidth();
                      tr = this.x;
                      if (tr == null) {
                         a.S(str);
                      }
                      layoutParams.width = i1 / tr.getVideoHeight();
                      ProfileCropVideoSizePresenter tp = this.p;
                      if (tp == null) {
                         a.S(str1);
                      }
                      tp.setLayoutParams(layoutParams);
                      tx1 = this.q;
                      if (tx1 == null) {
                         a.S(str2);
                      }
                      layoutParams = tx1.getLayoutParams();
                      int i2 = (int)((float)this.B * f);
                      layoutParams.height = i2;
                      tp = this.x;
                      if (tp == null) {
                         a.S(str);
                      }
                      i2 = i2 * tp.getVideoWidth();
                      tp = this.x;
                      if (tp == null) {
                         a.S(str);
                      }
                      layoutParams.width = i2 / tp.getVideoHeight();
                      tx = this.q;
                      if (tx == null) {
                         a.S(str2);
                      }
                      tx.setLayoutParams(layoutParams);
                   }
                }
                tx1 = this.q;
                if (tx1 == null) {
                   a.S(str2);
                }
                layoutParams = tx1.getLayoutParams();
                tr = this.B;
                layoutParams.width = tr;
                ProfileCropVideoSizePresenter tx3 = this.x;
                if (tx3 == null) {
                   a.S(str);
                }
                i = tr * tx3.getVideoHeight();
                tx3 = this.x;
                if (tx3 == null) {
                   a.S(str);
                }
                layoutParams.height = i / tx3.getVideoWidth();
                ProfileCropVideoSizePresenter tq = this.q;
                if (tq == null) {
                   a.S(str2);
                }
                tq.setLayoutParams(layoutParams);
                tx1 = this.q;
                if (tx1 == null) {
                   a.S(str2);
                }
                int i3 = tx1.getLayoutParams().height - (int)((float)this.B * this.W8());
                tq = this.p;
                if (tq == null) {
                   a.S(str1);
                }
                ViewGroup$LayoutParams layoutParams1 = tq.getLayoutParams();
                layoutParams1.width = this.B;
                ProfileCropVideoSizePresenter tr1 = this.r;
                if (tr1 == null) {
                   a.S(str3);
                }
                layoutParams1.height = tr1.getHeight() + i3;
                tr1 = this.p;
                if (tr1 == null) {
                   a.S(str1);
                }
                tr1.setLayoutParams(layoutParams1);
                tx = this.r;
                if (tx == null) {
                   a.S(str3);
                }
                ViewGroup$LayoutParams layoutParams2 = tx.getLayoutParams();
                layoutParams2.width = -1;
                layoutParams2.height = -1;
                tq = this.r;
                if (tq == null) {
                   a.S(str3);
                }
                tq.setLayoutParams(layoutParams2);
                tx = this.r;
                if (tx == null) {
                   a.S(str3);
                }
                tx.post(new ProfileCropVideoSizePresenter$i(this, i3));
             }
          }
       }
    label_01a5 :
       return;
    }
    public void doBindView(View p0){
       View view;
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileCropVideoSizePresenter.class, "3")) {
          return;
       }
       a.p(p0, "view");
       view = m1.f(p0, R.id.media_container);
       a.o(view, "ViewBindUtils.bindWidget¡­ew, R.id.media_container\)");
       this.p = view;
       view = m1.f(p0, R.id.texture_view);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.texture_view\)");
       this.q = view;
       view = m1.f(p0, R.id.texture_scrollView);
       a.o(view, "ViewBindUtils.bindWidget¡­ R.id.texture_scrollView\)");
       this.r = view;
       view = m1.f(p0, R.id.preview_top);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.preview_top\)");
       this.s = view;
       view = m1.f(p0, R.id.preview_bottom);
       a.o(view, "ViewBindUtils.bindWidget¡­iew, R.id.preview_bottom\)");
       this.t = view;
       view = m1.f(p0, R.id.crop_rect);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.crop_rect\)");
       this.u = view;
       view = m1.f(p0, R.id.preview_crop_tip);
       a.o(view, "ViewBindUtils.bindWidget¡­w, R.id.preview_crop_tip\)");
       this.v = view;
       int i = 0x7f0a31fb;
       View view1 = m1.f(p0, i);
       a.o(view1, "ViewBindUtils.bindWidget¡­iew, R.id.preview_upload\)");
       this.w = view1;
       if (j2.a()) {
          ProfileCropVideoSizePresenter tw = this.w;
          if (tw == null) {
             a.S("mUploadButton");
          }
          ViewGroup$LayoutParams layoutParams = tw.getLayoutParams();
          Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
          layoutParams.bottomMargin = a1.e(50.00f);
       }
       m1.b(p0, new ProfileCropVideoSizePresenter$b(this), i);
       ProfileCropVideoSizePresenter ts = this.s;
       if (ts == null) {
          a.S("mPreviewTop");
       }
       ts.setOnTouchListener(new ProfileCropVideoSizePresenter$c(this));
       ts = this.t;
       if (ts == null) {
          a.S("mPreviewBottom");
       }
       ts.setOnTouchListener(new ProfileCropVideoSizePresenter$d(this));
       ts = this.p;
       if (ts == null) {
          a.S("mMediaContainer");
       }
       ts.setOnTouchListener(new ProfileCropVideoSizePresenter$e(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, ProfileCropVideoSizePresenter.class, "4")) {
          return;
       }
       Object obj = this.r8("PROFILE_PREVIEW_VIDEO_INFO");
       a.o(obj, "inject\(AccessIds.PROFILE_PREVIEW_VIDEO_INFO\)");
       this.x = obj;
       obj = this.r8("PROFILE_PREVIEW_MEDIA_PREPARED");
       a.o(obj, "inject\(AccessIds.PROFILE_PREVIEW_MEDIA_PREPARED\)");
       this.y = obj;
       return;
    }
}
