package com.kwai.sdk.eve.internal.pack.EvePackageManager$downloadPackage$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.kwai.sdk.eve.internal.pack.EvePackageManager;
import com.kwai.sdk.eve.internal.pack.download.IPackageDownloader$DownloadItem;
import com.kwai.sdk.eve.internal.pack.model.EveServerPackage;
import java.lang.String;
import msd.l;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ftd.k0;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import com.kwai.sdk.eve.internal.pack.download.IPackageDownloader$DownloadIncrementalItem;
import com.kwai.sdk.eve.internal.pack.model.EveServerPackage$PackageItem;
import java.lang.Long;
import dsd.a;
import xn7.a;
import java.util.Objects;
import java.lang.Boolean;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.sdk.eve.internal.pack.EvePackageManager$b;
import com.kwai.sdk.eve.internal.pack.EvePackageManager$downloadPackage$1$a;
import com.kwai.sdk.eve.internal.pack.download.IPackageDownloader$a;
import com.kwai.sdk.eve.internal.pack.download.IPackageDownloader;

public final class EvePackageManager$downloadPackage$1 extends SuspendLambda implements p	// class@001581
{
    public final l $callback;
    public final IPackageDownloader$DownloadItem $downloadItem;
    public final EveServerPackage $serverPackage;
    public final long $start;
    public final String $taskId;
    public long J$0;
    public Object L$0;
    public int label;
    public k0 p$;
    public final EvePackageManager this$0;

    public void EvePackageManager$downloadPackage$1(EvePackageManager p0,IPackageDownloader$DownloadItem p1,EveServerPackage p2,String p3,long p4,l p5,c p6){
       this.this$0 = p0;
       this.$downloadItem = p1;
       this.$serverPackage = p2;
       this.$taskId = p3;
       this.$start = p4;
       this.$callback = p5;
       super(2, p6);
    }
    public final c create(Object p0,c p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, EvePackageManager$downloadPackage$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       EvePackageManager$downloadPackage$1 uodownloadPa = new EvePackageManager$downloadPackage$1(this.this$0, this.$downloadItem, this.$serverPackage, this.$taskId, this.$start, this.$callback, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, EvePackageManager$downloadPackage$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       boolean b;
       EveServerPackage incrementalP;
       Long longx;
       long l1;
       long l2;
       Object obj = this;
       String str = "1";
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, EvePackageManager$downloadPackage$1.class, str);
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       obj1 = b.h();
       EvePackageManager$downloadPackage$1 label = obj.label;
       if (label != null) {
          if (label == 1) {
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          EvePackageManager$downloadPackage$1 p$ = obj.p$;
          b = obj.$downloadItem instanceof IPackageDownloader$DownloadIncrementalItem;
          long l = 0;
          if (b) {
             incrementalP = obj.$serverPackage.incrementalPack;
             if (incrementalP != null) {
                longx = a.g(incrementalP.size);
                if (longx != null) {
                   l = longx.longValue();
                }
             }
          }else {
             incrementalP = obj.$serverPackage.fullPack;
             if (incrementalP != null) {
                longx = a.g(incrementalP.size);
                if (longx != null) {
                   l = longx.longValue();
                }
             }
          }
          l1 = l;
          a uoa = EvePackageManager.b(obj.this$0);
          EvePackageManager$downloadPackage$1 $taskId = obj.$taskId;
          EvePackageManager$downloadPackage$1 $downloadIte = obj.$downloadItem;
          IPackageDownloader$DownloadItem d = $downloadIte.d;
          IPackageDownloader$DownloadItem g = $downloadIte.g;
          Objects.requireNonNull(uoa);
          a uoa1 = a.class;
          if (PatchProxy.isSupport(uoa1)) {
             Object[] objArray = new Object[]{$taskId,Boolean.valueOf(b),d,g,Long.valueOf(l1)};
             if (PatchProxy.applyVoid(objArray, uoa, uoa1, str)) {
                l2 = l1;
             label_00b7 :
                Iterator iterator = obj.this$0.v.iterator();
                while (iterator.hasNext()) {
                   $downloadIte = obj.$downloadItem;
                   iterator.next().a(obj.$taskId, b, $downloadIte.d, $downloadIte.g, l2);
                }
                EvePackageManager t = obj.this$0.t;
                if (t == null) {
                   a.S("mDownloader");
                }
                obj.L$0 = p$;
                obj.J$0 = l2;
                obj.label = 1;
                if (t.a(obj.$downloadItem, new EvePackageManager$downloadPackage$1$a(obj, b), obj) == obj1) {
                   return obj1;
                }
             }
          }
          a.p($taskId, "taskId");
          a.p(d, "version");
          a.p(g, "md5");
          l2 = l1;
          uoa.a($taskId, b, d, 0, g, 0, l1, 0, "");
          goto label_00b7 ;
       }
       return l1.a;
    }
}
