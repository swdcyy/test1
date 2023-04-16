package com.yxcorp.gifshow.profile.ProfileStyle$REDESIGN_IMMERSIVE_V2;
import com.yxcorp.gifshow.profile.ProfileStyle;
import java.lang.String;
import nsd.u;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import n4c.u;
import k4c.x;

public final class ProfileStyle$REDESIGN_IMMERSIVE_V2 extends ProfileStyle	// class@0011e5
{

    public void ProfileStyle$REDESIGN_IMMERSIVE_V2(String p0,int p1){
       super(p0, p1, 4, null);
    }
    public void addCommonPresenterV2(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, ProfileStyle$REDESIGN_IMMERSIVE_V2.class, "3")) {
          return;
       }
       a.p(p0, "presenter");
       p0.U7(new u());
       p0.U7(new x());
       PatchProxy.onMethodExit(ProfileStyle$REDESIGN_IMMERSIVE_V2.class, "3");
       return;
    }
    public void addMyPresenterV2(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, ProfileStyle$REDESIGN_IMMERSIVE_V2.class, "2")) {
          return;
       }
       a.p(p0, "presenter");
       PatchProxy.onMethodExit(ProfileStyle$REDESIGN_IMMERSIVE_V2.class, "2");
       return;
    }
    public void addUserPresenterV2(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, ProfileStyle$REDESIGN_IMMERSIVE_V2.class, "1")) {
          return;
       }
       a.p(p0, "presenter");
       PatchProxy.onMethodExit(ProfileStyle$REDESIGN_IMMERSIVE_V2.class, "1");
       return;
    }
    public int getLayoutId(){
       return 0x7f0d127e;
    }
}
