package c.t.m.g.q;
import java.util.Observer;
import java.util.HashMap;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.String;
import java.lang.Integer;
import java.lang.Float;
import java.lang.Double;
import java.lang.Long;
import java.lang.Boolean;
import java.util.Set;
import java.util.Iterator;
import java.lang.Class;
import java.lang.CharSequence;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import c.t.m.g.r;
import android.content.SharedPreferences;
import c.t.m.g.bt;
import java.lang.Throwable;
import c.t.m.g.ca;
import android.content.SharedPreferences$Editor;
import oe6.g;
import c.t.m.g.by;
import c.t.m.g.cb;
import android.os.Build$VERSION;
import java.lang.NullPointerException;
import java.util.Observable;
import java.util.List;
import c.t.m.g.o;

public class q implements Observer	// class@000ca3
{
    public HashMap f;
    public ConcurrentHashMap g;
    public ConcurrentHashMap h;
    public boolean i;
    public AtomicBoolean j;
    public AtomicBoolean k;
    public static String a = "";
    public static String b = "";
    public static String c = "";
    public static final HashMap d;
    public static q e;

    static {
       q.d = new HashMap();
       q.e = null;
    }
    public void q(){
       super();
       this.f = new HashMap();
       this.g = null;
       this.h = null;
       this.i = false;
       this.j = new AtomicBoolean(true);
       this.k = new AtomicBoolean(true);
       HashMap d = q.d;
       this.g = new ConcurrentHashMap((((d.size() * 4) / 3) + true));
       this.h = new ConcurrentHashMap((((d.size() * 4) / 3) + true));
       this.f.put(String.class, "");
       this.f.put(Integer.class, Integer.valueOf(Integer.MIN_VALUE));
       this.f.put(Float.class, Float.valueOf(Float.MIN_VALUE));
       this.f.put(Double.class, Double.valueOf(Double.MIN_VALUE));
       this.f.put(Long.class, Long.valueOf(Long.MIN_VALUE));
       this.f.put(Boolean.class, Boolean.FALSE);
       this.d();
    }
    public static synchronized q a(){
       _monitor_enter(q.class);
       if (q.e == null) {
          q oq = q.class;
          _monitor_enter(oq);
          q.e = new q();
          _monitor_exit(oq);
       }
       _monitor_exit(q.class);
       return q.e;
    }
    public static void a(String p0){
       q.b = p0;
    }
    public static void a(String p0,String p1){
       q.a = p0;
       q.c = p1;
       q.b("app_version", p1);
    }
    public static void a(HashMap p0){
       q.b("cc_version", "-1");
       q.b("cc_req_interval", "10800000");
       q.b("last_pull_time", "0");
       String str = "";
       q.b("list_valid_model", str);
       q.b("list_valid_sdk_int", str);
       Iterator iterator = p0.keySet().iterator();
       while (iterator.hasNext()) {
          str = iterator.next();
          q.b(str, p0.get(str));
       }
       return;
    }
    public static void b(String p0,String p1){
       q.d.put(p0, p1);
    }
    public final Object a(String p0,Class p1){
       if (this.i == null) {
          this.d();
       }
       if (this.f.containsKey(p1)) {
          String str = this.g.get(p0);
          if (str == null || !str.length()) {
             str = q.d.get(p0);
          }
          if (str == null) {
             str = "";
          }
          if (!this.j.get() || !this.k.get()) {
             if (str.contains("[f]")) {
                str = str.replace("[f]", "");
             }else {
                return this.b(q.d.get(p0), p1);
             }
          }
          return this.b(str, p1);
       }else {
          throw new IllegalStateException("The property \""+p0+"\" don\'t support class type \""+p1.toString()+"\"");
       }
    }
    public int b(String p0){
       return this.a(p0, Integer.class).intValue();
    }
    public final Object b(String p0,Class p1){
       Double uDouble;
       if (p1 == Integer.class) {
          return Integer.valueOf(Integer.parseInt(p0));
       }
       if (p1 == Long.class) {
          return Long.valueOf(Long.parseLong(p0));
       }
       if (p1 == Boolean.class) {
          return Boolean.valueOf(Boolean.parseBoolean(p0));
       }
       if (p1 == Float.class) {
          return Float.valueOf(Float.parseFloat(p0));
       }
       if (p1 == Double.class) {
          uDouble = Double.valueOf(Double.parseDouble(p0));
       }
       return uDouble;
    }
    public void b(){
       if (r.a().b() == null) {
          bt.a("CC_Set", "---> read xml: failed,not init finish!");
          return;
       }else {
          Iterator iterator = q.d.keySet().iterator();
          while (iterator.hasNext()) {
             this.f(iterator.next());
          }
          this.i = true;
          this.f();
          bt.a("CC_Set", "---> read xml:"+this.g.toString());
          return;
       }
    }
    public long c(String p0){
       return this.a(p0, Long.class).longValue();
    }
    public void c(){
       this.h.clear();
    }
    public final void d(){
       this.e();
       this.b();
       return;
    }
    public boolean d(String p0){
       return this.a(p0, Boolean.class).booleanValue();
    }
    public String e(String p0){
       return this.a(p0, String.class);
    }
    public final void e(){
       SharedPreferences sharedPrefer = r.a().b();
       if (sharedPrefer == null) {
          return;
       }
       String str = ca.b(sharedPrefer, "app_version", "");
       bt.a("CC_Set", "tagVer:"+q.c+",spVer:"+str);
       if ((q.c).length() > 0 && !(q.c).equals(str)) {
          bt.a("CC_Set", "clear sp > pre:"+str+",now:"+q.c);
          g.a(sharedPrefer.edit().clear());
          ca.a(sharedPrefer, "app_version", q.c);
       }
       return;
    }
    public final void f(){
       String str2;
       String str = ";";
       boolean b = false;
       String str1 = this.g.get("list_valid_model");
       if (by.a(str1)) {
          this.j.getAndSet(true);
       }else {
          str2 = (cb.g()).replace(" ", "");
          String[] stringArray1 = str1.split(str);
          this.j.getAndSet(b);
          int len1 = stringArray1.length;
          int i = 0;
          while (i < len1) {
             if (str2.equalsIgnoreCase(stringArray1[i])) {
                this.j.getAndSet(true);
                break ;
             }
             i = i + 1;
          }
       }
       str1 = this.g.get("list_valid_sdk_int");
       if (by.a(str1)) {
          this.k.getAndSet(true);
       }else {
          str2 = Integer.toString(Build$VERSION.SDK_INT);
          String[] stringArray = str1.split(str);
          this.k.getAndSet(b);
          int len = stringArray.length;
          while (b < len) {
             if (str2.equalsIgnoreCase(stringArray[b])) {
                this.k.getAndSet(true);
                break ;
             }
             b = b + 1;
          }
       }
       return;
    }
    public final void f(String p0){
       if (q.d.get(p0) == null) {
          return;
       }
       SharedPreferences sharedPrefer = r.a().b();
       if (sharedPrefer != null) {
          this.g.put(p0, sharedPrefer.getString(p0, this.g(p0)));
       }
       return;
    }
    public final String g(String p0){
       HashMap d = q.d;
       if (d.containsKey(p0)) {
          return d.get(p0);
       }
       throw new NullPointerException("Not exists property name \""+p0+"\"");
    }
    public void update(Observable p0,Object p1){
       String str = (p1 == null)? null: p1;
       if (str && str.length()) {
          this.f(str);
          bt.a("CC_Set", "update ["+str+"] : "+this.g.get(str)+" --> "+this.g.get(str));
          p1 = this.h.get(str);
          if (p1 != null && !p1.isEmpty()) {
             p1 = p1.iterator();
             while (p1.hasNext()) {
                p1.next().a(str);
             }
          }
       }
       return;
    }
}
