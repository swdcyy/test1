package com.kuaishou.live.core.voiceparty.userlevel.logger.UserMicSeatLevelLogger$logLevelUpgradePopupShow$1;
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

public final class UserMicSeatLevelLogger$logLevelUpgradePopupShow$1 extends Lambda implements p	// class@001ac2
{
    public final int $levelGrade;
    public final int $levelType;

    public void UserMicSeatLevelLogger$logLevelUpgradePopupShow$1(int p0,int p1){
       this.$levelType = p0;
       this.$levelGrade = p1;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0, p1);
       return l1.a;
    }
    public final void invoke(d p0,i3 p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, UserMicSeatLevelLogger$logLevelUpgradePopupShow$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       a.p(p1, "it");
       p1.c("level_type", Integer.valueOf(this.$levelType));
       p1.c("level_grade", Integer.valueOf(this.$levelGrade));
       return;
    }
}
