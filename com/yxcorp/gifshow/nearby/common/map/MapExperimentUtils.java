package com.yxcorp.gifshow.nearby.common.map.MapExperimentUtils;
import com.yxcorp.gifshow.nearby.common.map.MapExperimentUtils$enableMapMoment$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.nearby.common.map.MapExperimentUtils$newMapMomentList$2;
import com.yxcorp.gifshow.nearby.common.map.MapExperimentUtils$enableNewMapFeature$2;
import com.yxcorp.gifshow.nearby.common.map.MapExperimentUtils$newMapFeature$2;
import com.yxcorp.gifshow.nearby.common.map.MapExperimentUtils$autoShowMapFeed$2;
import com.yxcorp.gifshow.nearby.common.map.MapExperimentUtils$localNewProfilePage$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class MapExperimentUtils	// class@00211a
{
    public static final p a;
    public static final p b;
    public static final p c;
    public static final p d;
    public static final p e;
    public static final p f;
    public static final MapExperimentUtils g;

    static {
       MapExperimentUtils.g = new MapExperimentUtils();
       MapExperimentUtils.a = s.c(MapExperimentUtils$enableMapMoment$2.INSTANCE);
       MapExperimentUtils.b = s.c(MapExperimentUtils$newMapMomentList$2.INSTANCE);
       MapExperimentUtils.c = s.c(MapExperimentUtils$enableNewMapFeature$2.INSTANCE);
       MapExperimentUtils.d = s.c(MapExperimentUtils$newMapFeature$2.INSTANCE);
       MapExperimentUtils.e = s.c(MapExperimentUtils$autoShowMapFeed$2.INSTANCE);
       MapExperimentUtils.f = s.c(MapExperimentUtils$localNewProfilePage$2.INSTANCE);
    }
    public void MapExperimentUtils(){
       super();
    }
    public final boolean a(){
       Object obj = PatchProxy.apply(null, this, MapExperimentUtils.class, "5");
       if (obj == PatchProxyResult.class) {
          obj = MapExperimentUtils.e.getValue();
       }
       return obj.booleanValue();
    }
    public final boolean b(){
       Object obj = PatchProxy.apply(null, this, MapExperimentUtils.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = MapExperimentUtils.a.getValue();
       }
       return obj.booleanValue();
    }
    public final boolean c(){
       Object obj = PatchProxy.apply(null, this, MapExperimentUtils.class, "3");
       if (obj == PatchProxyResult.class) {
          obj = MapExperimentUtils.c.getValue();
       }
       return obj.booleanValue();
    }
    public final boolean d(){
       Object obj = PatchProxy.apply(null, this, MapExperimentUtils.class, "6");
       if (obj == PatchProxyResult.class) {
          obj = MapExperimentUtils.f.getValue();
       }
       return obj.booleanValue();
    }
    public final boolean e(){
       Object obj = PatchProxy.apply(null, this, MapExperimentUtils.class, "4");
       if (obj == PatchProxyResult.class) {
          obj = MapExperimentUtils.d.getValue();
       }
       return obj.booleanValue();
    }
    public final boolean f(){
       Object obj = PatchProxy.apply(null, this, MapExperimentUtils.class, "2");
       if (obj == PatchProxyResult.class) {
          obj = MapExperimentUtils.b.getValue();
       }
       return obj.booleanValue();
    }
}
