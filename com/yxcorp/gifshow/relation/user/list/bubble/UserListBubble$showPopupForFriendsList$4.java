package com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$showPopupForFriendsList$4;
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

public final class UserListBubble$showPopupForFriendsList$4 extends Lambda implements l	// class@001a37
{
    public final b $createIntimateRelationHasInviteCallback;

    public void UserListBubble$showPopupForFriendsList$4(b p0){
       this.$createIntimateRelationHasInviteCallback = p0;
       super(1);
    }
    public final c invoke(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UserListBubble$showPopupForFriendsList$4.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return UserListBubble.e(p0, this.$createIntimateRelationHasInviteCallback);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
