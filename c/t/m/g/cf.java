package c.t.m.g.cf;
import java.lang.Object;
import c.t.m.g.q;
import java.lang.String;
import java.lang.Math;
import c.t.m.g.ed;
import c.t.m.g.eh;
import java.lang.CharSequence;
import android.text.TextUtils;
import c.t.m.g.v;
import c.t.m.g.cb;
import c.t.m.g.ef;
import java.util.HashMap;
import c.t.m.g.cn;
import java.lang.StringBuilder;
import org.json.JSONObject;
import java.util.Map;
import c.t.m.g.ek;

public class cf	// class@000c0c
{
    public long A;
    public long B;
    public int a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public int i;
    public String j;
    public long k;
    public long l;
    public long m;
    public long n;
    public String o;
    public String p;
    public int q;
    public int r;
    public int s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public void cf(){
       super();
       this.l = 0;
       this.m = 0;
       this.n = 0;
       this.o = "";
       this.q = 0;
       this.r = 0;
       this.s = 0;
       this.t = true;
       this.u = true;
       this.v = true;
       this.w = false;
       this.x = false;
       this.y = false;
       this.z = false;
       this.A = 0x4e20;
       this.B = 0x7530;
    }
    public int a(){
       return this.a;
    }
    public void a(int p0){
       this.a = p0;
    }
    public void a(long p0){
       this.l = p0;
    }
    public void a(long p0,boolean p1){
       this.k = Math.max(q.a().c("min_wifi_scan_interval"), p0);
       String str = "WifiInterval";
       if (p1) {
          if (ed.a) {
             ed.b(str, "IndoorMode");
          }
          this.k = 5000;
       }else if(ed.a){
          ed.b(str, "not IndoorMode");
       }
       return;
    }
    public void a(String p0){
       this.b = p0;
    }
    public void a(boolean p0){
       this.t = p0;
    }
    public String b(){
       return this.b;
    }
    public void b(int p0){
       this.i = p0;
    }
    public void b(long p0){
       this.m = p0;
    }
    public void b(String p0){
       this.c = p0;
    }
    public void b(boolean p0){
       this.u = p0;
    }
    public String c(){
       return "0123456789ABCDEF";
    }
    public void c(long p0){
       this.n = p0;
    }
    public void c(String p0){
       this.d = p0;
    }
    public void c(boolean p0){
       this.v = p0;
    }
    public String d(){
       String str = eh.a("LocationSDK", "location_device_id", "");
       if (!TextUtils.isEmpty(this.e) && !("0123456789ABCDEF").equals(this.e)) {
          str = this.e;
       }
       return str;
    }
    public void d(String p0){
       this.f = p0;
    }
    public String e(){
       return v.a();
    }
    public void e(String p0){
       this.e = p0;
    }
    public String f(){
       return cb.d();
    }
    public void f(String p0){
       this.g = p0;
    }
    public String g(){
       return ef.a(this.f);
    }
    public void g(String p0){
       this.h = p0;
    }
    public String h(){
       return ef.a(this.g);
    }
    public void h(String p0){
       this.j = p0;
    }
    public String i(){
       return this.h;
    }
    public void i(String p0){
       this.o = p0;
    }
    public String j(){
       return this.j;
    }
    public long k(){
       return this.l;
    }
    public long l(){
       return this.m;
    }
    public long m(){
       return this.n;
    }
    public long n(){
       return this.k;
    }
    public String o(){
       HashMap hashMap = new HashMap();
       String str = "";
       hashMap.put("imei", str);
       hashMap.put("imsi", str);
       hashMap.put("qq", this.d());
       hashMap.put("mac", str);
       hashMap.put("qimei", cn.a);
       hashMap.put("q16", cn.b);
       hashMap.put("q36", cn.c);
       hashMap.put("idfa", ";"+this.e());
       if (TextUtils.isEmpty(this.e())) {
          str = this.f();
       }
       hashMap.put("idfv", str);
       return new JSONObject(hashMap).toString();
    }
    public String p(){
       if (TextUtils.isEmpty(this.p)) {
          StringBuilder str = "";
          str = (TextUtils.isEmpty(cn.a))? str+v.a(): str+cn.a+"_"+v.a();
          this.p = ek.a(str);
       }else if(ed.a){
          ed.b("AppStatus", "getAccessToken token is null");
       }
       return this.p;
    }
}
