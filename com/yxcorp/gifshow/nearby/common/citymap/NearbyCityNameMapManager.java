package com.yxcorp.gifshow.nearby.common.citymap.NearbyCityNameMapManager;
import com.yxcorp.gifshow.nearby.common.citymap.NearbyCityNameMapManager$mCityNameMapping$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.util.HashMap;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import crd.b;
import frb.e;
import android.content.SharedPreferences;
import wkd.b;
import grb.b;
import brd.t;
import cjd.e;
import erd.o;
import com.yxcorp.gifshow.nearby.common.citymap.NearbyCityNameMapManager$a;
import erd.g;
import t45.d;
import brd.z;
import io.reactivex.internal.functions.Functions;
import com.yxcorp.gifshow.nearby.common.citymap.NearbyCityNameMapManager$b;

public final class NearbyCityNameMapManager	// class@0020e9
{
    public static HashMap a;
    public static final p b;
    public static final NearbyCityNameMapManager c;

    static {
       NearbyCityNameMapManager.c = new NearbyCityNameMapManager();
       NearbyCityNameMapManager.b = s.c(NearbyCityNameMapManager$mCityNameMapping$2.INSTANCE);
    }
    public void NearbyCityNameMapManager(){
       super();
    }
    public static final HashMap a(NearbyCityNameMapManager p0){
       return NearbyCityNameMapManager.a;
    }
    public final String b(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, NearbyCityNameMapManager.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "realCityName");
       obj = NearbyCityNameMapManager.a;
       if (obj != null) {
          String str = obj.get(p0);
          if (str != null) {
             p0 = str;
          }
       }
       return p0;
    }
    public final HashMap c(){
       Object obj = PatchProxy.apply(null, this, NearbyCityNameMapManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return NearbyCityNameMapManager.b.getValue();
    }
    public final b d(){
       String obj = PatchProxy.apply(null, this, NearbyCityNameMapManager.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = e.a.getString("city_map_version", "");
       b uob = b.a(0x7e4245ad).a(obj).map(new e()).doOnNext(new NearbyCityNameMapManager$a(obj)).subscribeOn(d.b).observeOn(d.a).subscribe(Functions.d(), NearbyCityNameMapManager$b.b);
       a.o(uob, "Singleton.get\(CityMappin¡­nctions.ERROR_CONSUMER }\)");
       return uob;
    }
}
