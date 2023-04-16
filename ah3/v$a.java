package ah3.v$a;
import lh3.i0;
import ah3.v;
import java.lang.Object;
import nh3.a;
import lh3.h0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import oh3.f;
import ah3.t;
import z1.a;
import oh3.a;
import jh3.a;
import java.lang.Throwable;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatClosed;
import com.kuaishou.live.multiinteract.rtc.RtcCloseReason;
import ah3.u;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatSwitchBiz;
import nh3.c;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.framework.model.user.UserInfo;
import ah3.s;
import java.util.Objects;
import kotlin.jvm.internal.a;
import lnc.i3;
import java.lang.Number;
import ih3.b;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatRoomInfo;

public class v$a implements i0	// class@0000db
{
    public final v a;

    public void v$a(v p0){
       this.a = p0;
       super();
    }
    public void o(a p0){
       h0.e(this, p0);
    }
    public void p(int p0,int p1){
       v$a uoa = v$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "2")) {
          return;
       }
       this.a.d.a("onEnterRoomFailed");
       this.a.T(false);
       this.a.Q(new t(this));
       v$a ta = this.a;
       ta.g.a(ta.h, 2, ta.i);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, v$a.class, "3")) {
          return;
       }
       this.a.T(false);
       this.a.d.a("onRTCRoomClosed");
       this.a.Q(new u(this));
       v$a ta = this.a;
       ta.g.a(ta.h, 5, ta.i);
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
       if (PatchProxy.applyVoidOneRefs(p0, this, v$a.class, "1")) {
          return;
       }
       if ((QCurrentUser.me().getId()).equals(p0.c().mId)) {
          this.a.d.a("onApplySuccess");
          this.a.T(false);
          this.a.Q(new s(this));
          v$a ta = this.a;
          v g = ta.g;
          v h = ta.h;
          v i = ta.i;
          Objects.requireNonNull(g);
          a uoa = a.class;
          if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(h), i, g, uoa, "9")) {
             a.p(i, "targetUserId");
             i3 oi3 = i3.f();
             oi3.c("biz", Integer.valueOf(h));
             oi3.d("status", "SUCCESS");
             oi3.d("moduleName", "APPLY");
             oi3.d("userId", i);
             a.o(oi3, "builder");
             g.a.e(oi3);
          }
          this.a.S();
       }
       return;
    }
    public void x(SCInteractiveChatRoomInfo p0){
       h0.g(this, p0);
    }
}
