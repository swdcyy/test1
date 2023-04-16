package com.kuaishou.live.core.voiceparty.userlevel.decoration.PrivilegeDecorationViewController$b;
import qs2.b;
import com.kuaishou.live.core.voiceparty.userlevel.decoration.PrivilegeDecorationViewController;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.micseats.mode.VoicePartyMicSeatData;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.live.core.voiceparty.userlevel.decoration.PrivilegeListDialog;
import sx2.b;
import com.kuaishou.live.core.voiceparty.userlevel.logger.UserMicSeatLevelLogger;
import com.kuaishou.live.viewcontroller.ViewController;

public final class PrivilegeDecorationViewController$b implements b	// class@001a89
{
    public final PrivilegeDecorationViewController b;

    public void PrivilegeDecorationViewController$b(PrivilegeDecorationViewController p0){
       this.b = p0;
       super();
    }
    public final boolean F1(int p0,VoicePartyMicSeatData p1){
       boolean b;
       PrivilegeDecorationViewController$b uob = PrivilegeDecorationViewController$b.class;
       String str = "1";
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uob, str);
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p1, "<anonymous parameter 1>");
       if (p0 != 32) {
          b = false;
       }else {
          PrivilegeDecorationViewController$b tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(null, tb, PrivilegeDecorationViewController.class, str)) {
             tb.z2(new PrivilegeListDialog(tb.l, tb.j, tb.n));
          }
          b = true;
       }
       return b;
    }
}
