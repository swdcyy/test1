package og.a$a;
import erd.a;
import f55.g;
import com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasResultBase;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasCompleteResult;
import qrd.l1;

public final class a$a implements a	// class@002788
{
    public final g b;
    public final JsSelectMixMediasResultBase c;
    public final AtomicReference d;

    public void a$a(g p0,JsSelectMixMediasResultBase p1,AtomicReference p2){
       a.p(p0, "callback");
       a.p(p1, "params");
       a.p(p2, "uploadResultFileUri");
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public void run(){
       JsSelectMixMediasCompleteResult jsSelectMixM = new JsSelectMixMediasCompleteResult();
       jsSelectMixM.copyFrom(this.c);
       jsSelectMixM.mUri = this.d.get();
       this.b.onSuccess(jsSelectMixM);
    }
}
