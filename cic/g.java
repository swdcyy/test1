package cic.g;
import io.reactivex.g;
import cic.h$a;
import com.yxcorp.gifshow.video.d;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.video.d$a;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import kp.r1;
import com.yxcorp.gifshow.video.api.watermark.BitmapAlignType;
import android.graphics.Bitmap;
import brd.g;
import java.lang.Throwable;

public final class g implements g	// class@0005ab
{
    public final h$a b;
    public final d c;

    public void g(h$a p0,d p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       g tb = this.b;
       Bitmap uBitmap = this.c.WV().b(tb.b, this.c.LZ(r1.T1(tb.c)), this.b.d, true, BitmapAlignType.LEFT);
       if (uBitmap != null) {
          p0.onNext(uBitmap);
       }else {
          p0.onError(new Throwable("processImage image failed "));
       }
       return;
    }
}
