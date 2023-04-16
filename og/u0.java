package og.u0;
import erd.g;
import android.app.Activity;
import com.feature.post.bridge.jsmodel.JSPreviewVideoParams;
import java.lang.Object;
import om6.o;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import og.l;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import og.b1;
import og.a1;
import android.os.Bundle;

public final class u0 implements g	// class@0027c4
{
    public final Activity b;
    public final JSPreviewVideoParams c;

    public void u0(Activity p0,JSPreviewVideoParams p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       Object[] objArray1;
       u0 tb = this.b;
       u0 tc = this.c;
       JSPreviewVideoParams mFilePath = tc.mFilePath;
       int i = 0;
       if (TextUtils.x(mFilePath) && !TextUtils.x(tc.mVideoUrl)) {
          mFilePath = tc.mVideoUrl;
          Object[] objArray = new Object[i];
          l.D().w("ShopVideoHelper", "use url "+mFilePath, objArray);
          if (TextUtils.x(tc.mCoverImgUrl)) {
             objArray1 = new Object[i];
             l.D().w("ShopVideoHelper", "preview with empty coverUrl", objArray1);
          }
       }else {
          objArray1 = new Object[i];
          l.D().w("ShopVideoHelper", "use path "+mFilePath, objArray1);
       }
       if (TextUtils.x(mFilePath)) {
          a1.a("preview with empty url and path", null);
       }else {
          Bundle uBundle = new Bundle();
          uBundle.putString("video_file_path", mFilePath);
          uBundle.putString("video_cover_file_path", tc.mCoverImgUrl);
          uBundle.putInt("camera_page_source", 3);
          p0.zd(tb, uBundle);
       }
       return;
    }
}
