package com.kuaishou.merchant.transaction.purchase.presenter.c0;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.transaction.purchase.presenter.c0$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import um4.y0;
import java.util.Map;
import java.util.HashMap;
import em4.a;
import com.kuaishou.merchant.basic.model.AddressInfo;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.UpgradeAddressGuideModel;
import kc4.c$a;

public class c0 extends PresenterV2 implements g	// class@000969
{
    public UpgradeAddressGuideModel p;
    public f q;
    public int r;
    public c$a s;
    public a t;
    public AddressInfo u;
    public boolean v;

    public void c0(){
       super();
       this.q = new c0$a(this);
       this.r = 6005;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new y0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, c0.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(c0.class, new y0());
       }else {
          obj.put(c0.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c0.class, "1")) {
          return;
       }
       this.t = this.q8(a.class);
       this.u = this.t8("address_id");
       this.p = this.t8("upgrade_address_info");
       this.s = this.r8("address_service");
       return;
    }
}
