package com.yxcorp.gifshow.follow.stagger.selector.presenter.FollowFilterBindInfoPresenter$b;
import yvb.e$b;
import com.yxcorp.gifshow.follow.model.FilterBox;
import com.yxcorp.gifshow.follow.stagger.selector.presenter.FollowFilterBindInfoPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import io.reactivex.subjects.PublishSubject;
import kotlin.jvm.internal.a;
import tja.a;
import com.yxcorp.gifshow.follow.model.FilterOption;
import kotlin.Pair;
import com.yxcorp.gifshow.refresh.RefreshType;
import nsd.u;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import yga.b;
import java.lang.StringBuilder;
import yga.c;

public final class FollowFilterBindInfoPresenter$b implements e$b	// class@00122c
{
    public final FilterBox a;
    public final int b;
    public final FilterBox c;
    public final FollowFilterBindInfoPresenter d;

    public void FollowFilterBindInfoPresenter$b(FilterBox p0,int p1,FilterBox p2,FollowFilterBindInfoPresenter p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public final void a(int p0,int p1){
       if (PatchProxy.isSupport2(FollowFilterBindInfoPresenter$b.class, "1") && PatchProxy.applyVoidTwoRefsWithListener(Integer.valueOf(p0), Integer.valueOf(p1), this, FollowFilterBindInfoPresenter$b.class, "1")) {
          return;
       }
       if (p0 != -1 && (this.a.mOptions.size() > 0 && this.a.mOptions.size() > p0)) {
          FollowFilterBindInfoPresenter$b td = this.d;
          Objects.requireNonNull(td);
          FollowFilterBindInfoPresenter uFollowFilte = PatchProxy.apply(null, td, FollowFilterBindInfoPresenter.class, "9");
          if (uFollowFilte != PatchProxyResult.class) {
          }else {
             uFollowFilte = td.u;
             if (uFollowFilte == null) {
                a.S("mFilterItemClickEvent");
             }
          }
          a uoa = new a(this.a.mOptions.get(p0), new Pair(Integer.valueOf(this.b), Integer.valueOf(p0)), null, false, 12, null);
          uFollowFilte.onNext(td);
       }else {
          c.i(KsLogFollowTag.FOLLOW_SELECTOR.appendTag("FollowFilterBindInfoPresenter"), "current pos is "+p0+", mOptions size is "+this.a.mOptions.size()+" mOptions="+this.a.mOptions);
       }
       PatchProxy.onMethodExit(FollowFilterBindInfoPresenter$b.class, "1");
       return;
    }
}
