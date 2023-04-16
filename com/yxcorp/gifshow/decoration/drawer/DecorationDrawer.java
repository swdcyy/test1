package com.yxcorp.gifshow.decoration.drawer.DecorationDrawer;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import com.yxcorp.gifshow.decoration.drawer.DecorationDrawer$b;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import java.lang.Runnable;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import zv9.a;
import android.graphics.Bitmap;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.System;
import java.io.File;
import java.lang.Integer;
import gq.a;
import w46.b;
import com.yxcorp.gifshow.util.BitmapUtil;
import java.lang.Throwable;
import lnc.i1;
import java.lang.Number;
import java.lang.Float;
import android.view.ViewGroup$LayoutParams;
import java.lang.Long;
import q87.c;
import android.animation.AnimatorSet;
import java.util.ArrayList;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import java.util.Collection;
import th0.e;
import android.animation.TimeInterpolator;
import com.yxcorp.gifshow.decoration.drawer.DecorationDrawer$a;
import android.animation.Animator$AnimatorListener;

public abstract class DecorationDrawer extends BaseDrawer	// class@0012ab
{
    public DecorationDrawer$b mBeforeTransformParam;
    public boolean mEnableAddingAnimation;
    public boolean mIsInAnimation;

    public void DecorationDrawer(BaseDrawerData p0){
       super(p0);
       this.mBeforeTransformParam = new DecorationDrawer$b();
       this.mEnableAddingAnimation = false;
    }
    public void addSelectWithAnimation(DecorationContainerView p0){
    }
    public void animationEnd(Runnable p0,DecorationDrawer$b p1,View p2){
       float f;
       float f1;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, DecorationDrawer.class, "8")) {
          return;
       }
       if (p0 != null) {
          p0.run();
       }
       if (p2 == this.mDecorationShowingView) {
          BaseDrawer tmBaseDrawer = this.mBaseDrawerData;
          DecorationDrawer$b a = (p1.g != null)? p1.a: tmBaseDrawer.z();
          tmBaseDrawer.a0(a);
          tmBaseDrawer = this.mBaseDrawerData;
          a = (p1.g != null)? p1.b: tmBaseDrawer.q();
          tmBaseDrawer.W(a);
          tmBaseDrawer = this.mBaseDrawerData;
          a = (p1.h != null)? p1.c: tmBaseDrawer.A();
          tmBaseDrawer.b0(a);
          tmBaseDrawer = this.mBaseDrawerData;
          a = (p1.i != null)? p1.d: tmBaseDrawer.e();
          tmBaseDrawer.L(a);
          tmBaseDrawer = this.mBaseDrawerData;
          a = (p1.j != null)? p1.e: tmBaseDrawer.w();
          tmBaseDrawer.Y(a);
          tmBaseDrawer = this.mBaseDrawerData;
          p1 = (p1.k != null)? p1.f: tmBaseDrawer.x();
          tmBaseDrawer.Z(p1);
       }
       this.mIsInAnimation = false;
       return;
    }
    public void cloneBaseParam(DecorationDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DecorationDrawer.class, "11")) {
          return;
       }
       super.cloneBaseParam(p0);
       if (p0 == null) {
          return;
       }
       p0.mEnableAddingAnimation = this.mEnableAddingAnimation;
       return;
    }
    public void generateDecorationBitmap(DecorationContainerView p0,VideoSDKPlayerView p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DecorationDrawer.class, "17")) {
          return;
       }
       this.mDecorationBitmap = a.a(this.mDecorationShowingView, (this.mBaseDrawerData.A() * (float)a.d(p0, p1)));
       return;
    }
    public String generateDecorationOutputFilePath(){
       Object obj = PatchProxy.apply(null, this, DecorationDrawer.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new File(this.getOutputFileDir(), this.hashCode()+"_"+this.mBaseDrawerData.B()+"_"+System.currentTimeMillis()+".png").getAbsolutePath();
    }
    public void generateFile(String p0,int p1){
       if (PatchProxy.isSupport(DecorationDrawer.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, DecorationDrawer.class, "18")) {
          return;
       }
       BaseDrawer tmDecoration = this.mDecorationBitmap;
       if (tmDecoration == null) {
          Object[] objArray = new Object[0];
          a.D().t("DecorationDrawer", "generateFile mDecorationBitmap is null", objArray);
          return;
       }else {
          try{
             BitmapUtil.O(tmDecoration, p0, p1);
             BaseDrawer tmAfterFileG = this.mAfterFileGeneratedRunnable;
             if (tmAfterFileG != null) {
                tmAfterFileG.run();
                this.mAfterFileGeneratedRunnable = null;
             }
          }catch(java.lang.Exception e4){
             i1.c(e4);
          }
          return;
       }
    }
    public DecorationDrawer$b getBeforeTransformParam(){
       return this.mBeforeTransformParam;
    }
    public double getNormalizedRotate(){
       Object obj = PatchProxy.apply(null, this, DecorationDrawer.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return (double)this.mBaseDrawerData.z();
    }
    public double getNormalizedScale(){
       Object obj = PatchProxy.apply(null, this, DecorationDrawer.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return (double)(this.mBaseDrawerData.A() * 100.00f);
    }
    public double getNormalizedX(){
       Object obj = PatchProxy.apply(null, this, DecorationDrawer.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return (double)(this.mBaseDrawerData.w() * 100.00f);
    }
    public double getNormalizedY(){
       Object obj = PatchProxy.apply(null, this, DecorationDrawer.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return (double)(this.mBaseDrawerData.x() * 100.00f);
    }
    public float getRealViewX(float p0,View p1){
       if (PatchProxy.isSupport(DecorationDrawer.class)) {
          Object obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), p1, this, DecorationDrawer.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       return (p0 - (float)(p1.getLayoutParams().width / 2));
    }
    public float getRealViewY(float p0,View p1){
       if (PatchProxy.isSupport(DecorationDrawer.class)) {
          Object obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), p1, this, DecorationDrawer.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       return (p0 - (float)(p1.getLayoutParams().height / 2));
    }
    public String getUploadText(){
       return "";
    }
    public boolean isEnableAddingAnimation(){
       return this.mEnableAddingAnimation;
    }
    public boolean isGenerateFileNeedScaleToVideo(){
       return false;
    }
    public boolean isInAnimation(){
       return this.mIsInAnimation;
    }
    public boolean needDeleteOldDecorationFile(){
       return true;
    }
    public void restoreToBeforeAnimation(){
       if (PatchProxy.applyVoid(null, this, DecorationDrawer.class, "4")) {
          return;
       }
       this.restoreToBeforeAnimation(null, 300);
       return;
    }
    public void restoreToBeforeAnimation(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DecorationDrawer.class, "5")) {
          return;
       }
       this.restoreToBeforeAnimation(p0, 300);
       return;
    }
    public void restoreToBeforeAnimation(Runnable p0,long p1){
       if (PatchProxy.isSupport(DecorationDrawer.class) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, DecorationDrawer.class, "6")) {
          return;
       }
       this.startViewAnimationByAnimationParam(this.mBeforeTransformParam, p0, p1, this.mDecorationShowingView);
       return;
    }
    public void setEnableAddingAnimation(boolean p0){
       this.mEnableAddingAnimation = p0;
    }
    public void startElementAnimation(DecorationDrawer$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DecorationDrawer.class, "1")) {
          return;
       }
       this.startElementAnimation(p0, null, 300);
       return;
    }
    public void startElementAnimation(DecorationDrawer$b p0,Runnable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DecorationDrawer.class, "2")) {
          return;
       }
       this.startElementAnimation(p0, p1, 300);
       return;
    }
    public void startElementAnimation(DecorationDrawer$b p0,Runnable p1,long p2){
       if (PatchProxy.isSupport(DecorationDrawer.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Long.valueOf(p2), this, DecorationDrawer.class, "3")) {
          return;
       }
       this.mBeforeTransformParam.a = this.mBaseDrawerData.z();
       this.mBeforeTransformParam.c = this.mBaseDrawerData.A();
       this.mBeforeTransformParam.d = this.mBaseDrawerData.e();
       this.mBeforeTransformParam.e = this.mBaseDrawerData.w();
       this.mBeforeTransformParam.f = this.mBaseDrawerData.x();
       DecorationDrawer tmBeforeTran = this.mBeforeTransformParam;
       tmBeforeTran.g = p0.g;
       tmBeforeTran.b = p0.b;
       tmBeforeTran.h = p0.h;
       tmBeforeTran.i = p0.i;
       tmBeforeTran.j = p0.j;
       tmBeforeTran.k = p0.k;
       tmBeforeTran.l = p0.l;
       tmBeforeTran.m = p0.m;
       this.startViewAnimationByAnimationParam(p0, p1, p2, this.mDecorationShowingView);
       return;
    }
    public void startViewAnimationByAnimationParam(DecorationDrawer$b p0,Runnable p1,long p2,View p3){
       int this;
       float[] uofloatArray;
       if (PatchProxy.isSupport(DecorationDrawer.class) && PatchProxy.applyVoidFourRefs(p0, p1, Long.valueOf(p2), p3, this, DecorationDrawer.class, "7")) {
          return;
       }
       if (p0 == null) {
          Object[] objArray = new Object[0];
          a.D().A("DecorationDrawer", "startElementAnimation error to is null", objArray);
          return;
       }else {
          AnimatorSet uAnimatorSet = new AnimatorSet();
          ArrayList uArrayList = new ArrayList();
          this = 2;
          if (p0.g != null) {
             uofloatArray = new float[this];
             uofloatArray[0] = this.mBaseDrawerData.z() + this.mBeforeTransformParam.b;
             uofloatArray[1] = p0.a + p0.b;
             uArrayList.add(ObjectAnimator.ofFloat(p3, "rotation", uofloatArray));
          }
          if (p0.h != null) {
             uofloatArray = new float[this];
             uofloatArray[0] = this.mBaseDrawerData.A();
             uofloatArray[1] = p0.c;
             uArrayList.add(ObjectAnimator.ofFloat(p3, "scaleX", uofloatArray));
          }
          if (p0.h != null) {
             uofloatArray = new float[this];
             uofloatArray[0] = this.mBaseDrawerData.A();
             uofloatArray[1] = p0.c;
             uArrayList.add(ObjectAnimator.ofFloat(p3, "scaleY", uofloatArray));
          }
          if (p0.i != null) {
             uofloatArray = new float[this];
             uofloatArray[0] = this.mBaseDrawerData.e();
             uofloatArray[1] = p0.d;
             uArrayList.add(ObjectAnimator.ofFloat(p3, "alpha", uofloatArray));
          }
          if (p0.j != null) {
             uofloatArray = new float[this];
             uofloatArray[0] = this.getRealViewX((this.mBaseDrawerData.w() * (float)this.mEditRect.width()), p3);
             uofloatArray[1] = this.getRealViewX((p0.e * (float)this.mEditRect.width()), p3);
             uArrayList.add(ObjectAnimator.ofFloat(p3, "translationX", uofloatArray));
          }
          if (p0.k != null) {
             uofloatArray = new float[this];
             uofloatArray[0] = this.getRealViewY((this.mBaseDrawerData.x() * (float)this.mEditRect.height()), p3);
             uofloatArray[1] = this.getRealViewY((p0.f * (float)this.mEditRect.height()), p3);
             uArrayList.add(ObjectAnimator.ofFloat(p3, "translationY", uofloatArray));
          }
          uAnimatorSet.playTogether(uArrayList);
          uAnimatorSet.setDuration(p2);
          uAnimatorSet.setInterpolator(new e());
          uAnimatorSet.addListener(new DecorationDrawer$a(this, p1, p0, p3));
          uAnimatorSet.start();
          this.mIsInAnimation = true;
          Object[] objArray1 = new Object[0];
          a.D().w("DecorationDrawer", "startElementAnimation to:"+p0, objArray1);
          return;
       }
    }
}
