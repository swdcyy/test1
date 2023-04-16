package com.yxcorp.gifshow.widget.EditCoverSeekBar;
import android.view.View;
import lnc.a1;
import android.content.Context;
import bxc.b;
import android.graphics.Rect;
import android.util.AttributeSet;
import com.yxcorp.gifshow.v3.widget.gestures.ITimeLineGestureProcessor$HeadingDirection;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;
import android.content.res.Resources;
import cw9.c;
import java.lang.Integer;
import android.graphics.drawable.Drawable;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import java.lang.Math;
import android.graphics.Paint;
import java.lang.Float;
import java.lang.Boolean;
import android.graphics.Path;
import tyc.k4;
import com.yxcorp.gifshow.widget.EditCoverSeekBar$b;
import com.kwai.robust.PatchProxyResult;
import android.view.MotionEvent;
import a2.q;
import kotlin.Pair;
import com.yxcorp.gifshow.v3.widget.gestures.TimeLineGestureProcessor;
import com.yxcorp.gifshow.v3.widget.gestures.TimeLineGestureProcessor$AbsorbStatus;
import java.lang.ref.WeakReference;
import java.lang.Runnable;
import com.yxcorp.gifshow.widget.EditCoverSeekBar$c;

public class EditCoverSeekBar extends View	// class@00181f
{
    public final b b;
    public Paint c;
    public Bitmap d;
    public Rect e;
    public int f;
    public int g;
    public int h;
    public int i;
    public EditCoverSeekBar$b j;
    public Rect k;
    public Rect l;
    public boolean m;
    public boolean n;
    public EditCoverSeekBar$c o;
    public float p;
    public boolean q;
    public static final int r;
    public static final int s;

