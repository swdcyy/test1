package com.yxcorp.gifshow.designercreation.feed.presenter.ProfileCreationScrollSizePresenter$n;
import erd.r;
import com.yxcorp.gifshow.designercreation.feed.presenter.ProfileCreationScrollSizePresenter;
import java.lang.Object;
import com.trello.rxlifecycle3.android.ActivityEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class ProfileCreationScrollSizePresenter$n implements r	// class@0012f1
{
    public final ProfileCreationScrollSizePresenter b;

    public void ProfileCreationScrollSizePresenter$n(ProfileCreationScrollSizePresenter p0){
       this.b = p0;
       super();
    }
    public boolean test(Object p0){
       boolean b;
       p0 = PatchProxy.applyOneRefs(p0, this, ProfileCreationScrollSizePresenter$n.class, "1");
       if (p0 != PatchProxyResult.class) {
          b = p0.booleanValue();
       }else {
          p0 = this.b.V8();
          a.m(p0);
          if (p0.getUserVisibleHint()) {
             p0 = this.b.V8();
             a.m(p0);
             if (p0.K0()) {
                b = true;
             }
          }
          b = false;
       }
       return b;
    }
}
