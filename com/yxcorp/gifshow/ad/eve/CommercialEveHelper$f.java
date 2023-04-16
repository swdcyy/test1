package com.yxcorp.gifshow.ad.eve.CommercialEveHelper$f;
import erd.g;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import java.lang.Object;
import java.lang.Number;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.StringBuilder;
import yx.j0;
import tkd.b;
import tkd.d;
import gm9.c;

public final class CommercialEveHelper$f implements g	// class@001767
{
    public final RequestTiming b;

    public void CommercialEveHelper$f(RequestTiming p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       int i = p0.intValue();
       CommercialEveHelper$f uof = CommercialEveHelper$f.class;
       if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), this, uof, "1")) {
          Object[] objArray = new Object[0];
          j0.f("CommercialEveHelper", "invokerColdAndWarmLaunched AdLaunchPredict plugin loaded onLaunched, "+"requestTiming: "+this.b+", launchType: "+i, objArray);
          d.a(0x943d4c1).ri(i);
       }
       return;
    }
}
