package com.yxcorp.gifshow.log.stid.StidMergeInterceptManager;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import java.lang.Boolean;
import k2b.x1;
import com.yxcorp.gifshow.log.n;
import com.yxcorp.utility.Log;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Set;
import java.util.Iterator;
import com.yxcorp.gifshow.log.stid.StidMergeInterceptManager$a;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.HashSet;
import java.lang.Integer;
import java.lang.Exception;
import android.content.Context;
import com.yxcorp.gifshow.log.utils.a;
import com.google.gson.Gson;
import zk.d;
import com.yxcorp.gifshow.log.stid.StidMergeInterceptManager$1;
import java.lang.reflect.Type;
import com.google.common.reflect.TypeToken;

public class StidMergeInterceptManager	// class@001200
{
    public static boolean a;
    public static Context b;
    public static Gson c;
    public static Map d;
    public static Map e;

    public void StidMergeInterceptManager(){
       super();
    }
    public static Map a(){
       Object obj = PatchProxy.apply(null, null, StidMergeInterceptManager.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (StidMergeInterceptManager.d == null) {
          StidMergeInterceptManager.d = new HashMap();
       }
       return StidMergeInterceptManager.d;
    }
    public static Map b(){
       Object obj = PatchProxy.apply(null, null, StidMergeInterceptManager.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (StidMergeInterceptManager.e == null) {
          StidMergeInterceptManager.e = new HashMap();
       }
       return StidMergeInterceptManager.e;
    }
    public static boolean c(String p0,String p1){
       Object obj = null;
       StidMergeInterceptManager$a obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, StidMergeInterceptManager.class, "8");
       if (obj1 != PatchProxyResult.class) {
          return obj1.booleanValue();
       }
       if (!n.A1().H()) {
          Log.b("StidMergeInterceptManager", "isIntercept switch off");
          return false;
       }else if(!StidMergeInterceptManager.a){
          Log.b("StidMergeInterceptManager", "isIntercept is not init");
          return false;
       }else if(!TextUtils.isEmpty(p1) && (!("UNKNOWN2").equals(p1) && !("UNKNOWN").equals(p1))){
          obj = StidMergeInterceptManager.a().get(p1);
       }
    label_0052 :
       if (obj != null) {
          Iterator iterator = obj.iterator();
          while (iterator.hasNext()) {
             obj1 = iterator.next();
             if (obj1 == null || TextUtils.isEmpty(obj1.b)) {
                continue ;
             }else if(("app_general").equals(obj1.b)){
                Log.b("StidMergeInterceptManager", "isIntercept 1");
                return true;
             }
          }
       }
       return false;
    }
    public static boolean d(JsonArray p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, StidMergeInterceptManager.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null || !p0.size()) {
          return b;
       }
       while (b < p0.size()) {
          try{
             JsonElement jsonElement = p0.e0(b);
             if (jsonElement != null && jsonElement.E()) {
                StidMergeInterceptManager$a uoa = new StidMergeInterceptManager$a(jsonElement.r());
                if (!TextUtils.isEmpty(uoa.a) && !TextUtils.isEmpty(uoa.b)) {
                   Set set = StidMergeInterceptManager.a().get(uoa.a);
                   if (set == null) {
                      set = new HashSet();
                   }
                   set.add(uoa);
                   StidMergeInterceptManager.a().put(uoa.a, set);
                   StidMergeInterceptManager.b().put(Integer.valueOf(uoa.c), set);
                }
             }
          }catch(java.lang.Exception e1){
             e1.printStackTrace();
          }
          b = b + 1;
       }
       return true;
    }
    public static JsonArray e(Context p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       StidMergeInterceptManager stidMergeInt = StidMergeInterceptManager.class;
       Object obj = PatchProxy.applyOneRefs(p0, null, stidMergeInt, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       try{
          String str = a.a(p0, "stid_intercept_config.json");
          if (!TextUtils.isEmpty(str)) {
             Gson gson = PatchProxy.apply(null, null, stidMergeInt, "3");
             if (gson != patchProxyRe) {
             }else if(StidMergeInterceptManager.c == null){
                d uod = new d();
                uod.c();
                StidMergeInterceptManager.c = uod.b();
             }
             gson = StidMergeInterceptManager.c;
             return gson.i(str, new StidMergeInterceptManager$1().getType());
          }
       }catch(java.lang.Exception e4){
          e4.printStackTrace();
       }
       return null;
    }
}
