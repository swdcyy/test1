package com.kuaishou.merchant.transaction.purchase.presenter.l0;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.transaction.purchase.presenter.l0$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import um4.u1;
import java.util.Map;
import java.util.HashMap;
import com.kuaishou.merchant.transaction.purchase.model.PoiInfo;

public class l0 extends PresenterV2 implements g	// class@00098b
{
    public l0$b p;
    public Map q;
    public PoiInfo r;

    public void l0(){
       super();
       this.p = new l0$a(this);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new u1();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, l0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(l0.class, new u1());
       }else {
          obj.put(l0.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, l0.class, "1")) {
          return;
       }
       this.q = this.t8("page_module_info");
       this.r = this.t8("poi_info");
       return;
    }
}
