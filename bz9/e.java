package bz9.e;
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

public final class e implements DialogInterface$OnCancelListener	// class@00052e
{
    public final h b;

    public void e(h p0){
       this.b = p0;
       super();
    }
    public final void onCancel(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, e.class, "1")) {
          return;
       }
       this.b.c(true);
       this.b.a().k0.onNext(Boolean.FALSE);
       PatchProxy.onMethodExit(e.class, "1");
       return;
    }
}
