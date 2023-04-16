package com.yxcorp.gifshow.v3.editor.ktv.crop.KtvBaseTimeLineView;
import android.widget.FrameLayout;
import android.content.Context;
import lnc.a1;
import java.lang.String;
import java.text.DecimalFormat;
import ekd.n0;
import android.os.Handler;
import android.os.Looper;
import com.yxcorp.gifshow.v3.editor.ktv.crop.KtvBaseTimeLineView$a;
import android.widget.ImageView;
import bld.b;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.res.Resources;
import android.graphics.Color;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout$LayoutParams;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.v3.editor.ktv.crop.KtvCropRangeView;
import android.graphics.Canvas;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Math;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.util.BitmapUtil;
import android.graphics.Paint;
import java.lang.CharSequence;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import java.text.NumberFormat;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.ViewGroup;
import com.yxcorp.gifshow.v3.editor.i;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import android.widget.TextView;
import java.lang.Integer;
import android.view.View$MeasureSpec;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;
import com.yxcorp.gifshow.v3.editor.ktv.crop.KtvBaseTimeLineView$b;

public abstract class KtvBaseTimeLineView extends FrameLayout	// class@000fbb
{
    public float A;
    public KtvBaseTimeLineView$b B;
    public Runnable C;
    public i b;
    public KtvInfo c;
    public KtvCropRangeView d;
    public TextView e;
    public CustomHorizontalScroller f;
    public ImageView g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public int m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public float w;
    public boolean x;
    public NumberFormat y;
    public Handler z;

