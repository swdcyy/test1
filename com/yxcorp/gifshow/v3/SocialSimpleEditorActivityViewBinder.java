package com.yxcorp.gifshow.v3.SocialSimpleEditorActivityViewBinder;
import com.yxcorp.gifshow.v3.AbsDefaultEditorActivityViewBinder;
import com.yxcorp.gifshow.v3.SocialSimpleEditorActivityViewBinder$a;
import nsd.u;
import lnc.a1;
import c35.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.animation.AnimatorSet;
import java.util.ArrayList;
import com.yxcorp.gifshow.v3.SocialSimpleEditorActivityViewBinder$b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.viewbinder.BaseViewBinder;
import t36.f;
import ooc.j0;
import lnc.r5;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import kotlin.Pair;
import com.yxcorp.gifshow.v3.AbsEditorActivityViewBinder;
import java.util.Objects;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import android.content.Intent;
import android.app.Activity;
import kotlin.Triple;
import faa.a;
import q87.c;
import android.view.ViewGroup;
import com.yxcorp.gifshow.model.RectInfo;
import android.graphics.RectF;
import java.lang.Number;
import java.io.Serializable;
import ekd.j0;
import com.yxcorp.gifshow.model.EditorSplashImageInfo;
import android.widget.RelativeLayout;
import android.content.Context;
import android.widget.FrameLayout$LayoutParams;
import com.yxcorp.gifshow.widget.FlexScreenStatusData;
import com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs;
import rkd.b;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import com.kuaishou.android.post.PostArguments;
import lq.i;
import com.kuaishou.android.post.SerialArg;
import com.kuaishou.android.post.SimpleEditParam;
import com.kuaishou.android.post.PostPageArg;
import com.kuaishou.android.post.SimpleEditParam$SocialParam;
import java.lang.Integer;
import android.graphics.drawable.Drawable;
import android.widget.RelativeLayout$LayoutParams;
import android.graphics.Bitmap;
import w46.b;
import java.lang.Boolean;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs$a;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;

public final class SocialSimpleEditorActivityViewBinder extends AbsDefaultEditorActivityViewBinder	// class@000d27
{
    public Triple A;
    public final ArrayList B;
    public ViewGroup C;
    public boolean D;
    public boolean E;
    public final SocialSimpleEditorActivityViewBinder$b F;
    public FrameLayout u;
    public KwaiImageView v;
    public String w;
    public AnimatorSet x;
    public GifshowActivity y;
    public j0 z;
    public static final int G;
    public static final int H;
    public static final float I;
    public static final float J;
    public static final SocialSimpleEditorActivityViewBinder$a K;

