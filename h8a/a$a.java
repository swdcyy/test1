package h8a.a$a;
import androidx.recyclerview.widget.RecyclerView$r;
import h8a.a;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;

public class a$a extends RecyclerView$r	// class@0025de
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       if (PatchProxy.isSupport(a$a.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, a$a.class, "1")) {
          return;
       }
       this.a.Z8(p0);
       return;
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(a$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, a$a.class, "2")) {
          return;
       }
       this.a.Z8(p0);
       return;
    }
}
