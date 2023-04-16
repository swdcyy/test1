package com.kwai.feature.post.api.startup.g;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.kwai.feature.post.api.startup.f;
import ok.x;
import java.lang.Object;
import o46.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rq.a;

public class g extends ConfigAutoParseJsonConsumer	// class@001445
{

    public void g(){
       super(f.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
       }else {
          a.M(p0);
       }
       return;
    }
}
