package bsa.b$i;
import vn5.e;
import bsa.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class b$i implements e	// class@000459
{
    public final b a;

    public void b$i(b p0){
       this.a = p0;
       super();
    }
    public boolean onClick(){
       Object obj = PatchProxy.apply(null, this, b$i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.X8();
    }
}
