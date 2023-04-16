package com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager$f;
import ut7.c;
import com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager;
import java.lang.String;
import java.lang.Object;
import ut7.h;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import np2.i;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class TeamPkManager$f extends c	// class@001456
{
    public final TeamPkManager f;

    public void TeamPkManager$f(TeamPkManager p0,String p1){
       this.f = p0;
       super(p1);
    }
    public void e(Object p0,h p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TeamPkManager$f.class, "1")) {
       }else {
          a.p(p0, "param");
          a.p(p1, "reason");
          this.f.c.t();
          b.Z(this.f.d(), "TeamPk onEnter idle");
       }
       return;
    }
}
