package com.kwai.library.widget.seekbar.ScoreSeekBar;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Paint;
import ll8.c$b;
import android.content.res.TypedArray;
import android.content.res.Resources;
import cw9.c;
import android.graphics.Paint$Style;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Xfermode;
import android.graphics.Bitmap;
import com.kwai.library.widget.seekbar.ScoreSeekBar$a;
import java.lang.Math;
import android.graphics.Canvas;
import android.graphics.Bitmap$Config;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import android.graphics.Rect;
import java.lang.String;
import android.view.View$MeasureSpec;
import android.view.MotionEvent;

public class ScoreSeekBar extends View	// class@0009f2
{
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public ScoreSeekBar$a q;
    public Paint r;
    public Paint s;
    public Paint t;
    public Paint u;
    public Paint v;
    public Bitmap w;
    public Bitmap x;
    public Canvas y;

    public void ScoreSeekBar(Context p0){
       super(p0, null);
    }
    public void ScoreSeekBar(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void ScoreSeekBar(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.r = new Paint(1);
       this.s = new Paint(1);
       this.t = new Paint(1);
       this.u = new Paint(1);
       this.v = new Paint();
       if (p1 != null) {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.L4);
          this.b = typedArray.getDimensionPixelSize(3, 2);
          this.c = typedArray.getColor(2, -7829368);
          this.d = typedArray.getInt(4, 5);
          this.e = typedArray.getInt(6, 0);
          this.h = typedArray.getBoolean(9, 0);
          this.o = typedArray.getDimensionPixelSize(8, c.b(p0.getResources(), 0x7f071101));
          this.p = typedArray.getColor(7, -1);
          p2 = -256;
          if (this.h != null) {
             this.j = typedArray.getColor(5, p2);
             this.k = typedArray.getColor(1, p2);
          }else {
             this.i = typedArray.getColor(0, p2);
          }
          typedArray.recycle();
       }
       this.r.reset();
       this.r.setAntiAlias(1);
       this.r.setStyle(Paint$Style.FILL);
       this.u.setColor(this.p);
       this.u.setTextSize((float)this.o);
       this.s.setStyle(Paint$Style.FILL_AND_STROKE);
       this.s.setColor(this.c);
       this.t.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.DST_ATOP));
       this.v.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.CLEAR));
       return;
    }
    public final boolean a(Bitmap p0,int p1,int p2){
       boolean b = (p0 != null && (!p0.isRecycled() && (p0.getWidth() != p1 || p0.getHeight() != p2)))? true: false;
       return b;
    }
    public final boolean b(float p0,float p1){
       boolean b = (p0 > 0 && (p0 - (float)this.l <= 0 && (p1 > 0 && p1 - (float)this.n <= 0)))? true: false;
       return b;
    }
    public final int c(float p0){
       return ((int)(p0 / (float)(this.m + this.b)) + 1);
    }
    public final void d(int p0){
       ScoreSeekBar scoreSeekBar;
       if (this.f != p0) {
          ScoreSeekBar td = this.d;
          if (p0 > td) {
             scoreSeekBar = td;
          }else if(p0 < 0){
             p0 = 0;
          }
          this.f = scoreSeekBar;
          this.e(false);
       }
       return;
    }
    public final void e(boolean p0){
       if (p0) {
          this.requestLayout();
       }
       this.invalidate();
       ScoreSeekBar tq = this.q;
       if (tq != null) {
          tq.a(this.f);
       }
       return;
    }
    public int getProgress(){
       return this.f;
    }
    public int getScore(){
       if (this.e == null) {
          return Math.max(0, (this.f - 1));
       }
       return this.f;
    }
    public void onDraw(Canvas p0){
       ScoreSeekBar s;
       ScoreSeekBar m;
       float f1;
       ScoreSeekBar scoreSeekBar = this;
       super.onDraw(p0);
       ScoreSeekBar f = scoreSeekBar.f;
       int i = scoreSeekBar.m * f;
       int i1 = 0;
       i = Math.max(i1, (i + (scoreSeekBar.b * (f - 1))));
       if (scoreSeekBar.a(scoreSeekBar.w, scoreSeekBar.l, scoreSeekBar.n)) {
          s = scoreSeekBar.s;
          scoreSeekBar.w = Bitmap.createBitmap(scoreSeekBar.l, scoreSeekBar.n, Bitmap$Config.ARGB_8888);
          Canvas uCanvas = new Canvas(scoreSeekBar.w);
          for (int i2 = 0; i2 < scoreSeekBar.d; i2 = i2 + 1) {
             m = scoreSeekBar.m;
             int i3 = scoreSeekBar.b + m;
             i3 = i3 * i2;
             int i4 = m + i3;
             f1 = (float)i4;
             uCanvas.drawRect((float)i3, 0, f1, (float)scoreSeekBar.n, s);
          }
       }
       if (scoreSeekBar.a(scoreSeekBar.x, scoreSeekBar.l, scoreSeekBar.n)) {
          scoreSeekBar.x = Bitmap.createBitmap(scoreSeekBar.l, scoreSeekBar.n, Bitmap$Config.ARGB_8888);
          scoreSeekBar.y = new Canvas(scoreSeekBar.x);
       }
       float f2 = (float)i;
       scoreSeekBar.y.drawPaint(scoreSeekBar.v);
       scoreSeekBar.y.save();
       float f3 = (float)scoreSeekBar.n;
       if (scoreSeekBar.h != null) {
          LinearGradient linearGradie = new LinearGradient(0, 0, (float)scoreSeekBar.l, 0, scoreSeekBar.j, scoreSeekBar.k, Shader$TileMode.CLAMP);
          scoreSeekBar.r.setShader(s);
       }else {
          scoreSeekBar.r.setColor(scoreSeekBar.i);
       }
       scoreSeekBar.y.clipRect(0, 0, f2, f3);
       scoreSeekBar.y.drawRect(0, 0, f2, f3, scoreSeekBar.r);
       scoreSeekBar.y.restore();
       ScoreSeekBar y = scoreSeekBar.y;
       m = scoreSeekBar.u;
       Rect rect = new Rect();
       for (int i5 = 0; i5 < scoreSeekBar.d; i5 = i5 + 1) {
          ScoreSeekBar m1 = scoreSeekBar.m;
          int i6 = scoreSeekBar.b + m1;
          i6 = i6 * i5;
          f3 = (float)i6;
          int i7 = m1 + i6;
          i6 = scoreSeekBar.e + i5;
          String str = String.valueOf(i6);
          m.getTextBounds(str, i1, str.length(), rect);
          f1 = (float)i7 - f3;
          f1 = f1 - m.measureText(str);
          f1 = f1 / 2.00f;
          f1 = f1 + f3;
          int i8 = scoreSeekBar.n + rect.height();
          f3 = (float)i8 / 2.00f;
          y.drawText(str, f1, f3, m);
       }
       scoreSeekBar.y.drawBitmap(scoreSeekBar.w, 0, 0, scoreSeekBar.t);
       p0.drawBitmap(scoreSeekBar.x, 0, 0, null);
       return;
    }
    public void onMeasure(int p0,int p1){
       super.onMeasure(p0, p1);
       ScoreSeekBar td = this.d;
       this.m = (int)(((float)(View$MeasureSpec.getSize(p0) - (this.b * (td - 1))) * 0x3f800000) / (float)td);
       this.n = View$MeasureSpec.getSize(p1);
       ScoreSeekBar td1 = this.d;
       p0 = this.m * td1;
       td1--;
       this.l = p0 + (this.b * td1);
    }
    public boolean onTouchEvent(MotionEvent p0){
       float x;
       int action = p0.getAction();
       boolean b = true;
       if (action) {
          if (action != b) {
             if (action == 0.00f) {
                x = p0.getX();
                if (this.b(x, p0.getY())) {
                   action = this.c(x);
                   this.g = action;
                   this.d(action);
                }
             }
          }else {
             this.d(this.g);
          }
       }else {
          x = p0.getX();
          if (this.b(x, p0.getY())) {
             this.g = this.c(x);
             return b;
          }
       }
       return super.onTouchEvent(p0);
    }
}
