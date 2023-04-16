package mhc.o0$c;
import mhc.o0$a;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.DialogFragment;

public class o0$c extends o0$a	// class@003590
{

    public void o0$c(BaseFeed p0){
       super(p0);
    }
    public final void a(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o0$c.class, "1")) {
          return;
       }
       if (!p0 instanceof DialogFragment) {
          p0 = null;
       }
       this.j(p0);
       return;
    }
    public final void d(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o0$c.class, "2")) {
          return;
       }
       if (!p0 instanceof DialogFragment) {
          p0 = null;
       }
       this.i(p0);
       return;
    }
    public void i(DialogFragment p0){
    }
    public void j(DialogFragment p0){
    }
}
