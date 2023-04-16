package com.yxcorp.gifshow.postwork.UploadInfoDeserializer;
import com.google.gson.b;
import java.lang.Object;
import zk.d;
import f36.a;
import com.yxcorp.gifshow.postwork.AtlasSourceInfoDeserializer;
import java.lang.Class;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext$VideoContextTypeAdapter;
import java.io.Serializable;
import com.yxcorp.gifshow.postwork.SerializableDefaultObject$a;
import java.lang.reflect.Type;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.a;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.upload.UploadInfo;
import com.google.gson.JsonObject;
import iq.a;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadRequest$UploadPostType;
import com.yxcorp.gifshow.upload.RickonWholeUploadInfo;

public class UploadInfoDeserializer implements b	// class@0010be
{
    public Gson a;

    public void UploadInfoDeserializer(){
       super();
       d uod = new d();
       uod.h(a.class, new AtlasSourceInfoDeserializer());
       uod.h(VideoContext.class, new VideoContext$VideoContextTypeAdapter());
       uod.f(Serializable.class, new SerializableDefaultObject$a());
       this.a = uod.b();
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       Object[] this;
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, UploadInfoDeserializer.class, "1");
       if (p1 != PatchProxyResult.class) {
       }else {
          p1 = p0;
          this = new Object[0];
          a.D().s("PostWorkInfoCacheHelper", "#UploadInfoDeserializer deserialize obj: "+p1, this);
          IUploadRequest$UploadPostType uploadPostTy = p2.c(p1.e0("mUploadPostType"), IUploadRequest$UploadPostType.class);
          Object[] objArray = new Object[0];
          a.D().s("PostWorkInfoCacheHelper", "#UploadInfoDeserializer deserialize uploadType="+uploadPostTy, objArray);
          uploadPostTy = (uploadPostTy != IUploadRequest$UploadPostType.SHOP && (uploadPostTy == IUploadRequest$UploadPostType.JUXING || uploadPostTy == IUploadRequest$UploadPostType.SCHOOL))? this.a.c(p0, RickonWholeUploadInfo.class): this.a.c(p0, UploadInfo.class);
       }
       return p1;
    }
}
