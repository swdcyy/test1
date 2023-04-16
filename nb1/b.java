package nb1.b;
import nb1.a;
import lp3.a;
import p91.m;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class b extends a implements a	// class@0032cd
{
    public final m d;

    public void b(m p0){
       super();
       this.d = p0;
    }
    public String q5(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.c();
    }
}
