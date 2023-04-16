package e0b.g;
import android.view.View$OnClickListener;
import e0b.f;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import xza.a;
import e0b.f$a;

public final class g implements View$OnClickListener	// class@0025c3
{
    public final f b;
    public final int c;

    public void g(f p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, g.class, "1")) {
          return;
       }
       g tb = this.b;
       f e = tb.e;
       if (e != null) {
          e.a(tb.g.get(this.c));
       }
       PatchProxy.onMethodExit(g.class, "1");
       return;
    }
}
