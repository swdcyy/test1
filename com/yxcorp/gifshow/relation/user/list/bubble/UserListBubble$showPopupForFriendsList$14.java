package com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$showPopupForFriendsList$14;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.framework.model.user.User;
import java.lang.Object;
import java.lang.Boolean;

public final class UserListBubble$showPopupForFriendsList$14 extends Lambda implements a	// class@001a31
{
    public final boolean $enableIntimateRelation;
    public final User $user;

    public void UserListBubble$showPopupForFriendsList$14(boolean p0,User p1){
       this.$enableIntimateRelation = p0;
       this.$user = p1;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       boolean b = (this.$enableIntimateRelation != null && this.$user.mIntimateRelationType > null)? true: false;
       return b;
    }
}
