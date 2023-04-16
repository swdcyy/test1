package d02.d$c;
import hh3.c;
import d02.d;
import java.lang.Object;
import java.lang.String;
import hh3.b;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatInfoUpdate;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.StringBuilder;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatUserCommonInfo;
import java.util.List;
import java.lang.Iterable;
import qk.m;
import d02.d$c$a;
import ok.h;
import com.google.common.collect.ImmutableSet;
import mrd.a;

public final class d$c implements c	// class@001eea
{
    public final d a;

    public void d$c(d p0){
       this.a = p0;
       super();
    }
    public void a(String p0){
       b.b(this, p0);
    }
    public void b(String p0){
       b.a(this, p0);
    }
    public void c(String p0){
       b.c(this, p0);
    }
    public void d(SCInteractiveChatInfoUpdate p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$c.class, "1")) {
          return;
       }
       a.p(p0, "scInteractiveChatInfoUpdate");
       if (p0.userCommonInfos == null) {
          b.B(LiveLogTag.LIVE_MULTI_INTERACT, "userCommonInfos is null!");
          return;
       }else {
          LiveLogTag lIVE_MULTI_I = LiveLogTag.LIVE_MULTI_INTERACT;
          b.Z(lIVE_MULTI_I, "onSignalChatUserInfoUpdate before filter = "+p0);
          b.Z(lIVE_MULTI_I, "onSignalChatUserInfoUpdate localMuteUsers = "+this.a.g);
          Iterator iterator = p0.userCommonInfos.keySet().iterator();
          while (iterator.hasNext()) {
             String str = iterator.next();
             InteractiveChatUserCommonInfo interactiveC = p0.userCommonInfos.get(str);
             if (interactiveC != null && (interactiveC.muteState == null && this.a.g.contains(str))) {
                this.a.g.remove(str);
             }else {
                interactiveC = p0.userCommonInfos.get(str);
                if (interactiveC != null && (interactiveC.muteState == 1 && !this.a.g.contains(str))) {
                   a.o(str, "userId");
                   this.a.g.add(str);
                }
             }
          }
          ImmutableSet immutableSet = m.s(this.a.g).F(d$c$a.b).D();
          b.Z(LiveLogTag.LIVE_MULTI_INTERACT, "onSignalChatUserInfoUpdate = "+immutableSet);
          this.a.e.onNext(immutableSet);
          return;
       }
    }
}
