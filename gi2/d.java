package gi2.d;
import gi2.f;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import com.kuaishou.live.core.show.redpacket.LiveRedPacketResourcePathConstant;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketInfo;
import hi2.b;
import dx1.b;
import p91.m;
import java.lang.String;

public interface abstract d implements f	// class@002b27
{

    void H7(KwaiImageView p0,TextView p1,LiveRedPacketResourcePathConstant p2);
    void N4(KwaiImageView p0,KwaiImageView p1);
    b W0(LiveConditionRedPacketInfo p0);
    b getRedPacketSimpleExtra();
    LiveConditionRedPacketInfo n6();
    void y2(LiveConditionRedPacketInfo p0,m p1,String p2);
}
