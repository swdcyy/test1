package com.yxcorp.gifshow.v3.SocialSimpleEditorActivityViewBinder$a;
import java.lang.Object;
import nsd.u;
import com.yxcorp.gifshow.model.RectInfo;
import android.content.Context;
import android.view.ViewGroup;
import android.graphics.Bitmap;
import kotlin.Triple;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import android.widget.ImageView$ScaleType;
import com.yxcorp.gifshow.v3.SocialSimpleEditorActivityViewBinder$a$a;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout$LayoutParams;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import java.lang.Float;
import android.app.Application;
import o56.a;
import android.content.res.Resources;
import android.app.Activity;
import android.content.Intent;
import java.io.Serializable;
import ekd.j0;
import com.yxcorp.gifshow.model.EditorSplashImageInfo;
import lnc.r5;
import com.yxcorp.gifshow.util.BitmapUtil;
import faa.a;
import q87.c;
import java.lang.StringBuilder;
import kotlin.Pair;
import com.yxcorp.gifshow.v3.SocialSimpleEditorActivityViewBinder;
import java.lang.Number;
import o56.c;
import android.graphics.Point;
import com.yxcorp.utility.n;
import lnc.i5;

public final class SocialSimpleEditorActivityViewBinder$a	// class@000d24
{

    public void SocialSimpleEditorActivityViewBinder$a(){
       super();
    }
    public void SocialSimpleEditorActivityViewBinder$a(u p0){
       super();
    }
    public final Triple a(RectInfo p0,Context p1,ViewGroup p2,Bitmap p3,int p4){
       RectF obj;
       View view;
       GradientDrawable gradientDraw;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       int i = 2;
       int i1 = 0;
       if (PatchProxy.isSupport(SocialSimpleEditorActivityViewBinder$a.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4)};
          obj = PatchProxy.apply(objArray, this, SocialSimpleEditorActivityViewBinder$a.class, "5");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       a.p(p0, "rectInfo");
       a.p(p1, "context");
       a.p(p2, "parentView");
       a.p(p3, "bitmap");
       obj = p0.getTargetRect();
       a.o(obj, "rectInfo.targetRect");
       FrameLayout uFrameLayout = new FrameLayout(p1);
       uFrameLayout.setId(R.id.editor_splash_container_view);
       p2.addView(uFrameLayout, new ViewGroup$MarginLayoutParams((int)obj.width(), (int)obj.height()));
       ViewGroup$LayoutParams layoutParams = uFrameLayout.getLayoutParams();
       Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
       layoutParams.setMargins((int)obj.left, (int)obj.top, i1, i1);
       if (p4 > i) {
          i1 = -2;
       }
       float f = (float)(p4 + i1);
       RectF rectF = new RectF((obj.left + f), (obj.top + f), (obj.right - f), (obj.bottom - f));
       KwaiImageView kwaiImageVie = new KwaiImageView(p1);
       kwaiImageVie.setId(R.id.editor_splash_view);
       kwaiImageVie.setImageBitmap(p3);
       kwaiImageVie.setScaleType(ImageView$ScaleType.FIT_CENTER);
       kwaiImageVie.setOutlineProvider(new SocialSimpleEditorActivityViewBinder$a$a(rectF, p0));
       kwaiImageVie.setClipToOutline(1);
       FrameLayout$LayoutParams layoutParams1 = new FrameLayout$LayoutParams((int)rectF.width(), (int)rectF.height());
       kwaiImageVie.setLayoutParams(layoutParams1);
       layoutParams1.gravity = 17;
       uFrameLayout.addView(kwaiImageVie, kwaiImageVie.getLayoutParams());
       view = new View(p1);
       view.setId(R.id.round_view);
       view.setLayoutParams(new FrameLayout$LayoutParams((int)obj.width(), (int)obj.height()));
       Drawable background = uFrameLayout.getBackground();
       if (background instanceof GradientDrawable) {
          background.setCornerRadius(p0.getRadiusOuter());
       }else {
          float radiusOuter = p0.getRadiusOuter();
          if (PatchProxy.isSupport(SocialSimpleEditorActivityViewBinder$a.class)) {
             gradientDraw = PatchProxy.applyOneRefs(Float.valueOf(radiusOuter), this, SocialSimpleEditorActivityViewBinder$a.class, "6");
             if (gradientDraw != patchProxyRe) {
             label_0136 :
                view.setBackground(gradientDraw);
             }
          }
          Application uApplication = a.b();
          a.o(uApplication, "AppEnv.getAppContext\(\)");
          GradientDrawable gradientDraw1 = new GradientDrawable();
          gradientDraw1.setCornerRadius(radiusOuter);
          gradientDraw1.setStroke(this.c(), uApplication.getResources().getColor(R.color.arg_RES_7f0620c7));
          gradientDraw = gradientDraw1;
          goto label_0136 ;
       }
       uFrameLayout.addView(view, view.getLayoutParams());
       return new Triple(uFrameLayout, kwaiImageVie, view);
    }
    public final Triple b(Activity p0){
       Object[] objArray;
       RectInfo mainRectInfo;
       Triple obj = PatchProxy.applyOneRefs(p0, this, SocialSimpleEditorActivityViewBinder$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "activity");
       EditorSplashImageInfo uEditorSplas = j0.e(p0.getIntent(), "INTENT_EDITOR_SPLASH_IMAGE_INFO");
       obj = null;
       int i = 0;
       String str = "SocialSimpleEditorActivityViewBinder";
       if (uEditorSplas == null || uEditorSplas.getEditorSplashType() != 5) {
          objArray = new Object[i];
          a.D().w(str, "onCreate no info", objArray);
          return obj;
       }else {
          Bitmap uBitmap = r5.b().a(uEditorSplas.getSplashImageBitmapKey(), Bitmap.class);
          if (!BitmapUtil.I(uBitmap)) {
             objArray = new Object[i];
             a.D().w(str, "onCreate bitmap invalid", objArray);
             return obj;
          }else if(uEditorSplas.getMainRectInfo() == null){
             return obj;
          }else {
             objArray = new Object[i];
             a.D().w(str, "getBigImageRectInfo mainRectInfo:"+uEditorSplas.getMainRectInfo(), objArray);
             mainRectInfo = uEditorSplas.getMainRectInfo();
             a.m(mainRectInfo);
             return new Triple(new Pair(Integer.valueOf(this.e()), mainRectInfo), uBitmap, uEditorSplas.getSplashImageBitmapKey());
          }
       }
    }
    public final int c(){
       return SocialSimpleEditorActivityViewBinder.G;
    }
    public final int d(){
       return SocialSimpleEditorActivityViewBinder.H;
    }
    public final int e(){
       int i;
       c obj = PatchProxy.apply(null, this, SocialSimpleEditorActivityViewBinder$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = a.a();
       a.o(obj, "AppEnv.get\(\)");
       Point point = n.s(obj.a());
       float f = (float)(point.y - i5.a(a.b())) / (float)point.x;
       float j = SocialSimpleEditorActivityViewBinder.J;
       if (f - j >= 0) {
          i = 3;
       }else if(j - f > 0 && f - SocialSimpleEditorActivityViewBinder.I > 0){
          i = 2;
       }else {
          i = this.d();
       }
       return i;
    }
}
