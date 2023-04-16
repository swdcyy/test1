package androidx.room.f0$a;
import io.reactivex.i;
import java.util.concurrent.Callable;
import java.lang.Object;
import brd.c0;
import java.lang.Throwable;

public class f0$a implements i	// class@00095c
{
    public final Callable a;

    public void f0$a(Callable p0){
       this.a = p0;
       super();
    }
    public void a(c0 p0){
       try{
          p0.onSuccess(this.a.call());
       }catch(androidx.room.EmptyResultSetException e0){
          p0.tryOnError(e0);
       }
       return;
    }
}
