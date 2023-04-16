package og.b0;
import erd.o;
import com.feature.post.bridge.jsmodel.JsCameraCallbackParams$Param;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.magic.exception.UnSupportedMagicException;
import java.lang.String;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import brd.t;

public final class b0 implements o	// class@002795
{
    public final JsCameraCallbackParams$Param b;

    public void b0(JsCameraCallbackParams$Param p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       b0 tb = this.b;
       if (p0 instanceof UnSupportedMagicException) {
          if ((p0.getMessage()).equals("UnSupportedMagicException magic face has been removed")) {
             p0 = new MagicEmoji$MagicFace(tb.mMagicFaceId);
             p0.mIsOffline = true;
             p0.mName = tb.mMagicName;
             p0 = t.just(p0);
          }else {
             p0 = t.error(p0);
          }
       }else {
          p0 = t.error(p0);
       }
       return p0;
    }
}
