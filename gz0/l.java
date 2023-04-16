package gz0.l;
import android.content.DialogInterface$OnShowListener;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.LiveAudienceBottomBarGiftAnimationManger;
import java.lang.Object;
import android.content.DialogInterface;

public final class l implements DialogInterface$OnShowListener	// class@0025ce
{
    public final LiveAudienceBottomBarGiftAnimationManger b;

    public void l(LiveAudienceBottomBarGiftAnimationManger p0){
       this.b = p0;
    }
    public final void onShow(DialogInterface p0){
       p0.p = true;
    }
}
