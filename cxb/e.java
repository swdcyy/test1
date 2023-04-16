package cxb.e;
import erd.a;
import ywb.f;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import ywb.e;
import java.lang.String;
import q87.c;

public final class e implements a	// class@002090
{
    public final f b;
    public final QPhoto c;

    public void e(f p0,QPhoto p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       Object[] objArray = new Object[0];
       e.C().w("RxPhotoDownloader", "downloadFeed: doOnDispose", objArray);
       this.b.b(this.c.getPhotoId());
    }
}
