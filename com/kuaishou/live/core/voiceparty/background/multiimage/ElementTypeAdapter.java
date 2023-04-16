package com.kuaishou.live.core.voiceparty.background.multiimage.ElementTypeAdapter;
import com.google.gson.b;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ho2.d;
import kotlin.jvm.internal.a;
import com.google.gson.JsonObject;
import com.google.gson.Gson;
import com.kuaishou.live.core.voiceparty.background.multiimage.Image;
import ho2.g;
import ho2.b;
import ho2.n;

public final class ElementTypeAdapter implements b	// class@00134d
{

    public void ElementTypeAdapter(){
       super();
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       n on;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, ElementTypeAdapter.class, "1");
       if (obj != PatchProxyResult.class) {
       }else {
          a.p(p0, "json");
          a.p(p1, "typeOfT");
          a.p(p2, "context");
          JsonElement jsonElement = p0.r().e0("type");
          a.o(jsonElement, "jsonObject.get\(ElementType.TYPE\)");
          String str = jsonElement.w();
          if (str != null) {
             int i = str.hashCode();
             if (i != -1332194002) {
                if (i != -1096937569) {
                   if (i == 0x5faa95b && str.equals("image")) {
                      p0 = new Gson().c(p0, Image.class);
                      a.o(p0, "Gson\(\).fromJson\(json, Image::class.java\)");
                   label_00a3 :
                      obj = on;
                   }
                }else if(str.equals("lottie")){
                   p0 = new Gson().c(p0, g.class);
                   a.o(p0, "Gson\(\).fromJson\(json, Lottie::class.java\)");
                   goto label_00a3 ;
                }
             }else if(str.equals("background")){
                on = new Gson().c(p0, b.class);
                a.o(on, "Gson\(\).fromJson\(json, Background::class.java\)");
                goto label_00a3 ;
             }
          }
          on = new n();
          goto label_00a3 ;
       }
       return obj;
    }
}
