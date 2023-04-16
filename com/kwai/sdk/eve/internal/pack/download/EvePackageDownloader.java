package com.kwai.sdk.eve.internal.pack.download.EvePackageDownloader;
import com.kwai.sdk.eve.internal.pack.download.IPackageDownloader;
import com.kwai.sdk.eve.internal.pack.download.EvePackageDownloader$a;
import nsd.u;
import sm7.o;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.sdk.eve.internal.pack.download.EvePackageDownloader$mStateMap$2;
import msd.a;
import qrd.p;
import qrd.s;
import ptd.c;
import com.kwai.sdk.eve.internal.pack.download.IPackageDownloader$DownloadItem;
import com.kwai.sdk.eve.internal.pack.download.IPackageDownloader$a;
import asd.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kwai.sdk.eve.internal.common.utils.EveLog;
import com.kwai.sdk.eve.internal.pack.download.EvePackageDownloader$download$downloadItem$1;
import java.util.Objects;
import com.kwai.sdk.eve.internal.pack.download.IPackageDownloader$DownloadItem$takeIfValid$2;
import java.lang.Boolean;
import java.io.File;
import qn7.d;
import com.kwai.sdk.eve.internal.common.utils.a;
import qrd.l1;
import csd.b;
import java.lang.Integer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import com.kwai.sdk.eve.internal.pack.download.EvePackageDownloader$fullDownload$1;
import com.kwai.sdk.eve.internal.pack.download.EvePackageDownloader$b;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.Ref$BooleanRef;
import qrd.j0;
import java.lang.IllegalStateException;
import kotlinx.coroutines.sync.MutexKt;
import com.yxcorp.download.DownloadTask$DownloadRequest;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import com.yxcorp.download.DownloadTask$DownloadBizExtra;
import com.yxcorp.download.DownloadManager;
import com.yxcorp.download.b;
import java.lang.Throwable;

public final class EvePackageDownloader implements IPackageDownloader	// class@00159a
{
    public final p a;
    public final o b;
    public static final EvePackageDownloader$a c;

