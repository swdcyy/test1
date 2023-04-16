package cc8.m;
import java.lang.Runnable;
import cc8.o;
import java.lang.Object;
import java.util.Objects;
import wi8.c;
import com.mini.d;

public final class m implements Runnable	// class@0003ed
{
    public final o b;

    public void m(o p0){
       this.b = p0;
    }
    public final void run(){
       m tb = this.b;
       Objects.requireNonNull(tb);
       d.v().X1(tb.e, ((long)tb.a + 300));
    }
}
