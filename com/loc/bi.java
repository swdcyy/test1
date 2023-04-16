package com.loc.bi;
import java.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Random;
import java.lang.String;
import java.lang.System;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.loc.m;
import java.lang.Object;
import android.content.Context;
import com.loc.av;
import org.json.JSONObject;
import java.lang.Throwable;
import com.loc.ak;
import com.loc.bi$c;
import com.loc.k;
import com.loc.bs;
import org.json.JSONArray;
import java.util.HashMap;
import com.loc.bi$a;
import com.loc.w;
import android.content.SharedPreferences$Editor;
import com.loc.ag;
import java.lang.StringBuilder;
import com.loc.br;
import java.net.URL;
import com.loc.bm;
import java.util.Map;
import java.lang.Integer;
import com.loc.bi$b;
import android.os.SystemClock;
import java.lang.Long;
import android.net.Uri;
import java.util.Calendar;
import com.loc.x;
import java.util.UUID;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import android.net.Uri$Builder;
import java.util.Collection;

public final class bi	// class@001394
{
    public static ConcurrentHashMap a;
    public static List b;
    public static ConcurrentHashMap c;
    public static Random d;
    public static ConcurrentHashMap e;
    public static List f;

    static {
       bi.a = new ConcurrentHashMap(8);
       bi.b = Collections.synchronizedList(new ArrayList(8));
       bi.c = new ConcurrentHashMap(8);
       bi.d = new Random();
       bi.e = new ConcurrentHashMap(8);
       bi.f = Collections.synchronizedList(new ArrayList(16));
    }
    public static synchronized String a(String p0,String p1){
       _monitor_enter(bi.class);
       try{
          System.currentTimeMillis();
          if (TextUtils.isEmpty(p1) || TextUtils.isEmpty(p0)) {
             _monitor_exit(bi.class);
             return p0;
          }else {
             Context c = m.c;
             if (bi.b == null) {
                bi.b = Collections.synchronizedList(new ArrayList(8));
             }
             if (c != null && !bi.b.contains(p1)) {
                bi.b.add(p1);
                String str = av.a(c, "Yb3Blbl9odHRwX2NvbnRyb2w", p1);
                if (!TextUtils.isEmpty(str)) {
                   bi.a(p1, new JSONObject(str));
                }
             }
             try{
                if (bi.a == null || bi.a.size() <= 0) {
                   _monitor_exit(bi.class);
                   return p0;
                }else if(!bi.a.containsKey(p1)){
                   _monitor_exit(bi.class);
                   return p0;
                }else {
                   bi$c uoc = bi.a.get(p1);
                   if (uoc == null) {
                      _monitor_exit(bi.class);
                      return p0;
                   }else if(!bi.a(p0, uoc, p1)){
                      _monitor_exit(bi.class);
                      return bi.b(p0, uoc, p1);
                   }else {
                      throw new k("·þÎñQPS³¬ÏÞ");
                   }
                }
             }catch(com.loc.k e4){
                throw e4;
             }
          }
       }catch(com.loc.k e4){
       }
    }
    public static void a(){
       Context c = m.c;
       if (c == null) {
          return;
       }
       bs.a(bi.b(), c);
       return;
    }
    public static void a(bi$c p0,JSONObject p1){
       JSONArray jSONArray = p1.optJSONArray("block");
       if (jSONArray == null) {
          return;
       }
       HashMap hashMap = new HashMap(8);
       int i = 0;
       while (i < jSONArray.length()) {
          JSONObject jSONObject = jSONArray.optJSONObject(i);
          if (jSONObject != null) {
             String str = jSONObject.optString("api");
             if (!TextUtils.isEmpty(str)) {
                if (!str.startsWith("/")) {
                   str = "/".concat(str);
                }
                if (str.endsWith("/")) {
                   int i1 = str.length() - 1;
                   str = str.substring(0, i1);
                }
                JSONArray jSONArray1 = jSONObject.optJSONArray("periods");
                ArrayList uArrayList = new ArrayList();
                int i2 = 0;
                while (i2 < jSONArray1.length()) {
                   JSONObject jSONObject1 = jSONArray1.optJSONObject(i2);
                   if (jSONObject1 != null) {
                      bi$a uoa = new bi$a(0);
                      uoa.a = jSONObject1.optString("begin");
                      uoa.b = jSONObject1.optInt("duration");
                      uoa.c = jSONObject1.optDouble("percent");
                      uArrayList.add(uoa);
                   }
                   i2 = i2 + 1;
                }
                hashMap.put(str, uArrayList);
             }
          }
          i = i + 1;
       }
       p0.a = hashMap;
       return;
    }
    public static synchronized void a(w p0,JSONObject p1){
       _monitor_enter(bi.class);
       if (p0 == null) {
          _monitor_exit(bi.class);
          return;
       }else {
          String str = p0.a();
          if (TextUtils.isEmpty(str)) {
             _monitor_exit(bi.class);
             return;
          }else if(p1 == null){
             bi.a(str);
          }
          if (!m.a(p1.optString("able", null), false)) {
             bi.a(str);
             _monitor_exit(bi.class);
             return;
          }else {
             av.a(m.c, "Yb3Blbl9odHRwX2NvbnRyb2w", str, p1.toString());
             bi.a(str, p1);
             _monitor_exit(bi.class);
             return;
          }
       }
    }
    public static synchronized void a(String p0){
       _monitor_enter(bi.class);
       if (bi.a.containsKey(p0)) {
          bi.a.remove(p0);
       }
       SharedPreferences$Editor uEditor = av.a(m.c, "Yb3Blbl9odHRwX2NvbnRyb2w");
       av.a(uEditor, p0);
       av.a(uEditor);
       _monitor_exit(bi.class);
       return;
    }
    public static void a(String p0,bi$c p1){
       if (bi.a == null) {
          bi.a = new ConcurrentHashMap(8);
       }
       bi.a.put(p0, p1);
       return;
    }
    public static void a(String p0,String p1,String p2){
       Context c = m.c;
       if (c == null || TextUtils.isEmpty(p0)) {
          return;
       }
       if (bi.e == null) {
          bi.e = new ConcurrentHashMap(8);
       }
       ConcurrentHashMap e = bi.e;
       _monitor_enter(e);
       if (bi.e.containsKey(p1)) {
          _monitor_exit(e);
          return;
       }else {
          bi.e.put(p1, p2);
          _monitor_exit(e);
          JSONObject jSONObject = new JSONObject();
          jSONObject.put("timestamp", System.currentTimeMillis());
          jSONObject.put("type", ag.j);
          jSONObject.put("name", p0);
          jSONObject.put("version", ag.a(p0));
          jSONObject.put("hostname", p1+"#"+p2);
          p0 = jSONObject.toString();
          if (TextUtils.isEmpty(p0)) {
             return;
          }else {
             br uobr = new br(c, "core", "2.0", "O005");
             uobr.a(p0);
             bs.a(uobr, c);
             return;
          }
       }
    }
    public static void a(String p0,JSONObject p1){
       bi$c uoc = new bi$c(0);
       bi.a(uoc, p1);
       bi.b(uoc, p1);
       if (uoc.b == null && uoc.a == null) {
          bi.a(p0);
          return;
       }else {
          bi.a(p0, uoc);
          return;
       }
    }
    public static void a(URL p0,bm p1){
       String str = "nb";
       if (bi.c == null) {
          bi.c = new ConcurrentHashMap(8);
       }
       bm b = p1.b;
       if (b != null && b.containsKey(str)) {
          List list = p1.b.get(str);
          if (list != null && list.size() > 0) {
             String[] stringArray = (list.get(0)).split("#");
             if (stringArray.length < 2) {
                return;
             }else {
                int i = Integer.parseInt(stringArray[0]);
                long l = (long)Integer.parseInt(stringArray[1]);
                bi$b uob = new bi$b(0);
                uob.a = p1;
                if (l <= 0) {
                   l = 30;
                }
                uob.b = SystemClock.elapsedRealtime() + (l * 1000);
                if (i == 1) {
                   bi.c.put("app", uob);
                   return;
                }else if(i == 2 && p0 != null){
                   bi.c.put(p0.getPath(), uob);
                }
             }
          }
       }
       return;
    }
    public static void a(boolean p0,String p1){
       Context c = m.c;
       if (c != null && !TextUtils.isEmpty(p1)) {
          JSONObject jSONObject = new JSONObject();
          jSONObject.put("timestamp", Long.valueOf(System.currentTimeMillis()));
          String str = "type";
          Integer g = (p0)? ag.g: ag.f;
          jSONObject.put(str, g);
          jSONObject.put("name", p1);
          jSONObject.put("version", ag.a(p1));
          br uobr = new br(c, "core", "2.0", "O005");
          uobr.a(jSONObject.toString());
          bs.a(uobr, c);
       }
       return;
    }
    public static void a(boolean p0,String p1,String p2,int p3){
       String str1;
       Integer i;
       Context c = m.c;
       if (c != null && (TextUtils.isEmpty(p1) || TextUtils.isEmpty(p2))) {
          return;
       }
       JSONObject jSONObject = new JSONObject();
       jSONObject.put("timestamp", System.currentTimeMillis());
       String str = ag.a(p1);
       if (p0) {
          str1 = "type";
          i = ag.i;
       }else {
          str1 = "type";
          i = ag.h;
       }
       jSONObject.put(str1, i);
       jSONObject.put("name", p1);
       jSONObject.put("version", str);
       jSONObject.put("uri", Uri.parse(p2).getPath());
       jSONObject.put("blockLevel", p3);
       str1 = jSONObject.toString();
       if (TextUtils.isEmpty(str1)) {
          return;
       }else {
          br uobr = new br(c, "core", "2.0", "O005");
          uobr.a(str1);
          if (bi.f == null) {
             bi.f = Collections.synchronizedList(new ArrayList(16));
          }
          List f = bi.f;
          _monitor_enter(f);
          bi.f.add(uobr);
          if (bi.f.size() >= 15) {
             bi.a();
          }
          _monitor_exit(f);
          return;
       }
    }
    public static boolean a(bi$a p0){
       if (p0 == null) {
          return false;
       }
       if (!p0.c - 0x3ff0000000000000) {
          return false;
       }
       long l = System.currentTimeMillis();
       if (!TextUtils.isEmpty(p0.a) && p0.b > null) {
          long l1 = l - x.a(p0.a, "HH:mm:ss").getTimeInMillis();
          if (l1 - null > 0 && l1 - (long)(p0.b * 1000) < 0) {
             if (!p0.c) {
                return true;
             }else if(bi.d == null){
                bi.d = new Random();
             }
             bi.d.setSeed(((long)UUID.randomUUID().hashCode() + l));
             if (bi.d.nextDouble() - p0.c > 0) {
                return true;
             }
          }
       }
       return false;
    }
    public static boolean a(String p0,bi$c p1,String p2){
       p1 = p1.a;
       if (p1 == null || p1.size() <= 0) {
          return false;
       }
       if (p1.containsKey("*")) {
          Iterator iterator = p1.entrySet().iterator();
          while (iterator.hasNext()) {
             if (bi.a(iterator.next().getValue())) {
                bi.a(false, p2, p0, 1);
                return 1;
             }
          }
       }else {
          String path = Uri.parse(p0).getPath();
          if (p1.containsKey(path) && bi.a(p1.get(path))) {
             bi.a(false, p2, p0, 2);
             return 1;
          }
       }
       return false;
    }
    public static boolean a(List p0){
       if (p0 != null && p0.size() > 0) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             if (bi.a(iterator.next())) {
                return true;
             }
          }
       }
       return false;
    }
    public static bm b(String p0,String p1){
       bi$b uob;
       bi$b a;
       String str = "app";
       if (bi.c == null) {
          return null;
       }
       if (bi.c.containsKey(str)) {
          uob = bi.c.get(str);
          if (SystemClock.elapsedRealtime() - uob.b <= 0) {
             a = uob.a;
             if (a != null) {
                a.e = false;
             }
             bi.a(true, p1, p0, true);
             return a;
          }else {
          label_002e :
             bi.c.remove(str);
          }
       }else if(TextUtils.isEmpty(p0)){
          return null;
       }else {
          Uri uri = Uri.parse(p0);
          if (uri != null) {
             str = uri.getPath();
             if (bi.c.containsKey(str)) {
                uob = bi.c.get(str);
                if (SystemClock.elapsedRealtime() - uob.b <= 0) {
                   a = uob.a;
                   if (a != null) {
                      a.e = false;
                   }
                   bi.a(true, p1, p0, 2);
                   return a;
                }else {
                   goto label_002e ;
                }
             }
          }
       }
       return null;
    }
    public static String b(String p0,bi$c p1,String p2){
       p1 = p1.b;
       if (p1 == null || p1.size() <= 0) {
          return p0;
       }
       Uri uri = Uri.parse(p0);
       String authority = uri.getAuthority();
       if (p1.containsKey(authority)) {
          String str = p1.get(authority);
          p0 = uri.buildUpon().authority(str).toString();
          bi.a(p2, authority, str);
       }
       return p0;
    }
    public static List b(){
       List list = null;
       List f = bi.f;
       _monitor_enter(f);
       List f1 = bi.f;
       if (f1 != null && f1.size() > 0) {
          ArrayList uArrayList = new ArrayList();
          uArrayList.addAll(bi.f);
          bi.f.clear();
          list = uArrayList;
       }
       _monitor_exit(f);
       return list;
    }
    public static void b(bi$c p0,JSONObject p1){
       p1 = p1.optJSONObject("domainMap");
       if (p1 == null) {
          return;
       }
       JSONArray jSONArray = p1.names();
       if (jSONArray == null) {
          return;
       }
       HashMap hashMap = new HashMap(8);
       int i = jSONArray.length();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          String str = jSONArray.optString(i1);
          hashMap.put(str, p1.optString(str));
       }
       p0.b = hashMap;
       return;
    }
}
