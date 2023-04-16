package com.yxcorp.gateway.pay.response.PayAuthParamResponse;
import com.yxcorp.gateway.pay.response.GatewayPayBaseResponse;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.TextUtils;
import java.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import lv8.c;
import java.util.Set;
import java.util.Iterator;
import java.lang.StringBuilder;
import java.util.Map$Entry;

public class PayAuthParamResponse extends GatewayPayBaseResponse	// class@00126e
{
    public Map mAuthParams;

    public void PayAuthParamResponse(){
       super();
    }
    public final String a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PayAuthParamResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          p0 = URLEncoder.encode(TextUtils.k(p0), "UTF-8");
       }catch(java.io.UnsupportedEncodingException e0){
          e0.printStackTrace();
       }
       return p0;
    }
    public String getAuthParamsStr(){
       Iterator obj = PatchProxy.apply(null, this, PayAuthParamResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (c.k(this.mAuthParams)) {
          return "";
       }
       obj = this.mAuthParams.entrySet().iterator();
       StringBuilder str = "";
       while (obj.hasNext()) {
          Map$Entry uEntry = obj.next();
          str = str+this.a(uEntry.getKey())+"="+this.a(uEntry.getValue());
          if (obj.hasNext()) {
             str = str+"&";
          }
       }
       return str;
    }
    public String getParam(String p0){
       PayAuthParamResponse obj = PatchProxy.applyOneRefs(p0, this, PayAuthParamResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mAuthParams;
       if (obj != null && obj.containsKey(p0)) {
          return this.mAuthParams.get(p0);
       }
       return null;
    }
}
