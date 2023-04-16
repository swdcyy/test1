package com.yxcorp.gifshow.detail.wolverine.activity.ActivityAnimLevelDispatcher$createDispatcherPipeline$pipeline$2;
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
import z1.k;
import w27.a;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.wolverine.activity.ActivityAnimLevel;
import java.lang.CharSequence;
import android.text.TextUtils;
import s9a.d;

public final class ActivityAnimLevelDispatcher$createDispatcherPipeline$pipeline$2 extends Lambda implements a	// class@001a89
{
    public final ActivityAnimLevelDispatcher this$0;

    public void ActivityAnimLevelDispatcher$createDispatcherPipeline$pipeline$2(ActivityAnimLevelDispatcher p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final a invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       ActivityAnimLevelDispatcher$createDispatcherPipeline$pipeline$2 obj = PatchProxy.apply(objArray, this, ActivityAnimLevelDispatcher$createDispatcherPipeline$pipeline$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.this$0;
       ActivityAnimLevelDispatcher e = obj.e;
       Objects.requireNonNull(obj);
       Object[] objArray1 = PatchProxy.applyOneRefs(e, obj, ActivityAnimLevelDispatcher.class, "3");
       if (objArray1 != patchProxyRe) {
       }else {
          String str = e.get();
          a.o(str, "switch");
          a.a.c("wpl_activity_level_kswitch_value", str);
          ActivityAnimLevel bASELINE = ActivityAnimLevel.BASELINE;
          if (!TextUtils.equals(bASELINE.getKey(), str)) {
             bASELINE = ActivityAnimLevel.DEMOTION;
             if (!TextUtils.equals(bASELINE.getKey(), str)) {
                bASELINE = ActivityAnimLevel.DEFAULT;
             }
          }
          if (bASELINE != ActivityAnimLevel.DEFAULT) {
             objArray = new d(bASELINE);
          }
          objArray1 = objArray;
       }
       return objArray1;
    }
}
