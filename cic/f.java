package cic.f;
import java.lang.Runnable;
import com.kwai.video.hodor.ExportMediaCacheTask$TaskInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.hodor.BaseTaskInfo;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$CdnResourceLoadStatEvent;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import com.yxcorp.gifshow.log.model.StatMetaData;
import k2b.u1;

public final class f implements Runnable	// class@0005aa
{
    public final ExportMediaCacheTask$TaskInfo b;

    public void f(ExportMediaCacheTask$TaskInfo p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       int stopReason = this.b.getStopReason();
       int i = 2;
       int i1 = 1;
       if (stopReason != i1) {
          stopReason = (stopReason != i)? 3: 2;
       }else {
          stopReason = 1;
       }
       ClientStat$CdnResourceLoadStatEvent uCdnResource = new ClientStat$CdnResourceLoadStatEvent();
       uCdnResource.resourceType = 22;
       uCdnResource.loadSource = i1;
       uCdnResource.downloadedSize = this.b.getDownloadedBytes();
       uCdnResource.expectedSize = this.b.getExpectBytes();
       uCdnResource.totalFileSize = this.b.getTotalBytes();
       uCdnResource.url = TextUtils.k(this.b.getCurrentUrl());
       uCdnResource.host = TextUtils.k(this.b.getHost());
       uCdnResource.ip = TextUtils.k(this.b.getIp());
       uCdnResource.loadStatus = stopReason;
       uCdnResource.networkCost = (long)this.b.getTransferConsumeMs();
       uCdnResource.totalCost = (long)this.b.getTransferConsumeMs();
       uCdnResource.kwaiSignature = TextUtils.k(this.b.getKwaiSign());
       uCdnResource.downloadType = i;
       uCdnResource.xKsCache = TextUtils.k(this.b.getxKsCache());
       uCdnResource.cdnQosJson = TextUtils.k(this.b.getCdnStatJson());
       ClientStat$StatPackage statPackage = new ClientStat$StatPackage();
       statPackage.cdnResourceLoadStatEvent = uCdnResource;
       StatMetaData statMetaData = new StatMetaData();
       statMetaData.setStatPackage(statPackage);
       u1.F0(statMetaData);
       return;
    }
}
