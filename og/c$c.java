package og.c$c;
import erd.o;
import og.c;
import java.util.concurrent.atomic.AtomicReference;
import com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasResultBase;
import java.lang.Object;
import b26.b$a;
import java.lang.String;
import kotlin.jvm.internal.a;
import og.a;
import java.io.File;
import com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasParams;
import com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasParams$AlbumLimitParams;
import java.util.Objects;
import com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasProgressResult;
import com.kwai.imsdk.internal.data.FailureException;
import android.content.res.Resources;
import lnc.a1;

public final class c$c implements o	// class@00279a
{
    public final c b;
    public final AtomicReference c;
    public final JsSelectMixMediasResultBase d;

    public void c$c(c p0,AtomicReference p1,JsSelectMixMediasResultBase p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object apply(Object p0){
       a.p(p0, "compressResult");
       a d = a.d;
       File absoluteFile = p0.a().getAbsoluteFile();
       JsSelectMixMediasParams$AlbumLimitParams mUploadMaxSi = this.b.e.mAlbumLimitParams.mUploadMaxSize;
       Objects.requireNonNull(d);
       int i = 0;
       if (!mUploadMaxSi) {
       }else if(absoluteFile != null && absoluteFile.length() - mUploadMaxSi > 0){
          i = 1;
       }
       if (!i) {
          this.c.set(p0.a().getAbsolutePath());
          return d.f(this.d, p0);
       }else {
          throw new FailureException(7, a1.m().getString(0x7f101601));
       }
    }
}
