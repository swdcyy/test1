package fna.k$c;
import androidx.recyclerview.widget.RecyclerView$r;
import fna.k;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class k$c extends RecyclerView$r	// class@00298a
{
    public final k a;

    public void k$c(k p0){
       this.a = p0;
       super();
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(k$c.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, k$c.class, "1")) {
          return;
       }
       a.p(p0, "recyclerView");
       this.a.S8();
       return;
    }
}
