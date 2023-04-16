package com.yxcorp.gifshow.log.channel.a;
import zk.d;
import com.google.gson.Gson;
import java.lang.Object;
import com.kuaishou.client.log.packages.nano.ClientLog$ReportEvent;
import n2b.h;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.Set;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$EventPackage;
import n2b.e;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Integer;
import java.util.Map;
import java.util.HashMap;
import com.yxcorp.utility.Log;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import java.util.Iterator;
import java.util.Map$Entry;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import android.content.Context;
import com.yxcorp.gifshow.log.utils.a;
import com.yxcorp.gifshow.log.channel.a$a;
import java.lang.reflect.Type;
import el.a;
import java.lang.Exception;
import k2b.z1;

public class a	// class@0011dc
{
    public static Gson a;
    public static Map b;
    public static Map c;
    public static boolean d;
    public static Context e;

    static {
       d uod = new d();
       uod.c();
       a.a = uod.b();
       a.d = false;
    }
    public void a(){
       super();
    }
    public static boolean a(ClientLog$ReportEvent p0,h p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = null;
       h obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, a.class, "7");
       if (obj1 != patchProxyRe) {
          return obj1.booleanValue();
       }
       obj1 = p1.d;
       if (obj1 == null || !obj1.size()) {
          return true;
       }
       ClientLog$ReportEvent eventPackage = p0.eventPackage;
       if (eventPackage != null) {
          String str = e.b(eventPackage);
          if (TextUtils.isEmpty(str)) {
             return false;
          }else if(obj1.contains(str)){
             Object obj2 = PatchProxy.applyOneRefs(str, p1, h.class, "5");
             if (obj2 != patchProxyRe) {
                obj = obj2;
             }else {
                p1 = p1.e;
                if (p1 != null) {
                   obj = p1.get(str);
                }
             }
             if (obj != null) {
                int i = e.d(p0.eventPackage);
                int len = obj.length;
                int i1 = 0;
                while (i1 < len) {
                   if (obj[i1].intValue() == i) {
                      return true;
                   }
                   i1 = i1 + 1;
                }
             }else {
                return true;
             }
          }
       }
       return false;
    }
    public static Map b(){
       Object obj = PatchProxy.apply(null, null, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a.b == null) {
          a.b = new HashMap();
       }
       return a.b;
    }
    public static Map c(){
       Object obj = PatchProxy.apply(null, null, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a.c == null) {
          a.c = new HashMap();
       }
       return a.c;
    }
    public static boolean d(ClientLog$ReportEvent p0){
       ClientLog$ReportEvent eventPackage;
       String str;
       ClientEvent$EventPackage showEvent;
       Map map;
       h oh;
       String obj = PatchProxy.applyOneRefs(p0, null, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!a.d) {
          Log.b("LogChannelManager", "isRecoChannelEvent old config no init");
          return false;
       }else {
          obj = "eventPackage.showEvent";
          eventPackage = p0.eventPackage;
          if (eventPackage != null) {
             if (eventPackage.showEvent != null) {
                str = obj;
             }else if(eventPackage.clickEvent != null){
                str = "eventPackage.clickEvent";
             }else if(eventPackage.taskEvent != null){
                str = "eventPackage.taskEvent";
             }else {
             label_003b :
                str = "";
             }
          }else {
             goto label_003b ;
          }
          if (obj.equals(str)) {
             ClientLog$ReportEvent eventPackage1 = p0.eventPackage;
             if (eventPackage1 != null) {
                showEvent = eventPackage1.showEvent;
                if (showEvent == null) {
                label_0063 :
                   obj = "UNKNOWN1";
                }else {
                   ClientEvent$ShowEvent action = showEvent.action;
                   if (action == 1) {
                      obj = "ENTER";
                   }else if(action == 2){
                      obj = "LEAVE";
                   }else if(action == 3){
                      obj = "RESUME";
                   }else {
                      obj = "ELEMENT";
                   }
                }
             }else {
                goto label_0063 ;
             }
             map = a.c().get(obj);
             if (map != null) {
                oh = map.get(e.c(p0));
                if (oh != null) {
                   return a.a(p0, oh);
                }
             }
          }else {
             map = a.b().get(str);
             if (map != null && !map.isEmpty()) {
                oh = map.get(e.c(p0));
                if (oh != null) {
                   return a.a(p0, oh);
                }
             }
          }
          return false;
       }
    }
    public static boolean e(Map p0){
       Map value;
       Iterator iterator1;
       Map$Entry uEntry;
       Map$Entry obj = PatchProxy.applyOneRefs(p0, null, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null || p0.isEmpty()) {
          return false;
       }
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          obj = iterator.next();
          if (obj == null || obj.getKey() == null) {
             continue ;
          }else {
             String key = obj.getKey();
             if (("eventPackage.showEvent").equals(key)) {
                value = obj.getValue();
                if (PatchProxy.applyVoidOneRefs(value, null, a.class, "5")) {
                }else {
                   iterator1 = value.entrySet().iterator();
                   while (iterator1.hasNext()) {
                      uEntry = iterator1.next();
                      String key1 = uEntry.getKey();
                      JsonElement value1 = uEntry.getValue();
                      Map map = a.c().get(key1);
                      if (map == null) {
                         map = new HashMap();
                         a.c().put(key1, map);
                      }
                      Iterator iterator2 = value1.r().entrySet().iterator();
                      while (iterator2.hasNext()) {
                         Map$Entry uEntry1 = iterator2.next();
                         String key2 = uEntry1.getKey();
                         map.put(key2, new h(key2, uEntry1.getValue()));
                      }
                   }
                }
             }else {
                value = obj.getValue();
                if (PatchProxy.applyVoidTwoRefs(key, value, null, a.class, "4")) {
                   continue ;
                }else {
                   Map map1 = a.b().get(key);
                   if (map1 == null) {
                      map1 = new HashMap();
                      a.b().put(key, map1);
                   }
                   iterator1 = value.entrySet().iterator();
                   while (iterator1.hasNext()) {
                      uEntry = iterator1.next();
                      String key3 = uEntry.getKey();
                      map1.put(key3, new h(key3, uEntry.getValue()));
                   }
                }
             }
          }
       }
       return true;
    }
    public static Map f(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          String str = a.a(p0, "reco_channel_config.json");
          if (!TextUtils.isEmpty(str)) {
             return a.a.i(str, new a$a().getType());
          }
       }catch(java.lang.Exception e3){
          z1.e("V2_RECO_READ_LOCAL_FAILED", e3.getMessage());
       }
       return null;
    }
}
