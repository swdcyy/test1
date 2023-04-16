package com.kuaishou.live.common.core.component.chat.apply.a;
import com.kuaishou.live.common.core.component.chat.LiveAudienceChatService$a;
import fa1.d$a;
import lp3.e;
import xp5.g;
import java.lang.Object;
import com.kuaishou.live.common.core.component.chat.apply.LiveAudienceApplyChatService$State;
import java.util.HashSet;
import crd.a;
import java.util.HashMap;
import com.kuaishou.live.common.core.component.chat.LiveAudienceChatService;
import java.lang.Class;
import lp3.c;
import fa1.d;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rd1.z;
import xd1.e;
import brd.t;
import cjd.e;
import erd.o;
import sd1.d;
import com.gifshow.tuna.player.poi.e;
import erd.g;
import crd.b;
import java.lang.Integer;
import java.lang.Boolean;
import sd1.e;
import com.kuaishou.live.common.core.component.chat.apply.a$a;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Iterator;
import java.util.Set;
import com.kuaishou.live.common.core.component.chat.apply.LiveAudienceApplyChatService$b;
import com.kuaishou.live.common.core.component.chat.LiveAudienceChatService$ChatState;

public class a implements LiveAudienceChatService$a, d$a	// class@001034
{
    public LiveAudienceApplyChatService$State b;
    public final Set c;
    public final g d;
    public final a e;
    public final Map f;
    public final e g;
    public LiveAudienceApplyChatService$a h;

    public void a(e p0,g p1){
       super();
       this.b = LiveAudienceApplyChatService$State.IDLE;
       this.c = new HashSet();
       this.e = new a();
       this.f = new HashMap();
       this.g = p0;
       this.d = p1;
       p0.a(LiveAudienceChatService.class).Jl(this);
       p0.a(d.class).x9(this);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, a.class, "10")) {
          return;
       }
       if (this.b == LiveAudienceApplyChatService$State.APPLYING) {
          this.e.c(e.a().h(this.d.getLiveStreamId()).map(new e()).subscribe(new d(this), e.b));
       }
       return;
    }
    public final void b(int p0,String p1,boolean p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), this, a.class, "6")) {
          return;
       }
       this.e.c(e.a().s(this.d.getLiveStreamId(), String.valueOf(p0)).map(new e()).subscribe(new e(this, p2, p1), new a$a(this)));
       return;
    }
    public final void c(LiveAudienceApplyChatService$State p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "9")) {
          return;
       }
       b.d0(LiveLogTag.CHAT, "switchState", "from", this.b, "to", p0);
       if (this.b != p0) {
          this.b = p0;
          Iterator iterator = this.c.iterator();
          while (iterator.hasNext()) {
             iterator.next().v7(p0, p1);
          }
       }
       return;
    }
    public void f7(LiveAudienceChatService$ChatState p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "8")) {
          return;
       }
       if (p0 == LiveAudienceChatService$ChatState.CONNECTED) {
          this.c(LiveAudienceApplyChatService$State.CHATTING, 0);
       }else if(p0 == LiveAudienceChatService$ChatState.END && this.b == LiveAudienceApplyChatService$State.CHATTING){
          this.c(LiveAudienceApplyChatService$State.IDLE, 0);
       }
       return;
    }
}
