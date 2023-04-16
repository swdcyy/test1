package com.yxcorp.gifshow.designercreation.feed.presenter.ProfileCreationScrollSizePresenter$g;
import erd.r;
import java.lang.Object;
import y8c.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class ProfileCreationScrollSizePresenter$g implements r	// class@0012e8
{
    public static final ProfileCreationScrollSizePresenter$g b;

    static {
       ProfileCreationScrollSizePresenter$g.b = new ProfileCreationScrollSizePresenter$g();
    }
    public void ProfileCreationScrollSizePresenter$g(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, ProfileCreationScrollSizePresenter$g.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "lifecycleEvent");
          b = (p0.a == 3)? true: false;
       }
       return b;
    }
}
