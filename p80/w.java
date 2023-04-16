package p80.w;
import java.lang.Runnable;
import kotlin.jvm.internal.Ref$IntRef;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.kswebview.middleware.Middleware;
import com.kuaishou.webkit.extension.KsWebExtensionStatics;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;

public final class w implements Runnable	// class@0028e2
{
    public final Ref$IntRef b;

    public void w(Ref$IntRef p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, w.class, "1")) {
          return;
       }
       long l = Middleware.a();
       if (l - null) {
          KsWebExtensionStatics.setHttpDnsFunctionTable(l, this.b.element);
       }
       return;
    }
}
