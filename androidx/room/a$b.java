package androidx.room.a$b;
import java.lang.Runnable;
import androidx.room.a;
import java.lang.Object;
import android.os.SystemClock;
import a3.b;
import java.io.Closeable;
import java.lang.Exception;
import x2.e;
import java.lang.IllegalStateException;
import java.lang.String;

public class a$b implements Runnable	// class@00094c
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public void run(){
       a d = this.b.d;
       _monitor_enter(d);
       a$b tb = this.b;
       if ((SystemClock.uptimeMillis() - tb.h) - tb.e < 0) {
          _monitor_exit(d);
          return;
       }else if(tb.g != null){
          _monitor_exit(d);
          return;
       }else {
          a c = tb.c;
          if (c == null) {
             throw new IllegalStateException("mOnAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
          }
          c.run();
          c = this.b.i;
          if (c != null && c.isOpen()) {
             b uob = null;
             try{
                this.b.i.close();
                this.b.i = uob;
             }catch(java.io.IOException e2){
                e.a(e2);
                throw uob;
             }
          }
          _monitor_exit(d);
          return;
       }
    }
}
