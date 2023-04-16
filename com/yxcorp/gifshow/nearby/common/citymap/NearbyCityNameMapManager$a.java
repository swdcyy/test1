package com.yxcorp.gifshow.nearby.common.citymap.NearbyCityNameMapManager$a;
import erd.g;
import java.lang.String;
import java.lang.Object;
import grb.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.nearby.common.citymap.NearbyCityNameMapManager;
import java.util.HashMap;
import kotlin.jvm.internal.a;
import frb.e;
import java.util.Map;

public final class NearbyCityNameMapManager$a implements g	// class@0020e6
{
    public final String b;

    public void NearbyCityNameMapManager$a(String p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NearbyCityNameMapManager$a.class, "1")) {
       }else {
          NearbyCityNameMapManager c = NearbyCityNameMapManager.c;
          c.c();
          int i = 1;
          if (a.g(this.b, p0.mVersion) ^ i) {
             e.a(p0.mVersion);
          }
          c mCityNameMap = p0.mCityNameMapping;
          if (mCityNameMap != null && !mCityNameMap.isEmpty()) {
             i = 0;
          }
          if (!i) {
             e.b(p0.mCityNameMapping);
             HashMap hashMap = NearbyCityNameMapManager.a(c);
             if (hashMap != null) {
                hashMap.clear();
             }
             HashMap hashMap1 = NearbyCityNameMapManager.a(c);
             if (hashMap1 != null) {
                hashMap1.putAll(p0.mCityNameMapping);
             }
          }
       }
       return;
    }
}
