package rm7.g;
import rm7.a;
import pm7.h;
import java.lang.String;
import pm7.m;
import java.util.Map;
import java.lang.Object;
import com.kwai.robust.Patch;
import java.util.HashMap;

public class g extends a	// class@0023a2
{

    public void g(h p0,boolean p1){
       super(p0, "Robust2PatchColdLoadSuccess", true, p1);
    }
    public void e(m p0){
    }
    public Map i(){
       Map map = super.i();
       Patch patch = this.a();
       String id = (patch != null)? patch.getId(): "";
       map.put("patchId", id);
       return map;
    }
}