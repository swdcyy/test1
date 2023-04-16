package l30.y;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import android.content.SharedPreferences;
import oe6.o;
import android.content.SharedPreferences$Editor;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Integer;
import oe6.g;
import java.lang.Long;

public class y	// class@001d3e
{
    public SharedPreferences a;
    public SharedPreferences$Editor b;

    public void y(Context p0){
       super();
       SharedPreferences sharedPrefer = o.c(p0, "kspocfp", 0);
       this.a = sharedPrefer;
       this.b = sharedPrefer.edit();
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, y.class, "54");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.getBoolean("na_m_lm_en", true);
    }
    public int b(){
       Object obj = PatchProxy.apply(null, this, y.class, "60");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.getInt("up_nu_li", 100);
    }
    public long c(){
       Object obj = PatchProxy.apply(null, this, y.class, "77");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.a.getLong("repf_yun_wa_ti", 0);
    }
    public void d(int p0){
       y oy = y.class;
       if (PatchProxy.isSupport(oy) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oy, "30")) {
          return;
       }
       this.b.putInt("dfttt_l_s_ks_ts", p0);
       g.a(this.b);
       return;
    }
    public void e(long p0){
       y oy = y.class;
       if (PatchProxy.isSupport(oy) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, oy, "18")) {
          return;
       }
       this.b.putLong("updp_ks_f_t", p0);
       g.a(this.b);
       return;
    }
    public void f(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y.class, "6")) {
          return;
       }
       this.b.putString("kwtk_pro", p0);
       g.b(this.b);
       return;
    }
    public void g(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, y.class, "13")) {
          return;
       }
       this.b.putString(p0, p1);
       this.b.putString("k_s_t_c_s", p2);
       g.a(this.b);
       return;
    }
    public boolean h(){
       Object obj = PatchProxy.apply(null, this, y.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.getBoolean("up_nu_swit", true);
    }
    public String i(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, y.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getString(p0, "");
    }
    public void j(long p0){
       y oy = y.class;
       if (PatchProxy.isSupport(oy) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, oy, "64")) {
          return;
       }
       this.b.putLong("re_day_len", p0);
       g.b(this.b);
       return;
    }
    public void k(long p0){
       y oy = y.class;
       if (PatchProxy.isSupport(oy) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, oy, "67")) {
          return;
       }
       this.b.putLong("re_day_b_t", p0);
       g.b(this.b);
       return;
    }
    public String l(){
       Object obj = PatchProxy.apply(null, this, y.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getString("kwtk_pro", "");
    }
    public void m(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y.class, "24")) {
          return;
       }
       this.b.putString("oai_ll_sn_d", p0);
       g.a(this.b);
       return;
    }
    public long n(){
       Object obj = PatchProxy.apply(null, this, y.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.a.getLong("updp_ks_f_t", 0);
    }
    public void o(int p0){
       y oy = y.class;
       if (PatchProxy.isSupport(oy) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oy, "70")) {
          return;
       }
       this.b.putInt("g_r_d_d_n", p0);
       g.b(this.b);
       return;
    }
    public boolean p(){
       Object obj = PatchProxy.apply(null, this, y.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.getBoolean("dndp_ks_t_t", false);
    }
    public String q(){
       Object obj = PatchProxy.apply(null, this, y.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getString("oai_ll_sn_d", "");
    }
}
