package com.kuaishou.krn.bridges.core.KrnCoreBridge;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.String;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.Promise;
import ui0.d;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import lj0.c;
import lj0.d;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Boolean;
import ri0.a;
import java.lang.Float;
import java.lang.Long;
import java.lang.Byte;
import java.lang.Short;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.Arguments;
import java.util.List;
import java.util.Map;
import com.facebook.react.bridge.WritableNativeMap;
import android.os.Bundle;
import java.lang.Number;
import java.lang.Double;
import com.facebook.react.bridge.WritableMap;
import java.util.HashMap;
import com.kuaishou.krn.c;
import com.kuaishou.krn.event.a;
import java.util.Objects;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import oj0.a;
import bj0.b;
import java.lang.StringBuilder;

public class KrnCoreBridge extends KrnBridge	// class@00080c
{

    public void KrnCoreBridge(ReactApplicationContext p0){
       super(p0);
    }
    public String getName(){
       return "KrnBridge";
    }
    public void getStorage(int p0,ReadableMap p1,Promise p2){
       d uod = d.class;
       if (PatchProxy.isSupport(KrnCoreBridge.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, KrnCoreBridge.class, "3")) {
          return;
       }
       String str = "0";
       if (p1 == null) {
          p2.reject(str, "params is null!");
          return;
       }else {
          String str1 = "level";
          if (p1.hasKey(str1)) {
             String str2 = "key";
             if (p1.hasKey(str2)) {
                c uoc = d.b(p0);
                if (uoc == null) {
                   p2.reject(str, "KrnContext is null");
                   return;
                }else {
                   str = p1.getString(str1);
                   str1 = p1.getString(str2);
                   str2 = "page";
                   String str3 = (p1.hasKey(str2))? p1.getString(str2): null;
                   if (TextUtils.isEmpty(str3)) {
                      str3 = uoc.p();
                   }
                   WritableNativeMap writableNati = d.a(str3, str, str1);
                   if (writableNati != null) {
                      str3 = PatchProxy.applyOneRefs(str, null, uod, "5");
                      boolean b = (str3 != PatchProxyResult.class)? str3.booleanValue(): TextUtils.equals(str, "memory");
                      if (b) {
                         WritableNativeArray writableNati1 = PatchProxy.applyOneRefs(writableNati, null, a.class, "3");
                         if (writableNati1 == PatchProxyResult.class) {
                            if (!writableNati instanceof Float && (!writableNati instanceof Long && (writableNati instanceof Byte || writableNati instanceof Short))) {
                               writableNati1 = Double.valueOf(writableNati.doubleValue());
                            }else if(writableNati.getClass().isArray()){
                               writableNati1 = Arguments.makeNativeArray(writableNati);
                            }else if(writableNati instanceof List){
                               writableNati1 = Arguments.makeNativeArray(writableNati);
                            }else if(writableNati instanceof Map){
                               writableNati1 = Arguments.makeNativeMap(writableNati);
                            }else if(writableNati instanceof Bundle){
                               writableNati = Arguments.makeNativeMap(writableNati);
                            }
                            writableNati1 = writableNati;
                         }
                         p2.resolve(writableNati1);
                      }else {
                         b = PatchProxy.applyOneRefs(str, null, uod, "4");
                         b = (b != PatchProxyResult.class)? b.booleanValue(): TextUtils.equals(str, "disk");
                         if (b) {
                            p2.resolve(this.convertObjToNativeMap(writableNati));
                         }
                      }
                   }else {
                      p2.resolve(Arguments.createMap());
                   }
                   return;
                }
             }
          }
          p2.reject(str, "level or key is null!");
          return;
       }
    }
    public void publish(int p0,ReadableMap p1,Promise p2){
       if (PatchProxy.isSupport(KrnCoreBridge.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, KrnCoreBridge.class, "1")) {
          return;
       }
       String str = "0";
       if (p1 == null) {
          p2.reject(str, "params is null!");
          return;
       }else {
          String str1 = "actionType";
          if (p1.hasKey(str1)) {
             String str2 = "action";
             if (p1.hasKey(str2)) {
                if (d.b(p0) == null) {
                   p2.reject(str, "KrnContext is null");
                   return;
                }else {
                   str = p1.getString(str1);
                   String str3 = p1.getString(str2);
                   Map map = p1.toHashMap().get("data");
                   if (TextUtils.equals(str, "js2js")) {
                      c.b().l(str3, map);
                   }else if(TextUtils.equals(str, "js2Native")){
                      a uoa = a.b();
                      Objects.requireNonNull(uoa);
                      if (!PatchProxy.applyVoidTwoRefs(str3, map, uoa, a.class, "3") && uoa.a.size() > 0) {
                         Iterator iterator = uoa.a.entrySet().iterator();
                         while (iterator.hasNext()) {
                            Map$Entry uEntry = iterator.next();
                            if (uEntry != null && (TextUtils.equals(str3, uEntry.getKey()) && uEntry.getValue() != null)) {
                               uEntry.getValue().W(map);
                            }
                         }
                      }
                   }
                   p2.resolve(this.convertObjToNativeMap(b.a));
                   return;
                }
             }
          }
          p2.reject(str, "actionType or action is null!");
          return;
       }
    }
    public void setStorage(int p0,ReadableMap p1,Promise p2){
       if (PatchProxy.isSupport(KrnCoreBridge.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, KrnCoreBridge.class, "2")) {
          return;
       }
       if (p1 == null) {
          p2.reject("0", "params is null!");
          return;
       }else {
          String str = "level";
          if (p1.hasKey(str)) {
             String str1 = "key";
             if (p1.hasKey(str1)) {
                c uoc = d.b(p0);
                if (uoc == null) {
                   p2.reject("0", "KrnContext is null");
                   return;
                }else if(d.b(uoc.p(), p1.getString(str), p1.getString(str1), this.toHashMap(p1).get("value"))){
                   p2.resolve(this.convertObjToNativeMap(b.a));
                }else {
                   StringBuilder str2 = "storage impl is null,only :";
                   Set set = PatchProxy.apply(null, null, d.class, "3");
                   if (set != PatchProxyResult.class) {
                   }else {
                      set = d.a.keySet();
                   }
                   p2.reject("0", str2+set);
                }
                return;
             }
          }
          p2.reject("0", "level or key is null!");
          return;
       }
    }
}
