package io.reactivex.android.schedulers.b;
import brd.z;
import android.os.Handler;
import brd.z$c;
import io.reactivex.android.schedulers.b$a;
import java.lang.Runnable;
import java.util.concurrent.TimeUnit;
import crd.b;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import ird.a;
import io.reactivex.android.schedulers.b$b;
import android.os.Message;

public final class b extends z	// class@001816
{
    public final Handler b;
    public final boolean c;

    public void b(Handler p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public z$c b(){
       return new b$a(this.b, this.c);
    }
    public b e(Runnable p0,long p1,TimeUnit p2){
       Objects.requireNonNull(p0, "run == null");
       Objects.requireNonNull(p2, "unit == null");
       b tb = this.b;
       b$b uob = new b$b(tb, a.m(p0));
       Message message = Message.obtain(tb, uob);
       if (this.c != null) {
          message.setAsynchronous(true);
       }
       this.b.sendMessageDelayed(message, p2.toMillis(p1));
       return uob;
    }
}
