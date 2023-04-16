package ju1.a$a;
import androidx.lifecycle.Observer;
import ju1.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;

public final class a$a implements Observer	// class@002c10
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public final void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       p0 = this.b;
       Objects.requireNonNull(p0);
       if (!PatchProxy.applyVoid(null, p0, a.class, "1")) {
          p0.y0();
       }
       return;
    }
}
