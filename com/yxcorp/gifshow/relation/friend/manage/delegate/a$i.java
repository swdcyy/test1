package com.yxcorp.gifshow.relation.friend.manage.delegate.a$i;
import qh7.b;
import com.yxcorp.gifshow.relation.friend.manage.delegate.a;
import java.lang.Object;
import yh7.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.relation.friend.manage.FriendManager;

public final class a$i implements b	// class@0018c2
{
    public final a a;

    public void a$i(a p0){
       this.a = p0;
       super();
    }
    public final void a(a p0){
       a a;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$i.class, "1")) {
          return;
       }
       a.p(p0, "it");
       a = this.a.a;
       if (a != null) {
          a.G("showRemovedUserListPage:"+p0.a);
       }
       return;
    }
}
