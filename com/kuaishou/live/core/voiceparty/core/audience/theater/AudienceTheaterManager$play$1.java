package com.kuaishou.live.core.voiceparty.core.audience.theater.AudienceTheaterManager$play$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.core.audience.theater.AudienceTheaterManager;
import gp2.b;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.TheaterPlayer$State;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import gp2.n;
import java.lang.Enum;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager$a;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager;
import op2.k;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.TheaterPlayerController;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.TheaterPlayer;
import gp2.m;
import java.lang.Integer;
import java.lang.Long;
import op2.g;
import op2.e;
import com.google.gson.JsonObject;
import op2.f;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import com.kuaishou.android.live.log.c$b;
import com.kuaishou.android.live.log.c;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.google.gson.JsonElement;
import k2b.u1;

public final class AudienceTheaterManager$play$1 extends Lambda implements l	// class@0013ce
{
    public final b $audiencePlayLogic;
    public final AudienceTheaterManager this$0;

    public void AudienceTheaterManager$play$1(AudienceTheaterManager p0,b p1){
       this.this$0 = p0;
       this.$audiencePlayLogic = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(TheaterPlayer$State p0){
       long l;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, AudienceTheaterManager$play$1.class, str)) {
          return;
       }
       a.p(p0, "it");
       int i = n.a[p0.ordinal()];
       int i1 = 3;
       Long longx = 2;
       boolean b = true;
       if (i != b) {
          if (i != longx) {
             if (i == i1) {
                this.this$0.d().h(b);
                this.this$0.f().onResume();
             }
          }else {
             this.this$0.d().h(false);
             this.this$0.f().onPause();
          }
       }else {
          AudienceTheaterManager g = this.this$0.g;
          AudienceTheaterManager$play$1 t$audiencePl = this.$audiencePlayLogic;
          b d = t$audiencePl.d;
          b c = t$audiencePl.c;
          Objects.requireNonNull(t$audiencePl);
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          Object[] objArray = null;
          JsonObject obj = PatchProxy.apply(objArray, t$audiencePl, b.class, str);
          if (obj != patchProxyRe) {
             l = obj.longValue();
          }else {
             b b1 = t$audiencePl.b;
             Objects.requireNonNull(b1);
             Object obj1 = PatchProxy.apply(objArray, b1, TheaterPlayerController.class, "22");
             l = (obj1 != patchProxyRe)? obj1.longValue(): b1.l().getDuration();
          }
          long l1 = l;
          Objects.requireNonNull(g);
          if (!PatchProxy.isSupport(m.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(d), Long.valueOf(c), Long.valueOf(l1), g, m.class, "3")) {
             e uoe = g.f().e();
             l1 = l1 - c;
             if (d == longx && l1 - (long)1000 > 0) {
                obj = new JsonObject();
                String str1 = "timeLeftMs";
                obj.a0(str1, Long.valueOf(l1));
                f uof = uoe.a();
                String str2 = "";
                String str3 = (uof != null)? uof.d(): str2;
                obj.c0("episodeName", str3);
                f uof1 = uoe.a();
                if (uof1 != null) {
                   str2 = uof1.f();
                }
                obj.c0("tubeName", str2);
                b.a0(LiveVoicePartyLogTag.THEATER, "theater log voice_party_theater_unfinished_episode", c.j(str1, Long.valueOf(l1)));
                u1.R("voice_party_theater_unfinished_episode", obj.toString(), i1);
             }
          }
       }
    label_0108 :
       return;
    }
}
