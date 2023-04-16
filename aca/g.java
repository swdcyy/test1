package aca.g;
import erd.o;
import java.lang.Object;
import com.yxcorp.gifshow.models.QMedia;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.util.BitmapUtil;
import android.media.ThumbnailUtils;
import android.graphics.Bitmap$Config;
import brd.t;

public final class g implements o	// class@000093
{
    public final int b;

    public void g(int p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, g.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          Bitmap uBitmap = BitmapUtil.A(p0.path, this.b, this.b);
          if (uBitmap == null && p0.isVideo()) {
             uBitmap = ThumbnailUtils.createVideoThumbnail(p0.path, 1);
          }
          if (uBitmap == null) {
             uBitmap = Bitmap.createBitmap(1, 1, Bitmap$Config.RGB_565);
          }
          ot = t.just(uBitmap);
       }
       return ot;
    }
}
