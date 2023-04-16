package com.yxcorp.gifshow.follow.stagger.selector.presenter.i$c;
import rja.e;
import com.yxcorp.gifshow.follow.stagger.selector.presenter.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.homepage_interface.homeitemfragment.HomeItemFragment;
import java.util.Objects;
import com.kwai.library.widget.refresh.RefreshLayout;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Set;
import java.util.Iterator;
import rja.d;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import java.util.List;
import yga.b;
import yga.c;
import rja.c;
import com.yxcorp.gifshow.follow.stagger.selector.FollowFilterAction;
import mrd.a;

public class i$c implements e	// class@001249
{
    public final i a;

    public void i$c(i p0){
       this.a = p0;
       super();
    }
    public void a(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, i$c.class, "1")) {
          return;
       }
       if (this.a.p.c1()) {
          i$c ta = this.a;
          Objects.requireNonNull(ta);
          i oi = i.class;
          if (!PatchProxy.applyVoid(objArray, ta, oi, "11") && (ta.y != null && !ta.p.Ac().u())) {
             Iterator obj = PatchProxy.apply(objArray, ta, oi, "12");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else if(!ta.u.isEmpty()){
                obj = ta.u.iterator();
                while (true) {
                   if (obj.hasNext()) {
                      if (obj.next().a()) {
                         b = true;
                      }
                   }
                }
             }
             b = false;
             if (!b) {
                c.a(KsLogFollowTag.FOLLOW_SELECTOR.appendTag("FollowFilterTabRadioPresenter"), "switchFollowSelectorState");
                if (!ta.q.g()) {
                   ta.r.onNext(FollowFilterAction.SMOOTH_EXPAND);
                }else {
                   ta.r.onNext(FollowFilterAction.SMOOTH_COLLAPSE);
                }
             }
          }
       }
       return;
    }
}
