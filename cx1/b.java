package cx1.b;
import lp3.c;
import com.kuaishou.live.common.core.component.redpacket.redpacket.GrabRedPacketMessage;
import com.kuaishou.live.basic.model.QLiveMessage;
import java.lang.String;
import android.app.Activity;
import com.kuaishou.live.core.basic.model.LiveUserStatusResponse;

public interface abstract b implements c	// class@001e9c
{

    void Hb();
    void J9(GrabRedPacketMessage p0);
    boolean Kf();
    void R0(QLiveMessage p0);
    String Sk();
    void V3();
    Activity getActivity();
    LiveUserStatusResponse pg();
}
