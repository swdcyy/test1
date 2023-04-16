package com.yxcorp.gifshow.follow.stagger.config.StagFactoryksfeaturesftfollowfollowstagger;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.follow.stagger.config.FollowStaggerStartupPojo;
import com.yxcorp.gifshow.follow.stagger.config.FollowStaggerStartupPojo$TypeAdapter;

public final class StagFactoryksfeaturesftfollowfollowstagger implements j	// class@00114f
{

    public void StagFactoryksfeaturesftfollowfollowstagger(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactoryksfeaturesftfollowfollowstagger.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1.getRawType() == FollowStaggerStartupPojo.class) {
          return new FollowStaggerStartupPojo$TypeAdapter(p0);
       }
       return null;
    }
}
