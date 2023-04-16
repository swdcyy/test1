package gaa.f0;
import erd.o;
import gaa.h0;
import voc.i;
import java.lang.Object;
import java.lang.Integer;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.List;
import kp.r1;
import java.lang.String;
import wkd.b;
import com.kwai.framework.cache.CacheManager;
import java.lang.reflect.Type;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.io.File;
import exb.b;
import cq.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.photo.download.model.StatModel;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.gifshow.photo.download.task.s;
import ixb.y;

public final class f0 implements o	// class@00242e
{
    public final h0 b;
    public final i c;
    public final int d;

    public void f0(h0 p0,i p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object apply(Object p0){
       h0 b;
       f0 tb = this.b;
       f0 tc = this.c;
       f0 td = this.d;
       List list = r1.m0(tb.b.getEntity(), p0.intValue());
       String str = h0.d(tb.b, p0.intValue());
       String str1 = b.a(0x5f2ddeb4).g(str, String.class);
       if (TextUtils.x(str1) || !new File(str1).exists()) {
          str1 = h0.c();
       }
       File uFile = new File(str1);
       b uob = tb.b(str, uFile, tc, td);
       if (uFile.exists()) {
          Object[] objArray = new Object[0];
          a.D().w("EditSourcePictureDownloadDispatcher", "downloadAtlas: filePath = "+uFile.getAbsolutePath()+", already existed", objArray);
          uob.onSuccess();
       }else {
          StatModel statModel = new StatModel("downloadSinglePicFromDialog");
          statModel.mDownloadIndex = p0.toString();
          statModel.mLocalFile = uFile;
          b = tb.b;
          s.h(b, false, s.m(b, list), uFile, statModel, uob, tb.w);
       }
       return p0;
    }
}
