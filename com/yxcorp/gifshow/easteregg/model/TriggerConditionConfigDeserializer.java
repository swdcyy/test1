package com.yxcorp.gifshow.easteregg.model.TriggerConditionConfigDeserializer;
import com.google.gson.b;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import daa.l;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonObject;
import kotlin.jvm.internal.a;
import daa.c;
import com.yxcorp.gifshow.easteregg.model.ConditionConfig;
import com.yxcorp.gifshow.easteregg.model.ConditionConfig$a;
import daa.l$a;

public final class TriggerConditionConfigDeserializer implements b	// class@001ade
{
    public static final TriggerConditionConfigDeserializer INSTANCE;

    static {
       TriggerConditionConfigDeserializer.INSTANCE = new TriggerConditionConfigDeserializer();
    }
    public void TriggerConditionConfigDeserializer(){
       super();
    }
    public l deserialize(JsonElement p0,Type p1,a p2){
       ConditionConfig$a a;
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, TriggerConditionConfigDeserializer.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       if (p0 == null) {
          return l.b.a();
       }
       if (p2 == null) {
          return l.b.a();
       }
       JsonObject jsonObject = p0.r();
       JsonElement jsonElement = jsonObject.e0("type");
       a.o(jsonElement, "jsonObj[\"type\"]");
       String str = jsonElement.w();
       JsonElement jsonElement1 = jsonObject.e0("pokeConditionConfig");
       if (str == null || (str.hashCode() == 0x174b623a && str.equals("keywordsAndTime"))) {
          a = p2.c(jsonElement1, c.class);
          a.o(a, "context.deserialize\(conf¡­wordsAndTime::class.java\)");
       }else {
          a = ConditionConfig$a.a;
       }
       jsonObject = jsonObject.e0("id");
       a.o(jsonObject, "jsonObj[\"id\"]");
       a.o(str, "type");
       return new l(jsonObject.p(), str, a);
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       return this.deserialize(p0, p1, p2);
    }
}
