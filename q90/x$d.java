package q90.x$d;
import android.view.View$OnClickListener;
import q90.x;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class x$d implements View$OnClickListener	// class@0029aa
{
    public final x b;

    public void x$d(x p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x$d.class, "1")) {
          return;
       }
       this.b.S8(false, false);
       return;
    }
}