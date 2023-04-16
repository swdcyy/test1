package dn1.f;
import android.view.View$OnClickListener;
import dn1.g;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dn1.g$a$b;
import dn1.g$a;

public final class f implements View$OnClickListener	// class@001fd0
{
    public final g b;

    public void f(g p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       this.b.v0(g$a$b.a);
       return;
    }
}
