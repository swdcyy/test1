package com.kwai.component.taskdispatcher.slide.SlideDispatchHelper$sSlideDispatchSmartConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import ih5.z;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o56.c;
import o56.a;
import kotlin.jvm.internal.a;
import xf6.d;
import xf6.l;
import nsd.u;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;

public final class SlideDispatchHelper$sSlideDispatchSmartConfig$2 extends Lambda implements a	// class@000b98
{
    public static final SlideDispatchHelper$sSlideDispatchSmartConfig$2 INSTANCE;

    static {
       SlideDispatchHelper$sSlideDispatchSmartConfig$2.INSTANCE = new SlideDispatchHelper$sSlideDispatchSmartConfig$2();
    }
    public void SlideDispatchHelper$sSlideDispatchSmartConfig$2(){
       super(0);
    }
    public final z invoke(){
       c obj = PatchProxy.apply(null, this, SlideDispatchHelper$sSlideDispatchSmartConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.a();
       a.o(obj, "AppEnv.get\(\)");
       if (obj.c()) {
          if (d.c() == 1) {
             int i = l.e("KEY_DISPATCH_POST_FRAME_REMAIN", 2);
             if (i < 0) {
                i = 0;
             }
             int i1 = l.e("KEY_DISPATCH_POST_FREEZE_FRAME_COUNT_LIMIT", 5);
             int i2 = (i1 <= 0)? 2: i1;
             int i3 = l.e("KEY_DISPATCH_POST_FREEZE_TASK_FLUSH_REMAIN_LIMIT", -1);
             if (i3 > 30) {
                i3 = 30;
             }
             z oz = new z(true, (long)i, i2, (long)i3);
             return i1;
          }else if(!d.c()){
             z oz1 = new z(false, 0, 0, 0, 14, null);
             return obj;
          }
       }
       z oz2 = new z(false, 0, 0, 0, 15, null);
       Object value = a.t().getValue("slide_dispatch_post_config", z.class, v11);
       a.o(value, "SwitchConfigManager.getI¡­chSmartConfig\(\)\n        \)");
       return value;
    }
    public Object invoke(){
       return this.invoke();
    }
}
