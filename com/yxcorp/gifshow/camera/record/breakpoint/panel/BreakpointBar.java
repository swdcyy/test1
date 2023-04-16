package com.yxcorp.gifshow.camera.record.breakpoint.panel.BreakpointBar;
import ml8.d;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rc9.a;
import sc9.a;
import java.util.Objects;
import java.lang.Float;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.camera.record.breakpoint.panel.BreakpointHandle;
import android.widget.LinearLayout;
import android.view.View;
import com.yxcorp.utility.n;
import ekd.m1;
import android.widget.TextView;
import java.lang.Boolean;
import java.lang.Integer;

public class BreakpointBar extends RelativeLayout implements d	// class@000db1
{
    public View b;
    public BreakpointHandle c;
    public View d;
    public TextView e;
    public TextView f;
    public a g;
    public a h;
    public float i;
    public float j;
    public float k;
    public float l;

    public void BreakpointBar(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, BreakpointBar.class, "8")) {
          return;
       }
       this.d();
       this.e();
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, BreakpointBar.class, "9")) {
          return;
       }
       float f = (float)this.g.e * this.l;
       this.j = f;
       BreakpointBar th = this.h;
       if (th != null) {
          th.d(f);
       }
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, BreakpointBar.class, "6")) {
          return;
       }
       BreakpointBar tg = this.g;
       a a = tg.a;
       float f = this.k / (float)a;
       this.l = f;
       a b = tg.b;
       float f1 = (float)b * f;
       this.i = f1;
       this.j = (float)tg.e * f;
       float f2 = (float)b * f;
       f = f * (float)a;
       BreakpointBar th = this.h;
       Objects.requireNonNull(th);
       if (PatchProxy.isSupport(a.class) && (!PatchProxy.applyVoidOneRefs(Float.valueOf(f1), th, a.class, "1") && th.d - f1)) {
          th.d = f1;
          th.invalidateSelf();
       }
       this.h.d(this.j);
       th = this.c;
       th.d = f2;
       th.e = f;
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, BreakpointBar.class, "10")) {
          return;
       }
       this.c.setTranslationX(((float)this.g.d * this.l));
       this.b();
       if (this.g.h()) {
          BreakpointBar tg = this.g;
          if (tg.c == tg.d) {
             this.b.setVisibility(0);
             this.b.setTranslationX((((float)n.o(this.c)[0] + ((float)this.c.getWidth() / 2.00f)) - ((float)this.b.getWidth() / 2.00f)));
          }
       }else {
          this.b.setVisibility(4);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BreakpointBar.class, "1")) {
          return;
       }
       this.e = m1.f(p0, 0x7f0a050d);
       this.f = m1.f(p0, 0x7f0a0511);
       this.b = m1.f(p0, 0x7f0a051a);
       this.c = m1.f(p0, 0x7f0a0512);
       this.d = m1.f(p0, 0x7f0a051b);
       return;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, BreakpointBar.class, "11")) {
          return;
       }
       this.c.b();
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, BreakpointBar.class, "2")) {
          return;
       }
       super.onFinishInflate();
       this.doBindView(this);
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(BreakpointBar.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, BreakpointBar.class, "5")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       float f = (float)this.d.getLeft() + ((this.h.c(0) / 2.00f) + 0x3f800000);
       BreakpointBar tc = this.c;
       tc.layout((int)(f - (float)(this.c.getMeasuredWidth() / 2)), tc.getTop(), (int)(f + (float)(this.c.getMeasuredWidth() / 2)), this.c.getBottom());
       this.d();
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(BreakpointBar.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, BreakpointBar.class, "4")) {
          return;
       }
       super.onMeasure(p0, p1);
       if (this.g.a == null) {
          return;
       }
       this.k = (float)this.d.getMeasuredWidth() - this.h.c(0);
       this.c();
       return;
    }
}
