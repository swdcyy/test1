package f3b.o;
import com.google.common.collect.HashBasedTable;
import java.util.HashMap;
import java.util.Random;
import com.google.gson.Gson;
import com.kuaishou.client.log.content.packages.nano.ContentWrapperEnumMapping;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.google.common.base.CaseFormat;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.Integer;
import com.google.common.collect.s;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Float;
import java.lang.Double;
import com.google.protobuf.nano.MessageNano;
import com.google.gson.JsonObject;
import com.kwai.robust.PatchProxyResult;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.google.gson.JsonElement;
import com.google.gson.JsonArray;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import zk.g;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage$Category;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper;
import com.google.gson.c;
import com.google.common.base.Optional;
import java.lang.Number;
import ukd.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage$Page;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent$Action;
import com.kuaishou.protobuf.log.nano.StidContainerProto$StidContainer;
import com.yxcorp.utility.Log;
import java.lang.Exception;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$TaskEvent$Action;
import k2b.k2;
import java.lang.StringBuilder;
import java.lang.System;
import k2b.z1;
import f3b.s;
import org.json.JSONObject;
import wkd.b;
import com.yxcorp.gifshow.log.h;

public final class o	// class@0015c9
{
    public static s a;
    public static s b;
    public static HashMap c;
    public static Random d;
    public static c e;
    public static final Gson f;
    public static ContentWrapperEnumMapping g;

