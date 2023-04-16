package rm7.b;
import rm7.a;
import pm7.h;
import java.lang.String;
import pm7.m;
import java.lang.Object;
import com.kwai.robust.Patch;
import java.io.File;
import com.kwai.robust2.patchmanager.b;
import pm7.e;
import pm7.d;
import pm7.b;
import java.lang.Throwable;
import java.util.Map;
import java.util.HashMap;

public class b extends a	// class@00239d
{

    public void b(h p0){
       super(p0, "Robust2PatchApplyFail", true, false);
    }
    public void b(h p0,String p1){
       super(p0, p1, true, false);
    }
    public void e(m p0){
       if (this.a() == null) {
          return;
       }
       Patch patch = this.a();
       try{
          b.t(this.d.e(), this.d.f(), patch.getId());
       }catch(java.io.IOException e0){
          Object[] objArray = new Object[]{patch.getId()};
          d.b().h(this.b(), e0, "Delete patchId: %s fail", objArray);
       }
       return;
    }
    public Map i(){
       Map map = super.i();
       Patch patch = this.a();
       String id = (patch != null)? patch.getId(): "";
       map.put("patchId", id);
       return map;
    }
}
