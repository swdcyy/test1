package bz9.d;
import android.content.DialogInterface$OnDismissListener;
import bz9.h;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import v6a.m0;
import java.lang.Boolean;
import brd.y;

public final class d implements DialogInterface$OnDismissListener	// class@00052d
{
    public final h b;

    public void d(h p0){
       this.b = p0;
       super();
    }
    public final void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, d.class, "1")) {
          return;
       }
       this.b.c(true);
       this.b.a().k0.onNext(Boolean.FALSE);
       PatchProxy.onMethodExit(d.class, "1");
       return;
    }
}
