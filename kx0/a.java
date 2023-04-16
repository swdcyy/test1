package kx0.a;
import java.lang.Object;
import java.util.HashSet;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class a	// class@002e10
{
    public boolean a;
    public final HashSet b;
    public int c;
    public int d;

    public void a(){
       super();
       this.b = new HashSet();
       this.d = 10;
    }
    public final boolean a(Integer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && p0.intValue() == 9)? true: false;
       return b;
    }
}
