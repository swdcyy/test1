package m6.a;
import java.lang.Object;
import s6.b;
import android.content.Context;
import s6.a;
import java.lang.String;
import u6.g;
import java.lang.Integer;
import java.lang.CharSequence;
import android.text.TextUtils;
import org.json.JSONObject;
import java.lang.Throwable;
import u6.c;
import java.util.Objects;
import k6.a;
import java.util.List;
import org.json.JSONArray;
import java.util.Iterator;
import m6.a$b;
import java.util.ArrayList;
import m6.a$a;
import android.os.ConditionVariable;
import java.lang.Thread;
import u6.k;
import java.lang.Runnable;
import java.lang.StringBuilder;
import java.lang.Math;
import com.alipay.sdk.m.q.b;

public final class a	// class@0025b4
{
    public int a;
    public boolean b;
    public String c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public String k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public String q;
    public String r;
    public boolean s;
    public boolean t;
    public int u;
    public JSONObject v;
    public List w;
    public int x;
    public static a y;

    public void a(){
       super();
       this.a = 0x2710;
       this.b = false;
       this.c = "https://h5.m.taobao.com/mlapp/olist.html";
       this.d = 10;
       this.e = true;
       this.f = true;
       this.g = false;
       this.h = false;
       this.i = true;
       this.j = true;
       this.k = "";
       this.l = false;
       this.m = false;
       this.n = false;
       this.o = false;
       this.p = true;
       this.q = "";
       this.r = "";
       this.s = false;
       this.t = false;
       this.u = 600;
       this.w = null;
       this.x = -1;
    }
    public static a A(){
       if (a.y == null) {
          a uoa = new a();
          a.y = uoa;
          Context uContext = b.d().b();
          String str = g.b(null, uContext, "alipay_cashier_dynamic_config", null);
          String str1 = g.b(null, uContext, "utdid_factor", "-1");
          try{
             uoa.x = Integer.parseInt(str1);
          }catch(java.lang.Exception e0){
          }
          if (!TextUtils.isEmpty(str)) {
             e0.c(new JSONObject(str));
          }
       }
       return a.y;
    }
    public static void b(a p0,a p1,String p2){
       Objects.requireNonNull(p0);
       if (TextUtils.isEmpty(p2)) {
       }else {
          JSONObject jSONObject = new JSONObject(p2);
          JSONObject jSONObject1 = jSONObject.optJSONObject("st_sdk_config");
          JSONObject jSONObject2 = null;
          String str = jSONObject.optString("ap_resp");
          try{
             if (!TextUtils.isEmpty(str)) {
                jSONObject2 = new JSONObject(str);
             }
          }catch(org.json.JSONException e2){
             a.d(p1, "biz", "APMEx2", e2);
          }
          if (jSONObject1 != null && jSONObject2 != null) {
             try{
                jSONObject1.putOpt("ap_args", jSONObject2);
             }catch(org.json.JSONException e2){
                a.d(p1, "biz", "APMEx2", e2);
             }
          }
       }
    label_0056 :
       return;
    }
    public final JSONObject B(){
       JSONArray jSONArray;
       JSONObject jSONObject = new JSONObject();
       jSONObject.put("timeout", this.o());
       jSONObject.put("h5_port_degrade", this.w());
       jSONObject.put("tbreturl", this.u());
       jSONObject.put("configQueryInterval", this.h());
       List list = this.p();
       if (list == null) {
          jSONArray = null;
       }else {
          JSONArray jSONArray1 = new JSONArray();
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             jSONArray1.put(a$b.a(iterator.next()));
          }
          jSONArray = jSONArray1;
       }
       jSONObject.put("launchAppSwitch", jSONArray);
       jSONObject.put("scheme_pay_2", this.m());
       jSONObject.put("intercept_batch", this.l());
       jSONObject.put("deg_log_mcgw", this.i());
       jSONObject.put("deg_start_srv_first", this.j());
       jSONObject.put("prev_jump_dual", this.q());
       jSONObject.put("use_sc_only", this.k());
       jSONObject.put("bind_use_imp", this.f());
       jSONObject.put("retry_bnd_once", this.r());
       jSONObject.put("skip_trans", this.t());
       jSONObject.put("start_trans", this.y());
       jSONObject.put("up_before_pay", this.v());
       jSONObject.put("use_sc_lck_a", this.s());
       jSONObject.put("lck_k", this.n());
       jSONObject.put("bind_with_startActivity", this.g());
       jSONObject.put("retry_aidl_activity_not_start", this.x());
       jSONObject.put("cfg_max_time", this.z());
       jSONObject.put("ap_args", this.a());
       return jSONObject;
    }
    public JSONObject a(){
       return this.v;
    }
    public final void c(JSONObject p0){
       this.a = p0.optInt("timeout", 0x2710);
       boolean b = false;
       this.b = p0.optBoolean("h5_port_degrade", b);
       this.c = (p0.optString("tbreturl", "https://h5.m.taobao.com/mlapp/olist.html")).trim();
       this.d = p0.optInt("configQueryInterval", 10);
       JSONArray jSONArray = p0.optJSONArray("launchAppSwitch");
       List list = null;
       if (jSONArray == null) {
       }else {
          ArrayList uArrayList = new ArrayList();
          int i = jSONArray.length();
          int i1 = 0;
          while (i1 < i) {
             JSONObject jSONObject = jSONArray.optJSONObject(i1);
             List list1 = (jSONObject == null)? list: new a$b(jSONObject.optString("pn"), jSONObject.optInt("v", b), jSONObject.optString("pk"));
             if (list1 != null) {
                uArrayList.add(list1);
             }
             i1 = i1 + 1;
          }
          list = uArrayList;
       }
       this.w = list;
       this.e = p0.optBoolean("scheme_pay_2", true);
       this.f = p0.optBoolean("intercept_batch", true);
       this.h = p0.optBoolean("deg_log_mcgw", b);
       this.i = p0.optBoolean("deg_start_srv_first", true);
       this.j = p0.optBoolean("prev_jump_dual", true);
       this.k = p0.optString("use_sc_only", "");
       this.l = p0.optBoolean("bind_use_imp", b);
       this.m = p0.optBoolean("retry_bnd_once", b);
       this.n = p0.optBoolean("skip_trans", b);
       this.o = p0.optBoolean("start_trans", b);
       this.p = p0.optBoolean("up_before_pay", true);
       this.q = p0.optString("lck_k", "");
       this.s = p0.optBoolean("use_sc_lck_a", b);
       this.t = p0.optBoolean("retry_aidl_activity_not_start", b);
       this.r = p0.optString("bind_with_startActivity", "");
       this.u = p0.optInt("cfg_max_time", 600);
       this.v = p0.optJSONObject("ap_args");
       return;
    }
    public void d(a p0,Context p1,boolean p2){
       a$a uoa = new a$a(this, p0, p1);
       if (p2) {
          int i = this.z();
          long l = (long)i;
          StringBuilder str = "AlipayDCPBlok";
          ConditionVariable uConditionVa = new ConditionVariable();
          Thread thread = new Thread(new k(uoa, uConditionVa));
          if (!TextUtils.isEmpty(str)) {
             thread.setName(str);
          }
          thread.start();
          str = 1;
          if (l <= 0) {
             uConditionVa.block();
          }else {
             str = uConditionVa.block(l);
          }
          if (!str) {
             a.h(p0, "biz", "LogAppFetchConfigTimeout", i);
          }
       }else {
          Thread thread1 = new Thread(uoa);
          thread1.setName("AlipayDCP");
          thread1.start();
       }
       return;
    }
    public boolean e(Context p0,int p1){
       a uoa = this;
       int i = -1;
       boolean i1 = 0;
       if (uoa.x == i) {
          String str = b.d().c();
          if (!TextUtils.isEmpty(str)) {
             str = str.replaceAll("=", "");
             int i2 = 5;
             if (str.length() >= i2) {
                str = str.substring(i1, i2);
             }
             int i3 = (int)Math.pow(2.00f, (double)6);
             i2 = str.length();
             long l = 0;
             int i4 = i2;
             int i5 = 0;
             while (i5 < i2) {
                int i6 = i5 + 1;
                String str1 = str.substring(i5, i6);
                int i7 = 0;
                while (true) {
                   if (i7 < 64) {
                      if (str1.equals(String.valueOf(b.b[i7]))) {
                      label_0059 :
                         i4 = i4 + i;
                         long l1 = (long)Integer.parseInt(String.valueOf(i7)) * (long)Math.pow((double)i3, (double)i4);
                         l = l + l1;
                         i5 = i6;
                         String str2 = null;
                      }else {
                         i7 = i7 + 1;
                      }
                   }else {
                      i7 = 0;
                      goto label_0059 ;
                   }
                }
             }
             i = (int)(l % 0x2710);
             if (i < 0) {
                i = i * -1;
             }
          }else {
             i = -1;
          }
          uoa.x = i;
          g.c(null, p0, "utdid_factor", String.valueOf(i));
       }
       i1 = (uoa.x < p1)? true: false;
       return i1;
    }
    public boolean f(){
       return this.l;
    }
    public String g(){
       return this.r;
    }
    public int h(){
       return this.d;
    }
    public boolean i(){
       return this.h;
    }
    public boolean j(){
       return this.i;
    }
    public String k(){
       return this.k;
    }
    public boolean l(){
       return this.f;
    }
    public boolean m(){
       return this.e;
    }
    public String n(){
       return this.q;
    }
    public int o(){
       a ta = this.a;
       if (ta < 1000 || ta > 0x4e20) {
          c.e("DynCon", "time\(def\) = 10000");
          return 0x2710;
       }else {
          c.e("DynCon", "time = "+this.a);
          return this.a;
       }
    }
    public List p(){
       return this.w;
    }
    public boolean q(){
       return this.j;
    }
    public boolean r(){
       return this.m;
    }
    public boolean s(){
       return this.s;
    }
    public boolean t(){
       return this.n;
    }
    public String u(){
       return this.c;
    }
    public boolean v(){
       return this.p;
    }
    public boolean w(){
       return this.b;
    }
    public boolean x(){
       return this.t;
    }
    public boolean y(){
       return this.o;
    }
    public final int z(){
       return this.u;
    }
}
