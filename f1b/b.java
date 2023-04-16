package f1b.b;
import androidx.recyclerview.widget.RecyclerView$r;
import f1b.d;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import z2b.b;

public class b extends RecyclerView$r	// class@00286a
{
    public final d a;

    public void b(d p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, b.class, "1")) {
          return;
       }
       if (!p1) {
          this.a.b();
       }
       return;
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, b.class, "2")) {
          return;
       }
       if (this.a.a.a(p1, p2)) {
          this.a.b();
       }
       return;
    }
}
