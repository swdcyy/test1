package nmd.b;
import android.view.View$OnClickListener;
import nmd.a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import nmd.a$b;

public final class b implements View$OnClickListener	// class@001e4d
{
    public final a b;

    public void b(a p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       a b;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       b = this.b.b;
       if (b != null) {
          b.onCloseIconClicked();
       }
       return;
    }
}
