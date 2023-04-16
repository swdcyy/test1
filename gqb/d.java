package gqb.d;
import erd.g;
import gqb.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.yxcorp.utility.NetworkUtilsCached;
import e17.i;
import com.yxcorp.retrofit.model.KwaiException;
import java.lang.CharSequence;

public final class d implements g	// class@002b74
{
    public final g b;

    public void d(g p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
       }else {
          d tb = this.b;
          a.o(p0, "throwable");
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, g.class, "8")) {
             if (!NetworkUtilsCached.k()) {
                a.o(i.a(R.style.arg_RES_7f110668, 0x7f1038e5), "KSToast.applyStyle\(R.sty¡­tring.network_failed_tip\)");
             }else if(p0 instanceof KwaiException && p0.getErrorCode() == 250){
                p0 = p0.getMessage();
                if (p0 != null) {
                   i.d(R.style.arg_RES_7f110668, p0);
                }
             }
          }
       }
       return;
    }
}
