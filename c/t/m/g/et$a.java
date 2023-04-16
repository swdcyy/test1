package c.t.m.g.et$a;
import java.lang.Thread;
import c.t.m.g.et;
import java.lang.String;
import java.lang.Throwable;
import c.t.m.g.ex;
import android.content.Context;
import c.t.m.g.fk;
import java.lang.StringBuilder;
import c.t.m.g.en;
import java.util.concurrent.CountDownLatch;

public class et$a extends Thread	// class@000c7a
{
    public final et a;
    public String b;
    public Throwable c;

    public void et$a(et p0,String p1,Throwable p2){
       this.a = p0;
       super();
       this.b = p1;
       this.c = p2;
    }
    public void run(){
       if (ex.a) {
          ex.a(et.b(), "start uploadBufferSync");
       }
       if (et.a(this.a) != null) {
          et$a tb = this.b;
          if (tb != null && tb.length()) {
             int c = fk.c;
             fk.c = 3000;
             if (ex.a) {
                ex.a(et.b(), "exception error--"+this.b);
             }
             en.a().a((this.b).getBytes());
             et.b(this.a).countDown();
             fk.c = c;
          }
       }
       return;
    }
}
