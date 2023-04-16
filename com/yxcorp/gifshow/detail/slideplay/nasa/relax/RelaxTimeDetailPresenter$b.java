package com.yxcorp.gifshow.detail.slideplay.nasa.relax.RelaxTimeDetailPresenter$b;
import lnc.q9;
import com.yxcorp.gifshow.detail.slideplay.nasa.relax.RelaxTimeDetailPresenter;
import android.graphics.SurfaceTexture;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import android.view.Surface;
import com.kwai.framework.player.core.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class RelaxTimeDetailPresenter$b extends q9	// class@0017ac
{
    public final RelaxTimeDetailPresenter b;

    public void RelaxTimeDetailPresenter$b(RelaxTimeDetailPresenter p0){
       this.b = p0;
       super();
    }
    public void onSurfaceTextureAvailable(SurfaceTexture p0,int p1,int p2){
       if (PatchProxy.isSupport2(RelaxTimeDetailPresenter$b.class, "1") && PatchProxy.applyVoidThreeRefsWithListener(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, RelaxTimeDetailPresenter$b.class, "1")) {
          return;
       }
       this.b.Y8();
       p1.G = new Surface(p0);
       RelaxTimeDetailPresenter$b tb = this.b;
       RelaxTimeDetailPresenter f = tb.F;
       if (f != null) {
          f.setSurface(tb.G);
       }
       PatchProxy.onMethodExit(RelaxTimeDetailPresenter$b.class, "1");
       return;
    }
    public boolean onSurfaceTextureDestroyed(SurfaceTexture p0){
       p0 = PatchProxy.applyOneRefsWithListener(p0, this, RelaxTimeDetailPresenter$b.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       RelaxTimeDetailPresenter f = this.b.F;
       if (f != null) {
          f.setSurface(null);
       }
       this.b.Y8();
       PatchProxy.onMethodExit(RelaxTimeDetailPresenter$b.class, "2");
       return false;
    }
}
