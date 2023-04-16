package nd6.q;
import yi7.a;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import nd6.q$a;
import java.lang.Runnable;
import t45.c;

public final class q implements a	// class@001f3e
{

    public void q(){
       super();
    }
    public void a(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "1")) {
          return;
       }
       a.p(p0, "err");
       c.a(new q$a(p0));
       return;
    }
}
