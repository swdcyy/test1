package com.yxcorp.gifshow.profile.helper.guide.EmptyGuideType$3;
import com.yxcorp.gifshow.profile.helper.guide.EmptyGuideType;
import java.lang.String;
import java.lang.Class;
import com.yxcorp.gifshow.profile.helper.guide.EmptyGuideType$1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import m3c.a;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.profile.helper.guide.PendantAvatarProcessor;
import com.kwai.feature.api.social.profile.model.PendantAvatarContent;

public final class EmptyGuideType$3 extends EmptyGuideType	// class@00133a
{

    public void EmptyGuideType$3(String p0,int p1,Class p2){
       super(p0, p1, p2, null);
    }
    public a createProcessor(BaseFragment p0,RecyclerFragment p1,ProfileParam p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, EmptyGuideType$3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new PendantAvatarProcessor(PendantAvatarContent.class, p0, p1, p2);
    }
}
