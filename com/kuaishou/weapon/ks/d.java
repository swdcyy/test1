package com.kuaishou.weapon.ks.d;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.kuaishou.weapon.ks.u;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.System;
import com.kuaishou.weapon.ks.u$b;
import com.kuaishou.weapon.ks.u$b$a;
import com.kuaishou.weapon.ks.u$b$b;
import com.kuaishou.weapon.ks.u$c;
import com.kuaishou.weapon.ks.u$d;
import com.kuaishou.weapon.ks.u$d$a;
import java.util.HashMap;
import java.lang.Throwable;
import java.util.Map;
import com.kuaishou.weapon.ks.bs;
import java.lang.Boolean;
import com.kuaishou.weapon.ks.g;
import java.lang.StringBuilder;
import java.util.List;
import java.util.ArrayList;
import java.lang.Integer;

public class d	// class@001209
{
    public SharedPreferences br;
    public SharedPreferences$Editor bs;
    public Context bt;
    public static d bu;

    public void d(Context p0){
       super();
       SharedPreferences sharedPrefer = p0.getSharedPreferences("wcfg", 4);
       this.br = sharedPrefer;
       this.bs = sharedPrefer.edit();
       this.bt = p0;
    }
    public static synchronized d a(Context p0){
       _monitor_enter(d.class);
       try{
          if (d.bu == null) {
             d.bu = new d(p0);
          }
          _monitor_exit(d.class);
          return d.bu;
       }catch(java.lang.Exception e0){
          _monitor_exit(e0);
          return null;
       }
    }
    public int a(String p0,int p1){
       return this.br.getInt(p0, p1);
    }
    public long a(String p0){
       d tbr = this.br;
       if (tbr == null) {
          return 0;
       }
       return tbr.getLong(p0, 0);
    }
    public String a(String p0,String p1){
       return this.br.getString(p0, p1);
    }
    public void a(){
       d tbs = this.bs;
       if (tbs != null) {
          g.a(tbs);
       }
       return;
    }
    public void a(long p0){
       this.bs.putLong("a1_1_upl_time_s", p0);
       g.a(this.bs);
    }
    public void a(String p0,int p1,boolean p2){
       this.bs.putInt(p0, p1);
       if (p2) {
          g.a(this.bs);
       }
       return;
    }
    public void a(String p0,long p1,boolean p2){
       this.bs.putLong(p0, p1);
       if (p2) {
          g.a(this.bs);
       }
       return;
    }
    public void a(String p0,u p1){
       p0 = "plc001_w_v_s";
       String str = "plc001_e_v_s";
       String str1 = "plc001_b_v_s";
       String str2 = "plc001_v_s";
       if (p1 != null && (!TextUtils.isEmpty(p1.j()) && !TextUtils.isEmpty(p1.l()))) {
          this.a("plc001_pd_pti_s", p1.q(), false);
          this.a("plc001_pd_pti_ps", p1.f(), false);
          this.a("plc001_pd_pti_pi", p1.A(), false);
          this.a("plc001_pd_pti_pc", p1.p(), false);
          this.a("plc001_pd_ptip_pi", p1.b(), false);
          this.a("plc001_pd_ptii_pi", p1.i(), false);
          this.a("plc001_pd_pg_ps", p1.r(), false);
          this.a("plc001_pd_pt_pi", p1.g(), false);
          this.a("plc001_pd_pk_pc", p1.s(), false);
          this.a("plc001_pd_ph_pc", p1.t(), false);
          this.a("plc001_pd_u_ps", p1.m(), false);
          this.a("plc001_pd_cb_ps", p1.n(), false);
          this.a("plc001_pd_co_pc", p1.y(), false);
          boolean b = true;
          this.a("plc001_pd_ac_pc", p1.z(), b);
          this.a("plc001_pd_l_t", p1.u(), false);
          this.a("plc001_pd_l_i", p1.v(), false);
          this.a("plc001_pd_h_i", p1.w(), false);
          this.a("plc001_pd_n_s", p1.x(), false);
          this.e(System.currentTimeMillis());
          String str3 = this.c(str2);
          String str4 = this.c(str1);
          this.c("plc001_a_v_s");
          String str5 = this.c(str);
          String str6 = this.c(p0);
          if (p1.B() == b && (TextUtils.isEmpty(str3) || str3.compareTo(p1.j()) < 0)) {
             this.a(false, str2, p1.j());
             if (TextUtils.isEmpty(str4) || str4.compareTo(p1.l()) < 0) {
                this.a(false, str1, p1.l());
                if (p1.d() != null) {
                   this.a("plc001_b_s_s", p1.d().a(), false);
                   this.a("plc001_b_c_s", p1.d().b(), false);
                   this.a("plc001_b_i_s", p1.d().c(), false);
                   u$b$a uob$a = p1.d().d();
                   u$b$b uob$b = p1.d().e();
                   if (uob$a != null) {
                      this.a("plc001_b_bcl_d_s", uob$a.d(), false);
                      this.a("plc001_b_bcl_r_s", uob$a.h(), false);
                      this.a("plc001_b_bcl_c_s", uob$a.b(), false);
                      this.a("plc001_b_bcl_n_s", uob$a.f(), false);
                      this.a("plc001_b_bcl_w_s", uob$a.l(), false);
                      this.a("plc001_b_bcl_s_s", uob$a.i(), false);
                      this.a("plc001_b_bcl_u_s", uob$a.j(), false);
                      this.a("plc001_b_bcl_a_s", uob$a.a(), false);
                      this.a("plc001_b_bcl_ie_s", uob$a.o(), false);
                      this.a("plc001_b_bcl_is_s", uob$a.e(), false);
                      this.a("plc001_b_bcl_ic_s", uob$a.m(), false);
                      this.a("plc001_b_bcl_btm_s", uob$a.n(), false);
                      this.a("plc001_b_bcl_mc_s", uob$a.k(), false);
                      this.a("plc001_b_bcl_rp_s", uob$a.p(), false);
                      this.a("plc001_b_bcl_tc_s", uob$a.g(), false);
                      this.a("plc001_b_bcl_il_s", uob$a.c(), false);
                   }
                   if (uob$b != null) {
                      this.a("plc001_b_pry_gno_s", uob$b.a(), false);
                      this.a("plc001_b_pry_gnon_s", uob$b.b(), false);
                      this.a("plc001_b_pry_gso_s", uob$b.c(), false);
                      this.a("plc001_b_pry_gnci_s", uob$b.d(), false);
                      this.a("plc001_b_pry_gifa_s", uob$b.e(), false);
                      this.a("plc001_b_pry_gsl_s", uob$b.f(), false);
                      this.a("plc001_b_pry_rl_s", uob$b.g(), false);
                      this.a("plc001_b_pry_grt_s", uob$b.h(), false);
                      this.a("plc001_b_pry_grs_s", uob$b.i(), false);
                   }
                }
             }
             if (TextUtils.isEmpty(str5) || (str5.compareTo(p1.h()) < 0 && p1.o() != null)) {
                this.a(false, str, p1.h());
                this.a("plc001_e_s_s", p1.o().a(), false);
                this.a("plc001_e_c_s", p1.o().b(), false);
                this.a("plc001_e_i_s", p1.o().c(), false);
             }
             if (TextUtils.isEmpty(str6) || str6.compareTo(p1.a()) < 0) {
                this.a(false, p0, p1.a());
                if (p1.e() != null) {
                   this.a("plc001_w_s_s", p1.e().a(), false);
                   u$d$a uod$a = p1.e().b();
                   if (uod$a != null) {
                      this.a("plc001_w_wrp_a_d", uod$a.e(), false);
                      this.a("plc001_w_wrp_a_e", uod$a.f(), false);
                      this.a("plc001_w_wrp_c_n", uod$a.g(), false);
                      this.a("plc001_w_wrp_e_v", uod$a.b(), false);
                      this.a("plc001_w_wrp_g_s", uod$a.h(), false);
                      this.a("plc001_w_wrp_m_n", uod$a.c(), false);
                      this.a("plc001_w_wrp_u_d", uod$a.i(), false);
                      this.a("plc001_w_wrp_u_e", uod$a.a(), false);
                      this.a("plc001_w_wrp_a_s", uod$a.d(), false);
                   }
                }
             }
          }
       }
    label_0339 :
       this.a();
       return;
    }
    public void a(String p0,Boolean p1,boolean p2){
       try{
          d tbs = this.bs;
          if (tbs != null) {
             tbs.putBoolean(p0, p1.booleanValue());
             if (p2) {
                g.a(this.bs);
             }
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void a(String p0,String p1,boolean p2){
       if (!TextUtils.isEmpty(p1)) {
          if (p2) {
             p1 = g.b(p1.getBytes(), 2);
          }
          this.bs.putString(p0, p1);
          g.a(this.bs);
       }
       return;
    }
    public void a(boolean p0,String p1,String p2){
       if (!TextUtils.isEmpty(p2)) {
          this.bs.putString(p1, p2);
          if (p0) {
             g.a(this.bs);
          }
       }
       return;
    }
    public void a(int[] p0){
       d tbs;
       if (p0 == null || (!p0.length && this.bs != null)) {
          this.bs.putString("whcapk", "");
       }else {
          StringBuilder str = "";
          int i = 0;
          while (i < p0.length) {
             str = str+p0[i];
             int i1 = p0.length - 1;
             if (i != i1) {
                str = str+"-";
             }
             i = i + 1;
          }
          tbs = this.bs;
          if (tbs != null) {
             tbs.putString("hcpk", str);
          }
       }
       tbs = this.bs;
       if (tbs != null) {
          g.a(tbs);
       }
       return;
    }
    public int b(String p0){
       return this.br.getInt(p0, 0);
    }
    public int b(String p0,int p1){
       try{
          return this.br.getInt(p0, p1);
       }catch(java.lang.Exception e0){
          return p1;
       }
    }
    public String b(){
       return this.br.getString("as", "");
    }
    public String b(String p0,String p1,boolean p2){
       p0 = this.c(p0);
       if (!TextUtils.isEmpty(p0)) {
          p1 = (p2)? g.b(p0, 2): p0;
       }
    label_0013 :
       return p1;
    }
    public void b(long p0){
       this.bs.putLong("a1_1_tk_time_s", p0);
       g.a(this.bs);
    }
    public void b(String p0,String p1){
       this.bs.putString("as", p0+"-"+p1);
       g.a(this.bs);
    }
    public String c(String p0){
       return this.br.getString(p0, "");
    }
    public List c(){
       ArrayList uArrayList = new ArrayList();
       String str = this.br.getString("whcapk", "");
       if (!TextUtils.isEmpty(str)) {
          String[] stringArray = str.split("-");
          if (stringArray != null && stringArray.length > 0) {
             int i = 0;
             while (i < stringArray.length) {
                try{
                   uArrayList.add(Integer.valueOf(Integer.parseInt(stringArray[i])));
                   i = i + 1;
                }catch(java.lang.NumberFormatException e0){
                }
             }
          }
       }
       return uArrayList;
    }
    public void c(long p0){
       this.bs.putLong("a1_a_nc_upl_time_s", p0);
       g.a(this.bs);
    }
    public List d(){
       ArrayList uArrayList = new ArrayList();
       String str = this.br.getString("wlhcapk", "");
       if (!TextUtils.isEmpty(str)) {
          String[] stringArray = str.split("-");
          if (stringArray != null && stringArray.length > 0) {
             int i = 0;
             while (i < stringArray.length) {
                try{
                   uArrayList.add(Integer.valueOf(Integer.parseInt(stringArray[i])));
                   i = i + 1;
                }catch(java.lang.NumberFormatException e0){
                }
             }
          }
       }
       return uArrayList;
    }
    public void d(long p0){
       this.bs.putLong("a1_e_upl_time_s", p0);
       g.a(this.bs);
    }
    public void d(String p0){
       this.a(false, "plc001_lss_ck_d", new String(g.c(p0.getBytes(), 2)));
    }
    public void e(long p0){
       this.bs.putLong("a1_l_p_i_t_s", p0);
       g.a(this.bs);
    }
    public void e(String p0){
       this.a(false, "plc001_lss_oa_d", new String(g.c(p0.getBytes(), 2)));
    }
    public boolean e(){
       try{
          return this.br.getBoolean("wibupa", true);
       }catch(java.lang.Exception e0){
          return false;
       }
    }
    public long f(){
       d tbr = this.br;
       if (tbr == null) {
          return 0;
       }
       return tbr.getLong("a1_1_upl_time_s", 0);
    }
    public boolean f(String p0){
       d tbr = this.br;
       if (tbr == null) {
          return false;
       }
       return tbr.getBoolean(p0, false);
    }
    public long g(){
       return this.br.getLong("a1_1_tk_time_s", 0);
    }
    public long h(){
       return this.br.getLong("a1_a_nc_upl_time_s", 0);
    }
    public long i(){
       d tbr = this.br;
       if (tbr == null) {
          return 0;
       }
       return tbr.getLong("a1_e_upl_time_s", 0);
    }
    public long j(){
       d tbr = this.br;
       if (tbr == null) {
          return 0;
       }
       return tbr.getLong("a1_l_p_i_t_s", 0);
    }
}
