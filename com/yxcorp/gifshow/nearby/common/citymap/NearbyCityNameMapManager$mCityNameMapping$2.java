package com.yxcorp.gifshow.nearby.common.citymap.NearbyCityNameMapManager$mCityNameMapping$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.nearby.common.citymap.NearbyCityNameMapManager;
import frb.f;
import frb.e;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;

public final class NearbyCityNameMapManager$mCityNameMapping$2 extends Lambda implements a	// class@0020e8
{
    public static final NearbyCityNameMapManager$mCityNameMapping$2 INSTANCE;

    static {
       NearbyCityNameMapManager$mCityNameMapping$2.INSTANCE = new NearbyCityNameMapManager$mCityNameMapping$2();
    }
    public void NearbyCityNameMapManager$mCityNameMapping$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final HashMap invoke(){
       Object[] objArray = null;
       NearbyCityNameMapManager obj = PatchProxy.apply(objArray, this, NearbyCityNameMapManager$mCityNameMapping$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = NearbyCityNameMapManager.c;
       Type d = f.d;
       String str = e.a.getString("city_name_map", "");
       if (str != null && str != "") {
          objArray = b.a(str, d);
       }
       if (objArray == null) {
          objArray = new HashMap();
       }
       NearbyCityNameMapManager.a = objArray;
       return NearbyCityNameMapManager.a(obj);
    }
}
