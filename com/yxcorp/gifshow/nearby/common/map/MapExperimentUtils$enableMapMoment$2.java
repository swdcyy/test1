package com.yxcorp.gifshow.nearby.common.map.MapExperimentUtils$enableMapMoment$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.SystemUtil;
import xf6.i;
import com.kwai.framework.abtest.f;

public final class MapExperimentUtils$enableMapMoment$2 extends Lambda implements a	// class@002115
{
    public static final MapExperimentUtils$enableMapMoment$2 INSTANCE;

    static {
       MapExperimentUtils$enableMapMoment$2.INSTANCE = new MapExperimentUtils$enableMapMoment$2();
    }
    public void MapExperimentUtils$enableMapMoment$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       String obj = PatchProxy.apply(null, this, MapExperimentUtils$enableMapMoment$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       String str = "newMomentList";
       if (SystemUtil.K()) {
          int i = i.g(str);
          if (i != 1) {
             if (i != 2) {
                b = f.a(str);
             }
          }else {
             obj = "newMapMomentList";
             if (i.g(obj) == 2 || !f.a(obj)) {
                b = true;
             }
          }
       }else {
          b = f.a(str);
       }
       return b;
    }
}
