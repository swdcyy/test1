package com.kuaishou.live.external.invoke.deserializer.topic.LiveTopicActivityItemDeserializer;
import com.google.gson.b;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.external.invoke.deserializer.topic.LiveTopicActivityBasicItemInfo;
import com.google.gson.JsonObject;
import ekd.k0;
import com.google.gson.Gson;
import com.kuaishou.live.external.invoke.deserializer.topic.LiveTopicImageTextListActivityItemInfo;
import com.kuaishou.live.external.invoke.deserializer.topic.LiveTopicImageActivityItemInfo;
import com.kuaishou.live.external.invoke.deserializer.topic.LiveTopicTextActivityItemInfo;

public class LiveTopicActivityItemDeserializer implements b	// class@0008c5
{

    public void LiveTopicActivityItemDeserializer(){
       super();
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveTopicActivityItemDeserializer.class, "2");
       if (p1 != PatchProxyResult.class) {
       }else {
          int i = k0.f(p0, "type", -1);
          if (i != 1) {
             if (i != 2) {
                i = (i != 3)? null: new Gson().c(p0, LiveTopicImageTextListActivityItemInfo.class);
             }else {
                i = new Gson().c(p0, LiveTopicImageActivityItemInfo.class);
             }
          }else {
             i = new Gson().c(p0, LiveTopicTextActivityItemInfo.class);
          }
       }
       return p1;
    }
}
