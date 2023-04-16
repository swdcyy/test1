package com.kwai.video.player.surface.DummySurface$1;
import com.kwai.video.player.surface.DummyThread;
import android.graphics.SurfaceTexture;
import com.kwai.video.player.surface.DummySurface;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;

public final class DummySurface$1 extends DummyThread	// class@000b97
{

    public void DummySurface$1(){
       super();
    }
    public DummySurface newInstance(DummyThread p0,SurfaceTexture p1,boolean p2){
       if (PatchProxy.isSupport(DummySurface$1.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, DummySurface$1.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new DummySurface(p0, p1, p2);
    }
    public Object newInstance(DummyThread p0,SurfaceTexture p1,boolean p2){
       return this.newInstance(p0, p1, p2);
    }
}
