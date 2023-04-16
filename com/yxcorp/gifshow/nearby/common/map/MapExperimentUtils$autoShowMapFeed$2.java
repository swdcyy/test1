package com.yxcorp.gifshow.nearby.common.map.MapExperimentUtils$autoShowMapFeed$2;
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

public final class MapExperimentUtils$autoShowMapFeed$2 extends Lambda implements a	// class@002114
{
    public static final MapExperimentUtils$autoShowMapFeed$2 INSTANCE;

    static {
       MapExperimentUtils$autoShowMapFeed$2.INSTANCE = new MapExperimentUtils$autoShowMapFeed$2();
    }
    public void MapExperimentUtils$autoShowMapFeed$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, MapExperimentUtils$autoShowMapFeed$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (SystemUtil.K()) {
          int i = i.g("autoShowMapFeed");
          if (i != b) {
             b = (i != 2)? f.a("autoShowMapFeed"): false;
          }
       }else {
          b = f.a("autoShowMapFeed");
       }
       return b;
    }
}
