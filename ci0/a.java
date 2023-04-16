package ci0.a;
import ei0.a;
import androidx.lifecycle.LifecycleOwner;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ci0.a$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import tvc.f;
import androidx.lifecycle.Observer;
import xvc.b;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import tvc.e;

public abstract class a extends a	// class@0004c0
{
    public Reference c;
    public final Observer d;
    public final LifecycleOwner e;
    public final EditReduxViewModel f;

    public void a(LifecycleOwner p0,EditReduxViewModel p1,View p2){
       a.p(p0, "owner");
       a.p(p1, "store");
       a.p(p2, "root");
       super(p2);
       this.e = p0;
       this.f = p1;
       this.d = new a$a(this);
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       this.f.r0().observe(this.e, this.d);
       return;
    }
    public void C(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       this.f.r0().removeObserver(this.d);
       return;
    }
    public final void D(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "5")) {
          return;
       }
       a.p(p0, "action");
       this.f.t0(p0);
       return;
    }
    public final View E(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.A().findViewById(p0);
    }
    public void F(e p0,e p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "6")) {
          return;
       }
       a.p(p1, "newState");
       return;
    }
}