    public void KtvBaseTimeLineView(Context p0){
       super(p0);
       this.q = (float)a1.e(10.00f);
       this.r = (float)a1.e(10.00f);
       this.y = n0.b("0.#");
       this.z = new Handler(Looper.getMainLooper());
       this.C = new KtvBaseTimeLineView$a(this);
       ImageView imageView = new ImageView(p0);
       this.g = imageView;
       b uob = new b();
       uob.v(a.a().a().getResources().getColor(R.color.arg_RES_7f060788));
       uob.x(0x3f800000);
       uob.w(Color.parseColor("#4D000000"));
       uob.g(KwaiRadiusStyles.R2);
       imageView.setImageDrawable(uob.a());
       this.addView(this.g, new FrameLayout$LayoutParams(-2, -1));
       KtvCropRangeView ktvCropRange = new KtvCropRangeView(p0);
       this.d = ktvCropRange;
       this.addView(ktvCropRange, new FrameLayout$LayoutParams(-1, -1));
    }
    public void a(Canvas p0){
    }
    public void b(Canvas p0,boolean p1){
       if (PatchProxy.isSupport(KtvBaseTimeLineView.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, KtvBaseTimeLineView.class, "7")) {
          return;
       }
       int i = (int)Math.floor((double)(this.t / (float)this.l));
       int i1 = (int)Math.ceil((double)((this.t + this.k) / (float)this.l));
       int i2 = (this.getHeight() - this.m) / 2;
       Bitmap uBitmap = null;
       while (i <= i1) {
          Bitmap uBitmap1 = this.c(i, p1);
          if (BitmapUtil.I(uBitmap1)) {
             uBitmap = uBitmap1;
          }
          if (BitmapUtil.I(uBitmap)) {
             int i3 = this.l * i;
             p0.drawBitmap(uBitmap, (float)i3, (float)i2, null);
          }
          i = i + 1;
       }
       return;
    }
    public abstract Bitmap c(int p0,boolean p1);
    public final CharSequence d(float p0){
       String obj;
       Object[] objArray;
       if (PatchProxy.isSupport(KtvBaseTimeLineView.class)) {
          obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, KtvBaseTimeLineView.class, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = 0;
       int i1 = 1;
       if (this.d.isActivated()) {
          String str = this.y.format((double)this.n);
          objArray = new Object[i1];
          objArray[i] = str;
          obj = this.getResources().getString(R.string.arg_RES_7f101af7, objArray);
          i = obj.indexOf(str);
          SpannableString spannableStr = new SpannableString(obj);
          if (i > 0 && i < obj.length()) {
             spannableStr.setSpan(new ForegroundColorSpan(-3588289), i, (str.length() + i), 18);
          }
          return spannableStr;
       }else {
          KtvBaseTimeLineView ktvBaseTimeL = 0x42700000;
          if (p0 - ktvBaseTimeL <= 0) {
             objArray = new Object[i1];
             objArray[i] = this.y.format((double)p0);
             return this.getResources().getString(0x7f101af8, objArray);
          }else {
             Object[] objArray1 = new Object[]{String.valueOf((int)(p0 / ktvBaseTimeL)),this.y.format((double)(p0 % ktvBaseTimeL))};
             return this.getResources().getString(0x7f101af9, objArray1);
          }
       }
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KtvBaseTimeLineView.class, "5")) {
          return;
       }
       if (this.l <= null) {
          return;
       }
       p0.save();
       p0.translate((this.o + this.q), 0);
       p0.clipRect(0, 0, this.j, (float)this.getHeight());
       if (!PatchProxy.applyVoidOneRefs(p0, this, KtvBaseTimeLineView.class, "6")) {
          this.b(p0, false);
       }
       this.a(p0);
       p0.restore();
       super.dispatchDraw(p0);
       return;
    }
    public abstract void e(i p0);
    public abstract boolean f();
    public abstract boolean g();
    public VideoSDKPlayerView getPlayer(){
       Object obj = PatchProxy.apply(null, this, KtvBaseTimeLineView.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.j();
    }
    public EditorSdk2V2$VideoEditorProject getProject(){
       Object obj = PatchProxy.apply(null, this, KtvBaseTimeLineView.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.e();
    }
    public int getSelectRangeWidth(){
       return (int)(((this.v - this.u) + this.q) + this.r);
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, KtvBaseTimeLineView.class, "10")) {
          return;
       }
       this.e.setText(this.d(((this.v - this.u) / this.i)));
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(KtvBaseTimeLineView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, KtvBaseTimeLineView.class, "4")) {
             return;
          }
       }
       KtvBaseTimeLineView to = this.o;
       KtvBaseTimeLineView tu = this.u;
       float f = to + tu;
       this.d.layout((int)(to + tu), 0, (int)(f + (float)this.getSelectRangeWidth()), this.getHeight());
       KtvBaseTimeLineView tg = this.g;
       to = this.o;
       tu = this.q;
       f = to + tu;
       tg.layout((int)(to + tu), 0, (int)(f + (float)tg.getMeasuredWidth()), this.getHeight());
       return;
    }
    public void onMeasure(int p0,int p1){
       KtvBaseTimeLineView tl;
       float f1;
       if (PatchProxy.isSupport(KtvBaseTimeLineView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, KtvBaseTimeLineView.class, "3")) {
          return;
       }
       super.onMeasure(p0, p1);
       p0 = View$MeasureSpec.getSize(p0);
       if (!p0) {
          return;
       }
       this.o = 0;
       this.p = 0;
       float f = ((float)p0 - this.q) - this.r;
       this.k = f;
       KtvBaseTimeLineView th = this.h;
       KtvBaseTimeLineView ktvBaseTimeL = 0x476a6000;
       if (th - ktvBaseTimeL <= 0) {
          if (this.g()) {
             tl = this.l;
             if (tl > null) {
                th = this.k;
                f = th % (float)tl;
                this.o = f;
                this.k = th - f;
             }
          }
          this.j = this.k;
       }else {
          this.j = (f * th) / ktvBaseTimeL;
          if (this.g()) {
             tl = this.l;
             if (tl > null) {
                ktvBaseTimeL = this.j;
                f1 = (float)tl - (ktvBaseTimeL % (float)tl);
                this.p = f1;
                this.j = ktvBaseTimeL + f1;
             }
          }
       }
       f1 = 1000.00f;
       f = (this.j * f1) / this.h;
       this.i = f;
       if (this.x == null) {
          this.x = true;
          ktvBaseTimeL = this.c;
          float f2 = ((float)ktvBaseTimeL.mCropBegin * f) / f1;
          this.u = f2;
          this.v = ((float)ktvBaseTimeL.mCropEnd * f) / f1;
          this.g.setTranslationX(f2);
       }
       tl = this.i;
       this.w = this.n * tl;
       this.s = (float)this.l / tl;
       f1 = this.getMeasuredHeight();
       this.setMeasuredDimension((int)(((this.j + this.o) + this.q) + this.r), f1);
       this.d.measure(View$MeasureSpec.makeMeasureSpec(this.getSelectRangeWidth(), 0x40000000), View$MeasureSpec.makeMeasureSpec(f1, 0x40000000));
       this.g.measure(View$MeasureSpec.makeMeasureSpec(a1.e(3.00f), 0x40000000), View$MeasureSpec.makeMeasureSpec(a1.e(48.00f), 0x40000000));
       return;
    }
    public void setRangeChangeListener(KtvBaseTimeLineView$b p0){
       this.B = p0;
    }
}
