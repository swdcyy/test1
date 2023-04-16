package c6a.b$c;
import android.view.View$OnClickListener;
import c6a.b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.popup.common.c;

public final class b$c implements View$OnClickListener	// class@00055e
{
    public final b b;

    public void b$c(b p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, b$c.class, "1")) {
          return;
       }
       b p = this.b.p;
       if (p != null) {
          p.o();
       }
       PatchProxy.onMethodExit(b$c.class, "1");
       return;
    }
}
