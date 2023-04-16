package bn3.a;
import androidx.lifecycle.Observer;
import com.kuaishou.live.redpacket.core.ui.view.lottery.preparepage.RedPacketPopupPrepareSharePolicyAreaView;
import java.lang.Object;
import java.lang.Boolean;

public final class a implements Observer	// class@0003fb
{
    public final RedPacketPopupPrepareSharePolicyAreaView b;

    public void a(RedPacketPopupPrepareSharePolicyAreaView p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       this.b.setRefreshViewVisibility(p0.booleanValue());
    }
}
