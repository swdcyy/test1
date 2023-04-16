package g93.c;
import android.view.View$OnClickListener;
import g93.g;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import f93.b;

public final class c implements View$OnClickListener	// class@002ad5
{
    public final g b;

    public void c(g p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, c.class, "1")) {
          return;
       }
       this.b.l.dismiss();
       PatchProxy.onMethodExit(c.class, "1");
       return;
    }
}
