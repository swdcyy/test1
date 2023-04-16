package lt1.g$a;
import android.view.View$OnClickListener;
import java.lang.String;
import lt1.g;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ps1.e;
import zs1.b;
import du1.d;

public final class g$a implements View$OnClickListener	// class@003029
{
    public final String b;
    public final g c;

    public void g$a(String p0,g p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, g$a.class, "1")) {
          return;
       }
       this.c.x.k().T(this.b);
       PatchProxy.onMethodExit(g$a.class, "1");
       return;
    }
}
