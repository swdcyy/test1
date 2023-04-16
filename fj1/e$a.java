package fj1.e$a;
import android.content.DialogInterface$OnCancelListener;
import fj1.e;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import aj1.a;
import cj1.b;

public final class e$a implements DialogInterface$OnCancelListener	// class@002358
{
    public final e b;

    public void e$a(e p0){
       this.b = p0;
       super();
    }
    public final void onCancel(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "1")) {
          return;
       }
       this.b.Z2().a(this.b.Y2(), 5);
       return;
    }
}
