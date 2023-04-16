package mr1.i;
import android.view.View$OnClickListener;
import j83.b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import sq1.f$a;
import nsd.u;
import sq1.f;

public final class i implements View$OnClickListener	// class@0031fa
{
    public final b b;

    public void i(b p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       this.b.g(new f$a(0, 1, null));
       return;
    }
}
