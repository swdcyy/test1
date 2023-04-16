package l69.x;
import java.lang.Runnable;
import java.lang.String;
import com.yxcorp.gifshow.aicut.api.AICutStyle;
import i69.j;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import l69.w;
import java.util.Objects;
import kotlin.jvm.internal.a;
import h69.g;
import java.lang.StringBuilder;
import q87.c;
import java.io.File;
import o69.m1;
import java.util.HashMap;
import java.lang.Integer;
import com.yxcorp.download.DownloadTask$DownloadRequest;
import com.yxcorp.download.DownloadTask$DownloadBizExtra;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import com.kwai.robust.PatchProxyResult;
import l69.w$a;
import com.yxcorp.download.DownloadManager;
import com.yxcorp.download.b;
import java.util.Map;

public final class x implements Runnable	// class@002cb5
{
    public final String b;
    public final String c;
    public final AICutStyle d;
    public final int e;
    public final String[] f;
    public final j g;

    public void x(String p0,String p1,AICutStyle p2,int p3,String[] p4,j p5){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       super();
    }
    public final void run(){
       Object[] objArray1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, x.class, "1")) {
          return;
       }
       w e = w.e;
       x tb = this.b;
       x tc = this.c;
       x td = this.d;
       Objects.requireNonNull(e);
       int i = 0;
       if (!PatchProxy.applyVoidThreeRefs(tb, tc, td, e, w.class, "5")) {
          a.p(tb, "destFolder");
          a.p(tc, "destFileName");
          a.p(td, "info");
          Object[] objArray2 = new Object[i];
          g.D().w(w.a, "deleteFiles\(\) called with: destFolder = ["+tb+"], "+"destFileName = ["+tc+"], info = ["+td+']', objArray2);
          new File(tb+tc).delete();
          new File(m1.a.d(td)).delete();
       }
       if (this.e >= this.f.length) {
          w.c(e).remove(this.d.getId());
          return;
       }else {
          w.c(e).put(this.d.getId(), Integer.valueOf(this.e));
          DownloadTask$DownloadRequest uDownloadReq = new DownloadTask$DownloadRequest(this.f[this.e]).setDestinationDir(this.b).setAllowedNetworkTypes(3).setDestinationFileName(this.c);
          uDownloadReq.setBizInfo(":ks-features:ft-post:aicut", "post_base_resource", objArray);
          a.o(uDownloadReq, "downloadRequest");
          int b = true;
          uDownloadReq.setNeedCDNReport(b);
          uDownloadReq.setDownloadTaskType(DownloadTask$DownloadTaskType.IMMEDIATE);
          x td1 = this.d;
          x tg = this.g;
          Objects.requireNonNull(e);
          w$a uoa = PatchProxy.applyTwoRefs(td1, tg, e, w.class, "6");
          if (uoa != PatchProxyResult.class) {
          }else {
             uoa = w.b.get(td1.getId());
             if (uoa == null) {
                uoa = new w$a(td1, tg);
             }
          }
          if (uoa == null) {
             objArray1 = new Object[i];
             g.D().s(w.d(e), "addDownloadTask: use old listener "+uoa, objArray1);
             return;
          }else {
             b[] uobArray = new b[b];
             uobArray[i] = uoa;
             b = DownloadManager.n().E(uDownloadReq, uobArray);
             objArray1 = new Object[i];
             g.D().s(w.d(e), "addDownloadTask: downloadId="+b, objArray1);
             w.a(e).remove(this.d.getId());
             String id = this.d.getId();
             a.o(id, "info.id");
             w.a(e).put(id, Integer.valueOf(b));
             w.b(e).remove(this.d.getId());
             String id1 = this.d.getId();
             a.o(id1, "info.id");
             w.b(e).put(id1, uoa);
             return;
          }
       }
    }
}
