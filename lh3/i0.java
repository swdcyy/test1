package lh3.i0;
import nh3.a;
import java.lang.Throwable;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatClosed;
import com.kuaishou.live.multiinteract.rtc.RtcCloseReason;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatSwitchBiz;
import nh3.c;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatRoomInfo;

public interface abstract i0	// class@0032cf
{

    void o(a p0);
    void p(int p0,int p1);
    void q(int p0,boolean p1,Throwable p2);
    void r(int p0);
    void s(SCInteractiveChatClosed p0,RtcCloseReason p1);
    void t(int p0);
    void u(SCInteractiveChatSwitchBiz p0);
    void v(boolean p0,Throwable p1);
    void w(c p0);
    void x(SCInteractiveChatRoomInfo p0);
}
