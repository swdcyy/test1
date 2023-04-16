package g93.g$a;
import android.view.View$OnClickListener;
import g93.g;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class g$a implements View$OnClickListener	// class@002ada
{
    public final g b;

    public void g$a(g p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a.class, "1")) {
          return;
       }
       this.b.W2();
       return;
    }
}
