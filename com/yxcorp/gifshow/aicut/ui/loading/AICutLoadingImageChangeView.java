package com.yxcorp.gifshow.aicut.ui.loading.AICutLoadingImageChangeView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import lnc.a1;
import java.util.ArrayList;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import com.yxcorp.gifshow.aicut.ui.loading.AICutLoadingImageChangeView$a;
import android.widget.FrameLayout$LayoutParams;
import java.util.Iterator;
import java.lang.Iterable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.ImageView$ScaleType;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.util.Property;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Xfermode;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.animation.Animator;
import android.animation.AnimatorSet$Builder;
import th0.a;
import android.animation.TimeInterpolator;
import android.graphics.Canvas;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewGroup;

public class AICutLoadingImageChangeView extends FrameLayout	// class@001971
{
    public final int b;
    public final int c;
    public final ArrayList d;
    public int e;
    public final AnimatorSet f;
    public final AnimatorSet g;
    public final ObjectAnimator h;
    public final ObjectAnimator i;
    public final Paint j;

    public void AICutLoadingImageChangeView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void AICutLoadingImageChangeView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void AICutLoadingImageChangeView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       int i = a1.e(69.00f);
       this.b = i;
       this.c = a1.e(45.00f);
       ArrayList uArrayList = new ArrayList();
       this.d = uArrayList;
       this.e = -1;
       this.f = new AnimatorSet();
       this.g = new AnimatorSet();
       this.h = new ObjectAnimator();
       this.i = new ObjectAnimator();
       this.j = new Paint();
       uArrayList.add(new AICutLoadingImageChangeView$a(this, p0));
       uArrayList.add(new AICutLoadingImageChangeView$a(this, p0));
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(i, i);
       layoutParams.gravity = 17;
       Iterator iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          AICutLoadingImageChangeView$a uoa = iterator.next();
          uoa.c.setBackground(a1.f(R.drawable.arg_RES_7f0800e1));
          uoa.b().setScaleType(ImageView$ScaleType.CENTER_CROP);
          this.addView(uoa.a(), layoutParams);
       }
       this.h.setProperty(View.ROTATION);
       this.h.setDuration(300);
       this.h.setFloatValues(new float[2]{0x41700000,0});
       this.i.setProperty(View.ROTATION);
       this.i.setDuration(300);
       this.i.setFloatValues(new float[2]{0,0xc1700000});
       this.j.setShader(new BitmapShader(BitmapFactory.decodeResource(this.getResources(), R.drawable.arg_RES_7f0800e2), Shader$TileMode.CLAMP, Shader$TileMode.CLAMP));
       this.j.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.DST_IN));
       return;
    }
    public void AICutLoadingImageChangeView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = -1;
       }
       super(p0, p1, p2);
       return;
    }
    public final void a(Bitmap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AICutLoadingImageChangeView.class, "1")) {
          return;
       }
       AICutLoadingImageChangeView te = this.e;
       if (te == -1) {
          this.d.get(0).b().setImageBitmap(p0);
          this.e = 0;
          return;
       }else {
          Object obj = this.d.get(te);
          a.o(obj, "mImageViews[mCurrentPosition]");
          int i = this.e ^ 0x01;
          this.e = i;
          Object obj1 = this.d.get(i);
          a.o(obj1, "mImageViews[mCurrentPosition]");
          obj1.b().setImageBitmap(p0);
          float f = (float)this.b / 2.00f;
          obj.a().setPivotX(f);
          obj.a().setPivotY(((float)a1.e(0x43af0000) + f));
          obj1.a().setPivotX(f);
          obj1.a().setPivotY(((float)a1.e(0x43af0000) + f));
          this.f.play(this.h);
          this.g.play(this.i);
          this.f.setInterpolator(new a(0x3f99999a));
          this.g.setInterpolator(new a(0x3f99999a));
          this.f.setTarget(obj1.a());
          this.g.setTarget(obj.a());
          this.f.start();
          this.g.start();
          return;
       }
    }
    public boolean drawChild(Canvas p0,View p1,long p2){
       if (PatchProxy.isSupport(AICutLoadingImageChangeView.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Long.valueOf(p2), this, AICutLoadingImageChangeView.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "canvas");
       int i = p0.saveLayer(0, 0, (float)this.getWidth(), (float)this.getHeight(), null, 31);
       boolean b = super.drawChild(p0, p1, p2);
       if (!PatchProxy.applyVoidOneRefs(p0, this, AICutLoadingImageChangeView.class, "3")) {
          p0.drawRect(0, 0, (float)this.getWidth(), (float)this.getHeight(), this.j);
       }
       p0.restoreToCount(i);
       return b;
    }
    public final AnimatorSet getMAnimatorSetIn(){
       return this.f;
    }
    public final AnimatorSet getMAnimatorSetOut(){
       return this.g;
    }
    public final int getMCurrentPosition(){
       return this.e;
    }
    public final int getMImageViewContainerSize(){
       return this.b;
    }
    public final int getMImageViewSize(){
       return this.c;
    }
    public final ArrayList getMImageViews(){
       return this.d;
    }
    public final ObjectAnimator getMRotateAnimIn(){
       return this.h;
    }
    public final ObjectAnimator getMRotateAnimOut(){
       return this.i;
    }
    public final Paint getMShaderPaint(){
       return this.j;
    }
    public final void setMCurrentPosition(int p0){
       this.e = p0;
    }
}
