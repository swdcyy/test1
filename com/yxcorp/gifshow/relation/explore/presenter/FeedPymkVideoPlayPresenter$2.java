package com.yxcorp.gifshow.relation.explore.presenter.FeedPymkVideoPlayPresenter$2;
import com.yxcorp.gifshow.osbug.FixedLifecycleObserver;
import com.yxcorp.gifshow.relation.explore.presenter.FeedPymkVideoPlayPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import g9c.a;
import com.kwai.framework.model.user.RecoUser;
import com.kwai.framework.model.user.User$FollowStatus;
import com.kwai.framework.model.user.User;
import java.util.Objects;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import ib5.q;
import nac.a;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.relation.explore.presenter.q;
import erd.g;
import crd.b;
import androidx.lifecycle.LifecycleOwner;

public class FeedPymkVideoPlayPresenter$2 extends FixedLifecycleObserver	// class@00181c
{
    public final FeedPymkVideoPlayPresenter f;

    public void FeedPymkVideoPlayPresenter$2(FeedPymkVideoPlayPresenter p0){
       this.f = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, FeedPymkVideoPlayPresenter$2.class, "1")) {
          return;
       }
       this.f.P8();
       return;
    }
    public void b(){
       Object[] objArray = null;
       String str = "2";
       if (PatchProxy.applyVoid(objArray, this, FeedPymkVideoPlayPresenter$2.class, str)) {
          return;
       }
       int i = 0;
       RecoUser recoUser = this.f.u.N0(i);
       if (this.f.u.getItemCount() > 1 && recoUser != null) {
          RecoUser mUser = recoUser.mUser;
          if (mUser != null && (mUser.getFollowStatus() == User$FollowStatus.FOLLOWING || recoUser.mUser.getFollowStatus() == User$FollowStatus.FOLLOW_REQUESTING)) {
             i = 1;
          }
       }
       if (!i) {
          FeedPymkVideoPlayPresenter$2 tf = this.f;
          Objects.requireNonNull(tf);
          if (!PatchProxy.applyVoid(objArray, tf, FeedPymkVideoPlayPresenter.class, str) && (tf.r.Vg().d() && (tf.r.Vg().c() && !q.p0(tf.r.getActivity()).s0()))) {
             FeedPymkVideoPlayPresenter r = tf.r;
             if (!r instanceof a || r.V()) {
                tf.t = t.timer(100, TimeUnit.MILLISECONDS).subscribeOn(d.a).subscribe(new q(tf));
             }
          }
       }
       return;
    }
    public void onStop(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FeedPymkVideoPlayPresenter$2.class, "3")) {
          return;
       }
       super.onStop(p0);
       return;
    }
}
