package com.kuaishou.live.core.voiceparty.userlevel.logger.UserMicSeatLevelLogger$logPrivilegeDressCardShow$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import yx2.d;
import lnc.i3;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import java.lang.Number;

public final class UserMicSeatLevelLogger$logPrivilegeDressCardShow$1 extends Lambda implements p	// class@001ac8
{
    public final int $privilegeType;

    public void UserMicSeatLevelLogger$logPrivilegeDressCardShow$1(int p0){
       this.$privilegeType = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0, p1);
       return l1.a;
    }
    public final void invoke(d p0,i3 p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, UserMicSeatLevelLogger$logPrivilegeDressCardShow$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       a.p(p1, "it");
       p1.c("privilege_type", Integer.valueOf(this.$privilegeType));
       return;
    }
}