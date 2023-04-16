package nx0.g;
import androidx.lifecycle.Observer;
import nx0.a;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class g implements Observer	// class@0033ec
{
    public final a b;

    public void g(a p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
       }else {
          this.b.a();
       }
       return;
    }
}