    static {
       EditCoverSeekBar.r = a1.d(0x7f07030a);
       EditCoverSeekBar.s = a1.d(0x7f070fda);
    }
    public void EditCoverSeekBar(Context p0){
       super(p0);
       this.b = new b();
       this.i = 1;
       this.k = new Rect();
       this.m = false;
       this.n = false;
       this.c(p0);
    }
    public void EditCoverSeekBar(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = new b();
       this.i = 1;
       this.k = new Rect();
       this.m = false;
       this.n = false;
       this.c(p0);
    }
    public void EditCoverSeekBar(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new b();
       this.i = 1;
       this.k = new Rect();
       this.m = false;
       this.n = false;
       this.c(p0);
    }
    public final ITimeLineGestureProcessor$HeadingDirection a(int p0,int p1){
       ITimeLineGestureProcessor$HeadingDirection rIGHT;
       if (p1 > p0) {
          rIGHT = ITimeLineGestureProcessor$HeadingDirection.RIGHT;
       }else if(p1 < p0){
          rIGHT = ITimeLineGestureProcessor$HeadingDirection.LEFT;
       }else {
          rIGHT = ITimeLineGestureProcessor$HeadingDirection.NONE;
       }
       return rIGHT;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, EditCoverSeekBar.class, "9")) {
          return;
       }
       Object[] objArray = new Object[0];
       String str = "EditCoverSeekBar";
       a.D().w(str, "hideThumbSelectedDrawableIfNeeded", objArray);
       if (this.m == null && this.n != null) {
          objArray = new Object[0];
          a.D().w(str, "real hideThumbSelectedDrawable", objArray);
          EditCoverSeekBar te = this.e;
          this.l = new Rect(te.left, te.top, te.right, te.bottom);
          this.e = new Rect(0, 0, 0, 0);
          this.m = true;
          this.invalidate();
       }
       return;
    }
    public final void c(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditCoverSeekBar.class, "8")) {
          return;
       }
       Resources resources = p0.getResources();
       this.g = c.b(resources, 0x7f07017f);
       this.h = c.b(resources, 0x7f07017e);
       this.e(1);
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, EditCoverSeekBar.class, "10")) {
          return;
       }
       Object[] objArray = new Object[0];
       String str = "EditCoverSeekBar";
       a.D().w(str, "recoverThumbRectIfNeeded", objArray);
       if (this.m != null) {
          objArray = new Object[0];
          a.D().w(str, "real recoverThumbRect", objArray);
          EditCoverSeekBar tl = this.l;
          this.e = new Rect(tl.left, tl.top, tl.right, tl.bottom);
          this.m = false;
       }
       this.n = false;
       return;
    }
    public final void e(int p0){
       Rect left;
       if (PatchProxy.isSupport(EditCoverSeekBar.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, EditCoverSeekBar.class, "11")) {
          return;
       }
       this.i = p0;
       int i = EditCoverSeekBar.r * 2;
       Drawable drawable = this.getResources().getDrawable(R.drawable.arg_RES_7f082451);
       this.d = Bitmap.createBitmap(((this.g * p0) + i), (this.h + i), Bitmap$Config.ARGB_8888);
       Canvas uCanvas = new Canvas(this.d);
       drawable.setBounds(0, 0, uCanvas.getWidth(), uCanvas.getHeight());
       drawable.draw(uCanvas);
       int i1 = (this.g * p0) + i;
       EditCoverSeekBar te = this.e;
       te = (te == null)? 0: te.left;
       te = Math.max(0, Math.min(te, (this.getMeasuredWidth() - i1)));
       this.e = new Rect(te, 0, (i1 + te), (this.h + i));
       this.m = false;
       this.b();
       float f = (float)this.e.left / (float)(this.getWidth() - this.e.width());
       if (Math.abs((f - this.p)) - 0x3c23d70a < 0 || this.q != null) {
          this.f(this.p);
       }else {
          this.p = f;
       }
       Paint paint = new Paint();
       this.c = paint;
       paint.setARGB(153, 0, 0, 0);
       return;
    }
    public void f(float p0){
       if (PatchProxy.isSupport(EditCoverSeekBar.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, EditCoverSeekBar.class, "6")) {
          return;
       }
       this.g(p0, false);
       return;
    }
    public void g(float p0,boolean p1){
       if (PatchProxy.isSupport(EditCoverSeekBar.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Boolean.valueOf(p1), this, EditCoverSeekBar.class, "5")) {
          return;
       }
       this.p = Math.min(0x3f800000, Math.max(0, p0));
       this.q = p1;
       this.setThumbRectByProgress(p0);
       this.invalidate();
       return;
    }
    public float getProgress(){
       return this.p;
    }
    public void onDraw(Canvas p0){
       int r;
       int s;
       if (PatchProxy.applyVoidOneRefs(p0, this, EditCoverSeekBar.class, "2")) {
          return;
       }
       super.onDraw(p0);
       if (this.d != null) {
          Rect left = this.e.left;
          if (left > null) {
             r = EditCoverSeekBar.r;
             s = EditCoverSeekBar.s;
             p0.drawPath(k4.b(r, r, left, (this.getHeight() - (r * 2)), s, 0, 0, s), this.c);
          }
          if (this.m == null && this.e.right < this.getWidth()) {
             r = EditCoverSeekBar.r;
             int s1 = EditCoverSeekBar.s;
             p0.drawPath(k4.b((this.e.right - r), r, (this.getWidth() - this.e.right), (this.getHeight() - (r * 2)), 0, s1, s1, 0), this.c);
          }
          EditCoverSeekBar te = this.e;
          if (te.left == null && te.right == null) {
             r = EditCoverSeekBar.r;
             s = EditCoverSeekBar.s;
             p0.drawPath(k4.b(r, r, (this.getWidth() - (r * 2)), (this.getHeight() - (r * 2)), s, s, s, s), this.c);
          }
          te = this.j;
          if (te != null) {
             boolean b = false;
             Drawable uDrawable = te.a((this.getWidth() - this.e.width()), this.g, b);
             EditCoverSeekBar te1 = this.e;
             int r1 = EditCoverSeekBar.r;
             this.k.set((te1.left + r1), (te1.top + r1), (te1.right - r1), (te1.bottom - r1));
             if (uDrawable != null) {
                if ((double)(Math.abs((this.p - this.j.a)) * (float)(this.getMeasuredWidth() - this.e.width())) - 0x3ff0000000000000 < 0) {
                   if (this.m != null) {
                      te = this.e;
                      if (te.left == null && te.right == null) {
                         uDrawable = this.j.a((this.getWidth() - this.e.width()), this.g, b);
                      label_0115 :
                         if (uDrawable != null) {
                            uDrawable.draw(p0);
                         }
                      }
                   }
                   uDrawable = this.j.a((this.getWidth() - this.e.width()), this.g, true);
                   goto label_0115 ;
                }else if(Rect.intersects(this.e, uDrawable.getBounds())){
                   p0.save();
                   Rect bounds = uDrawable.getBounds();
                   te1 = this.e;
                   Object obj = PatchProxy.applyTwoRefs(bounds, te1, this, EditCoverSeekBar.class, "17");
                   if (obj != PatchProxyResult.class) {
                      bounds = obj;
                   }else if(bounds.isEmpty()){
                      if (bounds.left < te1.left) {
                         left = new Rect(bounds.left, bounds.top, Math.min(bounds.right, te1.left), bounds.bottom);
                      }else if(bounds.right > te1.right){
                         left = new Rect(Math.min(bounds.right, te1.right), bounds.top, bounds.right, bounds.bottom);
                      }
                      bounds = left;
                   }
                   p0.clipRect(bounds);
                   uDrawable.draw(p0);
                   p0.restore();
                }else {
                   uDrawable.draw(p0);
                }
             }
          }
          p0.drawBitmap(this.d, null, this.e, null);
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(EditCoverSeekBar.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, EditCoverSeekBar.class, "1")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       this.setThumbRectByProgress(this.p);
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       EditCoverSeekBar tj;
       EditCoverSeekBar to;
       Pair obj = PatchProxy.applyOneRefs(p0, this, EditCoverSeekBar.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.isEnabled()) {
          return true;
       }
       if (this.m != null) {
          this.d();
          this.p = 0;
       }
       int i = (int)p0.getX();
       EditCoverSeekBar te = this.e;
       Rect left = te.left;
       int i1 = te.width();
       int i2 = q.c(p0);
       int i3 = 0;
       if (i2) {
          if (i2 == 1 || (i2 == 2 || i2 == 3)) {
             i = i - this.f;
             obj = this.b.a(i, this.a(this.e.left, i));
             this.e.offsetTo(Math.max(i3, Math.min(obj.getSecond().intValue(), (this.getWidth() - i1))), i3);
             this.p = (float)this.e.left / (float)(this.getWidth() - this.e.width());
             if (obj.getFirst() == TimeLineGestureProcessor$AbsorbStatus.ABSORBED) {
                tj = this.j;
                if (tj != null) {
                   EditCoverSeekBar$b a = tj.a;
                   if ((double)(a - this.p) - 0x3f847ae147ae147b < 0) {
                      this.p = a;
                   }
                }
             }
             if (q.c(p0) == 1) {
                tj = this.j;
                if (tj != null && (double)(Math.abs((this.p - tj.a)) * (float)(this.getMeasuredWidth() - this.e.width())) - 0x3ff0000000000000 < 0) {
                   Runnable runnable = this.j.j.get();
                   if (runnable != null) {
                      runnable.run();
                   }
                }
             }
             tj = this.o;
             if (tj != null) {
                tj.c(this, this.p);
             }
             if (q.c(p0) != 2) {
                to = this.o;
                if (to != null) {
                   to.b(this, this.p);
                }
                this.b.c();
             }
             this.invalidate();
          }
       }else {
          int i4 = i - left;
          if (i4 >= 0 && i <= i1) {
             this.f = i4;
          }else {
             i4 = i1 / 2;
             this.f = i4;
             i = i - i4;
             this.e.offsetTo(Math.max(i3, Math.min(i, (this.getWidth() - i1))), i3);
             this.b.a(this.e.left, this.a(left, this.e.left));
             this.invalidate();
          }
          to = this.o;
          if (to != null) {
             to.a(this);
          }
       }
       return true;
    }
    public void setIsImportCoverSelected(boolean p0){
       this.n = p0;
    }
    public void setOnCoverSeekBarChangeListener(EditCoverSeekBar$c p0){
       this.o = p0;
    }
    public final void setThumbRectByProgress(float p0){
       if (PatchProxy.isSupport(EditCoverSeekBar.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, EditCoverSeekBar.class, "7")) {
          return;
       }
       if (this.getWidth() > 0) {
          EditCoverSeekBar te = this.e;
          if (te != null && this.m == null) {
             te.offsetTo((int)(p0 * (float)(this.getWidth() - this.e.width())), 0);
          }
       }
       return;
    }
    public void setThumbWidth(int p0){
       if (PatchProxy.isSupport(EditCoverSeekBar.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, EditCoverSeekBar.class, "12")) {
          return;
       }
       if (this.g != p0) {
          EditCoverSeekBar tj = this.j;
          if (tj != null) {
             tj.i = false;
          }
          this.g = p0;
       }
       EditCoverSeekBar ti = this.i;
       if (!PatchProxy.isSupport(EditCoverSeekBar.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(ti), this, EditCoverSeekBar.class, "4")) {
          this.e(ti);
          this.postInvalidate();
       }
       return;
    }
}
