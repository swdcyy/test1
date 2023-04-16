package eja.f0;
import erd.g;
import com.yxcorp.gifshow.follow.stagger.presenter.p;
import java.lang.Object;
import wca.n;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.AggregateTemplateMeta;
import com.kwai.framework.model.user.User;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.user.User$FollowStatus;
import lu7.f;

public final class f0 implements g	// class@0026c1
{
    public final p b;

    public void f0(p p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, p.class, "10")) {
       }else {
          p s = tb.s;
          if (s != null) {
             AggregateTemplateMeta mRecommendUs = s.mRecommendUser;
             if (mRecommendUs != null && TextUtils.n(mRecommendUs.mId, p0.b)) {
                AggregateTemplateMeta mRecommendUs1 = tb.s.mRecommendUser;
                p0 = (p0.d == null && p0.c != null)? User$FollowStatus.FOLLOWING: User$FollowStatus.UNFOLLOW;
                f.m(mRecommendUs1, p0);
             }
          }
       }
       return;
    }
}
