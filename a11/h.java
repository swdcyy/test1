package a11.h;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveAudienceGiftBoxVipGradeBarView;
import java.lang.Object;
import java.lang.CharSequence;

public final class h implements Observer	// class@000021
{
    public final LiveAudienceGiftBoxVipGradeBarView b;

    public void h(LiveAudienceGiftBoxVipGradeBarView p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       this.b.c(p0);
    }
}
