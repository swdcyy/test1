package bz9.g;
import android.content.DialogInterface$OnCancelListener;
import bz9.h;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import v6a.m0;
import java.lang.Boolean;
import brd.y;

public final class g implements DialogInterface$OnCancelListener	// class@000530
{
    public final h b;

    public void g(h p0){
       this.b = p0;
       super();
    }
    public final void onCancel(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, g.class, "1")) {
          return;
       }
       this.b.c(true);
       this.b.a().k0.onNext(Boolean.FALSE);
       PatchProxy.onMethodExit(g.class, "1");
       return;
    }
}
