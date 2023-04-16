package e63.d1;
import androidx.recyclerview.widget.RecyclerView$r;
import com.kuaishou.live.gzone.v2.profile.e;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;

public class d1 extends RecyclerView$r	// class@002646
{
    public final e a;

    public void d1(e p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       if (PatchProxy.isSupport(d1.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, d1.class, "1")) {
          return;
       }
       if (!p1) {
          this.a.H9();
       }
       return;
    }
}
