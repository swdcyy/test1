package g82.v$d;
import vq5.b;
import g82.v;
import java.lang.Object;
import android.net.Uri;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kg1.g;

public class v$d implements b	// class@002abd
{
    public final v a;

    public void v$d(v p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       return true;
    }
    public void b(Uri p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v$d.class, "1")) {
          return;
       }
       if (!this.a.b1.Gl() || this.a.R8()) {
          this.a.Y0 = p0;
       }else {
          this.a.s9(p0);
       }
       return;
    }
}
