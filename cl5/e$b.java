package cl5.e$b;
import androidx.recyclerview.widget.GridLayoutManager$b;
import cl5.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import ol8.a;

public class e$b extends GridLayoutManager$b	// class@0006ef
{
    public final e e;

    public void e$b(e p0){
       this.e = p0;
       super();
    }
    public int f(int p0){
       e$b uob = e$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (this.e.u.f0(p0) == 1000) {
          return this.e.y;
       }else {
          return 1;
       }
    }
}
