package bp6.d;
import xp6.c$a;
import brd.v;
import com.kwai.imsdk.msg.KwaiMsg;
import java.lang.Object;
import com.kwai.imsdk.msg.state.b;
import iq6.f;
import iq6.m;
import brd.g;

public final class d implements c$a	// class@00050d
{
    public final v a;
    public final KwaiMsg b;

    public void d(v p0,KwaiMsg p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void accept(Object p0){
       this.a.onNext(new f(this.b, p0));
    }
}
