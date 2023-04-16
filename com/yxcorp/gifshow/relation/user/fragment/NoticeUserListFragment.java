package com.yxcorp.gifshow.relation.user.fragment.NoticeUserListFragment;
import com.yxcorp.gifshow.relation.user.base.UserListFragment;
import com.yxcorp.gifshow.relation.user.model.UserListParam;
import s2b.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.relation.user.fragment.NoticeUserListFragment$c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ecc.c;
import zbc.c;
import com.yxcorp.gifshow.relation.user.fragment.NoticeUserListFragment$b;
import zbc.d;
import ccc.d;
import qvb.n0;
import xac.q;
import java.util.Map;
import java.lang.StringBuilder;
import hcc.j0;
import android.view.View;
import android.os.Bundle;
import com.kwai.library.widget.refresh.RefreshLayout;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.relation.user.fragment.NoticeUserListFragment$a;
import com.kwai.library.widget.refresh.RefreshLayout$h;
import qvb.i;

public class NoticeUserListFragment extends UserListFragment	// class@001a07
{
    public static final int J;

    public void NoticeUserListFragment(){
       super();
    }
    public a Gh(UserListFragment p0,UserListParam p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, NoticeUserListFragment.class, "6");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new NoticeUserListFragment$c(this);
    }
    public PresenterV2 Hh(){
       Object obj = PatchProxy.applyWithListener(null, this, NoticeUserListFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(NoticeUserListFragment.class, "2");
       return new c(0);
    }
    public c Kh(){
       Object obj = PatchProxy.apply(null, this, NoticeUserListFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new NoticeUserListFragment$b(this);
    }
    public d Mh(){
       Object obj = PatchProxy.apply(null, this, NoticeUserListFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new d(this);
    }
    public boolean Oh(){
       return true;
    }
    public n0 Ph(){
       Object obj = PatchProxy.apply(null, this, NoticeUserListFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new q(this.F.mQueryUrl);
    }
    public int f(){
       UserListParam mNoticeType = this.F.mNoticeType;
       if (mNoticeType == 2) {
          return 51;
       }
       if (mNoticeType != 12) {
          return 0;
       }
       return 50;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NoticeUserListFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(NoticeUserListFragment.class, null);
       return objectsByTag;
    }
    public int getPage(){
       return 142;
    }
    public String getPageParams(){
       Object obj = PatchProxy.apply(null, this, NoticeUserListFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "type="+this.F.mNoticeType+"&"+j0.c(this.F.mNoticeType);
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, NoticeUserListFragment.class, "1")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.Ac().c(new NoticeUserListFragment$a(this));
       return;
    }
    public i yh(){
       return this.Ph();
    }
}
