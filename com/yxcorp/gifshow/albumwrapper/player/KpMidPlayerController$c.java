package com.yxcorp.gifshow.albumwrapper.player.KpMidPlayerController$c;
import android.view.TextureView$SurfaceTextureListener;
import com.yxcorp.gifshow.albumwrapper.player.KpMidPlayerController;
import java.lang.Object;
import android.graphics.SurfaceTexture;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.video.wayne.player.main.IMediaPlayerApi;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class KpMidPlayerController$c implements TextureView$SurfaceTextureListener	// class@001b74
{
    public final KpMidPlayerController b;

    public void KpMidPlayerController$c(KpMidPlayerController p0){
       this.b = p0;
       super();
    }
    public void onSurfaceTextureAvailable(SurfaceTexture p0,int p1,int p2){
       if (PatchProxy.isSupport(KpMidPlayerController$c.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, KpMidPlayerController$c.class, "1")) {
          return;
       }
       a.p(p0, "surface");
       KpMidPlayerController e = this.b.e;
       if (e != null) {
          e.setSurfaceTexture(p0);
       }
       return;
    }
    public boolean onSurfaceTextureDestroyed(SurfaceTexture p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KpMidPlayerController$c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "surface");
       KpMidPlayerController e = this.b.e;
       if (e != null) {
          e.setSurfaceTexture(null);
       }
       return true;
    }
    public void onSurfaceTextureSizeChanged(SurfaceTexture p0,int p1,int p2){
       if (PatchProxy.isSupport(KpMidPlayerController$c.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, KpMidPlayerController$c.class, "2")) {
          return;
       }
       a.p(p0, "surface");
       return;
    }
    public void onSurfaceTextureUpdated(SurfaceTexture p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KpMidPlayerController$c.class, "4")) {
          return;
       }
       a.p(p0, "surface");
       return;
    }
}
