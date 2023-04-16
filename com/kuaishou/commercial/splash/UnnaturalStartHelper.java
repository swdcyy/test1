package com.kuaishou.commercial.splash.UnnaturalStartHelper;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.commercial.splash.UnnaturalStartHelper$UnnaturalStartType;
import yy.u2;
import java.lang.Enum;
import com.kuaishou.commercial.splash.i;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import yx.j0;
import o56.d;
import wkd.b;
import com.yxcorp.gifshow.w;

public final class UnnaturalStartHelper	// class@00159f
{
    public static final int a;
    public static final boolean b;
    public static final UnnaturalStartHelper c;

    static {
       UnnaturalStartHelper.c = new UnnaturalStartHelper();
       UnnaturalStartHelper.a = a.t().a("unnaturalStartAdShield", 0);
       UnnaturalStartHelper.b = a.t().d("disableUnnaturalStartAdShield", 0);
    }
    public void UnnaturalStartHelper(){
       super();
    }
    public final String a(int p0,boolean p1){
       UnnaturalStartHelper$UnnaturalStartType obj;
       String j;
       UnnaturalStartHelper unnaturalSta = UnnaturalStartHelper.class;
       if (PatchProxy.isSupport(unnaturalSta)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, unnaturalSta, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.d(p0);
       String str = "";
       if (obj != null) {
          int i = u2.a[obj.ordinal()];
          if (i != 1 && (i != 2 && i != 3)) {
             if (i == 4) {
                j = (p1)? i.J: i.h;
                a.o(j, "if \(avoid\) SplashAdLogge¡­IL_REASON_THIRD_APP_START");
             }
          }else if(p1){
             j = i.I;
          }else {
             j = i.g;
          }
          a.o(j, "if \(avoid\) SplashAdLogge¡­L_REASON_URL_SCHEME_START");
          str = j;
       }
       this.b("getShieldReason: launchSource "+p0+", startType "+obj+", reason "+str);
       return str;
    }
    public final void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UnnaturalStartHelper.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("UnnaturalStartHelper", p0, objArray);
       return;
    }
    public final boolean c(int p0){
       UnnaturalStartHelper unnaturalSta = UnnaturalStartHelper.class;
       if (PatchProxy.isSupport(unnaturalSta)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, unnaturalSta, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       int a = UnnaturalStartHelper.a;
       boolean b = UnnaturalStartHelper.b;
       this.b("shieldAd: UNNATURAL_START_STRATEGY "+Integer.toBinaryString(a)+", "+"DISABLE_UNNATURAL_START_STRATEGY "+b);
       boolean b1 = false;
       if (b) {
          this.b("DISABLE_UNNATURAL_START_STRATEGY");
          return b1;
       }else {
          UnnaturalStartHelper$UnnaturalStartType unnaturalSta1 = this.d(p0);
          this.b("startType "+unnaturalSta1);
          if (unnaturalSta1 != null) {
             if (unnaturalSta1.getBit() & a) {
                b1 = true;
             }
             UnnaturalStartHelper.c.b("shield ad "+b1);
          }
          return b1;
       }
    }
    public final UnnaturalStartHelper$UnnaturalStartType d(int p0){
       boolean b1;
       UnnaturalStartHelper$UnnaturalStartType uRI_COLD_STA;
       UnnaturalStartHelper unnaturalSta = UnnaturalStartHelper.class;
       if (PatchProxy.isSupport(unnaturalSta)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, unnaturalSta, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       boolean b = d.b;
       if (!b) {
          Object obj1 = b.a(-1343064608);
          a.o(obj1, "Singleton.get\(LaunchTracker::class.java\)");
          if (obj1.a()) {
             b1 = true;
          label_0034 :
             this.b("launchSource "+p0+", isColdStart "+b+", isWarmStart "+b1);
             if (p0 == 4) {
                if (b) {
                   uRI_COLD_STA = UnnaturalStartHelper$UnnaturalStartType.URI_COLD_START;
                }else if(b1){
                   uRI_COLD_STA = UnnaturalStartHelper$UnnaturalStartType.URI_WARM_START;
                }else {
                   uRI_COLD_STA = UnnaturalStartHelper$UnnaturalStartType.URI_HOT_START;
                }
                return uRI_COLD_STA;
             }else if(p0 == 5){
                return UnnaturalStartHelper$UnnaturalStartType.APP_START;
             }else {
                return null;
             }
          }
       }
       b1 = false;
       goto label_0034 ;
    }
}
