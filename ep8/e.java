package ep8.e;
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

public class e extends GridLayoutManager$b	// class@002226
{
    public final GridLayoutManager e;
    public final GridLayoutManager$b f;
    public final d g;

    public void e(d p0,GridLayoutManager p1,GridLayoutManager$b p2){
       this.g = p0;
       this.e = p1;
       this.f = p2;
       super();
    }
    public int f(int p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoe, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i = 1;
       uoe = (this.g.P0(p0) || this.g.N0(p0))? 1: null;
       if (uoe) {
          i = this.e.getSpanCount();
       }else {
          uoe = this.f;
          if (uoe != null) {
             i = uoe.f(p0);
          }
       }
       return i;
    }
}
