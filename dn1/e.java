package dn1.e;
import android.view.View$OnClickListener;
import dn1.g;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dn1.g$a$a;
import dn1.g$a;

public final class e implements View$OnClickListener	// class@001fcf
{
    public final g b;

    public void e(g p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       this.b.v0(g$a$a.a);
       return;
    }
}
