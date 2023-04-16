package com.yxcorp.gifshow.relation.shake.ShakeFriendsConfPanel$c$a;
import erd.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;

public final class ShakeFriendsConfPanel$c$a implements g	// class@0019d0
{
    public final boolean b;

    public void ShakeFriendsConfPanel$c$a(boolean p0){
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShakeFriendsConfPanel$c$a.class, "1")) {
          return;
       }
       QCurrentUser.ME.setShakeFriendEnable(this.b);
       return;
    }
}
