package og.f;
import erd.o;
import b26.b;
import android.app.Activity;
import com.kwai.feature.post.api.feature.bridge.JsRetryInjectUploadParams;
import java.lang.Object;
import com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasStartResult$Data;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasResultBase;
import og.a;
import com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasParams$ImageCompressConfig;
import com.yxcorp.gifshow.media.model.MessageEncodeConfig;
import brd.t;

public final class f implements o	// class@0027a4
{
    public final b b;
    public final Activity c;
    public final JsRetryInjectUploadParams d;

    public void f(b p0,Activity p1,JsRetryInjectUploadParams p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object apply(Object p0){
       a.p(p0, "it");
       p0 = this.b;
       f tc = this.c;
       JsSelectMixMediasResultBase mFilePath = this.d.mFilePath;
       a.o(mFilePath, "params.mFilePath");
       JsRetryInjectUploadParams mImageCompre = this.d.mImageCompressConfig;
       if (mImageCompre != null) {
       }else {
          mImageCompre = a.a(a.d);
       }
       a.o(mImageCompre, "params.mImageCompressCon¡­efaultImageCompressConfig");
       return p0.Q7(tc, mFilePath, mImageCompre, a.d.e(this.d.mEncodeConfig));
    }
}
