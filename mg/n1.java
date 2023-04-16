package mg.n1;
import erd.g;
import z55.b;
import com.kwai.feature.post.api.feature.bridge.JSSelectFileAndUploadOptions;
import java.lang.Object;
import ry6.e;
import og.l;
import java.lang.String;
import q87.c;
import java.lang.StringBuilder;
import com.kwai.feature.post.api.feature.bridge.JSSelectFileAndUploadOptions$ProgressInfo;
import java.util.Objects;
import com.feature.post.bridge.q;

public final class n1 implements g	// class@00263d
{
    public final b b;
    public final JSSelectFileAndUploadOptions c;

    public void n1(b p0,JSSelectFileAndUploadOptions p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       Object[] objArray1;
       String progressEven;
       n1 tb = this.b;
       n1 tc = this.c;
       int i = 0;
       Object[] objArray = new Object[i];
       l.D().w("JsSelectVideoUpdateFunction", "subscribe result :", objArray);
       if (!p0.b()) {
          objArray1 = new Object[i];
          l.D().w("JsSelectVideoUpdateFunction", "subscribe result : percent"+p0.a(), objArray1);
          progressEven = tc.getProgressEventName();
          Objects.requireNonNull(progressEven);
          q.b(tb, progressEven, new JSSelectFileAndUploadOptions$ProgressInfo(p0.a()).toString());
       }else {
          objArray1 = new Object[i];
          l.D().w("JsSelectVideoUpdateFunction", "subscribe result : success", objArray1);
          progressEven = tc.getSuccessEventName();
          Objects.requireNonNull(progressEven);
          q.b(tb, progressEven, new JSSelectFileAndUploadOptions$ProgressInfo(p0.a()).toString());
       }
       return;
    }
}
