package com.yxcorp.gifshow.designercreation.feed.presenter.ProfileCreationScrollSizePresenter$f;
import erd.g;
import com.yxcorp.gifshow.designercreation.feed.presenter.ProfileCreationScrollSizePresenter;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a3c.a;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class ProfileCreationScrollSizePresenter$f implements g	// class@0012e7
{
    public final ProfileCreationScrollSizePresenter b;

    public void ProfileCreationScrollSizePresenter$f(ProfileCreationScrollSizePresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileCreationScrollSizePresenter$f.class, "1")) {
       }else if(a.b(p0, "MAIN_KEY") == 20){
          p0 = this.b.V8();
          a.m(p0);
          if (p0.K0()) {
             this.b.Y8();
          }
       }
       return;
    }
}
