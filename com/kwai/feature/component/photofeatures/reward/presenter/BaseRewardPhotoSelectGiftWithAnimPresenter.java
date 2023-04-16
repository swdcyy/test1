package com.kwai.feature.component.photofeatures.reward.presenter.BaseRewardPhotoSelectGiftWithAnimPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.feature.component.photofeatures.reward.presenter.BaseRewardPhotoSelectGiftWithAnimPresenter$b;
import com.kwai.feature.component.photofeatures.reward.presenter.BaseRewardPhotoSelectGiftWithAnimPresenter$3;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import nz5.o;
import erd.g;
import crd.b;
import brd.t;
import nz5.p;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleObserver;
import com.kwai.feature.component.photofeatures.reward.model.response.RewardPanelInfoResponse$PanelInfo;
import java.util.List;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.kwai.feature.component.photofeatures.reward.widget.BreathRewardItemView;
import com.kwai.feature.component.photofeatures.reward.model.response.RewardPanelInfoResponse$KsCoinLevel;
import java.util.Objects;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import android.widget.TextView;
import android.text.TextPaint;
import fz5.h;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.io.File;
import wy5.a;
import java.lang.StringBuilder;
import wy5.b;
import q87.c;
import android.net.Uri;
import ekd.x0;
import ub.b;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.utility.TextUtils;
import iz5.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import nz5.e;
import android.view.View$OnClickListener;
import android.widget.RelativeLayout;
import android.widget.LinearLayout;
import com.airbnb.lottie.LottieTask;
import nz5.k;
import w4.j;
import java.io.FileNotFoundException;
import nz5.g;
import java.lang.Runnable;
import nz5.m;
import ez5.g;
import android.view.ViewParent;
import android.widget.ImageView;
import android.view.ViewPropertyAnimator;
import ez5.e;
import ez5.g$b;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kuaishou.android.model.mix.w;
import nz5.f;
import java.lang.Throwable;
import java.lang.Integer;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.kwai.feature.component.photofeatures.reward.model.response.RewardRequireResponse;
import wkd.b;
import q95.c;
import android.util.SparseArray;
import q95.d;
import lnc.a1;
import lnc.ja;
import android.graphics.drawable.Drawable;
import com.airbnb.lottie.LottieAnimationView;
import nz5.l;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.animation.AnimatorSet;
import android.graphics.PointF;
import com.yxcorp.utility.n;
import ez5.a;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import th0.m;
import android.animation.TimeInterpolator;
import ez5.c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import ez5.f;
import android.animation.Animator$AnimatorListener;
import ez5.d;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import com.google.gson.JsonObject;
import java.lang.Number;
import com.google.gson.JsonElement;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import k2b.e0;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.yxcorp.gifshow.util.rx.RxBus;
import gz5.b;
import lz5.a;
import dz5.o;
import java.lang.Boolean;
import lz5.b;
import nz5.i;
import nz5.h;
import ekd.k1;
import io.reactivex.subjects.PublishSubject;
import ekd.m1;
import com.kwai.feature.component.photofeatures.reward.presenter.BaseRewardPhotoSelectGiftWithAnimPresenter$a;
import nz5.j;
import android.view.View$OnTouchListener;
import com.kwai.feature.component.photofeatures.reward.fragment.RewardPhotoPanelDialogFragment;

public abstract class BaseRewardPhotoSelectGiftWithAnimPresenter extends PresenterV2	// class@00125c
{
    public boolean A;
    public g B;
    public final AnimatorListenerAdapter C;
    public PublishSubject D;
    public RewardPhotoPanelDialogFragment E;
    public RewardPanelInfoResponse$PanelInfo F;
    public QPhoto G;
    public t H;
    public String I;
    public PublishSubject J;
    public a K;
    public PublishSubject L;
    public int M;
    public RewardPanelInfoResponse$KsCoinLevel N;
    public final LifecycleObserver O;
    public LottieAnimationView p;
    public LinearLayout q;
    public TextView r;
    public RelativeLayout s;
    public LottieAnimationView t;
    public View u;
    public View v;
    public View w;
    public View x;
    public Animator y;
    public Animator z;

