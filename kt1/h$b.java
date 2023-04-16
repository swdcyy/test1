package kt1.h$b;
import androidx.lifecycle.Observer;
import kt1.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class h$b implements Observer	// class@002dfa
{
    public final h b;

    public void h$b(h p0){
       this.b = p0;
       super();
    }
    public final void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$b.class, "1")) {
          return;
       }
       p0 = this.b;
       if (p0.c == null) {
          p0.v0();
       }
       return;
    }
}
