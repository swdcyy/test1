package com.kuaishou.merchant.transaction.purchase.presenter.q0$b;
import kc4.c$b;
import em4.a;
import com.kuaishou.merchant.basic.model.AddressInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.google.gson.JsonObject;
import kc4.x;
import java.lang.Long;
import java.lang.Number;

public class q0$b implements c$b	// class@00099a
{
    public a a;
    public AddressInfo b;

    public void q0$b(a p0,AddressInfo p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void a(AddressInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q0$b.class, "1")) {
          return;
       }
       JsonObject jsonObject = new JsonObject();
       jsonObject.a0("addressId", Long.valueOf(x.e(p0, this.b)));
       this.a.e5(100, jsonObject);
       return;
    }
}
