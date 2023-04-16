package eh9.s;
import erd.g;
import com.yxcorp.gifshow.camera.record.tab.d;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import com.yxcorp.retrofit.model.KwaiException;
import j8c.a;
import java.lang.String;
import w46.b;
import com.yxcorp.gifshow.camera.record.tab.CameraTab;
import eh9.n;
import eh9.a;
import com.yxcorp.gifshow.util.PostUtils;

public final class s implements g	// class@00215a
{
    public final d b;

    public void s(d p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       s tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 instanceof KwaiException) {
          a.D().e("LiveTabTagManager", "refreshLiveStatusConfig, error:", p0);
          p0 = p0.mErrorCode;
          if (p0 == 63 || p0 == 64) {
             tb.c.k(CameraTab.CAMERA_TAB_LIVE, false);
          }
       }else {
          PostUtils.D("LiveTabTagManager", "Ë¢ÐÂÖ±²¥×´Ì¬´íÎó", p0);
       }
       return;
    }
}
