package com.kuaishou.merchant.api.core.model.StagFactoryksfeatureapismerchantapicoreapi;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.api.core.model.CardCollectionFeedResponse;
import com.kuaishou.merchant.api.core.model.CardCollectionFeedResponse$TypeAdapter;

public final class StagFactoryksfeatureapismerchantapicoreapi implements j	// class@001538
{

    public void StagFactoryksfeatureapismerchantapicoreapi(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactoryksfeatureapismerchantapicoreapi.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1.getRawType() == CardCollectionFeedResponse.class) {
          return new CardCollectionFeedResponse$TypeAdapter(p0);
       }
       return null;
    }
}
