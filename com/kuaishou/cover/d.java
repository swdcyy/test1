package com.kuaishou.cover.d;
import cb4.e;
import java.lang.Object;
import java.lang.String;
import cb4.d;
import com.kuaishou.merchant.router.base.RouterRequest;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import android.net.Uri;
import com.kuaishou.merchant.router.RouterConfig;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import ekd.x0;
import com.kwai.sdk.switchconfig.a;
import g30.c;
import java.lang.Long;
import java.lang.Exception;
import java.lang.StringBuilder;
import d30.c;
import com.kuaishou.cover.c$a;
import com.kuaishou.cover.d$a;
import a30.b;
import com.kuaishou.cover.c;
import com.kuaishou.cover.Link;
import ev.b;
import com.kuaishou.cover.d$b;

public class d implements e	// class@0016df
{
    public String a;

    public void d(){
       super();
    }
    public void d(String p0){
       super();
       this.a = p0;
    }
    public boolean a(){
       return d.a(this);
    }
    public boolean b(RouterRequest p0){
       String str1;
       c$a uoa;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       Uri obj = PatchProxy.applyOneRefs(p0, this, uod, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       Uri uri = p0.d();
       RouterConfig routerConfig = p0.c();
       uri.getHost();
       String queryParamet = uri.getQueryParameter("renderUrl");
       if (TextUtils.isEmpty(queryParamet)) {
          return b;
       }
       obj = Uri.parse(queryParamet);
       HashMap hashMap = new HashMap();
       if (routerConfig != null) {
          hashMap.putAll(routerConfig.c());
       }
       Iterator iterator = obj.getQueryParameterNames().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          if (!TextUtils.isEmpty(str)) {
             hashMap.put(str, x0.a(obj, str));
          }
       }
       long l = -11;
       if (a.t().d("useLinkGenerateId", true)) {
          l = c.a();
       }
       String queryParamet1 = obj.getQueryParameter("materialId");
       if (!TextUtils.isEmpty(queryParamet1)) {
          try{
             l = Long.parseLong(queryParamet1);
          }catch(java.lang.Exception e10){
             e10.printStackTrace();
          }
       }
    }
    public String getName(){
       return d.b(this);
    }
}
