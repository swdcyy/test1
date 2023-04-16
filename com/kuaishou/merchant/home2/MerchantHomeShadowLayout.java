package com.kuaishou.merchant.home2.MerchantHomeShadowLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Float;
import java.lang.String;
import android.graphics.RectF;
import java.lang.Math;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.view.ViewGroup;
import ll8.c$b;
import com.kwai.robust.PatchProxyResult;
import android.content.res.TypedArray;
import android.content.res.Resources;
import zw3.d;
import java.util.Objects;
import lnc.a1;
import com.kwai.sdk.switchconfig.a;
import android.os.Build$VERSION;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.ContextWrapper;
import androidx.fragment.app.FragmentActivity;
import rw3.b;
import android.view.View;
import java.lang.Boolean;
import android.os.SystemClock;
import com.kuaishou.merchant.home.basic.log.MerchantHomeLogBiz;
import p74.a;
import o74.a;

public class MerchantHomeShadowLayout extends ConstraintLayout	// class@0016e3
{
    public int B;
    public float C;
    public float D;
    public float E;
    public float F;
    public boolean G;
    public boolean H;
    public boolean I;
    public long J;
    public long K;
    public RectF L;
    public Paint M;
    public b N;
    public boolean O;

    public void MerchantHomeShadowLayout(Context p0){
       super(p0);
       this.G = true;
       this.H = false;
       this.I = true;
       this.M(p0, null);
    }
    public void MerchantHomeShadowLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.G = true;
       this.H = false;
       this.I = true;
       this.M(p0, p1);
    }
    public void MerchantHomeShadowLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.G = true;
       this.H = false;
       this.I = true;
       this.M(p0, p1);
    }
    public final void L(int p0,int p1,float p2,float p3,float p4,int p5){
       if (PatchProxy.isSupport(MerchantHomeShadowLayout.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Float.valueOf(p2),Float.valueOf(p3),Float.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, MerchantHomeShadowLayout.class, "16")) {
             return;
          }
       }
       float f = 0x3f800000;
       RectF rectF = new RectF(p2, p2, (((float)p0 * f) - p2), (((float)p1 * f) - p2));
       RectF rectF1 = null;
       if (p4 - rectF1 > 0) {
          rectF.top = rectF.top + p4;
          rectF.bottom = rectF.bottom - p4;
       }else if(p4 - rectF1 < 0){
          rectF.top = rectF.top + Math.abs(p4);
          rectF.bottom = rectF.bottom - Math.abs(p4);
       }
       if (p3 - rectF1 > 0) {
          rectF.left = rectF.left + p3;
          rectF.right = rectF.right - p3;
       }else if(p3 - rectF1 < 0){
          rectF.left = rectF.left + Math.abs(p3);
          rectF.right = rectF.right - Math.abs(p3);
       }
       this.L = rectF;
       Paint paint = new Paint();
       paint.setAntiAlias(1);
       paint.setColor(0);
       paint.setStyle(Paint$Style.FILL);
       if (!this.isInEditMode()) {
          paint.setShadowLayer(p2, p3, p4, p5);
       }
       this.M = paint;
       return;
    }
    public final void M(Context p0,AttributeSet p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MerchantHomeShadowLayout.class, "1")) {
          return;
       }
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, this, MerchantHomeShadowLayout.class, "12")) {
          int[] p3 = c$b.p3;
          TypedArray typedArray = PatchProxy.applyThreeRefs(p0, p1, p3, this, MerchantHomeShadowLayout.class, "14");
          if (typedArray != PatchProxyResult.class) {
          }else {
             typedArray = p0.obtainStyledAttributes(p1, p3, false, false);
          }
          this.D = typedArray.getDimension(false, this.getResources().getDimension(0x7f070429));
          this.C = typedArray.getDimension(4, this.getResources().getDimension(0x7f070426));
          Objects.requireNonNull(d.a);
          this.C = 0;
          this.E = typedArray.getDimension(1, 0);
          this.F = typedArray.getDimension(2, 0);
          this.B = typedArray.getColor(3, a1.a(0x7f06161c));
          typedArray.recycle();
       }
       this.setPadding((int)(this.C + Math.abs(this.E)), (int)(this.C + Math.abs(this.F)), (int)(this.C + Math.abs(this.E)), (int)(this.C + Math.abs(this.F)));
       this.O = a.t().d("merchantHomeDrawShadowOpt", false);
       if (this.N()) {
          this.setWillNotDraw(false);
          this.setClipToPadding(false);
       }
       return;
    }
    public final boolean N(){
       boolean b = (this.O != null && Build$VERSION.SDK_INT >= 28)? true: false;
       return b;
    }
    public final void O(int p0,int p1){
       Bitmap uBitmap;
       if (PatchProxy.isSupport(MerchantHomeShadowLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, MerchantHomeShadowLayout.class, "11")) {
          return;
       }
       if (this.N()) {
          return;
       }
       MerchantHomeShadowLayout tD = this.D;
       MerchantHomeShadowLayout tC = this.C;
       MerchantHomeShadowLayout tE = this.E;
       MerchantHomeShadowLayout tF = this.F;
       MerchantHomeShadowLayout tB = this.B;
       if (PatchProxy.isSupport(MerchantHomeShadowLayout.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Float.valueOf(tD),Float.valueOf(tC),Float.valueOf(tE),Float.valueOf(tF),Integer.valueOf(tB),Integer.valueOf(0)};
          uBitmap = PatchProxy.apply(objArray, this, MerchantHomeShadowLayout.class, "15");
          if (uBitmap != PatchProxyResult.class) {
          label_0101 :
             this.setBackground(new BitmapDrawable(this.getResources(), uBitmap));
             return;
          }
       }
       uBitmap = Bitmap.createBitmap(p0, p1, Bitmap$Config.ALPHA_8);
       Canvas uCanvas = new Canvas(uBitmap);
       float f = 0x3f800000;
       RectF rectF = new RectF(tC, tC, (((float)p0 * f) - tC), (((float)p1 * f) - tC));
       RectF rectF1 = null;
       if (tF - rectF1 > 0) {
          rectF.top = rectF.top + tF;
          rectF.bottom = rectF.bottom - tF;
       }else if(tF - rectF1 < 0){
          rectF.top = rectF.top + Math.abs(tF);
          rectF.bottom = rectF.bottom - Math.abs(tF);
       }
       if (tE - rectF1 > 0) {
          rectF.left = rectF.left + tE;
          rectF.right = rectF.right - tE;
       }else if(tE - rectF1 < 0){
          rectF.left = rectF.left + Math.abs(tE);
          rectF.right = rectF.right - Math.abs(tE);
       }
       Paint paint = new Paint();
       paint.setAntiAlias(1);
       paint.setColor(0);
       paint.setStyle(Paint$Style.FILL);
       if (!this.isInEditMode()) {
          paint.setShadowLayer(tC, tE, tF, tB);
       }
       uCanvas.drawRoundRect(rectF, tD, tD, paint);
       goto label_0101 ;
    }
    public final GifshowActivity getActivity(){
       Context obj = PatchProxy.apply(null, this, MerchantHomeShadowLayout.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       for (obj = this.getContext(); obj != null; obj = obj.getBaseContext()) {
          if (obj instanceof GifshowActivity) {
             return obj;
          }
          if (obj instanceof ContextWrapper) {
          }else {
             break ;
          }
       }
       return null;
    }
    public int getSuggestedMinimumHeight(){
       return 0;
    }
    public int getSuggestedMinimumWidth(){
       return 0;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, MerchantHomeShadowLayout.class, "2")) {
          return;
       }
       super.onAttachedToWindow();
       if (!PatchProxy.applyVoid(null, this, MerchantHomeShadowLayout.class, "3") && this.N == null) {
          GifshowActivity activity = this.getActivity();
          if (activity != null) {
             this.N = b.s0(activity);
          }
       }
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantHomeShadowLayout.class, "8")) {
          return;
       }
       super.onDraw(p0);
       if (this.N() && !PatchProxy.applyVoidOneRefs(p0, this, MerchantHomeShadowLayout.class, "17")) {
          MerchantHomeShadowLayout tL = this.L;
          if (tL != null) {
             MerchantHomeShadowLayout tM = this.M;
             if (tM != null) {
                p0.drawRoundRect(tL, this.D, this.D, tM);
             }
          }
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       int i = 0;
       if (PatchProxy.isSupport(MerchantHomeShadowLayout.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, MerchantHomeShadowLayout.class, "7")) {
             return;
          }
       }
       long l = SystemClock.elapsedRealtime();
       super.onLayout(p0, p1, p2, p3, p4);
       if (this.H != null) {
          this.H = i;
          i = p3 - p1;
          int i1 = p4 - p2;
          this.O(i, i1);
          this.L(i, i1, this.C, this.E, this.F, this.B);
       }
       long l1 = this.J + (SystemClock.elapsedRealtime() - l);
       this.J = l1;
       MerchantHomeShadowLayout tN = this.N;
       if (tN != null) {
          tN.u0("feedLayout", l1);
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(MerchantHomeShadowLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, MerchantHomeShadowLayout.class, "6")) {
          return;
       }
       super.onMeasure(p0, p1);
       long l = this.K + (SystemClock.elapsedRealtime() - SystemClock.elapsedRealtime());
       this.K = l;
       MerchantHomeShadowLayout tN = this.N;
       if (tN != null) {
          tN.u0("feedMeasure", l);
       }
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(MerchantHomeShadowLayout.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, MerchantHomeShadowLayout.class, "5")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       if (p0 > 0 && (p1 > 0 && (this.getBackground() != null && (this.G != null || this.H != null)))) {
          this.H = false;
          this.O(p0, p1);
          this.L(p0, p1, this.C, this.E, this.F, this.B);
       }
    label_004d :
       return;
    }
    public void requestLayout(){
       if (PatchProxy.applyVoid(null, this, MerchantHomeShadowLayout.class, "9")) {
          return;
       }
       if (this.I != null) {
          super.requestLayout();
       }else {
          a.d(MerchantHomeLogBiz.Performance, "MerchantHomeShadowLayout", "requestLayout disabled");
       }
       return;
    }
    public void setCornerRadius(int p0){
       this.D = (float)p0;
    }
    public void setInvalidateShadowOnSizeChanged(boolean p0){
       this.G = p0;
    }
    public void setPerfViewModel(b p0){
       this.N = p0;
    }
    public void setRequestLayoutEnabled(boolean p0){
       this.I = p0;
    }
    public void setShadowColor(int p0){
       this.B = p0;
    }
    public void setShadowRadius(int p0){
       if (PatchProxy.isSupport(MerchantHomeShadowLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, MerchantHomeShadowLayout.class, "13")) {
          return;
       }
       float f = (float)p0;
       this.C = f;
       this.setPadding((int)(f + Math.abs(this.E)), (int)(this.C + Math.abs(this.F)), (int)(f + Math.abs(this.E)), (int)(this.C + Math.abs(this.F)));
       return;
    }
}
