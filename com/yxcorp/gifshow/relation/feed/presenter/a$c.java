package com.yxcorp.gifshow.relation.feed.presenter.a$c;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.relation.feed.presenter.a;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.widget.SwipeLayout;
import hcc.i;
import java.lang.Integer;
import g9c.a;
import com.kwai.framework.model.user.RecoUser;
import fac.c;
import com.kwai.framework.model.user.User;
import o07.o;

public class a$c implements PopupInterface$h	// class@0018a1
{
    public final a b;

    public void a$c(a p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "1")) {
          return;
       }
       a$c tb = this.b;
       i.b(false, tb.s, tb.u, tb.B);
       return;
    }
    public void H(c p0,int p1){
       a$c uoc = a$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "2")) {
          return;
       }
       RecoUser recoUser = this.b.C.N0(0);
       if (p1 != 3 && recoUser != null) {
          i.a("CLOSE_POPUP", this.b.D.f(), recoUser.mUser);
       }
       a$c tb = this.b;
       i.b(true, tb.s, tb.u, tb.B);
       return;
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
