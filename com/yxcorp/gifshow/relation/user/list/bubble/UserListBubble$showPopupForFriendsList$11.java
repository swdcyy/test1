package com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$showPopupForFriendsList$11;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.activity.GifshowActivity;
import dcc.b;
import android.view.View;
import dcc.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import dcc.g;

public final class UserListBubble$showPopupForFriendsList$11 extends Lambda implements l	// class@001a2e
{
    public final GifshowActivity $activity;
    public final b $removeUserListCallback;
    public final User $user;

    public void UserListBubble$showPopupForFriendsList$11(User p0,GifshowActivity p1,b p2){
       this.$user = p0;
       this.$activity = p1;
       this.$removeUserListCallback = p2;
       super(1);
    }
    public final c invoke(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UserListBubble$showPopupForFriendsList$11.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return new g(p0, this.$user, this.$activity, this.$removeUserListCallback);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
