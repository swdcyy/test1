package h76.b;
import k97.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.download.DownloadManager;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.cache.AwesomeCache;
import java.lang.Boolean;
import com.yxcorp.download.DownloadTask;
import k97.d;
import k97.c;
import com.yxcorp.download.DownloadTask$DownloadRequest;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.download.DownloadTask$DownloadBizExtra;
import com.yxcorp.download.DownloadTask$DownloadBizExtra$SubSolutionType;
import java.io.Serializable;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import com.yxcorp.download.b;
import h76.b$a;
import java.lang.Number;
import k97.e;
import h76.a;
import h76.b$c;
import h76.b$b;
import java.lang.NullPointerException;
import java.lang.Throwable;
import com.kwai.video.hodor.MediaPreloadPriorityTask;
import com.kwai.video.hodor.AbstractHodorPreloadTask;
import com.kwai.video.hodor.AbstractHodorTask;
import h76.c;
import yb7.c;
import com.kwai.video.cache.AwesomeCacheCallback;
import com.kwai.video.hodor.HodorConfig;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$CdnResourceLoadStatEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.kwai.video.hodor.logEvent.CdnStatEvent;
import h76.d;
import com.kwai.video.hodor.logEvent.CdnStatEvent$OnCdnStatEventListener;
import h76.e;
import com.kwai.video.cache.AcCallBackInfo;
import java.lang.IllegalStateException;

public class b implements b	// class@00172b
{

