package au3.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.KwaiDialogFragment;

public class f	// class@0002cc
{
    public KwaiDialogFragment a;

    public void f(){
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, f.class, "8")) {
          return;
       }
       f ta = this.a;
       if (ta != null) {
          ta.dismissAllowingStateLoss();
       }
       return;
    }
}
