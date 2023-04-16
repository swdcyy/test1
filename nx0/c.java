package nx0.c;
import android.view.View$OnClickListener;
import nx0.e;
import nx0.y;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import nx0.x$c$a;
import nx0.x$c;
import nx0.x;

public final class c implements View$OnClickListener	// class@0033e8
{
    public final e b;
    public final y c;

    public void c(e p0,y p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, c.class, "1")) {
          return;
       }
       this.b.c.w0(x$c$a.a);
       PatchProxy.onMethodExit(c.class, "1");
       return;
    }
}
