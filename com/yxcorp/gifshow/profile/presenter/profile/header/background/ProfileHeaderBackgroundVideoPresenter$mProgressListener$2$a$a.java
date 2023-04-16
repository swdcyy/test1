package com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundVideoPresenter$mProgressListener$2$a$a;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundVideoPresenter$mProgressListener$2$a;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundVideoPresenter$mProgressListener$2;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundVideoPresenter;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import e17.i$b;
import e17.i;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Objects;
import android.view.ViewGroup;

public final class ProfileHeaderBackgroundVideoPresenter$mProgressListener$2$a$a implements g	// class@0014cd
{
    public final ProfileHeaderBackgroundVideoPresenter$mProgressListener$2$a b;

    public void ProfileHeaderBackgroundVideoPresenter$mProgressListener$2$a$a(ProfileHeaderBackgroundVideoPresenter$mProgressListener$2$a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileHeaderBackgroundVideoPresenter$mProgressListener$2$a$a.class, "1")) {
       }else {
          p0 = this.b.a.this$0.y;
          if (p0 == null) {
             a.S("mFragment");
          }
          if (p0.Vg().a()) {
             p0 = i.m();
             p0.x(R.string.arg_RES_7f103e9b);
             p0.p(R.drawable.arg_RES_7f082463);
             p0.o(3000);
             View view = this.b.a.this$0.m8();
             Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
             p0.n(view);
             i.z(p0);
          }
       }
       return;
    }
}
