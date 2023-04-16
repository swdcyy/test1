package q90.x$c;
import android.view.View$OnClickListener;
import q90.x;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class x$c implements View$OnClickListener	// class@0029a9
{
    public final x b;

    public void x$c(x p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x$c.class, "1")) {
          return;
       }
       this.b.S8(true, false);
       return;
    }
}