    static {
       o.a = HashBasedTable.create();
       o.b = HashBasedTable.create();
       o.c = new HashMap();
       o.d = new Random();
       o.f = new Gson();
       o.g = new ContentWrapperEnumMapping();
    }
    public void o(){
       super();
    }
    public static void a(Class p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, o.class, "44")) {
          return;
       }
       String str = CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, p0.getSimpleName());
       o.c.put(str, p0.getName());
       Field[] declaredFiel = p0.getDeclaredFields();
       int len = declaredFiel.length;
       int i = 0;
       while (i < len) {
          object oobject = declaredFiel[i];
          if (Modifier.isPublic(oobject.getModifiers()) && (!Modifier.isStatic(oobject.getModifiers()) && !Modifier.isFinal(oobject.getModifiers()))) {
             Class type = oobject.getType();
             if (type.isArray()) {
                type = type.getComponentType();
             }
             String str1 = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, oobject.getName());
             if (Integer.TYPE.equals(oobject.getType())) {
                o.b.put(str, str1, String.valueOf(0));
             }else if(String.class.equals(oobject.getType())){
                o.b.put(str, str1, "");
             }else if(Boolean.TYPE.equals(oobject.getType())){
                o.b.put(str, str1, String.valueOf(0));
             }else if(Long.TYPE.equals(oobject.getType())){
                o.b.put(str, str1, String.valueOf(0));
             }else if(Float.TYPE.equals(oobject.getType())){
                o.b.put(str, str1, String.valueOf(0));
             }else if(Double.TYPE.equals(oobject.getType())){
                o.b.put(str, str1, String.valueOf(0));
             }else if(type != null && MessageNano.class.isAssignableFrom(type)){
                o.a(type);
             }
          }
       label_00f9 :
          i = i + 1;
       }
       return;
    }
    public static JsonObject b(String p0,JsonObject p1){
       boolean b;
       JsonObject obj = PatchProxy.applyTwoRefs(p0, p1, null, o.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JsonObject();
       Iterator iterator = p1.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          JsonElement value = uEntry.getValue();
          String str = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, uEntry.getKey());
          String str1 = (o.p(str))? str: p0;
          if (value.E()) {
             obj.G(str, o.b(str1, value.r()));
          }else {
             int i = 0;
             if (value.B()) {
                JsonArray jsonArray = value.q();
                JsonArray jsonArray1 = PatchProxy.applyTwoRefs(str1, jsonArray, null, o.class, "36");
                if (jsonArray1 != PatchProxyResult.class) {
                }else {
                   jsonArray1 = new JsonArray();
                   while (i < jsonArray.size()) {
                      if (jsonArray.e0(i).E()) {
                         jsonArray1.G(o.b(str1, jsonArray.e0(i).r()));
                      }else {
                         jsonArray1.G(jsonArray.e0(i));
                      }
                      i = i + 1;
                   }
                }
                obj.G(str, jsonArray1);
             }else {
                String obj1 = PatchProxy.applyThreeRefs(p0, str, value, null, o.class, "40");
                if (obj1 != PatchProxyResult.class) {
                   b = obj1.booleanValue();
                }else if(!("cached_size").equals(str)){
                   obj1 = "_";
                   if (str.startsWith(obj1) || (!str.endsWith(obj1) && (!o.b.contains(p0, str) || !TextUtils.n(value.w(), o.b.get(p0, str))))) {
                   label_00e8 :
                      b = i;
                   }
                }
                i = 1;
                goto label_00e8 ;
                if (!b) {
                   obj.G(str, o.d(str1, str, value));
                }
             }
          }
       }
       return obj;
    }
    public static JsonObject c(String p0,JsonObject p1){
       boolean b;
       JsonObject obj = PatchProxy.applyTwoRefs(p0, p1, null, o.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JsonObject();
       Iterator iterator = p1.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          JsonElement value = uEntry.getValue();
          String str = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, uEntry.getKey());
          Object obj1 = PatchProxy.applyThreeRefs(p0, str, value, null, o.class, "38");
          if (obj1 != PatchProxyResult.class) {
             b = obj1.booleanValue();
          }else if(("cached_size").equals(str) || TextUtils.x(value.w())){
             b = true;
          }else {
             b = false;
          }
          if (!b) {
             obj.G(str, o.d(p0, str, value));
          }
       }
       return obj;
    }
    public static JsonElement d(String p0,String p1,JsonElement p2){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, o.class, "42");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (o.p(p0)) {
          obj = PatchProxy.applyOneRefs(p2, null, o.class, "46");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(p2 != null){
             try{
                p2.p();
                b = true;
             }catch(java.lang.UnsupportedOperationException e0){
             }catch(java.lang.ClassCastException e0){
             }catch(java.lang.IllegalStateException e0){
             }catch(java.lang.NumberFormatException e0){
             }
          }
          b = false;
       }
    }
    public static String e(int p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, oo, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return o.g(ClientEvent$UrlPackage$Category.class, p0);
    }
    public static String f(ClientContentWrapper$ContentWrapper p0){
       o oo = o.class;
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, oo, "34");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 == null) {
          return "";
       }
       o.o();
       if (!PatchProxy.applyVoid(obj, obj, oo, "43") && (o.c.isEmpty() || o.b.isEmpty())) {
          Class[] declaredClas = ClientContentWrapper.class.getDeclaredClasses();
          int len = declaredClas.length;
          for (int i = 0; i < len; i = i + 1) {
             o.a(declaredClas[i]);
          }
       }
       return o.b("", o.e.a(o.f.q(p0)).r()).toString();
    }
    public static String g(Class p0,int p1){
       Field[] obj;
       object oobject;
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, oo, "32");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (o.a.contains(p0.getName(), Integer.valueOf(p1))) {
          return o.a.get(p0.getName(), Integer.valueOf(p1));
       }else {
          obj = p0.getFields();
          int len = obj.length;
          int i = 0;
          while (true) {
             if (i >= len) {
                return String.valueOf(p1);
             }
             try{
                oobject = obj[i];
                if (oobject != null && oobject.getInt(null) == p1) {
                   if (!TextUtils.x(oobject.getName())) {
                      o.a.put(p0.getName(), Integer.valueOf(p1), oobject.getName());
                      break ;
                   }
                   break ;
                }else {
                   i = i + 1;
                }
             }catch(java.lang.Exception e0){
             }
          }
          return Optional.fromNullable(oobject.getName()).or(String.valueOf(p1));
       }
    }
    public static int h(Class p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, o.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       try{
          return a.g(p0, p1).intValue();
       }catch(java.lang.Exception e0){
          return 0;
       }
    }
    public static String i(int p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, oo, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return o.g(ClientEvent$UrlPackage$Page.class, p0);
    }
    public static String j(int p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, oo, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return o.g(ClientEvent$ShowEvent$Action.class, p0);
    }
    public static String k(StidContainerProto$StidContainer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, o.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return "";
       }
       try{
          o.o();
          return o.c("", o.e.a(o.f.q(p0)).r()).toString();
       }catch(java.lang.Exception e3){
          Log.d("ProtoStringUtil", "stidContainer to String failed");
          e3.printStackTrace();
          return obj;
       }
    }
    public static String l(int p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, oo, "26");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return o.g(ClientEvent$TaskEvent$Action.class, p0);
    }
    public static String m(k2 p0){
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, o.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 != null) {
          return "page:"+p0.d+" category "+o.e(p0.b)+" subPages "+TextUtils.k(p0.o())+" params "+TextUtils.k(p0.l())+" identity "+TextUtils.k(p0.a)+" extra name "+TextUtils.k(p0.f);
       }
       return obj;
    }
    public static void n(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, objArray, o.class, "47")) {
          return;
       }
       if (!ContentWrapperEnumMapping.mHasInited) {
          int i = ContentWrapperEnumMapping.init();
          long l = System.currentTimeMillis() - System.currentTimeMillis();
          z1 oz1 = z1.class;
          if (PatchProxy.isSupport(oz1) && (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), Long.valueOf(l), objArray, oz1, "13") && s.a(z1.a()))) {
             try{
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", "Performance");
                jSONObject.put("size", i);
                jSONObject.put("cost", l);
                b.a(0x4b316083).logCustomEvent("v2_init_mapping_p", jSONObject.toString());
             }catch(java.lang.Exception e0){
                e0.printStackTrace();
             }
          }
       }
    }
    public static void o(){
       if (PatchProxy.applyVoid(null, null, o.class, "45")) {
          return;
       }
       if (o.e == null) {
          o.e = new c();
       }
       return;
    }
    public static boolean p(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, o.class, "41");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!TextUtils.x(p0) && o.c.containsKey(p0))? true: false;
       return b;
    }
}
