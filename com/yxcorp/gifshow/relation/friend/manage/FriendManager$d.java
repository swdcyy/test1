package com.yxcorp.gifshow.relation.friend.manage.FriendManager$d;
import erd.o;
import java.lang.Object;
import rac.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.user.User;

public final class FriendManager$d implements o	// class@0018b3
{
    public static final FriendManager$d b;

    static {
       FriendManager$d.b = new FriendManager$d();
    }
    public void FriendManager$d(){
       super();
    }
    public Object apply(Object p0){
       Integer integer = PatchProxy.applyOneRefs(p0, this, FriendManager$d.class, "1");
       if (integer != PatchProxyResult.class) {
       }else {
          a.p(p0, "event");
          p0 = p0.d;
          User mHasRemoved = p0.mHasRemoved;
          int i = (p0.mHasReverseRemoved != null)? 2: 0;
          integer = Integer.valueOf((i | mHasRemoved));
       }
       return integer;
    }
}
