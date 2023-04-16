package dfa.a;
import dfa.b;
import java.lang.Object;
import java.io.Serializable;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import dfa.b$a;

public final class a implements b	// class@00249a
{

    public void a(){
       super();
    }
    public Serializable a(Serializable p0){
       return p0;
    }
    public String getName(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b$a.a(this);
    }
}
