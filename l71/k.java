package l71.k;
import lh3.i0;
import asd.c;
import lh3.b;
import l71.j;
import java.lang.String;
import java.lang.Object;
import nh3.a;
import lh3.h0;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import kotlin.Result;
import o63.m;
import o63.m$a;
import zb6.a;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatClosed;
import com.kuaishou.live.multiinteract.rtc.RtcCloseReason;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatSwitchBiz;
import nh3.c;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatRoomInfo;

public final class k implements i0	// class@002e9e
{
    public final c a;
    public final b b;
    public final j c;
    public final int d;
    public final String e;
    public final String f;

    public void k(c p0,b p1,j p2,int p3,String p4,String p5){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       super();
    }
    public void o(a p0){
       h0.e(this, p0);
    }
    public void p(int p0,int p1){
       h0.b(this, p0, p1);
    }
    public void q(int p0,boolean p1,Throwable p2){
       if (PatchProxy.isSupport2(k.class, "1") && PatchProxy.applyVoidThreeRefsWithListener(Integer.valueOf(p0), Boolean.valueOf(p1), p2, this, k.class, "1")) {
          return;
       }
       if (p0 != this.d) {
          PatchProxy.onMethodExit(k.class, "1");
          return;
       }else {
          String str = null;
          if (p1) {
             this.a.resumeWith(Result.constructor-impl(m$a.g(m.g, str, false, 3, str)));
          }else {
             k ta = this.a;
             m$a g = m.g;
             int i = a.b(p2);
             if (p2 != null) {
                str = p2.getMessage();
             }
             ta.resumeWith(Result.constructor-impl(g.a(i, str)));
          }
          this.b.h(this.c.e);
          PatchProxy.onMethodExit(k.class, "1");
          return;
       }
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
       h0.g(this, p0);
    }
}
