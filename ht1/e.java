package ht1.e;
import w4.c;
import ht1.d$c;
import java.lang.Object;
import w4.i;
import android.graphics.Bitmap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.util.BitmapUtil;

public final class e implements c	// class@002779
{
    public final d$c a;

    public void e(d$c p0){
       this.a = p0;
       super();
    }
    public final Bitmap a(i p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "asset");
       return BitmapUtil.t(this.a.c+p0.c(), p0.e(), p0.d(), false);
    }
}
