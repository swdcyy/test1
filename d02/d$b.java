package d02.d$b;
import lh3.i0;
import d02.d;
import java.lang.Object;
import nh3.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import nh3.c;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.framework.model.user.UserInfo;
import je3.o;
import mrd.a;
import lh3.h0;
import java.lang.Throwable;
import java.lang.Integer;
import lh3.b;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatClosed;
import com.kuaishou.live.multiinteract.rtc.RtcCloseReason;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatSwitchBiz;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatSwitchBizExtraInfo;
import hh3.c;
import hh3.d;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatRoomInfo;
import nh3.b;
import com.kuaishou.live.livestage.basic.LayoutConfig;

public final class d$b implements i0	// class@001ee8
{
    public final d a;

    public void d$b(d p0){
       this.a = p0;
       super();
    }
    public void o(a p0){
       Object obj;
       if (PatchProxy.applyVoidOneRefs(p0, this, d$b.class, "4")) {
          return;
       }
       a.p(p0, "interactLeaveInfos");
       List list = p0.b();
       a.o(list, "interactLeaveInfos.leavedUsers");
       Iterator iterator = list.iterator();
       while (true) {
          if (iterator.hasNext()) {
             obj = iterator.next();
             Object obj1 = obj;
             QCurrentUser qCurrentUser = QCurrentUser.me();
             a.o(qCurrentUser, "QCurrentUser.me\(\)");
             a.o(obj1, "interactUser");
             if (!(qCurrentUser.getId()).equals(obj1.c().mId)) {
                continue ;
             }
          }else {
             obj = null;
          }
          if (obj != null) {
             this.a.d.onNext(new o(false));
             break ;
          }
          break ;
       }
       return;
    }
    public void p(int p0,int p1){
       h0.b(this, p0, p1);
    }
    public void q(int p0,boolean p1,Throwable p2){
       h0.i(this, p0, p1, p2);
    }
    public void r(int p0){
       d$b uob = d$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       QCurrentUser qCurrentUser = QCurrentUser.me();
       a.o(qCurrentUser, "QCurrentUser.me\(\)");
       boolean b = this.a.j.a(qCurrentUser.getId());
       b.r(LiveLogTag.LIVE_MULTI_INTERACT.appendTag("LiveSimpleRtcClient"), "onEnterMediaRoom "+p0+", inRoom:"+b);
       this.a.d.onNext(new o(b));
       return;
    }
    public void s(SCInteractiveChatClosed p0,RtcCloseReason p1){
       h0.f(this, p0, p1);
    }
    public void t(int p0){
       h0.j(this, p0);
    }
    public void u(SCInteractiveChatSwitchBiz p0){
       Integer integer;
       if (PatchProxy.applyVoidOneRefs(p0, this, d$b.class, "2")) {
          return;
       }
       b.r(LiveLogTag.LIVE_MULTI_INTERACT.appendTag("LiveSimpleRtcClient"), "LiveSimpleRtcClient onReceivedSwitchBizInfo = "+p0);
       d$b ta = this.a;
       if (p0 != null) {
          p0 = p0.startExtraInfo;
          if (p0 != null) {
             integer = Integer.valueOf(p0.bizType);
          label_0037 :
             a.m(integer);
             ta.b = integer.intValue();
             d$b ta1 = this.a;
             ta1.k.g(ta1.h);
             ta1 = this.a;
             ta1.k.z(ta1.h);
             return;
          }
       }
       integer = null;
       goto label_0037 ;
    }
    public void v(boolean p0,Throwable p1){
       h0.d(this, p0, p1);
    }
    public void w(c p0){
       h0.c(this, p0);
    }
    public void x(SCInteractiveChatRoomInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$b.class, "3")) {
          return;
       }
       a.p(p0, "scInteractiveChatRoomInfo");
       d$b ta = this.a;
       ta.a.onNext(ta.a(this.a.b(p0)));
       return;
    }
}
