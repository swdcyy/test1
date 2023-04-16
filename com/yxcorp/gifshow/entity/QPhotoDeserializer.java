package com.yxcorp.gifshow.entity.QPhotoDeserializer;
import com.google.gson.b;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;

public class QPhotoDeserializer implements b	// class@000d70
{

    public void QPhotoDeserializer(){
       super();
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       QPhoto qPhoto = PatchProxy.applyThreeRefs(p0, p1, p2, this, QPhotoDeserializer.class, "1");
       if (qPhoto != PatchProxyResult.class) {
       }else {
          qPhoto = new QPhoto(p2.c(p0, BaseFeed.class));
       }
       return qPhoto;
    }
}
