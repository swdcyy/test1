package og.c$b;
import erd.o;
import og.c;
import com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasResultBase;
import java.lang.Object;
import com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasStartResult$Data;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasParams;
import og.a;
import com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasParams$ImageCompressConfig;
import com.yxcorp.gifshow.media.model.MessageEncodeConfig;
import android.app.Activity;
import brd.t;
import b26.b;

public final class c$b implements o	// class@002799
{
    public final c b;
    public final JsSelectMixMediasResultBase c;

    public void c$b(c p0,JsSelectMixMediasResultBase p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       a.p(p0, "it");
       p0 = this.b;
       c c = p0.c;
       p0 = p0.d;
       JsSelectMixMediasResultBase mFilePath = this.c.mFilePath;
       a.o(mFilePath, "task.mFilePath");
       JsSelectMixMediasParams mImageCompre = this.b.e.mImageCompressConfig;
       if (mImageCompre != null) {
       }else {
          mImageCompre = a.a(a.d);
       }
       a.o(mImageCompre, "params.mImageCompressCon¡­efaultImageCompressConfig");
       return c.Q7(p0, mFilePath, mImageCompre, a.d.e(this.b.e.mEncodeConfig));
    }
}
