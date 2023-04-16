package com.kwai.framework.kxb.plugins.KwaiUpdateApiService;
import lu6.a;
import java.lang.Object;
import com.kwai.framework.kxb.plugins.KwaiUpdateApiService$mApiService$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.util.Map;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import mu6.d;
import brd.a0;
import lu6.a$a;
import com.kwai.kxb.Kxb;
import com.google.gson.Gson;
import com.kwai.kxb.Kxb$a;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.lang.Iterable;

public final class KwaiUpdateApiService implements a	// class@001626
{
    public final p a;

    public void KwaiUpdateApiService(){
       super();
       this.a = s.c(new KwaiUpdateApiService$mApiService$2(this));
    }
    public t a(Map p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       KwaiUpdateApiService kwaiUpdateAp = KwaiUpdateApiService.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, kwaiUpdateAp, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "request");
       Object obj1 = PatchProxy.apply(null, this, kwaiUpdateAp, "1");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = this.a.getValue();
       }
       return obj1.a(p0);
    }
    public a0 b(d p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyOneRefs(p0, this, KwaiUpdateApiService.class, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = "request";
       a.p(p0, obj);
       a0 uoa0 = PatchProxy.applyTwoRefs(this, p0, null, a$a.class, "1");
       if (uoa0 != patchProxyRe) {
       }else {
          a.p(p0, obj);
          JsonElement jsonElement = Kxb.b.a().x(p0.a());
          a.o(jsonElement, "Kxb.gson.toJsonTree\(request.data\)");
          JsonObject jsonObject = jsonElement.r();
          HashMap hashMap = new HashMap();
          Set set = jsonObject.w0();
          a.o(set, "jsonObject.keySet\(\)");
          Iterator iterator = set.iterator();
          while (iterator.hasNext()) {
             String str = iterator.next();
             a.o(str, "key");
             String str1 = jsonObject.e0(str).toString();
             a.o(str1, "jsonObject[key].toString\(\)");
             hashMap.put(str, str1);
          }
          hashMap.put("requestMode", String.valueOf(p0.requestMode));
          hashMap.put("lowDisk", String.valueOf(p0.b));
          uoa0 = this.a(hashMap).firstOrError();
          a.o(uoa0, "update\(encodeMap\)\n        .firstOrError\(\)");
       }
       return uoa0;
    }
}
