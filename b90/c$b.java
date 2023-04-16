package b90.c$b;
import android.content.DialogInterface$OnDismissListener;
import b90.c$c;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lq.i;
import lq.l;

public final class c$b implements DialogInterface$OnDismissListener	// class@000aec
{
    public final c$c b;

    public void c$b(c$c p0){
       this.b = p0;
       super();
    }
    public final void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b.class, "1")) {
          return;
       }
       if (i.h()) {
          i.m().U(this.b);
       }
       return;
    }
}
