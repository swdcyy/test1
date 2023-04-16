package com.yxcorp.gifshow.loading.StagFactorykscomponentslikeresource;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.loading.PullDownResourceStartupCommonPojo;
import com.yxcorp.gifshow.loading.PullDownResourceStartupCommonPojo$TypeAdapter;

public final class StagFactorykscomponentslikeresource implements j	// class@001a98
{

    public void StagFactorykscomponentslikeresource(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactorykscomponentslikeresource.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1.getRawType() == PullDownResourceStartupCommonPojo.class) {
          return new PullDownResourceStartupCommonPojo$TypeAdapter(p0);
       }
       return null;
    }
}
