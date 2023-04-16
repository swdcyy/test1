package com.kuaishou.merchant.basic.widget.MerchantProgressBar;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import ll8.c$b;
import android.content.res.TypedArray;
import lnc.a1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import xm4.a;
import android.widget.TextView;
import android.widget.ViewFlipper;
import com.kuaishou.merchant.basic.widget.MerchantProgressBar$a;
import android.graphics.Paint;
import android.text.TextPaint;
import android.graphics.RectF;
import java.lang.CharSequence;
import java.lang.Integer;
import java.lang.Math;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.Xfermode;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import android.widget.FrameLayout$LayoutParams;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;
import java.lang.Float;
import android.text.TextUtils$TruncateAt;

public class MerchantProgressBar extends FrameLayout	// class@0015f8
{
    public int A;
    public int B;
    public Bitmap C;
    public boolean D;
    public TextView b;
    public TextView c;
    public Paint d;
    public TextPaint e;
    public Bitmap f;
    public RectF g;
    public RectF h;
    public LinearGradient i;
    public ViewFlipper j;
    public MerchantProgressBar$a k;
    public List l;
    public float m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean t;
    public boolean u;
    public boolean v;
    public int w;
    public int x;
    public String y;
    public Drawable z;

    public void MerchantProgressBar(Context p0){
       super(p0, null);
    }
    public void MerchantProgressBar(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void MerchantProgressBar(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.l = new ArrayList();
       this.m = 11.00f;
       this.n = 0;
       this.x = 1;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.s3);
       this.s = typedArray.getDimensionPixelOffset(5, a1.d(0x7f07042c));
       this.o = typedArray.getColor(6, a1.a(0x7f061b96));
       this.p = typedArray.getColor(4, a1.a(0x7f061b96));
       this.q = typedArray.getColor(0, a1.a(0x7f061bcd));
       this.r = typedArray.getColor(1, a1.a(0x7f061dae));
       this.t = typedArray.getBoolean(2, 0);
       this.u = typedArray.getBoolean(3, 0);
       typedArray.recycle();
       if (PatchProxy.applyVoid(null, this, MerchantProgressBar.class, "6")) {
       }else {
          a.b(this.getContext(), R.layout.arg_RES_7f0d1688, this);
          this.b = this.findViewById(0x7f0a3deb);
          this.j = this.findViewById(0x7f0a443b);
          this.c = this.findViewById(0x7f0a3e15);
          this.k = new MerchantProgressBar$a(this.j);
          this.b.setTextColor(this.r);
          this.d = new Paint();
          this.e = new TextPaint();
          this.g = new RectF();
          this.h = new RectF();
          this.setClipToPadding(0);
       }
       return;
    }
    public final boolean a(){
       boolean b = (this.w >= this.x)? true: false;
       return b;
    }
    public void b(int p0,int p1,CharSequence p2){
       if (PatchProxy.isSupport(MerchantProgressBar.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, MerchantProgressBar.class, "1")) {
          return;
       }
       int i = 0;
       this.x = Math.max(i, p1);
       this.w = Math.max(i, p0);
       this.j.setVisibility(8);
       this.j.stopFlipping();
       this.setupTextSize(this.b);
       if (this.v != null) {
          this.b.setVisibility(4);
          this.y = p2;
          this.f = null;
          this.e = new TextPaint();
          this.g = new RectF();
          this.h = new RectF();
       }else {
          this.b.setVisibility(i);
          this.b.setText(p2);
       }
       if (this.getWidth()) {
          LinearGradient linearGradie = new LinearGradient(0, 0, (float)this.getSrcWidth(), 0, this.o, this.p, Shader$TileMode.CLAMP);
          this.i = this.getWidth();
       }
       this.invalidate();
       return;
    }
    public void c(int p0,int p1,List p2){
       if (PatchProxy.isSupport(MerchantProgressBar.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, MerchantProgressBar.class, "3")) {
          return;
       }
       if (p2 == null) {
          return;
       }
       if (p2.size() == 1) {
          this.b(p0, p1, p2.get(0));
          return;
       }else {
          this.x = Math.max(0, p1);
          this.w = Math.max(0, p0);
          this.b.setVisibility(4);
          this.y = "";
          this.j.setVisibility(0);
          this.setFlipper(p2);
          this.invalidate();
          return;
       }
    }
    public final int getSrcWidth(){
       Object obj = PatchProxy.apply(null, this, MerchantProgressBar.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.D == null || this.a()) {
          return this.getSrcWidthWithoutIcon();
       }
       return this.getSrcWidthWithIcon();
    }
    public final int getSrcWidthWithIcon(){
       Object obj = PatchProxy.apply(null, this, MerchantProgressBar.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.A / 2;
       int i1 = a1.e(26.00f) + i;
       int i2 = this.getWidth() - i;
       i = (this.x == null)? this.getWidth(): (int)((float)this.getWidth() * (((float)this.w * 0x3f800000) / (float)this.x));
       if (i < i1) {
          return i1;
       }else {
          return Math.min(i, i2);
       }
    }
    public final int getSrcWidthWithoutIcon(){
       Object obj = PatchProxy.apply(null, this, MerchantProgressBar.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int width = (this.x == null)? this.getWidth(): (this.getWidth() * this.w) / this.x;
       return width;
    }
    public void onDraw(Canvas p0){
       LinearGradient linearGradie = this;
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, linearGradie, MerchantProgressBar.class, "7")) {
          return;
       }
       super.onDraw(p0);
       if (this.getWidth() > 0 && this.getHeight() > 0) {
          int i = p0.saveLayer(0, 0, (float)this.getWidth(), (float)this.getHeight(), null);
          linearGradie.d.setColor(linearGradie.q);
          Shader shader = null;
          linearGradie.d.setShader(shader);
          int i1 = this.getHeight() - linearGradie.b.getHeight();
          int i2 = (int)((float)i1 * 0x3f400000);
          float f = (float)i2;
          float f1 = (float)(this.getHeight() - (i1 - i2));
          linearGradie.g.set(0, f, (float)this.getWidth(), f1);
          MerchantProgressBar s = linearGradie.s;
          float f2 = (float)s;
          obj.drawRoundRect(linearGradie.g, f2, (float)s, linearGradie.d);
          i1 = this.getSrcWidth();
          float f3 = (float)i1;
          linearGradie.h.set(0, f, f3, f1);
          if (linearGradie.i == null) {
             LinearGradient linearGradie1 = new LinearGradient(0, 0, f3, 0, linearGradie.o, linearGradie.p, Shader$TileMode.CLAMP);
             linearGradie.i = f;
          }
          linearGradie.d.setShader(linearGradie.i);
          if (linearGradie.t != null) {
             MerchantProgressBar s1 = linearGradie.s;
             float f4 = (float)s1;
             obj.drawRoundRect(linearGradie.h, f4, (float)s1, linearGradie.d);
          }else {
             obj.drawRect(linearGradie.h, linearGradie.d);
          }
          linearGradie.d.setXfermode(shader);
          int i3 = 0;
          if (linearGradie.z != null && (!PatchProxy.isSupport(MerchantProgressBar.class) || (PatchProxy.applyVoidTwoRefs(obj, Integer.valueOf(i1), linearGradie, MerchantProgressBar.class, "11") || (linearGradie.A == null || (linearGradie.B != null && !this.a()))))) {
             MerchantProgressBar a = linearGradie.A;
             int i6 = i1 - (a / 2);
             if (linearGradie.C == null) {
                linearGradie.C = Bitmap.createBitmap(a, linearGradie.B, Bitmap$Config.ARGB_8888);
             }
             linearGradie.z.setBounds(i3, i3, linearGradie.A, linearGradie.B);
             linearGradie.z.draw(new Canvas(linearGradie.C));
             obj.drawBitmap(linearGradie.C, (float)i6, 0, shader);
          }
       label_010b :
          if (linearGradie.v == null || (!TextUtils.isEmpty(linearGradie.y) && (!PatchProxy.isSupport(MerchantProgressBar.class) || !PatchProxy.applyVoidTwoRefs(obj, Integer.valueOf(i1), linearGradie, MerchantProgressBar.class, "12")))) {
             if (linearGradie.f == null) {
                linearGradie.f = Bitmap.createBitmap(this.getWidth(), this.getHeight(), Bitmap$Config.ARGB_8888);
                Canvas uCanvas = new Canvas(linearGradie.f);
                float f5 = (linearGradie.h.centerY() + (Math.abs((linearGradie.e.ascent() + linearGradie.e.descent())) / 2.00f)) + 7.00f;
                boolean b = true;
                linearGradie.e.setAntiAlias(b);
                linearGradie.e.setColor(a1.a(R.color.arg_RES_7f061de2));
                linearGradie.e.setTextSize((float)a1.e(linearGradie.m));
                MerchantProgressBar y = linearGradie.y;
                if (PatchProxy.isSupport(MerchantProgressBar.class)) {
                   Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(i1), linearGradie, MerchantProgressBar.class, "13");
                   if (obj1 != PatchProxyResult.class) {
                      i3 = obj1.intValue();
                   }else {
                   label_01a9 :
                      int i4 = a1.e(4.00f);
                      int i5 = (int)linearGradie.e.measureText(linearGradie.y);
                      if (!this.a()) {
                         i3 = linearGradie.A;
                      }
                      if (linearGradie.n == b) {
                         if (linearGradie.w >= linearGradie.x) {
                            i3 = (this.getWidth() - i5) / 2;
                         }else {
                            i3 = ((i1 - i5) - (i3 / 2)) - a1.e(0x3f800000);
                         }
                      }else {
                         i3 = i4;
                      }
                   }
                }else {
                   goto label_01a9 ;
                }
                uCanvas.drawText(y, (float)i3, f5, linearGradie.e);
                linearGradie.e.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.SRC_IN));
                linearGradie.e.setColor(linearGradie.r);
                uCanvas.drawRoundRect(linearGradie.h, (float)linearGradie.s, (float)linearGradie.s, linearGradie.e);
             }
             obj.drawBitmap(linearGradie.f, 0, 0, shader);
             linearGradie.e.setXfermode(shader);
             linearGradie.e.setColor(a1.a(R.color.arg_RES_7f061de2));
             if (((float)this.getWidth() - linearGradie.e.measureText(linearGradie.y)) - (float)linearGradie.c.getMeasuredWidth() < 0) {
                linearGradie.c.setVisibility(8);
             }
          }
       label_0236 :
          if ((this.getWidth() - i1) < linearGradie.c.getMeasuredWidth()) {
             linearGradie.c.setVisibility(8);
          }
          obj.restoreToCount(i);
       }
       return;
    }
    public void setBgColor(int p0){
       this.q = p0;
    }
    public void setCurrentProgressEndIsRounded(boolean p0){
       this.t = p0;
    }
    public void setEnableAdapterLargeFonts(boolean p0){
       this.u = p0;
    }
    public void setEnableNewStyle(boolean p0){
       this.v = p0;
    }
    public void setEndColor(int p0){
       this.p = p0;
    }
    public final void setFlipper(List p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantProgressBar.class, "5")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (this.l.equals(p0)) {
          return;
       }
       this.l = new ArrayList(p0);
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          CharSequence uCharSequenc = iterator.next();
          TextView textView = PatchProxy.applyOneRefs(uCharSequenc, this, MerchantProgressBar.class, "14");
          if (textView != patchProxyRe) {
          }else {
             textView = new TextView(this.getContext());
             this.setupTextSize(textView);
             textView.setText(uCharSequenc);
             textView.setTextColor(this.r);
          }
          uArrayList.add(textView);
       }
       MerchantProgressBar tk = this.k;
       Objects.requireNonNull(tk);
       if (!PatchProxy.applyVoidOneRefs(uArrayList, tk, MerchantProgressBar$a.class, "1")) {
          tk.a.removeAllViews();
          Iterator iterator1 = uArrayList.iterator();
          while (iterator1.hasNext()) {
             View view = iterator1.next();
             MerchantProgressBar$a a = tk.a;
             FrameLayout$LayoutParams layoutParams = PatchProxy.apply(null, tk, MerchantProgressBar$a.class, "2");
             if (layoutParams != patchProxyRe) {
             }else {
                layoutParams = new FrameLayout$LayoutParams(-2, n.c(tk.a.getContext(), -2.00f));
                layoutParams.gravity = 0x800013;
             }
             a.addView(view, -1, layoutParams);
          }
          if (tk.a.getChildCount() >= 2) {
             tk.a.startFlipping();
          }else {
             tk.a.stopFlipping();
          }
       }
       return;
    }
    public void setIconDrawable(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantProgressBar.class, "19")) {
          return;
       }
       this.z = p0;
       this.invalidate();
       return;
    }
    public void setPaddingVertical(float p0){
       if (PatchProxy.isSupport(MerchantProgressBar.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, MerchantProgressBar.class, "17")) {
          return;
       }
       this.b.setPadding(0, a1.e(p0), 0, a1.e(p0));
       return;
    }
    public void setProgressTextStyle(int p0){
       if (PatchProxy.isSupport(MerchantProgressBar.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, MerchantProgressBar.class, "18")) {
          return;
       }
       this.n = p0;
       this.invalidate();
       return;
    }
    public void setRadius(int p0){
       this.s = p0;
    }
    public void setStartColor(int p0){
       this.o = p0;
    }
    public void setTextColor(int p0){
       this.r = p0;
    }
    public void setTextSizeDpSp(float p0){
       if (PatchProxy.isSupport(MerchantProgressBar.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, MerchantProgressBar.class, "15")) {
          return;
       }
       this.m = p0;
       this.setupTextSize(this.b);
       this.setupTextSize(this.c);
       this.invalidate();
       return;
    }
    public final void setupTextSize(TextView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantProgressBar.class, "16")) {
          return;
       }
       if (this.u != null) {
          p0.setTextSize(1, this.m);
          p0.setSingleLine();
          p0.setEllipsize(TextUtils$TruncateAt.END);
       }else {
          p0.setTextSize(0, (float)a1.e(this.m));
       }
       return;
    }
}
