package com.yxcorp.gifshow.postentrance.util.StagFactoryksfeaturesftpostpostentrance;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import a0c.i;
import com.yxcorp.gifshow.postentrance.util.PostEntranceStartupPojo$TypeAdapter;

public final class StagFactoryksfeaturesftpostpostentrance implements j	// class@00108a
{

    public void StagFactoryksfeaturesftpostpostentrance(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactoryksfeaturesftpostpostentrance.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1.getRawType() == i.class) {
          return new PostEntranceStartupPojo$TypeAdapter(p0);
       }
       return null;
    }
}
