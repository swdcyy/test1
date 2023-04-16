package com.yxcorp.gifshow.reco.StagFactorykscomponentsfeaturemodel;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.reco.FeedMiscPojo;
import com.yxcorp.gifshow.reco.FeedMiscPojo$TypeAdapter;

public final class StagFactorykscomponentsfeaturemodel implements j	// class@0016f4
{

    public void StagFactorykscomponentsfeaturemodel(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactorykscomponentsfeaturemodel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1.getRawType() == FeedMiscPojo.class) {
          return new FeedMiscPojo$TypeAdapter(p0);
       }
       return null;
    }
}
