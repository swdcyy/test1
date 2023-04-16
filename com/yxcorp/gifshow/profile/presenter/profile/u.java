package com.yxcorp.gifshow.profile.presenter.profile.u;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.profile.presenter.profile.u$a;
import com.kwai.feature.api.social.profile.model.ProfileDraftsFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.profile.presenter.profile.o;
import erd.r;
import j4c.q;
import z5c.l0;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.profile.presenter.profile.n;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import j4c.r;
import qvb.q;
import qvb.a;
import java.lang.Boolean;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.UserProfile;
import z5c.d3;
import om6.d;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import lnc.y6;
import com.yxcorp.gifshow.profile.presenter.profile.p;
import com.yxcorp.gifshow.profile.presenter.profile.s;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.yxcorp.gifshow.profile.http.l;
import java.util.List;
import com.yxcorp.gifshow.profile.presenter.profile.m;

public class u extends PresenterV2	// class@00158e
{
    public RecyclerFragment p;
    public BaseFragment q;
    public l r;
    public ProfileParam s;
    public QPhoto t;
    public List u;
    public ProfileDraftsFeed v;
    public boolean w;
    public final q x;
    public boolean y;
    public t z;

    public void u(){
       super();
       this.x = new u$a(this);
       this.y = true;
       this.v = new ProfileDraftsFeed();
       this.t = new QPhoto(this.v);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, u.class, "2")) {
          return;
       }
       this.P8(false);
       t ot = this.p.I5();
       this.z = ot;
       g a = l0.a;
       this.X7(ot.filter(o.b).subscribe(new q(this), a));
       this.X7(this.q.n1().filter(n.b).debounce(500, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new r(this), a));
       this.r.h(this.x);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, u.class, "3")) {
          return;
       }
       this.r.f(this.x);
       return;
    }
    public final void P8(boolean p0){
       u ou = u.class;
       if (PatchProxy.isSupport(ou) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ou, "4")) {
          return;
       }
       ou = this.s;
       if (d3.c(ou.mUser, ou.mUserProfile)) {
          return;
       }
       this.X7(y6.s(d.class, LoadPolicy.SILENT_ENQUEUE).R(new p(this, p0), s.b));
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, u.class, "10")) {
          return;
       }
       if (this.p.h0() != null && this.p.h0().getLayoutManager() != null) {
          this.p.h0().getLayoutManager().scrollToPositionWithOffset(0, 0);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, u.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       this.q = this.r8("PROFILE_FRAGMENT");
       this.r = this.r8("PAGE_LIST");
       this.s = this.q8(ProfileParam.class);
       List list = this.r8("PROFILE_DRAFTS_ACTIVITY_CALLBACK");
       this.u = list;
       list.add(new m(this));
       return;
    }
}
