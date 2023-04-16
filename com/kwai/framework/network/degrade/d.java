package com.kwai.framework.network.degrade.d;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.kwai.framework.network.degrade.c;
import java.lang.String;
import ok.x;
import java.lang.Object;
import com.yxcorp.gifshow.retrofit.degrade.DegradeConfig;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.network.degrade.g;

public class d extends ConfigAutoParseJsonConsumer	// class@0017bb
{

    public void d(){
       super("fallbackable2CdnConfig", c.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
       }else {
          g.i().k(p0);
       }
       return;
    }
}
