package bsa.b$d;
import android.view.View$OnClickListener;
import bsa.b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class b$d implements View$OnClickListener	// class@000454
{
    public final b b;

    public void b$d(b p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$d.class, "1")) {
          return;
       }
       if (!p0.hasTransientState()) {
          this.b.W8(true);
       }
       return;
    }
}
