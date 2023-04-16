package cb5.c0$a;
import androidx.recyclerview.widget.RecyclerView$i;
import cb5.c0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;

public class c0$a extends RecyclerView$i	// class@000443
{
    public final c0 a;

    public void c0$a(c0 p0){
       this.a = p0;
       super();
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, c0$a.class, "1")) {
          return;
       }
       this.a.t.h0().invalidateItemDecorations();
       return;
    }
}
