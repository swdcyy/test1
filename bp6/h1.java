package bp6.h1;
import java.util.concurrent.Callable;
import com.kwai.imsdk.internal.v;
import com.kwai.imsdk.msg.KwaiMsg;
import java.lang.Object;
import java.util.Objects;
import java.lang.String;
import com.kwai.imsdk.internal.o;
import com.kwai.imsdk.internal.client.i;
import java.lang.Boolean;

public final class h1 implements Callable	// class@000524
{
    public final v b;
    public final KwaiMsg c;

    public void h1(v p0,KwaiMsg p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object call(){
       h1 tb = this.b;
       h1 tc = this.c;
       Objects.requireNonNull(tb);
       tb.b(tc.getTargetType(), tc.getTarget());
       v b = tb.b;
       Objects.requireNonNull(b);
       return Boolean.valueOf(i.t(b.g).o(b.i, tc.getTargetType(), tc.getClientSeq(), true));
    }
}
