package bp6.m;
import erd.r;
import com.kwai.imsdk.msg.KwaiMsg;
import java.lang.Object;
import iq6.j;

public final class m implements r	// class@00053b
{
    public final KwaiMsg b;

    public void m(KwaiMsg p0){
       this.b = p0;
    }
    public final boolean test(Object p0){
       m tb = this.b;
       boolean b = (p0 != null && (p0.b() != null && !p0.b().getClientSeq() - tb.getClientSeq()))? true: false;
       return b;
    }
}
