package f12.o;
import pw6.d;
import pw6.a;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.detail.slideplay.SlidePlayFragment;
import androidx.lifecycle.Lifecycle;
import f12.n;
import androidx.lifecycle.LifecycleObserver;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pw6.c;
import vy6.a;

public class o extends a implements d	// class@002841
{
    public final SlidePlayFragment h;
    public boolean i;

    public void o(d p0,int p1){
       super(p0, p1);
       SlidePlayFragment slidePlayFra = p0.g0();
       this.h = slidePlayFra;
       slidePlayFra.ch();
       slidePlayFra.getLifecycle().addObserver(new n(this));
    }
    public void I(){
       if (PatchProxy.applyVoid(null, this, o.class, "1")) {
          return;
       }
       if (this.d != null) {
          return;
       }
       this.d = true;
       o th = this.h;
       if (th != null) {
          th.jh();
       }
       return;
    }
    public void Mg(String p0){
       c.a(this, p0);
    }
    public void Q(){
       if (PatchProxy.applyVoid(null, this, o.class, "4")) {
          return;
       }
       if (this.e == null) {
          return;
       }
       this.e = false;
       o th = this.h;
       if (th != null) {
          th.B0();
       }
       return;
    }
    public void U(){
       if (PatchProxy.applyVoid(null, this, o.class, "2")) {
          return;
       }
       if (this.d == null) {
          return;
       }
       this.d = false;
       o th = this.h;
       if (th != null) {
          th.kh();
       }
       return;
    }
    public void a0(){
       if (PatchProxy.applyVoid(null, this, o.class, "3")) {
          return;
       }
       if (this.e != null) {
          return;
       }
       this.e = true;
       o th = this.h;
       if (th != null) {
          th.k1();
       }
       return;
    }
    public Fragment g0(){
       return this.h;
    }
}
