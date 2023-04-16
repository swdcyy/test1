package i63.a;
import i63.b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.c$b;
import androidx.fragment.app.e;
import i63.a$a;
import i63.c;
import com.kwai.live.gzone.tab.page.a;
import android.os.Bundle;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public abstract class a extends b	// class@002ec8
{
    public Fragment u;
    public c v;
    public c$b w;

    public void a(){
       super();
    }
    public abstract Fragment C();
    public abstract c D();
    public abstract String E();
    public void a(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       a tw = this.w;
       if (tw != null) {
          this.v.unregisterFragmentLifecycleCallbacks(tw);
       }
       this.v.beginTransaction().u(this.u).o();
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       super.b();
       this.v = this.D();
       this.w = new a$a(this);
       a tu = this.u;
       if (tu instanceof c) {
          tu.zf(this);
       }
       tu = this.d;
       if (tu != null) {
          this.u.setArguments(tu);
       }
       this.v.registerFragmentLifecycleCallbacks(this.w, false);
       e uoe = this.v.beginTransaction();
       uoe.h(this.u, this.E());
       uoe.o();
       return;
    }
    public void onCreate(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.u = this.C();
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       this.u = null;
       return;
    }
    public void q(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       a tu = this.u;
       if (tu instanceof BaseFragment && tu.isVisible()) {
          this.u.u();
       }
       return;
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       a tu = this.u;
       if (tu instanceof BaseFragment && tu.isVisible()) {
          this.u.c0();
       }
       return;
    }
}
