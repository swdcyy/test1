package og.d;
import erd.o;
import b26.b;
import android.app.Activity;
import com.kwai.feature.post.api.feature.bridge.JsRetryInjectUploadParams;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasResultBase;
import og.a;
import com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasParams$ImageCompressConfig;
import java.lang.Integer;
import brd.t;

public final class d implements o	// class@0027a0
{
    public final b b;
    public final Activity c;
    public final JsRetryInjectUploadParams d;

    public void d(b p0,Activity p1,JsRetryInjectUploadParams p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object apply(Object p0){
       a.p(p0, "it");
       p0 = this.b;
       d tc = this.c;
       JsSelectMixMediasResultBase mFilePath = this.d.mFilePath;
       a.o(mFilePath, "params.mFilePath");
       JsRetryInjectUploadParams mThumbnailCo = this.d.mThumbnailCompressConfig;
       if (mThumbnailCo != null) {
       }else {
          mThumbnailCo = a.b(a.d);
       }
       a.o(mThumbnailCo, "params.mThumbnailCompres¡­ltThumbnailCompressConfig");
       return p0.Qp(tc, mFilePath, mThumbnailCo, Integer.valueOf(this.d.mFileType));
    }
}
