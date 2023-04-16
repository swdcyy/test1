package be8.t;
import java.lang.Object;
import java.lang.Number;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;

public class t	// class@000341
{

    public void t(){
       super();
    }
    public static Number a(Number p0){
       Integer integer;
       Object obj = PatchProxy.applyOneRefs(p0, null, t.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.doubleValue() - 0x408f400000000000 < 0) {
          integer = Integer.valueOf(0x3a98);
       }
       return integer;
    }
}
