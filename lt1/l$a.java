package lt1.l$a;
import android.view.View$OnClickListener;
import java.lang.String;
import lt1.l;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ps1.e;
import zs1.b;
import du1.d;

public final class l$a implements View$OnClickListener	// class@003033
{
    public final String b;
    public final l c;

    public void l$a(String p0,l p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, l$a.class, "1")) {
          return;
       }
       this.c.w.k().T(this.b);
       PatchProxy.onMethodExit(l$a.class, "1");
       return;
    }
}
