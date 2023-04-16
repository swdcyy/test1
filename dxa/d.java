package dxa.d;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class d	// class@0025a3
{
    public int a;
    public String b;

    public void d(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "{targetType="+this.a+", targetId="+this.b+", }";
    }
}
