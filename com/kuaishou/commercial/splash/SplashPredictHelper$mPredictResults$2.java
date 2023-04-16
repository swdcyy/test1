package com.kuaishou.commercial.splash.SplashPredictHelper$mPredictResults$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.SystemClock;
import com.yxcorp.gifshow.ad.eve.CommercialEveHelper;
import brd.t;
import com.kuaishou.commercial.splash.SplashPredictHelper$mPredictResults$2$a;
import erd.o;
import java.lang.Throwable;
import yx.j0;
import java.lang.StringBuilder;
import java.lang.Integer;

public final class SplashPredictHelper$mPredictResults$2 extends Lambda implements a	// class@00158f
{
    public static final SplashPredictHelper$mPredictResults$2 INSTANCE;

    static {
       SplashPredictHelper$mPredictResults$2.INSTANCE = new SplashPredictHelper$mPredictResults$2();
    }
    public void SplashPredictHelper$mPredictResults$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final Map invoke(){
       Object[] objArray = null;
       Map obj = PatchProxy.apply(objArray, this, SplashPredictHelper$mPredictResults$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       long l = SystemClock.elapsedRealtime();
       obj = CommercialEveHelper.b.a().flatMap(SplashPredictHelper$mPredictResults$2$a.b).blockingFirst();
       StringBuilder str = "get predict result time:"+(SystemClock.elapsedRealtime() - l)+"£¬size:";
       if (obj != null) {
          objArray = Integer.valueOf(obj.size());
       }
       Object[] objArray1 = new Object[0];
       j0.f("SplashPredictHelper", str+objArray, objArray1);
       return obj;
    }
}
