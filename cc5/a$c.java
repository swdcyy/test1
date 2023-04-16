package cc5.a$c;
import erd.o;
import java.lang.Object;
import com.kwai.component.kwailink.http.ImServiceTokenResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.util.Pair;
import kotlin.jvm.internal.a;

public final class a$c implements o	// class@000691
{
    public static final a$c b;

    static {
       a$c.b = new a$c();
    }
    public void a$c(){
       super();
    }
    public Object apply(Object p0){
       Pair pair = PatchProxy.applyOneRefs(p0, this, a$c.class, "1");
       if (pair != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          pair = new Pair(p0.mMessageLoginServiceToken, p0.mSecurity);
       }
       return pair;
    }
}
