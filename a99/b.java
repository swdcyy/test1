package a99.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a99.a;
import erd.g;
import crd.b;
import brd.t;
import io.reactivex.subjects.PublishSubject;
import m99.f;

public class b extends PresenterV2	// class@00005b
{
    public PublishSubject p;
    public f q;

    public void b(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.X7(this.p.subscribe(new a(this)));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.r8("IS_NONET_TOAST_SHOWED_SUBJECT");
       this.q = this.q8(f.class);
       return;
    }
}
