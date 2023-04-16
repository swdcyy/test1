package mc9.d;
import java.lang.Runnable;
import com.kwai.video.hodor.ExportMediaCacheTask$TaskInfo;
import java.lang.Object;
import com.kwai.video.hodor.BaseTaskInfo;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$CdnResourceLoadStatEvent;
import java.lang.String;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import com.yxcorp.gifshow.log.model.StatMetaData;
import k2b.u1;

public final class d implements Runnable	// class@002e43
{
    public final ExportMediaCacheTask$TaskInfo b;

    public void d(ExportMediaCacheTask$TaskInfo p0){
       this.b = p0;
    }
    public final void run(){
       d tb = this.b;
       int stopReason = tb.getStopReason();
       int i = 1;
       if (stopReason != i) {
          stopReason = (stopReason != 2)? 3: 2;
       }else {
          stopReason = 1;
       }
       ClientStat$CdnResourceLoadStatEvent uCdnResource = new ClientStat$CdnResourceLoadStatEvent();
       uCdnResource.resourceType = 22;
       uCdnResource.loadSource = i;
       uCdnResource.downloadedSize = tb.getDownloadedBytes();
       uCdnResource.expectedSize = tb.getExpectBytes();
       uCdnResource.totalFileSize = tb.getTotalBytes();
       uCdnResource.url = TextUtils.k(tb.getCurrentUrl());
       uCdnResource.host = TextUtils.k(tb.getHost());
       uCdnResource.ip = TextUtils.k(tb.getIp());
       uCdnResource.loadStatus = stopReason;
       uCdnResource.networkCost = (long)tb.getTransferConsumeMs();
       uCdnResource.totalCost = (long)tb.getTransferConsumeMs();
       uCdnResource.kwaiSignature = TextUtils.k(tb.getKwaiSign());
       uCdnResource.downloadType = 2;
       uCdnResource.xKsCache = TextUtils.k(tb.getxKsCache());
       uCdnResource.cdnQosJson = TextUtils.k(tb.getCdnStatJson());
       ClientStat$StatPackage statPackage = new ClientStat$StatPackage();
       statPackage.cdnResourceLoadStatEvent = uCdnResource;
       StatMetaData statMetaData = new StatMetaData();
       statMetaData.setStatPackage(statPackage);
       u1.F0(statMetaData);
       return;
    }
}
