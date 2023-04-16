package cxb.m;
import exb.e;
import com.yxcorp.gifshow.entity.QPhoto;
import brd.v;
import java.lang.String;
import ywb.f;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ywb.e;
import java.lang.StringBuilder;
import q87.c;
import java.io.File;
import java.lang.Integer;
import brd.g;
import java.lang.Long;
import java.lang.Float;
import java.lang.Throwable;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$CdnResourceLoadStatEvent;
import exb.d;

public class m implements e	// class@002098
{
    public boolean a;
    public final QPhoto b;
    public final v c;
    public final String[] d;
    public final f e;
    public final CDNUrl[] f;

    public void m(QPhoto p0,v p1,String[] p2,f p3,CDNUrl[] p4){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
       this.a = false;
    }
    public void b(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, m.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       e.C().w("RxPhotoDownloader", "onSuccess: exportPath="+p0+" downloadUrl="+p1+", id="+this.b.getPhotoId(), objArray);
       p1[0] = p0;
       if (new File(p0).exists()) {
          this.c.onNext(Integer.valueOf(100));
          this.c.onComplete();
       }else if(this.a == null){
          Object[] objArray1 = new Object[0];
          e.C().w("RxPhotoDownloader", "onSuccess retry downloadVideoFromInternet, id="+this.b.getPhotoId(), objArray1);
          this.e.d(this.b, this.f, this);
          this.a = true;
       }
       return;
    }
    public void c(long p0,float p1){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Float.valueOf(p1), this, om, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       e.C().y("RxPhotoDownloader", "onProgress: totalBytes="+p0+" ratio="+p1+", id="+this.b.getPhotoId(), objArray);
       this.c.onNext(Integer.valueOf((int)(p1 * 99.00f)));
       return;
    }
    public void d(Throwable p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, m.class, "3")) {
          return;
       }
       p2 = "RxPhotoDownloader";
       e.C().e(p2, "onError: fallbackUrl="+p1+" downloadUrl="+p2+", id="+this.b.getPhotoId(), p0);
       if (this.a != null) {
          this.c.onError(p0);
       }else {
          Object[] objArray = new Object[0];
          e.C().w(p2, "onError retry downloadVideoFromInternet, id="+this.b.getPhotoId(), objArray);
          this.e.d(this.b, this.f, this);
          this.a = true;
       }
       return;
    }
    public void e(ClientStat$CdnResourceLoadStatEvent p0){
       d.b(this, p0);
    }
    public boolean f(){
       return d.a(this);
    }
    public void onCancel(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       e.C().w("RxPhotoDownloader", "onCancel: downloadUrl="+p0+", id="+this.b.getPhotoId(), objArray);
       return;
    }
    public void onStart(String p0){
       d.c(this, p0);
    }
}
