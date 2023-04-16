package mc9.m;
import com.yxcorp.download.k;
import com.yxcorp.gifshow.camera.record.autoapply.sample.c;
import brd.v;
import com.yxcorp.download.DownloadTask;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gq.a;
import q87.c;
import ic9.a;
import java.lang.Float;
import brd.g;
import java.lang.StringBuilder;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Throwable;
import java.lang.Math;

public class m extends k	// class@002e4c
{
    public final v c;
    public final c d;

    public void m(c p0,v p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void b(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "6")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("SampleProcessor", "download canceled", objArray);
       this.c.onNext(Float.valueOf(a.i));
       this.c.onComplete();
       return;
    }
    public void c(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("SampleProcessor", "download completed  , task:"+p0.getId(), objArray);
       this.c.onNext(Float.valueOf(a.i));
       this.c.onComplete();
       return;
    }
    public void d(DownloadTask p0,String p1,boolean p2,long p3,long p4){
       m om = m.class;
       if (PatchProxy.isSupport(om)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),Long.valueOf(p3),Long.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, om, "3")) {
             return;
          }
       }
       Object[] objArray1 = new Object[0];
       a.D().s("SampleProcessor", "download connected etag:"+p1+" , isContinue:"+p2+" , soFarBytes:"+p3+" , totalBytes:"+p4+" , task:"+p0.getId(), objArray1);
       return;
    }
    public void e(DownloadTask p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, m.class, "5")) {
          return;
       }
       a.D().v("SampleProcessor", "download error  , task:"+p0.getId(), p1);
       this.c.onNext(Float.valueOf(a.i));
       this.c.onComplete();
       return;
    }
    public void j(DownloadTask p0,long p1,long p2){
       if (PatchProxy.isSupport(m.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, m.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("SampleProcessor", "download pending soFarBytes: "+p1+" , totalBytes:"+p2+" , task:"+p0.getId(), objArray);
       return;
    }
    public void k(DownloadTask p0,long p1,long p2){
       if (PatchProxy.isSupport(m.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, m.class, "2")) {
          return;
       }
       float f = Math.min(a.j, (float)((double)p1 / (double)p2));
       Object[] objArray = new Object[0];
       a.D().s("SampleProcessor", "download progress soFarBytes:"+p1+" , totalBytes:"+p2+" , progress:"+f+" , task:"+p0.getId(), objArray);
       this.c.onNext(Float.valueOf(f));
       return;
    }
}
