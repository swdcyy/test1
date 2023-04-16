package com.kuaishou.live.core.voiceparty.userlevel.logger.UserMicSeatLevelLogger$logLevelSelfDialogBannerClick$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Integer;
import java.lang.Object;
import yx2.d;
import lnc.i3;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Number;

public final class UserMicSeatLevelLogger$logLevelSelfDialogBannerClick$1 extends Lambda implements p	// class@001abf
{
    public final Integer $levelType;

    public void UserMicSeatLevelLogger$logLevelSelfDialogBannerClick$1(Integer p0){
       this.$levelType = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0, p1);
       return l1.a;
    }
    public final void invoke(d p0,i3 p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, UserMicSeatLevelLogger$logLevelSelfDialogBannerClick$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       a.p(p1, "it");
       p1.c("level_type", this.$levelType);
       return;
    }
}
