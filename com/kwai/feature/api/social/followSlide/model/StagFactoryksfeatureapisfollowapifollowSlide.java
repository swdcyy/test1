package com.kwai.feature.api.social.followSlide.model.StagFactoryksfeatureapisfollowapifollowSlide;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.social.followSlide.model.FollowSlideRecoGuide;
import com.kwai.feature.api.social.followSlide.model.FollowSlideRecoGuide$TypeAdapter;

public final class StagFactoryksfeatureapisfollowapifollowSlide implements j	// class@0010d1
{

    public void StagFactoryksfeatureapisfollowapifollowSlide(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactoryksfeatureapisfollowapifollowSlide.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1.getRawType() == FollowSlideRecoGuide.class) {
          return new FollowSlideRecoGuide$TypeAdapter(p0);
       }
       return null;
    }
}
