package com.yxcorp.gifshow.detail.wolverine.activity.ActivityAnimLevelDispatcher$createDispatcherPipeline$pipeline$4;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.wolverine.activity.ActivityAnimLevelDispatcher;
import java.lang.Object;
import s9a.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.detail.wolverine.FeedWolverinePerformanceHolder;
import l27.g;
import s9a.e;

public final class ActivityAnimLevelDispatcher$createDispatcherPipeline$pipeline$4 extends Lambda implements a	// class@001a8b
{
    public final ActivityAnimLevelDispatcher this$0;

    public void ActivityAnimLevelDispatcher$createDispatcherPipeline$pipeline$4(ActivityAnimLevelDispatcher p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final a invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       ActivityAnimLevelDispatcher$createDispatcherPipeline$pipeline$4 obj = PatchProxy.apply(objArray, this, ActivityAnimLevelDispatcher$createDispatcherPipeline$pipeline$4.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.this$0;
       if (obj.d != null) {
          Objects.requireNonNull(obj);
          Object obj1 = PatchProxy.apply(objArray, obj, ActivityAnimLevelDispatcher.class, "6");
          if (obj1 != patchProxyRe) {
             objArray = obj1;
          }else {
             g og = FeedWolverinePerformanceHolder.c.c();
             if (og != null) {
                objArray = new e(og);
             }
          }
       }
       return objArray;
    }
}
