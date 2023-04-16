package com.yxcorp.gifshow.relation.explore.presenter.s;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.relation.explore.presenter.r;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.krn.event.a;
import oj0.a;
import com.yxcorp.gifshow.relation.explore.fragment.NewFansListRnContainerFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class s extends PresenterV2	// class@001861
{
    public BaseFragment p;
    public final a q;

    public void s(){
       super();
       this.q = new r(this);
    }
    public void E8(){
       s os = s.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, os, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, os, "4")) {
          a.b().a("KRNFriendsListPageEmptyNotification", this.q);
       }
       return;
    }
    public void J8(){
       s os = s.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, os, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, os, "5")) {
          a.b().c("KRNFriendsListPageEmptyNotification", this.q);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, s.class, "1")) {
          return;
       }
       this.p = this.s8(NewFansListRnContainerFragment.class);
       return;
    }
}
