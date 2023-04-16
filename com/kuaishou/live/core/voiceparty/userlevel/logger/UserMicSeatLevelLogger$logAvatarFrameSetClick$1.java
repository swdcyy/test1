package com.kuaishou.live.core.voiceparty.userlevel.logger.UserMicSeatLevelLogger$logAvatarFrameSetClick$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import java.lang.Object;
import yx2.d;
import lnc.i3;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class UserMicSeatLevelLogger$logAvatarFrameSetClick$1 extends Lambda implements p	// class@001abe
{
    public final String $logType;

    public void UserMicSeatLevelLogger$logAvatarFrameSetClick$1(String p0){
       this.$logType = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0, p1);
       return l1.a;
    }
    public final void invoke(d p0,i3 p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, UserMicSeatLevelLogger$logAvatarFrameSetClick$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       a.p(p1, "it");
       p1.d("item_type", this.$logType);
       return;
    }
}
