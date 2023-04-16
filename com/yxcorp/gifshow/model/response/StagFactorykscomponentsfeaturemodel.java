package com.yxcorp.gifshow.model.response.StagFactorykscomponentsfeaturemodel;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.response.RealtimeStartupResponse;
import com.yxcorp.gifshow.model.response.RealtimeStartupResponse$TypeAdapter;

public final class StagFactorykscomponentsfeaturemodel implements j	// class@001f63
{

    public void StagFactorykscomponentsfeaturemodel(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactorykscomponentsfeaturemodel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1.getRawType() == RealtimeStartupResponse.class) {
          return new RealtimeStartupResponse$TypeAdapter(p0);
       }
       return null;
    }
}
