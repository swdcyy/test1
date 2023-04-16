package h02.b;
import tkd.b;
import java.util.List;
import android.app.Activity;
import com.kuaishou.live.core.show.ask.model.LiveAskAndChatTabConfig;
import com.kuaishou.live.common.core.component.chat.peers.BaseLiveAskAndChatDialogFragment;
import android.content.Context;
import h02.a;
import dp1.d;
import h02.c;
import lp3.e;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import dp1.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import u71.c;
import com.kuaishou.live.camerahost.view.LiveCameraView;
import u71.a;
import java.lang.String;
import h02.d;
import com.kuaishou.live.core.basic.widget.LiveDialogContainerFragment;

public interface abstract b implements b	// class@002602
{

    List Aa();
    BaseLiveAskAndChatDialogFragment CB(Activity p0,LiveAskAndChatTabConfig p1);
    a CY(Context p0);
    c Ch(d p0);
    MagicEmoji$MagicFace DE(e p0);
    void Fr(e p0);
    d Qo(b p0);
    boolean Sq();
    PresenterV2 U30();
    a Yj(c p0,LiveCameraView p1);
    PresenterV2 cK(String p0,int p1);
    LiveDialogContainerFragment hE(d p0,String p1,boolean p2,d p3);
    int km();
    void ot(Activity p0,String p1);
    void p50(e p0,String p1);
    boolean tZ();
    PresenterV2 xy();
}
