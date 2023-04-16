package com.kwai.library.widget.button.SlipSwitchButton;
import android.view.View;
import lnc.a1;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.Bitmap$Config;
import ll8.c$b;
import android.content.res.TypedArray;
import com.kwai.library.widget.button.a;
import com.kwai.library.widget.button.a$a;
import j17.a;
import android.widget.Scroller;
import com.kwai.library.widget.button.SlipSwitchButton$d;
import com.kwai.library.widget.button.SlipSwitchButton$c;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import com.kwai.library.widget.button.SlipSwitchButton$a;
import android.graphics.BitmapFactory;
import java.lang.Math;
import android.graphics.Color;
import android.graphics.Paint$Style;
import android.view.MotionEvent;
import a2.q;

public class SlipSwitchButton extends View	// class@00090d
{
    public SlipSwitchButton$c A;
    public boolean B;
    public int C;
    public int D;
    public int E;
    public int F;
    public final RectF G;
    public Bitmap b;
    public Bitmap c;
    public Bitmap d;
    public int e;
    public int f;
    public int g;
    public float h;
    public float i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public SlipSwitchButton$d n;
    public Paint o;
    public Paint p;
    public Paint q;
    public final Rect r;
    public final Paint s;
    public final Paint t;
    public final Paint u;
    public Scroller v;
    public boolean w;
    public boolean x;
    public SlipSwitchButton$b y;
    public SlipSwitchButton$a z;
    public static final float H;
    public static final float I;

