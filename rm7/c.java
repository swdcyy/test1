package rm7.c;
import rm7.a;
import pm7.h;
import java.lang.String;
import pm7.m;
import java.util.Map;
import java.lang.Object;
import com.kwai.robust.Patch;
import java.util.HashMap;

public class c extends a	// class@00239e
{

    public void c(h p0){
       super(p0, "Robust2PatchApplySuccess", true, true);
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
