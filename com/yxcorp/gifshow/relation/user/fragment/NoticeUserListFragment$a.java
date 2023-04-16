package com.yxcorp.gifshow.relation.user.fragment.NoticeUserListFragment$a;
import com.kwai.library.widget.refresh.RefreshLayout$h;
import com.yxcorp.gifshow.relation.user.fragment.NoticeUserListFragment;
import java.lang.Object;
import o17.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hcc.j0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class NoticeUserListFragment$a implements RefreshLayout$h	// class@001a04
{
    public final NoticeUserListFragment a;

    public void NoticeUserListFragment$a(NoticeUserListFragment p0){
       this.a = p0;
       super();
    }
    public void a(float p0,float p1,boolean p2){
       i.a(this, p0, p1, p2);
    }
    public void b(){
       i.d(this);
    }
    public void pullToRefresh(){
       if (PatchProxy.applyVoid(null, this, NoticeUserListFragment$a.class, "1")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, null, j0.class, "21")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "PULL_TO_REFRESH";
          u1.u(1, uElementPack, null);
       }
       return;
    }
    public void refreshComplete(){
       i.c(this);
    }
    public void releaseToRefresh(){
       i.e(this);
    }
}
