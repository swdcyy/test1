package jc9.c0;
import java.lang.Runnable;
import jc9.b0$b;
import java.lang.Object;
import java.util.Objects;
import fw8.r;
import jc9.b0;
import fw8.r$a;

public final class c0 implements Runnable	// class@002939
{
    public final b0$b b;

    public void c0(b0$b p0){
       this.b = p0;
    }
    public final void run(){
       c0 tb = this.b;
       Objects.requireNonNull(tb);
       r.c().g(tb.a.l);
    }
}
