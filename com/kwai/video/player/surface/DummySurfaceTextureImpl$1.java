package com.kwai.video.player.surface.DummySurfaceTextureImpl$1;
import com.kwai.video.player.surface.DummyThread;
import android.graphics.SurfaceTexture;
import com.kwai.video.player.surface.DummySurfaceTextureImpl;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;

public final class DummySurfaceTextureImpl$1 extends DummyThread	// class@000b9a
{

    public void DummySurfaceTextureImpl$1(){
       super();
    }
    public DummySurfaceTextureImpl newInstance(DummyThread p0,SurfaceTexture p1,boolean p2){
       if (PatchProxy.isSupport(DummySurfaceTextureImpl$1.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, DummySurfaceTextureImpl$1.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new DummySurfaceTextureImpl(p0, p1, p2, null);
    }
    public Object newInstance(DummyThread p0,SurfaceTexture p1,boolean p2){
       return this.newInstance(p0, p1, p2);
    }
}
