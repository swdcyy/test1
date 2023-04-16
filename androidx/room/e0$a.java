package androidx.room.e0$a;
import java.lang.Runnable;
import androidx.room.e0;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import androidx.room.w;
import androidx.room.RoomDatabase;
import androidx.room.w$c;
import java.util.concurrent.Callable;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.Throwable;
import androidx.lifecycle.LiveData;

public class e0$a implements Runnable	// class@000957
{
    public final e0 b;

    public void e0$a(e0 p0){
       this.b = p0;
       super();
    }
    public void run(){
       int i;
       if (this.b.h.compareAndSet(false, true)) {
          this.b.a.m().b(this.b.e);
       }
       do {
          if (this.b.g.compareAndSet(false, true)) {
             e0$a uoa = null;
             i = 0;
             while (this.b.f.compareAndSet(true, false)) {
                try{
                   uoa = this.b.c.call();
                   i = 1;
                }catch(java.lang.Exception e0){
                   throw new RuntimeException("Exception while computing database live data.", e0);
                }
             }
             if (i) {
                this.b.postValue(uoa);
             }
             this.b.g.set(false);
          }else {
             i = 0;
          }
       } while (!i || !this.b.f.get());
       return;
    }
}
