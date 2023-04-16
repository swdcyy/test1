package com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.e;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.e$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import nk4.q;
import java.util.Map;
import java.util.HashMap;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse;

public class e extends PresenterV2 implements g	// class@00081d
{
    public b p;
    public MerchantLivePurchasePanelResponse q;
    public String r;

    public void e(){
       super();
       this.p = new e$a(this);
       this.r = "";
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new q();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(e.class, new q());
       }else {
          obj.put(e.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.q = this.q8(MerchantLivePurchasePanelResponse.class);
       this.r = this.r8("ID_PAGE_IDENTIFY_KEY");
       return;
    }
}
