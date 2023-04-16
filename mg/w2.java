package mg.w2;
import java.lang.Runnable;
import com.kwai.feature.post.api.feature.bridge.JsQuerySavedOrPublishedPhotoParams;
import f55.g;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import q46.l;
import java.util.HashMap;
import java.lang.Boolean;

public final class w2 implements Runnable	// class@002674
{
    public final JsQuerySavedOrPublishedPhotoParams b;
    public final g c;

    public void w2(JsQuerySavedOrPublishedPhotoParams p0,g p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       w2 tb = this.b;
       w2 tc = this.c;
       a.p(tb, "param");
       HashMap hashMap = new HashMap();
       boolean b = (l.f(tb.mActivityId) > 0)? true: false;
       hashMap.put("result", Boolean.valueOf(b));
       if (tc != null) {
          tc.onSuccess(hashMap);
       }
       return;
    }
}
