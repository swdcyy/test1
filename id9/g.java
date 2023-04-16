package id9.g;
import java.lang.Runnable;
import id9.t;
import java.lang.Object;
import java.util.Objects;
import id9.s;
import ekd.k1;

public final class g implements Runnable	// class@0027ed
{
    public final t b;

    public void g(t p0){
       this.b = p0;
    }
    public final void run(){
       g tb = this.b;
       Objects.requireNonNull(tb);
       k1.r(new s(tb), 100);
    }
}