    public void BaseRewardPhotoSelectGiftWithAnimPresenter(){
       super();
       this.C = new BaseRewardPhotoSelectGiftWithAnimPresenter$b(this);
       this.M = 1;
       this.O = new BaseRewardPhotoSelectGiftWithAnimPresenter$3(this);
    }
    public void E8(){
       File uFile;
       BreathRewardItemView b;
       int i3;
       Object[] objArray1;
       Object obj = this;
       BaseRewardPhotoSelectGiftWithAnimPresenter uBaseRewardP = BaseRewardPhotoSelectGiftWithAnimPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, uBaseRewardP, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, obj, uBaseRewardP, "5")) {
          obj.X7(obj.H.subscribe(new o(obj)));
          obj.X7(obj.L.subscribe(new p(obj)));
          obj.E.getLifecycle().addObserver(obj.O);
       }
       RewardPanelInfoResponse$PanelInfo mKsCoinLevel = obj.F.mKsCoinLevels;
       if (!PatchProxy.applyVoidOneRefs(mKsCoinLevel, obj, uBaseRewardP, "7")) {
          int i = 0;
          int i1 = 0;
          String str = 1;
          while (i1 < mKsCoinLevel.size()) {
             BreathRewardItemView uBreathRewar = a.i(obj.q, this.R8());
             RewardPanelInfoResponse$KsCoinLevel ksCoinLevel = mKsCoinLevel.get(i1);
             Objects.requireNonNull(uBreathRewar);
             if (!PatchProxy.applyVoidOneRefs(ksCoinLevel, uBreathRewar, BreathRewardItemView.class, "9")) {
                a.p(ksCoinLevel, "coinLevel");
                uBreathRewar.a(ksCoinLevel);
                BreathRewardItemView c = uBreathRewar.c;
                String str2 = "mRewardGiftName";
                if (c == null) {
                   a.S(str2);
                }
                c.setText(ksCoinLevel.mGiftName);
                c = uBreathRewar.c;
                if (c == null) {
                   a.S(str2);
                }
                TextPaint paint = c.getPaint();
                a.o(paint, "mRewardGiftName.paint");
                paint.setFakeBoldText(str);
                RewardPanelInfoResponse$KsCoinLevel mGiftId = ksCoinLevel.mGiftId;
                h oh = h.class;
                if (PatchProxy.isSupport(oh)) {
                   uFile = PatchProxy.applyOneRefs(Long.valueOf(mGiftId), objArray, oh, "7");
                   if (uFile != PatchProxyResult.class) {
                   }else {
                   label_00b9 :
                      uFile = h.b();
                      String str4 = "RewardCacheResourceUtil2";
                      if (a.c() && (uFile == null || !uFile.exists())) {
                         objArray1 = new Object[i];
                         b.C().t(str4, "打赏资源包不存在", objArray1);
                      }else {
                         File uFile1 = new File(uFile, mGiftId+".png");
                         if (!uFile1.exists()) {
                            objArray1 = new Object[i];
                            b.C().t(str4, "档位图片文件不存在", objArray1);
                         }else {
                            uFile = uFile1;
                         }
                      }
                      uFile = objArray;
                   }
                }else {
                   goto label_00b9 ;
                }
                str2 = "mRewardGiftImage";
                if (uFile != null) {
                   Uri uri = x0.e(uFile);
                   b = uBreathRewar.b;
                   if (b == null) {
                      a.S(str2);
                   }
                   b.B(uri, i, i, objArray);
                }else {
                   c = uBreathRewar.b;
                   if (c == null) {
                      a.S(str2);
                   }
                   mGiftId = ksCoinLevel.mPosition;
                   int i4 = 0x7f081e42;
                   if (mGiftId != null) {
                      if (mGiftId != str) {
                         if (mGiftId != 2) {
                            if (mGiftId == 3) {
                               i4 = 0x7f081e40;
                            }
                         }else {
                            i4 = 0x7f081e41;
                         }
                      }else {
                         i4 = 0x7f081e3f;
                      }
                   }
                   c.setImageResource(i4);
                }
                c = uBreathRewar.e;
                str2 = "mRewardDiscountPrice";
                if (c == null) {
                   a.S(str2);
                }
                c.setText(TextUtils.I(ksCoinLevel.mOverrideDisplayName));
                c = uBreathRewar.e;
                if (c == null) {
                   a.S(str2);
                }
                paint = c.getPaint();
                a.o(paint, "mRewardDiscountPrice.paint");
                paint.setFakeBoldText(str);
                c = uBreathRewar.d;
                String str3 = "mRewardOriginPrice";
                if (c == null) {
                   a.S(str3);
                }
                c.setText(TextUtils.I(ksCoinLevel.mDisplayName));
                c = uBreathRewar.e;
                if (c == null) {
                   a.S(str2);
                }
                str2 = "mRewardOriginPrice.paint";
                if (!TextUtils.x(c.getText())) {
                   BreathRewardItemView d = uBreathRewar.d;
                   if (d == null) {
                      a.S(str3);
                   }
                   c = uBreathRewar.d;
                   if (c == null) {
                      a.S(str3);
                   }
                   int i2 = c.getPaintFlags() | 0x10;
                   d.setPaintFlags(i2);
                   d = uBreathRewar.d;
                   if (d == null) {
                      a.S(str3);
                   }
                   TextPaint paint1 = d.getPaint();
                   a.o(paint1, str2);
                   paint1.setFakeBoldText(i);
                }else {
                   c = uBreathRewar.d;
                   if (c == null) {
                      a.S(str3);
                   }
                   BreathRewardItemView d1 = uBreathRewar.d;
                   if (d1 == null) {
                      a.S(str3);
                   }
                   i3 = d1.getPaintFlags() & 0xef;
                   c.setPaintFlags(i3);
                   c = uBreathRewar.d;
                   if (c == null) {
                      a.S(str3);
                   }
                   paint = c.getPaint();
                   a.o(paint, str2);
                   paint.setFakeBoldText(str);
                }
             }
             str = String.valueOf(ksCoinLevel.mGiftId);
             String str1 = String.valueOf(ksCoinLevel.type);
             BaseRewardPhotoSelectGiftWithAnimPresenter g = obj.G;
             if (!PatchProxy.applyVoidThreeRefs(str, str1, g, null, a.class, "24")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "GIFT_ITEM";
                i3 oi3 = i3.f();
                oi3.d("gift_id", str);
                oi3.d("gift_type", str1);
                uElementPack.params = oi3.toString();
                u1.u0(3, uElementPack, a.a(g));
             }
             uBreathRewar.setOnClickListener(new e(obj, ksCoinLevel));
             obj.q.addView(uBreathRewar);
             i1 = i1 + 1;
          }
          obj.Z8(mKsCoinLevel.get(i), str);
       }
       try{
          LottieTask lottieTask = h.a();
          if (lottieTask != null) {
             lottieTask.addListener(new k(obj));
          }
       }catch(java.io.FileNotFoundException e0){
          e0.printStackTrace();
       }
       obj.q.post(new g(obj));
       return;
    }
    public void J8(){
       BaseRewardPhotoSelectGiftWithAnimPresenter uBaseRewardP = BaseRewardPhotoSelectGiftWithAnimPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uBaseRewardP, "4")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uBaseRewardP, "6")) {
          this.E.getLifecycle().removeObserver(this.O);
       }
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, BaseRewardPhotoSelectGiftWithAnimPresenter.class, "14")) {
          return;
       }
       BaseRewardPhotoSelectGiftWithAnimPresenter tB = this.B;
       if (tB == null) {
          return;
       }
       m om = new m(this);
       Objects.requireNonNull(tB);
       if (!PatchProxy.applyVoidOneRefs(om, tB, g.class, "3")) {
          g d = tB.d;
          if (d != null && (d.getParent() != null && tB.f == null)) {
             tB.f = true;
             long l = (long)200;
             tB.d.animate().setDuration(l).alpha(0).start();
             tB.c.animate().setDuration(l).alpha(0).start();
             tB.e.animate().setStartDelay(0).setDuration(l).alpha(0).start();
             tB.a.postDelayed(new e(tB, om), l);
          }else {
             om.a();
          }
       }
       this.B = null;
       return;
    }
    public abstract int R8();
    public LinearLayout S8(){
       return this.q;
    }
    public boolean V8(){
       boolean b = ((this.N.mKsCoin * (long)this.M) - this.F.mKsCoinBalance <= 0)? true: false;
       return b;
    }
    public void W8(){
       if (PatchProxy.applyVoid(null, this, BaseRewardPhotoSelectGiftWithAnimPresenter.class, "13")) {
          return;
       }
       w.E1(this.G.getPhotoMeta(), false);
       this.u.postDelayed(new f(this), 2000);
       return;
    }
    public void X8(Throwable p0,int p1){
       BaseRewardPhotoSelectGiftWithAnimPresenter uBaseRewardP = BaseRewardPhotoSelectGiftWithAnimPresenter.class;
       if (PatchProxy.isSupport(uBaseRewardP) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uBaseRewardP, "12")) {
          return;
       }
       w.E1(this.G.getPhotoMeta(), false);
       this.s.setEnabled(true);
       ExceptionHandler.handleException(a.a().a(), p0);
       return;
    }
    public void Y8(RewardRequireResponse p0){
       BaseRewardPhotoSelectGiftWithAnimPresenter e;
       BaseRewardPhotoSelectGiftWithAnimPresenter b;
       PropertyValuesHolder[] propertyValu1;
       float[] uofloatArray1;
       g og = this;
       BaseRewardPhotoSelectGiftWithAnimPresenter uBaseRewardP = BaseRewardPhotoSelectGiftWithAnimPresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, og, uBaseRewardP, "11")) {
          return;
       }
       c uoc = b.a(0x6258c4a3);
       Objects.requireNonNull(uoc);
       c uoc1 = c.class;
       int i = 1;
       if (!PatchProxy.isSupport(uoc1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), uoc, uoc1, "1")) {
          d uod = uoc.a.get(i);
          if (uod == null || uod.b()) {
             uoc.a.put(i, new d());
          }
          Objects.toString(uoc.a);
       }
       BaseRewardPhotoSelectGiftWithAnimPresenter r = og.r;
       String str = (TextUtils.x(og.F.mButtonRewardAgainText))? a1.p(R.string.arg_RES_7f100a26): og.F.mButtonRewardAgainText;
       r.setText(str);
       g og1 = g.class;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, og, uBaseRewardP, "17")) {
          ja.a();
          b = og.B;
          if (b != null && (!PatchProxy.applyVoid(objArray, b, og1, "2") && b.d.getParent() != null)) {
             b.d.setImageDrawable(objArray);
             b.a.removeView(b.d);
             b.c.f();
             b.c.setVisibility(4);
             b.b = objArray;
          }
       label_00aa :
          g og2 = new g(this.m8());
          og.B = og2;
          og2.b = new l(og);
          KwaiImageView giftView = og.q.getChildAt(og.N.mPosition).getGiftView();
          BaseRewardPhotoSelectGiftWithAnimPresenter b1 = og.B;
          BaseRewardPhotoSelectGiftWithAnimPresenter p = og.p;
          BaseRewardPhotoSelectGiftWithAnimPresenter x = og.x;
          Objects.requireNonNull(b1);
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          e = 2;
          if (!PatchProxy.applyVoidThreeRefs(giftView, p, x, b1, g.class, "1") && giftView.getDrawable() != null) {
             ImageView imageView = PatchProxy.applyOneRefs(giftView, b1, og1, "5");
             if (imageView != patchProxyRe) {
             }else {
                imageView = new ImageView(giftView.getContext());
                imageView.setImageDrawable(giftView.getDrawable());
                b1.a.addView(imageView);
                ViewGroup$MarginLayoutParams layoutParams = imageView.getLayoutParams();
                layoutParams.width = giftView.getWidth();
                layoutParams.height = giftView.getHeight();
                int[] ointArray2 = new int[e];
                giftView.getLocationOnScreen(ointArray2);
                int[] ointArray3 = new int[e];
                b1.a.getLocationOnScreen(ointArray3);
                layoutParams.topMargin = ((ointArray2[i] + (giftView.getHeight() / 2)) - (layoutParams.height / e)) - ointArray3[i];
                layoutParams.leftMargin = (ointArray2[0] + (giftView.getWidth() / e)) - (layoutParams.width / e);
                imageView.setLayoutParams(layoutParams);
             }
             b1.d = imageView;
             b1.e = x;
             b1.c = p;
             AnimatorSet uAnimatorSet1 = new AnimatorSet();
             PointF pointF = new PointF(0, 0);
             PointF pointF1 = PatchProxy.applyTwoRefs(giftView, p, b1, og1, "4");
             if (pointF1 != patchProxyRe) {
             }else {
                int[] ointArray = n.p(giftView);
                int[] ointArray1 = n.p(p);
                pointF1 = new PointF((((float)ointArray1[0] + ((float)(p.getWidth() - giftView.getWidth()) / 2.00f)) - (float)ointArray[0]), (((float)ointArray1[i] + ((float)(p.getHeight() - giftView.getWidth()) / 2.00f)) - (float)ointArray[i]));
             }
             Object[] objArray1 = new Object[e];
             objArray1[0] = pointF;
             objArray1[i] = pointF1;
             ValueAnimator valueAnimato = ValueAnimator.ofObject(new a(new PointF(pointF.x, (pointF1.y * 0x3f19999a))), objArray1);
             valueAnimato.setInterpolator(new m());
             valueAnimato.addUpdateListener(new c(imageView));
             float f1 = (float)a1.d(0x7f070e15) / (float)giftView.getWidth();
             propertyValu1 = new PropertyValuesHolder[e];
             uofloatArray1 = new float[e];
             int i4 = 0x3f800000;
             int i5 = 0;
             uofloatArray1[i5] = i4;
             uofloatArray1[i] = f1;
             propertyValu1[i5] = PropertyValuesHolder.ofFloat(View.SCALE_X, uofloatArray1);
             uofloatArray1 = new float[e];
             uofloatArray1[i5] = i4;
             uofloatArray1[i] = f1;
             propertyValu1[i] = PropertyValuesHolder.ofFloat(View.SCALE_Y, uofloatArray1);
             Animator[] uAnimatorArr1 = new Animator[e];
             uAnimatorArr1[i5] = valueAnimato;
             uAnimatorArr1[i] = ObjectAnimator.ofPropertyValuesHolder(imageView, propertyValu1);
             uAnimatorSet1.playTogether(uAnimatorArr1);
             uAnimatorSet1.setDuration(400);
             uAnimatorSet1.addListener(new f(b1));
             p.postDelayed(new d(p), 300);
             uAnimatorSet1.start();
          }
          if (!PatchProxy.applyVoid(null, og, uBaseRewardP, "22")) {
             n.F(og.E.getDialog().getWindow());
             PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[i];
             float[] uofloatArray = new float[e];
             int i2 = 0;
             int i3 = 0;
             uofloatArray[i3] = i2;
             float f = (float)(og.u.getHeight() + og.v.getHeight());
             uofloatArray[i] = f;
             propertyValu[i3] = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, uofloatArray);
             propertyValu1 = new PropertyValuesHolder[i];
             uofloatArray1 = new float[e];
             uofloatArray1[i3] = i2;
             uofloatArray1[i] = f;
             propertyValu1[i3] = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, uofloatArray1);
             PropertyValuesHolder[] propertyValu2 = new PropertyValuesHolder[i];
             float[] uofloatArray2 = new float[e];
             uofloatArray2[i3] = i2;
             uofloatArray2[i] = f;
             propertyValu2[i3] = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, uofloatArray2);
             AnimatorSet uAnimatorSet = new AnimatorSet();
             Animator[] uAnimatorArr = new Animator[]{ObjectAnimator.ofPropertyValuesHolder(og.u, propertyValu),ObjectAnimator.ofPropertyValuesHolder(og.v, propertyValu1),ObjectAnimator.ofPropertyValuesHolder(og.w, propertyValu2)};
             uAnimatorSet.playTogether(uAnimatorArr);
             uAnimatorSet.setDuration(300);
             uAnimatorSet.start();
          }
          og.x.animate().setStartDelay(500).setDuration(200).alpha(0x3f800000).start();
       }
       uBaseRewardP = og.G;
       RewardPanelInfoResponse$KsCoinLevel mKsCoin = og.N.mKsCoin;
       BaseRewardPhotoSelectGiftWithAnimPresenter i1 = og.I;
       e = og.E;
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidFourRefs(uBaseRewardP, Long.valueOf(mKsCoin), i1, e, null, a.class, "5")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "SUCCESS_PAYMENT_TAOST";
          JsonObject jsonObject = new JsonObject();
          jsonObject.a0("success_reward_amount", Long.valueOf(mKsCoin));
          jsonObject.c0("pay_source", i1);
          uElementPack.params = jsonObject.toString();
          u1.B0(new ShowMetaData().setLogPage(e).setType(0).setElementPackage(uElementPack).setContentPackage(a.a(uBaseRewardP)).setFeedLogCtx(uBaseRewardP.getFeedLogCtx()));
       }
       w.f0(og.G.getPhotoMeta());
       RxBus.f.b(new b(og.G, og.K));
       o.c(og.G);
       return;
    }
    public final void Z8(RewardPanelInfoResponse$KsCoinLevel p0,boolean p1){
       int i;
       BreathRewardItemView childAt;
       RewardPanelInfoResponse$KsCoinLevel ksCoinLevel = this;
       Object obj = p0;
       BaseRewardPhotoSelectGiftWithAnimPresenter uBaseRewardP = BaseRewardPhotoSelectGiftWithAnimPresenter.class;
       if (PatchProxy.isSupport(uBaseRewardP) && PatchProxy.applyVoidTwoRefs(obj, Boolean.valueOf(p1), ksCoinLevel, uBaseRewardP, "8")) {
          return;
       }
       ksCoinLevel.N = obj;
       uBaseRewardP = ksCoinLevel.K;
       Objects.requireNonNull(uBaseRewardP);
       if (!PatchProxy.applyVoidOneRefs(obj, uBaseRewardP, a.class, "1")) {
          a.p(obj, "level");
          b uob = new b(obj.mGiftId, 1, obj.mKsCoin, obj.mOriginalKsCoin, obj.mSubsidyCoin, obj.type);
          if (uBaseRewardP.a.isEmpty()) {
             uBaseRewardP.a.add(false, v3);
          }else {
             uBaseRewardP.a.set(false, v3);
          }
       }
       if (p1) {
          i = 0;
          while (i < ksCoinLevel.q.getChildCount()) {
             childAt = ksCoinLevel.q.getChildAt(i);
             if (i == obj.mPosition) {
                childAt.post(new i(childAt));
                k1.r(new h(childAt), 500);
                ksCoinLevel.J.onNext(Integer.valueOf(i));
             }else {
                childAt.setSelected(false);
             }
             i = i + 1;
          }
       }else {
          i = -1;
          childAt = null;
          BreathRewardItemView uBreathRewar = childAt;
          int i1 = 0;
          while (i1 < ksCoinLevel.q.getChildCount()) {
             BreathRewardItemView childAt1 = ksCoinLevel.q.getChildAt(i1);
             if (i1 == obj.mPosition) {
                i = i1;
                childAt = childAt1;
             }
             if (childAt1.isSelected()) {
                uBreathRewar = childAt1;
             }
             i1 = i1 + 1;
          }
          if (childAt != null && uBreathRewar != null) {
             if (childAt != uBreathRewar) {
                childAt.setSelected(true);
                uBreathRewar.setSelected(false);
                ksCoinLevel.J.onNext(Integer.valueOf(i));
             }
             childAt.c();
          }
       }
       this.b9();
       return;
    }
    public void a9(){
       BaseRewardPhotoSelectGiftWithAnimPresenter uBaseRewardP = BaseRewardPhotoSelectGiftWithAnimPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uBaseRewardP, "21")) {
          return;
       }
       BaseRewardPhotoSelectGiftWithAnimPresenter ty = this.y;
       if (ty != null && ty.isRunning()) {
          this.y.cancel();
       }
       if (this.z == null) {
          ObjectAnimator objectAnimat = PatchProxy.apply(objArray, this, uBaseRewardP, "19");
          if (objectAnimat != PatchProxyResult.class) {
          }else {
             PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3f733333,0x3f800000}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3f733333,0x3f800000}),PropertyValuesHolder.ofFloat(View.ALPHA, new float[2]{0x3f000000,0x3f800000})};
             objectAnimat = ObjectAnimator.ofPropertyValuesHolder(this.s, propertyValu);
             objectAnimat.setDuration(200);
          }
          this.z = objectAnimat;
       }
       if (this.z.isRunning()) {
          this.z.cancel();
       }
       this.z.start();
       return;
    }
    public void b9(){
       BaseRewardPhotoSelectGiftWithAnimPresenter tr;
       String str;
       RewardPanelInfoResponse$PanelInfo mButtonRewar;
       if (PatchProxy.applyVoid(null, this, BaseRewardPhotoSelectGiftWithAnimPresenter.class, "9")) {
          return;
       }
       boolean i = 0x7f1042f3;
       if (!this.V8()) {
          tr = this.r;
          str = (TextUtils.x(this.F.mButtonChargeText))? a1.p(i): this.F.mButtonChargeText;
          tr.setText(str);
       }else if(this.G.hasRewarded()){
          tr = this.r;
          str = (TextUtils.x(this.F.mButtonRewardAgainText))? a1.p(R.string.arg_RES_7f100a26): this.F.mButtonRewardAgainText;
          tr.setText(str);
       }else {
          tr = this.r;
          str = (TextUtils.x(this.F.mButtonText))? a1.p(i): this.F.mButtonText;
          tr.setText(str);
       }
       if (w.w0(this.G.getPhotoMeta())) {
          return;
       }else {
          tr = this.s;
          i = (this.N.mKsCoin)? true: false;
          tr.setEnabled(i);
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseRewardPhotoSelectGiftWithAnimPresenter.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a28d7);
       this.r = m1.f(p0, 0x7f0a4240);
       this.s = m1.f(p0, 0x7f0a0ef5);
       this.t = m1.f(p0, 0x7f0a3607);
       this.p = m1.f(p0, 0x7f0a361b);
       this.u = m1.f(p0, 0x7f0a0959);
       this.v = m1.f(p0, 0x7f0a0958);
       this.w = m1.f(p0, 0x7f0a14f6);
       this.x = m1.f(p0, 0x7f0a361c);
       this.s.setOnClickListener(new BaseRewardPhotoSelectGiftWithAnimPresenter$a(this));
       this.r.getPaint().setFakeBoldText(true);
       this.s.setOnTouchListener(new j(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, BaseRewardPhotoSelectGiftWithAnimPresenter.class, "1")) {
          return;
       }
       this.D = this.r8("REWARD_BEFORE_REWARD_GIFT_SUBJECT");
       this.E = this.r8("DETAIL_REWARD_PHOTO_FRAGMENT");
       this.F = this.r8("DETAIL_REWARD_PANEL_INFO");
       this.G = this.r8("DETAIL_REWARD_PHOTO");
       this.H = this.r8("DETAIL_REWARD_COIN_BALANCE_UPDATE_EVENT");
       this.I = this.r8("REWARD_DIALOG");
       this.J = this.r8("REWARD_GIFT_SELECT_SUBJECT");
       this.K = this.r8("REWARD_GIFT_BAG");
       this.L = this.r8("REWARD_GIFT_COUNT_CHANGE_SUBJECT");
       return;
    }
}
