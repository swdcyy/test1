package nn1.l;
import android.view.View$OnClickListener;
import nn1.m;
import nn1.n;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import nn1.a$a$a;
import nn1.a$a;
import nn1.a;

public final class l implements View$OnClickListener	// class@00338b
{
    public final m b;
    public final n c;

    public void l(m p0,n p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "1")) {
          return;
       }
       this.c.u0(new a$a$a(this.b.d));
       return;
    }
}
