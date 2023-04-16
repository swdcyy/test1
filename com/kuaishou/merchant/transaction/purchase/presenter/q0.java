package com.kuaishou.merchant.transaction.purchase.presenter.q0;
import im8.g;
import kc4.c;
import androidx.fragment.app.Fragment;
import com.kuaishou.merchant.transaction.purchase.presenter.q0$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import vd4.b;
import com.kwai.robust.PatchProxyResult;
import um4.e2;
import java.util.Map;
import java.util.HashMap;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.basic.model.AddressInfo;
import java.lang.Boolean;
import vm4.e;
import kc4.x;

public class q0 extends c implements g	// class@00099b
{
    public c$a A;
    public AddressInfo B;
    public Map C;

    public void q0(Fragment p0){
       super(p0);
       this.A = new q0$a(this);
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, q0.class, "2")) {
          return;
       }
       super.F8();
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, q0.class, "3")) {
          return;
       }
       super.H8();
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, q0.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e2();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, q0.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(q0.class, new e2());
       }else {
          obj.put(q0.class, null);
       }
       return obj;
    }
    public String getTag(){
       return "AddressInteractPresenter";
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, q0.class, "1")) {
          return;
       }
       super.j8();
       this.C = this.t8("page_module_info");
       this.B = this.t8("address_id");
       return;
    }
    public String o9(){
       q0 tB = this.B;
       AddressInfo mIdentifyKey = (tB != null)? tB.mIdentifyKey: null;
       return mIdentifyKey;
    }
    public boolean q9(){
       Object obj = PatchProxy.apply(null, this, q0.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (e.b(this.C, this.B) && x.h(this.B))? true: false;
       return b;
    }
}
