package com.kuaishou.live.preview.item.presenter.n$g;
import android.view.TextureView$SurfaceTextureListener;
import com.kuaishou.live.preview.item.presenter.n;
import java.lang.Object;
import android.graphics.SurfaceTexture;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.video.waynelive.LivePlayerController;
import com.yxcorp.gifshow.autoplay.live.g;

public class n$g implements TextureView$SurfaceTextureListener	// class@000e37
{
    public final n b;

    public void n$g(n p0){
       this.b = p0;
       super();
    }
    public void onSurfaceTextureAvailable(SurfaceTexture p0,int p1,int p2){
       if (PatchProxy.isSupport(n$g.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, n$g.class, "1")) {
          return;
       }
       n$g tb = this.b;
       tb.y = p0;
       if (tb.r.Q() != null) {
          this.b.r.Q().setExtSurfaceTexture(p0);
       }
       return;
    }
    public boolean onSurfaceTextureDestroyed(SurfaceTexture p0){
       return false;
    }
    public void onSurfaceTextureSizeChanged(SurfaceTexture p0,int p1,int p2){
    }
    public void onSurfaceTextureUpdated(SurfaceTexture p0){
    }
}
