package og.h;
import erd.o;
import og.a$e;
import java.lang.Object;
import ry6.e;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasProgressResult;
import com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasResultBase;

public final class h implements o	// class@0027a8
{
    public final a$e b;

    public void h(a$e p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       a.p(p0, "rxRickonUploadTask");
       JsSelectMixMediasProgressResult jsSelectMixM = new JsSelectMixMediasProgressResult();
       jsSelectMixM.copyFrom(this.b.d);
       jsSelectMixM.mProgress = (((float)p0.a() * 0x3f000000) / (float)100) + 0x3f000000;
       return jsSelectMixM;
    }
}
