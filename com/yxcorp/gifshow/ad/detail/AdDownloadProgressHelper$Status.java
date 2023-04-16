package com.yxcorp.gifshow.ad.detail.AdDownloadProgressHelper$Status;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.ad.detail.AdDownloadProgressHelper$c;
import com.yxcorp.gifshow.ad.detail.AdDownloadProgressHelper$d;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lnc.a1;
import com.yxcorp.gifshow.ad.widget.BaseAdProgressView;
import java.lang.Long;
import g59.p;

public final class AdDownloadProgressHelper$Status extends Enum	// class@00153c
{
    public final int mStatusStrRes;
    public static final AdDownloadProgressHelper$Status[] $VALUES;
    public static final AdDownloadProgressHelper$Status COMPLETED;
    public static final AdDownloadProgressHelper$Status DOWNLOADING;
    public static final AdDownloadProgressHelper$Status INSTALLED;
    public static final AdDownloadProgressHelper$Status NORMAL;
    public static final AdDownloadProgressHelper$Status PAUSED;
    public static final AdDownloadProgressHelper$Status WAITING;

    static {
       AdDownloadProgressHelper$Status status = new AdDownloadProgressHelper$Status("NORMAL", 0, 0x7f100aad);
       AdDownloadProgressHelper$Status.NORMAL = status;
       AdDownloadProgressHelper$Status status1 = new AdDownloadProgressHelper$Status("WAITING", 1, 0x7f104aa7);
       AdDownloadProgressHelper$Status.WAITING = status1;
       AdDownloadProgressHelper$Status status2 = new AdDownloadProgressHelper$Status("DOWNLOADING", 2, 0x7f10009f);
       AdDownloadProgressHelper$Status.DOWNLOADING = status2;
       AdDownloadProgressHelper$Status status3 = new AdDownloadProgressHelper$Status("PAUSED", 3, 0x7f10081a);
       AdDownloadProgressHelper$Status.PAUSED = status3;
       AdDownloadProgressHelper$Status status4 = new AdDownloadProgressHelper$Status("COMPLETED", 4, 0x7f1016d0);
       AdDownloadProgressHelper$Status.COMPLETED = status4;
       AdDownloadProgressHelper$Status status5 = new AdDownloadProgressHelper$Status("INSTALLED", 5, 0x7f100073);
       AdDownloadProgressHelper$Status.INSTALLED = status5;
       AdDownloadProgressHelper$Status[] statusArray = new AdDownloadProgressHelper$Status[]{status,status1,status2,status3,status4,status5};
       AdDownloadProgressHelper$Status.$VALUES = statusArray;
    }
    public void AdDownloadProgressHelper$Status(String p0,int p1,int p2){
       super(p0, p1);
       this.mStatusStrRes = p2;
    }
    public static AdDownloadProgressHelper$Status valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AdDownloadProgressHelper$Status.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(AdDownloadProgressHelper$Status.class, p0);
    }
    public static AdDownloadProgressHelper$Status[] values(){
       Object obj = PatchProxy.apply(null, null, AdDownloadProgressHelper$Status.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AdDownloadProgressHelper$Status.$VALUES.clone();
    }
    public final String getStatusString(AdDownloadProgressHelper$c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AdDownloadProgressHelper$Status.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this == AdDownloadProgressHelper$Status.NORMAL && (p0 != null && !TextUtils.x(p0.a.a()))) {
          return p0.a.a();
       }
       return a1.p(this.mStatusStrRes);
    }
    public void showProgressStatus(BaseAdProgressView p0,long p1,long p2,AdDownloadProgressHelper$c p3){
       if (PatchProxy.isSupport(AdDownloadProgressHelper$Status.class) && PatchProxy.applyVoidFourRefs(p0, Long.valueOf(p1), Long.valueOf(p2), p3, this, AdDownloadProgressHelper$Status.class, "3")) {
          return;
       }
       float f = p.a(p1, p2);
       AdDownloadProgressHelper$Status status = null;
       if (f - status >= 0) {
          p0.setProgress(f);
       }
       if (f - status > 0 && (this != AdDownloadProgressHelper$Status.COMPLETED && (this == AdDownloadProgressHelper$Status.INSTALLED || this == AdDownloadProgressHelper$Status.PAUSED))) {
          String statusString = this.getStatusString(p3);
          boolean b = (this != AdDownloadProgressHelper$Status.PAUSED && this != AdDownloadProgressHelper$Status.DOWNLOADING)? true: false;
          p0.c(statusString, b);
       }
       return;
    }
}