    static {
       SocialSimpleEditorActivityViewBinder.K = new SocialSimpleEditorActivityViewBinder$a(null);
       SocialSimpleEditorActivityViewBinder.G = a1.e(2.00f);
       SocialSimpleEditorActivityViewBinder.H = 1;
       SocialSimpleEditorActivityViewBinder.I = 0x3ff1c71c;
       SocialSimpleEditorActivityViewBinder.J = 2.11f;
    }
    public void SocialSimpleEditorActivityViewBinder(c p0){
       a.p(p0, "viewHost");
       super(p0);
       this.w = "";
       this.x = new AnimatorSet();
       this.B = new ArrayList();
       this.D = true;
       this.F = new SocialSimpleEditorActivityViewBinder$b(this);
    }
    public static final GifshowActivity H(SocialSimpleEditorActivityViewBinder p0){
       p0 = p0.y;
       if (p0 == null) {
          a.S("activity");
       }
       return p0;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, SocialSimpleEditorActivityViewBinder.class, "6")) {
          return;
       }
       super.onDestroy();
       SocialSimpleEditorActivityViewBinder tz = this.z;
       if (tz == null) {
          a.S("editorActivityViewModel");
       }
       tz.o0().c(this.F);
       this.B.clear();
       r5.b().d(this.w);
       return;
    }
    public void s(View p0){
       Triple second;
       SocialSimpleEditorActivityViewBinder obj3;
       Object[] objArray2;
       int b;
       RelativeLayout$LayoutParams layoutParams1;
       GifshowActivity gifshowActiv = this;
       Triple obj = p0;
       SocialSimpleEditorActivityViewBinder socialSimple = SocialSimpleEditorActivityViewBinder.class;
       if (PatchProxy.applyVoidOneRefs(obj, gifshowActiv, socialSimple, "1")) {
          return;
       }
       a.p(obj, "rootView");
       super.s(p0);
       Object[] objArray = null;
       c obj1 = PatchProxy.apply(objArray, gifshowActiv, socialSimple, "2");
       String str = "DEFAULT";
       String str1 = "SocialSimpleEditorActivityViewBinder";
       int i = 0;
       if (obj1 != PatchProxyResult.class) {
          objArray = obj1;
       }else {
          obj1 = this.z();
          Objects.requireNonNull(obj1, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
          gifshowActiv.y = obj1;
          ViewModel viewModel = ViewModelProviders.of(obj1).get(j0.class);
          a.o(viewModel, "ViewModelProviders.of\(ac¡­ityViewModel::class.java\)");
          gifshowActiv.z = viewModel;
          SocialSimpleEditorActivityViewBinder y = gifshowActiv.y;
          if (y == null) {
             a.S("activity");
          }
          String[] stringArrayE = y.getIntent().getStringArrayExtra("PHOTOS");
          if (stringArrayE == null) {
             stringArrayE = new String[i];
          }
          SocialSimpleEditorActivityViewBinder$a k1 = SocialSimpleEditorActivityViewBinder.K;
          SocialSimpleEditorActivityViewBinder y1 = gifshowActiv.y;
          if (y1 == null) {
             a.S("activity");
          }
          Triple triple = k1.b(y1);
          if (triple == null) {
             objArray2 = new Object[i];
             a.D().w(str1, "bindView bigimage info is null", objArray2);
          }else {
             Pair first = triple.getFirst();
             BaseViewBinder d = gifshowActiv.d;
             Objects.requireNonNull(d, "null cannot be cast to non-null type android.view.ViewGroup");
             if (!PatchProxy.applyVoidTwoRefs(first, d, gifshowActiv, socialSimple, "4")) {
                RectF tarRect = first.getSecond().getTargetRect();
                a.o(tarRect, "rectInfoPair.second.targetRect");
                int i1 = first.getFirst().intValue();
                obj3 = gifshowActiv.y;
                if (obj3 == null) {
                   a.S("activity");
                }
                EditorSplashImageInfo uEditorSplas = j0.e(obj3.getIntent(), "INTENT_EDITOR_SPLASH_IMAGE_INFO");
                if (uEditorSplas != null) {
                   RelativeLayout relativeLayo = new RelativeLayout(d.getContext());
                   i = -2;
                   FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(i, i);
                   layoutParams.gravity = 81;
                   if (i1 == 3) {
                      Objects.requireNonNull(SocialSimplePhotoFragmentViewBinderAbs.J1);
                      layoutParams.bottomMargin = (int)(((float)uEditorSplas.getFlexScreenStatusData().getDisplayHeight() - tarRect.top) + (float)SocialSimplePhotoFragmentViewBinderAbs.p1);
                   }else if(i1 == 2){
                      Objects.requireNonNull(SocialSimplePhotoFragmentViewBinderAbs.J1);
                      layoutParams.bottomMargin = (int)(((float)uEditorSplas.getFlexScreenStatusData().getDisplayHeight() - tarRect.top) + (float)SocialSimplePhotoFragmentViewBinderAbs.q1);
                   }else {
                      Objects.requireNonNull(SocialSimplePhotoFragmentViewBinderAbs.J1);
                      layoutParams.bottomMargin = (int)(((float)uEditorSplas.getFlexScreenStatusData().getDisplayHeight() - tarRect.top) + (float)SocialSimplePhotoFragmentViewBinderAbs.r1);
                   }
                   if (b.f()) {
                      Objects.requireNonNull(SocialSimplePhotoFragmentViewBinderAbs.J1);
                      layoutParams.bottomMargin = (int)(((float)uEditorSplas.getFlexScreenStatusData().getDisplayHeight() - tarRect.top) + (float)SocialSimplePhotoFragmentViewBinderAbs.s1);
                   }
                   relativeLayo.setLayoutParams(layoutParams);
                   d.addView(relativeLayo, layoutParams);
                   ImageView imageView = new ImageView(d.getContext());
                   SimpleEditParam dEFAULT1 = SimpleEditParam.DEFAULT;
                   a.o(dEFAULT1, str);
                   SimpleEditParam$SocialParam titleIcon = i.g().getSimpleEditParam().get(dEFAULT1).mSocialParam.titleIcon;
                   int i2 = 0x7f081c59;
                   if (titleIcon == null || !titleIcon.intValue()) {
                      imageView.setImageDrawable(a1.f(i2));
                   }else {
                      try{
                         imageView.setImageResource(titleIcon.intValue());
                      }catch(java.lang.Exception e0){
                         imageView.setImageDrawable(a1.f(i2));
                      }
                   }
                }
             }
          label_01ae :
             b = true;
             if (stringArrayE.length <= b) {
                Object[] objArray3 = new Object[0];
                a.D().w(str1, "bindView single photo", objArray3);
                gifshowActiv.E = b;
             }else {
                gifshowActiv.E = false;
                objArray = new Object[false];
                a.D().w(str1, "bindView double photo", objArray);
             }
             int len = stringArrayE.length;
             b = 0;
             while (b < len) {
                Bitmap uBitmap = r5.b().a(stringArrayE[b], Bitmap.class);
                if (uBitmap == null) {
                   Object[] objArray4 = new Object[0];
                   a.D().t(str1, "bindView bitmap is null", objArray4);
                }else {
                   gifshowActiv.B.add(uBitmap);
                }
                b = b + 1;
             }
             if (gifshowActiv.B.isEmpty()) {
                objArray2 = new Object[0];
                a.D().t(str1, "bindView no bitmap in memory", objArray2);
                objArray = null;
             }else {
                objArray = new Pair(Boolean.FALSE, triple);
             }
          }
       }
       if (objArray == null) {
          Object[] objArray1 = new Object[0];
          a.D().w(str1, "bindView no splash", objArray1);
          return;
       }else {
          second = objArray.getSecond();
          SocialSimpleEditorActivityViewBinder z = gifshowActiv.z;
          if (z == null) {
             a.S("editorActivityViewModel");
          }
          z.o0().d(gifshowActiv.F);
          SocialSimpleEditorActivityViewBinder$a k = SocialSimpleEditorActivityViewBinder.K;
          Context context = p0.getContext();
          a.o(context, "rootView.context");
          Object obj2 = obj;
          obj = k.a(second.getFirst().getSecond(), context, obj2, second.getSecond(), 0);
          gifshowActiv.u = obj.getFirst();
          gifshowActiv.v = obj.getSecond();
          obj.getThird().setAlpha(0);
          gifshowActiv.w = second.getThird();
          gifshowActiv.A = obj;
          if (gifshowActiv.E != null) {
             gifshowActiv.D = false;
          }else {
             SimpleEditParam dEFAULT = SimpleEditParam.DEFAULT;
             a.o(dEFAULT, str);
             gifshowActiv.D = i.g().getSimpleEditParam().get(dEFAULT).mSocialParam.mDualCamera ^ 1;
          }
          if (gifshowActiv.B.size() >= 2 && gifshowActiv.D == null) {
             SocialSimplePhotoFragmentViewBinderAbs$a j1 = SocialSimplePhotoFragmentViewBinderAbs.J1;
             socialSimple = gifshowActiv.y;
             if (socialSimple == null) {
                a.S("activity");
             }
             RectInfo rectInfo = j1.a(socialSimple);
             if (rectInfo != null) {
                obj3 = CollectionsKt___CollectionsKt.Y2(gifshowActiv.B);
                if (!PatchProxy.applyVoidThreeRefs(rectInfo, obj2, obj3, this, SocialSimpleEditorActivityViewBinder.class, "3")) {
                   context = obj2.getContext();
                   a.o(context, "parentView.context");
                   gifshowActiv.C = k.a(rectInfo, context, obj2, obj3, SocialSimpleEditorActivityViewBinder.G).getFirst();
                }
             }
          }
       label_02fd :
          return;
       }
    }
}
