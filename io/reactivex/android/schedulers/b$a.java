package io.reactivex.android.schedulers.b$a;
import brd.z$c;
import android.os.Handler;
import java.lang.Runnable;
import java.util.concurrent.TimeUnit;
import crd.b;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import crd.c;
import ird.a;
import io.reactivex.android.schedulers.b$b;
import android.os.Message;

public final class b$a extends z$c	// class@001814
{
    public final Handler b;
    public final boolean c;
    public boolean d;

    public void b$a(Handler p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public b c(Runnable p0,long p1,TimeUnit p2){
       Objects.requireNonNull(p0, "run == null");
       Objects.requireNonNull(p2, "unit == null");
       if (this.d != null) {
          return c.a();
       }
       b$a tb = this.b;
       b$b uob = new b$b(tb, a.m(p0));
       Message message = Message.obtain(tb, uob);
       message.obj = this;
       if (this.c != null) {
          message.setAsynchronous(true);
       }
       this.b.sendMessageDelayed(message, p2.toMillis(p1));
       if (this.d != null) {
          this.b.removeCallbacks(uob);
          return c.a();
       }else {
          return uob;
       }
    }
    public void dispose(){
       this.d = true;
       this.b.removeCallbacksAndMessages(this);
    }
    public boolean isDisposed(){
       return this.d;
    }
}
