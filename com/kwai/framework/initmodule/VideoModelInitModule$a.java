package com.kwai.framework.initmodule.VideoModelInitModule$a;
import com.kwai.video.ksmodelmanager.ModelSDKConfig;
import com.kwai.framework.initmodule.VideoModelInitModule;
import java.lang.Object;
import java.lang.String;
import java.io.File;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import j80.c;

public class VideoModelInitModule$a implements ModelSDKConfig	// class@00157b
{
    public final VideoModelInitModule a;

    public void VideoModelInitModule$a(VideoModelInitModule p0){
       this.a = p0;
       super();
    }
    public File getDirInRoot(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoModelInitModule$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(-1504323719).h(p0);
    }
}
