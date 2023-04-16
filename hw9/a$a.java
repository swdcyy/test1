package hw9.a$a;
import java.lang.Object;
import nsd.u;
import hw9.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import hw9.a$b;
import java.util.Objects;

public final class a$a	// class@002717
{

    public void a$a(){
       super();
    }
    public void a$a(u p0){
       super();
    }
    public final a a(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(a$b.b);
       return a$b.a;
    }
}
