package com.kuaishou.weapon.ks.ap;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.weapon.ks.bn;
import com.kuaishou.weapon.ks.ba;
import com.kuaishou.weapon.ks.bs;
import org.json.JSONObject;
import com.kuaishou.weapon.ks.d;
import java.lang.System;
import com.kuaishou.weapon.ks.au;
import com.kuaishou.weapon.ks.ak;
import com.kuaishou.weapon.ks.at;
import com.kuaishou.weapon.ks.ai;
import org.json.JSONArray;
import java.util.Set;
import com.kuaishou.weapon.ks.al;
import com.kuaishou.weapon.ks.ao;
import com.kuaishou.weapon.ks.aw;
import java.util.Collection;
import java.util.HashSet;
import com.kuaishou.weapon.ks.ax;
import com.kuaishou.weapon.ks.aq;
import com.kuaishou.weapon.ks.am;
import com.kuaishou.weapon.ks.bg;
import com.kuaishou.weapon.ks.bh;
import com.kuaishou.weapon.ks.av;
import com.kuaishou.weapon.ks.ar;
import com.kuaishou.weapon.ks.as;
import com.kuaishou.weapon.jni.W;
import java.util.HashMap;
import java.lang.Throwable;
import java.util.Map;

public class ap	// class@0011cd
{
    public int b;
    public Context c;
    public static JSONObject a;

