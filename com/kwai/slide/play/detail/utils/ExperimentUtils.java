package com.kwai.slide.play.detail.utils.ExperimentUtils;
import com.kwai.slide.play.detail.utils.ExperimentUtils$nebulaVmPerformanceOpt$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.slide.play.detail.utils.ExperimentUtils$feedDemotionUIOpt$2;
import com.kwai.slide.play.detail.utils.ExperimentUtils$pressControlSpeed$2;
import com.kwai.slide.play.detail.utils.ExperimentUtils$pressControlSpeedRate$2;
import com.kwai.slide.play.detail.utils.ExperimentUtils$enableOptimizeSlidePlayMethod$2;
import xf6.d;
import java.lang.String;
import xf6.l;
import com.kwai.sdk.switchconfig.a;
import as7.a;
import java.lang.StringBuilder;
import java.lang.Object;
import q87.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;

public final class ExperimentUtils	// class@001881
{
    public static final p a;
    public static final p b;
    public static final p c;
    public static final p d;
    public static final p e;
    public static final boolean f;
    public static final int g;
    public static final boolean h;
    public static final boolean i;
    public static final ExperimentUtils j;

    static {
       ExperimentUtils.j = new ExperimentUtils();
       ExperimentUtils.a = s.c(ExperimentUtils$nebulaVmPerformanceOpt$2.INSTANCE);
       ExperimentUtils.b = s.c(ExperimentUtils$feedDemotionUIOpt$2.INSTANCE);
       ExperimentUtils.c = s.c(ExperimentUtils$pressControlSpeed$2.INSTANCE);
       ExperimentUtils.d = s.c(ExperimentUtils$pressControlSpeedRate$2.INSTANCE);
       ExperimentUtils.e = s.c(ExperimentUtils$enableOptimizeSlidePlayMethod$2.INSTANCE);
       int i = 0;
       boolean i1 = l.e("KEY_ENABLE_USER_NAME_MEASURE_OPT", i);
       if (i1 != 1) {
          i1 = (i1 != 2)? a.t().d("enableUserNameMeasureOpt", i): false;
       }else {
          i1 = true;
       }
       Object[] objArray = new Object[i];
       a.C().w("ExperimentUtils", "enable user name measure opt "+i1, objArray);
       ExperimentUtils.f = i1;
       i1 = l.e("KEY_RIGHT_BUTTON_OPT_STYLE", i);
       int i2 = -1;
       if (i1 != i2) {
          if (i1 != 1) {
             i2 = (i1 != 2)? a.t().a("rightGroupUIOptStyle", i2): 2;
          }else {
             i2 = 1;
          }
       }
       ExperimentUtils.g = i2;
       i1 = (i2 == 1 || i2 == 2)? true: false;
       ExperimentUtils.h = i1;
       if (i2 == 2) {
          i = true;
       }
       ExperimentUtils.i = i;
    }
    public void ExperimentUtils(){
       super();
    }
    public static final boolean a(){
       Object obj = PatchProxy.apply(null, null, ExperimentUtils.class, "5");
       if (obj == PatchProxyResult.class) {
          obj = ExperimentUtils.e.getValue();
       }
       return obj.booleanValue();
    }
    public static final boolean b(){
       return ExperimentUtils.f;
    }
    public static final boolean c(){
       Object obj = PatchProxy.apply(null, null, ExperimentUtils.class, "2");
       if (obj == PatchProxyResult.class) {
          obj = ExperimentUtils.b.getValue();
       }
       return obj.booleanValue();
    }
    public static final int d(){
       Object obj = PatchProxy.apply(null, null, ExperimentUtils.class, "3");
       if (obj == PatchProxyResult.class) {
          obj = ExperimentUtils.c.getValue();
       }
       return obj.intValue();
    }
    public static final float e(){
       Object obj = PatchProxy.apply(null, null, ExperimentUtils.class, "4");
       if (obj == PatchProxyResult.class) {
          obj = ExperimentUtils.d.getValue();
       }
       return obj.floatValue();
    }
    public static final boolean f(){
       return ExperimentUtils.h;
    }
}
