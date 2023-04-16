package ak1.c;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.gift.domain.slot.manager.LiveGiftSlotAnimManager;
import com.kuaishou.live.common.core.component.gift.domain.slot.view.LiveGiftSlotItemView;
import java.lang.Object;
import java.util.Objects;
import android.widget.TextView;
import com.kuaishou.live.common.core.component.gift.domain.slot.view.LiveGiftSlotBaseView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.RelativeLayout;
import android.view.View;

public final class c implements Runnable	// class@0000be
{
    public final LiveGiftSlotAnimManager b;
    public final LiveGiftSlotItemView c;
    public final int d;

    public void c(LiveGiftSlotAnimManager p0,LiveGiftSlotItemView p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       c tb = this.b;
       c tc = this.c;
       Objects.requireNonNull(tb);
       tb.d(tc, tc.getComboView(), tc.getGiftIconView(), tc.getWidth(), this.d);
    }
}
