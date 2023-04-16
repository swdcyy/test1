package com.kwai.feature.api.live.floatingscreen.widget.LiveFloatingScreenStdShimmerLayout;
import zq5.a;
import android.widget.ImageView;
import com.kwai.feature.api.live.floatingscreen.widget.LiveFloatingScreenStdShimmerLayout$a;
import nsd.u;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Paint;
import android.graphics.RectF;
import com.kwai.feature.api.live.floatingscreen.widget.LiveFloatingScreenStdShimmerLayout$c;
import com.kwai.feature.api.live.floatingscreen.widget.LiveFloatingScreenStdShimmerLayout$d;
import android.widget.ImageView$ScaleType;
import com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenEffectData;
import hr5.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.model.CDNUrl;
import android.graphics.Bitmap;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import jr5.a;
import jr5.a$a;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.live.floatingscreen.widget.LiveFloatingScreenStdShimmerLayout$e;
import java.lang.Runnable;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.animation.ValueAnimator;
import java.lang.Number;
import com.kwai.feature.api.live.floatingscreen.widget.LiveFloatingScreenStdShimmerLayout$b;
import ekd.k1;
import android.graphics.Canvas;
import android.graphics.drawable.NinePatchDrawable;
import android.graphics.Paint$Style;
import android.graphics.Shader;
import java.util.Objects;
import android.graphics.Path$Direction;
import java.lang.Boolean;
import java.lang.Integer;
import android.view.View;
import com.kwai.feature.api.live.floatingscreen.data.LiveEnterRoomEffectBackgroudPicInfo;
import java.lang.Math;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import android.graphics.Rect;

public final class LiveFloatingScreenStdShimmerLayout extends ImageView implements a	// class@000fd2
{
    public RectF A;
    public Paint B;
    public int[] C;
    public float[] D;
    public LinearGradient E;
    public NinePatchDrawable F;
    public LiveEnterRoomEffectBackgroudPicInfo G;
    public Bitmap H;
    public int b;
    public float c;
    public int[] d;
    public float[] e;
    public Matrix f;
    public float g;
    public Path h;
    public Bitmap i;
    public Shader j;
    public Paint k;
    public RectF l;
    public boolean m;
    public ValueAnimator n;
    public long o;
    public long p;
    public long q;
    public LiveFloatingScreenStdShimmerLayout$c r;
    public ValueAnimator$AnimatorUpdateListener s;
    public int t;
    public int[] u;
    public float[] v;
    public LinearGradient w;
    public RectF x;
    public Paint y;
    public float z;
    public static final LiveFloatingScreenStdShimmerLayout$a I;

