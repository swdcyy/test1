package cb0.a$d;
import androidx.lifecycle.Observer;
import cb0.a;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class a$d implements Observer	// class@0002fb
{
    public final a b;

    public void a$d(a p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$d.class, "1")) {
       }else {
          a.o(p0, "progress");
          this.b.G(p0.intValue());
       }
       return;
    }
}
