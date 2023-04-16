package ij1.a;
import android.view.View$OnClickListener;
import com.kuaishou.live.common.core.component.gift.domain.giftguide.view.LiveAudienceSendExplicitGiftConfirmDialog;
import java.lang.Object;
import android.view.View;
import com.yxcorp.gifshow.models.Gift;
import com.kuaishou.live.common.core.component.gift.domain.giftguide.view.LiveAudienceSendExplicitGiftConfirmDialog$a;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;

public final class a implements View$OnClickListener	// class@002901
{
    public final LiveAudienceSendExplicitGiftConfirmDialog b;

    public void a(LiveAudienceSendExplicitGiftConfirmDialog p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a tb = this.b;
       tb.x.a(tb.J, tb.F, tb.G);
       tb.dismissAllowingStateLoss();
    }
}
