package com.yxcorp.gifshow.profile.ProfileStyle$REDESIGN_HEAD_SMALL_CARD;
import com.yxcorp.gifshow.profile.ProfileStyle;
import java.lang.String;
import nsd.u;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import n4c.t;
import k4c.r;

public final class ProfileStyle$REDESIGN_HEAD_SMALL_CARD extends ProfileStyle	// class@0011e4
{

    public void ProfileStyle$REDESIGN_HEAD_SMALL_CARD(String p0,int p1){
       super(p0, p1, 5, null);
    }
    public void addCommonPresenterV2(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, ProfileStyle$REDESIGN_HEAD_SMALL_CARD.class, "3")) {
          return;
       }
       a.p(p0, "presenter");
       p0.U7(new t());
       p0.U7(new r());
       PatchProxy.onMethodExit(ProfileStyle$REDESIGN_HEAD_SMALL_CARD.class, "3");
       return;
    }
    public void addMyPresenterV2(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, ProfileStyle$REDESIGN_HEAD_SMALL_CARD.class, "2")) {
          return;
       }
       a.p(p0, "presenter");
       PatchProxy.onMethodExit(ProfileStyle$REDESIGN_HEAD_SMALL_CARD.class, "2");
       return;
    }
    public void addUserPresenterV2(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, ProfileStyle$REDESIGN_HEAD_SMALL_CARD.class, "1")) {
          return;
       }
       a.p(p0, "presenter");
       PatchProxy.onMethodExit(ProfileStyle$REDESIGN_HEAD_SMALL_CARD.class, "1");
       return;
    }
}
