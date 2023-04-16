package com.yxcorp.gifshow.relation.shake.ShakeFriendsConfPanel$d;
import x07.b;
import com.yxcorp.gifshow.relation.shake.ShakeFriendsConfPanel;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class ShakeFriendsConfPanel$d extends b	// class@0019d2
{
    public final ShakeFriendsConfPanel c;
    public final GifshowActivity d;
    public final boolean e;

    public void ShakeFriendsConfPanel$d(ShakeFriendsConfPanel p0,GifshowActivity p1,boolean p2,int p3){
       this.c = p0;
       this.d = p1;
       this.e = p2;
       super(p3);
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, ShakeFriendsConfPanel$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "popup");
       a.p(p1, "inflater");
       a.p(p2, "container");
       View view = super.a(p0, p1, p2, p3);
       a.o(view, "super.onCreateView\(popup¡­later, container, bundle\)");
       return this.c.initialShakeFriendPanel(this.d, view, this.e);
    }
}
