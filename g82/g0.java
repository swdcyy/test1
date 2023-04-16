package g82.g0;
import android.view.View$OnClickListener;
import g82.v$g;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mg1.a;
import g82.v;

public class g0 implements View$OnClickListener	// class@002a9e
{
    public final v$g b;

    public void g0(v$g p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g0.class, "1")) {
          return;
       }
       this.b.c.x9("", null);
       return;
    }
}
