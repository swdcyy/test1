package ez0.k;
import java.lang.Runnable;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.LiveAudienceGiftBoxFragment;
import java.lang.Object;
import android.widget.FrameLayout;

public final class k implements Runnable	// class@002250
{
    public final LiveAudienceGiftBoxFragment b;

    public void k(LiveAudienceGiftBoxFragment p0){
       this.b = p0;
    }
    public final void run(){
       this.b.D.setVisibility(8);
    }
}
