package com.kuaishou.live.common.core.basic.tools.g$c;
import com.kuaishou.live.common.core.basic.tools.g$d;
import com.kuaishou.live.common.core.basic.tools.g$a;
import java.lang.Object;
import com.kuaishou.live.common.core.basic.tools.g$c$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.download.DownloadManager;
import java.lang.Throwable;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.download.DownloadTask$DownloadRequest;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Integer;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.download.DownloadTask$DownloadBizExtra;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import com.yxcorp.download.b;

public class g$c	// class@000ef1
{
    public g$d a;
    public g$a b;
    public int c;
    public k d;

    public void g$c(g$d p0,g$a p1){
       super();
       this.c = -1;
       this.d = new g$c$a(this);
       this.a = p0;
       this.b = p1;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, g$c.class, "2")) {
          return;
       }
       _monitor_enter(this);
       this.b = null;
       _monitor_exit(this);
       DownloadManager.n().c(this.c);
       return;
    }
    public synchronized void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$c.class, "4")) {
          return;
       }
       g$c tb = this.b;
       if (tb != null) {
          tb.b(p0);
       }
       return;
    }
    public synchronized void c(Throwable p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g$c.class, "3")) {
          return;
       }
       g$c tb = this.b;
       if (tb != null) {
          tb.d(p0, p1);
       }
       return;
    }
    public void d(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, g$c.class, "1")) {
          return;
       }
       g$c ta = this.a;
       Objects.requireNonNull(ta);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g$d uod = g$d.class;
       object obj = PatchProxy.apply(objArray, ta, uod, "3");
       if (obj != patchProxyRe) {
          objArray = obj;
       }else {
          b.d0(LiveLogTag.LIVE_DOWNLOAD_UTILS, "createNextDownloadRequest", "mCurrentIndex", Integer.valueOf(ta.g), "mUrls.length", Integer.valueOf(ta.b.length));
          if (ta.b()) {
             int i = ta.g + 1;
             ta.g = i;
             obj = ta.b[i];
             Object obj1 = PatchProxy.applyOneRefs(obj, ta, uod, "4");
             if (obj1 != patchProxyRe) {
                objArray = obj1;
             }else {
                DownloadTask$DownloadRequest uDownloadReq = new DownloadTask$DownloadRequest(obj);
                uDownloadReq.setNeedCDNReport(1);
                if (TextUtils.x(ta.f)) {
                   uDownloadReq.setBizInfo(":ks-features:ft-live:live-features:live-common", "live_download", objArray);
                }else {
                   uDownloadReq.setBizInfo(":ks-features:ft-live:live-features:live-common", ta.f, objArray);
                }
                uDownloadReq.setAllowedNetworkTypes(3);
                uDownloadReq.setDestinationDir(ta.c);
                uDownloadReq.setInstallAfterDownload(0);
                uDownloadReq.setDownloadTaskType(ta.h);
                if (ta.h == DownloadTask$DownloadTaskType.PRE_DOWNLOAD && ta.i != null) {
                   uDownloadReq.setDownloadHostType(6);
                }
                objArray = uDownloadReq;
             }
          }
       }
       if (objArray == null) {
          b.Z(LiveLogTag.LIVE_DOWNLOAD_UTILS, "nextDownloadRequest is null");
          return;
       }else {
          b[] uobArray = new b[]{this.d};
          this.c = DownloadManager.n().E(objArray, uobArray);
          return;
       }
    }
}
