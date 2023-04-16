package com.kwai.framework.krn.init.network.KrnNetworkInterceptor;
import okhttp3.Interceptor;
import java.lang.Object;
import okhttp3.Request;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import y86.a;
import java.lang.reflect.Type;
import okhttp3.HttpUrl;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.lang.CharSequence;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import y86.f;
import okhttp3.Headers;
import com.kwai.framework.krn.init.network.RequestConfig;
import java.util.Map;
import java.util.HashMap;
import okio.b;
import okhttp3.RequestBody;
import okio.c;
import com.google.protobuf.ByteString;
import fg6.a;
import com.kwai.framework.krn.init.network.KrnNetworkInterceptor$a;
import el.a;
import com.google.gson.Gson;
import com.kwai.framework.krn.init.preload.e;
import brd.t;
import njd.a;
import c96.a;
import java.lang.StringBuilder;
import q87.c;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import java.lang.Exception;

public class KrnNetworkInterceptor implements Interceptor	// class@0015e8
{

    public void KrnNetworkInterceptor(){
       super();
    }
    public final boolean a(Request p0){
       a obj = PatchProxy.applyOneRefs(p0, this, KrnNetworkInterceptor.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = a.t().getValue("KDSHookRNBridgeConfig", a.class, null);
       boolean b = false;
       if (obj == null) {
          return b;
       }
       if (obj.isEnabled != 1) {
          return b;
       }
       String str = p0.url().url().toString();
       Iterator iterator = obj.whiteList.iterator();
       while (iterator.hasNext()) {
          if (str.contains(iterator.next())) {
             b = true;
             break ;
          }
       }
       return b;
    }
    public Response intercept(Interceptor$Chain p0){
       int i;
       String str = "content-type";
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Request obj = PatchProxy.applyOneRefs(p0, this, KrnNetworkInterceptor.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = p0.request();
       try{
          i = 0;
          if (!this.a(obj)) {
             return p0.proceed(obj);
          }else {
             f uof = new f(p0);
             Headers headers = obj.headers();
             str = (headers.get(str) != null)? headers.get(str): "application/json;charset=utf-8";
             RequestConfig requestConfi = new RequestConfig();
             requestConfi.setUrl(obj.url().url().toString());
             requestConfi.setMethod(obj.method());
             requestConfi.setBusinessName(null);
             HashMap hashMap = PatchProxy.applyOneRefs(headers, uof, f.class, "2");
             if (hashMap != patchProxyRe) {
             }else {
                hashMap = new HashMap();
                for (int i1 = 0; i1 < headers.size(); i1 = i1 + 1) {
                   hashMap.put(headers.name(i1), headers.value(i1));
                }
             }
             requestConfi.setHeaders(hashMap);
             b uob = new b();
             if (obj.body() != null) {
                obj.body().writeTo(uob);
             }
             requestConfi.setParams(a.a.i(ByteString.copyFrom(uob.readByteArray()).toStringUtf8(), new KrnNetworkInterceptor$a(this).getType()));
             requestConfi.setIsAddCommonParameters(1);
             t ot = e.b().n(requestConfi);
             if (ot != null) {
                a uoa = ot.blockingSingle();
                Object[] objArray1 = new Object[i];
                a.D().w("KrnNetwork", "krn network intercept ÃüÖÐÔ¤À­È¡:"+requestConfi.getUrl(), objArray1);
                if (uoa != null) {
                   return uof.a(obj, ResponseBody.create(MediaType.parse(str), uoa.a()));
                }
             }
          }
       }catch(java.lang.Exception e0){
          Object[] objArray = new Object[i];
          a.D().t("KrnNetwork", "krn fetchÍøÂç¿âÇëÇóÀ¹½ØÒì³£: "+e0.toString(), objArray);
       }
       return p0.proceed(obj);
    }
}
