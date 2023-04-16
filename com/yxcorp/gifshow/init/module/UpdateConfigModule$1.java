package com.yxcorp.gifshow.init.module.UpdateConfigModule$1;
import erd.g;
import com.yxcorp.gifshow.init.module.UpdateConfigModule;
import com.kuaishou.gifshow.platform.network.keyconfig.ResourcePreloadingConfig;
import java.lang.Object;
import doc.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.init.module.UpdateConfigModule$1$1;
import java.lang.Runnable;
import java.util.concurrent.Future;
import t45.c;

public class UpdateConfigModule$1 implements g	// class@0019a8
{
    public final ResourcePreloadingConfig b;
    public final UpdateConfigModule c;

    public void UpdateConfigModule$1(UpdateConfigModule p0,ResourcePreloadingConfig p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, UpdateConfigModule$1.class, "1")) {
       }else {
          c.k(new UpdateConfigModule$1$1(this, p0));
          PatchProxy.onMethodExit(UpdateConfigModule$1.class, "1");
       }
       return;
    }
}
