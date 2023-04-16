package og.a$b;
import erd.g;
import f55.g;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasProgressResult;

public final class a$b implements g	// class@002789
{
    public final g b;

    public void a$b(g p0){
       a.p(p0, "callback");
       super();
       this.b = p0;
    }
    public void accept(Object p0){
       a.p(p0, "progressResult");
       this.b.onSuccess(p0);
    }
}
