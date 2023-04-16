package com.yxcorp.gifshow.ad.eve.CommercialEveHelper$b;
import erd.g;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import yx.j0;

public final class CommercialEveHelper$b implements g	// class@001763
{
    public static final CommercialEveHelper$b b;

    static {
       CommercialEveHelper$b.b = new CommercialEveHelper$b();
    }
    public void CommercialEveHelper$b(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommercialEveHelper$b.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          j0.f("CommercialEveHelper", "installAdMLPlugin AdLaunchPredict plugin loaded result: "+p0, objArray);
       }
       return;
    }
}
