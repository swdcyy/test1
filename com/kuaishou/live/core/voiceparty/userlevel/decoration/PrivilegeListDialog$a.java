package com.kuaishou.live.core.voiceparty.userlevel.decoration.PrivilegeListDialog$a;
import erd.g;
import com.kuaishou.live.core.voiceparty.userlevel.decoration.PrivilegeListDialog;
import java.lang.Object;
import sx2.m;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import sx2.r;
import kotlin.jvm.internal.a;
import java.util.Objects;

public final class PrivilegeListDialog$a implements g	// class@001a8d
{
    public final PrivilegeListDialog b;

    public void PrivilegeListDialog$a(PrivilegeListDialog p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, PrivilegeListDialog$a.class, "1")) {
       }else {
          r or = this.b.Y2();
          a.o(p0, "intent");
          Objects.requireNonNull(or);
          if (!PatchProxy.applyVoidOneRefs(p0, or, r.class, "2")) {
             a.p(p0, "intent");
             or.v0();
          }
          PatchProxy.onMethodExit(PrivilegeListDialog$a.class, "1");
       }
       return;
    }
}
