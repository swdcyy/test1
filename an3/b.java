package an3.b;
import androidx.lifecycle.Observer;
import com.kuaishou.live.redpacket.core.ui.view.lottery.preparepage.RedPacketPasswordConditionPopupPrepareRewardAreaView;
import java.lang.Object;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel$State;
import com.kuaishou.live.redpacket.core.condition.item.lottery.password.RedPacketPasswordConditionPrepareRewardAreaItem;

public final class b implements Observer	// class@0000fc
{
    public final RedPacketPasswordConditionPopupPrepareRewardAreaView b;

    public void b(RedPacketPasswordConditionPopupPrepareRewardAreaView p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       RedPacketPasswordConditionPrepareRewardAreaItem.lambda$bind$0(this.b, p0);
    }
}
