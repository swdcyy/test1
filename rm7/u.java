package rm7.u;
import rm7.a;
import pm7.h;
import java.lang.String;
import pm7.m;
import java.util.Map;
import java.lang.Object;
import com.kwai.robust2.patchmanager.model.PatchModel;
import java.util.HashMap;

public class u extends a	// class@0023b2
{

    public void u(h p0){
       super(p0, "Robust2PatchRollbackFail", true, false);
    }
    public void e(m p0){
    }
    public Map i(){
       String str;
       Map map = super.i();
       PatchModel patchModel = this.a();
       patchModel = (patchModel != null)? patchModel.patchId: "";
       map.put("patchId", patchModel);
       return map;
    }
}
