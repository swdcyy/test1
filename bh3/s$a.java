package bh3.s$a;
import lh3.i0;
import bh3.s;
import java.lang.Object;
import nh3.a;
import lh3.h0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import oh3.f;
import bh3.s$d;
import bh3.s$c;
import jh3.a;
import java.lang.Throwable;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatClosed;
import com.kuaishou.live.multiinteract.rtc.RtcCloseReason;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatSwitchBiz;
import nh3.c;
import com.kwai.framework.model.user.UserInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Objects;
import kotlin.jvm.internal.a;
import lnc.i3;
import java.lang.Number;
import ih3.b;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatRoomInfo;

public class s$a implements i0	// class@0003cb
{
    public final s a;

    public void s$a(s p0){
       this.a = p0;
       super();
    }
    public void o(a p0){
       h0.e(this, p0);
    }
    public void p(int p0,int p1){
       s d;
       s$a uoa = s$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       this.a.e.a("onEnterRoomFailed");
       s$a ta = this.a;
       s f = ta.f;
       if (f != null) {
          d = ta.d;
          f.d(d.a, d.c, ta.i, 2);
       }
       ta = this.a;
       d = ta.d;
       ta.h.g(d.a, d.c, 2, ta.a());
       return;
    }
    public void q(int p0,boolean p1,Throwable p2){
       h0.i(this, p0, p1, p2);
    }
    public void r(int p0){
       h0.a(this, p0);
    }
    public void s(SCInteractiveChatClosed p0,RtcCloseReason p1){
       s d;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, s$a.class, "2")) {
          return;
       }
       this.a.e.a("onRTCRoomClosed");
       s$a ta = this.a;
       s f = ta.f;
       if (f != null) {
          d = ta.d;
          f.d(d.a, d.c, ta.i, 4);
       }
       ta = this.a;
       d = ta.d;
       ta.h.g(d.a, d.c, 4, ta.a());
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
       if (PatchProxy.applyVoidOneRefs(p0, this, s$a.class, "3")) {
          return;
       }
       this.a.e.a("onEnterRoom");
       if (TextUtils.equals(p0.c().mId, this.a.d.c)) {
          s$a ta = this.a;
          s f = ta.f;
          if (f != null) {
             f.c(ta.d.a, p0.c().mId, this.a.i);
          }
          ta = this.a;
          f = ta.h;
          s$d a = ta.d.a;
          UserInfo mId = p0.c().mId;
          Objects.requireNonNull(f);
          a uoa = a.class;
          if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(a), mId, f, uoa, "2")) {
             a.p(mId, "targetUserId");
             i3 oi3 = i3.f();
             oi3.c("biz", Integer.valueOf(a));
             oi3.d("status", "SUCCESS");
             oi3.d("moduleName", "INVITE");
             oi3.d("userId", mId);
             a.o(oi3, "builder");
             f.a.e(oi3);
          }
       }
       return;
    }
    public void x(SCInteractiveChatRoomInfo p0){
       h0.g(this, p0);
    }
}
