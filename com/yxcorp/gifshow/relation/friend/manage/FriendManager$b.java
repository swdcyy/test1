package com.yxcorp.gifshow.relation.friend.manage.FriendManager$b;
import erd.r;
import com.kwai.framework.model.user.User;
import java.lang.Object;
import rac.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class FriendManager$b implements r	// class@0018b1
{
    public final User b;

    public void FriendManager$b(User p0){
       this.b = p0;
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, FriendManager$b.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "it");
          b = TextUtils.n(this.b.getId(), p0.a);
       }
       return b;
    }
}
