package com.kuaishou.live.common.core.component.multipk.game.vc.bangs.LiveMultiPkVoteBangsVC$c;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.widget.cdn.KwaiCDNImageView;
import java.lang.Object;
import lt1.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ub.a;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;

public final class LiveMultiPkVoteBangsVC$c implements Observer	// class@001618
{
    public final KwaiCDNImageView b;

    public void LiveMultiPkVoteBangsVC$c(KwaiCDNImageView p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiPkVoteBangsVC$c.class, "1")) {
       }else {
          KwaiCDNImageView.q0(this.b, p0.a, 0, null, 6, null);
          ViewGroup$LayoutParams layoutParams = this.b.getLayoutParams();
          if (layoutParams != null) {
             layoutParams.width = p0.b;
             this.b.setLayoutParams(layoutParams);
          }
       }
       return;
    }
}
