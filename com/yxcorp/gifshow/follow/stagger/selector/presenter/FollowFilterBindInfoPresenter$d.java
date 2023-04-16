package com.yxcorp.gifshow.follow.stagger.selector.presenter.FollowFilterBindInfoPresenter$d;
import erd.g;
import com.yxcorp.gifshow.follow.stagger.selector.presenter.FollowFilterBindInfoPresenter;
import java.lang.Object;
import eda.l;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import java.util.List;
import yga.b;
import yga.c;
import com.yxcorp.gifshow.follow.common.selector.FollowFilterHelper;

public final class FollowFilterBindInfoPresenter$d implements g	// class@00122e
{
    public final FollowFilterBindInfoPresenter b;

    public void FollowFilterBindInfoPresenter$d(FollowFilterBindInfoPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowFilterBindInfoPresenter$d.class, "1")) {
       }else {
          a.p(p0, "event");
          FollowFilterBindInfoPresenter$d tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, FollowFilterBindInfoPresenter.class, "19")) {
             c.i(KsLogFollowTag.FOLLOW_SELECTOR.appendTag("FollowFilterBindInfoPresenter"), "user login");
             if (FollowFilterHelper.a()) {
                p0 = FollowFilterHelper.d();
                if (p0 != null) {
                   tb.r = p0;
                   tb.S8();
                }
             }
          }
       }
       return;
    }
}
