package com.kwai.feature.platform.misc.music.LocalMusicInfoCollectInitModule;
import com.kwai.framework.init.TTIInitModule;
import b76.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import p06.b;
import java.lang.Runnable;
import com.kwai.framework.init.e;

public class LocalMusicInfoCollectInitModule extends TTIInitModule	// class@0012bd
{
    public static final int q;

    public void LocalMusicInfoCollectInitModule(){
       super();
    }
    public int f0(){
       return 12;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalMusicInfoCollectInitModule.class, "1")) {
          return;
       }
       e.g(new b(this), "LocalMusicInfoCollectInitModule");
       return;
    }
}
