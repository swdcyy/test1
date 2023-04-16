package dy9.c;
import erd.g;
import dy9.b$e;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qp7.d;
import qp7.b;
import br7.b;
import android.view.View;
import com.kwai.slide.play.detail.utils.c;

public final class c implements g	// class@001ffc
{
    public final b$e b;

    public void c(b$e p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          p0 = this.b.b.C();
          p0 = (p0 != null)? p0.p(): null;
          c.c(p0, 0, 250);
       }
       return;
    }
}
