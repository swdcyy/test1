package com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$showPopupForFollowingList$5;
import msd.l;
import kotlin.jvm.internal.Lambda;
import dcc.b;
import android.view.View;
import dcc.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import dcc.d;
import com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble;

public final class UserListBubble$showPopupForFollowingList$5 extends Lambda implements l	// class@001a2a
{
    public final b $unfollowCallback;

    public void UserListBubble$showPopupForFollowingList$5(b p0){
       this.$unfollowCallback = p0;
       super(1);
    }
    public final c invoke(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UserListBubble$showPopupForFollowingList$5.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return UserListBubble.k(p0, this.$unfollowCallback);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
