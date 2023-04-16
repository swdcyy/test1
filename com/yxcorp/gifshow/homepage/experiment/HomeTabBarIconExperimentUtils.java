package com.yxcorp.gifshow.homepage.experiment.HomeTabBarIconExperimentUtils;
import com.yxcorp.gifshow.homepage.experiment.HomeTabBarIconExperimentUtils$homeTabIconOptType$2;
import msd.a;
import qrd.p;
import qrd.s;
import xf6.d;
import java.lang.String;
import com.kwai.framework.abtest.f;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;

public final class HomeTabBarIconExperimentUtils	// class@0016bc
{
    public static final p a;
    public static final boolean b;
    public static final HomeTabBarIconExperimentUtils c;

    static {
       HomeTabBarIconExperimentUtils.c = new HomeTabBarIconExperimentUtils();
       HomeTabBarIconExperimentUtils.a = s.c(HomeTabBarIconExperimentUtils$homeTabIconOptType$2.INSTANCE);
       boolean b = true;
       if (d.n() != b && (d.n() || !f.a("enableVisualSimplify2"))) {
          b = false;
       }
       HomeTabBarIconExperimentUtils.b = b;
    }
    public void HomeTabBarIconExperimentUtils(){
       super();
    }
    public static final boolean a(){
       Object obj = PatchProxy.apply(null, null, HomeTabBarIconExperimentUtils.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = HomeTabBarIconExperimentUtils.a.getValue();
       }
       return obj.booleanValue();
    }
    public static final int b(){
       Object obj = PatchProxy.apply(null, null, HomeTabBarIconExperimentUtils.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (HomeTabBarIconExperimentUtils.a())? 0x7f08062a: 0x7f080629;
       return i;
    }
    public static final int c(){
       Object obj = PatchProxy.apply(null, null, HomeTabBarIconExperimentUtils.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (HomeTabBarIconExperimentUtils.b) {
          return 0x7f080aa6;
       }
       int i = (HomeTabBarIconExperimentUtils.a())? 0x7f0819ed: 0x7f0819ec;
       return i;
    }
    public static final int d(boolean p0){
       int i;
       if (HomeTabBarIconExperimentUtils.b) {
          i = (!p0)? 0x7f080a96: 0x7f080a95;
          return i;
       }else if(!p0){
          i = 0x7f080ac3;
       }else {
          i = 0x7f080ac4;
       }
       return i;
    }
    public static final int e(){
       Object obj = PatchProxy.apply(null, null, HomeTabBarIconExperimentUtils.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (HomeTabBarIconExperimentUtils.a())? 0x7f080632: 0x7f080631;
       return i;
    }
}
