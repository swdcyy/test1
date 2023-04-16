package androidx.appcompat.app.AppCompatDelegateImpl$h;
import u0.b$a;
import androidx.appcompat.app.AppCompatDelegateImpl;
import java.lang.Object;
import u0.b;
import android.view.View;
import android.view.Window;
import java.lang.Runnable;
import a2.m0;
import a2.i0;
import androidx.appcompat.app.AppCompatDelegateImpl$h$a;
import a2.n0;
import q0.c;
import android.view.Menu;
import android.view.MenuItem;

public class AppCompatDelegateImpl$h implements b$a	// class@000579
{
    public b$a a;
    public final AppCompatDelegateImpl b;

    public void AppCompatDelegateImpl$h(AppCompatDelegateImpl p0,b$a p1){
       this.b = p0;
       super();
       this.a = p1;
    }
    public void a(b p0){
       this.a.a(p0);
       AppCompatDelegateImpl$h tb = this.b;
       if (tb.t != null) {
          tb.i.getDecorView().removeCallbacks(this.b.u);
       }
       tb = this.b;
       if (tb.s != null) {
          tb.e0();
          tb = this.b;
          m0 om0 = i0.c(tb.s);
          om0.a(0);
          tb.v = om0;
          this.b.v.f(new AppCompatDelegateImpl$h$a(this));
       }
       tb = this.b;
       AppCompatDelegateImpl k = tb.k;
       if (k != null) {
          k.onSupportActionModeFinished(tb.r);
       }
       tb = this.b;
       tb.r = null;
       i0.p0(tb.y);
       return;
    }
    public boolean b(b p0,Menu p1){
       return this.a.b(p0, p1);
    }
    public boolean c(b p0,MenuItem p1){
       return this.a.c(p0, p1);
    }
    public boolean d(b p0,Menu p1){
       i0.p0(this.b.y);
       return this.a.d(p0, p1);
    }
}
