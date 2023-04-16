package com.yxcorp.gifshow.nearby.common.map.MapExperimentUtils$newMapMomentList$2;
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

public final class MapExperimentUtils$newMapMomentList$2 extends Lambda implements a	// class@002119
{
    public static final MapExperimentUtils$newMapMomentList$2 INSTANCE;

    static {
       MapExperimentUtils$newMapMomentList$2.INSTANCE = new MapExperimentUtils$newMapMomentList$2();
    }
    public void MapExperimentUtils$newMapMomentList$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, MapExperimentUtils$newMapMomentList$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (SystemUtil.K()) {
          int i = i.g("newMapMomentList");
          if (i != b) {
             b = (i != 2)? f.a("newMapMomentList"): false;
          }
       }else {
          b = f.a("newMapMomentList");
       }
       return b;
    }
}
