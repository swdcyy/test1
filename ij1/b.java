package ij1.b;
import android.view.View$OnClickListener;
import com.kuaishou.live.common.core.component.gift.domain.giftguide.view.LiveAudienceSendExplicitGiftConfirmDialog;
import java.lang.Object;
import android.view.View;
import com.kuaishou.live.common.core.component.gift.domain.giftguide.view.LiveAudienceSendExplicitGiftConfirmDialog$b;
import com.yxcorp.gifshow.models.Gift;
import java.lang.String;
import com.kuaishou.live.common.core.component.gift.domain.giftguide.view.LiveAudienceSendExplicitGiftConfirmDialog$a;

public final class b implements View$OnClickListener	// class@002902
{
    public final LiveAudienceSendExplicitGiftConfirmDialog b;

    public void b(LiveAudienceSendExplicitGiftConfirmDialog p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       b tb = this.b;
       LiveAudienceSendExplicitGiftConfirmDialog x = tb.x;
       if (x != null) {
          LiveAudienceSendExplicitGiftConfirmDialog$b uob = new LiveAudienceSendExplicitGiftConfirmDialog$b(tb, tb.J, tb.A, tb.E, tb.F, tb.G, tb.H, tb.I);
          x.b(v9);
       }
       return;
    }
}
