package og.b$e;
import erd.o;
import com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasResultBase;
import java.lang.Object;
import com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasStartResult$Data;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasProgressResult;

public final class b$e implements o	// class@002794
{
    public final JsSelectMixMediasResultBase b;

    public void b$e(JsSelectMixMediasResultBase p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       a.p(p0, "it");
       p0 = new JsSelectMixMediasProgressResult();
       p0.copyFrom(this.b);
       p0.mProgress = 0x3f000000;
       return p0;
    }
}
