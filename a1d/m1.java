package a1d.m1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.fragment.app.KwaiDialogFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;
import a1d.l1;
import erd.r;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import a1d.k1;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import b1d.c;

public class m1 extends PresenterV2	// class@00003e
{
    public c p;
    public final KwaiDialogFragment q;

    public void m1(KwaiDialogFragment p0){
       super();
       this.q = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, m1.class, "2")) {
          return;
       }
       this.X7(t.just(this.q.m().filter(l1.b)).delay(100, TimeUnit.MILLISECONDS, d.c).observeOn(d.a).subscribe(new k1(this), Functions.d()));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, m1.class, "1")) {
          return;
       }
       this.p = this.r8("SLIDE_HELPER");
       return;
    }
}
