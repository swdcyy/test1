package com.kwai.feature.post.api.startup.b;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.kwai.feature.post.api.startup.a;
import ok.x;
import java.lang.Object;
import o46.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rq.a;

public class b extends ConfigAutoParseJsonConsumer	// class@001440
{

    public void b(){
       super(a.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
       }else if(p0 != null && p0.mPhotoUpload != null){
          a.L(p0);
       }
       return;
    }
}
