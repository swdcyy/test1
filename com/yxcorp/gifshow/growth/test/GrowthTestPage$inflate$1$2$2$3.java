package com.yxcorp.gifshow.growth.test.GrowthTestPage$inflate$1$2$2$3;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.freetraffic.FreeTrafficManager;
import java.util.Objects;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import oe6.g;

public final class GrowthTestPage$inflate$1$2$2$3 extends Lambda implements a	// class@001527
{
    public static final GrowthTestPage$inflate$1$2$2$3 INSTANCE;

    static {
       GrowthTestPage$inflate$1$2$2$3.INSTANCE = new GrowthTestPage$inflate$1$2$2$3();
    }
    public void GrowthTestPage$inflate$1$2$2$3(){
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, GrowthTestPage$inflate$1$2$2$3.class, "1")) {
          return;
       }
       FreeTrafficManager uFreeTraffic = FreeTrafficManager.j();
       Objects.requireNonNull(uFreeTraffic);
       if (!PatchProxy.applyVoid(objArray, uFreeTraffic, FreeTrafficManager.class, "27")) {
          uFreeTraffic.c(uFreeTraffic.e());
          g.a(uFreeTraffic.a.edit().putString("king_active_info_"+uFreeTraffic.e(), ""));
       }
       return;
    }
}
