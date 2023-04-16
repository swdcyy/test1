package c9c.d;
import y8c.q;
import lnc.g2;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import y8c.a;
import hka.l;
import android.view.View;
import com.kwai.library.widget.refresh.RefreshLayout;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.List;

public class d	// class@000563
{
    public final g2 a;
    public final Fragment b;
    public final RefreshLayout c;
    public final q d;
    public final l e;

    public void d(q p0,g2 p1){
       super();
       Fragment uFragment = p0.g0();
       this.b = uFragment;
       this.d = p0;
       this.e = p0;
       this.a = p1;
       this.c = uFragment.getView().findViewById(0x7f0a3537);
    }
    public RefreshLayout a(){
       return this.c;
    }
    public void b(){
       d uod = d.class;
       if (PatchProxy.applyVoid(null, this, uod, "2")) {
          return;
       }
       if (PatchProxy.isSupport(uod) && (!PatchProxy.applyVoidOneRefs(Boolean.FALSE, this, uod, "3") && (this.a != null && this.b.getView() != null))) {
          this.a.b(this.d.fg());
       }
    label_0034 :
       return;
    }
}
