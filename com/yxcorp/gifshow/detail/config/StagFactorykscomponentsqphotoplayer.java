package com.yxcorp.gifshow.detail.config.StagFactorykscomponentsqphotoplayer;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.detail.config.QPhotoPlayerStartupCommonPojo;
import com.yxcorp.gifshow.detail.config.QPhotoPlayerStartupCommonPojo$TypeAdapter;

public final class StagFactorykscomponentsqphotoplayer implements j	// class@0014fd
{

    public void StagFactorykscomponentsqphotoplayer(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactorykscomponentsqphotoplayer.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1.getRawType() == QPhotoPlayerStartupCommonPojo.class) {
          return new QPhotoPlayerStartupCommonPojo$TypeAdapter(p0);
       }
       return null;
    }
}
