package com.yxcorp.gifshow.relation.friend.manage.FriendManager$c;
import erd.g;
import com.kwai.framework.model.user.User;
import java.lang.Object;
import rac.a;

public final class FriendManager$c implements g	// class@0018b2
{
    public final User b;

    public void FriendManager$c(User p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       FriendManager$c tb = this.b;
       p0 = p0.d;
       tb.mHasRemoved = p0.mHasRemoved;
       tb.mHasReverseRemoved = p0.mHasReverseRemoved;
    }
}
