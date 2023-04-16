package nfd.i2;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import im8.c;

public class i2	// class@001db9
{
    public ArrayList a;

    public void i2(){
       super();
       this.a = new ArrayList();
    }
    public static i2 c(){
       Object obj = PatchProxy.apply(null, null, i2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new i2();
    }
    public i2 a(String p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, i2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a.add(new c(p0, p1));
       return this;
    }
    public ArrayList b(){
       return this.a;
    }
}
