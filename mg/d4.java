package mg.d4;
import vxc.z;
import com.kuaishou.webkit.WebView;
import java.io.Serializable;
import com.kwai.feature.post.api.feature.bridge.JsUploadVideoFromAlbumParams;
import android.app.Activity;
import mg.j4$b;
import java.lang.String;
import f55.g;
import com.feature.post.bridge.j;

public class d4 extends z	// class@0025f0
{

    public void d4(WebView p0){
       super(p0);
    }
    public void i(Serializable p0){
       j.f(this.e(), p0, new j4$b(this, p0.mCallback, "uploadVideoFromAlbum"));
    }
}
