package c.t.m.g.av;
import c.t.m.g.ay;
import android.os.HandlerThread;
import android.os.Handler;
import c.t.m.g.bo;
import c.t.m.g.bt;
import java.lang.String;
import java.lang.Throwable;
import android.os.Message;
import c.t.m.g.bp;
import android.os.Looper;
import java.lang.StringBuilder;
import c.t.m.g.av$a;

public abstract class av extends ay	// class@000bd7
{
    public HandlerThread c;
    public av$a d;

    public void av(){
       super();
       this.c = null;
       this.d = null;
    }
    private void a(long p0){
       bo.a(this.c, this.d, p0, false);
       this.c = null;
       this.d = null;
       return;
    }
    public abstract void a(Message p0);
    public boolean a(int p0,long p1){
       ay tb = this.b;
       _monitor_enter(tb);
       _monitor_exit(tb);
       return bp.a(this.d, p0, p1);
    }
    public boolean a(Message p0,long p1){
       ay tb = this.b;
       _monitor_enter(tb);
       _monitor_exit(tb);
       return bp.a(this.d, p0, p1);
    }
    public int b(Looper p0){
       ay tb = this.b;
       _monitor_enter(tb);
       if (this.e()) {
          _monitor_exit(tb);
          return -1;
       }else {
          this.a = true;
          if (bt.a()) {
             bt.a(this.b(), "startup\(\)");
          }
          if (p0 == null) {
             this.c = new HandlerThread("th_"+this.b());
             this.c.start();
             this.d = new av$a(this, this.c.getLooper());
          }else {
             this.d = new av$a(this, p0);
          }
          _monitor_exit(tb);
          return this.a(this.d.getLooper());
       }
    }
    public void b(long p0){
       ay tb = this.b;
       _monitor_enter(tb);
       if (this.a == null) {
          _monitor_exit(tb);
          return;
       }else if(bt.a()){
          bt.a(this.b(), "shutdown\(\)");
       }
       this.a();
       this.a(p0);
       this.a = false;
       _monitor_exit(tb);
       return;
    }
    public void c(){
       this.b(0);
    }
    public Handler d(){
       ay tb = this.b;
       _monitor_enter(tb);
       _monitor_exit(tb);
       return this.d;
    }
}
