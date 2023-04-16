package com.yxcorp.gifshow.follow.common.data.StagFactoryksfeaturesftfollowfollowcommon;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.follow.common.data.LiveCoverAnnexResponse;
import com.yxcorp.gifshow.follow.common.data.LiveCoverAnnexResponse$TypeAdapter;
import nga.j;
import com.yxcorp.gifshow.follow.common.data.FollowResponse$TypeAdapter;
import com.yxcorp.gifshow.follow.common.data.FeedsResponse;
import com.yxcorp.gifshow.follow.common.data.FeedsResponse$TypeAdapter;

public final class StagFactoryksfeaturesftfollowfollowcommon implements j	// class@001028
{

    public void StagFactoryksfeaturesftfollowfollowcommon(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactoryksfeaturesftfollowfollowcommon.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Class rawType = p1.getRawType();
       if (rawType == LiveCoverAnnexResponse.class) {
          return new LiveCoverAnnexResponse$TypeAdapter(p0);
       }
       if (rawType == j.class) {
          return new FollowResponse$TypeAdapter(p0);
       }
       if (rawType == FeedsResponse.class) {
          return new FeedsResponse$TypeAdapter(p0);
       }
       return null;
    }
}
