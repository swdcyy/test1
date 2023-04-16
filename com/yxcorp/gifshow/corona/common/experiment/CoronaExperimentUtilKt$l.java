package com.yxcorp.gifshow.corona.common.experiment.CoronaExperimentUtilKt$l;
import ok.x;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import xf6.b;
import com.kwai.sdk.switchconfig.a;

public final class CoronaExperimentUtilKt$l implements x	// class@0011dd
{
    public static final CoronaExperimentUtilKt$l b;

    static {
       CoronaExperimentUtilKt$l.b = new CoronaExperimentUtilKt$l();
    }
    public void CoronaExperimentUtilKt$l(){
       super();
    }
    public Object get(){
       Boolean uBoolean = PatchProxy.apply(null, this, CoronaExperimentUtilKt$l.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          String str = "EnableCoronaTvTabPageListPreload";
          int i = b.b(str);
          if (i != 1) {
             uBoolean = (i != 2)? Boolean.valueOf(a.t().d(str, false)): Boolean.TRUE;
          }else {
             uBoolean = Boolean.FALSE;
          }
       }
       return uBoolean;
    }
}
