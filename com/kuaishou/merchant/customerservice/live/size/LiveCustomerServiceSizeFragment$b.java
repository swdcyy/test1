package com.kuaishou.merchant.customerservice.live.size.LiveCustomerServiceSizeFragment$b;
import im8.g;
import java.lang.Object;
import uv3.e;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.customerservice.live.size.m;
import java.util.Map;
import java.util.HashMap;

public class LiveCustomerServiceSizeFragment$b implements g	// class@001672
{
    public LiveMerchantBaseContext b;
    public k0 c;
    public CustomerServiceSize d;
    public LiveCustomerServiceSizeFragment e;
    public e f;
    public String g;
    public String h;
    public String i;

    public void LiveCustomerServiceSizeFragment$b(){
       super();
       this.f = new e();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveCustomerServiceSizeFragment$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new m();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, LiveCustomerServiceSizeFragment$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(LiveCustomerServiceSizeFragment$b.class, new m());
       }else {
          obj.put(LiveCustomerServiceSizeFragment$b.class, null);
       }
       return obj;
    }
}
