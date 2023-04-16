package eoc.e$a;
import brd.z$c;
import android.os.Handler;
import java.lang.Runnable;
import java.util.concurrent.TimeUnit;
import crd.b;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import crd.c;
import ekd.k1;
import eoc.e;
import ird.a;
import eoc.e$b;
import android.os.Message;

public final class e$a extends z$c	// class@001582
{
    public boolean b;
    public final Handler c;

    public void e$a(Handler p0){
       super();
       this.c = p0;
    }
    public b c(Runnable p0,long p1,TimeUnit p2){
       Objects.requireNonNull(p0, "run == null");
       Objects.requireNonNull(p2, "unit == null");
       if (this.b != null) {
          return c.a();
       }
       if (k1.g() && !p1 - null) {
          p0.run();
          return e.d;
       }else {
          e$a tc = this.c;
          e$b uob = new e$b(tc, a.m(p0));
          Message message = Message.obtain(tc, uob);
          message.obj = this;
          this.c.sendMessageDelayed(message, p2.toMillis(p1));
          if (this.b == null) {
             return uob;
          }
          this.c.removeCallbacks(uob);
          return c.a();
       }
    }
    public void dispose(){
       this.b = true;
       this.c.removeCallbacksAndMessages(this);
    }
    public boolean isDisposed(){
       return this.b;
    }
}
