package cxb.n;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.String;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import ywb.e;
import java.lang.StringBuilder;
import q87.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.entity.QPhoto;
import lnc.qa;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a;
import lnc.t;
import java.lang.Boolean;
import brd.w;
import cxb.g;
import erd.o;
import com.yxcorp.gifshow.photo.download.utils.DownloadError;
import java.lang.Throwable;
import ywb.f;
import cxb.d;
import io.reactivex.g;
import cxb.e;
import erd.a;
import cxb.f;
import erd.g;
import t45.d;
import brd.z;
import java.lang.IllegalArgumentException;

public final class n	// class@002099
{

    public void n(){
       super();
    }
    public static t a(BaseFeed p0,String p1){
       t ot;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       n on = n.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, on, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       float f = 2.50f;
       if (PatchProxy.isSupport(on)) {
          ot = PatchProxy.applyThreeRefs(p0, p1, Float.valueOf(f), null, n.class, "2");
          if (ot != patchProxyRe) {
          }else {
          label_002d :
             int i = 0;
             Object[] objArray = new Object[i];
             e.C().w("RxPhotoDownloader", "downloadFeed: "+p0.getId()+" save to="+p1, objArray);
             if (!TextUtils.x(p1)) {
                QPhoto qPhoto = new QPhoto(p0);
                if (qPhoto.isImageType()) {
                   Object[] objArray1 = new Object[i];
                   e.C().w("RxPhotoDownloader", "downloadFeed: isLongPhotos || isAtlasPhotos isImage="+qPhoto.isImageType(), objArray1);
                   ot = qa.e.h(LoadPolicy.SILENT_IMMEDIATE).d(t.just(Boolean.TRUE)).flatMap(new g(qPhoto, p1, f));
                }else if(!qPhoto.isVideoType()){
                   Object[] objArray2 = new Object[i];
                   e.C().w("RxPhotoDownloader", "downloadFeed: dont support type "+qPhoto.getType(), objArray2);
                   ot = t.error(new DownloadError(2));
                }else {
                   f uof = new f();
                   String[] stringArray = new String[1];
                   ot = t.create(new d(qPhoto, uof, stringArray)).doOnDispose(new e(uof, qPhoto)).doOnNext(new f(stringArray, p1, qPhoto)).observeOn(d.a);
                }
             }else {
                throw new IllegalArgumentException("wrong arg saveTo="+p1);
             }
          }
       }else {
          goto label_002d ;
       }
       return ot;
    }
}
