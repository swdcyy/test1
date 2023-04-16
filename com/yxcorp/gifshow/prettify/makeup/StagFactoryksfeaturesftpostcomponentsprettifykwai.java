package com.yxcorp.gifshow.prettify.makeup.StagFactoryksfeaturesftpostcomponentsprettifykwai;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.prettify.makeup.MakeupResponse;
import com.yxcorp.gifshow.prettify.makeup.MakeupResponse$TypeAdapter;

public final class StagFactoryksfeaturesftpostcomponentsprettifykwai implements j	// class@001161
{

    public void StagFactoryksfeaturesftpostcomponentsprettifykwai(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactoryksfeaturesftpostcomponentsprettifykwai.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1.getRawType() == MakeupResponse.class) {
          return new MakeupResponse$TypeAdapter(p0);
       }
       return null;
    }
}
