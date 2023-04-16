package ep8.f;
import androidx.recyclerview.widget.GridLayoutManager$b;
import ep8.d;
import androidx.recyclerview.widget.GridLayoutManager;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class f extends GridLayoutManager$b	// class@002227
{
    public final GridLayoutManager e;
    public final d f;

    public void f(d p0,GridLayoutManager p1){
       this.f = p0;
       this.e = p1;
       super();
    }
    public int f(int p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uof, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (this.f.P0(p0) || this.f.N0(p0)) {
          return this.e.getSpanCount();
       }else {
          return 1;
       }
    }
}
