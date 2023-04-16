package com.kwai.widget.customer.mediapreview.u;
import com.kwai.widget.customer.mediapreview.widget.KwaiDraggedConstraintLayout$b;
import com.kwai.widget.customer.mediapreview.t;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.ref.WeakReference;
import android.view.View;
import android.graphics.Rect;
import java.lang.Math;
import android.graphics.Color;
import android.view.ViewGroup;
import java.lang.Float;
import java.util.Objects;
import android.animation.ValueAnimator;
import ix7.r;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import ix7.y;
import android.animation.Animator$AnimatorListener;
import io.reactivex.subjects.PublishSubject;

public class u implements KwaiDraggedConstraintLayout$b	// class@001148
{
    public final t a;

    public void u(t p0){
       this.a = p0;
       super();
    }
    public void a(int p0,int p1){
       u ou = u.class;
       if (PatchProxy.isSupport(ou) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ou, "2")) {
          return;
       }
       if (this.a.S8()) {
          return;
       }
       t w = this.a.w;
       if (w != null && w.get() != null) {
          View view = this.a.w.get();
          t v = this.a.v;
          float f = 0x3f800000;
          float f1 = ((float)(v.bottom - v.top) * f) / (float)view.getHeight();
          if (f1 - f > 0) {
             f1 = 0x3f800000;
          }
          f = f - Math.min(f, (((float)Math.abs(p1) * f) / (float)view.getHeight()));
          if (f - f1 >= 0) {
             f1 = f;
          }
          this.a.q.setBackgroundColor(Color.argb((int)(0x437f0000 * f1), 0, 0, 0));
          view.setScaleX(f1);
          view.setScaleY(f1);
          view.setTranslationX((float)p0);
          view.setTranslationY((float)p1);
       }
       return;
    }
    public void b(int p0,int p1,float p2){
       if (PatchProxy.isSupport(u.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Float.valueOf(p2), this, u.class, "3")) {
          return;
       }
       if (this.a.S8()) {
          return;
       }
       t w = this.a.w;
       if (w != null && w.get() != null) {
          this.a.w.get().getGlobalVisibleRect(new Rect());
          if (p1 >= 300 || p2 - 0x43fa0000 >= 0) {
             this.a.P8(false);
          }else {
             u ta = this.a;
             Objects.requireNonNull(ta);
             if (!PatchProxy.applyVoid(null, ta, t.class, "9") && !ta.S8()) {
                t w1 = ta.w;
                if (w1 != null && w1.get() != null) {
                   Object obj = ta.w.get();
                   ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
                   ta.z = valueAnimato;
                   r or = new r(ta, ta.R8(obj), obj, obj.getScaleX(), obj.getScaleY(), obj.getTranslationX(), obj.getTranslationY());
                   valueAnimato.addUpdateListener(null);
                   ta.z.addListener(new y(ta));
                   ta.z.setDuration(300);
                   ta.z.start();
                }
             }
          }
       }
       return;
    }
    public long c(){
       return 10;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, u.class, "1")) {
          return;
       }
       if (this.a.S8()) {
          return;
       }
       if (this.a.V8() != null) {
          this.a.r.onNext(Integer.valueOf(0));
       }
       return;
    }
}
