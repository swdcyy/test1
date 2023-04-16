package com.yxcorp.gifshow.ad.eve.CommercialEveHelper$a;
import erd.o;
import java.lang.Object;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gm9.c;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import yx.j0;
import tkd.b;
import tkd.d;
import com.yxcorp.gifshow.ad.eve.CommercialEveHelper;
import java.util.Objects;
import qrd.p;

public final class CommercialEveHelper$a implements o	// class@001762
{
    public static final CommercialEveHelper$a b;

    static {
       CommercialEveHelper$a.b = new CommercialEveHelper$a();
    }
    public void CommercialEveHelper$a(){
       super();
    }
    public Object apply(Object p0){
       c uoc = PatchProxy.applyOneRefs(p0, this, CommercialEveHelper$a.class, "1");
       if (uoc != PatchProxyResult.class) {
       }else {
          a.p(p0, "successLoaded");
          Object[] objArray = new Object[0];
          j0.f("CommercialEveHelper", "getPluginImplRx AdLaunchPredict plugin loaded result: "+p0, objArray);
          if (p0.booleanValue()) {
             p0 = d.a(0x943d4c1);
          }else {
             p0 = CommercialEveHelper.b;
             Objects.requireNonNull(p0);
             p0 = PatchProxy.apply(null, p0, CommercialEveHelper.class, "1");
             if (p0 == PatchProxyResult.class) {
                p0 = CommercialEveHelper.a.getValue();
             }
          }
          uoc = p0;
       }
       return uoc;
    }
}
