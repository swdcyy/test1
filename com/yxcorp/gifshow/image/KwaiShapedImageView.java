package com.yxcorp.gifshow.image.KwaiShapedImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import java.lang.Integer;
import android.widget.ImageView$ScaleType;
import android.widget.ImageView;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import java.lang.IllegalArgumentException;
import yb.b;
import android.content.res.Resources;
import xb.t$b;
import yb.a;
import ac.b;
import cc.a;
import com.facebook.drawee.view.DraweeView;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Matrix;
import android.graphics.Xfermode;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.Bitmap$Config;
import ac.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class KwaiShapedImageView extends KwaiImageView	// class@001947
{
    public Bitmap A;
    public Paint B;
    public boolean C;
    public int D;
    public Drawable E;
    public a F;
    public Canvas x;
    public Bitmap y;
    public Canvas z;
    public static final PorterDuffXfermode G;

    static {
       KwaiShapedImageView.G = new PorterDuffXfermode(PorterDuff$Mode.DST_IN);
    }
    public void KwaiShapedImageView(Context p0){
       super(p0);
       this.C = true;
       this.o0(p0, null, 0);
    }
    public void KwaiShapedImageView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.C = true;
       this.o0(p0, p1, 0);
    }
    public void KwaiShapedImageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.C = true;
       this.o0(p0, p1, p2);
    }
    public void invalidate(){
       if (PatchProxy.applyVoid(null, this, KwaiShapedImageView.class, "4")) {
          return;
       }
       this.C = true;
       super.invalidate();
       return;
    }
    public final void o0(Context p0,AttributeSet p1,int p2){
       Drawable drawable1;
       Drawable uDrawable;
       if (PatchProxy.isSupport(KwaiShapedImageView.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, KwaiShapedImageView.class, "1")) {
          return;
       }
       if (this.getScaleType() == ImageView$ScaleType.FIT_CENTER) {
          this.setScaleType(ImageView$ScaleType.CENTER_CROP);
       }
       int[] ointArray = null;
       if (p1 != null) {
          int i = 0;
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.Z4, p2, i);
          p2 = -1;
          int resourceId = typedArray.getResourceId(2, p2);
          this.D = resourceId;
          if (resourceId != p2) {
             this.setImageResource(resourceId);
          }
          Drawable drawable = this.getDrawable();
          this.E = drawable;
          if (drawable != null) {
             drawable1 = typedArray.getDrawable(i);
             typedArray.recycle();
             uDrawable = typedArray.getDrawable(1);
             ointArray = typedArray.getDrawable(3);
          }else {
             throw new IllegalArgumentException("maskShape must be specified in layout!");
          }
       }else {
          uDrawable = ointArray;
          drawable1 = uDrawable;
       }
       b uob = new b(this.getResources());
       uob.s(ointArray);
       uob.k(drawable1);
       t$b i1 = t$b.i;
       uob.t(i1);
       uob.j(i1);
       uob.o(uDrawable);
       uob.p(i1);
       a uoa = uob.a();
       this.F = a.d(uoa, this.getContext());
       return;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, KwaiShapedImageView.class, "9")) {
          return;
       }
       super.onAttachedToWindow();
       this.p0();
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, KwaiShapedImageView.class, "11")) {
          return;
       }
       super.onDetachedFromWindow();
       this.r0();
       return;
    }
    public void onDraw(Canvas p0){
       KwaiShapedImageView tB;
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiShapedImageView.class, "8")) {
          return;
       }
       int i = p0.saveLayer(0, 0, (float)this.getWidth(), (float)this.getHeight(), null, 31);
       try{
          if (this.C != null) {
             this.setImageDrawable(this.F.g());
             Drawable drawable = this.getDrawable();
             if (drawable != null) {
                boolean b = false;
                this.C = b;
                if (this.getImageMatrix() == null) {
                   drawable.draw(this.z);
                }else {
                   KwaiShapedImageView tz = this.z;
                   if (tz != null) {
                      this.z.save();
                      drawable.draw(this.z);
                      this.z.restoreToCount(tz.getSaveCount());
                   }
                }
                tB = this.B;
                if (tB != null) {
                   tB.reset();
                   this.B.setFilterBitmap(b);
                   this.B.setXfermode(KwaiShapedImageView.G);
                }
                if (this.w != null) {
                   this.n0(this.z);
                }
                tB = this.z;
                if (tB != null) {
                   tB.drawBitmap(this.y, 0, 0, this.B);
                }
             }
          }
          if (this.C == null) {
             tB = this.B;
             if (tB != null) {
                tB.setXfermode(null);
             }
             tB = this.A;
             if (tB != null && !tB.isRecycled()) {
                p0.drawBitmap(this.A, 0, 0, this.B);
             }
          }
       }catch(java.lang.Exception e0){
          this.getId();
       }
    label_009d :
       p0.restoreToCount(e0);
       return;
    }
    public void onFinishTemporaryDetach(){
       if (PatchProxy.applyVoid(null, this, KwaiShapedImageView.class, "10")) {
          return;
       }
       super.onFinishTemporaryDetach();
       this.p0();
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(KwaiShapedImageView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, KwaiShapedImageView.class, "5")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       if (!this.isInEditMode()) {
          this.q0(p0, p1, p2, p3);
       }
       return;
    }
    public void onStartTemporaryDetach(){
       if (PatchProxy.applyVoid(null, this, KwaiShapedImageView.class, "12")) {
          return;
       }
       super.onStartTemporaryDetach();
       this.r0();
       return;
    }
    public final void p0(){
       if (PatchProxy.applyVoid(null, this, KwaiShapedImageView.class, "14")) {
          return;
       }
       this.F.i();
       this.F.g().setCallback(this);
       return;
    }
    public final void q0(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(KwaiShapedImageView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, KwaiShapedImageView.class, "6")) {
          return;
       }
       Canvas uCanvas = (p0 != p2 || p1 != p3)? 1: null;
       KwaiShapedImageView kwaiShapedIm = (p0 > 0 && p1 > 0)? 1: null;
       if (kwaiShapedIm && (this.x == null || uCanvas)) {
          this.x = new Canvas();
          Bitmap uBitmap = Bitmap.createBitmap(p0, p1, Bitmap$Config.ARGB_8888);
          this.y = uBitmap;
          this.x.setBitmap(uBitmap);
          KwaiShapedImageView tx = this.x;
          if (!PatchProxy.isSupport(KwaiShapedImageView.class) || !PatchProxy.applyVoidThreeRefs(tx, Integer.valueOf(p0), Integer.valueOf(p1), this, KwaiShapedImageView.class, "7")) {
             kwaiShapedIm = this.E;
             if (kwaiShapedIm != null) {
                kwaiShapedIm.setBounds(0, 0, p0, p1);
                this.E.draw(tx);
             }
          }
          this.z = new Canvas();
          Bitmap uBitmap1 = Bitmap.createBitmap(p0, p1, Bitmap$Config.ARGB_8888);
          this.A = uBitmap1;
          this.z.setBitmap(uBitmap1);
          this.B = new Paint(1);
          this.C = true;
       }
       return;
    }
    public final void r0(){
       if (PatchProxy.applyVoid(null, this, KwaiShapedImageView.class, "15")) {
          return;
       }
       this.F.j();
       this.F.g().setCallback(null);
       return;
    }
    public void setController(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiShapedImageView.class, "3")) {
          return;
       }
       this.F.k(p0);
       return;
    }
    public void setMaskShape(int p0){
       if (PatchProxy.isSupport(KwaiShapedImageView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, KwaiShapedImageView.class, "2")) {
          return;
       }
       if (p0 == -1) {
          return;
       }
       if (this.D != p0) {
          this.D = p0;
          this.setImageResource(p0);
          this.E = this.getDrawable();
          this.q0(this.getWidth(), this.getHeight(), -1, -1);
       }
       return;
    }
    public boolean verifyDrawable(Drawable p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiShapedImageView.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 == this.F.g() || super.verifyDrawable(p0))? true: false;
       return b;
    }
}
