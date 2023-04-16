package com.yxcorp.gifshow.widget.record.RoundProgressView;
import ozc.l;
import android.view.View;
import android.content.Context;
import java.util.LinkedList;
import lnc.b0;
import android.content.res.Resources;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Integer;
import ozc.k;
import android.util.DisplayMetrics;
import cw9.c;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.Paint$Cap;
import android.graphics.RectF;
import pi9.p;
import android.graphics.Canvas;
import com.yxcorp.gifshow.widget.record.RoundProgressView$a;
import lnc.b0$b;
import com.yxcorp.gifshow.widget.record.RoundProgressView$b;
import java.security.InvalidParameterException;
import o56.c;
import o56.a;
import java.lang.Float;
import lnc.a1;

public class RoundProgressView extends View implements l	// class@0019c1
{
    public Paint b;
    public Paint c;
    public Paint d;
    public Paint e;
    public Paint f;
    public RectF g;
    public float h;
    public int i;
    public int j;
    public float k;
    public boolean l;
    public boolean m;
    public LinkedList n;
    public int o;
    public b0 p;
    public int q;
    public b0 r;
    public int s;
    public int t;

    public void RoundProgressView(Context p0){
       super(p0);
       this.h = 4.00f;
       this.j = 100;
       this.k = 0x3f800000;
       this.n = new LinkedList();
       this.o = 255;
       this.p = new b0();
       this.q = 255;
       this.r = new b0();
       this.s = this.getResources().getColor(0x7f061ce4);
       this.t = 0;
       this.n(p0);
    }
    public void RoundProgressView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.h = 4.00f;
       this.j = 100;
       this.k = 0x3f800000;
       this.n = new LinkedList();
       this.o = 255;
       this.p = new b0();
       this.q = 255;
       this.r = new b0();
       this.s = this.getResources().getColor(0x7f061ce4);
       this.t = 0;
       this.n(p0);
    }
    public void RoundProgressView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.h = 4.00f;
       this.j = 100;
       this.k = 0x3f800000;
       this.n = new LinkedList();
       this.o = 255;
       this.p = new b0();
       this.q = 255;
       this.r = new b0();
       this.s = this.getResources().getColor(0x7f061ce4);
       this.t = 0;
       this.n(p0);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, RoundProgressView.class, "16")) {
          return;
       }
       if (this.l == null) {
          this.l = true;
          this.r.c();
          this.invalidate();
       }
       return;
    }
    public boolean b(){
       return this.m;
    }
    public boolean c(){
       return this.l;
    }
    public boolean d(){
       RoundProgressView obj = PatchProxy.apply(null, this, RoundProgressView.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.i;
       boolean b = false;
       int i = (this.n.isEmpty())? 0: this.n.getLast().intValue();
       if (obj > i) {
          b = true;
       }
       return b;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, RoundProgressView.class, "12")) {
          return;
       }
       this.n.add(Integer.valueOf(this.i));
       return;
    }
    public boolean f(){
       return k.a(this);
    }
    public boolean g(){
       Object obj = PatchProxy.apply(null, this, RoundProgressView.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.n.isEmpty() ^ 0x01);
    }
    public int getProgress(){
       return this.i;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, RoundProgressView.class, "15")) {
          return;
       }
       this.n.clear();
       this.i = 0;
       this.invalidate();
       return;
    }
    public void i(){
       k.b(this);
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, RoundProgressView.class, "20")) {
          return;
       }
       this.p.d();
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, RoundProgressView.class, "14")) {
          return;
       }
       try{
          this.n.removeLast();
       }catch(java.util.NoSuchElementException e0){
       }
       int i = (this.n.isEmpty())? 0: this.n.getLast().intValue();
       this.i = i;
       this.invalidate();
       return;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, RoundProgressView.class, "19")) {
          return;
       }
       this.setHeadBlinkEnable(true);
       return;
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, RoundProgressView.class, "17")) {
          return;
       }
       if (this.l != null) {
          this.l = false;
          this.r.d();
          this.invalidate();
       }
       return;
    }
    public void n(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RoundProgressView.class, "1")) {
          return;
       }
       this.setWillNotDraw(false);
       this.h = c.c(this.getResources()).density * 4.00f;
       Paint paint = new Paint();
       this.b = paint;
       paint.setColor(this.s);
       this.b.setStrokeWidth(this.h);
       this.b.setStyle(Paint$Style.STROKE);
       this.b.setAntiAlias(true);
       this.b.setStrokeCap(Paint$Cap.ROUND);
       paint = new Paint();
       this.c = paint;
       paint.setColor(this.getResources().getColor(R.color.arg_RES_7f061cf9));
       this.c.setStrokeWidth(this.h);
       this.c.setStyle(Paint$Style.STROKE);
       this.c.setAntiAlias(true);
       paint = new Paint();
       this.e = paint;
       paint.setColor(this.getResources().getColor(R.color.arg_RES_7f061ce4));
       this.e.setStrokeWidth(this.h);
       this.e.setStyle(Paint$Style.STROKE);
       this.e.setAntiAlias(true);
       paint = new Paint();
       this.f = paint;
       paint.setColor(-1);
       this.f.setStrokeWidth(this.h);
       this.f.setStyle(Paint$Style.STROKE);
       this.f.setAntiAlias(true);
       paint = new Paint();
       this.d = paint;
       paint.setColor(this.t);
       this.d.setStrokeWidth(this.h);
       this.d.setStyle(Paint$Style.STROKE);
       this.d.setAntiAlias(true);
       this.g = new RectF();
       return;
    }
    public final void o(){
       float f1;
       if (PatchProxy.applyVoid(null, this, RoundProgressView.class, "5")) {
          return;
       }
       float f = 0x3f800000;
       int i = 0;
       if (!p.d(f, this.k)) {
          i = (float)this.getMeasuredWidth() * ((f - this.k) * 0x3f000000);
          f1 = (float)this.getMeasuredHeight() * ((f - this.k) * 0x3f000000);
       }else {
          f1 = 0;
       }
       this.g.set(i, f1, ((this.k * (float)this.getMeasuredWidth()) + i), ((this.k * (float)this.getMeasuredHeight()) + f1));
       RoundProgressView th = this.h;
       float f2 = th * 0x3f000000;
       this.g.inset(f2, (th * 0x3f000000));
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, RoundProgressView.class, "3")) {
          return;
       }
       super.onDetachedFromWindow();
       this.p.a();
       this.r.a();
       return;
    }
    public void onDraw(Canvas p0){
       float f5;
       RoundProgressView roundProgres;
       float f6;
       float f7;
       int i1;
       RoundProgressView c;
       RoundProgressView j;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, RoundProgressView.class, "6")) {
          return;
       }
       RoundProgressView g = obj.g;
       obj1.drawCircle(((float)this.getWidth() * 0x3f000000), ((float)this.getHeight() * 0x3f000000), ((g.right - g.left) * 0x3f000000), obj.d);
       float f = 3.00f;
       float f1 = ((float)obj.j * f) / 360.00f;
       float f2 = 0;
       int i = 0;
       float f3 = 270.00f;
       while (i < obj.n.size()) {
          float f4 = (float)obj.n.get(i).intValue();
          if (f2 > 0) {
             f2 = f2 + f1;
          }
          if (!f4 - (float)obj.j) {
             f5 = f4 - f2;
             f5 = f5 - f1;
          }else {
             f5 = f4 - f2;
          }
          if (f5 > 0) {
             roundProgres = (f4 - (float)obj.i >= 0 && obj.l != null)? 1: null;
             if (roundProgres) {
                obj.c.setAlpha(obj.q);
             }
             roundProgres = obj.g;
             f2 = f2 * 360.00f;
             g = obj.j;
             f2 = f2 / (float)g;
             f6 = f2 + f3;
             f5 = f5 * 360.00f;
             f7 = f5 / (float)g;
             i1 = 0;
             c = (f4 - (float)obj.i >= 0 && obj.l != null)? obj.c: obj.b;
             p0.drawArc(roundProgres, f6, f7, i1, c);
          }
          f2 = f4 * 360.00f;
          j = obj.j;
          f2 = f2 / (float)j;
          f2 = f2 + f3;
          roundProgres = obj.g;
          if (!f4 - (float)j) {
             f2 = f2 - f;
          }
          p0.drawArc(roundProgres, f2, 0x40400000, 0, obj.f);
          i = i + 1;
          f2 = f4;
       }
       j = obj.i;
       if (f2 - (float)j < 0) {
          if (f2 > 0) {
             f2 = f2 + f1;
          }
          f5 = (float)j - f2;
          if (f5 > 0) {
             obj.c.setAlpha(obj.q);
             roundProgres = obj.g;
             g = obj.j;
             f6 = ((f2 * 360.00f) / (float)g) + f3;
             f7 = (f5 * 360.00f) / (float)g;
             i1 = 0;
             c = (obj.l != null)? obj.c: obj.b;
             p0.drawArc(roundProgres, f6, f7, i1, c);
          }
       }
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, RoundProgressView.class, "2")) {
          return;
       }
       super.onFinishInflate();
       this.p.b(new RoundProgressView$a(this));
       this.r.b(new RoundProgressView$b(this));
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(RoundProgressView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, RoundProgressView.class, "4")) {
          return;
       }
       super.onMeasure(p0, p1);
       this.o();
       return;
    }
    public void setBackGroundStrokeColor(int p0){
       if (PatchProxy.isSupport(RoundProgressView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RoundProgressView.class, "9")) {
          return;
       }
       this.t = p0;
       this.d.setColor(p0);
       this.o();
       this.invalidate();
       return;
    }
    public void setHeadBlinkEnable(boolean p0){
       if (PatchProxy.isSupport(RoundProgressView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, RoundProgressView.class, "23")) {
          return;
       }
       this.m = p0;
       this.invalidate();
       return;
    }
    public void setLongClickRecordMode(boolean p0){
       if (PatchProxy.isSupport(RoundProgressView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, RoundProgressView.class, "11")) {
          return;
       }
       RoundProgressView td = this.d;
       int i = (!p0)? 0: this.getResources().getColor(R.color.arg_RES_7f061cf6);
       td.setColor(i);
       return;
    }
    public void setMax(int p0){
       if (PatchProxy.isSupport(RoundProgressView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RoundProgressView.class, "21")) {
          return;
       }
       if (p0 <= 0) {
          throw new InvalidParameterException("max must be positive number");
       }
       this.j = p0;
       return;
    }
    public void setProgress(int p0){
       if (PatchProxy.isSupport(RoundProgressView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RoundProgressView.class, "22")) {
          return;
       }
       if (this.m != null || this.i == p0) {
          this.invalidate();
          return;
       }else if(p0 < 0){
          if (!a.a().c()) {
             p0 = 0;
          }else {
             throw new InvalidParameterException("progress can not be negative ");
          }
       }
       this.i = p0;
       this.invalidate();
       return;
    }
    public void setScaleRate(float p0){
       if (PatchProxy.isSupport(RoundProgressView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, RoundProgressView.class, "10")) {
          return;
       }
       this.k = p0;
       this.o();
       this.invalidate();
       return;
    }
    public void setStrokeColor(int p0){
       if (PatchProxy.isSupport(RoundProgressView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RoundProgressView.class, "8")) {
          return;
       }
       this.s = p0;
       this.b.setColor(p0);
       this.o();
       this.invalidate();
       return;
    }
    public void setStrokeWidth(float p0){
       if (PatchProxy.isSupport(RoundProgressView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, RoundProgressView.class, "7")) {
          return;
       }
       p0 = (float)a1.e(p0);
       this.h = p0;
       this.b.setStrokeWidth(p0);
       this.c.setStrokeWidth(this.h);
       this.d.setStrokeWidth(this.h);
       this.e.setStrokeWidth(this.h);
       this.f.setStrokeWidth(this.h);
       this.o();
       this.invalidate();
       return;
    }
}
