package com.yxcorp.gifshow.relation.shake.ShakeFriendsConfPanel$b;
import java.lang.Runnable;
import com.facebook.react.bridge.Callback;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import java.util.HashMap;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Map;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.Arguments;

public final class ShakeFriendsConfPanel$b implements Runnable	// class@0019cf
{
    public final Callback b;

    public void ShakeFriendsConfPanel$b(Callback p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, ShakeFriendsConfPanel$b.class, "1")) {
          return;
       }
       QCurrentUser mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       HashMap hashMap = new HashMap();
       hashMap.put("enable_shake", Boolean.valueOf(mE.isShakeFriendEnabled()));
       HashMap hashMap1 = new HashMap();
       hashMap1.put("result", hashMap);
       Object[] objArray = new Object[]{Integer.valueOf(0),Arguments.makeNativeMap(hashMap1)};
       this.b.invoke(objArray);
       return;
    }
}
