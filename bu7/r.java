package bu7.r;
import erd.g;
import com.kwai.tokenshare.KwaiTokenInitModule;
import java.lang.Object;
import bxb.b;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import bu7.k;
import bu7.j0;

public final class r implements g	// class@00049a
{
    public final KwaiTokenInitModule b;

    public void r(KwaiTokenInitModule p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       r tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, KwaiTokenInitModule.class, "7")) {
       }else {
          j0.g(p0.a).e();
       }
       return;
    }
}
