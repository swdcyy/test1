package e42.l;
import dt5.b;
import com.kuaishou.live.core.show.clearscreen.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.clearscreen.e;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import eg1.e;
import lp3.c;
import lp3.i;
import nq5.a;
import dt5.a;
import t02.a0;
import e57.a;
import java.lang.System;

public class l implements b	// class@00261e
{
    public final d a;

    public void l(d p0){
       this.a = p0;
       super();
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, l.class, "3")) {
          return;
       }
       this.a.S8().setVisible(false);
       this.a.y.setImageDrawable(objArray);
       this.a.X8();
       this.a.v.a(e.class).j1(16);
       l ta = this.a;
       ta.r = false;
       ta.t = false;
       return;
    }
    public void b(boolean p0){
       a.b(this, p0);
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, l.class, "2")) {
          return;
       }
       if (!this.a.V8()) {
          return;
       }
       a0 q1 = this.a.u.q1;
       if (q1 != null) {
          q1.f();
       }
       this.a.r = true;
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, l.class, "1")) {
          return;
       }
       this.a.S8().setVisible(true);
       this.a.y.setImageResource(R.drawable.arg_RES_7f081141);
       this.a.s = System.currentTimeMillis();
       this.a.v.a(e.class).S0(16);
       return;
    }
    public void e(float p0){
       a.a(this, p0);
    }
    public void f(float p0){
       a.e(this, p0);
    }
    public void g(){
       a.g(this);
    }
}
