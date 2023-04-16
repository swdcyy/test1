package t96.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class a	// class@002480
{
    public boolean a;
    public long b;

    public void a(){
       super();
       this.a = false;
       this.b = 0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "isHavePermission="+this.a+", mLastShowTime="+this.b;
    }
}
