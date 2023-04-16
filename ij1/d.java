package ij1.d;
import ub.a;
import com.kuaishou.live.common.core.component.gift.domain.giftguide.view.LiveAudienceSendExplicitGiftConfirmDialog;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import bd.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;

public class d extends a	// class@002904
{
    public final KwaiImageView b;
    public final LiveAudienceSendExplicitGiftConfirmDialog c;

    public void d(LiveAudienceSendExplicitGiftConfirmDialog p0,KwaiImageView p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, d.class, "1")) {
       }else {
          int k = LiveAudienceSendExplicitGiftConfirmDialog.K;
          if (p1 != null) {
             k = a1.e((float)(int)(((double)p1.getWidth() * 15.00f) / (double)p1.getHeight()));
          }
          p1 = this.b;
          d uod = d.class;
          if (PatchProxy.isSupport(uod) && (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(k), p1, this, uod, "2") && k != p1.getLayoutParams().width)) {
             uod.width = k;
             p1.requestLayout();
          }
       }
       return;
    }
}
