package com.kwai.feature.post.api.startup.PostPluginPreloadInitModule;
import com.kwai.framework.init.TTIInitModule;
import b76.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.plugin.dva.feature.core.FeatureManager;
import com.kwai.feature.post.api.startup.PostPluginPreloadInitModule$a;
import qi7.a;
import com.kwai.feature.post.api.startup.e;

public class PostPluginPreloadInitModule extends TTIInitModule	// class@00143a
{

    public void PostPluginPreloadInitModule(){
       super();
    }
    public int f0(){
       return 2;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostPluginPreloadInitModule.class, "1")) {
          return;
       }
       FeatureManager.a.g(new PostPluginPreloadInitModule$a(this));
       e.b();
       return;
    }
}
