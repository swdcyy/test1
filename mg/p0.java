package mg.p0;
import erd.g;
import java.lang.String;
import f55.g;
import java.lang.Object;
import com.kwai.feature.post.api.feature.bridge.JsVideoUploadStatusResult$StatusResultData;
import com.kwai.feature.post.api.feature.bridge.JsVideoUploadStatusResult;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;

public final class p0 implements g	// class@002648
{
    public final String b;
    public final g c;

    public void p0(String p0,g p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       JsVideoUploadStatusResult$StatusResultData statusResult = new JsVideoUploadStatusResult$StatusResultData(this.b, p0, "", 1, 0, "", "");
       JsVideoUploadStatusResult jsVideoUploa = new JsVideoUploadStatusResult(p0, -1);
       p0 = new Bundle();
       SerializableHook.putSerializable(p0, "bundle_result", jsVideoUploa);
       this.c.a(-1, "", p0);
    }
}
