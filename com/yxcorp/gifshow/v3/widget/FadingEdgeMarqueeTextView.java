package com.yxcorp.gifshow.v3.widget.FadingEdgeMarqueeTextView;
import com.kwai.library.widget.textview.CharactersFitMarqueeTextView;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.widget.TextView;
import android.graphics.Paint;
import java.lang.Boolean;
import android.text.TextPaint;
import android.view.ViewGroup$LayoutParams;
import java.lang.Math;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Xfermode;

public class FadingEdgeMarqueeTextView extends CharactersFitMarqueeTextView	// class@00164c
{
    public boolean r;
    public boolean s;
    public int t;
    public Paint u;
    public Paint v;
    public Matrix w;
    public Matrix x;
    public Shader y;
    public Shader z;
    public static final int A;

    static {
       FadingEdgeMarqueeTextView.A = a1.e(6.00f);
    }
    public void FadingEdgeMarqueeTextView(Context p0){
       super(p0);
       this.s = false;
       this.u(p0, null);
    }
    public void FadingEdgeMarqueeTextView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.s = false;
       this.u(p0, p1);
    }
    public void FadingEdgeMarqueeTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.s = false;
       this.u(p0, p1);
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FadingEdgeMarqueeTextView.class, "3")) {
          return;
       }
       super.onDraw(p0);
       if (PatchProxy.applyVoidOneRefs(p0, this, FadingEdgeMarqueeTextView.class, "5") || (this.r != null && this.s != null)) {
          this.w.setScale((float)this.t, 0x3f800000);
          this.w.postTranslate(0, 0);
          this.y.setLocalMatrix(this.w);
          p0.drawRect(0, 0, (float)this.t, (float)this.getHeight(), this.u);
          this.x.setScale((float)this.t, 0x3f800000);
          this.x.postTranslate((float)(this.getWidth() - this.t), 0);
          this.z.setLocalMatrix(this.x);
          p0.drawRect((float)(this.getWidth() - this.t), 0, (float)this.getWidth(), (float)this.getHeight(), this.v);
       }
    label_007e :
       return;
    }
    public void setEnableFadingEdge(boolean p0){
       if (PatchProxy.isSupport(FadingEdgeMarqueeTextView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, FadingEdgeMarqueeTextView.class, "6")) {
          return;
       }
       this.r = p0;
       this.invalidate();
       return;
    }
    public void setText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FadingEdgeMarqueeTextView.class, "2")) {
          return;
       }
       float f = this.getPaint().measureText(p0);
       ViewGroup$LayoutParams width = (this.getLayoutParams().width > null)? this.getLayoutParams().width: this.getMaxWidth();
       float f1 = (float)width;
       boolean b = (f - f1 >= 0)? true: false;
       this.s = b;
       ViewGroup$LayoutParams layoutParams = this.getLayoutParams();
       layoutParams.width = (int)f1;
       this.setLayoutParams(layoutParams);
       super.setText(p0);
       layoutParams.width = (int)Math.min(f1, f);
       this.setLayoutParams(layoutParams);
       this.r();
       return;
    }
    public final void u(Context p0,AttributeSet p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FadingEdgeMarqueeTextView.class, "1")) {
          return;
       }
       if (p1 != null) {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.C0);
          this.r = typedArray.getBoolean(0, 0);
          this.t = typedArray.getDimensionPixelSize(1, FadingEdgeMarqueeTextView.A);
       }
       if (!PatchProxy.applyVoid(null, this, FadingEdgeMarqueeTextView.class, "4") && this.r != null) {
          this.u = new Paint();
          LinearGradient linearGradie = new LinearGradient(0, 0, 0x3f800000, 0, 0xff000000, 0, Shader$TileMode.CLAMP);
          this.y = new Paint();
          this.u.setShader(new Paint());
          this.u.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.DST_OUT));
          this.w = new Matrix();
          this.v = new Paint();
          LinearGradient linearGradie1 = new LinearGradient(0, 0, 0x3f800000, 0, 0, 0xff000000, Shader$TileMode.CLAMP);
          this.z = new Paint();
          this.v.setShader(new Paint());
          this.v.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.DST_OUT));
          this.x = new Matrix();
          this.setLayerType(2, null);
       }
       return;
    }
}
