package dl9.u$j;
import android.view.View$OnClickListener;
import dl9.u;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.popup.common.c;

public final class u$j implements View$OnClickListener	// class@001fb4
{
    public final u b;

    public void u$j(u p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u$j.class, "1")) {
          return;
       }
       u g = this.b.G;
       if (g != null) {
          g.o();
       }
       return;
    }
}
