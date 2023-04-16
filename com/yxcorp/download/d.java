package com.yxcorp.download.d;
import com.kwai.video.hodor.logEvent.CdnStatEvent$OnCdnStatEventListener;
import com.yxcorp.download.DownloadTask;
import java.lang.Object;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$CdnResourceLoadStatEvent;
import com.kwai.video.cache.AcCallBackInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.download.DownloadTask$DownloadRequest;
import com.yxcorp.utility.Log;

public class d implements CdnStatEvent$OnCdnStatEventListener	// class@0011b9
{
    public final DownloadTask a;

    public void d(DownloadTask p0){
       this.a = p0;
       super();
    }
    public void onCdnStatEvent(ClientStat$CdnResourceLoadStatEvent p0,AcCallBackInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "1")) {
          return;
       }
       p0.resourceType = this.a.mRequest.getResourceType();
       p0.extraMessage = this.a.mRequest.mExtraMessage;
       Log.b("DownloadManager:DownloadTask", p1.cdnStatJson);
       return;
    }
    public void onCdnStatEvent(Object p0,AcCallBackInfo p1){
       this.onCdnStatEvent(p0, p1);
    }
}
