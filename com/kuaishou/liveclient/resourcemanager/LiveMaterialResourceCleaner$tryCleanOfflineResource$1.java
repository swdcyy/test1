package com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceCleaner$tryCleanOfflineResource$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceCleaner;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import qrd.l1;
import com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceLocalFileManager;
import csd.b;
import qrd.j0;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Objects;
import java.lang.Boolean;
import com.kuaishou.liveclient.resourcemanager.cache.LiveMaterialResourceInfoRepo;
import com.kuaishou.liveclient.resourcemanager.cache.LiveMaterialResourceInfoRepo$a;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceLocalFileManager$a;
import java.io.File;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.HashSet;
import java.util.ArrayList;
import com.kuaishou.liveclient.resourcemanager.apiservices.model.MaterialDetailInfoItem;
import er3.b;
import qkd.b;
import java.lang.IllegalStateException;

public final class LiveMaterialResourceCleaner$tryCleanOfflineResource$1 extends SuspendLambda implements p	// class@001046
{
    public int label;
    public final LiveMaterialResourceCleaner this$0;

    public void LiveMaterialResourceCleaner$tryCleanOfflineResource$1(LiveMaterialResourceCleaner p0,c p1){
       this.this$0 = p0;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, LiveMaterialResourceCleaner$tryCleanOfflineResource$1.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       a.p(p1, "completion");
       return new LiveMaterialResourceCleaner$tryCleanOfflineResource$1(this.this$0, p1);
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveMaterialResourceCleaner$tryCleanOfflineResource$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       boolean b;
       boolean b1;
       LiveMaterialResourceLocalFileManager liveMaterial = LiveMaterialResourceLocalFileManager.class;
       LiveMaterialResourceCleaner liveMaterial1 = LiveMaterialResourceCleaner.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMaterialResourceCleaner$tryCleanOfflineResource$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b.h();
       if (this.label != null) {
          throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
       }
       j0.n(p0);
       if (this.this$0.b.get()) {
          return l1.a;
       }
       this.this$0.b.set(true);
       p0 = this.this$0;
       Objects.requireNonNull(p0);
       p0 = PatchProxy.apply(null, p0, liveMaterial1, "2");
       if (p0 != PatchProxyResult.class) {
          b = p0.booleanValue();
       }else {
          p0 = LiveMaterialResourceInfoRepo.i.a().b().iterator();
          while (true) {
             if (p0.hasNext()) {
                if (!LiveMaterialResourceLocalFileManager.d.a().a(p0.next()).exists()) {
                   b = false;
                }
             }else {
                b = true;
             }
          }
       }
       if (b) {
          b = this.this$0;
          Objects.requireNonNull(b);
          b = PatchProxy.apply(null, b, liveMaterial1, "3");
          if (b != PatchProxyResult.class) {
          }else {
             b = LiveMaterialResourceLocalFileManager.d.a();
             Objects.requireNonNull(b);
             Set set = PatchProxy.apply(null, b, liveMaterial, "7");
             if (set != PatchProxyResult.class) {
             }else {
                b = b.b;
                if (b != null) {
                   b = b.keySet();
                   if (b != null) {
                   label_00a6 :
                      set = b;
                   }
                }
                b = new HashSet();
                goto label_00a6 ;
             }
             if (LiveMaterialResourceInfoRepo.i.a().b().isEmpty()) {
                b = new ArrayList();
             }else {
                b = new ArrayList();
                Iterator iterator = set.iterator();
                while (iterator.hasNext()) {
                   Object obj2 = iterator.next();
                   Object obj3 = (LiveMaterialResourceInfoRepo.i.a().d(obj2) == null)? 1: null;
                   if (obj3) {
                      b.add(obj2);
                   }else {
                      continue ;
                   }
                }
             }
          }
          b = b.iterator();
          while (b.hasNext()) {
             String str = b.next();
             LiveMaterialResourceLocalFileManager liveMaterial2 = LiveMaterialResourceLocalFileManager.d.a();
             Objects.requireNonNull(liveMaterial2);
             if (PatchProxy.applyVoidOneRefs(str, liveMaterial2, liveMaterial, "5")) {
                continue ;
             }else {
                a.p(str, "resourceId");
                File uFile = liveMaterial2.a(str);
                Object obj1 = PatchProxy.applyOneRefs(uFile, null, b.class, "14");
                if (obj1 != PatchProxyResult.class) {
                   b1 = obj1.booleanValue();
                }else if(!uFile.exists()){
                   b1 = true;
                }else {
                   b.m(uFile);
                   b1 = uFile.delete();
                }
                if (b1) {
                   LiveMaterialResourceLocalFileManager b2 = liveMaterial2.b;
                   if (b2 != null) {
                      str = b2.remove(str);
                   }
                   liveMaterial2.d();
                }else {
                   continue ;
                }
             }
          }
       }
       this.this$0.b.set(false);
       return l1.a;
    }
}
