package com.kwai.chat.sdk.logreport.utils.GsonUtil;
import zk.d;
import com.google.gson.Gson;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import java.util.HashMap;
import com.kwai.chat.sdk.signal.f;
import com.kwai.chat.sdk.signal.IMClientAppInfo;
import com.kwai.chat.kwailink.data.ClientAppInfo;
import java.lang.Integer;
import org.json.JSONObject;
import java.util.Map;
import r97.r$a;
import r97.r;
import r97.o$a;
import r97.o;
import com.kwai.chat.sdk.logreport.config.LogConstants$LogEventKey;
import c97.d;
import r97.a0;
import java.lang.Throwable;
import l85.b;
import java.lang.Exception;

public class GsonUtil	// class@000a78
{
    public static final String EMPTY_STRING = "";
    public static final String GSON_UTIL_TO_JSON_CRASH = "IMSDK.BadCase.GsonUtilToJsonCrash";
    public static final Gson sGson;

    static {
       d uod = new d();
       uod.c();
       GsonUtil.sGson = uod.b();
    }
    public void GsonUtil(){
       super();
    }
    public static Object fromJson(String p0,Class p1){
       return GsonUtil.sGson.h(p0, p1);
    }
    public static void postToJsonCrash(){
       HashMap hashMap = new HashMap();
       hashMap.put("appId", Integer.valueOf(f.e().b().a()));
       hashMap.put("imsdkVersion", "11.3.10.0");
       hashMap.put("command", "IMSDK.BadCase.GsonUtilToJsonCrash");
       JSONObject jSONObject = new JSONObject(hashMap);
       r$a uoa = r.b();
       uoa.d(o.builder().i("IM_SDK").j("").h(0x3f800000).b());
       uoa.f(LogConstants$LogEventKey.IMSDK_TCPLINK_MESSAGESEND_FAILED.getEventKey());
       uoa.h(jSONObject.toString());
       d.a().g().E(uoa.c());
    }
    public static String toJson(Object p0){
       try{
          return GsonUtil.sGson.q(p0);
       }catch(java.lang.Exception e1){
          b.f("GsonUtil#toJson failed", e1);
          e1.printStackTrace();
          GsonUtil.postToJsonCrash();
          return "";
       }
    }
}
