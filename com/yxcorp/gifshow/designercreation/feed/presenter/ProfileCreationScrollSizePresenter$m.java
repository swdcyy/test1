package com.yxcorp.gifshow.designercreation.feed.presenter.ProfileCreationScrollSizePresenter$m;
import erd.r;
import java.lang.Object;
import com.trello.rxlifecycle3.android.ActivityEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class ProfileCreationScrollSizePresenter$m implements r	// class@0012ee
{
    public static final ProfileCreationScrollSizePresenter$m b;

    static {
       ProfileCreationScrollSizePresenter$m.b = new ProfileCreationScrollSizePresenter$m();
    }
    public void ProfileCreationScrollSizePresenter$m(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, ProfileCreationScrollSizePresenter$m.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "activityEvent");
          b = (p0 == ActivityEvent.RESUME)? true: false;
       }
       return b;
    }
}
