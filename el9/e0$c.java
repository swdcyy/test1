package el9.e0$c;
import androidx.recyclerview.widget.RecyclerView$r;
import el9.e0;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;

public class e0$c extends RecyclerView$r	// class@0021e3
{
    public final e0 a;

    public void e0$c(e0 p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       e0$c uoc = e0$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "1")) {
          return;
       }
       if (!p1 || p1 == 1) {
          this.a.P8(false);
          p0.removeOnScrollListener(this);
       }
       return;
    }
}
