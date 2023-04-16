package com.kwai.sdk.eve.internal.pack.EvePackageManager$downloadPackage$1$a;
import com.kwai.sdk.eve.internal.pack.download.IPackageDownloader$a;
import com.kwai.sdk.eve.internal.pack.EvePackageManager$downloadPackage$1;
import com.kwai.sdk.eve.internal.pack.download.IPackageDownloader$DownloadItem;
import java.lang.String;
import xn7.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kwai.sdk.eve.internal.pack.model.EveServerPackage;
import com.kwai.sdk.eve.internal.pack.model.EveServerPackage$PackageItem;
import java.lang.System;
import com.kwai.sdk.eve.internal.pack.EvePackageManager;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.sdk.eve.internal.pack.EvePackageManager$b;
import java.util.Objects;
import java.lang.Boolean;
import java.lang.Long;
import msd.l;

public final class EvePackageManager$downloadPackage$1$a extends IPackageDownloader$a	// class@001580
{
    public final EvePackageManager$downloadPackage$1 a;
    public final boolean b;

    public void EvePackageManager$downloadPackage$1$a(EvePackageManager$downloadPackage$1 p0,boolean p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(IPackageDownloader$DownloadItem p0,int p1,String p2){
       EveServerPackage incrementalP;
       EveServerPackage$PackageItem size;
       String this;
       EvePackageManager$downloadPackage$1$a a;
       String str2;
       a uoa2;
       a uoa3;
       EvePackageManager$downloadPackage$1 $taskId;
       EvePackageManager$downloadPackage$1$a b;
       IPackageDownloader$DownloadItem d;
       IPackageDownloader$DownloadItem g;
       object oobject;
       EvePackageManager$downloadPackage$1$a uodownloadPa2;
       Object obj3;
       EvePackageManager$downloadPackage$1$a uodownloadPa = this;
       Object obj = p0;
       a obj1 = p2;
       a uoa = a.class;
       if (PatchProxy.isSupport(EvePackageManager$downloadPackage$1$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, EvePackageManager$downloadPackage$1$a.class, "2")) {
          return;
       }
       a.p(obj, "downloadItem");
       a.p(obj1, "errMsg");
       EvePackageManager$downloadPackage$1$a uodownloadPa1 = null;
       if (uodownloadPa.b != null) {
          incrementalP = uodownloadPa.a.$serverPackage.incrementalPack;
          if (incrementalP != null) {
             size = incrementalP.size;
          }else {
          label_004b :
             uodownloadPa2 = uodownloadPa1;
          }
       }else {
          incrementalP = uodownloadPa.a.$serverPackage.fullPack;
          if (incrementalP != null) {
             size = incrementalP.size;
          }else {
             goto label_004b ;
          }
       }
       String str = "errorMsg";
       this = "md5";
       String str1 = "version";
       int i = 7;
       if (p1 == 4) {
          a = uodownloadPa.a;
          a uoa1 = uoa;
          long l = System.currentTimeMillis() - a.$start;
          Iterator iterator = a.this$0.v.iterator();
          while (iterator.hasNext()) {
             iterator.next().b(uodownloadPa.a.$taskId, uodownloadPa.b, obj.d, obj.g, l, size, p1, p2);
             str = str;
             uoa1 = uoa1;
             int i1 = 8;
          }
          str2 = str;
          uoa2 = uoa1;
          int i2 = 8;
          uoa3 = EvePackageManager.b(uodownloadPa.a.this$0);
          $taskId = uodownloadPa.a.$taskId;
          b = uodownloadPa.b;
          d = obj.d;
          g = obj.g;
          Objects.requireNonNull(uoa3);
          if (PatchProxy.isSupport(uoa2)) {
             Object[] objArray = new Object[i2];
             objArray[0] = $taskId;
             objArray[1] = Boolean.valueOf(b);
             objArray[2] = d;
             objArray[3] = g;
             objArray[4] = Long.valueOf(l);
             objArray[5] = Long.valueOf(size);
             objArray[6] = Integer.valueOf(p1);
             oobject = p2;
             objArray[i] = oobject;
             if (PatchProxy.applyVoid(objArray, uoa3, uoa2, "4")) {
             label_0123 :
                uodownloadPa2 = uodownloadPa;
             }
          }else {
             oobject = p2;
          }
          a.p($taskId, "taskId");
          a.p(d, str1);
          a.p(g, this);
          a.p(oobject, str2);
          uoa3.a($taskId, b, d, 3, g, null, size, p1, p2);
          goto label_0123 ;
       }else {
          String str3 = str;
          obj1 = uoa;
          Object obj2 = obj1;
          Iterator iterator1 = uodownloadPa.a.this$0.v.iterator();
          while (iterator1.hasNext()) {
             str2 = str3;
             long l1 = System.currentTimeMillis() - uodownloadPa.a.$start;
             iterator1.next().d(uodownloadPa.a.$taskId, uodownloadPa.b, obj.d, obj.g, l1, size, p1, p2);
             obj2 = p2;
             str3 = str2;
             obj1 = obj1;
             obj3 = 8;
          }
          str2 = str3;
          obj3 = obj2;
          uoa2 = obj1;
          uoa3 = EvePackageManager.b(uodownloadPa.a.this$0);
          $taskId = uodownloadPa.a.$taskId;
          b = uodownloadPa.b;
          d = obj.d;
          g = obj.g;
          long l2 = System.currentTimeMillis() - uodownloadPa.a.$start;
          Objects.requireNonNull(uoa3);
          if (PatchProxy.isSupport(uoa2)) {
             Object[] objArray1 = new Object[]{$taskId,Boolean.valueOf(b),d,g,Long.valueOf(l2),Long.valueOf(size),Integer.valueOf(p1),obj3};
             if (PatchProxy.applyVoid(objArray1, uoa3, uoa2, "3")) {
             label_01e8 :
                uodownloadPa2 = this;
             }
          }
          a.p($taskId, "taskId");
          a.p(d, str1);
          a.p(g, this);
          a.p(obj3, str2);
          uoa3.a($taskId, b, d, 2, g, 0, size, p1, p2);
          goto label_01e8 ;
       }
       uodownloadPa2.a.$callback.invoke(Boolean.FALSE);
       uodownloadPa2.a.this$0.w(p0, false);
       return;
    }
    public void b(IPackageDownloader$DownloadItem p0,boolean p1){
       EveServerPackage incrementalP;
       EvePackageManager$downloadPackage$1$a a;
       boolean b;
       Object obj = this;
       Object obj1 = p0;
       EvePackageManager$downloadPackage$1$a uodownloadPa = EvePackageManager$downloadPackage$1$a.class;
       if (PatchProxy.isSupport(uodownloadPa) && PatchProxy.applyVoidTwoRefs(obj1, Boolean.valueOf(p1), obj, uodownloadPa, "1")) {
          return;
       }
       a.p(obj1, "downloadItem");
       EveServerPackage$PackageItem packageItem = null;
       if (p1) {
          incrementalP = obj.a.$serverPackage.incrementalPack;
          if (incrementalP != null) {
             packageItem = incrementalP.size;
          }
       }else {
          incrementalP = obj.a.$serverPackage.fullPack;
          if (incrementalP != null) {
             packageItem = incrementalP.size;
          }
       }
       a = obj.a;
       long l = System.currentTimeMillis() - a.$start;
       Iterator iterator = a.this$0.v.iterator();
       while (iterator.hasNext()) {
          iterator.next().c(obj.a.$taskId, p1, obj1.d, obj1.g, l, packageItem);
       }
       a uoa = EvePackageManager.b(obj.a.this$0);
       EvePackageManager$downloadPackage$1 $taskId = obj.a.$taskId;
       IPackageDownloader$DownloadItem d = obj1.d;
       IPackageDownloader$DownloadItem g = obj1.g;
       Objects.requireNonNull(uoa);
       a uoa1 = a.class;
       int i = 1;
       if (PatchProxy.isSupport(uoa1)) {
          Object[] objArray = new Object[]{$taskId,Boolean.valueOf(p1),d,g,Long.valueOf(l),Long.valueOf(packageItem)};
          if (PatchProxy.applyVoid(objArray, uoa, uoa1, "2")) {
             b = true;
          label_00cb :
             obj.a.$callback.invoke(Boolean.TRUE);
             obj.a.this$0.w(obj1, b);
             return;
          }
       }
       a.p($taskId, "taskId");
       a.p(d, "version");
       a.p(g, "md5");
       b = true;
       uoa.a($taskId, p1, d, 1, g, l, packageItem, 0, "");
       goto label_00cb ;
    }
}
