package com.yxcorp.gifshow.relation.user.base.UserListFragment$a;
import com.yxcorp.gifshow.fragment.f;
import com.yxcorp.gifshow.relation.user.base.UserListFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class UserListFragment$a extends f	// class@0019f7
{
    public final UserListFragment l;

    public void UserListFragment$a(UserListFragment p0,RecyclerFragment p1){
       this.l = p0;
       super(p1);
    }
    public KwaiEmptyStateView$a a(){
       KwaiEmptyStateView$a obj = PatchProxy.apply(null, this, UserListFragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.a();
       obj.k(R.drawable.arg_RES_7f0805f6);
       return obj;
    }
}
