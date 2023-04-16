package com.yxcorp.gifshow.profile.presenter.profile.appbar.ProfileAppBarScrollPresenter$mOnOffsetChangedListener$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.profile.presenter.profile.appbar.ProfileAppBarScrollPresenter;
import com.google.android.material.appbar.AppBarLayout$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.profile.presenter.profile.appbar.ProfileAppBarScrollPresenter$mOnOffsetChangedListener$2$a;

public final class ProfileAppBarScrollPresenter$mOnOffsetChangedListener$2 extends Lambda implements a	// class@001484
{
    public final ProfileAppBarScrollPresenter this$0;

    public void ProfileAppBarScrollPresenter$mOnOffsetChangedListener$2(ProfileAppBarScrollPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public final AppBarLayout$c invoke(){
       Object obj = PatchProxy.apply(null, this, ProfileAppBarScrollPresenter$mOnOffsetChangedListener$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ProfileAppBarScrollPresenter$mOnOffsetChangedListener$2$a(this);
    }
    public Object invoke(){
       return this.invoke();
    }
}
