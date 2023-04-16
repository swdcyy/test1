package c2c.g$a;
import android.view.View$OnLongClickListener;
import c2c.g;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class g$a implements View$OnLongClickListener	// class@0004ff
{
    public final g b;

    public void g$a(g p0){
       this.b = p0;
       super();
    }
    public final boolean onLongClick(View p0){
       p0 = PatchProxy.applyOneRefs(p0, this, g$a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       this.b.V8();
       return true;
    }
}
