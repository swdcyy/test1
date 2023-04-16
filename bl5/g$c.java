package bl5.g$c;
import androidx.recyclerview.widget.GridLayoutManager$b;
import bl5.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import ol8.a;
import androidx.recyclerview.widget.GridLayoutManager;

public class g$c extends GridLayoutManager$b	// class@0004d4
{
    public final g e;

    public void g$c(g p0){
       this.e = p0;
       super();
    }
    public int f(int p0){
       g$c uoc = g$c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (this.e.v.f0(p0) == 1) {
          return this.e.w.getSpanCount();
       }else {
          return 1;
       }
    }
}
