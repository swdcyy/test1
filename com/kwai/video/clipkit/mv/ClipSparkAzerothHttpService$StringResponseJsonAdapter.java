package com.kwai.video.clipkit.mv.ClipSparkAzerothHttpService$StringResponseJsonAdapter;
import com.google.gson.b;
import zk.i;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import x97.p;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonObject;
import java.lang.reflect.ParameterizedType;
import ca7.l;
import zk.h;
import java.lang.RuntimeException;

public class ClipSparkAzerothHttpService$StringResponseJsonAdapter implements b, i	// class@001ab1
{

    public void ClipSparkAzerothHttpService$StringResponseJsonAdapter(){
       super();
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       return this.deserialize(p0, p1, p2);
    }
    public p deserialize(JsonElement p0,Type p1,a p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, ClipSparkAzerothHttpService$StringResponseJsonAdapter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       object oobject = p1.getActualTypeArguments()[0];
       int i = l.b(p0, "result", 0);
       String str = l.c(p0, "error_msg", null);
       JsonElement jsonElement = l.a(p0, "data");
       if (jsonElement == null) {
          jsonElement = p0;
       }
       String str1 = (oobject == String.class)? p0.toString(): p2.c(jsonElement, oobject);
       return new p(str1, i, str);
    }
    public JsonElement serialize(Object p0,Type p1,h p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ClipSparkAzerothHttpService$StringResponseJsonAdapter.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       throw new RuntimeException("Response can\'t to json");
    }
}
