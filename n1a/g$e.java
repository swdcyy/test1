package n1a.g$e;
import z17.b;
import n1a.g;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import android.widget.EditText;

public class g$e implements b	// class@0030bc
{
    public final g a;

    public void g$e(g p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0){
       g$e uoe = g$e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe, "1")) {
          return;
       }
       this.a.r.setCursorVisible(p0);
       return;
    }
    public void b(int p0){
    }
    public int getHeight(){
       return 0;
    }
}
