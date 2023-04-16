package bz9.f;
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

public final class f implements DialogInterface$OnDismissListener	// class@00052f
{
    public final h b;

    public void f(h p0){
       this.b = p0;
       super();
    }
    public final void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, f.class, "1")) {
          return;
       }
       this.b.c(true);
       this.b.a().k0.onNext(Boolean.FALSE);
       PatchProxy.onMethodExit(f.class, "1");
       return;
    }
}
