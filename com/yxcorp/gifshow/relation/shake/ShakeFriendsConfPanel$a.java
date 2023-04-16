package com.yxcorp.gifshow.relation.shake.ShakeFriendsConfPanel$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.relation.shake.ShakeFriendsConfPanel;
import com.facebook.react.bridge.Callback;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class ShakeFriendsConfPanel$a implements Runnable	// class@0019ce
{
    public final ShakeFriendsConfPanel b;
    public final Callback c;

    public void ShakeFriendsConfPanel$a(ShakeFriendsConfPanel p0,Callback p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, ShakeFriendsConfPanel$a.class, "1")) {
          return;
       }
       this.b.showSwithcPanel(this.c);
       return;
    }
}
