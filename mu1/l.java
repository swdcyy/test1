package mu1.l;
import androidx.lifecycle.ViewModelProvider$Factory;
import java.lang.String;
import mu1.i;
import mu1.g;
import java.lang.Object;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import mu1.k;
import kotlin.jvm.internal.a;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public class l implements ViewModelProvider$Factory	// class@003227
{
    public final i a;
    public final g b;
    public final String c;

    public void l(String p0,i p1,g p2){
       super();
       this.c = p0;
       this.a = p1;
       this.b = p2;
    }
    public ViewModel create(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a.g(p0, k.class)) {
          return new k(this.c, this.a, this.b);
       }
       throw new IllegalArgumentException("ViewModel is error:"+p0.getName());
    }
}
