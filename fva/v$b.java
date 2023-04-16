package fva.v$b;
import erd.g;
import fva.v;
import java.lang.Object;
import dva.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yua.a;
import androidx.recyclerview.widget.RecyclerView;

public final class v$b implements g	// class@002a30
{
    public final v b;

    public void v$b(v p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v$b.class, "1")) {
       }else {
          v.P8(this.b).S0(false);
          this.b.v.scrollToPosition(false);
       }
       return;
    }
}
