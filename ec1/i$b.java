package ec1.i$b;
import androidx.fragment.app.c$b;
import ec1.i;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;

public class i$b extends c$b	// class@0020da
{
    public final i a;

    public void i$b(i p0){
       this.a = p0;
       super();
    }
    public void i(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i$b.class, "1")) {
          return;
       }
       i$b ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, i.class, "7")) {
          ta.B = true;
          ta.V8();
       }
       return;
    }
    public void l(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i$b.class, "2")) {
          return;
       }
       p0.B = false;
       return;
    }
}
