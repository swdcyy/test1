package com.kuaishou.live.core.voiceparty.userlevel.decoration.PrivilegeListDialog$b;
import sx2.b;
import com.kuaishou.live.core.voiceparty.userlevel.decoration.PrivilegeListDialog;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.model.MicSeatLevelInterest;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.viewcontroller.dialog.DialogViewController;

public final class PrivilegeListDialog$b implements b	// class@001a8e
{
    public final PrivilegeListDialog a;

    public void PrivilegeListDialog$b(PrivilegeListDialog p0){
       this.a = p0;
       super();
    }
    public final void a(MicSeatLevelInterest p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrivilegeListDialog$b.class, "1")) {
          return;
       }
       a.p(p0, "it");
       this.a.o.a(p0);
       this.a.V2();
       return;
    }
}
