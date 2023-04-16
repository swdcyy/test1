package com.yxcorp.gifshow.v3.editor.decoration.safearea.SafeAreaView;
import androidx.constraintlayout.widget.ConstraintLayout;
import lnc.a1;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.DashPathEffect;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint$Style;
import android.graphics.Xfermode;
import android.graphics.Paint$Cap;
import android.graphics.PathEffect;
import android.view.ViewParent;
import android.view.View;
import java.lang.ref.WeakReference;
import i2b.a;
import android.widget.TextView;
import aqc.b;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewTreeObserver;
import com.yxcorp.gifshow.v3.editor.decoration.safearea.SafeAreaView$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.v3.editor.decoration.safearea.SafeAreaView$b;
import java.lang.Boolean;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import java.lang.CharSequence;

public class SafeAreaView extends ConstraintLayout	// class@000f17
{
    public Paint B;
    public View C;
    public TextView D;
    public RectF E;
    public DashPathEffect F;
    public PorterDuffXfermode G;
    public Bitmap H;
    public float I;
    public static final int J;
    public static final int K;
    public static WeakReference L;
    public static boolean M;

    static {
       SafeAreaView.J = a1.e(0x3f800000);
       SafeAreaView.K = a1.e(6.00f);
    }
    public void SafeAreaView(Context p0){
       int k;
       super(p0);
       this.B = new Paint();
       this.E = new RectF(0, 0, 0, 0);
       float[] uofloatArray = new float[]{(float)k,(float)k};
       k = SafeAreaView.K;
       this.F = new DashPathEffect(uofloatArray, 0);
       this.G = new PorterDuffXfermode(PorterDuff$Mode.DST_OUT);
       this.I = 0x3f800000;
       this.M(p0);
    }
    public void SafeAreaView(Context p0,AttributeSet p1){
       int k;
       super(p0, p1);
       this.B = new Paint();
       this.E = new RectF(0, 0, 0, 0);
       float[] uofloatArray = new float[]{(float)k,(float)k};
       k = SafeAreaView.K;
       this.F = new DashPathEffect(uofloatArray, 0);
       this.G = new PorterDuffXfermode(PorterDuff$Mode.DST_OUT);
       this.I = 0x3f800000;
       this.M(p0);
    }
    public void SafeAreaView(Context p0,AttributeSet p1,int p2){
       int k;
       super(p0, p1, p2);
       this.B = new Paint();
       this.E = new RectF(0, 0, 0, 0);
       float[] uofloatArray = new float[]{(float)k,(float)k};
       k = SafeAreaView.K;
       this.F = new DashPathEffect(uofloatArray, 0);
       this.G = new PorterDuffXfermode(PorterDuff$Mode.DST_OUT);
       this.I = 0x3f800000;
       this.M(p0);
    }
    public final void L(){
       SafeAreaView tE;
       Canvas uCanvas1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SafeAreaView.class, "9")) {
          return;
       }
       this.H = Bitmap.createBitmap(this.getWidth(), this.getHeight(), Bitmap$Config.ARGB_8888);
       if (!PatchProxy.applyVoid(objArray, this, SafeAreaView.class, "10")) {
          Canvas uCanvas = new Canvas(this.H);
          this.B.setColor(Color.parseColor("#4DFFFFFF"));
          this.B.setStyle(Paint$Style.FILL);
          uCanvas.drawRect(0, 0, (float)this.getWidth(), (float)this.getHeight(), this.B);
          this.B.setXfermode(this.G);
          int i = -1;
          this.B.setColor(i);
          uCanvas.drawRect(this.E, this.B);
          this.B.setXfermode(objArray);
          this.B.setColor(i);
          this.B.setStrokeWidth((float)SafeAreaView.J);
          this.B.setStrokeCap(Paint$Cap.ROUND);
          this.B.setPathEffect(this.F);
          this.B.setStyle(Paint$Style.STROKE);
          if (SafeAreaView.M) {
             if (((float)this.getParent().getWidth() / (float)this.getParent().getHeight()) - 0x3f400000 > 0) {
                tE = this.E;
                RectF left = tE.left;
                uCanvas1 = uCanvas;
                uCanvas1.drawLine(left, tE.top, left, tE.bottom, this.B);
                tE = this.E;
                left = tE.right;
                uCanvas1.drawLine(left, tE.top, left, tE.bottom, this.B);
             }else {
                tE = this.E;
                RectF top = tE.top;
                uCanvas1 = uCanvas;
                uCanvas1.drawLine(tE.left, top, tE.right, top, this.B);
                tE = this.E;
                top = tE.bottom;
                uCanvas1.drawLine(tE.left, top, tE.right, top, this.B);
             }
          }else {
             uCanvas.drawRect(this.E, this.B);
          }
       }
       SafeAreaView.L = new WeakReference(this.H);
       return;
    }
    public final void M(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SafeAreaView.class, "3")) {
          return;
       }
       View view = a.d(p0, R.layout.arg_RES_7f0d132b, this, true);
       this.C = view;
       this.D = view.findViewById(0x7f0a36d5);
       this.setWillNotDraw(false);
       this.B.setAntiAlias(true);
       return;
    }
    public void N(){
       int k;
       SafeAreaView tI;
       RectF rectF;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SafeAreaView.class, "5")) {
          return;
       }
       if (!this.getParent() instanceof View) {
          return;
       }
       this.I = this.getParent().getScaleX();
       float[] uofloatArray = new float[]{(float)k / tI,(float)k / tI};
       k = SafeAreaView.K;
       tI = this.I;
       k = 1;
       this.F = new DashPathEffect(uofloatArray, 0);
       if (!SafeAreaView.M) {
          SafeAreaView.M = k;
          SafeAreaView.L = objArray;
       }
       float f = (float)this.getParent().getWidth();
       float f1 = (float)this.getParent().getHeight();
       if (!f || !f1) {
          this.getViewTreeObserver().addOnGlobalLayoutListener(new SafeAreaView$a(this));
          return;
       }else {
          SafeAreaView tE = this.E;
          b uob = b.class;
          if (PatchProxy.isSupport(uob)) {
             rectF = PatchProxy.applyTwoRefs(Float.valueOf(f1), Float.valueOf(f), objArray, uob, "2");
             if (rectF != PatchProxyResult.class) {
             }else {
             label_0082 :
                float f2 = 0x3f400000;
                v1 = (f / f1) - f2;
                if (!rectF) {
                   rectF = new RectF(0, 0, 0, 0);
                }else if(rectF > 0){
                   f2 = f2 * f1;
                   rectF = new RectF(((f - f2) / 2.00f), 0, ((f + f2) / 2.00f), f1);
                }else {
                   float f3 = f / f2;
                   rectF = new RectF(0, ((f1 - f3) / 2.00f), f, ((f1 + f3) / 2.00f));
                }
             }
          }else {
             goto label_0082 ;
          }
          tE.set(rectF);
          this.invalidate();
          return;
       }
    }
    public void O(){
       int k;
       SafeAreaView tI;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SafeAreaView.class, "6")) {
          return;
       }
       if (!this.getParent() instanceof View) {
          return;
       }
       this.I = this.getParent().getScaleX();
       float[] uofloatArray = new float[]{(float)k / tI,(float)k / tI};
       k = SafeAreaView.K;
       tI = this.I;
       this.F = new DashPathEffect(uofloatArray, 0);
       if (SafeAreaView.M) {
          SafeAreaView.M = false;
          SafeAreaView.L = objArray;
       }
       float f = (float)this.getParent().getWidth();
       float f1 = (float)this.getParent().getHeight();
       if (!f || !f1) {
          this.getViewTreeObserver().addOnGlobalLayoutListener(new SafeAreaView$b(this));
          return;
       }else {
          this.E.set(b.c(f1, f));
          this.invalidate();
          return;
       }
    }
    public RectF getSafeAreaRect(){
       return this.E;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SafeAreaView.class, "7")) {
          return;
       }
       super.onDraw(p0);
       if (!this.E.width() && !this.E.height()) {
          return;
       }
       p0.save();
       SafeAreaView tD = this.D;
       int i = 0;
       float f = this.E.width();
       boolean m = SafeAreaView.M;
       int g = b.g;
       int i1 = 6;
       int i2 = (m)? 4: 6;
       float f1 = (float)(b.f * 2);
       if (((float)(i2 * g) + f1) - f < 0) {
          f = (float)g;
       }else {
          f = f - f1;
          if (m) {
             i1 = 4;
          }
          f = f / (float)i1;
       }
       tD.setTextSize(i, (f / this.I));
       if (!PatchProxy.applyVoid(null, this, SafeAreaView.class, "8")) {
          tD = this.H;
          if (tD == null || (tD.isRecycled() || (this.H.getWidth() != this.getParent().getWidth() || this.H.getHeight() != this.getParent().getHeight()))) {
             WeakReference l = SafeAreaView.L;
             if (l == null || l.get() == null) {
                this.L();
             }else {
                Bitmap uBitmap = SafeAreaView.L.get();
                if (!uBitmap.isRecycled() && (uBitmap.getWidth() != this.getParent().getWidth() || uBitmap.getHeight() != this.getParent().getHeight())) {
                   this.L();
                }else {
                   this.H = uBitmap;
                }
             }
          }
       }
       p0.drawBitmap(this.H, 0, 0, this.B);
       p0.restore();
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(SafeAreaView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, SafeAreaView.class, "2")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(SafeAreaView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, SafeAreaView.class, "1")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = this.getLayoutParams();
       layoutParams.width = -1;
       layoutParams.height = -1;
       this.setLayoutParams(layoutParams);
       super.onMeasure(p0, p1);
       return;
    }
    public void setHintString(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SafeAreaView.class, "4")) {
          return;
       }
       this.D.setText(p0);
       return;
    }
}
