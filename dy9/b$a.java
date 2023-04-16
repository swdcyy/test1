package dy9.b$a;
import erd.g;
import dy9.b;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class b$a implements g	// class@001ff6
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, b$a.class, "1")) {
       }else {
          this.b.n0();
          PatchProxy.onMethodExit(b$a.class, "1");
       }
       return;
    }
}
