package g71.c;
import com.kuaishou.live.jsbridge.AbstractLiveJsChannel;
import g71.c$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.jsbridge.LiveJsSubscribeParams$Params;
import kotlin.jvm.internal.a;
import sz1.e;
import lp3.c;
import lh3.b;
import lh3.i0;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatRoomInfo;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatRoomInfo;
import java.util.ArrayList;
import f71.b;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatUserInfoIdentity;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import com.kwai.framework.model.user.UserInfo;
import f71.b$a;
import java.util.Collection;
import g71.c$a;
import java.util.List;
import fg6.a;
import com.google.gson.Gson;
import lp3.e;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;

public final class c extends AbstractLiveJsChannel	// class@002434
{
    public final i0 h;
    public boolean i;

    public void c(){
       super();
       this.h = new c$b(this);
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       this.p();
       return;
    }
    public void m(String p0,LiveJsSubscribeParams$Params p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "1")) {
          return;
       }
       a.p(p0, "subscribeId");
       super.m(p0, p1);
       if (!PatchProxy.applyVoid(null, this, c.class, "4") && this.i == null) {
          this.i = true;
          this.i(e.class).gc().m(this.h);
       }
       this.o();
       return;
    }
    public void n(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       a.p(p0, "subscribeId");
       super.n(p0);
       this.p();
       return;
    }
    public final void o(){
       if (PatchProxy.applyVoid(null, this, c.class, "6")) {
          return;
       }
       b uob = this.i(e.class).gc();
       a.o(uob, "getService\(LiveMultiInte¡­  .liveInteractRtcManager");
       SCInteractiveChatRoomInfo sCInteractiv = uob.b();
       if (sCInteractiv != null) {
          sCInteractiv = sCInteractiv.roomInfo;
          if (sCInteractiv != null) {
             InteractiveChatRoomInfo userInfo = sCInteractiv.userInfo;
             if (userInfo != null) {
                ArrayList uArrayList = new ArrayList(userInfo.length);
                int len = userInfo.length;
                for (int i = 0; i < len; i = i + 1) {
                   UserInfo userInfo1 = UserInfo.convertFromProto(userInfo[i].userInfo);
                   a.o(userInfo1, "UserInfo.convertFromProto\(it.userInfo\)");
                   uArrayList.add(b.a.a(userInfo1));
                }
                if (uArrayList.isEmpty() ^ 0x01) {
                   this.a(a.a.q(new c$a(uArrayList)));
                }
             }
          }
       }
       return;
    }
    public final void p(){
       if (PatchProxy.applyVoid(null, this, c.class, "5")) {
          return;
       }
       if (this.i != null && !this.j().b()) {
          this.i = false;
          try{
             this.i(e.class).gc().h(this.h);
          }catch(java.lang.Exception e0){
             b.y(LiveLogTag.LIVE_MULTI_INTERACT.appendTag("LiveJsOnlineInteractiveUsers"), "removeObserverIfNeed", e0);
          }
       }
    }
}
