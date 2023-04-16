package au1.c$a;
import yt1.a;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import java.lang.Integer;
import java.lang.Boolean;
import au1.c$c;

public class c$a implements a	// class@0002b4
{

    public void c$a(){
       super();
    }
    public Map a(){
       HashMap obj = PatchProxy.apply(null, this, c$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       Boolean tRUE = Boolean.TRUE;
       obj.put(Integer.valueOf(3), tRUE);
       obj.put(Integer.valueOf(1), tRUE);
       obj.put(Integer.valueOf(2), tRUE);
       return obj;
    }
    public int getPriority(){
       return c$c.c;
    }
}
