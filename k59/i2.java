package k59.i2;
import k59.d2;
import java.lang.Object;
import android.app.Activity;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.webkit.DownloadListener;
import com.yxcorp.gifshow.photoad.download.k;
import com.kuaishou.webkit.WebView;
import l59.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import l59.a;

public class i2 implements d2	// class@002ae7
{

    public void i2(){
       super();
    }
    public DownloadListener a(Activity p0,BaseFeed p1){
       return new k(p0, p1);
    }
    public DownloadListener b(Activity p0,BaseFeed p1,WebView p2,b p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, i2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(new k(p0, p1), p2, p3);
    }
}
