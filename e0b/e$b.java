package e0b.e$b;
import android.view.View$OnClickListener;
import e0b.e;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e0b.e$a;

public final class e$b implements View$OnClickListener	// class@0025b6
{
    public final e b;

    public void e$b(e p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$b.class, "1")) {
          return;
       }
       this.b.b().d();
       return;
    }
}
