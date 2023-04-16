package ou1.t;
import androidx.lifecycle.Observer;
import ou1.u;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class t implements Observer	// class@0035a9
{
    public final u b;

    public void t(u p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "1")) {
       }else if(a.g(p0, Boolean.TRUE) ^ 0x01){
          this.b.f3();
       }
       return;
    }
}
