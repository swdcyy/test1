package com.kwai.component.taskdispatcher.slide.strategy.opt.SlideVsyncMainSmartScatterStrategy$Companion$displayVsyncPeriod$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import o56.c;
import o56.a;
import kotlin.jvm.internal.a;
import android.app.Application;
import android.view.WindowManager;
import android.view.Display;
import java.lang.NullPointerException;
import java.util.concurrent.TimeUnit;
import com.kwai.component.taskdispatcher.utils.DispatchLogger;
import java.lang.StringBuilder;
import java.lang.Long;

public final class SlideVsyncMainSmartScatterStrategy$Companion$displayVsyncPeriod$2 extends Lambda implements a	// class@000bb0
{
    public static final SlideVsyncMainSmartScatterStrategy$Companion$displayVsyncPeriod$2 INSTANCE;

    static {
       SlideVsyncMainSmartScatterStrategy$Companion$displayVsyncPeriod$2.INSTANCE = new SlideVsyncMainSmartScatterStrategy$Companion$displayVsyncPeriod$2();
    }
    public void SlideVsyncMainSmartScatterStrategy$Companion$displayVsyncPeriod$2(){
       super(0);
    }
    public final long invoke(){
       float f;
       c obj = PatchProxy.apply(null, this, SlideVsyncMainSmartScatterStrategy$Companion$displayVsyncPeriod$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       try{
          obj = a.a();
          a.o(obj, "AppEnv.get\(\)");
          Display systemServic = obj.a().getSystemService("window");
          if (systemServic != null) {
             systemServic = systemServic.getDefaultDisplay();
             a.o(systemServic, "\(AppEnv.get\(\).appContext¡­owManager\).defaultDisplay");
             f = systemServic.getRefreshRate();
          }else {
             throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
          }
       }catch(java.lang.Exception e0){
          f = 60.00f;
       }
       long l = (long)((float)TimeUnit.SECONDS.toNanos(1) / f);
       DispatchLogger.d.E("SmartScatterStrategy", "mDisplayVsyncPeriod  "+(l / (long)0xf4240));
       return l;
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}
