package com.kuaishou.merchant.interpretation.presenter.MerchantInterpretationPlayerPresenter$a;
import lnc.q9;
import com.kuaishou.merchant.interpretation.presenter.MerchantInterpretationPlayerPresenter;
import android.graphics.SurfaceTexture;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.view.Surface;
import com.kwai.framework.player.core.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class MerchantInterpretationPlayerPresenter$a extends q9	// class@00184d
{
    public final MerchantInterpretationPlayerPresenter b;

    public void MerchantInterpretationPlayerPresenter$a(MerchantInterpretationPlayerPresenter p0){
       this.b = p0;
       super();
    }
    public void onSurfaceTextureAvailable(SurfaceTexture p0,int p1,int p2){
       if (PatchProxy.isSupport(MerchantInterpretationPlayerPresenter$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, MerchantInterpretationPlayerPresenter$a.class, "1")) {
          return;
       }
       this.b.c9();
       p1.E = new Surface(p0);
       MerchantInterpretationPlayerPresenter$a tb = this.b;
       MerchantInterpretationPlayerPresenter d = tb.D;
       if (d != null) {
          d.setSurface(tb.E);
       }
       return;
    }
    public boolean onSurfaceTextureDestroyed(SurfaceTexture p0){
       p0 = PatchProxy.applyOneRefs(p0, this, MerchantInterpretationPlayerPresenter$a.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       MerchantInterpretationPlayerPresenter d = this.b.D;
       if (d != null) {
          d.setSurface(null);
       }
       this.b.c9();
       return false;
    }
}
