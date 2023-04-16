package com.yxcorp.gifshow.follow.common.model.StagFactoryksfeaturesftfollowfollowcommon;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.follow.common.model.RealtimeMeta$LogParams;
import com.yxcorp.gifshow.follow.common.model.RealtimeMeta$LogParams$TypeAdapter;
import com.yxcorp.gifshow.follow.common.model.RealtimeMeta;
import com.yxcorp.gifshow.follow.common.model.RealtimeMeta$TypeAdapter;

public final class StagFactoryksfeaturesftfollowfollowcommon implements j	// class@001070
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
       if (rawType == RealtimeMeta$LogParams.class) {
          return new RealtimeMeta$LogParams$TypeAdapter(p0);
       }
       if (rawType == RealtimeMeta.class) {
          return new RealtimeMeta$TypeAdapter(p0);
       }
       return null;
    }
}
