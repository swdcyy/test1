package kuaishou.perf.page.impl.d;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.String;
import com.google.gson.Gson;
import java.lang.Object;
import kuaishou.perf.page.impl.PostPageData;
import java.util.Map;
import kuaishou.perf.page.impl.d$a;
import java.lang.Runnable;
import t45.c;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import java.lang.System;
import java.lang.Boolean;

public class d	// class@001bf2
{
    public boolean a;
    public boolean b;
    public PostPageData c;
    public static Map d;
    public static Map e;
    public static Map f;
    public static d g;
    public static Gson h;
    public static boolean i;
    public static boolean j;

    static {
       d.d = new ConcurrentHashMap();
       d.e = new ConcurrentHashMap();
       d.f = new ConcurrentHashMap();
       d.g = new d("");
       d.h = new Gson();
       d.i = true;
       d.j = false;
    }
    public void d(String p0){
       super();
       this.a = false;
       this.b = false;
       PostPageData postPageData = new PostPageData();
       this.c = postPageData;
       postPageData.scene = p0;
    }
    public static void b(String p0,String p1){
       if (p1 == null) {
       }else {
          d.f.put(p0, p1);
       }
       return;
    }
    public static d d(String p0){
       if (!d.i) {
          return d.g;
       }
       d uod = d.d.get(p0);
       if (uod == null) {
          _monitor_enter(d.class);
          uod = d.d.get(p0);
          if (uod == null) {
             uod = new d(p0);
             d.d.put(p0, uod);
          }
          _monitor_exit(d.class);
       }
       return uod;
    }
    public void a(String p0,String p1){
       if (this.e()) {
          this.c.addArg(p0, p1);
       }
       return;
    }
    public void c(){
       if (this.e() && this.c.isValid()) {
          this.a = true;
          this.c.end();
          this.i();
       }
       return;
    }
    public final boolean e(){
       boolean b = (d.i && (this.a == null && this.b == null))? true: false;
       return b;
    }
    public void f(){
       this.b = true;
    }
    public void g(String p0){
       if (this.e()) {
          this.c.recordStageBegin(p0);
       }
       return;
    }
    public void h(String p0){
       if (this.e() && !this.c.recordStageEnd(p0)) {
          this.b = true;
       }
       return;
    }
    public final void i(){
       c.a(new d$a(this));
    }
    public void j(long p0){
       if (d.i) {
          d tc = this.c;
          tc.totalCost = p0;
          tc.type = "";
          tc.pageStages.clear();
          this.i();
       }
       return;
    }
    public void k(String p0){
       this.a("openMode", p0);
    }
    public void l(String p0){
       if (!d.i || (!TextUtils.isEmpty(p0) && !TextUtils.equals(p0, this.c.type))) {
          this.c.type = (!TextUtils.isEmpty(this.c.type))? this.c.type+"_"+p0: p0;
       }
    label_0040 :
       return;
    }
    public void m(String[] p0){
       if (!d.i) {
          return;
       }
       if (p0.length > 0) {
          StringBuilder str = "";
          int len = p0.length;
          for (int i = 0; i < len; i = i + 1) {
             str = str+p0[i]+"_";
          }
          str.deleteCharAt(str.lastIndexOf("_"));
          p0.type = str;
       }
       return;
    }
    public void n(){
       System.currentTimeMillis();
       if (d.i) {
          this.a = false;
          this.b = false;
          this.c.reset();
       }
       if (this.e()) {
          this.c.start();
          if (d.e.containsKey(this.c.scene) && d.e.get(this.c.scene).booleanValue()) {
             this.k("warm");
          }else {
             this.k("cold");
             d.e.put(this.c.scene, Boolean.TRUE);
          }
       }
       return;
    }
}
