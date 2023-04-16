package a11.i;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveAudienceGiftBoxVipGradeBarView;
import java.lang.Object;

public final class i implements Observer	// class@000022
{
    public final LiveAudienceGiftBoxVipGradeBarView b;

    public void i(LiveAudienceGiftBoxVipGradeBarView p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       this.b.setScoreProgressColors(p0);
    }
}
