package b56.f0;
import sc6.e;
import android.view.ViewGroup;
import java.lang.Object;
import b56.c0;
import b56.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import android.view.View;
import b56.f0$b;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.AnimationDrawable;
import android.content.res.Resources;
import sc6.d;
import java.lang.Integer;
import java.lang.Long;
import b56.z;
import java.lang.Math;
import java.lang.CharSequence;
import android.widget.TextView;

public class f0 implements e	// class@000400
{
    public final ViewGroup b;
    public final d c;
    public boolean d;
    public boolean e;
    public ViewGroup f;
    public View g;
    public Set h;
    public TextView i;
    public TextView j;
    public f0$b k;
    public View l;
    public View m;
    public TextView n;
    public View o;
    public ImageView p;
    public boolean q;
    public y r;
    public int s;
    public int t;
    public Drawable u;
    public static final boolean v;

    public void f0(ViewGroup p0){
       super();
       this.t = 2;
       this.b = p0;
       this.c = new c0();
       this.k = new b();
    }
    public void a(boolean p0){
       f0 uof0 = f0.class;
       if (PatchProxy.isSupport(uof0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uof0, "13")) {
          return;
       }
       this.d = p0;
       uof0 = this.g;
       if (uof0 != null) {
          uof0.setSelected(p0);
       }
       uof0 = this.f;
       if (uof0 != null) {
          this.k.a(uof0, p0);
       }
       return;
    }
    public void b(boolean p0){
       f0 uof0 = f0.class;
       if (PatchProxy.isSupport(uof0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uof0, "5")) {
          return;
       }
       this.q = p0;
       if (!PatchProxy.isSupport(uof0) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, this, uof0, "8")) {
          f0 tp = this.p;
          if (tp != null) {
             int i = this.q ^ 0x01;
             if (tp.isSelected() != i) {
                tp = this.p.isShown();
                Drawable drawable = this.p.getDrawable();
                if (tp && (drawable instanceof AnimationDrawable && drawable.isRunning())) {
                   tp = false;
                }
             label_0058 :
                if (tp) {
                   Drawable drawable1 = (i)? this.p.getResources().getDrawable(R.drawable.arg_RES_7f08077f): this.p.getResources().getDrawable(R.drawable.arg_RES_7f080780);
                   this.p.setImageDrawable(drawable1.mutate());
                   this.p.getDrawable().start();
                }else {
                   tp = this.p;
                   Drawable drawable2 = (i)? tp.getResources().getDrawable(R.drawable.arg_RES_7f0824e9): tp.getResources().getDrawable(R.drawable.arg_RES_7f0824e1);
                   tp.setImageDrawable(drawable2);
                   if (drawable instanceof AnimationDrawable) {
                      drawable.stop();
                   }
                }
                this.p.setSelected(i);
             }
          }
       }
       return;
    }
    public d c(){
       return this.c;
    }
    public void d(int p0){
       f0 uof0 = f0.class;
       if (PatchProxy.isSupport(uof0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uof0, "1")) {
          return;
       }
       this.s = p0;
       uof0 = this.f;
       if (uof0 != null) {
          uof0.setBackgroundResource(p0);
       }
       return;
    }
    public void e(long p0,long p1){
       f0 uof0 = f0.class;
       if (PatchProxy.isSupport(uof0) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, uof0, "25")) {
          return;
       }
       uof0 = this.c;
       uof0.setProgress(z.a(p0, p1, uof0.e()));
       return;
    }
    public void f(long p0,long p1){
       f0 uof0 = f0.class;
       if (PatchProxy.isSupport(uof0) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, uof0, "24")) {
          return;
       }
       uof0 = this.i;
       if (uof0 != null) {
          uof0.setText(z.c(Math.min(p0, p1)));
       }
       uof0 = this.j;
       if (uof0 != null) {
          uof0.setText(z.c(p1));
       }
       if (this.e == null) {
          this.e(p0, p1);
       }
       return;
    }
}
