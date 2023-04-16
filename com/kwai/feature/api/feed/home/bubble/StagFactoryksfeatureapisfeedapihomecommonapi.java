package com.kwai.feature.api.feed.home.bubble.StagFactoryksfeatureapisfeedapihomecommonapi;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.feed.home.bubble.HomeBubbleStartupPojo;
import com.kwai.feature.api.feed.home.bubble.HomeBubbleStartupPojo$TypeAdapter;

public final class StagFactoryksfeatureapisfeedapihomecommonapi implements j	// class@000ef1
{

    public void StagFactoryksfeatureapisfeedapihomecommonapi(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactoryksfeatureapisfeedapihomecommonapi.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1.getRawType() == HomeBubbleStartupPojo.class) {
          return new HomeBubbleStartupPojo$TypeAdapter(p0);
       }
       return null;
    }
}
