package com.yxcorp.gifshow.prettify.beauty.StagFactoryksfeaturesftpostcomponentsprettifykwai;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.prettify.beauty.RecoBeautyResponse;
import com.yxcorp.gifshow.prettify.beauty.RecoBeautyResponse$TypeAdapter;

public final class StagFactoryksfeaturesftpostcomponentsprettifykwai implements j	// class@0010f7
{

    public void StagFactoryksfeaturesftpostcomponentsprettifykwai(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactoryksfeaturesftpostcomponentsprettifykwai.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1.getRawType() == RecoBeautyResponse.class) {
          return new RecoBeautyResponse$TypeAdapter(p0);
       }
       return null;
    }
}
