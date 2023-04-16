package mg.q0;
import erd.g;
import java.lang.String;
import r26.a;
import f55.g;
import java.lang.Object;
import com.kwai.feature.post.api.feature.bridge.JsVideoUploadStatusResult$StatusResultData;
import java.text.DecimalFormat;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo;
import com.kwai.feature.post.api.feature.bridge.JsVideoUploadStatusResult;

public final class q0 implements g	// class@00264e
{
    public final String b;
    public final a c;
    public final String d;
    public final String e;
    public final g f;

    public void q0(String p0,a p1,String p2,String p3,g p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void accept(Object p0){
       q0 tc = this.c;
       q0 tf = this.f;
       JsVideoUploadStatusResult$StatusResultData statusResult = new JsVideoUploadStatusResult$StatusResultData(this.b, p0, new DecimalFormat("0.00").format((double)(tc.getUiProgress() * 100.00f)), 0, 0, this.d, this.e);
       if (tc.getUploadInfo() != null) {
          p0.mRemainingTime = tc.getUploadInfo().getUploadRemainingTime();
       }
       tf.onSuccess(new JsVideoUploadStatusResult(p0, 1));
       return;
    }
}
