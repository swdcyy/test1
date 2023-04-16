package fna.k$b;
import androidx.recyclerview.widget.RecyclerView$i;
import fna.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import ena.j;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import gna.a;

public final class k$b extends RecyclerView$i	// class@002989
{
    public final k a;

    public void k$b(k p0){
       this.a = p0;
       super();
    }
    public void g(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, k$b.class, "1")) {
          return;
       }
       k$b ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, k.class, "7")) {
          ta.s = false;
          k q = ta.q;
          if (q != null) {
             j s = q.s;
             if (s != null) {
                RecyclerView$Adapter adapter = s.getAdapter();
                if (adapter instanceof a) {
                   objArray = adapter;
                }
                if (objArray != null) {
                   ta.s = objArray.L0() ^ 0x01;
                }
             }
          }
       }
       this.a.S8();
       return;
    }
}
