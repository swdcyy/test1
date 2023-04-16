package com.kwai.video.aemonplayer.surface.OesSurfaceImpl$1;
import com.kwai.video.aemonplayer.surface.DummyThread;
import android.graphics.SurfaceTexture;
import com.kwai.video.aemonplayer.surface.OesSurfaceImpl;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;

public final class OesSurfaceImpl$1 extends DummyThread	// class@0019e5
{

    public void OesSurfaceImpl$1(){
       super();
    }
    public OesSurfaceImpl newInstance(DummyThread p0,SurfaceTexture p1,boolean p2){
       if (PatchProxy.isSupport(OesSurfaceImpl$1.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, OesSurfaceImpl$1.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new OesSurfaceImpl(p0, p1, p2, null);
    }
    public Object newInstance(DummyThread p0,SurfaceTexture p1,boolean p2){
       return this.newInstance(p0, p1, p2);
    }
}
