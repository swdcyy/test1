package com.kuaishou.weapon.ks.bf;
import java.lang.Runnable;
import android.content.Context;
import java.lang.Object;
import java.util.HashMap;
import java.util.ArrayList;
import com.kuaishou.weapon.ks.x;
import com.kuaishou.weapon.ks.ah;
import com.kuaishou.weapon.ks.d;
import java.io.File;
import java.lang.String;
import java.lang.System;
import java.lang.StringBuilder;
import com.kuaishou.weapon.ks.j;
import java.net.URLEncoder;
import com.kuaishou.weapon.ks.aa;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.weapon.i.WeaponHI;
import com.kuaishou.weapon.ks.o;
import com.kuaishou.weapon.ks.g;
import com.kuaishou.weapon.ks.f;
import java.lang.Integer;
import com.kuaishou.weapon.ks.bf$a;
import java.util.Map;
import com.kuaishou.weapon.ks.bz;
import java.lang.Boolean;
import com.kuaishou.weapon.ks.bs;
import android.content.pm.PackageInfo;
import com.kuaishou.weapon.ks.ba;
import java.lang.Throwable;
import org.json.JSONObject;
import com.kuaishou.weapon.ks.bb;
import com.kuaishou.weapon.ks.bc;
import com.kuaishou.weapon.ks.bt;
import com.kuaishou.weapon.ks.q;
import android.accounts.NetworkErrorException;
import java.util.List;
import com.kuaishou.weapon.ks.br;
import java.util.Iterator;
import java.util.HashSet;
import com.kuaishou.weapon.ks.s;
import java.util.Collection;
import com.kuaishou.weapon.ks.z;
import java.lang.Exception;

public class bf implements Runnable	// class@0011e2
{
    public Map A;
    public Map B;
    public int C;
    public List l;
    public List m;
    public Context n;
    public x o;
    public ah p;
    public File q;
    public d r;
    public int v;
    public boolean w;
    public Map z;
    public static long s;
    public static boolean t;
    public static boolean u;
    public static int x;
    public static boolean y;

