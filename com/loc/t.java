package com.loc.t;
import com.loc.t$b;
import com.loc.t$d;
import com.loc.t$a;
import android.content.Context;
import com.loc.w;
import com.loc.u;
import com.loc.t$c;
import org.json.JSONObject;
import java.lang.String;
import java.lang.Object;
import com.loc.cj;
import com.loc.t$2;
import com.loc.ck;
import com.loc.cl;
import com.loc.t$1;
import com.loc.l;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.System;
import java.lang.Boolean;
import java.lang.StringBuilder;
import java.io.File;
import java.lang.Throwable;
import com.loc.av;
import java.io.FileOutputStream;
import java.lang.Long;
import java.util.Iterator;
import java.io.FileInputStream;
import com.loc.ap;
import com.loc.bg;
import com.loc.bl;
import com.loc.bm;
import com.loc.x;

public final class t	// class@00146b
{
    public static t$b a;
    public static t$d b;
    public static String c;
    public static String d;
    public static long e;
    public static t$a f;
    public static long g;
    public static String h;
    public static String i;
    public static long j;
    public static long k;
    public static boolean l;
    public static boolean m;

    static {
       t.a = t$b.a;
       t.b = t$d.a;
       t.c = "";
       t.d = "";
       t.e = -1;
       t.f = t$a.a;
       t.g = -1;
       t.h = "";
       t.i = "";
       t.j = 0;
       t.k = 0;
       t.l = false;
       t.m = true;
    }
    public static synchronized u a(Context p0,w p1){
       t$b uob;
       _monitor_enter(t.class);
       t$c uoc = null;
       if (p0 == null || p1 == null) {
          _monitor_exit(t.class);
          return new u(t$c.i, p1);
       }else if(!t.l){
          t.e(p0);
          t.l = true;
       }
       if (t.b != t$d.c) {
          if (t.b == t$d.a) {
             uoc = new u(t$c.b, p1);
          }else if(t.b == t$d.b){
             uoc = new u(t$c.c, p1);
          }
          uob = null;
       }else {
          uob = 1;
       }
       if (uob == true && t.a != t$b.c) {
          if (t.a == t$b.a) {
             uoc = new u(t$c.d, p1);
          }else if(t.a == t$b.b){
             uoc = new u(t$c.e, p1);
          }
          uob = null;
       }
       if (uob == true && t.f != t$a.c) {
          if (t.f == t$a.a) {
             uoc = new u(t$c.f, p1);
          }else if(t.f == t$a.b){
             uoc = new u(t$c.g, p1);
          }
          uob = null;
       }
       if (t.k - t.j) {
          t.k = t.j;
          JSONObject jSONObject = new JSONObject();
          jSONObject.put("privacyInfo", t.a.a());
          jSONObject.put("privacyShow", t.b.a());
          jSONObject.put("showTime", t.e);
          jSONObject.put("show2SDK", t.c);
          jSONObject.put("show2SDKVer", t.d);
          jSONObject.put("privacyAgree", t.f.a());
          jSONObject.put("agreeTime", t.g);
          jSONObject.put("agree2SDK", t.h);
          jSONObject.put("agree2SDKVer", t.i);
          t$2 u2 = new t$2(t.m, p0, t.j, jSONObject);
          cj.a().b(v12);
       }else if(t.m){
          cj.a().b(new t$1(p0));
       }
       t.m = false;
       String str = l.f(p0);
       if (str == null || str.length() <= 0) {
          uoc = new u(t$c.h, p1);
          p1.a();
          Object[] objArray = new Object[]{Integer.valueOf(uoc.a.a()),uoc.b};
          String.format("获取apikey失败：\nerrorCode : %d\n原因：%s", objArray);
       }
       if (uob != null) {
          uoc = new u(t$c.a, p1);
       }else {
          p1.a();
          Object[] objArray1 = new Object[]{Integer.valueOf(uoc.a.a()),uoc.b};
          String.format("隐私合规校验失败：\nerrorCode : %d\n原因：%s", objArray1);
       }
       _monitor_exit(t.class);
       return uoc;
    }
    public static String a(long p0){
       return t.b(p0);
    }
    public static String a(Context p0){
       return t.f(p0);
    }
    public static ArrayList a(String p0){
       return t.b(p0);
    }
    public static synchronized void a(Context p0,t$a p1,w p2){
       _monitor_enter(t.class);
       if (p0 == null || p2 == null) {
          _monitor_exit(t.class);
          return;
       }else if(!t.l){
          t.e(p0);
          t.l = true;
       }
       if (p1 != t.f) {
          t.f = p1;
          t.h = p2.a();
          t.i = p2.b();
          long l = System.currentTimeMillis();
          t.g = l;
          t.j = l;
          t.d(p0);
       }
       _monitor_exit(t.class);
       return;
    }
    public static synchronized void a(Context p0,t$d p1,t$b p2,w p3){
       _monitor_enter(t.class);
       if (p0 == null || p3 == null) {
          _monitor_exit(t.class);
          return;
       }else if(!t.l){
          t.e(p0);
          t.l = true;
       }
       Boolean fALSE = Boolean.FALSE;
       if (p1 != t.b) {
          fALSE = Boolean.TRUE;
          t.b = p1;
       }
       if (p2 != t.a) {
          fALSE = Boolean.TRUE;
          t.a = p2;
       }
       if (fALSE.booleanValue()) {
          t.c = p3.a();
          t.d = p3.b();
          long l = System.currentTimeMillis();
          t.e = l;
          t.j = l;
          t.d(p0);
       }
       _monitor_exit(t.class);
       return;
    }
    public static void a(Context p0,String p1){
       if (p1 == null || !p1.length()) {
          return;
       }
       File uFile = new File(t.f(p0)+"/"+p1);
       if (!uFile.exists()) {
          return;
       }
       File uFile1 = new File(t.g(p0)+"/"+p1);
       if (!uFile1.getParentFile().exists()) {
          uFile1.getParentFile().mkdirs();
       }
       uFile.renameTo(uFile1);
       return;
    }
    public static void a(Context p0,JSONObject p1,long p2){
       byte[] uobyteArray = av.a(p0, (p1.toString()).getBytes());
       File uFile = new File(t.f(p0)+"/"+t.b(p2));
       if (!uFile.getParentFile().exists()) {
          uFile.getParentFile().mkdirs();
       }
       FileOutputStream uFileOutputS = new FileOutputStream(uFile);
       uFileOutputS.write(uobyteArray);
       uFileOutputS.close();
       return;
    }
    public static void a(Context p0,boolean p1,w p2){
       t$a c = (p1)? t$a.c: t$a.b;
       t.a(p0, c, p2);
       return;
    }
    public static void a(Context p0,boolean p1,boolean p2,w p3){
       t$d c = (p2)? t$d.c: t$d.b;
       t$b c1 = (p1)? t$b.c: t$b.b;
       t.a(p0, c, c1, p3);
       return;
    }
    public static boolean a(Context p0,JSONObject p1){
       return t.b(p0, p1);
    }
    public static String b(long p0){
       Object[] objArray = new Object[]{Long.valueOf(p0),"privacy.data"};
       return String.format("%d-%s", objArray);
    }
    public static ArrayList b(String p0){
       ArrayList uArrayList = new ArrayList();
       if (p0 != null && p0.length()) {
          File uFile = new File(p0);
          if (!uFile.exists()) {
             return uArrayList;
          }else {
             File[] uFileArray = uFile.listFiles();
             int i = 0;
             while (i < uFileArray.length) {
                object oobject = uFileArray[i];
                if (oobject.isFile()) {
                   uArrayList.add(oobject);
                }
                i = i + 1;
             }
          }
       }
       return uArrayList;
    }
    public static void b(Context p0){
       Iterator iterator = t.b(t.g(p0)).iterator();
       while (iterator.hasNext()) {
          File uFile = iterator.next();
          String name = uFile.getName();
          if (name.endsWith("-privacy.data")) {
             String[] stringArray = name.split("-");
             if (stringArray != null || (stringArray.length == 2 && Long.parseLong(stringArray[0]) > 0)) {
                FileInputStream uFileInputSt = new FileInputStream(uFile);
                byte[] uobyteArray = new byte[uFileInputSt.available()];
                uFileInputSt.read(uobyteArray);
                byte[] uobyteArray1 = av.b(p0, uobyteArray);
                String str = new String(uobyteArray1);
                if (!t.b(p0, new JSONObject(str))) {
                }
             }
          }
          uFile.delete();
       }
       return;
    }
    public static void b(Context p0,String p1){
       if (p1 == null || !p1.length()) {
          return;
       }
       File uFile = new File(t.f(p0)+"/"+p1);
       if (!uFile.exists()) {
          return;
       }
       uFile.delete();
       return;
    }
    public static boolean b(Context p0,JSONObject p1){
       boolean b = false;
       ap uoap = new ap();
       uoap.b = p0;
       uoap.a = p1;
       bg uobg = new bg();
       bm uobm = bg.a(uoap);
       if (uobm != null) {
          JSONObject jSONObject = new JSONObject(x.a(uobm.a));
          if (jSONObject.has("status") && jSONObject.getInt("status") == 1) {
             b = true;
          }
       }
       return b;
    }
    public static void c(Context p0){
       t.d(p0);
    }
    public static synchronized void d(Context p0){
       _monitor_enter(t.class);
       if (p0 == null) {
          _monitor_exit(t.class);
          return;
       }else {
          boolean b = true;
          if (!t.l) {
             t.e(p0);
             t.l = b;
          }
          Object[] objArray = new Object[11];
          objArray[0] = Integer.valueOf(t.a.a());
          objArray[b] = Integer.valueOf(t.b.a());
          objArray[2] = Long.valueOf(t.e);
          objArray[3] = t.c;
          objArray[4] = t.d;
          objArray[5] = Integer.valueOf(t.f.a());
          objArray[6] = Long.valueOf(t.g);
          objArray[7] = t.h;
          objArray[8] = t.i;
          objArray[9] = Long.valueOf(t.j);
          objArray[10] = Long.valueOf(t.k);
          av.a(p0, "AMap.privacy.data", "AMap.privacy.data", String.format("%d&%d&%d&%s&%s&%d&%d&%s&%s&%d&%d", objArray));
          _monitor_exit(t.class);
          return;
       }
    }
    public static void e(Context p0){
       String str = "AMap.privacy.data";
       if (p0 == null) {
          return;
       }
       String str1 = av.a(p0, str, str);
       if (str1 == null) {
          return;
       }
       String[] stringArray = str1.split("&");
       if (stringArray.length != 11) {
          return;
       }
       t.a = t$b.a(Integer.parseInt(stringArray[0]));
       t.b = t$d.a(Integer.parseInt(stringArray[1]));
       t.e = Long.parseLong(stringArray[2]);
       t.d = stringArray[3];
       t.d = stringArray[4];
       t.f = t$a.a(Integer.parseInt(stringArray[5]));
       t.g = Long.parseLong(stringArray[6]);
       t.h = stringArray[7];
       t.i = stringArray[8];
       t.j = Long.parseLong(stringArray[9]);
       t.k = Long.parseLong(stringArray[10]);
       return;
    }
    public static String f(Context p0){
       return p0.getFilesDir().getAbsolutePath()+"/AMap/Privacy/Upload";
    }
    public static String g(Context p0){
       return p0.getFilesDir().getAbsolutePath()+"/AMap/Privacy/Reload";
    }
}
