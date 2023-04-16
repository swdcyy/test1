package ij1.c;
import android.widget.CompoundButton$OnCheckedChangeListener;
import com.kuaishou.live.common.core.component.gift.domain.giftguide.view.LiveAudienceSendExplicitGiftConfirmDialog;
import java.lang.Object;
import android.widget.CompoundButton;
import android.widget.CheckBox;

public final class c implements CompoundButton$OnCheckedChangeListener	// class@002903
{
    public final LiveAudienceSendExplicitGiftConfirmDialog b;

    public void c(LiveAudienceSendExplicitGiftConfirmDialog p0){
       this.b = p0;
    }
    public final void onCheckedChanged(CompoundButton p0,boolean p1){
       c tb = this.b;
       tb.w.setChecked(p1);
       tb.A = p1;
    }
}
