package com.yxcorp.gifshow.widget.BlinkProgressBar;
import ozc.l;
import android.widget.ProgressBar;
import android.content.Context;
import java.util.LinkedList;
import lnc.b0;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Integer;
import ozc.k;
import android.graphics.drawable.ColorDrawable;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.Canvas;
import android.graphics.Rect;
import java.util.Iterator;
import com.yxcorp.utility.n;
import android.view.View;
import com.yxcorp.gifshow.widget.BlinkProgressBar$a;
import lnc.b0$b;

public class BlinkProgressBar extends ProgressBar implements l	// class@0017f5
{
    public Drawable b;
    public LinkedList c;
    public boolean d;
    public Drawable e;
    public Drawable f;
    public int g;
    public b0 h;

    public void BlinkProgressBar(Context p0){
       super(p0);
       this.c = new LinkedList();
       this.g = 255;
       this.h = new b0();
       this.n();
    }
    public void BlinkProgressBar(Context p0,AttributeSet p1){
       super(p0, p1);
       this.c = new LinkedList();
       this.g = 255;
       this.h = new b0();
       this.n();
    }
    public void BlinkProgressBar(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.c = new LinkedList();
       this.g = 255;
       this.h = new b0();
       this.n();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, BlinkProgressBar.class, "3")) {
          return;
       }
       this.d = true;
       this.invalidate();
       return;
    }
    public boolean b(){
       return false;
    }
    public boolean c(){
       return this.d;
    }
    public boolean d(){
       Object obj = PatchProxy.apply(null, this, BlinkProgressBar.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int progress = this.getProgress();
       boolean b = false;
       int i = (this.c.isEmpty())? 0: this.c.getLast().intValue();
       if (progress > i) {
          b = true;
       }
       return b;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, BlinkProgressBar.class, "2")) {
          return;
       }
       int progress = this.getProgress();
       if (!this.g() || progress > this.c.getLast().intValue()) {
          this.c.add(Integer.valueOf(progress));
       }
       return;
    }
    public boolean f(){
       return k.a(this);
    }
    public boolean g(){
       Object obj = PatchProxy.apply(null, this, BlinkProgressBar.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.c.isEmpty() ^ 0x01);
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, BlinkProgressBar.class, "8")) {
          return;
       }
       this.c.clear();
       this.setProgress(0);
       return;
    }
    public void i(){
       k.b(this);
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, BlinkProgressBar.class, "10")) {
          return;
       }
       this.h.d();
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, BlinkProgressBar.class, "7")) {
          return;
       }
       if (this.g()) {
          this.c.removeLast();
          int i = (this.c.isEmpty())? 0: this.c.getLast().intValue();
          this.setProgress(i);
       }
       return;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, BlinkProgressBar.class, "9")) {
          return;
       }
       this.setHeadBlinkEnable(true);
       this.h.c();
       return;
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, BlinkProgressBar.class, "4")) {
          return;
       }
       if (this.d != null) {
          this.d = false;
          this.invalidate();
       }
       return;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, BlinkProgressBar.class, "1")) {
          return;
       }
       this.e = new ColorDrawable(this.getResources().getColor(0x7f061c2d));
       this.f = new ColorDrawable(-1);
       this.b = this.getResources().getDrawable(0x7f081dbf);
       return;
    }
    public synchronized void onDraw(Canvas p0){
       Rect bounds;
       int i;
       int i1;
       if (PatchProxy.applyVoidOneRefs(p0, this, BlinkProgressBar.class, "13")) {
          return;
       }
       super.onDraw(p0);
       int intrinsicWid = this.b.getIntrinsicWidth();
       float f = 0x3f800000;
       if (this.g()) {
          bounds = this.getProgressDrawable().getBounds();
          if (this.d != null) {
             i = 2;
             if (this.c.size() >= i) {
                BlinkProgressBar tc = this.c;
                i1 = tc.get((tc.size() - i)).intValue();
             }else {
                i1 = 0;
             }
             this.e.setBounds((int)((float)bounds.right * (((float)i1 * f) / (float)this.getMax())), bounds.top, (int)((float)bounds.right * (((float)this.c.getLast().intValue() * f) / (float)this.getMax())), bounds.bottom);
             this.e.draw(p0);
          }
          Iterator iterator = this.c.iterator();
          while (iterator.hasNext()) {
             int i2 = bounds.right * iterator.next().intValue();
             float f1 = (float)i2 * f;
             f1 = f1 / (float)this.getMax();
             i = (int)f1 - n.c(this.getContext(), 2.00f);
             int i3 = n.c(this.getContext(), 2.00f) + i;
             this.f.setBounds(i, bounds.top, i3, bounds.bottom);
             this.f.draw(p0);
          }
       }
       if (this.b != null && this.getProgressDrawable() != null) {
          bounds = this.getProgressDrawable().getBounds();
          int i4 = (int)((float)bounds.right * (((float)this.getProgress() * f) / (float)this.getMax()));
          this.b.setBounds(i4, bounds.top, (intrinsicWid + i4), bounds.bottom);
          this.b.setAlpha(this.g);
          this.b.draw(p0);
       }
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, BlinkProgressBar.class, "11")) {
          return;
       }
       super.onFinishInflate();
       this.h.b(new BlinkProgressBar$a(this));
       this.h.c();
       return;
    }
    public void setBlinkDrawable(Drawable p0){
       this.b = p0;
    }
    public void setHeadBlinkEnable(boolean p0){
    }
}
