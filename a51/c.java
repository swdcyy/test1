package a51.c;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import k51.c;
import a51.c$a;
import mrd.a;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelStore;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.Lifecycle$State;
import brd.x;
import com.kwai.robust.PatchProxyResult;
import a51.a;
import androidx.lifecycle.Lifecycle;

public class c extends c implements LifecycleOwner, ViewModelStoreOwner	// class@000047
{
    public boolean p;
    public final a q;
    public final LifecycleRegistry r;
    public ViewModelStore s;
    public static final c$a t;
    public static final c$a u;

    static {
       c.t = new c$a();
       c.u = new c$a();
    }
    public void c(){
       super();
       this.q = a.g();
       this.r = new LifecycleRegistry(this);
       this.s = new ViewModelStore();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       this.r.setCurrentState(Lifecycle$State.CREATED);
       this.r.setCurrentState(Lifecycle$State.RESUMED);
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.p = false;
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       this.q.onNext(c.u);
       this.s.clear();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       this.r.setCurrentState(Lifecycle$State.DESTROYED);
       this.q.onNext(c.t);
       this.p = true;
       return;
    }
    public x P8(){
       c uoc = c.class;
       c$a obj = PatchProxy.apply(null, this, uoc, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = c.t;
       a uoa = PatchProxy.applyOneRefs(obj, this, uoc, "6");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new a(this, obj);
       }
       return uoa;
    }
    public boolean R8(){
       return this.p;
    }
    public Lifecycle getLifecycle(){
       return this.r;
    }
    public ViewModelStore getViewModelStore(){
       return this.s;
    }
}