    static {
       SlipSwitchButton.H = (float)a1.e(0x3f19999a);
       SlipSwitchButton.I = (float)a1.e(0x3f800000);
    }
    public void SlipSwitchButton(Context p0){
       super(p0);
       this.l = true;
       this.o = new Paint();
       this.p = new Paint();
       this.q = new Paint();
       this.r = new Rect();
       this.s = new Paint();
       this.t = new Paint();
       this.u = new Paint();
       this.G = new RectF();
       this.c(p0, null);
    }
    public void SlipSwitchButton(Context p0,AttributeSet p1){
       super(p0, p1);
       this.l = true;
       this.o = new Paint();
       this.p = new Paint();
       this.q = new Paint();
       this.r = new Rect();
       this.s = new Paint();
       this.t = new Paint();
       this.u = new Paint();
       this.G = new RectF();
       this.c(p0, p1);
    }
    public void SlipSwitchButton(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.l = true;
       this.o = new Paint();
       this.p = new Paint();
       this.q = new Paint();
       this.r = new Rect();
       this.s = new Paint();
       this.t = new Paint();
       this.u = new Paint();
       this.G = new RectF();
       this.c(p0, p1);
    }
    public final void a(Canvas p0,float p1,float p2,float p3,float p4,float p5,Paint p6){
       p0.drawRoundRect(p1, p2, p3, p4, p5, p5, p6);
    }
    public final Bitmap b(int p0,int p1,int p2){
       Drawable drawable = this.getContext().getResources().getDrawable(p2);
       if (drawable == null) {
          return null;
       }
       drawable.setBounds(0, 0, this.getWidth(), this.getHeight());
       Bitmap uBitmap = Bitmap.createBitmap(p0, p1, Bitmap$Config.ARGB_8888);
       drawable.draw(new Canvas(uBitmap));
       return uBitmap;
    }
    public final void c(Context p0,AttributeSet p1){
       if (p0 != null && p1 != null) {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.k5);
          this.h(typedArray.getResourceId(2, -1), typedArray.getResourceId(0, -1), typedArray.getResourceId(4, -1));
          a$a g = a.g;
          this.k = typedArray.getBoolean(5, g.a().b);
          this.C = typedArray.getColor(3, a.a(p0, g.a().c));
          this.D = typedArray.getColor(1, a.a(p0, g.a().d));
          this.E = typedArray.getColor(6, a.a(p0, g.a().e));
          typedArray.recycle();
       }
       this.v = new Scroller(p0);
       this.q.setColor(-1);
       this.B = false;
       this.F = a.a(this.getContext(), 0x7f062106);
       this.s.setColor(this.C);
       this.s.setAntiAlias(1);
       this.t.setColor(this.D);
       this.t.setAntiAlias(1);
       this.u.setColor(this.E);
       this.u.setAntiAlias(1);
       return;
    }
    public void computeScroll(){
       super.computeScroll();
       if (this.j != null) {
          SlipSwitchButton tn = this.n;
          if (tn != null) {
             this.n = null;
             this.v.startScroll(tn.a, 0, tn.b, 0, tn.c);
          }
          if (this.v.computeScrollOffset()) {
             this.setCurrentX((float)this.v.getCurrX());
             this.invalidate();
          }else if(this.v.isFinished() && this.B != null){
             this.B = false;
             tn = this.A;
             if (tn != null) {
                tn.a(this, this.k);
             }
          }
       }
    label_0049 :
       return;
    }
    public boolean d(){
       return this.x;
    }
    public boolean e(){
       boolean b = true;
       if (b == this.getLayoutDirection()) {
       }else {
          b = false;
       }
       return b;
    }
    public final void f(boolean p0){
       SlipSwitchButton ty = this.y;
       if (ty != null) {
          ty.a(this, this.k);
       }
       ty = this.z;
       if (ty != null) {
          ty.r(this, this.k, p0);
       }
       return;
    }
    public void g(boolean p0,boolean p1,boolean p2){
       if (this.k ^ p0) {
          this.k = p0;
          if (this.getWidth() > 0 || this.getHeight() > 0) {
             if (this.j != null) {
                this.i(false, p1);
             }else {
                this.j = true;
                this.i(true, p1);
             }
             this.invalidate();
          }
          if (p2) {
             this.f(false);
          }
       }else if(p2 && this.l != null){
          this.f(false);
       }
       if (p2) {
          this.l = false;
       }
       return;
    }
    public SlipSwitchButton$b getOnSwitchChangeListener(){
       return this.y;
    }
    public SlipSwitchButton$a getOnSwitchChangeListener2(){
       return this.z;
    }
    public final int getSlipWidth(){
       SlipSwitchButton tb = this.b;
       if (tb != null) {
          return tb.getWidth();
       }
       return this.getHeight();
    }
    public boolean getSwitch(){
       return this.k;
    }
    public void h(int p0,int p1,int p2){
       if (this.e != p2) {
          SlipSwitchButton tb = this.b;
          if (tb != null) {
             tb.recycle();
          }
          if (p2 > 0) {
             this.b = BitmapFactory.decodeResource(this.getResources(), p2);
          }
       }
       int width = this.getWidth();
       int height = this.getHeight();
       int i = 1;
       SlipSwitchButton slipSwitchBu = null;
       if (width > 0 && height > 0) {
          if (this.f != p0) {
             slipSwitchBu = this.c;
             if (slipSwitchBu != null) {
                slipSwitchBu.recycle();
             }
             if (p0 > 0) {
                this.c = this.b(width, height, p0);
             }
             slipSwitchBu = 1;
          }
          if (this.g != p1) {
             slipSwitchBu = this.d;
             if (slipSwitchBu != null) {
                slipSwitchBu.recycle();
             }
             if (p1 > 0) {
                this.d = this.b(width, height, p1);
             }
          }else {
             i = slipSwitchBu;
          }
       }else {
          i = null;
       }
       this.e = p2;
       this.f = p0;
       this.g = p1;
       if (i != null) {
          this.invalidate();
       }
       return;
    }
    public final void i(boolean p0,boolean p1){
       SlipSwitchButton tk;
       int i;
       int i1;
       float f;
       SlipSwitchButton th;
       int width = this.getWidth();
       int slipWidth = this.getSlipWidth();
       if (p0) {
          if (this.e()) {
             tk = this.k;
             i = slipWidth / 2;
             if (tk != null) {
                i = width - i;
             }
             if (tk != null) {
                width = slipWidth - width;
             }
          }else {
             tk = this.k;
             i = slipWidth / 2;
             if (tk == null) {
                i = width - i;
             }
             if (tk == null) {
                width = slipWidth - width;
             }
          }
          width = width - slipWidth;
       }else {
          i = (int)this.h;
          if (this.e()) {
             if (this.k != null) {
                f = (float)(slipWidth / 2);
                th = this.h;
             }else {
                f = (float)(this.getWidth() - (slipWidth / 2));
                th = this.h;
             }
          }else if(this.k != null){
             i1 = this.getWidth() - (slipWidth / 2);
          }else {
             i1 = slipWidth / 2;
          }
          f = (float)i1;
          th = this.h;
          width = (int)(f - th);
       }
       i1 = (Math.abs(width) * 600) / (this.getWidth() - slipWidth);
       this.v.forceFinished(true);
       SlipSwitchButton$d uod = new SlipSwitchButton$d();
       uod.a = i;
       uod.b = width;
       if (!p1) {
          i1 = 0;
       }
       uod.c = i1;
       this.n = uod;
       return;
    }
    public void onDraw(Canvas p0){
       float f2;
       float f3;
       SlipSwitchButton b;
       float f4;
       float f8;
       SlipSwitchButton slipSwitchBu = this;
       Canvas uCanvas = p0;
       float f = 2.00f;
       float f1 = 0;
       if (slipSwitchBu.c != null && (slipSwitchBu.d != null && slipSwitchBu.b != null)) {
          int width = this.getWidth();
          int height = this.getHeight();
          int slipWidth = this.getSlipWidth();
          if (slipSwitchBu.j != null) {
             f2 = slipSwitchBu.h - ((float)slipWidth / f);
          }else if(slipSwitchBu.k != null && this.e()){
             slipSwitchBu.h = (float)slipWidth / f;
          }else if(slipSwitchBu.k == null && this.e()){
             f2 = (float)(width - slipWidth);
             slipSwitchBu.h = (float)width - ((float)slipWidth / f);
          }else if(slipSwitchBu.k != null){
             f2 = (float)(width - slipWidth);
             slipSwitchBu.h = (float)width - ((float)slipWidth / f);
          }else {
             slipSwitchBu.h = (float)slipWidth / f;
          }
          f2 = 0;
          if (f2 - f1 < 0) {
             f2 = 0;
          }else {
             f4 = (float)(width - slipWidth);
             if (f2 - f4 > 0) {
                f2 = f4;
             }
          }
          SlipSwitchButton d = slipSwitchBu.d;
          if (d != null) {
             uCanvas.drawBitmap(d, f1, f1, slipSwitchBu.o);
          }else {
             uCanvas.drawColor(-3289651);
          }
          f3 = f2 / (float)(width - slipWidth);
          if (this.e()) {
             f3 = 0x3f800000 - f3;
          }
          width = (int)(f3 * 0x437f0000);
          slipSwitchBu.p.setAlpha(width);
          d = slipSwitchBu.c;
          if (d != null) {
             uCanvas.drawBitmap(d, f1, f1, slipSwitchBu.p);
          }else {
             uCanvas.drawARGB(width, Color.red(-415887), Color.green(-415887), Color.blue(-415887));
          }
          b = slipSwitchBu.b;
          if (b != null) {
             uCanvas.drawBitmap(b, f2, ((float)(height - b.getHeight()) / f), null);
          }else {
             int i = (int)f2;
             slipSwitchBu.r.set(i, 0, (slipWidth + i), height);
             uCanvas.drawRect(slipSwitchBu.r, slipSwitchBu.q);
          }
       }else {
          float f5 = (float)this.getWidth();
          float f6 = (float)this.getHeight();
          float f7 = (float)this.getSlipWidth();
          if (slipSwitchBu.j != null) {
             f3 = slipSwitchBu.h - (f7 / f);
          }else if(slipSwitchBu.k != null && this.e()){
             slipSwitchBu.h = f7 / f;
          }else if(slipSwitchBu.k == null && this.e()){
             f3 = f5 - f7;
             slipSwitchBu.h = f5 - (f7 / f);
          }else if(slipSwitchBu.k != null){
             f3 = f5 - f7;
             slipSwitchBu.h = f5 - (f7 / f);
          }else {
             slipSwitchBu.h = f7 / f;
          }
          b = 0;
          if (f3 - f1 < 0) {
             f8 = 0;
          }else {
             f1 = f5 - f7;
             f8 = (f3 - f1 > 0)? f1: f3;
          }
          float f9 = f6 / f;
          f4 = f9;
          float f10 = f9;
          this.a(p0, 0, 0, f5, f6, f4, slipSwitchBu.t);
          f3 = f8 / (f5 - f7);
          if (this.e()) {
             f3 = 0x3f800000 - f3;
          }
          slipSwitchBu.s.setAlpha((int)(f3 * 0x437f0000));
          this.a(p0, 0, 0, f5, f6, f10, slipSwitchBu.s);
          f6 = f10;
          f9 = f6 - SlipSwitchButton.I;
          f3 = SlipSwitchButton.H;
          f = f9 + f3;
          slipSwitchBu.u.setStyle(Paint$Style.STROKE);
          slipSwitchBu.u.setStrokeWidth(f3);
          slipSwitchBu.u.setColor(slipSwitchBu.F);
          f8 = f8 + f6;
          uCanvas.drawCircle(f8, f6, f, slipSwitchBu.u);
          slipSwitchBu.u.setColor(slipSwitchBu.E);
          slipSwitchBu.u.setStyle(Paint$Style.FILL);
          uCanvas.drawCircle(f8, f6, f9, slipSwitchBu.u);
       }
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       SlipSwitchButton tc;
       super.onSizeChanged(p0, p1, p2, p3);
       if (p0 > 0 && p1 > 0) {
          if (this.f > null) {
             tc = this.c;
             if (tc != null) {
                tc.recycle();
             }
             this.c = this.b(p0, p1, this.f);
          }
          if (this.g > null) {
             tc = this.d;
             if (tc != null) {
                tc.recycle();
             }
             this.d = this.b(p0, p1, this.g);
          }
       }
    label_002e :
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       SlipSwitchButton tk;
       if (!this.isEnabled()) {
          return true;
       }
       if (this.w != null) {
          return super.onTouchEvent(p0);
       }
       boolean i = q.c(p0);
       boolean b = false;
       if (i) {
          if (i != 1) {
             if (i != 2) {
                if (i == 3) {
                }
             }else {
                this.setCurrentX(((this.h + p0.getX()) - this.i));
                this.i = p0.getX();
             }
          }else {
          }
       }else {
          this.m = b;
          this.i = p0.getX();
          this.j = true;
          this.B = b;
          this.v.forceFinished(true);
          this.n = null;
       }
    label_009b :
       this.invalidate();
       return true;
    }
    public final void setCurrentX(float p0){
       SlipSwitchButton tk;
       this.h = p0;
       int i = 0;
       float f = 2.00f;
       if (this.e()) {
          tk = this.k;
          if (this.h - ((float)this.getWidth() / f) < 0) {
             i = 1;
          }
          if (tk ^ i) {
             this.m = true;
          }
       }else {
          tk = this.k;
          if (this.h - ((float)this.getWidth() / f) > 0) {
             i = 1;
          }
          if (tk ^ i) {
             this.m = true;
          }
       }
       return;
    }
    public void setEnabledClick(boolean p0){
       this.setEnabled(p0);
       float f = (p0)? 0x3f800000: 0x3f000000;
       this.setAlpha(f);
       return;
    }
    public void setOnSwitchChangeListener(SlipSwitchButton$b p0){
       this.y = p0;
    }
    public void setOnSwitchChangeListener2(SlipSwitchButton$a p0){
       this.z = p0;
    }
    public void setOnSwitchSlipFinishListener(SlipSwitchButton$c p0){
       this.A = p0;
    }
    public void setOnlyResponseClick(boolean p0){
       this.w = p0;
    }
    public void setSwitch(boolean p0){
       this.g(p0, true, true);
    }
}
