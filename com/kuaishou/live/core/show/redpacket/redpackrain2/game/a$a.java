package com.kuaishou.live.core.show.redpacket.redpackrain2.game.a$a;
import com.kuaishou.live.core.show.redpacket.redpackrain2.game.d;
import com.kuaishou.live.core.show.redpacket.redpackrain2.game.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ph2.a;
import com.kuaishou.live.core.show.redpacket.redpackrain2.game.d$a;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import nh2.a;
import com.kuaishou.live.core.show.redpacket.redpackrain2.game.b;
import nh2.a$a;
import com.kuaishou.live.core.show.redpacket.redpackrain2.game.c;
import android.view.View$OnClickListener;
import android.view.View;

public class a$a implements d	// class@000ef8
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "2")) {
          return;
       }
       this.a.S8();
       return;
    }
    public void b(a p0,d$a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$a.class, "1")) {
          return;
       }
       a$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, ta, a.class, "4")) {
          LiveLogTag lIVE_RED_PAC = LiveLogTag.LIVE_RED_PACK_RAIN;
          b.Z(lIVE_RED_PAC, "startRedPackRainGame");
          p1.b();
          if (p0.m == null) {
             b.B(lIVE_RED_PAC, "startRedPackRainGame, mResource is null");
             p1.d();
          }else {
             ta.P8().b(p0, new b(ta, p0));
             ta.t = p1;
             ta.R8(true);
             ta.v.setOnClickListener(new c(ta, p0));
             ta.v.setVisibility(0);
             ta.w = true;
             ta.x = false;
          }
       }
       return;
    }
    public boolean c(){
       return this.a.w;
    }
}
