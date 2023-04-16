package com.kuaishou.live.core.show.screenrecord.j$a;
import android.view.TextureView$SurfaceTextureListener;
import com.kuaishou.live.core.show.screenrecord.j;
import java.lang.Object;
import android.graphics.SurfaceTexture;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Objects;
import android.view.Surface;
import com.kwai.framework.player.core.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class j$a implements TextureView$SurfaceTextureListener	// class@000fe6
{
    public final j b;

    public void j$a(j p0){
       this.b = p0;
       super();
    }
    public void onSurfaceTextureAvailable(SurfaceTexture p0,int p1,int p2){
       if (PatchProxy.isSupport(j$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, j$a.class, "1")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_SCREEN_RECORD, "onSurfaceTextureAvailable");
       j$a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, j.class, "3") || (p0 != null && tb.u != null)) {
          tb.R8();
          Surface surface = new Surface(p0);
          tb.v = surface;
          tb.u.setSurface(surface);
       }
    label_004a :
       return;
    }
    public boolean onSurfaceTextureDestroyed(SurfaceTexture p0){
       p0 = PatchProxy.applyOneRefs(p0, this, j$a.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       b.Z(LiveLogTag.LIVE_SCREEN_RECORD, "onSurfaceTextureDestroyed");
       this.b.R8();
       return true;
    }
    public void onSurfaceTextureSizeChanged(SurfaceTexture p0,int p1,int p2){
    }
    public void onSurfaceTextureUpdated(SurfaceTexture p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j$a.class, "3")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_SCREEN_RECORD, "onSurfaceTextureUpdated");
       return;
    }
}
