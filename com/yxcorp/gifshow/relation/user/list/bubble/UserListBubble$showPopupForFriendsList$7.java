package com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$showPopupForFriendsList$7;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.framework.model.user.User;
import java.lang.Object;
import java.lang.Boolean;

public final class UserListBubble$showPopupForFriendsList$7 extends Lambda implements a	// class@001a3a
{
    public final boolean $enableSendMessage;
    public final User $user;

    public void UserListBubble$showPopupForFriendsList$7(User p0,boolean p1){
       this.$user = p0;
       this.$enableSendMessage = p1;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       boolean b = (this.$user.mIsHiddenUser == null && this.$enableSendMessage != null)? true: false;
       return b;
    }
}
