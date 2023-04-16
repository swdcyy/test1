package a1d.s1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import a1d.r1;
import erd.r;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import a1d.q1;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import b1d.c;

public class s1 extends PresenterV2	// class@000053
{
    public c p;
    public final BaseFragment q;

    public void s1(BaseFragment p0){
       super();
       this.q = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, s1.class, "2")) {
          return;
       }
       this.X7(t.just(this.q.m().filter(new r1(this))).delay(100, TimeUnit.MILLISECONDS, d.c).observeOn(d.a).subscribe(new q1(this), Functions.d()));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, s1.class, "1")) {
          return;
       }
       this.p = this.r8("SLIDE_HELPER");
       return;
    }
}
