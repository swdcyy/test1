package com.yxcorp.gifshow.widget.SegmentProgressBar;
import android.widget.ProgressBar;
import android.content.Context;
import lnc.b0;
import java.util.LinkedList;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.graphics.drawable.ColorDrawable;
import android.content.res.Resources;
import java.lang.Integer;
import java.lang.Number;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.Rect;
import lnc.a1;
import android.view.View;
import tyc.t4;
import lnc.b0$b;

public class SegmentProgressBar extends ProgressBar	// class@0018c3
{
    public Drawable b;
    public Drawable c;
    public Drawable d;
    public b0 e;
    public boolean f;
    public boolean g;
    public int h;
    public LinkedList i;

    public void SegmentProgressBar(Context p0){
       super(p0);
       this.e = new b0();
       this.g = false;
       this.h = 255;
       this.i = new LinkedList();
       this.b();
    }
    public void SegmentProgressBar(Context p0,AttributeSet p1){
       super(p0, p1);
       this.e = new b0();
       this.g = false;
       this.h = 255;
       this.i = new LinkedList();
       this.b();
    }
    public void SegmentProgressBar(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.e = new b0();
       this.g = false;
       this.h = 255;
       this.i = new LinkedList();
       this.b();
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, SegmentProgressBar.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.i.isEmpty() ^ 0x01);
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, SegmentProgressBar.class, "1")) {
          return;
       }
       this.b = new ColorDrawable(this.getResources().getColor(0x7f0604b6));
       this.c = new ColorDrawable(this.getResources().getColor(0x7f0604c1));
       this.d = new ColorDrawable(this.getResources().getColor(0x7f0604c1));
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, SegmentProgressBar.class, "5")) {
          return;
       }
       int progress = this.getProgress();
       if (!this.a() || progress > this.i.getLast().intValue()) {
          this.i.add(Integer.valueOf(progress));
       }
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, SegmentProgressBar.class, "16")) {
          return;
       }
       this.setHeadBlinkEnable(true);
       this.e.c();
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, SegmentProgressBar.class, "17")) {
          return;
       }
       this.setHeadBlinkEnable(false);
       this.e.d();
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, SegmentProgressBar.class, "7")) {
          return;
       }
       if (this.f != null) {
          this.f = false;
          this.invalidate();
       }
       return;
    }
    public final int getLastSegmentDuration(){
       Object obj = PatchProxy.apply(null, this, SegmentProgressBar.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       SegmentProgressBar segmentProgr = 1;
       if (this.i.size() < segmentProgr) {
          return 0;
       }
       if (this.i.size() == segmentProgr) {
          return this.i.getLast().intValue();
       }
       segmentProgr = this.i;
       return (this.i.getLast().intValue() - segmentProgr.get((segmentProgr.size() - 2)).intValue());
    }
    public int getSegmentsCount(){
       Object obj = PatchProxy.apply(null, this, SegmentProgressBar.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.i.size();
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, SegmentProgressBar.class, "3")) {
          return;
       }
       super.onDetachedFromWindow();
       this.e.a();
       return;
    }
    public void onDraw(Canvas p0){
       int i;
       int i2;
       if (PatchProxy.applyVoidOneRefs(p0, this, SegmentProgressBar.class, "20")) {
          return;
       }
       super.onDraw(p0);
       Rect bounds = this.getProgressDrawable().getBounds();
       float f = 0x3f800000;
       if (!this.a() || this.getProgress() > this.i.getLast().intValue()) {
          i = (this.a())? (int)(((float)(bounds.right * this.i.getLast().intValue()) * f) / (float)this.getMax()): 0;
          this.c.setBounds(i, bounds.top, (int)(((float)(bounds.right * this.getProgress()) * f) / (float)this.getMax()), bounds.bottom);
          this.c.draw(p0);
       }
       if (this.a()) {
          int i1 = 2;
          if (this.i.size() >= i1) {
             SegmentProgressBar ti = this.i;
             i = ti.get((ti.size() - i1)).intValue();
          }else {
             i = 0;
          }
          i1 = this.i.getLast().intValue();
          i = (int)((float)bounds.right * (((float)i * f) / (float)this.getMax()));
          Rect top = bounds.top;
          Rect right = (i1 == this.getMax())? bounds.right: (int)((float)bounds.right * (((float)i1 * f) / (float)this.getMax())) - a1.e(3.00f);
          Rect bottom = bounds.bottom;
          if (this.f != null) {
             this.b.setBounds(i, top, right, bottom);
             this.b.draw(p0);
          }else {
             this.c.setBounds(i, top, right, bottom);
             this.c.draw(p0);
          }
          i = 0;
          i1 = this.i.size() - 1;
          while (i < i1) {
             if (!i) {
                i1 = 0;
             }else {
                i2 = i - 1;
                i1 = bounds.right * this.i.get(i2).intValue();
                float f2 = (float)i1 * f;
                f2 = f2 / (float)this.getMax();
                i1 = (int)f2;
             }
             i2 = bounds.right * this.i.get(i).intValue();
             float f1 = (float)i2 * f;
             f1 = f1 / (float)this.getMax();
             i2 = (int)f1 - a1.e(3.00f);
             this.c.setBounds(i1, bounds.top, i2, bounds.bottom);
             this.c.draw(p0);
             i = i + 1;
          }
          if (this.g != null && (this.d != null && this.getProgressDrawable() != null)) {
             i = (int)((float)bounds.right * (((float)this.getProgress() * f) / (float)this.getMax()));
             this.d.setBounds(i, bounds.top, (a1.e(3.00f) + i), bounds.bottom);
             this.d.setAlpha(this.h);
             this.d.draw(p0);
          }
       }
    label_0182 :
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, SegmentProgressBar.class, "2")) {
          return;
       }
       super.onFinishInflate();
       this.e.b(new t4(this));
       return;
    }
    public void setHeadBlinkEnable(boolean p0){
       if (PatchProxy.isSupport(SegmentProgressBar.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, SegmentProgressBar.class, "18")) {
          return;
       }
       this.g = p0;
       this.invalidate();
       return;
    }
}
