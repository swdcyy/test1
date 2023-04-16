package com.yxcorp.gifshow.ad.eve.CommercialEveHelper$g;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yx.j0;

public final class CommercialEveHelper$g implements g	// class@001769
{
    public static final CommercialEveHelper$g b;

    static {
       CommercialEveHelper$g.b = new CommercialEveHelper$g();
    }
    public void CommercialEveHelper$g(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommercialEveHelper$g.class, "1")) {
       }else {
          j0.b("CommercialEveHelper", "invokerColdAndWarmLaunched AdLaunchPredict plugin load failed ", p0);
       }
       return;
    }
}
