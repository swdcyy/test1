package i30.c0;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import android.content.SharedPreferences;
import oe6.o;
import android.content.SharedPreferences$Editor;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import oe6.g;
import java.lang.Long;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class c0	// class@00178e
{
    public SharedPreferences a;
    public SharedPreferences$Editor b;
    public static SharedPreferences c;

    public void c0(Context p0){
       super();
       SharedPreferences sharedPrefer = o.c(p0, "kscfgdfp", 0);
       this.a = sharedPrefer;
       this.b = sharedPrefer.edit();
    }
    public void a(int p0){
       c0 uoc0 = c0.class;
       if (PatchProxy.isSupport(uoc0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc0, "20")) {
          return;
       }
       this.b.putInt("dfttt_l_idr_ks_ts_22_8", p0);
       g.a(this.b);
       return;
    }
    public void b(long p0){
       c0 uoc0 = c0.class;
       if (PatchProxy.isSupport(uoc0) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoc0, "17")) {
          return;
       }
       this.b.putLong("al_dfr_dd_re_p_sttt_time_22_8", p0);
       g.a(this.b);
       return;
    }
    public void c(boolean p0){
       c0 uoc0 = c0.class;
       if (PatchProxy.isSupport(uoc0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc0, "2")) {
          return;
       }
       this.b.putBoolean("xytk", p0);
       g.b(this.b);
       return;
    }
    public void d(long p0){
       c0 uoc0 = c0.class;
       if (PatchProxy.isSupport(uoc0) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoc0, "22")) {
          return;
       }
       this.b.putLong("dfttt_l_chc_ks_ts_22_8", p0);
       g.a(this.b);
       return;
    }
    public void e(long p0){
       c0 uoc0 = c0.class;
       if (PatchProxy.isSupport(uoc0) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoc0, "29")) {
          return;
       }
       this.b.putLong("repf_yun_cor_ti_22_8", p0);
       g.b(this.b);
       return;
    }
    public void f(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c0.class, "10")) {
          return;
       }
       SharedPreferences c = c0.c;
       if (c != null) {
          g.b(c.edit().putString("kwtk_dd_22_8", p0));
       }else {
          this.b.putString("kwtk_dd_22_8", p0);
          g.b(this.b);
       }
       return;
    }
    public void g(boolean p0){
       c0 uoc0 = c0.class;
       if (PatchProxy.isSupport(uoc0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc0, "15")) {
          return;
       }
       this.b.putBoolean("al_dfr_dd_re_p_sta_22_8", p0);
       g.a(this.b);
       return;
    }
    public String h(){
       Object obj = PatchProxy.apply(null, this, c0.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getString("dfpt_lf_cl_decihas", "");
    }
    public void i(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c0.class, "12")) {
          return;
       }
       this.b.putString("dfpt_lf_th_decitt_22_8", p0);
       g.a(this.b);
       return;
    }
    public String j(){
       SharedPreferences obj = PatchProxy.apply(null, this, c0.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = c0.c;
       if (obj != null) {
          return obj.getString("kwtk_dd_22_8", "");
       }
       return this.a.getString("kwtk_dd_22_8", "");
    }
    public void k(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c0.class, "14")) {
          return;
       }
       this.b.putString("dfpt_lf_in_decitt_22_8", p0);
       g.a(this.b);
       return;
    }
    public void l(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c0.class, "28")) {
          return;
       }
       this.b.putString("dfpt_l_idr_d_22_8", p0);
       g.a(this.b);
       return;
    }
    public boolean m(){
       Object obj = PatchProxy.apply(null, this, c0.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.getBoolean("al_dfr_dd_re_p_sta_22_8", false);
    }
    public long n(){
       Object obj = PatchProxy.apply(null, this, c0.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.a.getLong("sd_in_idr_ks_ts_22_8", 0);
    }
    public String o(){
       Object obj = PatchProxy.apply(null, this, c0.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getString("sd_in_idr_ksDD_tDDDDs_10330", "");
    }
}