    public void bf(Context p0,int p1,boolean p2){
       super();
       this.v = 0;
       this.w = false;
       this.A = new HashMap();
       this.l = new ArrayList();
       this.m = new ArrayList();
       this.B = new HashMap();
       this.C = -2;
       this.n = p0;
       this.o = x.a(p0);
       this.p = ah.a(p0);
       this.r = d.a(p0);
       this.q = new File(p0.getFilesDir(), ".tmp");
       this.v = p1;
       this.w = p2;
    }
    public String a(String p0,String p1){
       String str = String.valueOf((System.currentTimeMillis() / 1000));
       return "appkey="+p0+"&secretkey="+URLEncoder.encode(p1, "utf-8")+"&timestamp="+str+"&sign="+j.a(p0+p1+str);
    }
    public final void a(aa p0){
       bf tB;
       long l;
       String str = "-";
       if (TextUtils.isEmpty(p0.j) || (p0.j).length() < 10) {
          this.o.a(p0.a, p0.d, null);
          return;
       }else if(!this.q.exists()){
          this.q.mkdir();
       }
       File uFile = new File(this.q, p0.a+str+p0.d+".tmp");
       File uFile1 = new File(this.q, p0.a+str+p0.d+".zip");
       WeaponHI.t7 = System.currentTimeMillis();
       boolean b = o.a(this.n, p0.i, uFile);
       if (!b) {
          b = o.a(this.n, p0.i, uFile);
       }
       WeaponHI.t8 = System.currentTimeMillis();
       if (b) {
          if (uFile1.exists()) {
             uFile1.delete();
          }
          int i = f.c(uFile.getAbsolutePath(), uFile1.getAbsolutePath(), g.a(("a3NyaXNrY3RsYnVzaW5zc3Z4cHprd3NwYWlvcXBrc3M=").getBytes("utf-8"), 2));
          if (i) {
             if (uFile1.exists()) {
                uFile1.delete();
             }
             b = false;
          }
          if (!i && uFile.exists()) {
             uFile.delete();
          }
       }else {
          this.B.put(Integer.valueOf(p0.a), new bf$a(this, 3));
       }
       String str1 = j.a(uFile1);
       if (b && (p0.j).equals(str1)) {
          boolean b1 = true;
          if ((p0.c).contains(".p0")) {
             this.r.a("plc001_p_v_r", bz.b(uFile1.getAbsolutePath()), b1);
          }
          bs.a(uFile1.getAbsolutePath(), Boolean.TRUE);
          p0.e = uFile1.getAbsolutePath();
          if (this.o.a(p0, null, null)) {
             tB = this.B;
             if (tB != null && !tB.containsKey(Integer.valueOf(p0.a))) {
                this.B.put(Integer.valueOf(p0.a), new bf$a(this, b1));
             }
          }else {
             tB = this.B;
             if (tB != null && !tB.containsKey(Integer.valueOf(p0.a))) {
                this.B.put(Integer.valueOf(p0.a), new bf$a(this, 4));
             }
             this.o.f();
             this.o.a(p0.a, p0.d, null);
          }
          WeaponHI.t9 = System.currentTimeMillis();
       }else if(uFile.exists()){
          l = uFile.length();
          uFile.delete();
       }else {
          l = -1;
       }
       this.o.f();
       this.o.a(p0.a, p0.d, null);
       HashMap hashMap = new HashMap();
       hashMap.put("e", ba.x);
       String str2 = "ret";
       String str3 = "1";
       str = (b)? str3: "0";
       hashMap.put(str2, str);
       str = "f";
       str2 = (uFile1.exists())? str3: "0";
       hashMap.put(str, str2);
       hashMap.put("am", p0.j);
       hashMap.put("acm", str1);
       hashMap.put("p", uFile1.getAbsolutePath());
       hashMap.put("len", l+"");
       hashMap.put("l", "T");
       str = "n";
       if (d.a(this.n).f("a1_p_s_p_s")) {
          str3 = "0";
       }
       hashMap.put(str, str3);
       bs.a(this.n, "1002001", hashMap);
       return;
    }
    public JSONObject b(String p0,String p1){
       String str = bb.a+bb.c;
       p0 = this.a(p0, p1);
       JSONObject jSONObject = bc.d(this.n);
       if (!TextUtils.isEmpty(p0)) {
          str = str+"?"+p0;
       }
       JSONObject jSONObject1 = new JSONObject();
       if (jSONObject != null) {
          jSONObject1.put("data", new bt(this.n).c(jSONObject.toString()));
       }
       q oq = new q(str, jSONObject1);
       oq.a(bs.f());
       oq.b(bs.f(this.n));
       jSONObject1 = o.a(this.n, oq);
       int i = 1;
       if (TextUtils.isEmpty(jSONObject1)) {
          o.b = o.b + i;
          HashMap hashMap = new HashMap();
          hashMap.put("e", "response is null");
          hashMap.put("l", "WeaponT1");
          oq = "n";
          str = (d.a(this.n).f("a1_p_s_p_s"))? "0": "1";
          hashMap.put(oq, str);
          bs.a(this.n, "1002001", hashMap);
          return null;
       }else {
          jSONObject = new JSONObject(jSONObject1);
          int i1 = 0;
          if (jSONObject.optInt("result", i1) == i) {
             jSONObject1 = new bt(this.n).a(jSONObject.optString("antispamPluginManageRsp"));
             if (!TextUtils.isEmpty(jSONObject1)) {
                jSONObject = new JSONObject(jSONObject1);
                this.r.a("wlpauct2", System.currentTimeMillis(), i);
                if (jSONObject.optInt("status", i1) == i) {
                   return jSONObject.optJSONObject("plugin");
                }
             }else {
                throw new NetworkErrorException("kuaishou risk pluginloader response is null");
             }
          }
          return null;
       }
    }
    public void run(){
       object oobject1;
       bf r;
       String str2;
       Iterator iterator1;
       aa y;
       aa uoaa3;
       bf l;
       z oz;
       bf uobf = this;
       _monitor_enter(bf.class);
       bf v = uobf.v;
       object oobject = 2;
       boolean i = 1;
       if (v != i && (v != oobject && (v != 4 && (uobf.w == null && (System.currentTimeMillis() - bf.s) - 0x493e0 < 0)))) {
          _monitor_exit(bf.class);
          return;
       }else {
          uobf.p.e();
          String[] stringArray = bs.a(uobf.n);
          int i1 = 0;
          if (stringArray != null && (stringArray.length == oobject && (!TextUtils.isEmpty(stringArray[i1]) && !TextUtils.isEmpty(stringArray[i])))) {
             oobject = stringArray[i1];
             oobject1 = stringArray[i];
          }else {
             String str4 = "16";
             oobject1 = "62c80c436b7547a68a12774c67519836";
          }
          String str = bs.f();
          if (!TextUtils.isEmpty(str)) {
             r = uobf.r;
             if (r != null) {
                r.d(str);
             }
          }
          str = bs.g();
          if (!TextUtils.isEmpty(str)) {
             r = uobf.r;
             if (r != null) {
                r.e(str);
             }
          }
          bf.s = System.currentTimeMillis();
          WeaponHI.t4 = System.currentTimeMillis();
          if (((System.currentTimeMillis() - uobf.r.a("wlpauct2")) - ((long)uobf.r.a("plc001_pd_ptip_pi", 6) * 0x36ee80)) - null > 0) {
             List list = uobf.p.b();
             ArrayList uArrayList = new ArrayList();
             ArrayList uArrayList1 = new ArrayList();
             ArrayList uArrayList2 = new ArrayList();
             ArrayList uArrayList3 = new ArrayList();
             WeaponHI.t5 = System.currentTimeMillis();
             JSONObject jSONObject = uobf.b(oobject, oobject1);
             WeaponHI.t6 = System.currentTimeMillis();
             if (jSONObject != null) {
                boolean b = br.b(uobf.n);
                Iterator iterator = jSONObject.keys();
                HashSet hashSet = new HashSet();
                int i2 = 0;
                while (iterator.hasNext()) {
                   String str1 = iterator.next();
                   int i3 = 3;
                   if (b && str1.endsWith("64")) {
                      if (str1.length() > i3) {
                         i = str1.length() - i3;
                         hashSet.add(str1.substring(i1, i));
                         i2 = str1.length() - i3;
                         str2 = str1.substring(i1, i2)+".32";
                      label_011e :
                         hashSet.add(str2);
                      }
                   }else if(!b && str1.endsWith("32")){
                      if (str1.length() > i3) {
                         i = str1.length() - i3;
                         hashSet.add(str1.substring(i1, i));
                         i2 = str1.length() - i3;
                         str2 = str1.substring(i1, i2)+".64";
                         goto label_011e ;
                      }
                   }else if(b && str1.endsWith("v8")){
                      if (str1.length() > i3) {
                         i = str1.length() - i3;
                         hashSet.add(str1.substring(i1, i));
                         i2 = str1.length() - i3;
                         str2 = str1.substring(i1, i2)+".v7";
                         goto label_011e ;
                      }
                   }else if(!b && str1.endsWith("v7")){
                      if (str1.length() > i3) {
                         i = str1.length() - i3;
                         hashSet.add(str1.substring(i1, i));
                         i2 = str1.length() - i3;
                         str2 = str1.substring(i1, i2)+".v8";
                         goto label_011e ;
                      }
                   }
                   i2 = 1;
                label_01ca :
                   str2 = 1;
                }
                if (i2) {
                   iterator1 = hashSet.iterator();
                   while (iterator1.hasNext()) {
                      jSONObject.remove(iterator1.next());
                   }
                }
                iterator1 = jSONObject.keys();
                i = true;
                while (iterator1.hasNext()) {
                   String str3 = iterator1.next();
                   aa uoaa = s.a(jSONObject.optJSONObject(str3), uobf.n);
                   if (uoaa == null) {
                      continue ;
                   }else if(i2 && (uoaa.z == null && (!str3.endsWith("32") && (!str3.endsWith("64") && (str3.endsWith("v7") || str3.endsWith("v8")))))){
                      uoaa.z = true;
                   }else {
                      aa uoaa2 = 1;
                   }
                   if (uoaa.w != null) {
                      uArrayList3.add(str3);
                   }
                   if (uoaa.z == null) {
                      uArrayList2.add(uoaa);
                   }
                   int i4 = list.indexOf(uoaa);
                   if (i4 >= 0 && uoaa.z != null) {
                      aa uoaa1 = list.get(i4);
                      if (bs.d(uoaa.d, uoaa1.d)) {
                         y = uoaa.y;
                         if (y != uoaa1.y) {
                            uobf.p.d(uoaa.a, y);
                         }
                         if (!uobf.p.e(uoaa.a)) {
                            uArrayList1.add(uoaa);
                            if ((uoaa.c).contains("p0")) {
                               i = true;
                            }
                         }
                      }else {
                         y = uoaa.y;
                         if (y != uoaa1.y) {
                            uobf.p.d(uoaa.a, y);
                         }
                         uArrayList.add(uoaa);
                         if ((uoaa.c).contains("p0")) {
                            i = false;
                         }
                      }
                   label_0296 :
                      list.remove(i4);
                   }else if(uoaa.z != null){
                      uArrayList1.add(uoaa);
                      if ((uoaa.c).contains("p0")) {
                         i = true;
                      }
                   }
                   y = null;
                }
                Iterator iterator2 = list.iterator();
                while (iterator2.hasNext()) {
                   uoaa3 = iterator2.next();
                   if (uArrayList3.contains(uoaa3.c)) {
                      continue ;
                   }else {
                      l = uobf.l;
                      if (l != null) {
                         l.add(Integer.valueOf(uoaa3.a));
                      }
                      uobf.o.a(uoaa3.c);
                   }
                }
                iterator2 = uArrayList2.iterator();
                while (iterator2.hasNext()) {
                   uoaa3 = iterator2.next();
                   if (uArrayList3.contains(uoaa3.c)) {
                      continue ;
                   }else {
                      l = uobf.l;
                      if (l != null) {
                         l.add(Integer.valueOf(uoaa3.a));
                      }
                      uobf.o.a(uoaa3.c);
                   }
                }
                List list1 = uobf.r.d();
                List list2 = uobf.r.c();
                i1 = 0;
                while (i1 < list2.size()) {
                   if (!list1.contains(list2.get(i1))) {
                      list1.add(list2.get(i1));
                   }
                   i1 = i1 + 1;
                }
                ArrayList uArrayList4 = new ArrayList();
                if (i) {
                   if (uArrayList1.size()) {
                      uArrayList4.addAll(uArrayList1);
                   }
                   if (uArrayList.size()) {
                      uArrayList4.addAll(uArrayList);
                   }
                }else if(uArrayList.size()){
                   uArrayList4.addAll(uArrayList);
                }
                if (uArrayList1.size()) {
                   uArrayList4.addAll(uArrayList1);
                }
                iterator2 = uArrayList4.iterator();
                while (iterator2.hasNext()) {
                   uoaa3 = iterator2.next();
                   if (uoaa3 == null) {
                      continue ;
                   }else if(uArrayList.contains(uoaa3)){
                      oz = z.a();
                      if (oz != null && oz.f(uoaa3.c)) {
                         continue ;
                      }
                   }else if(uArrayList1.contains(uoaa3)){
                      oz = z.a();
                      if (oz != null && oz.f(uoaa3.c)) {
                         continue ;
                      }else {
                         uobf.a(uoaa3);
                      }
                   }
                   uobf.o.a(uoaa3.a, uoaa3.d, null);
                }
             }else {
                uobf.o.f();
                throw new Exception("pluginJsonObject is null ");
             }
          }else {
             uobf.o.g();
             uobf.p.c();
          }
          _monitor_exit(bf.class);
          return;
       }
    }
}
