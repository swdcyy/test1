package com.yxcorp.gifshow.log.utils.c;
import java.lang.String;
import java.util.regex.Pattern;
import java.lang.Object;
import g3b.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.List;
import com.google.protobuf.nano.MessageNano;
import f3b.f;
import java.util.HashMap;
import java.util.Map;
import java.lang.Double;
import java.util.Iterator;
import java.util.Set;
import java.util.Map$Entry;
import java.lang.Integer;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import java.lang.StringBuffer;
import java.lang.StringBuilder;
import q2b.l;
import com.yxcorp.gifshow.log.utils.c$a;
import q2b.m;
import ukd.a;
import com.yxcorp.utility.TextUtils;
import com.google.gson.c;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import ok.s;
import ok.s$c;
import g3b.c;
import java.lang.reflect.Constructor;
import java.lang.Exception;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import com.yxcorp.gifshow.log.model.WhitelistInitInfo;
import java.lang.System;
import java.lang.Long;
import f3b.q;
import f3b.r;
import java.lang.Float;

public class c	// class@001b56
{
    public static Pattern a;

    static {
       c.a = Pattern.compile("_\(\\w\)");
    }
    public void c(){
       super();
    }
    public static boolean a(Object p0,h p1,String p2){
       h c;
       h oh1;
       MessageNano obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       String str = "showEvent";
       if (("clickEvent").equals(p2) || (!str.equals(p2) && !("taskEvent").equals(p2))) {
          return c.b(p0, p1.b);
       }
       obj = p0;
       String str1 = f.e(obj);
       String str2 = f.c(obj);
       c = p1.c;
       if (c == null) {
          c = new HashMap();
       }
       h oh = c.get(str1);
       if (oh != null) {
          if (str.equals(p2)) {
             String[] stringArray = new String[]{"type"};
             stringArray = c.g(p0, stringArray);
             if (stringArray != null && (stringArray instanceof Double && (int)Double.parseDouble(stringArray.toString()) == 1)) {
                return c.b(p0, oh.b);
             }
          }
          oh1 = oh.c.get(str2);
          if (oh1 != null) {
             return c.b(p0, oh1.b);
          }else if(c.b(p0, oh.b)){
             return true;
          }
       }
       oh1 = c.get(str2);
       if (oh1 == null) {
          return c.b(p0, p1.b);
       }else {
          return c.b(p0, oh1.b);
       }
    }
    public static boolean b(Object p0,List p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p1 != null && p1.size()) {
          Iterator iterator = p1.iterator();
          while (iterator.hasNext()) {
             Map map = iterator.next();
             Iterator iterator1 = map.entrySet().iterator();
             int i = 0;
             while (iterator1.hasNext()) {
                Map$Entry uEntry = iterator1.next();
                String key = uEntry.getKey();
                Object value = uEntry.getValue();
                Object obj1 = c.g(p0, key.split("\\."));
                if (value != null && (value == obj1 || (value.equals(obj1) || (value != null && (obj1 != null && (obj1 instanceof Integer && (value instanceof Double && !Double.parseDouble(obj1.toString()) - Double.parseDouble(value.toString())))))))) {
                   i = i + 1;
                }
             }
             if (i == map.size()) {
                return true;
             }
          }
       }
       return false;
    }
    public static String c(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       Object obj = PatchProxy.applyOneRefs(p0, null, uoc, "9");
       if (obj != patchProxyRe) {
          return obj;
       }
       String str = PatchProxy.applyOneRefs(p0, null, uoc, "8");
       if (str != patchProxyRe) {
       }else {
          Matcher matcher = c.a.matcher(p0.toLowerCase());
          StringBuffer str1 = "";
          while (matcher.find()) {
             matcher.appendReplacement(str1, (matcher.group(1)).toUpperCase());
          }
          matcher.appendTail(str1);
          str = str1;
       }
       return str+"_";
    }
    public static void d(l p0,Object p1,String p2,c$a p3){
       int i;
       int len;
       Object obj1;
       int i1;
       Object obj2;
       object oobject;
       String str;
       JsonElement jsonElement;
       JsonObject jsonObject;
       HashMap obj3;
       object oobject1;
       Object obj4;
       JsonElement jsonElement1;
       String str1;
       int i2;
       l ol = p0;
       String obj = p2;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, c.class, "5")) {
          return;
       }
       l mExtraRuleLi = ol.mExtraRuleList;
       if (mExtraRuleLi != null && (mExtraRuleLi.size() > 0 && ol.mExtraRuleList.containsKey(obj))) {
          List list = ol.mExtraRuleList.get(obj);
          if (list != null && list.size()) {
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                m om = iterator.next();
                Iterator iterator1 = om.mRuleList.iterator();
                while (iterator1.hasNext()) {
                   String[] stringArray = (iterator1.next()).split(",");
                   if (stringArray.length <= 1) {
                      continue ;
                   }
                   i = 0;
                   String[] stringArray1 = (stringArray[i]).split("\\.");
                }
                i = p3;
             }
          }
       }
       return;
    }
    public static Object e(l p0,Object p1,c p2,String p3,String p4){
       Object[] objArray;
       Constructor obj1;
       Object obj2;
       c uoc = c.class;
       String[] obj = null;
       if (PatchProxy.isSupport(uoc)) {
          objArray = new Object[]{p0,p1,p2,p3,p4};
          obj1 = PatchProxy.apply(objArray, obj, uoc, "4");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       try{
          Class[] uClassArray = new Class[0];
          obj1 = Class.forName(p0.mClassPath).getDeclaredConstructor(uClassArray);
          obj1.setAccessible(1);
          objArray = new Object[0];
          obj2 = obj1.newInstance(objArray);
       }catch(java.lang.Exception e0){
          p2.a(e0.getMessage());
          obj2 = obj;
       }
       if (obj2 == null) {
          p2.a("java reflect create object is null");
          return obj;
       }else {
          l mRuleList = p0.mRuleList;
          if (mRuleList != null && !mRuleList.isEmpty()) {
             Iterator iterator = p0.mRuleList.iterator();
             while (iterator.hasNext()) {
                obj = (iterator.next()).split(",");
                if (obj.length > 1) {
                   object oobject = obj[1];
                   Object obj3 = c.h(p1, (obj[0]).split("\\."), p2);
                   if (obj3 != null) {
                      try{
                         a.o(obj2, c.c(oobject), obj3);
                      }catch(java.lang.Exception e0){
                         try{
                            e0.getClass().getDeclaredField(c.c(oobject)).isEnumConstant();
                            c.i(oobject, e0.getClass().getDeclaredField(c.c(oobject)).getGenericType().toString(), obj3, e0);
                            goto label_005d ;
                         }catch(java.lang.Exception e2){
                            p2.a(e2.getMessage());
                            goto label_005d ;
                         }
                      }
                   }
                }
             }
          }
          l mInitData = p0.mInitData;
          if (mInitData != null && ("DEFAULT").equals(mInitData.mClientTimestamp)) {
             a.o(obj2, c.c("timestamp"), Long.valueOf(System.currentTimeMillis()));
          }
          if (!TextUtils.x(p3) && !"UNKNOWN2".equals(p3)) {
             a.o(obj2, c.c("page"), p3);
          }
          if (!TextUtils.x(p4) && !"UNKNOWN2".equals(p4)) {
             a.o(obj2, c.c("action"), p4);
          }
          c.d(p0, p1, p4, new q(obj2));
          return obj2;
       }
    }
    public static Map f(l p0,Object p1,c p2,String p3,String p4){
       HashMap obj;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          obj = PatchProxy.apply(objArray, null, uoc, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new HashMap();
       l mRuleList = p0.mRuleList;
       if (mRuleList != null && !mRuleList.isEmpty()) {
          Iterator iterator = p0.mRuleList.iterator();
          while (iterator.hasNext()) {
             String[] stringArray = (iterator.next()).split(",");
             if (stringArray.length > 1) {
                object oobject = stringArray[1];
                Object obj1 = c.h(p1, (stringArray[0]).split("\\."), p2);
                if (obj1 != null) {
                   obj.put(oobject, obj1);
                }
             }
          }
       }
       l mInitData = p0.mInitData;
       if (mInitData != null && ("DEFAULT").equals(mInitData.mClientTimestamp)) {
          obj.put("timestamp", Long.valueOf(System.currentTimeMillis()));
       }
       if (!TextUtils.x(p3) && !"UNKNOWN2".equals(p3)) {
          obj.put("page", p3);
       }
       if (!TextUtils.x(p4) && !"UNKNOWN2".equals(p4)) {
          obj.put("action", p4);
       }
       c.d(p0, p1, p4, new r(obj));
       return obj;
    }
    public static Object g(Object p0,String[] p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, c.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int len = p1.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return p0;
          }
          object oobject = p1[i];
          if (p0 != null) {
             p0 = a.d(p0, oobject);
             i = i + 1;
          }else {
             break ;
          }
       }
       return null;
    }
    public static Object h(Object p0,String[] p1,c p2){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, c.class, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       int len = p1.length;
       int i = 0;
       while (true) {
          if (i < len) {
             object oobject = p1[i];
             if (p0 != null) {
                p0 = a.d(p0, oobject);
                i = i + 1;
             }else {
                return null;
             }
          }else if(p0 == null){
             return null;
          }else {
             try{
                p1 = PatchProxy.applyOneRefs(p0, null, c.class, "14");
                if (p1 == patchProxyRe) {
                   if (p0 instanceof String) {
                      p1 = p0;
                      if (p1.length() > 200) {
                         p0 = p1.substring(0, 200);
                      }
                   }
                   p1 = p0;
                   break ;
                }
                break ;
             }catch(java.lang.Exception e7){
                p2.a(e7.getMessage());
                return null;
             }
          }
       }
       return p1;
    }
    public static void i(String p0,String p1,Object p2,Object p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, c.class, "7")) {
          return;
       }
       if (!TextUtils.x(p1)) {
          if (("int").equals(p1)) {
             a.o(p3, c.c(p0), Integer.valueOf(Integer.parseInt(String.valueOf(p2))));
          }else if(("long").equals(p1)){
             a.o(p3, c.c(p0), Long.valueOf(Long.parseLong(String.valueOf(p2))));
          }else if(("double").equals(p1)){
             a.o(p3, c.c(p0), Double.valueOf(Double.parseDouble(String.valueOf(p2))));
          }else if(("float").equals(p1)){
             a.o(p3, c.c(p0), Float.valueOf(Float.parseFloat(String.valueOf(p2))));
          }else if(("class java.lang.String").equals(p1)){
             a.o(p3, c.c(p0), String.valueOf(p2));
          }
       }
       return;
    }
}
