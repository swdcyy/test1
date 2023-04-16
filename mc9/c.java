package mc9.c;
import io.reactivex.g;
import com.yxcorp.gifshow.camera.record.autoapply.sample.c;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.android.model.feed.VideoFeed;
import java.lang.Object;
import brd.v;
import gq.a;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import java.io.File;
import com.yxcorp.gifshow.util.PostUtils;
import lnc.a1;
import mc6.j;
import com.kwai.video.hodor.ExportMediaCacheTask;
import java.util.Map;
import com.kwai.video.hodor.AbstractHodorTask;
import com.yxcorp.gifshow.camera.record.autoapply.sample.b;
import com.kwai.video.hodor.ExportMediaCacheTask$ExportMediaCacheTaskCallback;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import brd.g;

public final class c implements g	// class@002e42
{
    public final c b;
    public final CDNUrl[] c;
    public final VideoFeed d;

    public void c(c p0,CDNUrl[] p1,VideoFeed p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void subscribe(v p0){
       c tb = this.b;
       c tc = this.c;
       c td = this.d;
       tb.d = null;
       c c = tb.c;
       if (tc == null || c >= tc.length) {
          p0.onError(new IllegalStateException("urls is empty!"));
       }else {
          Object[] objArray = new Object[0];
          a.D().w("SampleProcessor", "exportVideo index : "+c+" , urls size:"+tc.length+" , emitter£º"+p0.hashCode(), objArray);
          tb.c = tb.c + 1;
          File uFile = new File(PostUtils.g("[>|50|>]"), "source"+a1.k()+".mp4");
          String url = tc[c].getUrl();
          ExportMediaCacheTask uExportMedia = new ExportMediaCacheTask(url, null, j.d(url), uFile.getAbsolutePath());
          uExportMedia.setTaskQosClass(8);
          uExportMedia.setBizType(tb.t());
          uExportMedia.setBizFt(":ks-features:ft-post:internal-shared-impls");
          uExportMedia.setUnifyCdnLog(0);
          uExportMedia.setExportMediaCacheTaskCallback(new b(tb, p0, td, uFile));
          uExportMedia.submit();
          tb.f = uExportMedia;
       }
       return;
    }
}
