package b9c.m;
import androidx.recyclerview.widget.f$a;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.util.Objects;
import y8c.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import y8c.f;
import ml8.c;
import java.util.Set;

public final class m implements f$a	// class@0003e7
{
    public final RecyclerFragment a;

    public void m(RecyclerFragment p0){
       this.a = p0;
    }
    public final void i(RecyclerView$ViewHolder p0){
       RecyclerFragment u = this.a.u;
       Objects.requireNonNull(u);
       if (PatchProxy.applyVoidOneRefs(p0, u, g.class, "16")) {
       }else {
          p0.b.destroy();
          u.h.remove(p0.b);
       }
       return;
    }
}
