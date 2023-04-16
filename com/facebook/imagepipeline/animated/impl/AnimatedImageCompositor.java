package com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor;
import oc.a;
import com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor$b;
import java.lang.Object;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Xfermode;
import android.graphics.Canvas;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo$BlendOperation;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo$DisposalMethod;
import android.graphics.Bitmap;
import com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor$FrameNeededResult;
import com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor$a;
import java.lang.Enum;
import com.facebook.common.references.a;
import oc.d;
import md.a;

public class AnimatedImageCompositor	// class@0010eb
{
    public final a a;
    public final AnimatedImageCompositor$b b;
    public final Paint c;

    public void AnimatedImageCompositor(a p0,AnimatedImageCompositor$b p1){
       super();
       this.a = p0;
       this.b = p1;
       Paint paint = new Paint();
       this.c = paint;
       paint.setColor(0);
       paint.setStyle(Paint$Style.FILL);
       paint.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.SRC));
    }
    public final void a(Canvas p0,AnimatedDrawableFrameInfo p1){
       AnimatedDrawableFrameInfo b = p1.b;
       float f = (float)b;
       AnimatedDrawableFrameInfo c = p1.c;
       float f1 = (float)c;
       p0.drawRect(f, f1, (float)(b + p1.d), (float)(c + p1.e), this.c);
    }
    public final boolean b(AnimatedDrawableFrameInfo p0){
       boolean b = (p0.b == null && (p0.c == null && (p0.d == this.a.j() && p0.e == this.a.h())))? true: false;
       return b;
    }
    public final boolean c(int p0){
       boolean b = true;
       if (!p0) {
          return b;
       }
       AnimatedDrawableFrameInfo frameInfo = this.a.getFrameInfo(p0);
       AnimatedDrawableFrameInfo frameInfo1 = this.a.getFrameInfo((p0 - b));
       if (frameInfo.f == AnimatedDrawableFrameInfo$BlendOperation.NO_BLEND && this.b(frameInfo)) {
          return b;
       }
       if (frameInfo1.g != AnimatedDrawableFrameInfo$DisposalMethod.DISPOSE_TO_BACKGROUND || !this.b(frameInfo1)) {
          b = false;
       }
       return b;
    }
    public void d(int p0,Bitmap p1){
       AnimatedDrawableFrameInfo frameInfo;
       AnimatedImageCompositor$FrameNeededResult rEQUIRED;
       AnimatedDrawableFrameInfo frameInfo1;
       Canvas uCanvas = new Canvas(p1);
       int i = 0;
       uCanvas.drawColor(i, PorterDuff$Mode.SRC);
       if (!this.c(p0)) {
          int i1 = p0 - 1;
          while (i1 >= 0) {
             frameInfo = this.a.getFrameInfo(i1);
             AnimatedDrawableFrameInfo g = frameInfo.g;
             if (g == AnimatedDrawableFrameInfo$DisposalMethod.DISPOSE_DO_NOT) {
                rEQUIRED = AnimatedImageCompositor$FrameNeededResult.REQUIRED;
             }else if(g == AnimatedDrawableFrameInfo$DisposalMethod.DISPOSE_TO_BACKGROUND){
                rEQUIRED = (this.b(frameInfo))? AnimatedImageCompositor$FrameNeededResult.NOT_REQUIRED: AnimatedImageCompositor$FrameNeededResult.REQUIRED;
             }else if(g == AnimatedDrawableFrameInfo$DisposalMethod.DISPOSE_TO_PREVIOUS){
                rEQUIRED = AnimatedImageCompositor$FrameNeededResult.SKIP;
             }else {
                rEQUIRED = AnimatedImageCompositor$FrameNeededResult.ABORT;
             }
             int i2 = AnimatedImageCompositor$a.a[rEQUIRED.ordinal()];
             if (i2 != 1) {
                if (i2 != 2) {
                   if (i2 != 3) {
                   label_0087 :
                      i1 = i1 - 1;
                   }
                }else {
                   i = i1 + 1;
                   break ;
                }
             }else {
                frameInfo = this.a.getFrameInfo(i1);
                a uoa = this.b.b(i1);
                if (uoa != null) {
                   uCanvas.drawBitmap(uoa.j(), 0, 0, null);
                   if (frameInfo.g == AnimatedDrawableFrameInfo$DisposalMethod.DISPOSE_TO_BACKGROUND) {
                      this.a(uCanvas, frameInfo);
                   }
                   i = i1 + 1;
                   uoa.close();
                   break ;
                }else if(this.c(i1)){
                }
             }
             i = i1;
             break ;
          }
       }else {
          i = p0;
       }
       while (i < p0) {
          frameInfo1 = this.a.getFrameInfo(i);
          frameInfo = frameInfo1.g;
          if (frameInfo != AnimatedDrawableFrameInfo$DisposalMethod.DISPOSE_TO_PREVIOUS) {
             if (frameInfo1.f == AnimatedDrawableFrameInfo$BlendOperation.NO_BLEND) {
                this.a(uCanvas, frameInfo1);
             }
             this.a.f(i, uCanvas);
             this.b.a(i, p1);
             if (frameInfo == AnimatedDrawableFrameInfo$DisposalMethod.DISPOSE_TO_BACKGROUND) {
                this.a(uCanvas, frameInfo1);
             }
          }
          i = i + 1;
       }
       frameInfo1 = this.a.getFrameInfo(p0);
       if (frameInfo1.f == AnimatedDrawableFrameInfo$BlendOperation.NO_BLEND) {
          this.a(uCanvas, frameInfo1);
       }
       this.a.f(p0, uCanvas);
       d uod = this.a.e();
       if (uod != null) {
          uod = uod.e;
          if (uod != null) {
             uod.b(p1);
          }
       }
       return;
    }
}
