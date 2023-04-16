package ot1.g$d;
import androidx.lifecycle.Observer;
import ot1.g;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import zh3.b;
import zh3.d;
import yh3.a;

public final class g$d implements Observer	// class@003585
{
    public final g b;

    public void g$d(g p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$d.class, "1")) {
       }else if(a.g(p0, Boolean.TRUE)){
          p0 = this.b;
          p0.t0(p0.v0()).q();
       }
       return;
    }
}
