package com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$showPopupForFriendsList$6;
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

public final class UserListBubble$showPopupForFriendsList$6 extends Lambda implements l	// class@001a39
{
    public final b $createIntimateRelationCallback;

    public void UserListBubble$showPopupForFriendsList$6(b p0){
       this.$createIntimateRelationCallback = p0;
       super(1);
    }
    public final c invoke(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UserListBubble$showPopupForFriendsList$6.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return UserListBubble.d(p0, this.$createIntimateRelationCallback);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
