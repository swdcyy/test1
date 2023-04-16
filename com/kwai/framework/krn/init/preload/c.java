package com.kwai.framework.krn.init.preload.c;
import java.lang.Object;
import com.google.gson.internal.LinkedTreeMap;
import com.kuaishou.krn.model.LaunchModel;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.p0;
import java.util.ArrayList;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Integer;
import java.lang.StringBuilder;
import fg6.a;
import com.kwai.framework.krn.init.preload.c$g;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.Gson;
import java.util.List;
import java.util.Iterator;
import java.util.Collection;
import com.kwai.framework.krn.init.preload.c$f;
import java.util.Map;
import com.kwai.framework.krn.init.preload.a;
import java.lang.Exception;
import java.lang.Long;
import com.kwai.framework.krn.init.preload.c$a;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.HashMap;
import com.facebook.react.bridge.ReadableNativeMap;
import com.kwai.framework.krn.init.preload.c$e;
import ekd.q;
import java.util.Set;
import java.util.Map$Entry;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.facebook.react.bridge.ReactApplicationContext;
import com.kuaishou.krn.c;
import android.content.Context;
import com.facebook.react.bridge.ReactContext;
import java.lang.reflect.Field;
import java.lang.ref.WeakReference;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import ukd.a;
import a96.k;
import a96.j;
import com.kwai.framework.krn.init.preload.c$c;
import com.kwai.framework.krn.init.preload.c$d;
import c96.a;
import q87.c;
import a96.a;
import com.kwai.framework.krn.init.preload.c$b;
import p55.a;
import f55.g;
import com.kwai.bridge.a;
import java.util.AbstractMap;
import android.os.Bundle;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class c	// class@001608
{
    public boolean a;
    public Object b;
    public static final String c = "type";

    public void c(){
       super();
       this.a = false;
       this.b = null;
    }
    public final Object A(Object p0,LinkedTreeMap p1,LaunchModel p2){
       int i2;
       String this;
       String str1;
       int i3;
       Object obj4;
       boolean b1;
       c uoc = this;
       int i = p0;
       LinkedTreeMap linkedTreeMa = p1;
       LaunchModel launchModel = p2;
       String obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, c.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (i instanceof String)? p0.c(i): i;
       int i1 = 0;
       String str = (obj == null)? 1: null;
       if (obj != null && uoc.s(linkedTreeMa)) {
          i2 = 0;
          while (true) {
             this = "switch";
             if (i2 < uoc.g(linkedTreeMa).size()) {
                Object obj1 = uoc.y(uoc.g(linkedTreeMa).get(i2), launchModel);
                String obj2 = PatchProxy.applyOneRefs(linkedTreeMa, uoc, c.class, "25");
                boolean b = (obj2 != PatchProxyResult.class)? obj2.booleanValue(): uoc.r(linkedTreeMa.get(this), "type");
                if (b) {
                   obj2 = PatchProxy.applyOneRefs(linkedTreeMa, uoc, c.class, "26");
                   if (obj2 == PatchProxyResult.class) {
                      obj2 = linkedTreeMa.get(this).get("type");
                   }
                   obj = uoc.a(obj, obj2, linkedTreeMa);
                }
                if (obj1.equals(obj)) {
                   str1 = uoc.j(linkedTreeMa).get(i2);
                   i3 = 0;
                label_009f :
                   if (i3 && str1 instanceof Number) {
                      Object obj3 = str1;
                      obj4 = PatchProxy.applyOneRefs(linkedTreeMa, uoc, c.class, "23");
                      if (obj4 != PatchProxyResult.class) {
                         b1 = obj4.booleanValue();
                      }else if(uoc.s(linkedTreeMa) && linkedTreeMa.get(this).containsKey("greater")){
                         b1 = true;
                      }else {
                         b1 = false;
                      }
                      if (b1) {
                         int i4 = 0;
                         while (true) {
                            if (i4 < uoc.h(linkedTreeMa).size()) {
                               obj4 = uoc.y(uoc.h(linkedTreeMa).get(i4), launchModel);
                               if (obj4 instanceof Number && (obj3.longValue() - obj4.longValue() > 0 && uoc.j(linkedTreeMa).size() > i4)) {
                                  if (PatchProxy.isSupport(c.class)) {
                                     i = i4;
                                     obj4 = PatchProxy.applyThreeRefs(p1, p2, Integer.valueOf(i4), this, c.class, "14");
                                     if (obj4 != PatchProxyResult.class) {
                                        b1 = obj4.booleanValue();
                                     }else if(uoc.t(linkedTreeMa) && (uoc.i(linkedTreeMa).size() > i && uoc.y(uoc.i(linkedTreeMa).get(i), launchModel) instanceof Number)){
                                        b1 = true;
                                     }else {
                                        b1 = false;
                                     }
                                  }else {
                                     i = i4;
                                     goto label_0129 ;
                                  }
                                  if (b1) {
                                     if (obj3.longValue() - uoc.y(uoc.i(linkedTreeMa).get(i), launchModel).longValue() < 0) {
                                        obj = uoc.j(linkedTreeMa).get(i);
                                     }
                                  }else {
                                     obj = uoc.j(linkedTreeMa).get(i);
                                  }
                                  i3 = 0;
                               label_0181 :
                                  if (uoc.t(linkedTreeMa)) {
                                     i2 = 0;
                                     while (true) {
                                        if (i2 < uoc.i(linkedTreeMa).size()) {
                                           obj1 = uoc.y(uoc.i(linkedTreeMa).get(i2), launchModel);
                                           if (obj1 instanceof Number && (obj3.longValue() - obj1.longValue() < 0 && uoc.j(linkedTreeMa).size() > i2)) {
                                              obj = uoc.j(linkedTreeMa).get(i2);
                                           }else {
                                              i2 = i2 + 1;
                                           }
                                        }
                                     }
                                  }
                               }else {
                                  i = i4;
                               }
                               i4 = i + 1;
                            }
                         }
                      }
                      obj = str1;
                      goto label_0181 ;
                   }else {
                      obj = str1;
                   }
                   i1 = i3;
                }else {
                   i2 = i2 + 1;
                }
             }else {
                str1 = obj;
                i3 = 1;
                goto label_009f ;
             }
          }
       }else {
          i1 = str;
       }
       Object obj5 = PatchProxy.applyOneRefs(linkedTreeMa, uoc, c.class, "35");
       i2 = (obj5 != PatchProxyResult.class)? obj5.booleanValue(): uoc.r(linkedTreeMa, "type");
       if (i2) {
          str = PatchProxy.applyOneRefs(linkedTreeMa, uoc, c.class, "37");
          if (str == PatchProxyResult.class) {
             str = linkedTreeMa.get("type");
          }
          obj = uoc.a(obj, str, linkedTreeMa);
       }
       if (i1) {
          obj4 = PatchProxy.applyOneRefs(linkedTreeMa, uoc, c.class, "33");
          b1 = (obj4 != PatchProxyResult.class)? obj4.booleanValue(): linkedTreeMa.containsKey("default");
          if (b1) {
             obj = PatchProxy.applyOneRefs(linkedTreeMa, uoc, c.class, "34");
             if (obj == PatchProxyResult.class) {
                obj = linkedTreeMa.get("default");
             }
          }else {
             obj = null;
          }
       }
       return uoc.y(obj, launchModel);
    }
    public final Object a(Object p0,String p1,LinkedTreeMap p2){
       boolean i1;
       long l;
       c uoc = c.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, c.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1 == null) {
          return p0;
       }
       int i = 0;
       boolean b = -1;
       switch (p1.hashCode()){
           case 0xc258db49:
             if (p1.equals("number")) {
                i1 = 0;
             }else {
             }
             break;
           case 0xcad56011:
             if (p1.equals("string")) {
                i1 = 1;
             }else {
             }
             break;
           case 0x1a55c:
             if (p1.equals("map")) {
                i1 = 2;
             }else {
             }
             break;
           case 0x32b09e:
             if (p1.equals("list")) {
                i1 = 3;
             }else {
             }
             break;
           case 0x3db6c28:
             if (p1.equals("boolean")) {
                i1 = 4;
             }else {
             }
             break;
           default:
             i1 = -1;
       }
       try{
          switch (i1){
              case 0:
                if (p0 instanceof String) {
                   return Long.valueOf(p0);
                }else if(p0 instanceof Boolean){
                   l = (p0.booleanValue())? 1: 0;
                   l = Long.valueOf(l);
                }
                break;
              case 1:
                if (p0 instanceof Number) {
                   return String.valueOf(p0);
                }else if(p0 instanceof Boolean){
                   return String.valueOf(p0);
                }else if(p0 instanceof Map || p0 instanceof List){
                   return a.a.q(p0);
                }
                break;
              case 2:
                if (p0 instanceof String) {
                   i1 = p0;
                   return a.a.i(i1, new c$f(this).getType());
                }
                break;
              case 3:
                if (p0 instanceof String) {
                   i1 = p0;
                   if (p0.indexOf(93) == b) {
                      i1.insert(i, "[\"");
                      i1 = i1+"\"]";
                   }
                   p0 = a.a.i(i1, new c$g(this).getType());
                   i1 = PatchProxy.applyOneRefs(p2, this, uoc, "27");
                   i1 = (i1 != PatchProxyResult.class)? i1.booleanValue(): this.r(p2, "itemType");
                   if (i1) {
                      ArrayList uArrayList = new ArrayList();
                      Iterator iterator = p0.iterator();
                      while (iterator.hasNext()) {
                         Object obj1 = iterator.next();
                         String str = PatchProxy.applyOneRefs(p2, this, uoc, "28");
                         if (str == PatchProxyResult.class) {
                            str = p2.get("itemType");
                         }
                         uArrayList.add(this.a(obj1, str, p2));
                      }
                      p0.clear();
                      p0.addAll(uArrayList);
                   }
                   return p0;
                }
                break;
              case 4:
                if (p0 instanceof Number) {
                   p0 = (!p0.intValue())? Boolean.FALSE: Boolean.TRUE;
                   return p0;
                }else if(p0 instanceof Boolean){
                   return p0;
                }else if(p0 instanceof String){
                   if (!p0.equals("") && (p0.equals("0") || p0.equals("false"))) {
                      return Boolean.FALSE;
                   }
                   return Boolean.TRUE;
                }
                break;
              default:
          }
       }catch(java.lang.Exception e10){
          a.M().Y("string to map exception:"+e10.getMessage());
       }
    label_018a :
       return l;
    }
    public final ArrayList b(LinkedTreeMap p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.get("keys");
    }
    public final String c(LinkedTreeMap p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "41");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.get("placeHolder");
    }
    public final String d(LinkedTreeMap p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "51");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.get("android").get("method");
    }
    public final ArrayList e(LinkedTreeMap p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "52");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.get("android").get("params");
    }
    public ArrayList f(ArrayList p0,LaunchModel p1){
       ArrayList obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.addAll(p0);
       p0 = this.y(obj, p1);
       Gson a = a.a;
       return a.i(a.q(p0), new c$a(this).getType());
    }
    public final ArrayList g(LinkedTreeMap p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.get("switch").get("cases");
    }
    public final ArrayList h(LinkedTreeMap p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.get("switch").get("greater");
    }
    public final ArrayList i(LinkedTreeMap p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.get("switch").get("less");
    }
    public final ArrayList j(LinkedTreeMap p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.get("switch").get("values");
    }
    public final String k(LinkedTreeMap p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.get("url");
    }
    public final Object l(ArrayList p0,int p1,Map p2){
       if (PatchProxy.isSupport(c.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, c.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       p2 = p2.get(p0.get(p1));
       p1++;
       if (p1 < p0.size() && p2 instanceof Map) {
          this.l(p0, p1, p2);
       }
       return p2;
    }
    public final Object m(Object p0,LinkedTreeMap p1,LaunchModel p2){
       String this;
       Gson a;
       Map map;
       Map map1;
       HashMap obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, c.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return p0;
       }
       if (!this.o(p1) && !this.p(p1)) {
          return this.A(p0, p1, p2);
       }
       Object obj1 = null;
       this = "key";
       if (p0 instanceof WritableNativeMap) {
          obj = p0.toHashMap();
          if (p1.containsKey(this) && obj.containsKey(p1.get(this))) {
             obj1 = obj.get(p1.get(this));
          }
          if (obj1 == null && this.p(p1)) {
             obj1 = this.l(this.b(p1), 0, obj);
          }
          p1 = this.A(this.n(obj1, p1), p1, p2);
          if (p1 != null) {
          label_00c5 :
             p0 = p1;
          }
       }else {
          try{
             obj = new HashMap();
             a = a.a;
             map = a.i(a.q(p0), new c$e(this).getType());
          }catch(java.lang.Exception e0){
             map = a.a.h(p0.toString(), Map.class);
          }catch(java.lang.Exception e0){
          }
          if (p1.containsKey(this) && e0.containsKey(p1.get(this))) {
             obj1 = e0.get(p1.get(this));
          }
          if (obj1 == null && this.p(p1)) {
             obj1 = this.l(this.b(p1), 0, e0);
          }
          p1 = this.A(this.n(obj1, p1), p1, p2);
          if (p1 != null) {
             goto label_00c5 ;
          }
       }
       return p0;
    }
    public final Object n(Object p0,LinkedTreeMap p1){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       String obj = PatchProxy.applyTwoRefs(p0, p1, this, uoc, "12");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (p0 != null) {
          obj = PatchProxy.applyOneRefs(p1, this, uoc, "21");
          String str = "keyMore";
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(p1.containsKey(str) && !q.f(p1.get(str))){
             b = true;
          }else {
             b = false;
          }
          if (b) {
             Map obj1 = PatchProxy.applyOneRefs(p1, this, uoc, "22");
             if (obj1 != patchProxyRe) {
             }else {
                obj1 = p1.get(str);
             }
             Iterator iterator = obj1.iterator();
             int i = p0;
             while (iterator.hasNext()) {
                obj1 = iterator.next();
                obj = "key";
                Gson gson = null;
                if (obj1.containsKey(obj) && obj1.get(obj) != null) {
                   try{
                      if (i instanceof Map) {
                         gson = i;
                      }else if(i instanceof String){
                         gson = a.a.h(i, Map.class);
                      }
                      if (gson != null) {
                         i = gson.get(obj1.get(obj));
                      }
                   }catch(java.lang.Exception e0){
                      return p0;
                   }
                }else {
                   obj = "index";
                   if (obj1.containsKey(obj) && obj1.get(obj) != null) {
                      try{
                         if (i instanceof ArrayList) {
                            gson = i;
                         }else if(i instanceof String){
                            gson = a.a.h(i, ArrayList.class);
                         }
                         if (gson != null) {
                            i = gson.get(obj1.get(obj).intValue());
                         }
                      }catch(java.lang.Exception e0){
                         return p0;
                      }
                   }
                }
             }
             p0 = i;
          }
       }
       return p0;
    }
    public final boolean o(LinkedTreeMap p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.r(p0, "key");
    }
    public final boolean p(LinkedTreeMap p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0.containsKey("keys")) {
          if (p0.get("keys") instanceof ArrayList) {
             if (!q.f(p0.get("keys")) && p0.get("keys").get(0) instanceof String) {
                return true;
             }else {
                a.M().E("参数keys是字符串数组，请检查配置是否正确");
             }
          }else {
             a.M().E("参数keys是字符串数组，请检查配置是否正确");
          }
       }
       return 0;
    }
    public final boolean q(LinkedTreeMap p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.r(p0, "placeHolder");
    }
    public final boolean r(LinkedTreeMap p0,String p1){
       String obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0.containsKey(p1)) {
          obj = "参数"+p1+"是字符串，请检查配置是否正确";
          if (p0.get(p1) instanceof String) {
             return true;
          }else {
             a.M().E(obj);
          }
       }
       return false;
    }
    public final boolean s(LinkedTreeMap p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0.containsKey("switch") && !q.h(p0.get("switch")))? true: false;
       return b;
    }
    public final boolean t(LinkedTreeMap p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.s(p0) && p0.get("switch").containsKey("less"))? true: false;
       return b;
    }
    public final boolean u(LinkedTreeMap p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.r(p0, "url");
    }
    public final String v(String p0,LinkedTreeMap p1,ArrayList p2){
       Map$Entry obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, c.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Iterator iterator = p1.entrySet().iterator();
       while (iterator.hasNext()) {
          obj = iterator.next();
          String key = obj.getKey();
          if (!key.equals("url") && (key.equals("action") || (key.equals("params") || (p2 != null && !p2.contains(obj.getKey()))))) {
             continue ;
          }else {
             key = "?";
             if (!p0.contains(key)) {
                p0 = p0+key;
             }
             p0 = p0+obj.getKey()+"="+obj.getValue()+"&";
          }
       }
       if (p0.endsWith("&")) {
          p0 = p0.substring(0, (p0.length() - 1));
       }
       return p0;
    }
    public void w(){
       if (PatchProxy.applyVoid(null, this, c.class, "5")) {
          return;
       }
       _monitor_enter(this);
       this.a = true;
       this.notifyAll();
       _monitor_exit(this);
       return;
    }
    public final LinkedTreeMap x(LinkedTreeMap p0,LaunchModel p1){
       LinkedTreeMap obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LinkedTreeMap();
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          Object obj1 = this.y(uEntry.getValue(), p1);
          if (obj1 != null) {
             obj.put(uEntry.getKey(), obj1);
          }
       }
       return obj;
    }
    public Object y(Object p0,LaunchModel p1){
       Object[] objArray;
       boolean b1;
       Object[] objArray2;
       Gson a;
       ArrayList obj9;
       Object obj10;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       Object[] obj = PatchProxy.applyTwoRefs(p0, p1, this, uoc, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       String str = null;
       if (p0 instanceof LinkedTreeMap) {
          obj = str;
       }else if(p0 instanceof ArrayList){
          Object obj11 = p0;
          p0 = str;
       }else {
          return p0;
       }
       boolean b = false;
       if (p0 != null && p0.containsKey("action")) {
          if (!p0.get("action") instanceof Number) {
             a.M().E("Action 必须是Number类型："+p0.get("action"));
             return str;
          }else {
             boolean i = p0.get("action").intValue();
             int i1 = 1;
             if (i != i1) {
                String str1 = 2;
                long l = -1002;
                if (i != str1) {
                   if (i != 3) {
                      if (i != 4) {
                         if (i != 5) {
                            a.M().E("Action是个错误值："+p0.get("action").intValue());
                            a.M().c0(l, p1.a(), "Action是个错误值："+p0.get("action").intValue());
                            return str;
                         }else if(this.u(p0) || this.q(p0)){
                            if (this.q(p0) && !TextUtils.x(this.c(p0))) {
                               b = true;
                            }
                            String str2 = (b)? this.c(p0): this.k(p0);
                            LinkedTreeMap linkedTreeMa = this.x(p0, p1);
                            str2 = this.z(str2, linkedTreeMa, b);
                            if (b) {
                               return str2;
                            }else {
                               str = this.v(str2, linkedTreeMa, p0.get("params"));
                            }
                         }else {
                            a.M().c0(l, p1.a(), "Action为5时，缺少placeHolder或url参数");
                            a.M().E("Action为5时，缺少placeHolder或url参数");
                         }
                         return str;
                      }else {
                         obj = new Object[i1];
                         obj[b] = str;
                         try{
                            ReactApplicationContext obj1 = PatchProxy.applyOneRefs(p0, this, uoc, "48");
                            if (obj1 != patchProxyRe) {
                               b1 = obj1.booleanValue();
                            }else {
                               str = "android";
                               b1 = (p0.containsKey(str) && !q.h(p0.get(str)))? true: false;
                            }
                            if (b1) {
                               obj1 = new ReactApplicationContext(c.b().d());
                               Field declaredFiel = ReactContext.class.getDeclaredField("mCurrentActivity");
                               declaredFiel.setAccessible(i1);
                               declaredFiel.set(obj1, new WeakReference(ActivityContext.g().e()));
                               ArrayList obj2 = PatchProxy.applyOneRefs(p0, this, uoc, "50");
                               if (obj2 == patchProxyRe) {
                                  obj2 = p0.get("android").get("class");
                               }
                               Object[] objArray1 = new Object[i1];
                               objArray1[b] = obj1;
                               object obj3 = a.l(obj2, objArray1);
                               obj2 = this.e(p0);
                               if (obj2 != null) {
                                  ArrayList uArrayList = new ArrayList();
                                  Iterator iterator = obj2.iterator();
                                  while (iterator.hasNext()) {
                                     uArrayList.add(this.y(iterator.next(), p1));
                                  }
                                  if (uArrayList.contains("callback")) {
                                     uArrayList.remove("callback");
                                     if (q.f(uArrayList)) {
                                        objArray = new Object[i1];
                                        objArray[b] = new k(obj);
                                        a.a(obj3, this.d(p0), objArray);
                                     }else {
                                        objArray2 = new Object[str1];
                                        objArray2[b] = uArrayList.toArray();
                                        objArray2[i1] = new j(obj);
                                        a.a(obj3, this.d(p0), objArray2);
                                     }
                                  }else if(uArrayList.contains("promise")){
                                     uArrayList.remove("promise");
                                     if (q.f(uArrayList)) {
                                        objArray = new Object[i1];
                                        objArray[b] = new c$c(this, obj);
                                        a.a(obj3, this.d(p0), objArray);
                                     }else {
                                        objArray2 = new Object[str1];
                                        objArray2[b] = uArrayList.toArray();
                                        objArray2[i1] = new c$d(this, obj);
                                        a.a(obj3, this.d(p0), objArray2);
                                     }
                                  }else {
                                     obj[b] = a.a(obj3, this.d(p0), this.e(p0).toArray());
                                  }
                               }else {
                                  objArray2 = new Object[b];
                                  obj[b] = a.a(obj3, this.d(p0), objArray2);
                               }
                               obj3 = obj[b];
                               Object obj4 = PatchProxy.applyOneRefs(p0, this, uoc, "49");
                               if (obj4 != patchProxyRe) {
                               }else {
                                  obj4 = p0.get("android");
                               }
                               return this.m(obj3, obj4, p1);
                            }
                         }catch(java.lang.Exception e13){
                            objArray = new Object[b];
                            a.D().t("KrnNetwork", "KrnPreRequest getValueByReflect Exception: "+e13.toString(), objArray);
                            a.M().c0(l, p1.a(), "Action为4时，反射失败："+e13.toString());
                         }
                         return obj[b];
                      }
                   }else {
                      a obj5 = PatchProxy.applyOneRefs(p0, this, uoc, "42");
                      i = (obj5 != patchProxyRe)? obj5.booleanValue(): this.r(p0, "namespace");
                      if (i) {
                         obj5 = PatchProxy.applyOneRefs(p0, this, uoc, "44");
                         i = (obj5 != patchProxyRe)? obj5.booleanValue(): this.r(p0, "method");
                         if (i) {
                            try{
                            label_02e1 :
                               obj5 = new a(p1);
                               Object obj6 = PatchProxy.applyOneRefs(p0, this, uoc, "43");
                               if (obj6 == patchProxyRe) {
                                  obj6 = p0.get("namespace");
                               }
                               Object obj7 = PatchProxy.applyOneRefs(p0, this, uoc, "45");
                               if (obj7 == patchProxyRe) {
                                  obj7 = p0.get("method");
                               }
                               a = a.a;
                               Object obj8 = PatchProxy.applyOneRefs(p0, this, uoc, "47");
                               if (obj8 != patchProxyRe) {
                               }else {
                                  obj8 = p0.get("params");
                               }
                               a.f(obj5, obj6, obj7, a.q(obj8), new c$b(this, p1));
                            }catch(java.lang.Exception e0){
                               this.b = str;
                               this.w();
                            }
                            _monitor_enter(this);
                            if (PatchProxy.applyVoid(str, this, uoc, "4")) {
                               _monitor_exit(this);
                            label_0364 :
                               return this.m(this.b, p0, p1);
                            }
                            while (this.a == null) {
                               try{
                                  this.wait();
                               }catch(java.lang.InterruptedException e0){
                                  Object[] objArray3 = new Object[b];
                                  a.D().t("KrnNetwork", "Interrupted: "+e0, objArray3);
                                  goto label_033d ;
                               }
                            }
                            _monitor_exit(this);
                            goto label_0364 ;
                         }
                      }
                      a.M().c0(l, p1.a(), "Action为3时，缺少namespace或method参数");
                      a.M().E("Action为3时，缺少namespace或method参数");
                      goto label_02e1 ;
                   }
                }else if(this.u(p0)){
                   str = this.v(this.k(p0), this.x(p0, p1), str);
                }else {
                   a.M().c0(l, p1.a(), "Action为2时，缺少url参数");
                   a.M().E("Action为2时，缺少url参数");
                }
                return str;
             }else if(this.o(p0)){
                _monitor_enter(uoc);
                obj9 = PatchProxy.applyOneRefs(p0, this, uoc, "17");
                if (obj9 != patchProxyRe) {
                }else {
                   obj9 = p0.get("key");
                }
                Object[] objArray4 = new Object[b];
                a.D().w("KrnNetwork", "key="+obj9+",action 1 paramsMap ="+p0.toString(), objArray4);
                if (("BundleVersionCode").equals(obj9)) {
                   int i2 = a.M().K(p1);
                   if (i2 != -1) {
                      str = Integer.valueOf(i2);
                   }
                }else {
                   obj10 = p1.g().get(obj9);
                   objArray4 = new Object[b];
                   a.D().w("KrnNetwork", "key="+obj9, objArray4);
                   if (("activityId").equals(obj9)) {
                      objArray2 = new Object[b];
                      a.D().w("KrnNetwork", "result="+obj10+",model="+p1.g().toString(), objArray2);
                   }
                   str = obj10;
                }
                _monitor_exit(uoc);
             }
             if (str == null && this.p(p0)) {
                Iterator iterator1 = this.b(p0).iterator();
                while (iterator1.hasNext()) {
                   str = p1.g().get(iterator1.next());
                   if (str == null) {
                   }
                }
             }
             objArray = new Object[b];
             a.D().w("KrnNetwork", "result="+str+",model="+p1.g().toString(), objArray);
             obj10 = this.n(str, p0);
             objArray = new Object[b];
             a.D().w("KrnNetwork", "result="+obj10+",model="+p1.g().toString(), objArray);
             p0 = this.A(obj10, p0, p1);
             obj = new Object[b];
             a.D().w("KrnNetwork", "result="+p0+",model="+p1.g().toString(), obj);
             return p0;
          }
       }else if(p0 != null){
          return this.x(p0, p1);
       }else if(obj){
          p0 = PatchProxy.applyTwoRefs(obj, p1, this, uoc, "7");
          if (p0 != patchProxyRe) {
             obj9 = p0;
          }else {
             p0 = new ArrayList();
             while (b < obj.size()) {
                if (obj.get(b) instanceof Map) {
                   obj10 = this.y(obj.get(b), p1);
                   if (obj10 != null) {
                      p0.add(obj10);
                   }
                }
                b = b + 1;
             }
             if (!q.f(p0)) {
                obj9 = p0;
             }
          }
          return obj9;
       }else {
          return str;
       }
    }
    public String z(String p0,LinkedTreeMap p1,boolean p2){
       Matcher obj;
       if (PatchProxy.isSupport(c.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, c.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = Pattern.compile("\\$\\{.+?\\}").matcher(p0);
       while (obj.find()) {
          String str = obj.group();
          int i = str.length() - 1;
          String str1 = str.substring(2, i);
          String obj1 = p1.get(str1);
          if (obj1 != null) {
             p0 = p0.replace(str, String.valueOf(obj1));
          }else {
             obj1 = "";
             if (p2) {
                p0 = p0.replace(str, obj1);
             }else if(p0.contains("/")){
                String str2 = "/\\w*\\$\\{";
                p0 = (p0.replaceAll(str2+str1+"\\}\\w*/", "/")).replaceAll(str2+str1+"\\}\\w*", obj1);
             }else {
                p0 = p0.replace(str, obj1);
             }
          }
          this.z(p0, p1, p2);
       }
       return p0;
    }
}
