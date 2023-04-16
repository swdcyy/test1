package a08.i;
import erd.g;
import com.kwaishou.merchant.daccore.b;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import f08.f;
import java.lang.String;
import f08.f$a;

public final class i implements g	// class@00000e
{
    public final b b;

    public void i(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       i tb = this.b;
       Objects.requireNonNull(tb);
       f.a.m(tb.l, "processAction waitForEnvLatch error", p0);
    }
}
