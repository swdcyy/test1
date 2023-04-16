package com.yxcorp.gifshow.detail.wolverine.activity.ActivityAnimLevelDispatcher$createDispatcherPipeline$pipeline$1;
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
import com.yxcorp.gifshow.detail.wolverine.activity.ActivityAnimLevel;
import java.lang.CharSequence;
import android.text.TextUtils;
import s9a.d;

public final class ActivityAnimLevelDispatcher$createDispatcherPipeline$pipeline$1 extends Lambda implements a	// class@001a88
{
    public final ActivityAnimLevelDispatcher this$0;

    public void ActivityAnimLevelDispatcher$createDispatcherPipeline$pipeline$1(ActivityAnimLevelDispatcher p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final a invoke(){
       String str;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       ActivityAnimLevelDispatcher$createDispatcherPipeline$pipeline$1 obj = PatchProxy.apply(objArray, this, ActivityAnimLevelDispatcher$createDispatcherPipeline$pipeline$1.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.this$0;
       ActivityAnimLevelDispatcher b = obj.b;
       Objects.requireNonNull(obj);
       Object[] objArray1 = PatchProxy.applyOneRefs(b, obj, ActivityAnimLevelDispatcher.class, "2");
       if (objArray1 != patchProxyRe) {
       }else if(b != null){
          str = b.get();
       }else {
          str = objArray;
       }
       a a = a.a;
       String str1 = (str != null)? str: "null";
       a.c("wpl_activity_level_local_value", str1);
       ActivityAnimLevel bASELINE = ActivityAnimLevel.BASELINE;
       if (!TextUtils.equals(bASELINE.getKey(), str)) {
          bASELINE = ActivityAnimLevel.DEMOTION;
          if (!TextUtils.equals(bASELINE.getKey(), str)) {
             bASELINE = ActivityAnimLevel.DEFAULT;
             if (!TextUtils.equals(bASELINE.getKey(), str)) {
                bASELINE = objArray;
             }
          }
       }
       if (bASELINE != null) {
          objArray = new d(bASELINE);
       }
       objArray1 = objArray;
       return objArray1;
    }
}
