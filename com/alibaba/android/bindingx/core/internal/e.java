package com.alibaba.android.bindingx.core.internal.e;
import java.lang.Object;
import org.json.JSONObject;
import java.util.Map;
import org.json.JSONArray;
import java.util.List;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.String;
import y5.h;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.view.View;
import android.util.Pair;
import java.lang.Float;

public final class e	// class@000e1f
{

    public static Object a(Object p0){
       if (p0 == JSONObject.NULL) {
          return null;
       }
       if (p0 instanceof JSONObject) {
          return e.l(p0);
       }
       if (p0 instanceof JSONArray) {
          p0 = e.k(p0);
       }
       return p0;
    }
    public static Map b(Map p0){
       Map map;
       p0 = p0.get("interceptors");
       if (p0 == null || !p0 instanceof Map) {
          return null;
       }
       HashMap hashMap = new HashMap(8);
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          Object key = uEntry.getKey();
          h value = uEntry.getValue();
          if (key instanceof String && value instanceof Map) {
             try{
                value = e.c(value, "expression");
             }catch(java.lang.Exception e0){
                map = e0;
             }
             if (map != null) {
                hashMap.put(key, map);
             }
          }
       }
       return hashMap;
    }
    public static h c(Map p0,String p1){
       p0 = p0.get(p1);
       if (p0 == null) {
          return null;
       }
       if (p0 instanceof String) {
          return h.a(null, p0);
       }
       if (!p0 instanceof Map) {
          return null;
       }
       JSONObject jSONObject = new JSONObject(p0);
       if (jSONObject == null) {
          return h.a(null, null);
       }
       String str = jSONObject.optString("origin", null);
       String str1 = jSONObject.optString("transformed", null);
       if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str1)) {
          return h.a(null, null);
       }
       return h.a(str, str1);
    }
    public static List d(Map p0){
       p0 = p0.get("props");
       if (p0 == null) {
          return null;
       }
       try{
          return p0;
       }catch(java.lang.Exception e0){
          return e0;
       }
    }
    public static String e(Map p0,String p1){
       p0 = p0.get(p1);
       if (p0 == null) {
          return null;
       }
       if (p0 instanceof String) {
          return p0;
       }
       return p0.toString();
    }
    public static ArrayList f(Object[] p0){
       ArrayList uArrayList = new ArrayList(p0.length);
       Collections.addAll(uArrayList, p0);
       return uArrayList;
    }
    public static HashSet g(Object[] p0){
       HashSet hashSet = new HashSet(p0.length);
       Collections.addAll(hashSet, p0);
       return hashSet;
    }
    public static float h(float p0){
       p0 = p0 % 360.00f;
       int i = 0;
       if ((v2 = p0 - i) >= 0) {
          if (v2 < 0 || p0 - 180.00f > 0) {
             p0 = (p0 % 180.00f) - 180.00f;
          }
       }else if(p0 - 0xc3340000 > 0 && p0 - i < 0){
          p0 = (p0 % 180.00f) + 180.00f;
       }
       return p0;
    }
    public static int i(Context p0,int p1){
       return (int)((c.c(p0.getApplicationContext().getResources()).density * (float)p1) * 5.00f);
    }
    public static Pair j(String p0,View p1){
       float f1;
       int height;
       Pair pair = null;
       if (TextUtils.isEmpty(p0)) {
          return pair;
       }
       int i = 32;
       int i1 = p0.indexOf(i);
       if (i1 != -1) {
          int i2 = i1;
          while (i2 < p0.length() && p0.charAt(i2) == i) {
             i2 = i2 + 1;
          }
          if (i2 < p0.length() && p0.charAt(i2) != i) {
             String str = (p0.substring(0, i1)).trim();
             p0 = (p0.substring(i2, p0.length())).trim();
             float f = 0;
             if (("left").equals(str)) {
                f1 = 0;
             }else if(("right").equals(str)){
                i = p1.getWidth();
             }else if("center".equals(str)){
                i = p1.getWidth() / 2;
             }else {
                i = p1.getWidth() / 2;
             }
             f1 = (float)i;
             if (!("top").equals(p0)) {
                if (("bottom").equals(p0)) {
                   height = p1.getHeight();
                }else if("center".equals(p0)){
                   height = p1.getHeight() / 2;
                }else {
                   height = p1.getHeight() / 2;
                }
                f = (float)height;
             }
             return new Pair(Float.valueOf(f1), Float.valueOf(f));
          }
       }
       return pair;
    }
    public static List k(JSONArray p0){
       if (p0 == null) {
          return Collections.emptyList();
       }
       ArrayList uArrayList = new ArrayList();
       for (int i = 0; i < p0.length(); i = i + 1) {
          uArrayList.add(e.a(p0.get(i)));
       }
       return uArrayList;
    }
    public static Map l(JSONObject p0){
       if (p0 == null) {
          return Collections.emptyMap();
       }
       HashMap hashMap = new HashMap();
       Iterator iterator = p0.keys();
       while (iterator.hasNext()) {
          String str = iterator.next();
          hashMap.put(str, e.a(p0.get(str)));
       }
       return hashMap;
    }
}
