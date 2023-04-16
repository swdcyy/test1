package rm7.i;
import rm7.a;
import pm7.h;
import java.lang.String;
import pm7.m;
import java.lang.Object;
import rm7.i$a;
import java.util.List;
import java.util.Iterator;
import com.kwai.robust.Patch;
import java.io.File;
import com.kwai.robust2.patchmanager.b;
import java.lang.Exception;
import rm7.l;
import rm7.l$a;
import java.util.Map;
import java.util.ArrayList;
import com.kwai.robust2.patchmanager.model.PatchModel;
import java.util.HashMap;

public class i extends a	// class@0023a5
{

    public void i(h p0){
       super(p0, "Robust2PatchDownloadCompleted", false, false);
    }
    public void e(m p0){
       i$a uoa = this.a();
       if (uoa != null && uoa.a.size() > 0) {
          Iterator iterator = uoa.a.iterator();
          while (iterator.hasNext()) {
             Patch patch = iterator.next();
             if (!patch.isApplyByRealtime()) {
                try{
                   iterator.remove();
                   b.s(this.d.e(), this.d.f(), patch.getId());
                }catch(java.lang.Exception e1){
                   e1.printStackTrace();
                   goto label_0016 ;
                }
             }
          }
       }
       if (uoa != null && (uoa.a.size() > 0 || uoa.b.size() > 0)) {
          a td = this.d;
          td.k(td.d);
          td = this.d;
          l ol = new l(td);
          ol.f(new l$a(uoa.a, uoa.b));
          td.j(ol);
       }else {
          this.d.l();
       }
       return;
    }
    public Map i(){
       Map map = super.i();
       i$a uoa = this.a();
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList();
       if (uoa != null) {
          Iterator iterator = uoa.a.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(iterator.next().getId());
          }
          Iterator iterator1 = uoa.b.iterator();
          while (iterator1.hasNext()) {
             uArrayList1.add(iterator1.next().patchId);
          }
       }
       Map map1 = map;
       map1.put("applyPatchIds", uArrayList);
       map1.put("rollbackPatchIds", uArrayList1);
       return map;
    }
}
