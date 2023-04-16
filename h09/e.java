package h09.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import mxb.c;
import com.yxcorp.gifshow.util.rx.RxBus;
import h09.c;
import brd.t;
import t45.d;
import brd.z;
import h09.e$a;
import erd.g;
import crd.b;
import n49.o;

public final class e extends PresenterV2	// class@00252f
{
    public QPhoto p;
    public o q;

    public void e(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       e tp = this.p;
       if (tp == null) {
          a.S("mPhoto");
       }
       if (!c.a(tp.mEntity)) {
          return;
       }else {
          this.X7(RxBus.f.f(c.class).observeOn(d.a).subscribe(new e$a(this)));
          return;
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       Object obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.p = obj;
       obj = this.q8(o.class);
       a.o(obj, "inject\(PhotoAdActionBarClickProcessor::class.java\)");
       this.q = obj;
       return;
    }
}
