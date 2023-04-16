package mc9.e;
import io.reactivex.g;
import com.yxcorp.gifshow.camera.record.autoapply.sample.c;
import java.lang.String;
import java.io.File;
import java.lang.Object;
import brd.v;
import java.util.Objects;
import com.yxcorp.download.DownloadTask$DownloadRequest;
import java.util.List;
import ekd.q;
import com.yxcorp.download.DownloadTask$DownloadBizExtra;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import com.yxcorp.download.DownloadManager;
import com.yxcorp.download.b;
import mc9.m;
import java.lang.Integer;

public final class e implements g	// class@002e44
{
    public final c b;
    public final String[] c;
    public final File d;

    public void e(c p0,String[] p1,File p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void subscribe(v p0){
       e tb = this.b;
       e td = this.d;
       Objects.requireNonNull(tb);
       b[] uobArray = new b[true];
       uobArray[0] = new m(tb, p0);
       tb.g.add(Integer.valueOf(DownloadManager.n().E(new DownloadTask$DownloadRequest(q.a(this.c)).setDestinationDir(td.getParent()).setAllowedNetworkTypes(3).setDestinationFileName(td.getName()).setBizInfo(":ks-features:ft-post:internal-shared-impls", tb.t(), null).setNeedCDNReport(true).setDownloadTaskType(DownloadTask$DownloadTaskType.IMMEDIATE).setPriority(3000), uobArray)));
    }
}
