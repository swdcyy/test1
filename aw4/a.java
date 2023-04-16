package aw4.a;
import java.lang.Object;
import java.util.HashMap;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Map;

public class a	// class@000311
{
    public Map a;

    public void a(){
       super();
       this.a = new HashMap();
    }
    public void a(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       this.a.put(p0, p1);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       this.a.clear();
       return;
    }
}
