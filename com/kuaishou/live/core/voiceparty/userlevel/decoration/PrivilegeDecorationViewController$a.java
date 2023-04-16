package com.kuaishou.live.core.voiceparty.userlevel.decoration.PrivilegeDecorationViewController$a;
import sx2.b;
import com.kuaishou.live.core.voiceparty.userlevel.decoration.PrivilegeDecorationViewController;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.model.MicSeatLevelInterest;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.userlevel.decoration.DecorationListDialog;
import com.kuaishou.live.core.voiceparty.userlevel.logger.UserMicSeatLevelLogger;
import com.kuaishou.live.viewcontroller.ViewController;
import msd.a;
import qrd.l1;

public final class PrivilegeDecorationViewController$a implements b	// class@001a88
{
    public final PrivilegeDecorationViewController a;

    public void PrivilegeDecorationViewController$a(PrivilegeDecorationViewController p0){
       this.a = p0;
       super();
    }
    public final void a(MicSeatLevelInterest p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrivilegeDecorationViewController$a.class, "1")) {
          return;
       }
       a.p(p0, "it");
       if (p0.type != 4) {
          PrivilegeDecorationViewController$a ta = this.a;
          ta.z2(new DecorationListDialog(ta.k, p0, ta.n));
       }else {
          PrivilegeDecorationViewController o = this.a.o;
          if (o != null) {
             o.invoke();
          }
       }
       return;
    }
}
