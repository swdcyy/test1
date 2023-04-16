package com.kuaishou.live.core.show.vote.widget.LiveVotePercentProgressbar;
import com.kuaishou.live.core.show.vote.widget.LiveGzoneAbstractVoteProgress;
import android.content.Context;
import android.util.AttributeSet;
import lnc.a1;
import android.graphics.RectF;
import android.graphics.Path;
import android.graphics.Paint;
import android.widget.ProgressBar;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import pp.a;
import java.lang.StringBuilder;
import q87.c;
import android.animation.ValueAnimator;
import java.lang.Math;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import fm2.g;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.core.show.vote.widget.LiveVotePercentProgressbar$a;
import android.animation.Animator$AnimatorListener;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.graphics.Paint$Style;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Xfermode;
import com.kwai.robust.PatchProxyResult;
import android.graphics.Bitmap$Config;
import android.graphics.Shader;
import android.graphics.Path$Direction;
import java.lang.Boolean;
import android.view.View;

public class LiveVotePercentProgressbar extends LiveGzoneAbstractVoteProgress	// class@00124f
{
    public RectF A;
    public Path B;
    public int b;
    public int c;
    public float d;
    public float e;
    public int f;
    public int g;
    public int h;
    public int i;
    public ValueAnimator j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public Bitmap s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public Paint z;
    public static final int C;

