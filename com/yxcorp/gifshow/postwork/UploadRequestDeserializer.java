package com.yxcorp.gifshow.postwork.UploadRequestDeserializer;
import com.google.gson.b;
import java.lang.Object;
import zk.d;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext$VideoContextTypeAdapter;
import java.lang.Class;
import java.io.Serializable;
import com.yxcorp.gifshow.postwork.SerializableDefaultObject$a;
import java.lang.reflect.Type;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.a;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.upload.UploadRequest;
import iq.a;
import java.lang.StringBuilder;
import q87.c;
import com.google.gson.JsonObject;

public class UploadRequestDeserializer implements b	// class@0010bf
{
    public Gson a;

    public void UploadRequestDeserializer(){
       super();
       d uod = new d();
       uod.h(VideoContext.class, new VideoContext$VideoContextTypeAdapter());
       uod.f(Serializable.class, new SerializableDefaultObject$a());
       this.a = uod.b();
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, UploadRequestDeserializer.class, "1");
       if (p1 != PatchProxyResult.class) {
       }else {
          Object[] objArray = new Object[0];
          a.D().s("PostWorkInfoCacheHelper", "UploadRequestDeserializer deserialize: "+p0, objArray);
          p1 = this.a.c(p0, UploadRequest.class);
       }
       return p1;
    }
}
