package mr1.g;
import androidx.lifecycle.Observer;
import mr1.l;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kr1.b;

public final class g implements Observer	// class@0031f8
{
    public final l b;

    public void g(l p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
       }else {
          this.b.c.c();
       }
       return;
    }
}
