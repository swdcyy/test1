package com.yxcorp.gifshow.corona.common.experiment.CoronaExperimentUtilKt$d;
import ok.x;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import xf6.b;
import com.kwai.sdk.switchconfig.a;

public final class CoronaExperimentUtilKt$d implements x	// class@0011d3
{
    public static final CoronaExperimentUtilKt$d b;

    static {
       CoronaExperimentUtilKt$d.b = new CoronaExperimentUtilKt$d();
    }
    public void CoronaExperimentUtilKt$d(){
       super();
    }
    public Object get(){
       Integer integer = PatchProxy.apply(null, this, CoronaExperimentUtilKt$d.class, "1");
       if (integer != PatchProxyResult.class) {
       }else {
          String str = "CoronaTvTabPreloadSegCnt";
          int i = b.b(str);
          int i1 = 1;
          if (i != i1) {
             if (i != 2) {
                integer = (i != 3)? Integer.valueOf(a.t().a(str, 0)): Integer.valueOf(2);
             }else {
                integer = Integer.valueOf(i1);
             }
          }else {
             integer = Integer.valueOf(0);
          }
       }
       return integer;
    }
}
