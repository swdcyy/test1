package gqb.p$c;
import erd.g;
import gqb.p;
import java.lang.Object;
import wpb.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public final class p$c implements g	// class@002b87
{
    public final p b;

    public void p$c(p p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p$c.class, "1")) {
       }else {
          p0 = this.b.s;
          if (p0 != null) {
             p0.k0();
          }
       }
       return;
    }
}
