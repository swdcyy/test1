package cb5.u$a;
import java.lang.Runnable;
import cb5.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;

public class u$a implements Runnable	// class@000459
{
    public final u b;

    public void u$a(u p0){
       this.b = p0;
       super();
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, u$a.class, "1")) {
          return;
       }
       u$a tb = this.b;
       tb.y = true;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, u.class, "4")) {
          tb.p.N1();
       }
       return;
    }
}
