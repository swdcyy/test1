package com.kuaishou.commercial.splash.SplashPredictHelper;
import com.kuaishou.commercial.splash.SplashPredictHelper$a;
import nsd.u;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kuaishou.commercial.splash.SplashPredictHelper$mPredictResults$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Boolean;
import com.yxcorp.gifshow.util.DateUtils;
import yx.j0;
import java.util.Collection;
import java.lang.StringBuilder;
import java.util.Iterator;
import vl9.a;
import p49.f;
import p49.c;
import java.util.Objects;
import p49.f$a;
import com.kuaishou.commercial.splash.SplashPredictHelper$b;
import p49.a;

public final class SplashPredictHelper	// class@001590
{
    public final p a;
    public final List b;
    public static final boolean c;
    public static final SplashPredictHelper$a d;

    static {
       SplashPredictHelper.d = new SplashPredictHelper$a(null);
       SplashPredictHelper.c = a.t().d("enableIgnoreVerifyPredictResult", false);
    }
    public void SplashPredictHelper(List p0){
       a.p(p0, "mSplashModels");
       super();
       this.b = p0;
       this.a = s.c(SplashPredictHelper$mPredictResults$2.INSTANCE);
    }
    public final Map a(){
       Object obj = PatchProxy.apply(null, this, SplashPredictHelper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public final boolean b(long p0,long p1,int p2){
       Map obj;
       Object[] objArray;
       Object[] objArray1;
       if (PatchProxy.isSupport(SplashPredictHelper.class)) {
          obj = PatchProxy.applyThreeRefs(Long.valueOf(p0), Long.valueOf(p1), Integer.valueOf(p2), this, SplashPredictHelper.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.a();
       int i = (obj == null || obj.isEmpty())? 1: 0;
       if (i) {
          return true;
       }else if(DateUtils.r((((long)(p2 - 1) * 0x5265c00) + p0), p1) > 0){
          objArray = new Object[0];
          j0.f("SplashPredictHelper", "endTime is after maxPredictTime", objArray);
          return true;
       }else {
          i = 0;
          while (i < p2) {
             long l = (long)i * 0x5265c00;
             l = l + p0;
             if (DateUtils.r(l, p1) < 0) {
                objArray = new Object[0];
                j0.f("SplashPredictHelper", "predictTime is after endTime", objArray);
                break ;
             }else {
                String str = DateUtils.j(l, "");
                Map map = this.a();
                a.m(map);
                List list = map.get(str);
                a uoa = (list == null || list.isEmpty())? 1: null;
                if (uoa) {
                   objArray1 = new Object[0];
                   j0.f("SplashPredictHelper", str+",predict result is null", objArray1);
                   return true;
                }else {
                   Iterator str1 = list.iterator();
                   while (true) {
                      if (str1.hasNext()) {
                         a uoa1 = str1.next();
                         if (uoa1.willLaunch != 2) {
                            objArray1 = new Object[0];
                            j0.f("SplashPredictHelper", "willLaunch value is :"+uoa1.willLaunch, objArray1);
                            return true;
                         }
                      }else {
                         i = i + 1;
                      }
                   }
                   return 0;
                }
             }
          }
       }
    }
    public final void c(List p0,boolean p1){
       SplashPredictHelper splashPredic = SplashPredictHelper.class;
       if (PatchProxy.isSupport(splashPredic) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, splashPredic, "6")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("SplashPredictHelper", "filter ad is null: "+p0.isEmpty()+",isFilter:"+p1, objArray);
       if (p0.isEmpty()) {
          return;
       }
       Objects.requireNonNull(c.Z);
       f.a.a(c.S).b(0x3f800000).f(2).h(new SplashPredictHelper$b(this, p1, p0));
       return;
    }
}
