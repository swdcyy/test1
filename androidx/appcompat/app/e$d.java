package androidx.appcompat.app.e$d;
import androidx.appcompat.view.menu.e$a;
import u0.b;
import androidx.appcompat.app.e;
import android.content.Context;
import u0.b$a;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContextView;
import android.view.MenuItem;
import android.view.ViewGroup;
import w0.k;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import android.view.View;
import java.lang.Object;
import java.lang.ref.WeakReference;
import android.view.Menu;
import android.view.MenuInflater;
import u0.g;
import java.lang.CharSequence;
import android.content.res.Resources;
import java.lang.String;

public class e$d extends b implements e$a	// class@000592
{
    public final Context d;
    public final e e;
    public b$a f;
    public WeakReference g;
    public final e h;

    public void e$d(e p0,Context p1,b$a p2){
       this.h = p0;
       super();
       this.d = p1;
       this.f = p2;
       p0 = new e(p1);
       p0.W(1);
       this.e = p0;
       p0.V(this);
    }
    public void a(e p0){
       if (this.f == null) {
          return;
       }
       this.k();
       this.h.j.l();
       return;
    }
    public boolean b(e p0,MenuItem p1){
       e$d tf = this.f;
       if (tf != null) {
          return tf.c(this, p1);
       }
       return false;
    }
    public void c(){
       e$d th = this.h;
       if (th.q != this) {
          return;
       }
       boolean b = false;
       if (!e.r0(th.y, th.z, b)) {
          th = this.h;
          th.r = this;
          th.s = this.f;
       }else {
          this.f.a(this);
       }
       this.f = null;
       this.h.q0(b);
       this.h.j.g();
       this.h.i.A().sendAccessibilityEvent(32);
       e$d th1 = this.h;
       th1.g.setHideOnContentScrollEnabled(th1.E);
       this.h.q = null;
       return;
    }
    public View d(){
       e$d tg = this.g;
       View view = (tg != null)? tg.get(): null;
       return view;
    }
    public Menu e(){
       return this.e;
    }
    public MenuInflater f(){
       return new g(this.d);
    }
    public CharSequence g(){
       return this.h.j.getSubtitle();
    }
    public CharSequence i(){
       return this.h.j.getTitle();
    }
    public void k(){
       if (this.h.q != this) {
          return;
       }
       this.e.h0();
       this.f.d(this, this.e);
       this.e.g0();
       return;
    }
    public boolean l(){
       return this.h.j.j();
    }
    public void m(View p0){
       this.h.j.setCustomView(p0);
       this.g = new WeakReference(p0);
    }
    public void n(int p0){
       this.o(this.h.d.getResources().getString(p0));
    }
    public void o(CharSequence p0){
       this.h.j.setSubtitle(p0);
    }
    public void q(int p0){
       this.r(this.h.d.getResources().getString(p0));
    }
    public void r(CharSequence p0){
       this.h.j.setTitle(p0);
    }
    public void s(boolean p0){
       super.s(p0);
       this.h.j.setTitleOptional(p0);
    }
    public boolean t(){
       this.e.h0();
       this.e.g0();
       return this.f.b(this, this.e);
    }
}
