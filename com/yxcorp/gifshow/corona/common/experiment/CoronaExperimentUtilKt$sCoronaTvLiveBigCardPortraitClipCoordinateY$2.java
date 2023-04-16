package com.yxcorp.gifshow.corona.common.experiment.CoronaExperimentUtilKt$sCoronaTvLiveBigCardPortraitClipCoordinateY$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Double;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xf6.b;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;

public final class CoronaExperimentUtilKt$sCoronaTvLiveBigCardPortraitClipCoordinateY$2 extends Lambda implements a	// class@0011e0
{
    public static final CoronaExperimentUtilKt$sCoronaTvLiveBigCardPortraitClipCoordinateY$2 INSTANCE;

    static {
       CoronaExperimentUtilKt$sCoronaTvLiveBigCardPortraitClipCoordinateY$2.INSTANCE = new CoronaExperimentUtilKt$sCoronaTvLiveBigCardPortraitClipCoordinateY$2();
    }
    public void CoronaExperimentUtilKt$sCoronaTvLiveBigCardPortraitClipCoordinateY$2(){
       super(0);
    }
    public final Double invoke(){
       String obj = PatchProxy.apply(null, this, CoronaExperimentUtilKt$sCoronaTvLiveBigCardPortraitClipCoordinateY$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "CoronaTvLiveBigCardPortraitClipCoordinateY";
       int i = b.b(obj);
       double d = 0x3fd554c985f06f69;
       if (i == 1) {
          return Double.valueOf(d);
       }
       if (i == 2) {
          return Double.valueOf(0x3fd999999999999a);
       }
       if (i != 3) {
          return a.t().getValue(obj, Double.TYPE, Double.valueOf(d));
       }
       return Double.valueOf(0x3fe0000000000000);
    }
    public Object invoke(){
       return this.invoke();
    }
}
