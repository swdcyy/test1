package co5.i;
import co5.i$a;
import java.lang.Object;
import co5.i$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class i	// class@000718
{
    public final boolean a;
    public final i$a b;

    public void i(boolean p0,i$a p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public static i$b a(){
       Object obj = PatchProxy.apply(null, null, i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new i$b();
    }
}
