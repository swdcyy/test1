package com.yxcorp.gifshow.designercreation.feed.presenter.ProfileCreationScrollSizePresenter$h;
import erd.r;
import com.yxcorp.gifshow.designercreation.feed.presenter.ProfileCreationScrollSizePresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;

public final class ProfileCreationScrollSizePresenter$h implements r	// class@0012e9
{
    public final ProfileCreationScrollSizePresenter b;

    public void ProfileCreationScrollSizePresenter$h(ProfileCreationScrollSizePresenter p0){
       this.b = p0;
       super();
    }
    public boolean test(Object p0){
       boolean b = p0.booleanValue();
       ProfileCreationScrollSizePresenter$h oh = ProfileCreationScrollSizePresenter$h.class;
       if (PatchProxy.isSupport(oh)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(b), this, oh, "1");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(b){
             b = this.b.V8();
             a.m(b);
             if (b.getUserVisibleHint()) {
                b = true;
             }
          }
          b = false;
       }else {
          goto label_0023 ;
       }
       return b;
    }
}