    public void ap(Context p0,int p1){
       super();
       this.c = p0;
       this.b = p1;
    }
    public String a(String p0){
       JSONObject a;
       JSONObject a1;
       bn uobn = new bn(p0, ba.e);
       uobn.a(bs.e(this.c));
       uobn.b(bs.a());
       uobn.c(bs.b(this.c));
       uobn.d(bs.c(this.c));
       uobn.e(bs.d(this.c));
       uobn.f("5.9.2");
       uobn.g("");
       uobn.h(bs.a);
       JSONObject jSONObject = uobn.a(this.c);
       boolean b = d.a(this.c).f("a1_p_s_p_s");
       if (!b) {
          a = ap.a;
          if (a != null && a.length() > 0) {
             ap tb = this.b;
             if (tb == 0x1869f || tb == 999) {
                a1 = ap.a;
             label_0077 :
                if (jSONObject == null || a1 == null) {
                   return null;
                }else {
                   a1.put("20000", this.b);
                   jSONObject.put("module_section", a1);
                   return jSONObject.toString();
                }
             }
          }
       }
       a = this.a();
       if (!b) {
          ap.a = a;
       }
       a1 = a;
       goto label_0077 ;
    }
    public JSONObject a(){
       long l = System.currentTimeMillis();
       JSONObject jSONObject = new JSONObject();
       d uod = d.a(this.c);
       int i = 0;
       int i1 = (uod != null)? uod.b("a1_n_d_v_s"): 0;
       String str = (i1 != 1 || this.b == 103)? 1: null;
       au uoau = new au(this.c);
       jSONObject.put("0", uoau.b());
       jSONObject.put("1", uoau.a());
       jSONObject.put("3", uoau.d());
       jSONObject.put("24", uoau.c());
       String str1 = "35";
       int i2 = (ak.b())? 1: 0;
       jSONObject.put(str1, i2);
       str1 = "36";
       i2 = (ak.a(this.c))? 1: 0;
       jSONObject.put(str1, i2);
       JSONObject jSONObject1 = at.a(this.c);
       if (jSONObject1 != null) {
          jSONObject.put("4", jSONObject1);
       }
       int i3 = (uod != null)? uod.b("plc001_b_pry_gifa_s", 1): 0;
       if (i3 == 1) {
          jSONObject.put("5", at.a());
       }
       ai uoai = new ai();
       jSONObject.put("49", uoai.a(this.c));
       jSONObject.put("146", uoai.c());
       jSONObject.put("185", uoai.b());
       jSONObject.put("194", uoai.a());
       jSONObject.put("220", uoai.d());
       jSONObject.put("221", uoai.e());
       jSONObject.put("22", ak.a());
       al uoal = new al();
       str1 = "7";
       i2 = (uoal.a())? 1: 0;
       jSONObject.put(str1, i2);
       int b = uoal.a(this.c);
       String str2 = "8";
       int i4 = (b)? 1: 0;
       jSONObject.put(str2, i4);
       if (b) {
          jSONObject.put("61", uoal.b(this.c));
       }
       if (str) {
          jSONObject.put("9", uoal.d(this.c));
       }
       jSONObject.put("10", uoal.e(this.c));
       jSONObject.put("11", uoal.c(this.c));
       ao uoao = new ao();
       str1 = "26";
       i2 = (uoao.a("cpuinfo"))? 1: 0;
       jSONObject.put(str1, i2);
       str1 = "27";
       i2 = (uoao.a("meminfo"))? 1: 0;
       jSONObject.put(str1, i2);
       str1 = "28";
       i2 = (uoao.b("/proc/cpuinfo"))? 1: 0;
       jSONObject.put(str1, i2);
       str1 = "29";
       i2 = (uoao.b("/proc/meminfo"))? 1: 0;
       jSONObject.put(str1, i2);
       if (str) {
          jSONObject.put("96", uoao.a());
       }
       aw uoaw = new aw();
       Set set = uoaw.b();
       Set set1 = uoaw.c();
       str2 = "30";
       if (set1 != null) {
          jSONObject.put(str2, 1);
          jSONObject.put("32", new JSONArray(set1));
       }else {
          jSONObject.put(str2, i);
       }
       str2 = "31";
       if (set != null) {
          jSONObject.put(str2, 1);
          jSONObject.put("33", new JSONArray(set));
       }else {
          jSONObject.put(str2, i);
       }
       Set set2 = uoaw.a();
       if (set2 != null) {
          jSONObject.put("34", set2);
          if (set != null || set1 != null) {
             HashSet hashSet = new HashSet();
             if (set != null) {
                hashSet.add(set);
             }
             if (set1 != null) {
                hashSet.add(set1);
             }
             jSONObject.put("13", uoaw.a(this.c, 13, hashSet));
             jSONObject.put("14", uoaw.a(this.c, 14, hashSet));
             jSONObject.put("15", uoaw.a(this.c, 15, hashSet));
             jSONObject.put("16", uoaw.a(this.c, 16, hashSet));
             jSONObject.put("17", uoaw.a(this.c, 17, hashSet));
             jSONObject.put("18", uoaw.a(this.c, 18, hashSet));
             jSONObject.put("19", uoaw.a(this.c, 19, hashSet));
             jSONObject.put("20", uoaw.a(this.c, 20, hashSet));
             jSONObject.put("21", uoaw.a(this.c, 21, hashSet));
          }
       }
       ax uoax = new ax();
       str = "65";
       b = (uoax.d())? 1: 0;
       jSONObject.put(str, b);
       i1 = uoax.b();
       str1 = "66";
       i2 = (i1)? 1: 0;
       jSONObject.put(str1, i2);
       if (i1) {
          str = "67";
          b = (uoax.a())? 1: 0;
          jSONObject.put(str, b);
       }
       str = "68";
       b = (uoax.f())? 1: 0;
       jSONObject.put(str, b);
       jSONObject.put("69", uoax.e());
       str = "101";
       b = (uoax.c())? 1: 0;
       jSONObject.put(str, b);
       str = "102";
       i3 = (uoax.g())? 1: 0;
       jSONObject.put(str, i3);
       jSONObject.put("99", new aq().a());
       str = "103";
       i3 = (new am().a())? 1: 0;
       jSONObject.put(str, i3);
       JSONObject jSONObject2 = new JSONObject();
       jSONObject2.put("03007", bg.a(this.c));
       jSONObject2.put("03014", bh.h(this.c));
       jSONObject2.put("03020", bg.b(this.c));
       jSONObject2.put("03030", bh.q(this.c));
       jSONObject.put("51", jSONObject2);
       jSONObject.put("58", ao.a(this.c));
       jSONObject.put("59", ao.b(this.c));
       String str3 = "128";
       i1 = (am.b())? 1: 0;
       jSONObject.put(str3, i1);
       jSONObject.put("151", av.a());
       jSONObject2 = ar.a(this.c);
       if (jSONObject2 != null && jSONObject2.length() > 0) {
          jSONObject.put("200", jSONObject2);
       }
       as uoas = new as();
       jSONObject.put("131", uoas.a());
       jSONObject.put("145", uoas.a(this.c));
       jSONObject.put("132", av.b());
       jSONObject.put("107", new aw().d());
       jSONObject.put("11027", bs.d());
       jSONObject.put("11127", bs.e());
       W.getInstance(this.c);
       str3 = "11001";
       if (W.loadSuccess) {
          i = 1;
       }
       jSONObject.put(str3, i);
       jSONObject.put("11002", W.soVersion);
       jSONObject.put("11007", (System.currentTimeMillis() - l));
       jSONObject.put("11017", (jSONObject.toString()).length());
       return jSONObject;
    }
}
