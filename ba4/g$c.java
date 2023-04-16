package ba4.g$c;
import t94.a;
import ba4.g;
import java.lang.Object;
import y94.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import androidx.recyclerview.widget.RecyclerView;

public class g$c implements a	// class@000355
{
    public final g a;

    public void g$c(g p0){
       this.a = p0;
       super();
    }
    public void a(int p0,Object p1){
       if (!PatchProxy.isSupport(g$c.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, g$c.class, "1")) {
          p1 = this.a.t;
          if (p1 != null) {
             p1.smoothScrollToPosition(p0);
          }
       }
       return;
    }
}
