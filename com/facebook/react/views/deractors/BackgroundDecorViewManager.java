package com.facebook.react.views.deractors.BackgroundDecorViewManager;
import com.facebook.react.views.view.ReactViewManager;
import android.content.Context;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.views.deractors.BackgroundDecorView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.views.deractors.BackgroundDecorViewManager$b;
import com.facebook.react.views.deractors.BackgroundDecorViewManager$c;
import com.facebook.react.views.view.ReactViewGroup;
import com.facebook.react.views.deractors.BackgroundDecorViewManager$d;
import com.facebook.react.views.deractors.BackgroundDecorViewManager$a;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import java.util.Objects;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.Integer;
import java.lang.Float;
import lg.d;
import ze.p;
import ze.d;
import java.util.Arrays;

public class BackgroundDecorViewManager extends ReactViewManager	// class@0013a7
{
    public BackgroundDecorViewManager$a mBorderColorParams;
    public BackgroundDecorViewManager$b mBorderRadiusParams;
    public BackgroundDecorViewManager$c mBorderStyleParams;
    public BackgroundDecorViewManager$d mBorderWidthParams;
    public boolean mHasBackgroundImage;
    public boolean mHasOpacity;
    public boolean mHasRotation;
    public boolean mHasScaleX;
    public boolean mHasScaleY;
    public boolean mHasTransform;
    public boolean mHasTranslateX;
    public boolean mHasTranslateY;
    public boolean mHasZIndex;
    public float mOpacity;
    public float mRotation;
    public float mScaleX;
    public float mScaleY;
    public ReadableArray mTransformMatrix;
    public float mTranslateX;
    public float mTranslateY;
    public float mZIndex;
    public static final int[] SPACING_TYPES;

