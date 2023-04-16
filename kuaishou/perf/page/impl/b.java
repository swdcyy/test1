package kuaishou.perf.page.impl.b;
import java.util.HashMap;
import kuaishou.perf.page.impl.c$b;
import kuaishou.perf.page.impl.c;
import kuaishou.perf.page.impl.c$a;
import com.google.gson.Gson;
import java.lang.String;
import java.lang.Object;
import kuaishou.perf.page.impl.PageData;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import java.util.Map;
import kuaishou.perf.page.impl.a;
import wtd.a;
import java.lang.Runnable;
import t45.c;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

public class b	// class@001bec
{
    public boolean a;
    public float b;
    public boolean c;
    public final PageData d;
    public AtomicBoolean e;
    public static Map f;
    public static c g;
    public static final Gson h;

    static {
       b.f = new HashMap();
       c$b uob = new c$b();
       c uoc = new c(null);
       uoc.a = uob.a;
       uoc.b = uob.b;
       b.g = uoc;
       b.h = new Gson();
    }
    public void b(String p0,String p1){
       super();
       this.a = false;
       this.c = false;
       PageData pageData = new PageData();
       this.d = pageData;
       pageData.scene = p0;
       pageData.subScene = p1;
    }
    public static b d(String p0){
       String str;
       _monitor_enter(b.class);
       if (TextUtils.isEmpty(p0)) {
          _monitor_exit(b.class);
       }else if(TextUtils.isEmpty("")){
          str = p0;
       }else {
          str = p0+":"+"";
       }
       b uob = b.f.get(str);
       if (uob == null) {
          uob = new b(p0, "");
          b.f.put(str, uob);
       }
       b uob1 = uob;
       _monitor_exit(b.class);
       return null;
    }
    public void a(String p0,String p1){
       if (this.e()) {
          a.a("PageLogger", "addArg key:"+p0+" value:"+p1);
          this.d.addArg(p0, p1);
       }
       return;
    }
    public void b(Map p0){
       if (this.e()) {
          a.a("PageLogger", "addArg map:"+p0);
          this.d.addArg(p0);
       }
       return;
    }
    public void c(){
       if (!this.e()) {
          return;
       }
       boolean b = true;
       if (!this.d.isValid()) {
          a.b("PageLogger", "end fail mark dirty data perhaps as 1. empty 2. stage had already start but not end");
          this.c = b;
          return;
       }else {
          this.d.end();
          this.a = b;
          c.a(new a(this.d.copyUploadInfo()));
          return;
       }
    }
    public final boolean e(){
       boolean b = true;
       if (this.e == null) {
          _monitor_enter(this);
          if (this.e == null) {
             b tb = this.b;
             AtomicBoolean uAtomicBoole = null;
             if (tb - uAtomicBoole <= 0) {
                tb = b.g.b;
             }
             if (tb - 0x3f800000 > 0) {
                uAtomicBoole = 0x3f800000;
             }else if(tb - uAtomicBoole < 0){
                uAtomicBoole = tb;
             }
             boolean b1 = (new Random().nextFloat() - uAtomicBoole < 0)? true: false;
             this.e = new AtomicBoolean(b1);
          }
          _monitor_exit(this);
       }
       if (!this.e.get() || (this.a != null || this.c != null)) {
          b = false;
       }
       return b;
    }
    public void f(String p0){
       if (this.e()) {
          a.a("PageLogger", "recordStageBegin alias stage:"+p0);
          this.d.recordStageBegin(p0);
       }
       return;
    }
    public void g(String p0,long p1,long p2){
       if (this.e()) {
          a.a("PageLogger", "recordStageDirect alias stage:"+p0);
          this.d.recordStageDirect(p0, p1, p2);
       }
       return;
    }
    public void h(String p0){
       if (!this.e()) {
          return;
       }
       a.a("PageLogger", "recordStageEnd alias stage:"+p0);
       if (!this.d.recordStageEnd(p0)) {
          a.b("PageLogger", "recordStageEnd fail mark dirty data as stage not start;");
          this.c = true;
       }
       return;
    }
    public void i(){
       a.a("PageLogger", "reset");
       this.a = false;
       this.c = false;
       this.d.reset();
       this.e = null;
    }
    public void j(float p0){
       this.b = p0;
    }
    public void k(){
       if (this.e()) {
          a.a("PageLogger", "start");
          this.d.start();
       }
       return;
    }
}
