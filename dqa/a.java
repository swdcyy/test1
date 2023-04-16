package dqa.a;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.io.File;
import com.yxcorp.download.DownloadTask$DownloadRequest;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import com.yxcorp.download.DownloadTask$DownloadBizExtra;
import com.yxcorp.download.DownloadManager;
import com.yxcorp.download.b;
import dqa.a$a;

public final class a implements Runnable	// class@0024e9
{
    public final String b;
    public final String c;
    public final String d;
    public final long e;

    public void a(String p0,String p1,String p2,long p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "1")) {
          return;
       }
       File uFile = new File(this.b);
       DownloadTask$DownloadRequest uDownloadReq = new DownloadTask$DownloadRequest(this.c);
       uDownloadReq.setDownloadTaskType(DownloadTask$DownloadTaskType.IMMEDIATE);
       uDownloadReq.setDestinationDir(uFile.getParent());
       uDownloadReq.setDestinationFileName(uFile.getName());
       uDownloadReq.setBizInfo(":ks-features:ft-growth:pendant-core", this.d, objArray);
       uDownloadReq.setAllowedNetworkTypes(3);
       uDownloadReq.setRetryTimes(3);
       uDownloadReq.setNeedCDNReport(true);
       b[] uobArray = new b[true];
       uobArray[0] = new a$a(this);
       DownloadManager.n().E(uDownloadReq, uobArray);
       return;
    }
}
