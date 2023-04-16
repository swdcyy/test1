package an3.c;
import androidx.lifecycle.Observer;
import com.kuaishou.live.redpacket.core.ui.view.lottery.preparepage.RedPacketPasswordConditionPopupPrepareRewardAreaView;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.live.redpacket.core.condition.item.lottery.password.RedPacketPasswordConditionPrepareRewardAreaItem;

public final class c implements Observer	// class@0000fd
{
    public final RedPacketPasswordConditionPopupPrepareRewardAreaView b;

    public void c(RedPacketPasswordConditionPopupPrepareRewardAreaView p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       RedPacketPasswordConditionPrepareRewardAreaItem.lambda$bind$1(this.b, p0);
    }
}
