package dec.a$a;
import qvb.q;
import dec.a;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import mp.b;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import dec.a$a$a;
import java.lang.Runnable;
import ekd.k1;

public final class a$a implements q	// class@002194
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       if (p1 || (p0 && !b.c())) {
          a p = this.b.p;
          if (p == null) {
             a.S("fragment");
          }
          if (p.Vg().c()) {
             p.s = false;
             k1.r(new a$a$a(this), 300);
          }else {
             p.s = true;
          }
       }
    label_004e :
       return;
    }
}
