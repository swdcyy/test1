package com.kuaishou.commercial.search.qrcode.AdARScanResultDialog$c;
import android.view.TextureView$SurfaceTextureListener;
import com.kuaishou.commercial.search.qrcode.AdARScanResultDialog;
import java.lang.Object;
import android.graphics.SurfaceTexture;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import yx.j0;
import java.util.Objects;
import android.view.Surface;
import com.kwai.framework.player.core.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class AdARScanResultDialog$c implements TextureView$SurfaceTextureListener	// class@00156c
{
    public final AdARScanResultDialog b;

    public void AdARScanResultDialog$c(AdARScanResultDialog p0){
       this.b = p0;
       super();
    }
    public void onSurfaceTextureAvailable(SurfaceTexture p0,int p1,int p2){
       Surface surface;
       if (PatchProxy.isSupport(AdARScanResultDialog$c.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, AdARScanResultDialog$c.class, "1")) {
          return;
       }
       a.p(p0, "surface");
       Object[] objArray = new Object[0];
       j0.f("AdARScanResultDialog", "onSurfaceTextureAvailable", objArray);
       AdARScanResultDialog$c tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(p0, tb, AdARScanResultDialog.class, "6") && p0 != null) {
          AdARScanResultDialog n = tb.n;
          if (n != null) {
             tb.dh();
             surface = new Surface(p0);
             tb.m = surface;
             n.setSurface(surface);
          }
       }
       return;
    }
    public boolean onSurfaceTextureDestroyed(SurfaceTexture p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AdARScanResultDialog$c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "surface");
       Object[] objArray = new Object[0];
       j0.f("AdARScanResultDialog", "onSurfaceTextureDestroyed", objArray);
       this.b.dh();
       return true;
    }
    public void onSurfaceTextureSizeChanged(SurfaceTexture p0,int p1,int p2){
       if (PatchProxy.isSupport(AdARScanResultDialog$c.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, AdARScanResultDialog$c.class, "2")) {
          return;
       }
       a.p(p0, "surface");
       return;
    }
    public void onSurfaceTextureUpdated(SurfaceTexture p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdARScanResultDialog$c.class, "3")) {
          return;
       }
       a.p(p0, "surface");
       return;
    }
}
