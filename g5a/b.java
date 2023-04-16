package g5a.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import g5a.a;
import erd.g;
import crd.b;
import brd.t;
import mrd.c;

public class b extends PresenterV2	// class@0023af
{
    public c p;
    public String q;

    public void b(String p0){
       super();
       this.q = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       b tp = this.p;
       if (tp == null) {
          return;
       }
       this.X7(tp.subscribe(new a(this)));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.r8("PLC_DATA_FETCHED");
       return;
    }
}
