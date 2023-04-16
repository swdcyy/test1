package com.yxcorp.gifshow.ad.detail.AdDownloadProgressHelper$a;
import s59.b;
import com.yxcorp.gifshow.ad.detail.AdDownloadProgressHelper;
import java.lang.Object;
import com.yxcorp.download.DownloadTask;
import s59.a;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.commercial.adsdk.model.AdUrlInfo;
import lnc.h;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import com.yxcorp.gifshow.ad.detail.AdDownloadProgressHelper$Status;
import java.lang.Long;

public class AdDownloadProgressHelper$a implements b	// class@00153d
{
    public final AdDownloadProgressHelper a;

    public void AdDownloadProgressHelper$a(AdDownloadProgressHelper p0){
       this.a = p0;
       super();
    }
    public void a(DownloadTask p0){
       a.a(this, p0);
    }
    public String getKey(){
       Object obj = PatchProxy.apply(null, this, AdDownloadProgressHelper$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return h.a(this.a.b.mUrl);
    }
    public void onCancel(){
       if (PatchProxy.applyVoid(null, this, AdDownloadProgressHelper$a.class, "8")) {
          return;
       }
       AdDownloadProgressHelper$a ta = this.a;
       long l = 0;
       ta.e = l;
       ta.f = l;
       this.a.c = (!TextUtils.x(ta.b.mPkgName) && SystemUtil.M(a.b(), this.a.b.mPkgName))? AdDownloadProgressHelper$Status.INSTALLED: AdDownloadProgressHelper$Status.NORMAL;
       this.a.h();
       return;
    }
    public void onComplete(){
       if (PatchProxy.applyVoid(null, this, AdDownloadProgressHelper$a.class, "4")) {
          return;
       }
       AdDownloadProgressHelper$a ta = this.a;
       ta.c = AdDownloadProgressHelper$Status.COMPLETED;
       ta.f = 100;
       ta.e = 100;
       ta.h();
       return;
    }
    public void onError(){
       if (PatchProxy.applyVoid(null, this, AdDownloadProgressHelper$a.class, "6")) {
          return;
       }
       AdDownloadProgressHelper$a ta = this.a;
       ta.c = AdDownloadProgressHelper$Status.NORMAL;
       ta.h();
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, AdDownloadProgressHelper$a.class, "5")) {
          return;
       }
       AdDownloadProgressHelper$a ta = this.a;
       ta.c = AdDownloadProgressHelper$Status.PAUSED;
       ta.h();
       this.a.e();
       return;
    }
    public void onProgress(long p0,long p1){
       AdDownloadProgressHelper$a uoa = AdDownloadProgressHelper$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, uoa, "3")) {
          return;
       }
       uoa = this.a;
       uoa.c = AdDownloadProgressHelper$Status.DOWNLOADING;
       uoa.f = p0;
       uoa.e = p1;
       uoa.h();
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, AdDownloadProgressHelper$a.class, "7")) {
          return;
       }
       AdDownloadProgressHelper$a ta = this.a;
       ta.c = AdDownloadProgressHelper$Status.DOWNLOADING;
       ta.h();
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, AdDownloadProgressHelper$a.class, "2")) {
          return;
       }
       AdDownloadProgressHelper$a ta = this.a;
       ta.c = AdDownloadProgressHelper$Status.DOWNLOADING;
       ta.h();
       return;
    }
}
