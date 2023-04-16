package cx8.a$b$a;
import erd.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import jq.a;

public final class a$b$a implements f	// class@002008
{
    public static final a$b$a a;

    static {
       a$b$a.a = new a$b$a();
    }
    public void a$b$a(){
       super();
    }
    public final void cancel(){
       if (PatchProxy.applyVoid(null, this, a$b$a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.c("LocationAPI", "locationSearchNew setCancellable\(\) recommend", objArray);
       return;
    }
}
