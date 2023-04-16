package com.kuaishou.live.core.voiceparty.userlevel.logger.UserMicSeatLevelLogger$logAvatarDecorationCardClick$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.userlevel.logger.AvatarDecorationCardClickType;
import java.lang.Object;
import yx2.d;
import lnc.i3;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Enum;

public final class UserMicSeatLevelLogger$logAvatarDecorationCardClick$1 extends Lambda implements p	// class@001abd
{
    public final AvatarDecorationCardClickType $itemType;

    public void UserMicSeatLevelLogger$logAvatarDecorationCardClick$1(AvatarDecorationCardClickType p0){
       this.$itemType = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0, p1);
       return l1.a;
    }
    public final void invoke(d p0,i3 p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, UserMicSeatLevelLogger$logAvatarDecorationCardClick$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       a.p(p1, "it");
       p1.d("item_type", this.$itemType.name());
       return;
    }
}
