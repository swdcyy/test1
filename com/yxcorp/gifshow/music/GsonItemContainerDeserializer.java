package com.yxcorp.gifshow.music.GsonItemContainerDeserializer;
import com.google.gson.b;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kob.j;

public class GsonItemContainerDeserializer implements b	// class@00124a
{

    public void GsonItemContainerDeserializer(){
       super();
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       j oj = PatchProxy.applyThreeRefs(p0, p1, p2, this, GsonItemContainerDeserializer.class, "2");
       if (oj != PatchProxyResult.class) {
       }else {
          oj = new j(p0);
       }
       return oj;
    }
}
