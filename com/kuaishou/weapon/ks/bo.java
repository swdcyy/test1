package com.kuaishou.weapon.ks.bo;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.weapon.ks.bn;
import com.kuaishou.weapon.ks.ba;
import org.json.JSONObject;
import com.kuaishou.weapon.ks.d;
import java.lang.System;
import com.kuaishou.weapon.ks.cb;
import com.kuaishou.weapon.ks.bh;
import com.kuaishou.weapon.ks.bl;
import com.kuaishou.weapon.ks.bp;
import com.kuaishou.weapon.ks.bm;
import com.kuaishou.weapon.ks.bg;
import com.kuaishou.weapon.ks.ad;
import com.kuaishou.weapon.ks.bj;
import com.kuaishou.weapon.ks.bk;
import com.kuaishou.weapon.ks.bx;
import com.kuaishou.weapon.jni.W;
import com.kuaishou.weapon.ks.bs;
import java.util.HashMap;
import java.lang.Throwable;
import java.util.Map;

public class bo	// class@0011eb
{
    public Context b;
    public int c;
    public static JSONObject a;

    public void bo(Context p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public String a(String p0){
       JSONObject a;
       JSONObject a1;
       JSONObject jSONObject = new bn(p0, ba.e).a(this.b);
       if (jSONObject == null) {
          return null;
       }
       boolean b = d.a(this.b).f("a1_p_s_p_s");
       if (!b) {
          a = bo.a;
          if (a != null && (a.length() > 0 && this.c == 0x1869f)) {
             a1 = bo.a;
          label_003c :
             if (a1 == null) {
                return null;
             }else {
                a1.put("20000", this.c);
                jSONObject.put("module_section", a1);
                return jSONObject.toString();
             }
          }
       }
       a = this.a();
       if (!b) {
          bo.a = a;
       }
       a1 = a;
       goto label_003c ;
    }
    public final JSONObject a(){
       String str1;
       long l = System.currentTimeMillis();
       JSONObject jSONObject = new JSONObject();
       d uod = d.a(this.b);
       boolean b = uod.f("a1_p_s_p_s");
       int i = 1;
       String str = "";
       if (uod.b("plc001_b_bcl_ie_s", i) == i && b) {
          jSONObject.put("01003", cb.a(this.b, str));
          jSONObject.put("01004", cb.a(this.b, i, str));
          jSONObject.put("01019", cb.a(this.b, 0, str));
       }
       int i1 = 2;
       if (uod.b("plc001_b_bcl_is_s", i) == i && b) {
          jSONObject.put("01007", cb.a(this.b));
          jSONObject.put("01008", cb.a(this.b, i));
          jSONObject.put("01020", cb.a(this.b, i1));
       }
       if (uod.b("plc001_b_bcl_ic_s", i) == i && b) {
          jSONObject.put("01011", cb.b(this.b));
          jSONObject.put("01012", cb.b(this.b, i));
          jSONObject.put("01021", cb.b(this.b, i1));
       }
       if (uod.b("plc001_b_bcl_btm_s", i) == i && b) {
          jSONObject.put("01016", bh.m(this.b));
       }
       if (uod.b("plc001_b_bcl_d_s", i) == i) {
          if (b) {
             jSONObject.put("01013", cb.b(this.b, str));
          }
          jSONObject.put("02001", bl.a());
          jSONObject.put("02002", bl.b());
          jSONObject.put("02003", bl.c());
          jSONObject.put("02004", bl.d());
          jSONObject.put("02005", bl.e());
          jSONObject.put("02006", bl.f());
          jSONObject.put("02007", bl.g());
          jSONObject.put("02008", bl.h());
          jSONObject.put("02009", bl.i());
          jSONObject.put("02010", bl.j());
          jSONObject.put("02011", bl.k());
          jSONObject.put("02012", bl.l());
          jSONObject.put("02013", bl.m());
          jSONObject.put("02014", bl.n());
          jSONObject.put("02015", bl.p());
          jSONObject.put("02016", bl.q());
          jSONObject.put("02017", bl.r());
          jSONObject.put("02018", bl.s());
          jSONObject.put("02020", bl.u());
          jSONObject.put("02021", bl.b(this.b));
          jSONObject.put("02022", bl.a(this.b));
          if (b) {
             if (uod.b("plc001_b_pry_gnci_s", i) == i) {
                jSONObject.put("02023", bp.b(this.b));
             }
             if (uod.b("plc001_b_pry_gno_s", i) == i) {
                jSONObject.put("02024", bp.a(this.b));
             }
          }
          jSONObject.put("02030", bl.c(this.b));
          jSONObject.put("02031", bl.y());
          jSONObject.put("02032", bl.o());
          jSONObject.put("02033", bl.x());
          jSONObject.put("02034", bl.z());
          jSONObject.put("02035", bl.A());
          jSONObject.put("02037", bl.w());
          jSONObject.put("02038", bl.v());
          jSONObject.put("02039", bh.d());
          jSONObject.put("02040", bh.e());
          jSONObject.put("02041", bh.o(this.b));
          jSONObject.put("02043", bh.p(this.b));
          jSONObject.put("02044", bl.t());
          jSONObject.put("02045", bl.B());
          jSONObject.put("02054", bh.r(this.b));
          jSONObject.put("01025", bh.s(this.b));
       }
       if (uod.b("plc001_b_bcl_r_s", i) == i) {
          jSONObject.put("03003", bm.a(this.b));
          jSONObject.put("03004", bl.d(this.b));
          jSONObject.put("03007", bg.a(this.b));
          jSONObject.put("03008", bg.c(this.b));
          jSONObject.put("03011", ad.b(this.b));
          jSONObject.put("03012", ad.b());
          jSONObject.put("03014", bh.h(this.b));
          jSONObject.put("03020", bg.b(this.b));
       }
       if (uod.b("plc001_b_bcl_tc_s", i) == i) {
          jSONObject.put("03019", bh.j(this.b));
       }
       if (uod.b("plc001_b_bcl_il_s", i) == i) {
          jSONObject.put("03018", bh.i(this.b));
       }
       if (uod.b("plc001_b_bcl_rp_s", i) == i && b) {
          jSONObject.put("03028", bh.n(this.b));
       }
       try{
          if (uod.b("plc001_b_bcl_c_s", i) == i) {
             bj uobj = bk.b();
             jSONObject.put("04001", bk.a());
             jSONObject.put("04002", uobj.b());
             jSONObject.put("04003", uobj.c());
             jSONObject.put("04004", uobj.a());
          }
          if (uod.b("plc001_b_bcl_mc_s", 0) == i && b) {
             str1 = bh.a();
             if (str1 == null) {
                jSONObject.put("07005", str);
             }else {
                jSONObject.put("07005", str1);
             }
          }
          jSONObject.put("11003", bx.o);
          jSONObject.put("11005", W.loadSoCount);
          str1 = "11006";
          if (!b) {
             i = 0;
          }
          jSONObject.put(str1, i);
          jSONObject.put("11027", bs.d());
          jSONObject.put("11127", bs.e());
          jSONObject.put("20000", this.c);
          jSONObject.put("11008", uod.a("plc001_v_s", "0.0.0"));
          jSONObject.put("11007", (System.currentTimeMillis() - l));
          return jSONObject;
       }catch(java.lang.Exception e0){
       }
    }
}
