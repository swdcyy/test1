package com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceManager$preloadResource$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import qrd.l1;
import com.kuaishou.liveclient.resourcemanager.preload.policy.PreloadPolicyManager;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import com.kuaishou.liveclient.resourcemanager.cache.LiveMaterialResourceInfoRepo;
import com.kuaishou.liveclient.resourcemanager.cache.LiveMaterialResourceInfoRepo$a;
import com.kuaishou.liveclient.resourcemanager.preload.policy.PreloadPolicyManager$a;
import java.util.Objects;
import java.lang.Boolean;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;
import java.lang.System;
import java.util.List;
import com.kuaishou.liveclient.resourcemanager.preload.policy.PreloadPolicy;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Iterator;
import com.kuaishou.liveclient.resourcemanager.preload.policy.PreloadTimeFrame;
import java.lang.Iterable;
import com.kuaishou.liveclient.resourcemanager.apiservices.model.MaterialBriefGroupInfo;
import com.kuaishou.liveclient.resourcemanager.apiservices.model.MaterialBriefGroupExtraInfo;
import java.lang.Integer;
import kotlin.collections.ArraysKt___ArraysKt;
import com.kuaishou.liveclient.resourcemanager.apiservices.model.MaterialDetailInfoItem;
import com.kuaishou.liveclient.resourcemanager.download.task.LiveMaterialResourceDownloadTask$a;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import com.kuaishou.liveclient.resourcemanager.download.task.LiveMaterialResourceDownloadTask;
import com.kuaishou.liveclient.resourcemanager.download.LiveMaterialResourceDownloadManager;
import com.kuaishou.liveclient.resourcemanager.download.LiveMaterialResourceDownloadManager$a;
import com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceCleaner;
import com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceCleaner$a;

public final class LiveMaterialResourceManager$preloadResource$1 extends SuspendLambda implements p	// class@001053
{
    public final int $preloadScene;
    public int label;

    public void LiveMaterialResourceManager$preloadResource$1(int p0,c p1){
       this.$preloadScene = p0;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, LiveMaterialResourceManager$preloadResource$1.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       a.p(p1, "completion");
       return new LiveMaterialResourceManager$preloadResource$1(this.$preloadScene, p1);
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveMaterialResourceManager$preloadResource$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       boolean b;
       MaterialBriefGroupExtraInfo extraInfo;
       LiveMaterialResourceManager$preloadResource$1 t$preloadSce;
       MaterialDetailInfoItem obj2;
       boolean b1;
       Object[] objArray;
       PreloadPolicyManager preloadPolic = PreloadPolicyManager.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMaterialResourceManager$preloadResource$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.h();
       LiveMaterialResourceManager$preloadResource$1 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          this.label = 1;
          if (LiveMaterialResourceInfoRepo.i.a().a(this) == obj) {
             return obj;
          }
       }
       p0 = PreloadPolicyManager.c.a();
       Objects.requireNonNull(p0);
       MaterialBriefGroupInfo obj1 = PatchProxy.apply(null, p0, preloadPolic, "3");
       if (obj1 != PatchProxyResult.class) {
          b = obj1.booleanValue();
       }else {
          String str = new SimpleDateFormat("HH:mm", Locale.CHINA).format(new Date(System.currentTimeMillis()));
          a.o(str, "format.format\(nowTimeStamp\)");
          p0 = p0.a;
          if (p0 != null) {
             p0 = p0.getPreloadBanedTimeFrame();
             if (p0 != null) {
             label_007d :
                p0 = p0.iterator();
                while (true) {
                   if (p0.hasNext()) {
                      PreloadTimeFrame preloadTimeF = p0.next();
                      String startTime = preloadTimeF.getStartTime();
                      String endTime = preloadTimeF.getEndTime();
                      t$preloadSce = (startTime == null || !startTime.length())? 1: null;
                      if (!t$preloadSce && str.compareTo(startTime) >= 0) {
                         extraInfo = (endTime == null || !endTime.length())? 1: null;
                         if (!extraInfo && str.compareTo(endTime) <= 0) {
                            b = 1;
                         }
                      }
                   }else {
                      b = 0;
                   }
                }
                return l1.a;
             }
          }
          p0 = CollectionsKt__CollectionsKt.E();
          goto label_007d ;
       }
       if (!(b ^ 1)) {
          goto label_00c3 ;
       }else {
          b = LiveMaterialResourceInfoRepo.i.a().c.iterator();
          while (b.hasNext()) {
             obj1 = b.next();
             PreloadPolicyManager preloadPolic1 = PreloadPolicyManager.c.a();
             extraInfo = obj1.getExtraInfo();
             extraInfo = (extraInfo != null)? extraInfo.preloadScenes: null;
             t$preloadSce = this.$preloadScene;
             Objects.requireNonNull(preloadPolic1);
             if (PatchProxy.isSupport(preloadPolic)) {
                obj2 = PatchProxy.applyTwoRefs(extraInfo, Integer.valueOf(t$preloadSce), preloadPolic1, preloadPolic, "4");
                if (obj2 != PatchProxyResult.class) {
                   b1 = obj2.booleanValue();
                }else if(extraInfo != null){
                   b1 = ArraysKt___ArraysKt.P7(extraInfo, Integer.valueOf(t$preloadSce));
                }else {
                   b1 = false;
                }
             }else {
                goto label_010c ;
             }
             extraInfo = obj1.getExtraInfo();
             extraInfo = (extraInfo != null)? extraInfo.skipPreloadLimitWhenLive: null;
             boolean b2 = (extraInfo != null && extraInfo.intValue() == 1)? true: false;
             if (b1) {
                List briefInfoLis = obj1.getBriefInfoList();
                if (briefInfoLis != null) {
                   Iterator iterator = briefInfoLis.iterator();
                   while (iterator.hasNext()) {
                      obj2 = iterator.next();
                      LiveMaterialResourceDownloadTask$a uoa = new LiveMaterialResourceDownloadTask$a().b(DownloadTask$DownloadTaskType.PRE_DOWNLOAD);
                      String materialId = obj2.getMaterialId();
                      if (materialId == null) {
                         materialId = "";
                      }
                      uoa = uoa.d(materialId);
                      uoa.e(obj2.getResourceUrls());
                      uoa.c(obj2.getMd5());
                      uoa.g = obj2.getGroupName();
                      uoa.h = b2;
                      LiveMaterialResourceDownloadManager.d.a().a(uoa.a());
                   }
                }
             }
             LiveMaterialResourceCleaner.d.a().a();
          }
          return l1.a;
       }
    }
}
