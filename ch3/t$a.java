package ch3.t$a;
import lh3.i0;
import ch3.t;
import java.lang.Object;
import nh3.a;
import lh3.h0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import oh3.f;
import ch3.r;
import z1.a;
import oh3.a;
import jh3.a;
import java.lang.Throwable;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatClosed;
import com.kuaishou.live.multiinteract.rtc.RtcCloseReason;
import ch3.s;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatSwitchBiz;
import nh3.c;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.CharSequence;
import android.text.TextUtils;
import ch3.q;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatRoomInfo;

public class t$a implements i0	// class@00055d
{
    public final t a;

    public void t$a(t p0){
       this.a = p0;
       super();
    }
    public void o(a p0){
       h0.e(this, p0);
    }
    public void p(int p0,int p1){
       t$a uoa = t$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       this.a.d.a("onEnterRoomFailed");
       this.a.V(false);
       this.a.Q(new r(this));
       t$a ta = this.a;
       ta.g.i(ta.i, 4);
       this.a.S();
       return;
    }
    public void q(int p0,boolean p1,Throwable p2){
       h0.i(this, p0, p1, p2);
    }
    public void r(int p0){
       h0.a(this, p0);
    }
    public void s(SCInteractiveChatClosed p0,RtcCloseReason p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, t$a.class, "2")) {
          return;
       }
       this.a.d.a("onRTCRoomClosed");
       this.a.V(false);
       this.a.Q(new s(this));
       t$a ta = this.a;
       ta.g.i(ta.i, 5);
       this.a.S();
       return;
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
       if (PatchProxy.applyVoidOneRefs(p0, this, t$a.class, "3")) {
          return;
       }
       if (TextUtils.equals(p0.c().mId, QCurrentUser.me().getId())) {
          this.a.d.a("onMatchSuccess");
          this.a.V(false);
          this.a.Q(new q(this));
          this.a.S();
       }
       return;
    }
    public void x(SCInteractiveChatRoomInfo p0){
       h0.g(this, p0);
    }
}
