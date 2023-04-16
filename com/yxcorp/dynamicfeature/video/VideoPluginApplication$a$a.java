package com.yxcorp.dynamicfeature.video.VideoPluginApplication$a$a;
import rg.a;
import com.yxcorp.dynamicfeature.video.VideoPluginApplication$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.System;

public class VideoPluginApplication$a$a extends a	// class@0011cd
{
    public final VideoPluginApplication$a a;

    public void VideoPluginApplication$a$a(VideoPluginApplication$a p0){
       this.a = p0;
       super();
    }
    public String b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoPluginApplication$a$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return System.mapLibraryName(p0);
    }
    public void d(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoPluginApplication$a$a.class, "2")) {
          return;
       }
       System.load(p0);
       return;
    }
    public void loadLibrary(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoPluginApplication$a$a.class, "1")) {
          return;
       }
       System.loadLibrary(p0);
       return;
    }
}
