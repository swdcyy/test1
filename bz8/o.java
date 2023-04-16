package bz8.o;
import im8.g;
import androidx.lifecycle.ViewModel;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import bz8.s;
import java.util.Map;
import java.util.HashMap;

public final class o extends ViewModel implements g	// class@0004a2
{
    public QPhoto b;
    public o c;

    public void o(){
       super();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new s();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, o.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(o.class, new s());
       }else {
          obj.put(o.class, null);
       }
       return obj;
    }
}
