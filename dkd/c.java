package dkd.c;
import ckd.c;
import java.lang.Object;
import java.lang.String;
import ckd.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.download.DownloadTask$DownloadRequest;
import com.yxcorp.download.DownloadTask$DownloadBizExtra;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import com.yxcorp.download.DownloadManager;
import com.yxcorp.download.b;
import dkd.c$a;
import java.lang.Integer;

public class c implements c	// class@000cd4
{

    public void c(){
       super();
    }
    public int a(String p0,String p1,String p2,boolean p3,boolean p4,e p5){
       DownloadTask$DownloadRequest obj;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,p1,p2,Boolean.valueOf(p3),Boolean.valueOf(p4),p5};
          obj = PatchProxy.apply(objArray, this, uoc, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = new DownloadTask$DownloadRequest(p0);
       obj.setBizInfo("com.kwai.middleware:upgrade-retrofit", "platform_kuaishou_upgrade", null);
       obj.setNeedCDNReport(1);
       obj.setDestinationDir(p1);
       obj.setDestinationFileName(p2);
       obj.setDownloadTaskType(DownloadTask$DownloadTaskType.IMMEDIATE);
       if (p3) {
          obj.setNotificationVisibility(3);
       }else {
          obj.setNotificationVisibility(0);
       }
       obj.setInstallAfterDownload(p4);
       b[] uobArray = new b[]{new c$a(this, p5)};
       return DownloadManager.n().E(obj, uobArray);
    }
    public void cancel(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "2")) {
          return;
       }
       DownloadManager.n().c(p0);
       return;
    }
}
