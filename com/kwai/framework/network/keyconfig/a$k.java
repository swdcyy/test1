package com.kwai.framework.network.keyconfig.a$k;
import erd.g;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.network.degrade.g;
import ob6.h;
import com.kuaishou.gifshow.platform.network.keyconfig.FeatureConfig;
import com.yxcorp.gifshow.retrofit.degrade.DegradeConfig;

public final class a$k implements g	// class@0017ea
{
    public static final a$k b;

    static {
       a$k.b = new a$k();
    }
    public void a$k(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$k.class, "1")) {
       }else {
          g og = g.i();
          p0 = p0.a().mFeatureConfig;
          p0 = (p0 != null)? p0.mDegradeConfig: null;
          og.k(p0);
       }
       return;
    }
}
