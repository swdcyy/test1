package com.yxcorp.gifshow.longinus.LonginusInitModule$a;
import java.lang.Object;
import nsd.u;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import io7.f;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import zk.g;
import java.lang.Boolean;

public final class LonginusInitModule$a	// class@001b69
{

    public void LonginusInitModule$a(){
       super();
    }
    public void LonginusInitModule$a(u p0){
       super();
    }
    public final String a(){
       Object[] objArray = null;
       f obj = PatchProxy.apply(objArray, this, LonginusInitModule$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.t().f("longinusSDK");
       JsonElement jsonElement = (obj != null)? obj.c(): objArray;
       if (!jsonElement instanceof JsonObject) {
          jsonElement = objArray;
       }
       if (jsonElement != null) {
          g og = jsonElement.r0("longinus_process");
          if (og != null) {
             objArray = og.w();
          }
       }
       String str = (objArray == null || (objArray.hashCode() == -1690703149 && objArray.equals("messagesdk")))? "com.yxcorp.gifshow.longinus.MessageSdkSpearService": "com.yxcorp.gifshow.longinus.SpearService";
       return str;
    }
    public final boolean b(){
       Object[] objArray = null;
       f obj = PatchProxy.apply(objArray, this, LonginusInitModule$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = a.t().f("longinusSDK");
       JsonElement jsonElement = (obj != null)? obj.c(): objArray;
       if (jsonElement instanceof JsonObject) {
          objArray = jsonElement;
       }
       boolean b = true;
       if (objArray != null) {
          g og = objArray.r0("enable_longinus");
          if (og != null && og.d() == b) {
          label_0041 :
             return b;
          }
       }
       b = false;
       goto label_0041 ;
    }
    public final boolean c(){
       boolean b;
       Object[] objArray = null;
       f obj = PatchProxy.apply(objArray, this, LonginusInitModule$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = a.t().f("longinusSDK");
       JsonElement jsonElement = (obj != null)? obj.c(): objArray;
       if (jsonElement instanceof JsonObject) {
          objArray = jsonElement;
       }
       if (objArray != null) {
          g og = objArray.r0("enable_net_report_event");
          if (og != null) {
             b = og.d();
          label_003e :
             return b;
          }
       }
       b = true;
       goto label_003e ;
    }
}
