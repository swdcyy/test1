package rm7.t;
import rm7.a;
import pm7.h;
import java.lang.String;
import pm7.m;
import rm7.h;
import java.lang.Object;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Iterator;
import com.kwai.robust2.patchmanager.model.PatchModel;
import java.util.HashMap;

public class t extends a	// class@0023b1
{

    public void t(h p0){
       super(p0, "Robust2PatchQuerySuccess", true, false);
    }
    public void e(m p0){
       a td = this.d;
       td.k(td.c);
       td = this.d;
       h oh = new h(td);
       oh.f(this.a());
       td.j(oh);
    }
    public Map i(){
       Map map = super.i();
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList();
       List list = this.a();
       if (list != null) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             PatchModel patchModel = iterator.next();
             if (patchModel.isRollback != null) {
                uArrayList1.add(patchModel.patchId);
             }else {
                uArrayList.add(patchModel.patchId);
             }
          }
       }
       Map map1 = map;
       map1.put("applyPatchIds", uArrayList);
       map1.put("rollbackPatchIds", uArrayList1);
       return map;
    }
}
