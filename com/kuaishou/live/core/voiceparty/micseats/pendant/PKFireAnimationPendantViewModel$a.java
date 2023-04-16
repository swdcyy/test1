package com.kuaishou.live.core.voiceparty.micseats.pendant.PKFireAnimationPendantViewModel$a;
import tu2.f$f;
import com.kuaishou.live.core.voiceparty.micseats.pendant.PKFireAnimationPendantViewModel;
import java.lang.Object;
import tu2.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.live.core.voiceparty.micseats.core.data.MicSeatTeam;
import kt2.a;
import com.kuaishou.live.mvvm.viewmodel.state.LiveEvent;
import zh3.c;
import yh3.a;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Boolean;

public final class PKFireAnimationPendantViewModel$a implements f$f	// class@001738
{
    public final PKFireAnimationPendantViewModel a;

    public void PKFireAnimationPendantViewModel$a(PKFireAnimationPendantViewModel p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       g.a(this, p0);
    }
    public void b(int p0){
       MicSeatTeam nONE;
       PKFireAnimationPendantViewModel$a uoa = PKFireAnimationPendantViewModel$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       if (p0 != 1) {
          nONE = (p0 != 2)? MicSeatTeam.NONE: MicSeatTeam.BLUE;
       }else {
          nONE = MicSeatTeam.YELLOW;
       }
       if (this.a.g.a() == nONE) {
          PKFireAnimationPendantViewModel$a ta = this.a;
          c uoc = ta.s0(ta.x0());
          UserInfo userInfo = this.a.h.a();
          boolean b = (userInfo != null)? userInfo.isMale(): false;
          uoc.q(Boolean.valueOf(b));
       }
       return;
    }
}
