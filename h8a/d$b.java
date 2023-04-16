package h8a.d$b;
import androidx.recyclerview.widget.RecyclerView$r;
import h8a.d;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class d$b extends RecyclerView$r	// class@0025e3
{
    public final d a;

    public void d$b(d p0){
       this.a = p0;
       super();
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(d$b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, d$b.class, "1")) {
          return;
       }
       a.p(p0, "recyclerView");
       this.a.c9();
       return;
    }
}
