package com.yxcorp.gifshow.relation.shake.ShakeFriendsConfPanel$e;
import com.kwai.library.widget.popup.common.PopupInterface$d;
import com.yxcorp.gifshow.relation.shake.ShakeFriendsConfPanel;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.facebook.react.bridge.Callback;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class ShakeFriendsConfPanel$e implements PopupInterface$d	// class@0019d3
{
    public final ShakeFriendsConfPanel a;
    public final GifshowActivity b;
    public final Callback c;

    public void ShakeFriendsConfPanel$e(ShakeFriendsConfPanel p0,GifshowActivity p1,Callback p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void a(c p0,int p1){
       ShakeFriendsConfPanel$e uoe = ShakeFriendsConfPanel$e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoe, "1")) {
          return;
       }
       a.p(p0, "p0");
       this.a.notifyKrnWhenDismiss(this.b, this.c);
       return;
    }
}
