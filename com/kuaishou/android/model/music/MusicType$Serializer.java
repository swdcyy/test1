package com.kuaishou.android.model.music.MusicType$Serializer;
import zk.i;
import com.google.gson.b;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import com.kuaishou.android.model.music.MusicType;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import zk.h;
import java.lang.Integer;

public class MusicType$Serializer implements i, b	// class@000e81
{

    public void MusicType$Serializer(){
       super();
    }
    public MusicType deserialize(JsonElement p0,Type p1,a p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, MusicType$Serializer.class, "2");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       try{
          return MusicType.valueOf(p0.u().intValue());
       }catch(com.google.gson.JsonParseException e0){
          return MusicType.ELECTRICAL;
       }
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       return this.deserialize(p0, p1, p2);
    }
    public JsonElement serialize(MusicType p0,Type p1,h p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, MusicType$Serializer.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       return p2.a(Integer.valueOf(p0.mValue));
    }
    public JsonElement serialize(Object p0,Type p1,h p2){
       return this.serialize(p0, p1, p2);
    }
}
