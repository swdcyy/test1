package androidx.room.e0;
import androidx.lifecycle.LiveData;
import androidx.room.RoomDatabase;
import v2.r;
import java.util.concurrent.Callable;
import java.lang.String;
import java.util.concurrent.atomic.AtomicBoolean;
import androidx.room.e0$a;
import androidx.room.e0$b;
import androidx.room.e0$c;
import java.util.concurrent.Executor;
import java.lang.Runnable;

public class e0 extends LiveData	// class@00095a
{
    public final RoomDatabase a;
    public final boolean b;
    public final Callable c;
    public final r d;
    public final w$c e;
    public final AtomicBoolean f;
    public final AtomicBoolean g;
    public final AtomicBoolean h;
    public final Runnable i;
    public final Runnable j;

    public void e0(RoomDatabase p0,r p1,boolean p2,Callable p3,String[] p4){
       super();
       this.f = new AtomicBoolean(true);
       this.g = new AtomicBoolean(false);
       this.h = new AtomicBoolean(false);
       this.i = new e0$a(this);
       this.j = new e0$b(this);
       this.a = p0;
       this.b = p2;
       this.c = p3;
       this.d = p1;
       this.e = new e0$c(this, p4);
    }
    public void onActive(){
       super.onActive();
       this.d.b(this);
       this.q().execute(this.i);
    }
    public void onInactive(){
       super.onInactive();
       this.d.c(this);
    }
    public Executor q(){
       if (this.b != null) {
          return this.a.q();
       }
       return this.a.o();
    }
}
