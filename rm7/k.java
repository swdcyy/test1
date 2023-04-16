package rm7.k;
import rm7.a;
import pm7.h;
import java.lang.String;
import pm7.m;
import java.util.Map;
import java.lang.Object;
import com.kwai.robust.Patch;
import java.util.HashMap;

public class k extends a	// class@0023a7
{

    public void k(h p0){
       super(p0, "Robust2PatchDownloadSuccess", true, true);
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
