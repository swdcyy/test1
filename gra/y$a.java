package gra.y$a;
import android.view.View$OnClickListener;
import gra.y;
import java.lang.String;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class y$a implements View$OnClickListener	// class@002bcf
{
    public final y b;
    public final String c;

    public void y$a(y p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, y$a.class, "1")) {
          return;
       }
       this.b.j6();
       PatchProxy.onMethodExit(y$a.class, "1");
       return;
    }
}
