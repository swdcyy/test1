package com.yxcorp.gifshow.detail.wolverine.activity.ActivityAnimLevelDispatcher;
import s9a.a;
import z1.k;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.yxcorp.gifshow.detail.wolverine.activity.ActivityAnimLevel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import msd.a;
import com.yxcorp.gifshow.detail.wolverine.activity.ActivityAnimLevelDispatcher$createDispatcherPipeline$pipeline$1;
import com.yxcorp.gifshow.detail.wolverine.activity.ActivityAnimLevelDispatcher$createDispatcherPipeline$pipeline$2;
import com.yxcorp.gifshow.detail.wolverine.activity.ActivityAnimLevelDispatcher$createDispatcherPipeline$pipeline$3;
import com.yxcorp.gifshow.detail.wolverine.activity.ActivityAnimLevelDispatcher$createDispatcherPipeline$pipeline$4;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Iterator;
import s9a.d;
import s9a.c;

public final class ActivityAnimLevelDispatcher implements a	// class@001a8c
{
    public final a a;
    public final k b;
    public final k c;
    public final boolean d;
    public final k e;

    public void ActivityAnimLevelDispatcher(k p0,k p1,boolean p2,k p3,int p4,u p5){
       if (p4 & 0x04) {
          p2 = true;
       }
       a.p(p3, "bizSwitchSupplier");
       super();
       this.b = null;
       this.c = null;
       this.d = p2;
       this.e = p3;
       a uoa = this.b();
       this.a = uoa;
       return;
    }
    public ActivityAnimLevel a(){
       Object obj = PatchProxy.apply(null, this, ActivityAnimLevelDispatcher.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.a();
    }
    public final a b(){
       a[] obj = PatchProxy.apply(null, this, ActivityAnimLevelDispatcher.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a[]{new ActivityAnimLevelDispatcher$createDispatcherPipeline$pipeline$1(this),new ActivityAnimLevelDispatcher$createDispatcherPipeline$pipeline$2(this),new ActivityAnimLevelDispatcher$createDispatcherPipeline$pipeline$3(this),new ActivityAnimLevelDispatcher$createDispatcherPipeline$pipeline$4(this)};
       Iterator iterator = CollectionsKt__CollectionsKt.L(obj).iterator();
       while (true) {
          if (iterator.hasNext()) {
             a uoa = iterator.next().invoke();
             if (uoa != null) {
                return uoa;
             }
             continue ;
          }else if(this.c != null){
             return new d(ActivityAnimLevel.DEFAULT);
          }else {
             break ;
          }
       }
       return this.c();
    }
    public final a c(){
       Object obj = PatchProxy.apply(null, this, ActivityAnimLevelDispatcher.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c();
    }
}
