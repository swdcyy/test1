package bp6.s1;
import erd.g;
import com.kwai.imsdk.internal.v;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import nq6.s;
import java.util.Map;
import android.util.Pair;
import java.lang.Integer;

public final class s1 implements g	// class@00054c
{
    public final v b;

    public void s1(v p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       s os = s.t(this.b.a);
       Map map = os.x("IMSDK.Conversation.Stick");
       p0 = os.z(p0);
       os.c(map, p0.first.intValue(), p0.second);
       os.A(map);
    }
}
