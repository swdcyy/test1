package c.t.m.g.en;
import android.content.Context;
import java.lang.Object;
import java.util.HashSet;
import android.os.HandlerThread;
import java.lang.String;
import android.os.Looper;
import c.t.m.g.en$a;
import c.t.m.g.fj;
import c.t.m.g.fk;
import c.t.m.g.er;
import java.lang.Throwable;
import android.util.Pair;
import c.t.m.g.ex;
import java.lang.StringBuilder;
import java.lang.Exception;

public class en	// class@000c72
{
    public final String a;
    public HandlerThread b;
    public en$a c;
    public boolean d;
    public Context e;
    public er g;
    public Looper h;
    public HashSet i;
    public static en f;

    public void en(Context p0){
       super();
       this.a = "asyncTask";
       this.i = new HashSet();
       this.e = p0.getApplicationContext();
       HandlerThread handlerThrea = new HandlerThread("d_thread");
       this.b = handlerThrea;
       handlerThrea.start();
       this.h = this.b.getLooper();
       this.c = new en$a(this, this.h);
       if (fj.e(p0) > 0) {
          fk.e = true;
       }
       return;
    }
    public static en a(){
       return en.a(fk.a);
    }
    public static en a(Context p0){
       if (en.f == null) {
          _monitor_enter(en.class);
          if (en.f == null) {
             en.f = new en(p0);
          }
          _monitor_exit(en.class);
       }
       return en.f;
    }
    public static er a(en p0){
       return p0.g;
    }
    public void a(String p0,String p1){
       en tg = this.g;
       if (tg != null) {
          tg.a(p0, p1);
       }
       return;
    }
    public synchronized void a(Throwable p0,boolean p1,String p2){
       try{
          Pair pair = fj.a(this.e, p0, p2);
          if (pair == null) {
             return;
          }else {
             Pair first = pair.first;
             if (ex.a) {
                ex.b("asyncTask", "md5:"+first+","+pair.second);
             }
             if (this.i.contains(first)) {
                return;
             }else {
                this.i.add(first);
                en tg = this.g;
                if (tg != null) {
                   tg.a(pair.second, 1);
                }
             }
          }
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
       }
       return;
    }
    public void a(byte[] p0){
       en tg = this.g;
       if (tg != null) {
          tg.a(p0);
       }else if(ex.a){
          ex.a("asyncTask", "modulelog is null");
       }
       return;
    }
    public void b(){
       if (this.d != null) {
          return;
       }
       this.g = new er(this.e, this.b.getLooper());
       this.d = true;
       if (ex.a) {
          ex.a("asyncTask", "AsynchHandler thread start");
       }
       return;
    }
    public Looper c(){
       return this.h;
    }
    public void d(){
       en tg = this.g;
       if (tg != null) {
          tg.c();
       }
       return;
    }
}
