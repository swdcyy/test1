package com.yxcorp.gifshow.nearby.common.map.MapExperimentUtils$enableNewMapFeature$2;
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

public final class MapExperimentUtils$enableNewMapFeature$2 extends Lambda implements a	// class@002116
{
    public static final MapExperimentUtils$enableNewMapFeature$2 INSTANCE;

    static {
       MapExperimentUtils$enableNewMapFeature$2.INSTANCE = new MapExperimentUtils$enableNewMapFeature$2();
    }
    public void MapExperimentUtils$enableNewMapFeature$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, MapExperimentUtils$enableNewMapFeature$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (SystemUtil.K()) {
          int i = i.g("enableNewMapFeature");
          if (i != b) {
             b = (i != 2)? f.a("enableNewMapFeature"): false;
          }
       }else {
          b = f.a("enableNewMapFeature");
       }
       return b;
    }
}