    public void LiveVotePercentProgressbar(Context p0){
       super(p0, null);
    }
    public void LiveVotePercentProgressbar(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveVotePercentProgressbar(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       float f = (float)a1.e(0x3f800000);
       this.d = f;
       this.e = f / 2.00f;
       this.r = -1;
       this.t = false;
       this.u = false;
       this.v = true;
       this.w = false;
       this.x = false;
       this.y = false;
       this.A = new RectF();
       this.B = new Path();
       this.setLayerType(true, null);
       this.setProgress(false);
       Paint paint = new Paint();
       this.z = paint;
       paint.setAntiAlias(true);
       this.l = a1.a(0x7f06143c);
       this.m = a1.a(0x7f060c88);
       this.o = a1.a(0x7f06015a);
       this.p = a1.a(0x7f06143c);
       this.q = a1.a(0x7f06143c);
       this.n = this.p;
    }
    public boolean a(){
       return this.x;
    }
    public boolean b(){
       return this.v;
    }
    public boolean c(){
       return this.u;
    }
    public void d(int p0,int p1){
       if (PatchProxy.isSupport(LiveVotePercentProgressbar.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LiveVotePercentProgressbar.class, "14")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().s("LiveVotePercentProgressbar", "setProgressWithAnim: end:"+p0+" ,start"+this.getProgress(), objArray);
       if (this.getProgress() == p0) {
          this.invalidate();
          return;
       }else {
          LiveVotePercentProgressbar tj = this.j;
          if (tj != null) {
             tj.cancel();
          }
          float[] uofloatArray = new float[]{(float)(p1 * 100),(float)(p0 * 100)};
          ValueAnimator valueAnimato = ValueAnimator.ofFloat(uofloatArray);
          this.j = valueAnimato;
          valueAnimato.setInterpolator(new LinearInterpolator());
          this.j.setDuration((long)((((float)Math.abs((p1 - p0)) / (float)this.getMax()) * 400.00f) + 400.00f));
          this.j.addUpdateListener(new g(this));
          this.j.addListener(new LiveVotePercentProgressbar$a(this));
          this.j.start();
          return;
       }
    }
    public final void e(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVotePercentProgressbar.class, "6")) {
          return;
       }
       if (this.s == null) {
          this.s = this.f(this.b, this.c);
       }
       this.z.setStyle(Paint$Style.FILL);
       this.z.setColor(0xff000000);
       this.z.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.DST_IN));
       p0.drawBitmap(this.s, 0, 0, this.z);
       this.z.setXfermode(null);
       return;
    }
    public final Bitmap f(int p0,int p1){
       Bitmap obj;
       LiveVotePercentProgressbar liveVotePerc;
       if (PatchProxy.isSupport(LiveVotePercentProgressbar.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LiveVotePercentProgressbar.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = Bitmap.createBitmap(p0, p1, Bitmap$Config.ARGB_8888);
       Canvas uCanvas = new Canvas(obj);
       this.z.setShader(null);
       this.z.setColor(0xff000000);
       this.z.setStyle(Paint$Style.FILL);
       this.A.set(0, 0, (float)p0, (float)p1);
       LiveVotePercentProgressbar tr = this.r;
       if (tr >= null) {
          liveVotePerc = tr;
       }
       uCanvas.drawRoundRect(this.A, (float)liveVotePerc, (float)liveVotePerc, this.z);
       return obj;
    }
    public final void g(Canvas p0){
       Bitmap uBitmap;
       float f2;
       Path path;
       int i = this;
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, i, LiveVotePercentProgressbar.class, "13")) {
          return;
       }
       Xfermode xfermode = null;
       i.z.setXfermode(xfermode);
       float f = 0x3f800000;
       int i1 = 0;
       float f1 = (!this.getProgress())? 0: ((float)this.getProgress() * f) / (float)this.getMax();
       LiveVotePercentProgressbar b = i.b;
       int i2 = b - (int)((float)b * (f - f1));
       if (i.c != null && b != null) {
          i.f = this.getPaddingLeft();
          int i3 = 2;
          int i4 = this.getHeight() / i3;
          i.g = i4;
          i.h = i.f + i2;
          i.i = i4;
          i.z.setXfermode(xfermode);
          LiveVotePercentProgressbar c = i.c;
          if (PatchProxy.isSupport(LiveVotePercentProgressbar.class)) {
             uBitmap = PatchProxy.applyTwoRefs(Integer.valueOf(i2), Integer.valueOf(c), i, LiveVotePercentProgressbar.class, "4");
             if (uBitmap != PatchProxyResult.class) {
             }else {
             label_007a :
                uBitmap = Bitmap.createBitmap(i.b, c, Bitmap$Config.ARGB_8888);
                Canvas uCanvas = new Canvas(uBitmap);
                i.z.setShader(xfermode);
                i.z.setStyle(Paint$Style.FILL);
                LiveVotePercentProgressbar r = i.r;
                if (r < null) {
                   r = c;
                }
                float[] uofloatArray = new float[]{i1,i1,f2,f2,f2,f2,i1,i1};
                f2 = (float)r;
                if (i2 > 0) {
                   path = new Path();
                   i.A.set(i1, i1, (float)i2, (float)c);
                   if (i.w != null) {
                      i.z.setColor(i.l);
                   }else {
                      i.z.setColor(a1.a(R.color.arg_RES_7f060c89));
                   }
                   float[] uofloatArray1 = new float[]{f2,f2,i1,i1,i1,i1,f2,f2};
                   if (i2 == i.b) {
                      uofloatArray1 = new float[]{f2,f2,f2,f2,f2,f2,f2,f2};
                   }
                   path.addRoundRect(i.A, uofloatArray1, Path$Direction.CW);
                   path.close();
                   uCanvas.drawPath(path, i.z);
                }else {
                   uofloatArray = new float[]{f2,f2,f2,f2,f2,f2,f2,f2};
                   i2 = 0;
                }
                if (i2 < i.b) {
                   path = new Path();
                   i.A.set((float)i2, 0, (float)i.b, (float)c);
                   if (i.w != null) {
                      i.z.setColor(i.m);
                   }else {
                      i.z.setColor(a1.a(R.color.arg_RES_7f060c8a));
                   }
                   i.z.setStyle(Paint$Style.FILL);
                   path.addRoundRect(i.A, uofloatArray, Path$Direction.CW);
                   path.close();
                   uCanvas.drawPath(path, i.z);
                }
             }
          }else {
             goto label_007a ;
          }
          i.z.setStyle(Paint$Style.FILL);
          i.z.setColor(0xff000000);
          obj.drawBitmap(uBitmap, 0, 0, i.z);
          i.z.setXfermode(null);
       }
       return;
    }
    public final void h(){
       if (PatchProxy.applyVoid(null, this, LiveVotePercentProgressbar.class, "12")) {
          return;
       }
       this.e = this.d / 2.00f;
       if (this.isSelected()) {
          Object[] objArray = new Object[0];
          a.C().s("LiveVotePercentProgressbar", "updateColor: "+this.b()+this.isSelected(), objArray);
          this.n = this.q;
       }else if(this.b()){
          this.n = this.p;
       }else {
          this.n = this.o;
       }
       this.invalidate();
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LiveVotePercentProgressbar.class, "15")) {
          return;
       }
       LiveVotePercentProgressbar tj = this.j;
       if (tj != null) {
          tj.cancel();
          this.j = null;
       }
       super.onDetachedFromWindow();
       return;
    }
    public synchronized void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVotePercentProgressbar.class, "5")) {
          return;
       }
       this.b = (this.getWidth() - this.getPaddingLeft()) - this.getPaddingRight();
       int i = (this.getHeight() - this.getPaddingTop()) - this.getPaddingBottom();
       this.c = i;
       if (!i || this.b == null) {
          super.onDraw(p0);
          return;
       }else if(this.y != null || this.a()){
          this.g(p0);
          return;
       }else {
          this.z.setXfermode(null);
          Object[] objArray = new Object[0];
          a.C().s("LiveVotePercentProgressbar", "onDraw: "+this.n, objArray);
          p0.drawColor(this.n);
          LiveVotePercentProgressbar tb = this.b;
          this.f = this.getPaddingLeft();
          i = this.getHeight() / 2;
          this.g = i;
          this.h = this.f + (tb - (int)((float)tb * (0x3f800000 - (((float)this.getProgress() * 0x3f800000) / (float)this.getMax()))));
          this.i = i;
          this.z.setXfermode(null);
          this.e(p0);
          return;
       }
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(LiveVotePercentProgressbar.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, LiveVotePercentProgressbar.class, "2")) {
          return;
       }
       this.b = (p0 - this.getPaddingLeft()) - this.getPaddingRight();
       this.c = (p1 - this.getPaddingTop()) - this.getPaddingBottom();
       if (p0 > 0 && p1 > 0) {
          this.s = this.f(p0, p1);
       }
       super.onSizeChanged(p0, p1, p2, p3);
       return;
    }
    public void setCorner(int p0){
       this.r = p0;
    }
    public void setEnabled(boolean p0){
       if (PatchProxy.isSupport(LiveVotePercentProgressbar.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveVotePercentProgressbar.class, "8")) {
          return;
       }
       super.setEnabled(p0);
       this.h();
       return;
    }
    public void setHighLight(boolean p0){
       this.w = p0;
    }
    public void setProgressColor(int p0){
       if (PatchProxy.isSupport(LiveVotePercentProgressbar.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveVotePercentProgressbar.class, "1")) {
          return;
       }
       this.p = p0;
       this.n = p0;
       this.h();
       return;
    }
    public void setSelectLeftColor(int p0){
       this.l = p0;
    }
    public void setSelectRightColor(int p0){
       this.m = p0;
    }
    public void setSelectable(boolean p0){
       if (PatchProxy.isSupport(LiveVotePercentProgressbar.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveVotePercentProgressbar.class, "10")) {
          return;
       }
       this.v = p0;
       this.h();
       return;
    }
    public void setSelected(boolean p0){
       if (PatchProxy.isSupport(LiveVotePercentProgressbar.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveVotePercentProgressbar.class, "7")) {
          return;
       }
       super.setSelected(p0);
       this.h();
       return;
    }
    public void setShowProgress(boolean p0){
       this.y = p0;
    }
    public void setStrokeAbove(boolean p0){
       this.t = p0;
    }
    public void setStrokeColor(int p0){
       this.k = p0;
    }
    public void setVoteResult(boolean p0){
       if (PatchProxy.isSupport(LiveVotePercentProgressbar.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveVotePercentProgressbar.class, "9")) {
          return;
       }
       this.x = p0;
       this.invalidate();
       return;
    }
    public void setWin(boolean p0){
       if (PatchProxy.isSupport(LiveVotePercentProgressbar.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveVotePercentProgressbar.class, "11")) {
          return;
       }
       this.u = p0;
       this.h();
       return;
    }
}
