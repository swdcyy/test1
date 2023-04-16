package cd7.c;
import io.reactivex.g;
import java.lang.String;
import java.lang.Object;
import brd.v;
import com.yxcorp.download.DownloadTask$DownloadRequest;
import java.lang.StringBuilder;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import com.yxcorp.download.DownloadTask$DownloadBizExtra;
import com.yxcorp.download.DownloadManager;
import com.yxcorp.download.b;
import cd7.f;

public final class c implements g	// class@000533
{
    public final String b;
    public final String c;
    public final String d;

    public void c(String p0,String p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void subscribe(v p0){
       DownloadTask$DownloadRequest uDownloadReq = new DownloadTask$DownloadRequest(this.b);
       uDownloadReq.setDestinationDir(this.c);
       uDownloadReq.setDestinationFileName(this.d+".zip");
       uDownloadReq.setDownloadTaskType(DownloadTask$DownloadTaskType.ENQUEUE);
       uDownloadReq.setNeedCDNReport(true);
       uDownloadReq.setBizInfo(":ks-features:ft-social:nearby", "nearby_local_pendant_zip", null);
       uDownloadReq.setAllowedNetworkTypes(3);
       b[] uobArray = new b[true];
       uobArray[0] = new f(p0);
       DownloadManager.n().E(uDownloadReq, uobArray);
    }
}
