package com.yxcorp.gifshow.follow.stagger.data.StagFactoryksfeaturesftfollowfollowstagger;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.follow.stagger.data.FollowLiveSubscribeInfo;
import com.yxcorp.gifshow.follow.stagger.data.FollowLiveSubscribeInfo$TypeAdapter;

public final class StagFactoryksfeaturesftfollowfollowstagger implements j	// class@00116f
{

    public void StagFactoryksfeaturesftfollowfollowstagger(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactoryksfeaturesftfollowfollowstagger.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1.getRawType() == FollowLiveSubscribeInfo.class) {
          return new FollowLiveSubscribeInfo$TypeAdapter(p0);
       }
       return null;
    }
}