    static {
       BackgroundDecorViewManager.SPACING_TYPES = new int[7]{8,0,2,1,3,4,5};
    }
    public void BackgroundDecorViewManager(){
       super();
       this.mRotation = 0xbf800000;
       this.mScaleX = 0xbf800000;
       this.mScaleY = 0xbf800000;
       this.mTranslateX = 0xbf800000;
       this.mTranslateY = 0xbf800000;
       this.mOpacity = 0x3f800000;
       this.mZIndex = 0;
    }
    public static BackgroundDecorView createBackgroundDecorView(Context p0,ViewManager p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, BackgroundDecorViewManager.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new BackgroundDecorView(p0, p1);
    }
    public void initBackgroundDecoViewBorderParams(BackgroundDecorView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BackgroundDecorViewManager.class, "6")) {
          return;
       }
       BackgroundDecorViewManager tmBorderRadi = this.mBorderRadiusParams;
       if (tmBorderRadi != null && tmBorderRadi.a != null) {
          BackgroundDecorViewManager$b c = tmBorderRadi.c;
          if (c != null) {
             p0.setBorderRadius(c);
          }else {
             p0.setBorderRadius(tmBorderRadi.b);
          }
       }
       tmBorderRadi = this.mBorderStyleParams;
       if (tmBorderRadi != null && tmBorderRadi.a != null) {
          p0.setBorderStyle(tmBorderRadi.b);
       }
       tmBorderRadi = this.mBorderWidthParams;
       if (tmBorderRadi != null && tmBorderRadi.a != null) {
          p0.setBorderWidth(tmBorderRadi.b, tmBorderRadi.c);
       }
       tmBorderRadi = this.mBorderColorParams;
       if (tmBorderRadi != null && tmBorderRadi.a != null) {
          p0.setBorderColor(tmBorderRadi.b, tmBorderRadi.c, tmBorderRadi.d);
       }
       return;
    }
    public void setBackgroundImage(View p0,ReadableArray p1,ViewManager p2){
       int i1;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, BackgroundDecorViewManager.class, "5")) {
          return;
       }
       int i = 0x7f0a03a3;
       if (p1 == null || !p1.size()) {
          if (BackgroundDecorView.i(p0) != null) {
             BackgroundDecorView uBackgroundD = BackgroundDecorView.i(p0);
             Objects.requireNonNull(uBackgroundD);
             Object[] objArray = null;
             if (!PatchProxy.applyVoid(objArray, uBackgroundD, BackgroundDecorView.class, "18")) {
                uBackgroundD.b.setTag(i, objArray);
                uBackgroundD.b.layout(uBackgroundD.getLeft(), uBackgroundD.getTop(), uBackgroundD.getRight(), uBackgroundD.getBottom());
                ViewGroup parent = uBackgroundD.getParent();
                if (parent != null) {
                   i1 = parent.indexOfChild(uBackgroundD);
                   uBackgroundD.removeAllViews();
                   parent.removeViewAt(i1);
                   parent.addView(uBackgroundD.b, i1);
                }
             }
          }
          this.mHasBackgroundImage = false;
          return;
       }else {
          BackgroundDecorView uBackgroundD1 = BackgroundDecorView.i(p0);
          if (uBackgroundD1 == null) {
             uBackgroundD1 = BackgroundDecorViewManager.createBackgroundDecorView(p0.getContext(), p2);
             Objects.requireNonNull(uBackgroundD1);
             if (!PatchProxy.applyVoidOneRefs(p0, uBackgroundD1, BackgroundDecorView.class, "1")) {
                uBackgroundD1.b = p0;
                p0.setTag(i, uBackgroundD1);
                uBackgroundD1.layout(uBackgroundD1.b.getLeft(), uBackgroundD1.b.getTop(), uBackgroundD1.b.getRight(), uBackgroundD1.b.getBottom());
                ViewGroup parent1 = uBackgroundD1.b.getParent();
                if (parent1 != null) {
                   i1 = parent1.indexOfChild(uBackgroundD1.b);
                   parent1.removeViewAt(i1);
                }else {
                   i1 = 0;
                }
                uBackgroundD1.addView(uBackgroundD1.b, false);
                if (parent1 != null) {
                   parent1.addView(uBackgroundD1, i1);
                }
             }
          }
          uBackgroundD1.setBackgroundParams(p1);
          this.initBackgroundDecoViewBorderParams(uBackgroundD1);
          this.mHasBackgroundImage = true;
          return;
       }
    }
    public void setBackgroundOpacity(float p0){
       this.mOpacity = p0;
       this.mHasOpacity = true;
    }
    public void setBackgroundRotation(float p0){
       this.mRotation = p0;
       this.mHasRotation = true;
    }
    public void setBackgroundScaleX(float p0){
       this.mScaleX = p0;
       this.mHasScaleX = true;
    }
    public void setBackgroundScaleY(float p0){
       this.mScaleY = p0;
       this.mHasScaleY = true;
    }
    public void setBackgroundTransform(ReadableArray p0){
       this.mTransformMatrix = p0;
       this.mHasTransform = true;
    }
    public void setBackgroundTranslateX(float p0){
       this.mTranslateX = p0;
       this.mHasTranslateX = true;
    }
    public void setBackgroundTranslateY(float p0){
       this.mTranslateY = p0;
       this.mHasTranslateY = true;
    }
    public void setBackgroundZIndex(float p0){
       this.mZIndex = p0;
       this.mHasZIndex = true;
    }
    public void setBorderColorParams(View p0,int p1,Integer p2){
       if (PatchProxy.isSupport(BackgroundDecorViewManager.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, BackgroundDecorViewManager.class, "4")) {
          return;
       }
       float f = Float.NaN;
       float f1 = (p2 == null)? Float.NaN: (float)(p2.intValue() & 0xffffff);
       if (p2 != null) {
          f = (float)(p2.intValue() >> 24);
       }
       if (BackgroundDecorView.i(p0) != null) {
          BackgroundDecorView.i(p0).setBorderColor(BackgroundDecorViewManager.SPACING_TYPES[p1], f1, f);
       }
       if (this.mBorderColorParams == null) {
          this.mBorderColorParams = new BackgroundDecorViewManager$a(this);
       }
       BackgroundDecorViewManager tmBorderColo = this.mBorderColorParams;
       tmBorderColo.b = BackgroundDecorViewManager.SPACING_TYPES[p1];
       tmBorderColo.c = f1;
       tmBorderColo.d = f;
       tmBorderColo.a = true;
       return;
    }
    public void setBorderRadiusParams(View p0,int p1,float p2){
       if (PatchProxy.isSupport(BackgroundDecorViewManager.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Float.valueOf(p2), this, BackgroundDecorViewManager.class, "1")) {
          return;
       }
       float f = Float.NaN;
       if (!d.a(p2) && p2 < 0) {
          p2 = Float.NaN;
       }
       if (!d.a(p2)) {
          p2 = p.c(p2);
       }
       if (BackgroundDecorView.i(p0) != null) {
          if (!p1) {
             BackgroundDecorView.i(p0).setBorderRadius(p2);
          }else {
             BackgroundDecorView.i(p0).setBorderRadius(p2, (p1 - 1));
          }
       }
       if (this.mBorderRadiusParams == null) {
          this.mBorderRadiusParams = new BackgroundDecorViewManager$b(this);
       }
       boolean b = true;
       if (!p1) {
          if (!d.a(this.mBorderRadiusParams.b, p2)) {
             BackgroundDecorViewManager tmBorderRadi = this.mBorderRadiusParams;
             tmBorderRadi.b = p2;
             tmBorderRadi.a = b;
             tmBorderRadi.c = null;
          }
       }else {
          BackgroundDecorViewManager tmBorderRadi1 = this.mBorderRadiusParams;
          if (tmBorderRadi1.c == null) {
             float[] uofloatArray = new float[8];
             tmBorderRadi1.c = uofloatArray;
             Arrays.fill(uofloatArray, f);
          }
          p1 = p1 - b;
          if (!d.a(this.mBorderRadiusParams.c[p1], p2)) {
             tmBorderRadi1 = this.mBorderRadiusParams;
             tmBorderRadi1.c[p1] = p2;
             tmBorderRadi1.a = b;
          }
       }
       return;
    }
    public void setBorderStyleParams(View p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BackgroundDecorViewManager.class, "2")) {
          return;
       }
       if (BackgroundDecorView.i(p0) != null) {
          BackgroundDecorView.i(p0).setBorderStyle(p1);
       }
       if (this.mBorderStyleParams == null) {
          this.mBorderStyleParams = new BackgroundDecorViewManager$c(this);
       }
       BackgroundDecorViewManager tmBorderStyl = this.mBorderStyleParams;
       tmBorderStyl.b = p1;
       tmBorderStyl.a = true;
       return;
    }
    public void setBorderWidthParams(View p0,int p1,float p2){
       if (PatchProxy.isSupport(BackgroundDecorViewManager.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Float.valueOf(p2), this, BackgroundDecorViewManager.class, "3")) {
          return;
       }
       if (!d.a(p2) && p2 < 0) {
          p2 = Float.NaN;
       }
       if (!d.a(p2)) {
          p2 = p.c(p2);
       }
       if (BackgroundDecorView.i(p0) != null) {
          BackgroundDecorView.i(p0).setBorderWidth(BackgroundDecorViewManager.SPACING_TYPES[p1], p2);
       }
       if (this.mBorderWidthParams == null) {
          this.mBorderWidthParams = new BackgroundDecorViewManager$d(this);
       }
       BackgroundDecorViewManager tmBorderWidt = this.mBorderWidthParams;
       tmBorderWidt.b = BackgroundDecorViewManager.SPACING_TYPES[p1];
       tmBorderWidt.c = p2;
       tmBorderWidt.a = true;
       return;
    }
}
