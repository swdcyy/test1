package com.yxcorp.gifshow.follow.stagger.selector.presenter.FollowFilterRedPointHandlePresenter$followSelectorIntercept$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import uja.x;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dha.d;
import java.util.Objects;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import java.util.List;
import yga.b;
import yga.c;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.refresh.RefreshType;
import com.kwai.component.homepage_interface.homeitemfragment.HomeItemFragment;

public final class FollowFilterRedPointHandlePresenter$followSelectorIntercept$1 extends Lambda implements a	// class@00123a
{
    public final x this$0;

    public void FollowFilterRedPointHandlePresenter$followSelectorIntercept$1(x p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, FollowFilterRedPointHandlePresenter$followSelectorIntercept$1.class, "1")) {
          return;
       }
       this.this$0.P8().b(1);
       FollowFilterRedPointHandlePresenter$followSelectorIntercept$1 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoid(objArray, tthis$0, x.class, "16")) {
          c.i(KsLogFollowTag.FOLLOW_NOTIFY.appendTag("FollowFilterRedPointHandlePresenter"), "scrollToTopAndRefreshPageList");
          x p = tthis$0.p;
          if (p == null) {
             a.S("mFragment");
          }
          p.h0().scrollToPosition(0);
          x p1 = tthis$0.p;
          if (p1 == null) {
             a.S("mFragment");
          }
          p1.J3(RefreshType.FOLLOW_REDPOINT);
       }
       return;
    }
}
