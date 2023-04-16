package ev2.n$b;
import android.content.DialogInterface$OnDismissListener;
import ev2.n;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ev2.l;

public final class n$b implements DialogInterface$OnDismissListener	// class@002805
{
    public final n b;

    public void n$b(n p0){
       this.b = p0;
       super();
    }
    public final void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n$b.class, "1")) {
          return;
       }
       n g = this.b.g;
       if (g != null) {
          g.onDismiss();
       }
       return;
    }
}
