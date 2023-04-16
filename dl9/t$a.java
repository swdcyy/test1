package dl9.t$a;
import erd.g;
import dl9.t;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;

public final class t$a implements g	// class@001f9f
{
    public final t b;

    public void t$a(t p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t$a.class, "1")) {
       }else if(this.b.R8()){
          p0 = this.b;
          t c = p0.C;
          if (c != null) {
             p0.X8(c);
          }
       }
       return;
    }
}
