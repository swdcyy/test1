package n90.g$f;
import erd.g;
import n90.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import com.kuaishou.gifshow.kuaishan.utils.e;
import androidx.lifecycle.MutableLiveData;

public final class g$f implements g	// class@0026d9
{
    public final g b;

    public void g$f(g p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$f.class, "1")) {
       }else {
          a.p(p0, "error");
          e.v(p0, "Prepare media tasks failed due to: "+p0.getMessage());
          this.b.f().setValue(p0);
       }
       return;
    }
}
