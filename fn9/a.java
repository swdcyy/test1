package fn9.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class a extends PresenterV2	// class@002337
{
    public QPhoto p;
    public BaseFragment q;

    public void a(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       a tp = this.p;
       if (tp == null) {
          a.S("mPhoto");
       }
       a tq = this.q;
       if (tq == null) {
          a.S("mFragment");
       }
       tp.startSyncWithFragment(tq.m());
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       Object obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.p = obj;
       obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(PageAccessIds.FRAGMENT\)");
       this.q = obj;
       return;
    }
}
