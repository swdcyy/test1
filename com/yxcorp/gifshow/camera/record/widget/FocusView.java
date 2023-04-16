package com.yxcorp.gifshow.camera.record.widget.FocusView;
import java.lang.Runnable;
import android.view.View;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import android.animation.ValueAnimator;
import ki9.f;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.graphics.Paint;
import ki9.g;
import t45.c;
import android.graphics.Rect;
import android.graphics.Canvas;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.Float;
import java.lang.Integer;
import android.graphics.Region$Op;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import ki9.d;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import org.json.JSONObject;
import x8c.a;
import java.lang.Throwable;
import q87.c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class FocusView extends View implements Runnable	// class@000fc4
{
    public Rect b;
    public Rect c;
    public Rect d;
    public Drawable e;
    public Drawable f;
    public Paint g;
    public float h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public ValueAnimator o;
    public ValueAnimator p;
    public ValueAnimator q;
    public static final float r;
    public static final int s;
    public static final int t;
    public static final int u;

    static {
       FocusView.r = (float)a1.e(80.00f);
       FocusView.s = a1.e(56.00f);
       FocusView.t = a1.e(22.00f);
       FocusView.u = a1.e(10.00f);
    }
    public void FocusView(Context p0){
       super(p0);
       this.n = true;
       this.c();
    }
    public void FocusView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.n = true;
       this.c();
    }
    public void FocusView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.n = true;
       this.c();
    }
    public final void a(boolean p0,long p1){
       if (PatchProxy.isSupport(FocusView.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Long.valueOf(p1), this, FocusView.class, "10")) {
          return;
       }
       int[] ointArray = new int[2];
       int i = 75;
       int i1 = (p0)? 75: 0;
       ointArray[0] = i1;
       if (p0) {
          i = 0;
       }
       ointArray[1] = i;
       ValueAnimator valueAnimato = ValueAnimator.ofInt(ointArray);
       this.q = valueAnimato;
       valueAnimato.setDuration(p1);
       this.q.addUpdateListener(new f(this));
       this.q.start();
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, FocusView.class, "3")) {
          return;
       }
       this.e();
       this.invalidate();
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, FocusView.class, "1")) {
          return;
       }
       this.g = new Paint();
       c.a(new g(this));
       return;
    }
    public boolean d(){
       return this.j;
    }
    public final void e(){
       this.l = false;
       this.b = null;
       this.j = false;
       this.m = false;
       this.k = false;
       this.q = null;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, FocusView.class, "12")) {
          return;
       }
       int t = FocusView.t;
       this.c.top = this.b.centerY() - (t / 2);
       FocusView tc = this.c;
       tc.bottom = tc.top + t;
       int i = (this.i != null)? this.b.left - a1.e(28.00f): this.b.right + a1.e(5.00f);
       tc.left = i;
       tc = this.c;
       tc.right = tc.left + t;
       t = FocusView.s;
       this.d.top = this.b.centerY() - t;
       tc = this.d;
       tc.bottom = tc.top + (t * 2);
       tc.left = this.c.centerX() - a1.e(0x3f000000);
       this.d.right = this.c.centerX() + a1.e(0x3f000000);
       return;
    }
    public boolean isClickable(){
       return false;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, FocusView.class, "5")) {
          return;
       }
       super.onDetachedFromWindow();
       this.removeCallbacks(this);
       this.q = null;
       this.p = null;
       this.o = null;
       return;
    }
    public void onDraw(Canvas p0){
       int s;
       FocusView tq;
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, FocusView.class, "4")) {
          return;
       }
       super.onDraw(p0);
       if (this.b != null && this.c != null) {
          if (this.e == null || this.f == null) {
             this.e = this.getResources().getDrawable(0x7f082017);
             this.f = this.getResources().getDrawable(0x7f08201a);
          }
          if (!PatchProxy.applyVoid(null, this, FocusView.class, "11")) {
             int i1 = (int)(FocusView.r * this.o.getAnimatedValue().floatValue());
             FocusView tb = this.b;
             int i2 = i1 / 2;
             i = this.b.centerX() - i2;
             tb.left = i;
             s = this.b.centerY() - i2;
             tb.top = s;
             tb.right = i + i1;
             tb.bottom = s + i1;
             this.f();
          }
          s = FocusView.s;
          float f = (float)s;
          if (this.h - f > 0) {
             this.h = f;
          }
          float f1 = (float)(- s);
          if (this.h - f1 < 0) {
             this.h = f1;
          }
          p0.save();
          if (this.n != null) {
             FocusView tg = this.g;
             tq = this.q;
             s = (tq == null)? 0: tq.getAnimatedValue().intValue();
             tg.setAlpha(s);
             tg = this.c;
             FocusView th = this.h;
             p0.clipRect((float)tg.left, (((float)tg.top + th) - 8.00f), (float)tg.right, (((float)tg.bottom + th) + 8.00f), Region$Op.DIFFERENCE);
             p0.drawRect(this.d, this.g);
          }
          p0.restore();
          i = (this.m != null)? 255: this.p.getAnimatedValue().intValue();
          this.e.setAlpha(i);
          this.e.setBounds(this.b);
          this.e.draw(p0);
          if (this.n != null) {
             this.f.setAlpha(i);
             tq = this.c;
             FocusView th1 = this.h;
             this.f.setBounds(tq.left, (int)((float)tq.top + th1), tq.right, (int)((float)tq.bottom + th1));
             this.f.draw(p0);
          }
       }
    label_0118 :
       return;
    }
    public void onWindowVisibilityChanged(int p0){
       if (PatchProxy.isSupport(FocusView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, FocusView.class, "6")) {
          return;
       }
       super.onWindowVisibilityChanged(p0);
       if (p0) {
          this.b();
       }
       return;
    }
    public void run(){
       JSONObject jSONObject;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, FocusView.class, "2")) {
          return;
       }
       this.removeCallbacks(this);
       if (this.b != null && this.d()) {
          if (this.l == null) {
             this.l = true;
             this.m = false;
             ValueAnimator valueAnimato = ValueAnimator.ofInt(new int[2]{255,0});
             this.p = valueAnimato;
             valueAnimato.setInterpolator(new LinearInterpolator());
             this.p.setDuration(1500);
             this.p.addUpdateListener(new d(this));
             this.p.start();
             if (this.k != null) {
                this.k = false;
                this.a(true, 1500);
             }
             this.postDelayed(this, 1500);
          }else {
             this.b();
             if (!PatchProxy.applyVoid(objArray, this, FocusView.class, "14")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "DRAG_ADJUST_BRIGHTNESS_SLIDER";
                try{
                   jSONObject = new JSONObject();
                   jSONObject.put("brightness_value", String.valueOf(((- this.h) / (float)FocusView.s)));
                }catch(org.json.JSONException e2){
                   a.D().z("FocusView", "error", e2);
                }
                uElementPack.params = jSONObject.toString();
                u1.u(3, uElementPack, new ClientContent$ContentPackage());
             }
          }
       }
       return;
    }
    public final void setCircleArea(Rect p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FocusView.class, "9")) {
          return;
       }
       this.b = p0;
       this.c = new Rect();
       this.d = new Rect();
       this.j = true;
       this.l = false;
       this.k = false;
       this.h = 0;
       this.f();
       return;
    }
}
