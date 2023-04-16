package com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$showPopupForFriendsList$3;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.framework.model.user.User;
import java.lang.Object;
import java.lang.Boolean;

public final class UserListBubble$showPopupForFriendsList$3 extends Lambda implements a	// class@001a36
{
    public final User $user;

    public void UserListBubble$showPopupForFriendsList$3(User p0){
       this.$user = p0;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       return this.$user.mHaveIntimatePropose;
    }
}
