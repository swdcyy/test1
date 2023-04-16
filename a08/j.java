package a08.j;
import erd.g;
import com.kwaishou.merchant.daccore.b;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import f08.f;
import java.lang.String;
import f08.f$a;

public final class j implements g	// class@00000f
{
    public final b b;

    public void j(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j tb = this.b;
       Objects.requireNonNull(tb);
       f.a.m(tb.l, "getPendantConfigFromRNLive waitForEnvLatch error", p0);
    }
}
