package ccc.d;
import zbc.d;
import com.yxcorp.gifshow.relation.user.fragment.NoticeUserListFragment;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.util.Objects;
import hcc.j0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import com.yxcorp.utility.TextUtils;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class d implements d	// class@000571
{
    public final NoticeUserListFragment a;

    public void d(NoticeUserListFragment p0){
       this.a = p0;
    }
    public final void a(User p0){
       d ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoidTwoRefs(ta, p0, null, j0.class, "22")) {
       }else {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "USER_FOLLOW";
          i3 oi3 = i3.f();
          oi3.d("user_id", p0.getId());
          oi3.c("is_follow", Integer.valueOf(1));
          oi3.c("is_friend", Integer.valueOf(p0.isFriend()));
          oi3.d("relationship_link", TextUtils.N((long)j0.d(p0)));
          oi3.d("list_index", TextUtils.N((long)(p0.mPosition + 1)));
          uElementPack.params = oi3.e();
          u1.L("", ta, 1, uElementPack, null);
       }
       return;
    }
}
