package cfa.a;
import cfa.b;
import java.lang.Object;
import java.io.Serializable;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import cfa.b$a;

public final class a implements b	// class@0004f3
{

    public void a(){
       super();
    }
    public Serializable a(Serializable p0,Serializable p1){
       return p1;
    }
    public String getName(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b$a.a(this);
    }
}
