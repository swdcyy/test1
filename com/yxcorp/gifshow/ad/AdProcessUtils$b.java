package com.yxcorp.gifshow.ad.AdProcessUtils$b;
import p49.a;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import java.lang.String;
import java.lang.Object;
import q35.c$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import q35.b;
import q35.d;
import com.kwai.adclient.kscommerciallogger.model.BusinessType;
import com.google.gson.JsonObject;
import o49.g;
import com.kwai.framework.model.feed.BaseFeed;
import mxb.c;
import qrd.l1;

public final class AdProcessUtils$b implements a	// class@0014ec
{
    public final AdDataWrapper a;
    public final String b;

    public void AdProcessUtils$b(AdDataWrapper p0,String p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void a(c$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdProcessUtils$b.class, "1")) {
          return;
       }
       p0.i(b.n);
       p0.d(BusinessType.OTHER);
       p0.h("deep_link");
       JsonObject jsonObject = new JsonObject();
       g.b(g.a, this.a.getPhoto(), jsonObject, 0, 0, 12, null);
       jsonObject.c0("origin_url", c.i(this.a.getPhoto()));
       jsonObject.c0("main_url", this.b);
       p0.f(jsonObject);
       return;
    }
}
