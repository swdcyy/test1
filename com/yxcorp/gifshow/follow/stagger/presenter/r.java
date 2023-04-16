package com.yxcorp.gifshow.follow.stagger.presenter.r;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import brd.t;
import eja.h0;
import kga.c;
import erd.g;
import crd.b;
import java.util.Objects;
import dha.d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import xl8.b;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import com.trello.rxlifecycle3.components.support.RxFragment;
import brd.x;
import eja.i0;
import dha.c;
import dha.b;
import com.kwai.library.widget.refresh.RefreshLayout$h;
import com.kwai.library.widget.refresh.RefreshLayout;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.follow.stagger.presenter.q;
import erd.r;
import eja.g0;
import com.yxcorp.gifshow.follow.stagger.container.HomeFollowFragment;

public class r extends PresenterV2	// class@00121e
{
    public c p;
    public d q;
    public HomeFollowFragment r;

    public void r(){
       super();
    }
    public void E8(){
       c d;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, r.class, "2")) {
          return;
       }
       g a = c.a;
       this.X7(this.r.Vg().f().subscribe(new h0(this), a));
       r tq = this.q;
       Objects.requireNonNull(tq);
       String str = "1";
       t ot = PatchProxy.apply(objArray, tq, d.class, str);
       if (ot != patchProxyRe) {
       }else if(tq.b.isDetached() || tq.b.getActivity() == null){
          ot = t.empty();
       }else {
          ot = tq.a.observable().compose(tq.b.Ug(FragmentEvent.DESTROY));
       }
       this.X7(ot.subscribe(new i0(this), a));
       tq = this.p;
       Objects.requireNonNull(tq);
       t ot1 = PatchProxy.apply(objArray, tq, c.class, str);
       if (ot1 != patchProxyRe) {
       }else if(tq.a.isDetached() || tq.a.getActivity() == null){
          ot1 = t.empty();
       }else if(PatchProxy.applyVoid(objArray, tq, c.class, "3") || tq.e != null){
          b uob = new b(tq);
          tq.e = uob;
          d = tq.d;
          if (d != null) {
             d.c(uob);
          }else {
             c a1 = tq.a;
             if (a1 instanceof RecyclerFragment) {
                a1.Ac().c(tq.e);
             }
          }
       }
       ot1 = tq.b.observable().compose(tq.a.Ug(FragmentEvent.DESTROY));
       this.X7(ot1.filter(q.b).subscribe(new g0(this), a));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, r.class, "1")) {
          return;
       }
       this.p = this.r8("FOLLOW_FEEDS_STATE_PULLED");
       this.q = this.r8("FOLLOW_FEEDS_STATE_REFRESH");
       this.r = this.r8("FRAGMENT");
       return;
    }
}
