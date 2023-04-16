package nmd.c;
import android.view.View$OnClickListener;
import nmd.a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import nmd.a$b;

public final class c implements View$OnClickListener	// class@001e4f
{
    public final a b;

    public void c(a p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       a b = this.b.b;
       if (b != null) {
          b.a();
       }
       return;
    }
}
