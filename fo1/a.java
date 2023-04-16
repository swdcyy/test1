package fo1.a;
import dp3.a;
import android.widget.FrameLayout;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import dp3.g;
import as5.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;

public final class a extends a	// class@002377
{

    public void a(FrameLayout p0){
       a.p(p0, "container");
       super(p0);
    }
    public void a(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
       }else {
          super.a(p0);
       }
       return;
    }
    public void g(int p0){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, a.class, "1")) {
          return;
       }
       ViewGroup view = this.getView();
       a.o(view, "view");
       p0 = (p0 == 1)? 0: 4;
       view.setVisibility(p0);
       return;
    }
}
