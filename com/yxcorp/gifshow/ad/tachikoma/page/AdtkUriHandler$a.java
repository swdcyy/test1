package com.yxcorp.gifshow.ad.tachikoma.page.AdtkUriHandler$a;
import java.lang.Object;
import nsd.u;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import p49.d;
import com.google.gson.JsonObject;
import java.lang.Number;
import x49.h;

public final class AdtkUriHandler$a	// class@001846
{

    public void AdtkUriHandler$a(){
       super();
    }
    public void AdtkUriHandler$a(u p0){
       super();
    }
    public final void a(String p0,int p1){
       AdtkUriHandler$a uoa = AdtkUriHandler$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("templateId", p0);
       jsonObject.a0("result", Integer.valueOf(p1));
       h.c("ad_tk_page_enter", jsonObject, null, null, d.c.a("ad_tk_page_enter", 0x3f800000), null, 44, null);
       return;
    }
}
