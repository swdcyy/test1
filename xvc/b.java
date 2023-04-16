package xvc.b;
import tvc.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public class b extends a	// class@0043ec
{
    public int actionCode;

    public void b(){
       super();
    }
    public final int getActionCode(){
       return this.actionCode;
    }
    public final void setActionCode(int p0){
       this.actionCode = p0;
    }
    public String toJson(){
       return "";
    }
    public String toString(){
       String obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getClass().getName();
       a.o(obj, "javaClass.name");
       return obj;
    }
}
