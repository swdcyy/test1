package bp6.p1;
import erd.a;
import com.kwai.imsdk.internal.v;
import java.lang.Object;
import java.lang.String;
import nq6.s;
import java.util.Map;

public final class p1 implements a	// class@000543
{
    public final v b;
    public final long c;

    public void p1(v p0,long p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       s os = s.t(this.b.a);
       Map map = os.x("IMSDK.Conversation.Stick");
       os.b(map, this.c);
       os.D(map);
    }
}
