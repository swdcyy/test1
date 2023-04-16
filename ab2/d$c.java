package ab2.d$c;
import androidx.lifecycle.Observer;
import ab2.d;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import lnc.b9;

public class d$c implements Observer	// class@00009c
{
    public final d b;

    public void d$c(d p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$c.class, "1")) {
       }else {
          b9.a(this.b.v);
          if (!this.b.P8()) {
             this.b.R8();
          }
       }
       return;
    }
}
