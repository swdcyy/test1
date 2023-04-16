package com.kuaishou.android.security.base.cloudconfig.c;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import android.content.SharedPreferences;
import oe6.o;
import android.content.SharedPreferences$Editor;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import oe6.g;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.Number;

public class c	// class@000ed6
{
    public SharedPreferences a;
    public SharedPreferences$Editor b;

    public void c(Context p0){
       super();
       SharedPreferences sharedPrefer = o.c(p0, "kspocfp", 0);
       this.a = sharedPrefer;
       this.b = sharedPrefer.edit();
    }
    public String a(){
       Object obj = PatchProxy.apply(null, this, c.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getString("kwtk_pro", "");
    }
    public String a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getString(p0, "");
    }
    public void a(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "44")) {
          return;
       }
       this.b.putInt("al_dfr_fest_c_l", p0);
       g.b(this.b);
       return;
    }
    public void a(long p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoc, "2")) {
          return;
       }
       this.b.putLong("pl_l_p_kp", p0);
       g.b(this.b);
       return;
    }
    public void a(String p0,Long p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "39")) {
          return;
       }
       this.b.putLong(p0, p1.longValue());
       g.b(this.b);
       return;
    }
    public void a(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "37")) {
          return;
       }
       this.b.putString(p0, p1);
       g.b(this.b);
       return;
    }
    public void a(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "16")) {
          return;
       }
       this.b.putBoolean("dfp_nu_swit", p0);
       g.b(this.b);
       return;
    }
    public String b(){
       Object obj = PatchProxy.apply(null, this, c.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getString("kwddk_pro", "");
    }
    public void b(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "19")) {
          return;
       }
       this.b.putInt("dfp_net_hr", p0);
       g.b(this.b);
       return;
    }
    public void b(long p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoc, "5")) {
          return;
       }
       this.b.putLong("re_last_ofline_time", p0);
       g.b(this.b);
       return;
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "33")) {
          return;
       }
       this.b.putString("kwtk_pro", p0);
       g.b(this.b);
       return;
    }
    public void b(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "8")) {
          return;
       }
       this.b.putBoolean("env_ks_deswit", p0);
       g.b(this.b);
       return;
    }
    public int c(){
       Object obj = PatchProxy.apply(null, this, c.class, "47");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.getInt("al_env_fest_ret_t", 0);
    }
    public void c(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "43")) {
          return;
       }
       this.b.putInt("al_dfr_al_c_l", p0);
       g.b(this.b);
       return;
    }
    public void c(long p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoc, "28")) {
          return;
       }
       this.b.putLong("re_day_b_t", p0);
       g.b(this.b);
       return;
    }
    public void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "35")) {
          return;
       }
       this.b.putString("kwddk_pro", p0);
       g.b(this.b);
       return;
    }
    public void c(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "45")) {
          return;
       }
       this.b.putBoolean("al_env_fest_c_l_sta", p0);
       g.b(this.b);
       return;
    }
    public long d(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.a.getLong("pl_l_p_kp", 0);
    }
    public void d(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "9")) {
          return;
       }
       this.b.putInt("env_ks_destttt1", p0);
       g.b(this.b);
       return;
    }
    public void d(long p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoc, "30")) {
          return;
       }
       this.b.putLong("re_day_len", p0);
       g.b(this.b);
       return;
    }
    public void d(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "7")) {
          return;
       }
       this.b.putBoolean("env_ks_swit", p0);
       g.b(this.b);
       return;
    }
    public int e(){
       Object obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.getInt("pl_k_p_itl", 6);
    }
    public void e(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "46")) {
          return;
       }
       this.b.putInt("al_env_fest_ret_t", p0);
       g.b(this.b);
       return;
    }
    public void e(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "48")) {
          return;
       }
       this.b.putBoolean("na_m_lm_en", p0);
       g.b(this.b);
       return;
    }
    public int f(){
       Object obj = PatchProxy.apply(null, this, c.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.getInt("re_net_dy_lt", 50);
    }
    public void f(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "40")) {
          return;
       }
       this.b.putInt("al_ev_al_i_cycle", p0);
       g.b(this.b);
       return;
    }
    public void f(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "10")) {
          return;
       }
       this.b.putBoolean("rit_ks_swit", p0);
       g.b(this.b);
       return;
    }
    public int g(){
       Object obj = PatchProxy.apply(null, this, c.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.getInt("g_r_d_d_n", 0);
    }
    public void g(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "41")) {
          return;
       }
       this.b.putInt("al_ev_al_c", p0);
       g.b(this.b);
       return;
    }
    public void g(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "14")) {
          return;
       }
       this.b.putBoolean("up_ala_swit", p0);
       g.b(this.b);
       return;
    }
    public int h(){
       Object obj = PatchProxy.apply(null, this, c.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.getInt("re_net_wt", 3);
    }
    public void h(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "4")) {
          return;
       }
       this.b.putInt("pl_k_p_itl", p0);
       g.b(this.b);
       return;
    }
    public void h(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "12")) {
          return;
       }
       this.b.putBoolean("up_nu_swit_lt", p0);
       g.b(this.b);
       return;
    }
    public long i(){
       Object obj = PatchProxy.apply(null, this, c.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.a.getLong("re_last_ofline_time", 0);
    }
    public void i(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "27")) {
          return;
       }
       this.b.putInt("g_r_d_d_n", p0);
       g.b(this.b);
       return;
    }
    public void i(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "11")) {
          return;
       }
       this.b.putBoolean("up_nu_swit", p0);
       g.b(this.b);
       return;
    }
    public int j(){
       Object obj = PatchProxy.apply(null, this, c.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.getInt("re_net_one_lt", 10);
    }
    public void j(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "17")) {
          return;
       }
       this.b.putInt("re_net_hr", p0);
       g.b(this.b);
       return;
    }
    public int k(){
       Object obj = PatchProxy.apply(null, this, c.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.getInt("re_net_over", 7);
    }
    public void k(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "42")) {
          return;
       }
       this.b.putInt("al_rik_al_ck", p0);
       g.b(this.b);
       return;
    }
    public int l(){
       Object obj = PatchProxy.apply(null, this, c.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.getInt("re_net_hr", 3);
    }
    public void l(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "20")) {
          return;
       }
       this.b.putInt("up_nu_co", p0);
       g.b(this.b);
       return;
    }
    public long m(){
       Object obj = PatchProxy.apply(null, this, c.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.a.getLong("re_day_b_t", 0);
    }
    public long n(){
       Object obj = PatchProxy.apply(null, this, c.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.a.getLong("re_day_len", 0);
    }
    public boolean o(){
       Object obj = PatchProxy.apply(null, this, c.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.getBoolean("up_ala_swit", true);
    }
    public int p(){
       Object obj = PatchProxy.apply(null, this, c.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.getInt("up_nu_co", 50);
    }
    public int q(){
       Object obj = PatchProxy.apply(null, this, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.getInt("up_nu_li", 100);
    }
    public boolean r(){
       Object obj = PatchProxy.apply(null, this, c.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.getBoolean("up_nu_swit", true);
    }
}
