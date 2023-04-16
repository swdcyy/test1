package com.yxcorp.gifshow.ad.eve.CommercialEveHelper$c;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yx.j0;

public final class CommercialEveHelper$c implements g	// class@001764
{
    public static final CommercialEveHelper$c b;

    static {
       CommercialEveHelper$c.b = new CommercialEveHelper$c();
    }
    public void CommercialEveHelper$c(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommercialEveHelper$c.class, "1")) {
       }else {
          j0.b("CommercialEveHelper", "installAdMLPlugin AdLaunchPredict plugin load failed ", p0);
       }
       return;
    }
}
