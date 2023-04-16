package com.kwai.component.uiconfig.homeslideplay.NasaSlidePlayExperimentUtil;
import com.kwai.component.uiconfig.homeslideplay.NasaSlidePlayExperimentUtil$enableHotSlidePlayPreLoad$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.component.uiconfig.homeslideplay.NasaSlidePlayExperimentUtil$enableLocalSlidePlayPreLoad$2;
import com.kwai.component.uiconfig.homeslideplay.NasaSlidePlayExperimentUtil$enableOverAllSlideUpDown$2;
import com.kwai.component.uiconfig.homeslideplay.NasaSlidePlayExperimentUtil$enableUseMilanoContainerFromShare$2;
import com.kwai.component.uiconfig.homeslideplay.NasaSlidePlayExperimentUtil$slideBottomEntryTextSize$2;
import com.kwai.component.uiconfig.homeslideplay.NasaSlidePlayExperimentUtil$enableBubbleDodgeTeenagerDialog$2;
import xf6.d;
import java.lang.String;
import com.kwai.framework.abtest.f;
import com.kwai.sdk.switchconfig.a;
import com.kwai.component.uiconfig.homeslideplay.NasaSlidePlayExperimentUtil$getSummaryElementStyleConfig$2;
import com.kwai.component.uiconfig.homeslideplay.NasaSlidePlayExperimentUtil$enableAvatarLivePlayAsync$2;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;

public final class NasaSlidePlayExperimentUtil	// class@000be8
{
    public static final p a;
    public static final p b;
    public static final p c;
    public static final p d;
    public static final p e;
    public static final p f;
    public static final boolean g;
    public static final boolean h;
    public static final boolean i;
    public static final boolean j;
    public static final boolean k;
    public static final boolean l;
    public static final boolean m;
    public static final boolean n;
    public static final boolean o;
    public static final boolean p;
    public static final p q;
    public static final p r;
    public static final NasaSlidePlayExperimentUtil s;

    static {
       NasaSlidePlayExperimentUtil.s = new NasaSlidePlayExperimentUtil();
       NasaSlidePlayExperimentUtil.a = s.c(NasaSlidePlayExperimentUtil$enableHotSlidePlayPreLoad$2.INSTANCE);
       NasaSlidePlayExperimentUtil.b = s.c(NasaSlidePlayExperimentUtil$enableLocalSlidePlayPreLoad$2.INSTANCE);
       NasaSlidePlayExperimentUtil.c = s.c(NasaSlidePlayExperimentUtil$enableOverAllSlideUpDown$2.INSTANCE);
       NasaSlidePlayExperimentUtil.d = s.c(NasaSlidePlayExperimentUtil$enableUseMilanoContainerFromShare$2.INSTANCE);
       NasaSlidePlayExperimentUtil.e = s.c(NasaSlidePlayExperimentUtil$slideBottomEntryTextSize$2.INSTANCE);
       NasaSlidePlayExperimentUtil.f = s.c(NasaSlidePlayExperimentUtil$enableBubbleDodgeTeenagerDialog$2.INSTANCE);
       boolean b = false;
       boolean b1 = (d.n() == 1 || (!d.n() && f.a("enableNewRecommend")))? true: false;
       NasaSlidePlayExperimentUtil.g = b1;
       b1 = (d.n() == 1 || (!d.n() && f.a("enableVisualSimplify2")))? true: false;
       NasaSlidePlayExperimentUtil.h = b1;
       NasaSlidePlayExperimentUtil.i = b1;
       NasaSlidePlayExperimentUtil.j = b1;
       NasaSlidePlayExperimentUtil.k = b1;
       NasaSlidePlayExperimentUtil.l = a.t().d("enableOptBottomBarBackColor", b);
       b1 = (d.n() == 1 || (!d.n() && f.a("enableCaptionshrinkWidth")))? true: false;
       NasaSlidePlayExperimentUtil.m = b1;
       NasaSlidePlayExperimentUtil.n = b1;
       b1 = (d.n() == 1 || (!d.n() && f.a("enableButtonRemove")))? true: false;
       NasaSlidePlayExperimentUtil.o = b1;
       if (d.n() == 1 || (!d.n() && f.a("enableRemoveBulletchat2"))) {
          b = true;
       }
       NasaSlidePlayExperimentUtil.p = b;
       NasaSlidePlayExperimentUtil.q = s.c(NasaSlidePlayExperimentUtil$getSummaryElementStyleConfig$2.INSTANCE);
       NasaSlidePlayExperimentUtil.r = s.c(NasaSlidePlayExperimentUtil$enableAvatarLivePlayAsync$2.INSTANCE);
    }
    public void NasaSlidePlayExperimentUtil(){
       super();
    }
    public static final boolean a(){
       Object obj = PatchProxy.apply(null, null, NasaSlidePlayExperimentUtil.class, "8");
       if (obj == PatchProxyResult.class) {
          obj = NasaSlidePlayExperimentUtil.r.getValue();
       }
       return obj.booleanValue();
    }
    public static final boolean b(){
       return NasaSlidePlayExperimentUtil.i;
    }
    public static final boolean c(){
       return NasaSlidePlayExperimentUtil.l;
    }
    public static final boolean d(){
       Object obj = PatchProxy.apply(null, null, NasaSlidePlayExperimentUtil.class, "6");
       if (obj == PatchProxyResult.class) {
          obj = NasaSlidePlayExperimentUtil.f.getValue();
       }
       return obj.booleanValue();
    }
    public static final boolean e(){
       return NasaSlidePlayExperimentUtil.k;
    }
    public static final boolean f(){
       return NasaSlidePlayExperimentUtil.m;
    }
    public static final boolean g(){
       Object obj = PatchProxy.apply(null, null, NasaSlidePlayExperimentUtil.class, "3");
       if (obj == PatchProxyResult.class) {
          obj = NasaSlidePlayExperimentUtil.c.getValue();
       }
       return obj.booleanValue();
    }
    public static final boolean h(){
       return NasaSlidePlayExperimentUtil.p;
    }
    public static final boolean i(){
       return NasaSlidePlayExperimentUtil.g;
    }
    public static final boolean j(){
       return NasaSlidePlayExperimentUtil.o;
    }
    public static final boolean k(){
       return NasaSlidePlayExperimentUtil.j;
    }
    public static final int l(){
       Object obj = PatchProxy.apply(null, null, NasaSlidePlayExperimentUtil.class, "7");
       if (obj == PatchProxyResult.class) {
          obj = NasaSlidePlayExperimentUtil.q.getValue();
       }
       return obj.intValue();
    }
    public static final int m(){
       Object obj = PatchProxy.apply(null, null, NasaSlidePlayExperimentUtil.class, "5");
       if (obj == PatchProxyResult.class) {
          obj = NasaSlidePlayExperimentUtil.e.getValue();
       }
       return obj.intValue();
    }
}
