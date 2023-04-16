package apa.c;
import erd.g;
import apa.b;
import java.lang.Object;
import eda.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.user.User;

public final class c implements g	// class@0002a0
{
    public final b b;

    public void c(b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          a.p(p0, "event");
          c tb = this.b;
          p0 = p0.a;
          if (p0 != null) {
             p0 = p0.mId;
             if (p0 != null) {
             label_001f :
                tb.b = p0;
             }
          }
          p0 = "";
          goto label_001f ;
       }
       return;
    }
}