    static {
       LiveFloatingScreenStdShimmerLayout.I = new LiveFloatingScreenStdShimmerLayout$a(null);
    }
    public void LiveFloatingScreenStdShimmerLayout(Context p0){
       super(p0, null);
    }
    public void LiveFloatingScreenStdShimmerLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveFloatingScreenStdShimmerLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = 2;
       this.f = new Matrix();
       this.g = 0x41f00000;
       this.h = new Path();
       this.k = new Paint();
       this.l = new RectF();
       this.o = 1000;
       this.r = new LiveFloatingScreenStdShimmerLayout$c(this);
       this.s = new LiveFloatingScreenStdShimmerLayout$d(this);
       this.x = new RectF();
       this.y = new Paint();
       this.A = new RectF();
       this.B = new Paint();
       this.setScaleType(ImageView$ScaleType.FIT_XY);
    }
    public static void getBackgroundType$annotations(){
    }
    public static void getShimmerType$annotations(){
    }
    public final void a(LiveFloatingScreenEffectData p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveFloatingScreenStdShimmerLayout.class, "4")) {
          return;
       }
       a.p(p0, "data");
       a.p(p1, "resourceProvider");
       int i = 0;
       if (p0.getShimmerResType() == 1) {
          CDNUrl[] shimmerPicUr = p0.getShimmerPicUrls();
          if (shimmerPicUr != null) {
             String str = (!shimmerPicUr.length)? 1: null;
             if (!str) {
             label_002c :
                if (!i) {
                   this.i = p1.c(p0.getShimmerPicUrls());
                }else if(p0.getShimmerDrawableId()){
                   c uoc = a.a();
                   a.o(uoc, "AppEnv.get\(\)");
                   Application uApplication = uoc.a();
                   a.o(uApplication, "AppEnv.get\(\).appContext");
                   this.i = BitmapFactory.decodeResource(uApplication.getResources(), p0.getShimmerDrawableId());
                }
                this.b = 1;
             }
          }
          i = 1;
          goto label_002c ;
       }else {
          int i1 = 2;
          if (p0.getShimmerResType() == i1) {
             this.b = i1;
             String[] shimmerGradi = p0.getShimmerGradientStrColors();
             if (shimmerGradi != null) {
                a$a uoa = (!shimmerGradi.length)? 1: null;
                if (!uoa) {
                label_007a :
                   int[] ointArray = (!i)? a.b.d(p0.getShimmerGradientStrColors()): p0.getShimmerGradientIntColors();
                   this.d = ointArray;
                   this.q = p0.getEffectDelayTimeMs();
                   this.d = p0.getShimmerGradientIntColors();
                   this.g = p0.getShimmerGradientAngle();
                   this.e = p0.getShimmerGradientLocations();
                }
             }
             i = 1;
             goto label_007a ;
          }
       }
       return;
    }
    public final Bitmap b(Bitmap p0,float p1){
       if (PatchProxy.isSupport(LiveFloatingScreenStdShimmerLayout.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Float.valueOf(p1), this, LiveFloatingScreenStdShimmerLayout.class, "24");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1 <= 0) {
          return p0;
       }else {
          Matrix matrix = new Matrix();
          matrix.postScale(p1, p1);
          p0 = Bitmap.createBitmap(p0, 0, 0, p0.getWidth(), p0.getHeight(), matrix, true);
          a.o(p0, "scaleBitmap");
          return p0;
       }
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, LiveFloatingScreenStdShimmerLayout.class, "15")) {
          return;
       }
       this.post(new LiveFloatingScreenStdShimmerLayout$e(this));
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, LiveFloatingScreenStdShimmerLayout.class, "23")) {
          return;
       }
       LiveFloatingScreenStdShimmerLayout tu = this.u;
       if (tu != null) {
          LinearGradient linearGradie = new LinearGradient(0, 0, (float)this.getMeasuredWidth(), 0, tu, this.v, Shader$TileMode.CLAMP);
          this.w = v0;
       }
       return;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, LiveFloatingScreenStdShimmerLayout.class, "22")) {
          return;
       }
       LiveFloatingScreenStdShimmerLayout tC = this.C;
       if (tC != null) {
          LinearGradient linearGradie = new LinearGradient(0, 0, (float)this.getMeasuredWidth(), 0, tC, this.D, Shader$TileMode.CLAMP);
          this.E = v0;
       }
       return;
    }
    public final int[] getBackgroundGradientColors(){
       return this.u;
    }
    public final float[] getBackgroundGradientPoints(){
       return this.v;
    }
    public final int getBackgroundType(){
       return this.t;
    }
    public final LinearGradient getBorderGradient(){
       return this.E;
    }
    public final int[] getBorderGradientColors(){
       return this.C;
    }
    public final float[] getBorderGradientPoints(){
       return this.D;
    }
    public final float getBorderWidth(){
       return this.z;
    }
    public final float getCornerRadius(){
       return this.c;
    }
    public final ValueAnimator getShimmerAnimator(){
       return this.n;
    }
    public final long getShimmerAnimatorDurationMs(){
       return this.o;
    }
    public final long getShimmerAnimatorInterval(){
       return this.p;
    }
    public final Bitmap getShimmerBitmap(){
       return this.i;
    }
    public final float getShimmerBitmapScale(){
       LiveFloatingScreenStdShimmerLayout obj = PatchProxy.apply(null, this, LiveFloatingScreenStdShimmerLayout.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = this.i;
       float f = (obj == null)? 0x3f800000: (float)this.getHeight() / (float)obj.getHeight();
       return f;
    }
    public final long getShimmerDelayTimeMs(){
       return this.q;
    }
    public final int[] getShimmerGradientColors(){
       return this.d;
    }
    public final Matrix getShimmerGradientMatrix(){
       return this.f;
    }
    public final float[] getShimmerGradientPoints(){
       return this.e;
    }
    public final float getShimmerGradientRotateAngle(){
       return this.g;
    }
    public final int getShimmerType(){
       return this.b;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, LiveFloatingScreenStdShimmerLayout.class, "25")) {
          return;
       }
       if (this.q > 0) {
          k1.s(new LiveFloatingScreenStdShimmerLayout$b(this), this, this.q);
       }else {
          this.c();
       }
       return;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, LiveFloatingScreenStdShimmerLayout.class, "26")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, LiveFloatingScreenStdShimmerLayout.class, "16")) {
          LiveFloatingScreenStdShimmerLayout tn = this.n;
          if (tn != null) {
             tn.removeAllListeners();
          }
          tn = this.n;
          if (tn != null) {
             tn.cancel();
          }
       }
       return;
    }
    public void onDraw(Canvas p0){
       float f = this;
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, f, LiveFloatingScreenStdShimmerLayout.class, "6")) {
          return;
       }
       super.onDraw(p0);
       LiveFloatingScreenStdShimmerLayout c = f.c;
       float f1 = 2.00f;
       float f2 = 0;
       if (!c - f2) {
          c = (float)this.getHeight() / f1;
       }
       f.c = c;
       int i = 2;
       boolean b = true;
       if (!PatchProxy.applyVoidOneRefs(obj, f, LiveFloatingScreenStdShimmerLayout.class, "7")) {
          c = f.t;
          String str = null;
          if (c == b) {
             if (!PatchProxy.applyVoidOneRefs(obj, f, LiveFloatingScreenStdShimmerLayout.class, "8") && obj != null) {
                c = f.F;
                if (c != null) {
                   c.setBounds(str, str, this.getWidth(), this.getHeight());
                }
                c = f.F;
                if (c != null) {
                   c.draw(obj);
                }
             }
          }else if(c != i || PatchProxy.applyVoidOneRefs(obj, f, LiveFloatingScreenStdShimmerLayout.class, "9")){
             c = f.u;
             if (c != null) {
                if (!c.length) {
                   str = 1;
                }
                if (str != b) {
                   f.x.set(f2, f2, (float)this.getWidth(), (float)this.getHeight());
                   if (f.w == null) {
                      this.d();
                   }
                   f.y.setStyle(Paint$Style.FILL);
                   f.y.setShader(f.w);
                   if (obj != null) {
                      obj.drawRoundRect(f.x, f.c, f.c, f.y);
                   }
                }
             }
          }
       }
    label_00a1 :
       if (!PatchProxy.applyVoidOneRefs(obj, f, LiveFloatingScreenStdShimmerLayout.class, "10")) {
          c = f.z;
          if (c - f2) {
             f.A.set((c / f1), (c / f1), ((float)this.getWidth() - (f.z / f1)), ((float)this.getHeight() - (f.z / f1)));
             if (f.E == null) {
                this.e();
             }
             f.B.setStyle(Paint$Style.STROKE);
             f.B.setStrokeWidth(f.z);
             f.B.setShader(f.E);
             if (obj != null) {
                obj.drawRoundRect(f.A, f.c, f.c, f.B);
             }
          }
       }
       if (!PatchProxy.applyVoidOneRefs(obj, f, LiveFloatingScreenStdShimmerLayout.class, "11")) {
          c = f.b;
          if (c != b) {
             if (c == i && !PatchProxy.applyVoidOneRefs(obj, f, LiveFloatingScreenStdShimmerLayout.class, "12")) {
                c = f.n;
                if (f.j == null) {
                   LiveFloatingScreenStdShimmerLayout d = f.d;
                   if (d != null) {
                      LinearGradient linearGradie = new LinearGradient(0, ((float)this.getHeight() / f1), (float)this.getWidth(), ((float)this.getHeight() / (float)i), d, f.e, Shader$TileMode.CLAMP);
                      f.j = v8;
                      f.k.setShader(v8);
                   }
                }
                if (c == null || !c.isRunning()) {
                   f.f.reset();
                   f.f.postTranslate((- (float)this.getWidth()), f2);
                   f.k.getShader().setLocalMatrix(f.f);
                }else {
                   f.f.reset();
                   f.f.setRotate(f.g, ((float)this.getWidth() / f1), ((float)this.getHeight() / f1));
                   Object animatedValu = c.getAnimatedValue();
                   Objects.requireNonNull(animatedValu, "null cannot be cast to non-null type kotlin.Float");
                   f.f.postTranslate(animatedValu.floatValue(), f2);
                   f.k.getShader().setLocalMatrix(f.f);
                }
                f.l.set(f2, f2, (float)this.getWidth(), (float)this.getHeight());
                f.k.setAntiAlias(b);
                if (obj != null) {
                   obj.drawRoundRect(f.l, f.c, f.c, f.k);
                }
             }
          }else if(PatchProxy.applyVoidOneRefs(obj, f, LiveFloatingScreenStdShimmerLayout.class, "13")){
             c = f.i;
             if (c != null) {
                LiveFloatingScreenStdShimmerLayout n = f.n;
                if (n != null && n.isRunning()) {
                   f.h.reset();
                   f.l.set(f2, f2, (float)this.getWidth(), (float)this.getHeight());
                   f.h.addRoundRect(f.l, f.c, f.c, Path$Direction.CCW);
                   if (obj != null) {
                      obj.clipPath(f.h);
                   }
                   if (obj != null) {
                      Object animatedValu1 = n.getAnimatedValue();
                      Objects.requireNonNull(animatedValu1, "null cannot be cast to non-null type kotlin.Float");
                      obj.drawBitmap(c, animatedValu1.floatValue(), f2, f.k);
                   }
                }
             }
          }
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       LiveFloatingScreenStdShimmerLayout g;
       ByteBuffer uByteBuffer;
       Bitmap uBitmap = this;
       int i = 5;
       int i1 = 4;
       int i2 = 3;
       int i3 = 0;
       byte i4 = 2;
       if (PatchProxy.isSupport(LiveFloatingScreenStdShimmerLayout.class)) {
          Object[] objArray = new Object[i];
          objArray[i3] = Boolean.valueOf(p0);
          objArray[1] = Integer.valueOf(p1);
          objArray[i4] = Integer.valueOf(p2);
          objArray[i2] = Integer.valueOf(p3);
          objArray[i1] = Integer.valueOf(p4);
          if (PatchProxy.applyVoid(objArray, uBitmap, LiveFloatingScreenStdShimmerLayout.class, "19")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       Object[] objArray1 = null;
       if (!PatchProxy.applyVoid(objArray1, uBitmap, LiveFloatingScreenStdShimmerLayout.class, "21")) {
          g = uBitmap.i;
          if (g != null) {
             float shimmerBitma = this.getShimmerBitmapScale();
             if (g.getHeight() != this.getHeight()) {
                uBitmap.i = uBitmap.b(g, shimmerBitma);
             }
          }
       }
       this.d();
       this.e();
       if (!PatchProxy.applyVoid(objArray1, uBitmap, LiveFloatingScreenStdShimmerLayout.class, "20")) {
          g = uBitmap.G;
          if (g != null) {
             LiveFloatingScreenStdShimmerLayout h = uBitmap.H;
             if (h != null) {
                LiveEnterRoomEffectBackgroudPicInfo mInsetLeftDp = g.mInsetLeftDp;
                LiveEnterRoomEffectBackgroudPicInfo mInsetRightD = g.mInsetRightDp;
                if (this.getHeight() != h.getHeight()) {
                   float f = (float)this.getHeight() / (float)h.getHeight();
                   h = uBitmap.b(h, f);
                   mInsetLeftDp = (int)((float)mInsetLeftDp * f);
                   mInsetRightD = (int)((float)mInsetRightD * f);
                }
                LiveFloatingScreenStdShimmerLayout liveFloating = h;
                a$a b = a.b;
                Resources resources = this.getResources();
                int height = liveFloating.getHeight();
                int i5 = liveFloating.getWidth() - mInsetRightD;
                Objects.requireNonNull(b);
                PatchProxyResult patchProxyRe = PatchProxyResult.class;
                a$a uoa = a$a.class;
                if (PatchProxy.isSupport(uoa)) {
                   Object[] objArray2 = new Object[]{resources,liveFloating,Integer.valueOf(1),Integer.valueOf(mInsetLeftDp),Integer.valueOf(height),Integer.valueOf(i5)};
                   NinePatchDrawable ninePatchDra = PatchProxy.apply(objArray2, b, uoa, "5");
                   if (ninePatchDra != patchProxyRe) {
                   label_0190 :
                      uBitmap.F = ninePatchDra;
                   }
                }
                a.p(liveFloating, "bitmap");
                i = Math.max(i3, mInsetLeftDp);
                i1 = liveFloating.getWidth();
                if (i5 <= mInsetLeftDp) {
                   i5 = mInsetLeftDp + 1;
                }
                i1 = Math.min(i1, i5);
                i2 = Math.max(i3, 1);
                int height1 = liveFloating.getHeight();
                if (height <= 1) {
                   height = 2;
                }
                height = Math.min(height1, height);
                if (PatchProxy.isSupport(uoa)) {
                   uByteBuffer = PatchProxy.applyFourRefs(Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(height), Integer.valueOf(i1), b, a$a.class, "6");
                   if (uByteBuffer != patchProxyRe) {
                   label_017d :
                      NinePatchDrawable ninePatchDra1 = new NinePatchDrawable(resources, liveFloating, uByteBuffer.array(), new Rect(), "");
                      goto label_0190 ;
                   }
                }
                int i6 = 9;
                uByteBuffer = ByteBuffer.allocate(84).order(ByteOrder.nativeOrder());
                uByteBuffer.put((byte)1);
                i4 = (byte)i4;
                uByteBuffer.put(i4);
                uByteBuffer.put(i4);
                uByteBuffer.put((byte)i6);
                uByteBuffer.putInt(i3);
                uByteBuffer.putInt(i3);
                uByteBuffer.putInt(i3);
                uByteBuffer.putInt(i3);
                uByteBuffer.putInt(i3);
                uByteBuffer.putInt(i3);
                uByteBuffer.putInt(i3);
                uByteBuffer.putInt(i);
                uByteBuffer.putInt(i1);
                uByteBuffer.putInt(i2);
                uByteBuffer.putInt(height);
                for (; i3 < i6; i3 = i3 + 1) {
                   uByteBuffer.putInt(1);
                }
                a.o(uByteBuffer, "buffer");
                goto label_017d ;
             }
          }
       }
       return;
    }
    public final void setBackgroundGradientColors(int[] p0){
       this.u = p0;
    }
    public final void setBackgroundGradientPoints(float[] p0){
       this.v = p0;
    }
    public final void setBackgroundType(int p0){
       this.t = p0;
    }
    public final void setBorderGradient(LinearGradient p0){
       this.E = p0;
    }
    public final void setBorderGradientColors(int[] p0){
       this.C = p0;
    }
    public final void setBorderGradientPoints(float[] p0){
       this.D = p0;
    }
    public final void setBorderWidth(float p0){
       this.z = p0;
    }
    public final void setCornerRadius(float p0){
       this.c = p0;
    }
    public final void setShimmerAnimRepeat(boolean p0){
       this.m = p0;
    }
    public final void setShimmerAnimator(ValueAnimator p0){
       this.n = p0;
    }
    public final void setShimmerAnimatorDurationMs(long p0){
       this.o = p0;
    }
    public final void setShimmerAnimatorInterval(long p0){
       this.p = p0;
    }
    public final void setShimmerBitmap(Bitmap p0){
       this.i = p0;
    }
    public final void setShimmerDelayTimeMs(long p0){
       this.q = p0;
    }
    public final void setShimmerGradientColors(int[] p0){
       this.d = p0;
    }
    public final void setShimmerGradientMatrix(Matrix p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFloatingScreenStdShimmerLayout.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.f = p0;
       return;
    }
    public final void setShimmerGradientPoints(float[] p0){
       this.e = p0;
    }
    public final void setShimmerGradientRotateAngle(float p0){
       this.g = p0;
    }
    public final void setShimmerType(int p0){
       this.b = p0;
    }
}
