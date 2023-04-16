package gqb.n;
import erd.g;
import gqb.k;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import kotlin.jvm.internal.a;
import lnc.da;
import java.lang.CharSequence;

public final class n implements g	// class@002b80
{
    public final k b;

    public void n(k p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "1")) {
       }else {
          a.o(p0, "it");
          k.P8(this.b).setText(da.b(p0.longValue()));
       }
       return;
    }
}
