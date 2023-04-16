package aec.e;
import erd.o;
import com.kwai.feature.api.social.reminder.push.OpenServiceBarResponse;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.Pair;
import kotlin.jvm.internal.a;

public final class e implements o	// class@0000ff
{
    public final OpenServiceBarResponse b;

    public void e(OpenServiceBarResponse p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       Pair pair = PatchProxy.applyOneRefs(p0, this, e.class, "1");
       if (pair != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          pair = new Pair(this.b, p0);
       }
       return pair;
    }
}