    static {
       EvePackageDownloader.c = new EvePackageDownloader$a(null);
    }
    public void EvePackageDownloader(o p0){
       a.p(p0, "config");
       super();
       this.b = p0;
       this.a = s.c(EvePackageDownloader$mStateMap$2.INSTANCE);
    }
    public static void h(EvePackageDownloader p0,c p1,Object p2,int p3,Object p4){
       p0.g(p1, null);
    }
    public Object a(IPackageDownloader$DownloadItem p0,IPackageDownloader$a p1,c p2){
       Object this;
       boolean b1;
       int i1;
       EvePackageDownloader$download$downloadItem$1 obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, EvePackageDownloader.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int b = false;
       int i = 2;
       this = null;
       EveLog.i$default("EPMDownloader#download : downloadItem = "+p0, b, i, this);
       obj = new EvePackageDownloader$download$downloadItem$1(this, p1, p0);
       Objects.requireNonNull(p0);
       Object obj1 = PatchProxy.applyOneRefs(obj, p0, IPackageDownloader$DownloadItem.class, "2");
       if (obj1 != PatchProxyResult.class) {
       }else if(p0.c()){
          i1 = p0;
       }else {
          i1 = this;
       }
       if (i1 == null) {
          i1 = new IPackageDownloader$DownloadItem$takeIfValid$2(obj).invoke();
       }
       obj1 = i1;
       if (obj1 != null) {
          File obj2 = PatchProxy.apply(this, obj1, IPackageDownloader$DownloadItem.class, "4");
          if (obj2 != PatchProxyResult.class) {
             b1 = obj2.booleanValue();
          }else {
             obj2 = obj1.a();
             IPackageDownloader$DownloadItem g = obj1.g;
             Object obj3 = PatchProxy.applyTwoRefs(obj2, g, obj1, IPackageDownloader$DownloadItem.class, "5");
             if (obj3 != PatchProxyResult.class) {
                b1 = obj3.booleanValue();
             }else {
                a.p(obj2, "file");
                a.p(g, "md5");
                b1 = (d.b(obj2) && obj2.isFile())? a.g(a.e(obj2), g): false;
             }
          }
          if (b1) {
             EveLog.i$default("EPMDownloader#download : hasDownload = "+obj1, b, i, this);
             this.c(p1, obj1, b);
             return l1.a;
          }else {
             d.a(obj1.a());
             i = obj1.b();
             this.d(i, b);
             b = i;
             obj2 = this.e(b, obj1, p1, "feed_eve_task_file", p2);
             if (obj2 == b.h()) {
                return obj2;
             }else {
                return l1.a;
             }
          }
       }else if(obj1 == b.h()){
          return obj1;
       }else {
          return l1.a;
       }
    }
    public final void b(IPackageDownloader$a p0,IPackageDownloader$DownloadItem p1,int p2,String p3){
       if (PatchProxy.isSupport(EvePackageDownloader.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, EvePackageDownloader.class, "4")) {
          return;
       }
       EveLog.i$default("EPMDownloader#callbackFail : errCode = "+p2+", errMsg = "+p3+", downloadItem = "+p1, false, 2, null);
       if (p0 != null) {
          p0.a(p1, p2, p3);
       }
       return;
    }
    public final void c(IPackageDownloader$a p0,IPackageDownloader$DownloadItem p1,boolean p2){
       if (PatchProxy.isSupport(EvePackageDownloader.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, EvePackageDownloader.class, "5")) {
          return;
       }
       EveLog.i$default("EPMDownloader#callbackSuccess : isIncremental = "+p2+", downloadItem = "+p1, false, 2, null);
       if (p0 != null) {
          p0.b(p1, p2);
       }
       return;
    }
    public final void d(int p0,int p1){
       EvePackageDownloader uEvePackageD = EvePackageDownloader.class;
       if (PatchProxy.isSupport(uEvePackageD) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uEvePackageD, "8")) {
          return;
       }
       EveLog.i$default("change id: "+p0+" state "+p1, false, 2, null);
       ConcurrentHashMap uConcurrentH = PatchProxy.apply(null, this, uEvePackageD, "1");
       if (uConcurrentH == PatchProxyResult.class) {
          uConcurrentH = this.a.getValue();
       }
       uConcurrentH.put(Integer.valueOf(p0), Integer.valueOf(p1));
       return;
    }
    public final Object e(int p0,IPackageDownloader$DownloadItem p1,IPackageDownloader$a p2,String p3,c p4){
       EvePackageDownloader$fullDownload$1 uofullDownlo;
       boolean b;
       EvePackageDownloader$fullDownload$1 l$5;
       EvePackageDownloader$fullDownload$1 l$1;
       EvePackageDownloader$fullDownload$1 l$0;
       Object obj3;
       IPackageDownloader$DownloadItem this;
       int i3;
       EvePackageDownloader uEvePackageD = this;
       int i = p0;
       Object obj = p1;
       object oobject = p3;
       c uoc = p4;
       if (uoc instanceof EvePackageDownloader$fullDownload$1) {
          uofullDownlo = uoc;
          EvePackageDownloader$fullDownload$1 label = uofullDownlo.label;
          int i1 = Integer.MIN_VALUE;
          if (label & i1) {
             uofullDownlo.label = label - i1;
          label_0022 :
             EvePackageDownloader$fullDownload$1 uofullDownlo1 = uofullDownlo;
             EvePackageDownloader$fullDownload$1 result = uofullDownlo1.result;
             Object obj1 = b.h();
             uofullDownlo = uofullDownlo1.label;
             int i2 = 2;
             b = true;
             Object obj2 = null;
             if (uofullDownlo != null) {
                if (uofullDownlo == b) {
                   uofullDownlo = uofullDownlo1.L$8;
                   label = uofullDownlo1.L$6;
                   l$5 = uofullDownlo1.L$5;
                   l$1 = uofullDownlo1.L$1;
                   l$0 = uofullDownlo1.L$0;
                   j0.n(result);
                   result = uofullDownlo1.L$9;
                   obj3 = obj2;
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                EveLog.i$default("EPMDownloader#fullDownload : downloadItem = "+obj, false, i2, obj2);
                uEvePackageD.d(i, 3);
                Ref$BooleanRef uBooleanRef = new Ref$BooleanRef();
                uBooleanRef.element = false;
                Ref$ObjectRef objectRef = new Ref$ObjectRef();
                objectRef.element = obj2;
                EvePackageDownloader$b uob = uofullDownlo;
                EvePackageDownloader$b uob1 = uofullDownlo;
                Ref$ObjectRef objectRef1 = objectRef;
                Ref$BooleanRef uBooleanRef1 = uBooleanRef;
                c uoc1 = MutexKt.f(b);
                uob = new EvePackageDownloader$b(this, p1, uBooleanRef, p2, objectRef1, uoc1);
                IPackageDownloader$DownloadItem e = obj.e;
                this = obj.f;
                IPackageDownloader$DownloadItem h = obj.h;
                EvePackageDownloader uEvePackageD1 = EvePackageDownloader.class;
                if (PatchProxy.isSupport(uEvePackageD1)) {
                   Object[] objArray = new Object[]{e,this,uob1,oobject,Boolean.valueOf(h)};
                   i3 = 3;
                   if (PatchProxy.applyVoid(objArray, uEvePackageD, uEvePackageD1, "7")) {
                      obj3 = null;
                   label_014f :
                      uofullDownlo1.L$0 = uEvePackageD;
                      uofullDownlo1.I$0 = i;
                      uofullDownlo1.L$1 = obj;
                      uofullDownlo1.L$2 = p2;
                      uofullDownlo1.L$3 = oobject;
                      c uoc2 = uoc1;
                      uofullDownlo1.L$4 = uoc2;
                      Ref$BooleanRef uBooleanRef2 = uBooleanRef1;
                      uofullDownlo1.L$5 = uBooleanRef2;
                      Ref$ObjectRef EvePackageDownloader this1 = objectRef1;
                      uofullDownlo1.L$6 = this1;
                      uofullDownlo1.L$7 = uob1;
                      uofullDownlo1.L$8 = uEvePackageD;
                      uofullDownlo1.L$9 = uoc2;
                      uofullDownlo1.label = 1;
                      if (uoc2.e(obj3, uofullDownlo1) == obj1) {
                         return obj1;
                      }else {
                         uBooleanRef = uBooleanRef2;
                         objectRef = this1;
                         this1 = uEvePackageD;
                         l$0 = this1;
                         l$1 = obj;
                         uoc = uoc2;
                      }
                   }
                }else {
                   i3 = 3;
                }
                obj3 = null;
                EveLog.i$default("EPMDownloader#downloadInternal : url = "+e, false, 2, obj3);
                DownloadTask$DownloadRequest uDownloadReq = new DownloadTask$DownloadRequest(e);
                File uFile = new File(this);
                uDownloadReq.setDestinationDir(uFile.getParent());
                uDownloadReq.setDestinationFileName(uFile.getName());
                if (h != null) {
                   uDownloadReq.setAllowedNetworkTypes(2);
                }else {
                   uDownloadReq.setAllowedNetworkTypes(i3);
                }
                uDownloadReq.setInstallAfterDownload(false);
                if (!uEvePackageD.b.getValue().booleanValue()) {
                   uDownloadReq.setDownloadTaskType(DownloadTask$DownloadTaskType.PRE_DOWNLOAD);
                }else {
                   uDownloadReq.setDownloadTaskType(DownloadTask$DownloadTaskType.ENQUEUE);
                }
                boolean b1 = true;
                uDownloadReq.setSyncCallback(b1);
                if (!PatchProxy.applyVoidTwoRefs(uDownloadReq, oobject, uEvePackageD, uEvePackageD1, "10")) {
                   uDownloadReq.setNeedCDNReport(b1);
                   uDownloadReq.setBizInfo("com.kuaishou.eve:eve-core", oobject, obj3);
                }
                b[] uobArray = new b[b1];
                uobArray[0] = uob1;
                DownloadManager.n().E(uDownloadReq, uobArray);
                goto label_014f ;
             }
             l1 a = l1.a;
             uofullDownlo.g(result, obj3);
             EveLog.i$default("EPMDownloader#fullDownload : success = (l$5.element != null)?==> url = "+l$0.f(l$1), false, 2, obj3):==> error = "+label.element+", url = "+l$0.f(l$1), false, 2, obj3);
             return a;
          }
       }
       uofullDownlo = new EvePackageDownloader$fullDownload$1(uEvePackageD, uoc);
       goto label_0022 ;
    }
    public final String f(IPackageDownloader$DownloadItem p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EvePackageDownloader.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "taskId = "+p0.c+", md5 = "+p0.g+", url = "+p0.e;
    }
    public final void g(c p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EvePackageDownloader.class, "11")) {
          return;
       }
       _monitor_enter(p0);
       if (p0.a()) {
          try{
             p0.f(p1);
          }catch(java.lang.IllegalStateException e6){
             EveLog.e$default("unlockSafely crash", e6, false, 4, null);
          }
       }
    }
}
