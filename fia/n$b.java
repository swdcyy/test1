package fia.n$b;
import tw6.e;
import fia.n;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.view.View;
import bf5.d;
import java.util.Timer;
import fia.n$b$a;
import java.util.TimerTask;

public final class n$b implements e	// class@002925
{
    public final n a;

    public void n$b(n p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       n$b uob = n$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       n$b ta = this.a;
       ta.x = true;
       n q = ta.q;
       float f = 0;
       if (q != null) {
          q.setAlpha(f);
       }
       q = this.a.r;
       if (q != null) {
          q.setAlpha(f);
       }
       q = this.a.s;
       if (q != null) {
          q.setAlpha(f);
       }
       ta = this.a;
       n v = ta.v;
       if (v != null) {
          ta.u = v.g();
          v.f();
       }
       return;
    }
    public void b(int p0){
       n$b uob = n$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "2")) {
          return;
       }
       n$b ta = this.a;
       ta.x = false;
       if (ta.u != null) {
          new Timer().schedule(new n$b$a(this), 300);
       }
       n q = this.a.q;
       if (q != null) {
          q.setAlpha(0x3f800000);
       }
       q = this.a.r;
       if (q != null) {
          q.setAlpha(0x3f800000);
       }
       q = this.a.s;
       if (q != null) {
          q.setAlpha(0x3f800000);
       }
       return;
    }
}
