package com.yxcorp.gifshow.topic.StagFactorykscomponentslabeltag;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.topic.HomeLocalTopicConfig;
import com.yxcorp.gifshow.topic.HomeLocalTopicConfig$TypeAdapter;

public final class StagFactorykscomponentslabeltag implements j	// class@001da0
{

    public void StagFactorykscomponentslabeltag(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactorykscomponentslabeltag.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1.getRawType() == HomeLocalTopicConfig.class) {
          return new HomeLocalTopicConfig$TypeAdapter(p0);
       }
       return null;
    }
}
