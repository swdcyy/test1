package og.g;
import erd.o;
import java.util.concurrent.atomic.AtomicReference;
import com.kwai.feature.post.api.feature.bridge.JsRetryInjectUploadParams;
import java.lang.Object;
import b26.b$a;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.io.File;
import og.a;
import com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasResultBase;
import com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasProgressResult;

public final class g implements o	// class@0027a6
{
    public final AtomicReference b;
    public final JsRetryInjectUploadParams c;

    public void g(AtomicReference p0,JsRetryInjectUploadParams p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       a.p(p0, "compressResult");
       this.b.set(p0.a().getAbsolutePath());
       return a.d.f(this.c, p0);
    }
}
