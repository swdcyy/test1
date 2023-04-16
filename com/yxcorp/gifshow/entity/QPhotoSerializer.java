package com.yxcorp.gifshow.entity.QPhotoSerializer;
import zk.i;
import java.lang.Object;
import java.lang.reflect.Type;
import zk.h;
import com.google.gson.JsonElement;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class QPhotoSerializer implements i	// class@000d71
{

    public void QPhotoSerializer(){
       super();
    }
    public JsonElement serialize(Object p0,Type p1,h p2){
       JsonElement jsonElement = PatchProxy.applyThreeRefs(p0, p1, p2, this, QPhotoSerializer.class, "1");
       if (jsonElement != PatchProxyResult.class) {
       }else {
          jsonElement = p2.a(p0.mEntity);
       }
       return jsonElement;
    }
}
