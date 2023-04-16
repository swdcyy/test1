package com.yxcorp.dynamicfeature.video.VideoPluginApplication$a;
import rg.c$c;
import com.yxcorp.dynamicfeature.video.VideoPluginApplication;
import java.util.Collection;
import java.lang.Object;
import rg.d$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.dynamicfeature.video.VideoPluginApplication$a$a;
import java.lang.Boolean;

public class VideoPluginApplication$a implements c$c	// class@0011ce
{
    public final Collection a;
    public final VideoPluginApplication b;

    public void VideoPluginApplication$a(VideoPluginApplication p0,Collection p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public d$b a(){
       Object obj = PatchProxy.apply(null, this, VideoPluginApplication$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new VideoPluginApplication$a$a(this);
    }
    public boolean enable(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoPluginApplication$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.contains(p0);
    }
}
