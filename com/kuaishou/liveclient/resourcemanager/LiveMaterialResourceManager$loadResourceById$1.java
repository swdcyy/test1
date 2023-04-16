package com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceManager$loadResourceById$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceManager;
import java.lang.String;
import zq3.b;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import com.kuaishou.liveclient.resourcemanager.cache.LiveMaterialResourceInfoRepo;
import com.kuaishou.liveclient.resourcemanager.cache.LiveMaterialResourceInfoRepo$a;
import com.kuaishou.liveclient.resourcemanager.apiservices.model.MaterialDetailInfoItem;
import com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceLocalFileManager;
import com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceLocalFileManager$a;
import java.io.File;
import com.kuaishou.liveclient.resourcemanager.apiservices.model.MaterialDetailExtraInfo;
import hr3.a;
import java.util.Objects;
import java.lang.Boolean;
import gr3.a;
import gr3.a$a;
import java.lang.Throwable;
import com.kuaishou.liveclient.resourcemanager.download.task.LiveMaterialResourceDownloadTask$a;
import dr3.a;
import com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceManager$loadResourceById$1$a;
import java.util.Collection;
import trd.y;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import java.util.List;
import com.kuaishou.liveclient.resourcemanager.download.task.LiveMaterialResourceDownloadTask;
import com.kuaishou.liveclient.resourcemanager.download.LiveMaterialResourceDownloadManager;
import com.kuaishou.liveclient.resourcemanager.download.LiveMaterialResourceDownloadManager$a;

public final class LiveMaterialResourceManager$loadResourceById$1 extends SuspendLambda implements p	// class@001052
{
    public final b $listener;
    public final int $loadSource;
    public final String $resourceId;
    public int label;
    public final LiveMaterialResourceManager this$0;

    public void LiveMaterialResourceManager$loadResourceById$1(LiveMaterialResourceManager p0,String p1,b p2,int p3,c p4){
       this.this$0 = p0;
       this.$resourceId = p1;
       this.$listener = p2;
       this.$loadSource = p3;
       super(2, p4);
    }
    public final c create(Object p0,c p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, LiveMaterialResourceManager$loadResourceById$1.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       a.p(p1, "completion");
       LiveMaterialResourceManager$loadResourceById$1 oloadResourc = new LiveMaterialResourceManager$loadResourceById$1(this.this$0, this.$resourceId, this.$listener, this.$loadSource, p1);
       return "completion";
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveMaterialResourceManager$loadResourceById$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       LiveMaterialResourceLocalFileManager$a obj = PatchProxy.applyOneRefs(p0, this, LiveMaterialResourceManager$loadResourceById$1.class, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = b.h();
       LiveMaterialResourceManager$loadResourceById$1 tlabel = this.label;
       int i = 1;
       if (tlabel != null) {
          if (tlabel == i) {
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          this.label = i;
          p0 = LiveMaterialResourceInfoRepo.i.a().c(this.$resourceId, this);
          if (p0 == obj) {
             return obj;
          }
       }
       obj = LiveMaterialResourceLocalFileManager.d;
       File uFile = obj.a().a(this.$resourceId);
       LiveMaterialResourceManager$loadResourceById$1 tthis$0 = this.this$0;
       MaterialDetailExtraInfo extParams = (p0 != null)? p0.getExtParams(): null;
       a uoa = tthis$0.a(extParams, uFile);
       if (uoa != null) {
          LiveMaterialResourceManager$loadResourceById$1 tthis$01 = this.this$0;
          LiveMaterialResourceManager$loadResourceById$1 t$resourceId = this.$resourceId;
          Objects.requireNonNull(tthis$01);
          String obj1 = PatchProxy.applyTwoRefs(t$resourceId, p0, tthis$01, LiveMaterialResourceManager.class, "12");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else if(p0 != null){
             String str1 = obj.a().c(t$resourceId);
             obj1 = p0.getMd5();
             int i1 = (str1 == null || !str1.length())? 1: 0;
             if (!i1) {
                i1 = (obj1 == null || !obj1.length())? 1: 0;
                if (!i1 && (a.g(obj1, str1) ^ i)) {
                   b = true;
                }
             }
          }
       label_00a2 :
          b = false;
          if (!b) {
             this.this$0.e(this.$listener, uoa);
             a.a.d(this.$resourceId, 0, this.$loadSource);
             return l1.a;
          }
       }
       if (p0 == null) {
          this.this$0.d(this.$listener, "111005", new Throwable("RES_INFO_FETCH_FAILED"));
          return l1.a;
       }else {
          LiveMaterialResourceDownloadTask$a uoa1 = new LiveMaterialResourceDownloadTask$a();
          a[] uoaArray = new a[i];
          uoaArray[0] = new LiveMaterialResourceManager$loadResourceById$1$a(this, p0);
          Object obj2 = PatchProxy.applyOneRefs(uoaArray, uoa1, LiveMaterialResourceDownloadTask$a.class, str);
          if (obj2 != patchProxyRe) {
             uoa1 = obj2;
          }else {
             a.p(uoaArray, "listeners");
             y.s0(uoa1.a, uoaArray);
          }
          uoa1.c(p0.getMd5());
          LiveMaterialResourceDownloadTask$a uoa2 = uoa1.d(this.$resourceId).b(DownloadTask$DownloadTaskType.IMMEDIATE);
          uoa2.e(p0.getResourceUrls());
          p0 = uoa2.a();
          LiveMaterialResourceDownloadManager.d.a().a(p0);
          return l1.a;
       }
    }
}
