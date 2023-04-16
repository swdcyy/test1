package com.yxcorp.gifshow.relation.krn.RecommendRealTimeLoggerBridge;
import com.kuaishou.krn.base.KrnBridge;
import com.yxcorp.gifshow.relation.krn.RecommendRealTimeLoggerBridge$a;
import nsd.u;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.facebook.react.bridge.Promise;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import org.json.JSONObject;
import zsd.u;
import rq4.r;
import com.yxcorp.gifshow.relation.util.g;
import com.kwai.robust.PatchProxyResult;
import rq4.m;
import com.google.protobuf.nano.MessageNano;
import android.util.Base64;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import org.json.JSONException;
import java.lang.Throwable;

public final class RecommendRealTimeLoggerBridge extends KrnBridge	// class@001929
{
    public static final RecommendRealTimeLoggerBridge$a Companion;

    static {
       RecommendRealTimeLoggerBridge.Companion = new RecommendRealTimeLoggerBridge$a(null);
    }
    public void RecommendRealTimeLoggerBridge(ReactApplicationContext p0){
       a.p(p0, "context");
       super(p0);
    }
    public String getName(){
       return "KRNRecommendLog";
    }
    public final void getUserPbData(String p0,String p1,Promise p2){
       r or;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, RecommendRealTimeLoggerBridge.class, "1")) {
          return;
       }
       a.p(p0, "action");
       String str = "promise";
       try{
          a.p(p2, str);
          if (this.getCurrentActivity() == null || TextUtils.x(p1)) {
             return;
          }else {
             JSONObject jSONObject = new JSONObject(p1);
             boolean b = true;
             Object obj = null;
             if (u.I1("SHOW_USER", p0, b)) {
                or = g.c(jSONObject);
             }else if(u.I1("FOLLOW_USER", p0, b) || u.I1("UN_FOLLOW_USER", p0, b)){
                or = g.a(jSONObject);
             }else if(u.I1("JUMP_TO_PROFILE", p0, b)){
                or = g.b(jSONObject);
             }else {
                or = obj;
             }
             if (or == null) {
                p2.reject("error", "invalid action");
                return;
             }else {
                r e = or.e;
                String str1 = PatchProxy.applyOneRefs(jSONObject, obj, g.class, "6");
                if (str1 != PatchProxyResult.class) {
                }else {
                   a.p(jSONObject, "jsonObject");
                   jSONObject = jSONObject.optJSONObject("extra");
                   if (jSONObject != null) {
                      str = jSONObject.toString();
                      if (str != null) {
                      label_0090 :
                         str1 = str;
                      }
                   }
                   str = "";
                   goto label_0090 ;
                }
                e.i = str1;
                WritableMap writableMap = Arguments.createMap();
                writableMap.putString("result", Base64.encodeToString(MessageNano.toByteArray(or), 2));
                p2.resolve(writableMap);
             }
          }
       }catch(org.json.JSONException e8){
          e8.printStackTrace();
          p2.reject("error", e8);
       }
       return;
    }
}
