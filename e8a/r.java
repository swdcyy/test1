package e8a.r;
import e8a.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import e8a.r$a;
import erd.g;
import crd.b;
import brd.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import io.reactivex.subjects.PublishSubject;

public final class r extends t	// class@0020d4
{
    public PublishSubject r;

    public void r(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, r.class, "4")) {
          return;
       }
       r tr = this.r;
       if (tr == null) {
          a.S("mOnLongPressedPublisher");
       }
       this.X7(tr.subscribe(new r$a(this)));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, r.class, "1")) {
          return;
       }
       super.j8();
       Object obj = this.r8("DETAIL_LONG_ATLAS_LONG_PRESS");
       a.o(obj, "inject\(DetailAccessIds.D¡­IL_LONG_ATLAS_LONG_PRESS\)");
       this.r = obj;
       return;
    }
}
