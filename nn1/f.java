package nn1.f;
import android.view.View$OnClickListener;
import nn1.g;
import nn1.h;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import nn1.a$a$a;
import nn1.a$a;
import nn1.a;

public final class f implements View$OnClickListener	// class@003381
{
    public final g b;
    public final h c;

    public void f(g p0,h p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       this.c.u0(new a$a$a(this.b.e));
       return;
    }
}
