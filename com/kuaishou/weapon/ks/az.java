package com.kuaishou.weapon.ks.az;
import android.content.Context;
import java.lang.Object;
import org.json.JSONObject;
import com.kuaishou.weapon.ks.d;
import java.lang.String;
import com.kuaishou.weapon.jni.W;
import com.kuaishou.weapon.ks.br;
import java.lang.CharSequence;
import android.text.TextUtils;
import org.json.JSONArray;
import com.kuaishou.weapon.ks.l;
import com.kuaishou.weapon.i.WeaponHI;
import com.kuaishou.weapon.ks.bs;
import com.kuaishou.weapon.ks.r;
import com.kuaishou.weapon.ks.az$1;
import java.lang.Runnable;

public class az	// class@0011d9
{
    public Context b;
    public static JSONObject a;

    public void az(Context p0){
       this.b = p0;
    }
    public static Context a(az p0){
       return p0.b;
    }
    public JSONObject a(){
       String str = "w_s_p_r";
       String str1 = "=";
       String str2 = "m_n_t";
       String str3 = "c_n_t";
       String str4 = "5.9.2";
       JSONObject jSONObject = new JSONObject();
       d uod = d.a(this.b);
       int b = uod.f("a1_p_s_p_s");
       int b1 = uod.f("a1_p_s_p_s_c_b");
       String str5 = "11006";
       b = (b)? 1: 0;
       jSONObject.put(str5, b);
       jSONObject.put("11028", str4);
       String str6 = "11001";
       int i = (W.loadSuccess)? 1: 0;
       jSONObject.put(str6, i);
       jSONObject.put("11002", W.soVersion);
       jSONObject.put("11003", d.a(this.b).b("plc001_k_v_w", "", true));
       str6 = "11029";
       b1 = (b1)? 1: 0;
       jSONObject.put(str6, b1);
       String str7 = "11035";
       b = (br.b(this.b))? 1: 0;
       jSONObject.put(str7, b);
       str7 = d.a(this.b).c(str3);
       if (!TextUtils.isEmpty(str7)) {
          JSONObject jSONObject1 = new JSONObject();
          String[] stringArray = ((str7.substring(true, (str7.length() - true))).replaceAll(" ", "")).split(",");
          i = stringArray.length;
          int i1 = 0;
          while (i1 < i) {
             object oobject = stringArray[i1];
             if (!TextUtils.isEmpty(oobject)) {
                jSONObject1.put(oobject.split(str1)[0], oobject.split(str1)[1]);
             }
             i1 = i1 + 1;
          }
          if (jSONObject1.length() > 0) {
             jSONObject.put("cnt", jSONObject1);
          }
       }
       d.a(this.b).a(str3, "{}", 0);
       str1 = d.a(this.b).c(str2);
       JSONArray jSONArray = (TextUtils.isEmpty(str1))? new JSONArray(): new JSONArray(str1);
       l ol = new l(this.b, "w_s_p_risk");
       if (ol.c(str) == 1) {
          JSONObject jSONObject2 = new JSONObject();
          jSONObject2.put("1", 6);
          jSONObject2.put("2", 200);
          jSONArray.put(jSONObject2);
          ol.d(str, 0);
       }
       if (jSONArray.length() > 0) {
          jSONObject.put("mnt", jSONArray);
       }
       d.a(this.b).a(str2, "[]", 0);
       str = ol.b("w_s_p_v", "");
       str2 = "1.0.0";
       str7 = "wv";
       if (!TextUtils.isEmpty(str)) {
          jSONObject.put(str7, str);
       }else {
          jSONObject.put(str7, str2);
       }
       jSONObject.put("rv", str4);
       str = ol.b("w_s_p_s", "");
       str3 = "sv";
       if (!TextUtils.isEmpty(str)) {
          jSONObject.put(str3, str);
       }else {
          jSONObject.put(str3, str2);
       }
       jSONObject.put("50001", (WeaponHI.t2 - WeaponHI.t1));
       jSONObject.put("50002", (WeaponHI.t3 - WeaponHI.t2));
       jSONObject.put("50003", (WeaponHI.t4 - WeaponHI.t3));
       long t6 = WeaponHI.t6;
       str2 = null;
       if (t6 - str2 > 0) {
          jSONObject.put("50004", (t6 - WeaponHI.t5));
       }
       t6 = WeaponHI.t7;
       if (t6 - str2 > 0) {
          jSONObject.put("50005", (t6 - WeaponHI.t6));
       }
       t6 = WeaponHI.t8;
       if (t6 - str2 > 0) {
          jSONObject.put("50006", (t6 - WeaponHI.t7));
       }
       t6 = WeaponHI.t9;
       if (t6 - str2 > 0) {
          jSONObject.put("50007", (t6 - WeaponHI.t8));
       }
       jSONObject.put("11027", bs.d());
       jSONObject.put("11127", bs.e());
       return jSONObject;
    }
    public void a(int p0){
       try{
          r.a().a(new az$1(this, p0));
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
