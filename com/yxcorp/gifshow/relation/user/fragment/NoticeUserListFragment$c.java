package com.yxcorp.gifshow.relation.user.fragment.NoticeUserListFragment$c;
import s2b.a;
import com.yxcorp.gifshow.relation.user.fragment.NoticeUserListFragment;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hcc.j0;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.kwai.framework.model.user.User;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class NoticeUserListFragment$c implements a	// class@001a06
{
    public final NoticeUserListFragment a;

    public void NoticeUserListFragment$c(NoticeUserListFragment p0){
       this.a = p0;
       super();
    }
    public void a(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NoticeUserListFragment$c.class, "1")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, null, j0.class, "23") && !q.f(p0)) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             User user = iterator.next();
             if (user.mPosition == -1) {
                user.mPosition = 0;
             }
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "LIKE_USER";
             i3 oi3 = i3.f();
             oi3.d("user_id", user.getId());
             oi3.c("is_follow", Integer.valueOf(user.isFollowingOrFollowRequesting()));
             oi3.c("is_friend", Integer.valueOf(user.isFriend()));
             oi3.d("relationship_link", TextUtils.N((long)j0.d(user)));
             int i = user.mPosition + 1;
             oi3.d("list_index", TextUtils.N((long)i));
             uElementPack.params = oi3.e();
             u1.u0(3, uElementPack, null);
          }
       }
       return;
    }
    public boolean b(Object p0){
       p0.mShowed = true;
       return true;
    }
}
