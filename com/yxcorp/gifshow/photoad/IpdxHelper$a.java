package com.yxcorp.gifshow.photoad.IpdxHelper$a;
import p49.a;
import java.lang.String;
import java.lang.Object;
import q35.c$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.google.gson.JsonObject;
import java.lang.Integer;
import java.lang.Number;
import com.kwai.adclient.kscommerciallogger.model.BusinessType;
import com.kwai.adclient.kscommerciallogger.model.SubBusinessType;

public final class IpdxHelper$a implements a	// class@000f5a
{
    public final int a;
    public final String b;
    public final String c;

    public void IpdxHelper$a(int p0,String p1,String p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public final void a(c$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IpdxHelper$a.class, "1")) {
          return;
       }
       JsonObject jsonObject = new JsonObject();
       jsonObject.a0("status", Integer.valueOf(this.a));
       jsonObject.c0("ipdx_ip", this.b);
       IpdxHelper$a tc = this.c;
       if (tc != null) {
          jsonObject.c0("error_msg", tc);
       }
       p0.d(BusinessType.OTHER);
       p0.g(SubBusinessType.OTHER);
       p0.h("IpdxHelper");
       p0.f(jsonObject);
       return;
    }
}
