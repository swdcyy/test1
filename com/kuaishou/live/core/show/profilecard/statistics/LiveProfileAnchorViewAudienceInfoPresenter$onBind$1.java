package com.kuaishou.live.core.show.profilecard.statistics.LiveProfileAnchorViewAudienceInfoPresenter$onBind$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kwai.framework.model.user.UserProfile;
import com.kuaishou.live.core.show.profilecard.http.LiveUserProfileExtraInfo;
import kotlin.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveProfileAnchorViewAudienceInfoPresenter$onBind$1 extends Lambda implements p	// class@000df4
{
    public static final LiveProfileAnchorViewAudienceInfoPresenter$onBind$1 INSTANCE;

    static {
       LiveProfileAnchorViewAudienceInfoPresenter$onBind$1.INSTANCE = new LiveProfileAnchorViewAudienceInfoPresenter$onBind$1();
    }
    public void LiveProfileAnchorViewAudienceInfoPresenter$onBind$1(){
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
    public final Pair invoke(UserProfile p0,LiveUserProfileExtraInfo p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveProfileAnchorViewAudienceInfoPresenter$onBind$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Pair(p0, p1);
    }
}
