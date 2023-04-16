package mg.m1;
import erd.g;
import z55.b;
import com.kwai.feature.post.api.feature.bridge.JSSelectFileAndUploadOptions;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import java.lang.Exception;
import com.yxcorp.gifshow.util.PostUtils;
import com.kwai.feature.post.api.feature.bridge.JSSelectFileAndUploadOptions$ErrorInfo;
import com.kwai.feature.post.api.feature.bridge.JSSelectFileAndUploadOptions$b;
import com.kwai.feature.post.api.feature.bridge.JSSelectFileAndUploadOptions$b$a;
import java.util.Objects;
import com.feature.post.bridge.q;
import lnc.i3;

public final class m1 implements g	// class@002637
{
    public final b b;
    public final JSSelectFileAndUploadOptions c;

    public void m1(b p0,JSSelectFileAndUploadOptions p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       m1 tb = this.b;
       m1 tc = this.c;
       String str = "throwable is empty";
       String str1 = (p0 == null)? str: p0.toString();
       Exception uException = (p0 == null)? new Exception(str): p0;
       PostUtils.D("JsSelectVideoUpdateFunction", "uploadFileNoResume", uException);
       String failEventNam = tc.getFailEventName();
       Objects.requireNonNull(failEventNam);
       q.b(tb, failEventNam, new JSSelectFileAndUploadOptions$ErrorInfo(str1, JSSelectFileAndUploadOptions$b.p.b()).toString());
       i3 oi3 = i3.f();
       oi3.d("error", p0.getMessage());
       oi3.d("taskID", tc.getTaskID());
       PostUtils.x("JsSelectVideoUpdateFunction", oi3.e());
       return;
    }
}
