package cxb.f;
import erd.g;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.Integer;
import ywb.e;
import java.lang.StringBuilder;
import q87.c;
import java.io.File;
import qkd.b;
import com.yxcorp.gifshow.photo.download.utils.DownloadError;

public final class f implements g	// class@002091
{
    public final String[] b;
    public final String c;
    public final QPhoto d;

    public void f(String[] p0,String p1,QPhoto p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       f tb = this.b;
       f tc = this.c;
       f td = this.d;
       if (p0.intValue() == 100) {
          Object[] objArray = new Object[0];
          e.C().w("RxPhotoDownloader", "downloadFeed: mv exportPath="+tb[0]+" to="+tc+", id="+td.getPhotoId(), objArray);
          boolean b = new File(tb[0]).exists();
          if (!b.k0(new File(tb[0]), new File(tc))) {
             Object[] objArray1 = new Object[0];
             e.C().t("RxPhotoDownloader", "downloadFeed: cant rename, srcFileExists="+b+", id="+td.getPhotoId(), objArray1);
             throw new DownloadError(-1);
          }
       }
       return;
    }
}
