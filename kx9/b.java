package kx9.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kx9.b$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.trello.rxlifecycle3.components.support.RxFragment;
import brd.t;
import kx9.a;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import jx9.a;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;

public class b extends PresenterV2	// class@002d16
{
    public a p;
    public Set q;
    public RecyclerFragment r;
    public FragmentCompositeLifecycleState s;
    public final n t;

    public void b(){
       super();
       this.t = new b$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.q.add(this.t);
       FragmentCompositeLifecycleState uFragmentCom = new FragmentCompositeLifecycleState(this.r);
       this.s = uFragmentCom;
       this.X7(uFragmentCom.f().subscribe(new a(this), Functions.e));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.q.remove(this.t);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.q8(a.class);
       this.q = this.r8("COMMENT_SCROLL_LISTENERS");
       this.r = this.r8("FRAGMENT");
       return;
    }
}
