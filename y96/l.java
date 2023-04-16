package y96.l;
import com.google.protobuf.nano.MessageNano;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.utility.TextUtils;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class l	// class@00285f
{
    public final String a;
    public final MessageNano b;

    public void l(MessageNano p0,String p1){
       super();
       this.b = p0;
       this.a = TextUtils.k(p1);
    }
    public static l a(MessageNano p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, l.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new l(p0, p1);
    }
}
