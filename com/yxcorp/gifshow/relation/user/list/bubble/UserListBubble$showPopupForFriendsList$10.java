package com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$showPopupForFriendsList$10;
import msd.l;
import kotlin.jvm.internal.Lambda;
import android.view.View;
import dcc.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import dcc.f;

public final class UserListBubble$showPopupForFriendsList$10 extends Lambda implements l	// class@001a2d
{
    public static final UserListBubble$showPopupForFriendsList$10 INSTANCE;

    static {
       UserListBubble$showPopupForFriendsList$10.INSTANCE = new UserListBubble$showPopupForFriendsList$10();
    }
    public void UserListBubble$showPopupForFriendsList$10(){
       super(1);
    }
    public final c invoke(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UserListBubble$showPopupForFriendsList$10.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return new f(p0);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
