package com.yxcorp.gifshow.easteregg.model.PokeConfigDeserializer;
import com.google.gson.b;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import daa.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonObject;
import kotlin.jvm.internal.a;
import daa.k;
import com.yxcorp.gifshow.easteregg.model.PokeGroup;
import daa.j;
import com.yxcorp.gifshow.easteregg.model.PokeGroup$a;
import daa.g$a;

public final class PokeConfigDeserializer implements b	// class@001ad9
{
    public static final PokeConfigDeserializer INSTANCE;

    static {
       PokeConfigDeserializer.INSTANCE = new PokeConfigDeserializer();
    }
    public void PokeConfigDeserializer(){
       super();
    }
    public g deserialize(JsonElement p0,Type p1,a p2){
       PokeGroup$a a;
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, PokeConfigDeserializer.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       if (p0 == null) {
          return g.b.a();
       }
       if (p2 == null) {
          return g.b.a();
       }
       JsonObject jsonObject = p0.r();
       JsonElement jsonElement = jsonObject.e0("type");
       a.o(jsonElement, "jsonObj[\"type\"]");
       String str = jsonElement.w();
       JsonElement jsonElement1 = jsonObject.e0("pokeConfig");
       if (str != null) {
          int i = str.hashCode();
          if (i != -562711993) {
             if (i == 0x7b51478e && str.equals("newyear-feed")) {
                p2 = p2.c(jsonElement1, k.class);
                a.o(p2, "context.deserialize\(grou¡­pNewYearFeed::class.java\)");
             label_0070 :
                jsonObject = jsonObject.e0("id");
                a.o(jsonObject, "jsonObj[\"id\"]");
                a.o(str, "type");
                return new g(jsonObject.p(), str, a);
             }
          }else if(str.equals("firework")){
             a = p2.c(jsonElement1, j.class);
             a.o(a, "context.deserialize\(grou¡­roupFirework::class.java\)");
             goto label_0070 ;
          }
       }
       a = PokeGroup$a.a;
       goto label_0070 ;
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       return this.deserialize(p0, p1, p2);
    }
}
