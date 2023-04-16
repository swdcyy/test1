package com.yxcorp.gifshow.like.resource.StagFactorykscomponentslikeresource;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.like.resource.LikeResourceStartupCommonPojo;
import com.yxcorp.gifshow.like.resource.LikeResourceStartupCommonPojo$TypeAdapter;

public final class StagFactorykscomponentslikeresource implements j	// class@001a5f
{

    public void StagFactorykscomponentslikeresource(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactorykscomponentslikeresource.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1.getRawType() == LikeResourceStartupCommonPojo.class) {
          return new LikeResourceStartupCommonPojo$TypeAdapter(p0);
       }
       return null;
    }
}
