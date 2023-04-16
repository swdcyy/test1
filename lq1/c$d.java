package lq1.c$d;
import lh3.i0;
import lq1.c;
import java.lang.Object;
import nh3.a;
import lh3.h0;
import java.lang.Throwable;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatClosed;
import com.kuaishou.live.multiinteract.rtc.RtcCloseReason;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatSwitchBiz;
import nh3.c;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatRoomInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatRoomInfo;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatBizIdentity;
import com.kuaishou.protobuf.livestream.nano.LiveMultiLineChatExtraInfo;
import f02.a;
import lq1.d;
import java.util.List;
import com.kuaishou.android.live.log.b;
import lh3.b;
import sz1.e;
import com.kuaishou.protobuf.livestream.nano.SCLiveMultiLineChatOpened;

public final class c$d implements i0	// class@002ffa
{
    public final c a;

    public void c$d(c p0){
       this.a = p0;
       super();
    }
    public void o(a p0){
       h0.e(this, p0);
    }
    public void p(int p0,int p1){
       h0.b(this, p0, p1);
    }
    public void q(int p0,boolean p1,Throwable p2){
       h0.i(this, p0, p1, p2);
    }
    public void r(int p0){
       h0.a(this, p0);
    }
    public void s(SCInteractiveChatClosed p0,RtcCloseReason p1){
       h0.f(this, p0, p1);
    }
    public void t(int p0){
       h0.j(this, p0);
    }
    public void u(SCInteractiveChatSwitchBiz p0){
       h0.h(this, p0);
    }
    public void v(boolean p0,Throwable p1){
       h0.d(this, p0, p1);
    }
    public void w(c p0){
       h0.c(this, p0);
    }
    public void x(SCInteractiveChatRoomInfo p0){
       List a;
       if (PatchProxy.applyVoidOneRefs(p0, this, c$d.class, "1")) {
          return;
       }
       a.p(p0, "scInteractiveChatRoomInfo");
       h0.g(this, p0);
       SCInteractiveChatRoomInfo roomInfo = p0.roomInfo;
       if (roomInfo != null) {
          InteractiveChatRoomInfo bizIdentity = roomInfo.bizIdentity;
          if (bizIdentity != null && bizIdentity.bizType == 2) {
             LiveMultiLineChatExtraInfo liveMultiLin = a.g(p0.extraInfoPb);
             if (liveMultiLin == null) {
                b.r(d.a, "lineChatExtraInfo Ϊnull");
                return;
             }else if(liveMultiLin.multiLineChatOpened == null){
                b uob = this.a.i.gc();
                a.o(uob, "multiInteractManager.liveInteractRtcManager");
                SCLiveMultiLineChatOpened sCLiveMultiL = a.f(liveMultiLin, uob.getBizId());
                liveMultiLin.multiLineChatOpened = sCLiveMultiL;
                a = d.a;
                sCLiveMultiL = (sCLiveMultiL != null)? sCLiveMultiL.multiLineChatId: null;
                b.S(a, "onReceivedRoomInfo, !!! server do not send scLiveOpenMsg!!! , try mock scLivenOpenMsg", "mockedOpenMsg", sCLiveMultiL);
             }
             this.a.b0(liveMultiLin.multiLineChatOpened, "onReceivedRoomInfo");
          }
       }
       return;
    }
}
