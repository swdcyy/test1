package ao6.c;
import java.lang.Runnable;
import java.lang.String;
import java.util.List;
import com.yxcorp.download.k;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.io.File;
import com.yxcorp.download.DownloadTask$DownloadRequest;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import com.yxcorp.download.DownloadTask$DownloadBizExtra;
import com.yxcorp.download.DownloadManager;
import com.yxcorp.download.b;

public final class c implements Runnable	// class@000311
{
    public final String b;
    public final List c;
    public final k d;

    public void c(String p0,List p1,k p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "1")) {
          return;
       }
       File uFile = new File(this.b);
       File parentFile = uFile.getParentFile();
       if (parentFile != null) {
          parentFile.mkdirs();
       }
       DownloadTask$DownloadRequest uDownloadReq = new DownloadTask$DownloadRequest(this.c);
       uDownloadReq.setDownloadTaskType(DownloadTask$DownloadTaskType.IMMEDIATE);
       uDownloadReq.setDestinationDir(uFile.getParent());
       uDownloadReq.setDestinationFileName(uFile.getName());
       uDownloadReq.setBizInfo(":ks-features:ft-growth:ulk-core", "Growth_Simulation", objArray);
       uDownloadReq.setAllowedNetworkTypes(3);
       uDownloadReq.setRetryTimes(3);
       b[] uobArray = new b[]{this.d};
       DownloadManager.n().E(uDownloadReq, uobArray);
       return;
    }
}
