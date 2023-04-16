package com.yxcorp.gifshow.nearby.common.map.MapExperimentUtils$newMapFeature$2;
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
import com.yxcorp.gifshow.nearby.common.map.MapExperimentUtils;

public final class MapExperimentUtils$newMapFeature$2 extends Lambda implements a	// class@002118
{
    public static final MapExperimentUtils$newMapFeature$2 INSTANCE;

    static {
       MapExperimentUtils$newMapFeature$2.INSTANCE = new MapExperimentUtils$newMapFeature$2();
    }
    public void MapExperimentUtils$newMapFeature$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       MapExperimentUtils obj = PatchProxy.apply(null, this, MapExperimentUtils$newMapFeature$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (SystemUtil.K()) {
          int i = i.g("enableNewMapFeature");
          if (i != 1) {
             if (i != 2) {
                obj = MapExperimentUtils.g;
                if (obj.c() && obj.b()) {
                label_0035 :
                   b = true;
                }
             }
          }else {
             goto label_0035 ;
          }
       }else {
          obj = MapExperimentUtils.g;
          if (obj.c() && obj.b()) {
             goto label_0035 ;
          }
       }
       return b;
    }
}
