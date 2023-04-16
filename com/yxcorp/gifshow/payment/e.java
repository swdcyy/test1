package com.yxcorp.gifshow.payment.e;
import ok.x;
import java.lang.Object;
import dwb.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.kwai.sdk.switchconfig.a;
import io7.f;
import com.google.gson.JsonElement;
import dwb.j;
import java.lang.StringBuilder;
import q87.c;
import fg6.a;
import com.yxcorp.gifshow.payment.GatewayPayInitParams$1;
import java.lang.reflect.Type;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import java.lang.Throwable;

public final class e implements x	// class@000e43
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final Object get(){
       int i;
       Object[] objArray1;
       Object[] objArray = null;
       f obj = PatchProxy.apply(objArray, objArray, i.class, "1");
       if (obj != PatchProxyResult.class) {
          objArray = obj;
       }else {
          obj = a.t().f("kspayCookieForceRootHosts");
          i = 0;
          if (obj == null || obj.c() == null) {
             objArray1 = new Object[i];
             j.C().w("GatewayPayInitParams", "empty kspayCookieForceRootHosts", objArray1);
          }else {
             try{
                objArray1 = new Object[i];
                j.C().w("GatewayPayInitParams", "kspayCookieForceRootHosts result:"+obj.c().toString(), objArray1);
                objArray = a.a.d(obj.c(), new GatewayPayInitParams$1().getType());
             }catch(java.lang.Exception e2){
                j.C().e("GatewayPayInitParams", "kspayCookieForceRootHosts jsonString convert to list error, jsonString:"+obj.c().toString(), e2);
             }
          }
       }
    }
}