    public void b(){
       super();
    }
    public void a(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "3")) {
          return;
       }
       DownloadManager.n().D(p0);
       return;
    }
    public void b(String p0){
    }
    public String c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AwesomeCache.exportMediaFileIfFullyCached(p0);
    }
    public void cancel(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "4")) {
          return;
       }
       DownloadManager.n().c(p0);
       return;
    }
    public boolean d(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return AwesomeCache.isMediaFileFullyCached(p0);
    }
    public String e(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       DownloadTask uDownloadTas = DownloadManager.n().l(p0);
       if (uDownloadTas == null) {
          return "";
       }else {
          return uDownloadTas.getUrl();
       }
    }
    public void f(d p0,c p1){
       d t;
       DownloadTask$DownloadTaskType pRE_DOWNLOAD;
       b uob = b.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uob, "1")) {
          return;
       }
       DownloadManager uDownloadMan = DownloadManager.n();
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       DownloadTask$DownloadRequest uDownloadReq = PatchProxy.applyOneRefs(p0, this, uob, "10");
       if (uDownloadReq != patchProxyRe) {
       }else {
          uDownloadReq = new DownloadTask$DownloadRequest(p0.b);
          d a = p0.a;
          if (a != null) {
             Iterator iterator = a.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                String key = uEntry.getKey();
                uDownloadReq.addRequestHeader(key, uEntry.getValue());
             }
          }
          if (!TextUtils.x(p0.d())) {
             uDownloadReq.setDestinationDir(p0.d());
          }
          if (!TextUtils.x(p0.e())) {
             uDownloadReq.setDestinationFileName(p0.e());
          }
          if (!TextUtils.x(p0.b())) {
             uDownloadReq.setCustomExtension(p0.b());
          }
          if (!TextUtils.x(p0.a())) {
             DownloadTask$DownloadBizExtra uDownloadBiz = new DownloadTask$DownloadBizExtra();
             d q = p0.q;
             if (!TextUtils.x(q)) {
                uDownloadBiz.setBundleId(q);
             }
             q = p0.s;
             DownloadTask$DownloadBizExtra$SubSolutionType uDownloadBiz1 = PatchProxy.applyOneRefs(q, this, uob, "11");
             if (uDownloadBiz1 != patchProxyRe) {
             }else if(("dynamic_yoda").equals(q)){
                uDownloadBiz1 = DownloadTask$DownloadBizExtra$SubSolutionType.Dynamic_Yoda;
             }else if(("dynamic_krn").equals(q)){
                uDownloadBiz1 = DownloadTask$DownloadBizExtra$SubSolutionType.Dynamic_KRN;
             }else if(("dynamic_tk").equals(q)){
                uDownloadBiz1 = DownloadTask$DownloadBizExtra$SubSolutionType.Dynamic_TK;
             }else if(("plugin").equals(q)){
                uDownloadBiz1 = DownloadTask$DownloadBizExtra$SubSolutionType.Plugin;
             }else if(("warmup").equals(q)){
                uDownloadBiz1 = DownloadTask$DownloadBizExtra$SubSolutionType.Warmup;
             }else if(("video").equals(q)){
                uDownloadBiz1 = DownloadTask$DownloadBizExtra$SubSolutionType.Video;
             }else if(("y_tech").equals(q)){
                uDownloadBiz1 = DownloadTask$DownloadBizExtra$SubSolutionType.Y_Tech;
             }else if(("mmu").equals(q)){
                uDownloadBiz1 = DownloadTask$DownloadBizExtra$SubSolutionType.MMU;
             }else if(("design").equals(q)){
                uDownloadBiz1 = DownloadTask$DownloadBizExtra$SubSolutionType.Design;
             }else {
                uDownloadBiz1 = null;
             }
             if (uDownloadBiz1 != null) {
                uDownloadBiz.setSubSolution(uDownloadBiz1);
             }
             t = p0.t;
             if (t != null && !t.isEmpty()) {
                Iterator iterator1 = t.keySet().iterator();
                while (iterator1.hasNext()) {
                   String str = iterator1.next();
                   uDownloadBiz.setExtraValue(str, t.get(str));
                }
             }
             uDownloadReq.setBizInfo(p0.r, p0.a(), uDownloadBiz);
          }
          if (p0.c() > 0) {
             uDownloadReq.setRetryTimes(p0.c());
          }
          if (p0.f() > 0) {
             uDownloadReq.setConnectTimeout(p0.f());
             uDownloadReq.setReadTimeout(p0.f());
          }
          int i = (p0.n != null)? 2: 1;
          uDownloadReq.setAllowedNetworkTypes(i);
          uDownloadReq.setIsNotForceReDownload(p0.h);
          t = p0.p;
          if (("pre_download").equals(t)) {
             pRE_DOWNLOAD = DownloadTask$DownloadTaskType.PRE_DOWNLOAD;
          }else if(("enqueue").equals(t)){
             pRE_DOWNLOAD = DownloadTask$DownloadTaskType.ENQUEUE;
          }else if(("init_download").equals(t)){
             pRE_DOWNLOAD = DownloadTask$DownloadTaskType.INIT_DOWNLOAD;
          }else {
             pRE_DOWNLOAD = DownloadTask$DownloadTaskType.IMMEDIATE;
          }
          uDownloadReq.setDownloadTaskType(pRE_DOWNLOAD);
          i = (p0.m != null)? 3: 0;
          uDownloadReq.setNotificationVisibility(i);
          uDownloadReq.setNeedCDNReport(1);
       }
       b[] uobArray = new b[]{new b$a(this, p1, p0)};
       uDownloadMan.E(uDownloadReq, uobArray);
       return;
    }
    public int g(int p0){
       a obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "8");
          if (obj != patchProxyRe) {
             return obj.intValue();
          }
       }
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "5");
          if (obj != patchProxyRe) {
          }else {
          label_0032 :
             DownloadTask uDownloadTas = DownloadManager.n().l(p0);
             if (uDownloadTas == null) {
                obj = null;
             }else {
                d uod = PatchProxy.applyOneRefs(uDownloadTas, this, uob, "12");
                if (uod != patchProxyRe) {
                }else {
                   uod = new d();
                   uod.i(TextUtils.k(uDownloadTas.getUrl()));
                   uod.j(TextUtils.k(uDownloadTas.getDestinationDir()), TextUtils.k(uDownloadTas.getFilename()));
                   uod.h(uDownloadTas.getBizType());
                }
                obj = new a(uod, uDownloadTas);
             }
          }
       }else {
          goto label_0032 ;
       }
       if (obj == null) {
          return 0;
       }else {
          return obj.e();
       }
    }
    public int getTaskId(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Integer integer = DownloadManager.n().p(p0);
       if (integer == null) {
          return -1;
       }
       return integer.intValue();
    }
    public void h(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "9")) {
          return;
       }
       DownloadManager.C(p0, p1);
       return;
    }
    public e i(int p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "5");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       DownloadTask uDownloadTas = DownloadManager.n().l(p0);
       if (uDownloadTas == null) {
          return null;
       }else {
          d uod = PatchProxy.applyOneRefs(uDownloadTas, this, uob, "12");
          if (uod != patchProxyRe) {
          }else {
             uod = new d();
             uod.i(TextUtils.k(uDownloadTas.getUrl()));
             uod.j(TextUtils.k(uDownloadTas.getDestinationDir()), TextUtils.k(uDownloadTas.getFilename()));
             uod.h(uDownloadTas.getBizType());
          }
          return new a(uod, uDownloadTas);
       }
    }
    public void j(String p0){
    }
    public void k(String[] p0,String p1,c p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "13")) {
          return;
       }
       if (p0.length <= 0) {
          return;
       }
       this.l(p0, new b$c(this), p1, p2);
       return;
    }
    public void l(String[] p0,b$c p1,String p2,c p3){
       b$c this;
       int i = p0;
       String str = p2;
       c uoc = p3;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, b.class, "14")) {
          return;
       }
       this = p1.a;
       if (this < null || this >= i.length) {
          if (uoc) {
             uoc.h(new e(new d(), null), new IllegalStateException("All cdn download fail."));
          }
          return;
       }else {
          object oobject = i[this];
          b$b uob = new b$b(this, p3, p0, this, p1, p2);
          if (!PatchProxy.applyVoidThreeRefs(oobject, p2, v13, this, b.class, "15")) {
             if (TextUtils.x(oobject)) {
                v13.onFailure(new NullPointerException("The url is null or empty."));
             }
             MediaPreloadPriorityTask mediaPreload = new MediaPreloadPriorityTask(oobject, null, null);
             mediaPreload.setPreloadMode(1);
             mediaPreload.setPreloadBytes(0);
             if (str) {
                mediaPreload.setBizType(str);
             }
             mediaPreload.setAwesomeCacheCallback(new c(this, v13, oobject));
             if (HodorConfig.isEnablePreloadUnifyCdnLog()) {
                ClientStat$CdnResourceLoadStatEvent uCdnResource = new ClientStat$CdnResourceLoadStatEvent();
                uCdnResource.resourceType = 8;
                ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
                urlPackage.page = 0x75a7;
                uCdnResource.urlPackage = urlPackage;
                mediaPreload.setCdnStatEvent(new CdnStatEvent(uCdnResource, new d(this)));
                mediaPreload.setUnifyCdnLog(1);
             }
             mediaPreload.submit();
          }
          return;
       }
    }
    public void pause(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "2")) {
          return;
       }
       DownloadManager.n().z(p0);
       return;
    }
}
