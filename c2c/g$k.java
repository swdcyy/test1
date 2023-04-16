package c2c.g$k;
import erd.g;
import c2c.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e17.i;
import com.yxcorp.gifshow.fragment.ProgressFragment;

public final class g$k implements g	// class@000509
{
    public final g b;

    public void g$k(g p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$k.class, "1")) {
       }else {
          i.a(R.style.arg_RES_7f11066a, 0x7f100dd5);
          p0 = this.b.t;
          if (p0 != null) {
             p0.dismiss();
          }
       }
       return;
    }
}
