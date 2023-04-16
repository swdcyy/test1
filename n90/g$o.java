package n90.g$o;
import erd.g;
import n90.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kuaishou.gifshow.kuaishan.utils.e;
import androidx.lifecycle.MutableLiveData;

public final class g$o implements g	// class@0026e2
{
    public final g b;

    public void g$o(g p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$o.class, "1")) {
       }else {
          e.v(p0, "downloadTemplate failed due to: "+p0.getMessage());
          if (this.b.d == null) {
             this.b.f().setValue(p0);
          }
       }
       return;
    }
}
