package djc.c0$b;
import erd.g;
import djc.c0;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.KwaiDialogFragment;

public final class c0$b implements g	// class@0021d6
{
    public final c0 b;

    public void c0$b(c0 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c0$b.class, "1")) {
       }else {
          p0 = this.b.f;
          int i = (p0.getFragmentManager() != null)? 1: 0;
          if (!i) {
             p0 = null;
          }
          if (p0 != null) {
             p0.dismissAllowingStateLoss();
          }
       }
       return;
    }
}
