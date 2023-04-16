package cxb.d;
import io.reactivex.g;
import com.yxcorp.gifshow.entity.QPhoto;
import ywb.f;
import java.lang.String;
import java.lang.Object;
import brd.v;
import com.yxcorp.gifshow.model.CDNUrl;
import ywb.e;
import java.lang.StringBuilder;
import q87.c;
import cxb.m;
import exb.e;
import com.yxcorp.gifshow.photo.download.utils.DownloadError;
import java.lang.Throwable;
import brd.g;

public final class d implements g	// class@00208f
{
    public final QPhoto b;
    public final f c;
    public final String[] d;

    public void d(QPhoto p0,f p1,String[] p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void subscribe(v p0){
       Object[] objArray;
       d tb = this.b;
       d tc = this.c;
       d td = this.d;
       CDNUrl[] videoUrls = tb.getVideoUrls();
       String str = "RxPhotoDownloader";
       int i = 0;
       if (videoUrls == null || !videoUrls.length) {
          objArray = new Object[i];
          e.C().t(str, "downloadFeed: photo.getVideoUrls\(\) is empty ", objArray);
          p0.onError(new DownloadError(14));
       }else {
          objArray = new Object[i];
          e.C().w(str, "downloadFeed: photo.getVideoUrls first="+videoUrls[i].mUrl+", id="+tb.getPhotoId(), objArray);
          m om = new m(tb, p0, td, tc, videoUrls);
          tc.c(tb, v8);
       }
       return;
    }
}
