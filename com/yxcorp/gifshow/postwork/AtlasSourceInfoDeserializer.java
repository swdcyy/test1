package com.yxcorp.gifshow.postwork.AtlasSourceInfoDeserializer;
import com.google.gson.b;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import iq.a;
import java.lang.StringBuilder;
import q87.c;
import com.google.gson.JsonObject;
import com.kwai.feature.post.api.feature.encode.model.AtlasInfo;
import fg6.a;
import enc.y;
import com.google.gson.Gson;
import enc.a;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;
import enc.x;

public class AtlasSourceInfoDeserializer implements b	// class@0010ac
{

    public void AtlasSourceInfoDeserializer(){
       super();
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       Object[] objArray1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, AtlasSourceInfoDeserializer.class, "1");
       if (p1 != patchProxyRe) {
          return p1;
       }
       Object[] objArray = new Object[0];
       a.D().s("PostWorkInfoCacheHelper", "AtlasSourceInfoDeserializer deserialize: "+p0, objArray);
       p1 = PatchProxy.applyTwoRefs(p2, p0, this, AtlasSourceInfoDeserializer.class, "2");
       if (p1 == patchProxyRe) {
          String str = "atlasInfo";
          if (p0.e0(str) != null) {
             objArray = new Object[0];
             a.D().s("PostWorkInfoCacheHelper", "AtlasSourceInfoDeserializer deserializeAtlasUploadSource atlasInfo is not null", objArray);
             AtlasInfo mMixedType = p2.c(p0.e0(str), AtlasInfo.class).mMixedType;
             if (mMixedType == 1 || mMixedType == 2) {
                objArray1 = new Object[0];
                a.D().s("PostWorkInfoCacheHelper", "AtlasSourceInfoDeserializer deserializeAtlasUploadSource atlas info", objArray1);
                mMixedType = a.a.c(p0, a.class);
             }else if(mMixedType == 3){
                objArray1 = new Object[0];
                a.D().s("PostWorkInfoCacheHelper", "AtlasSourceInfoDeserializer deserializeAtlasUploadSource single picture", objArray1);
                mMixedType = a.a.c(p0, y.class);
             }
          }
          str = "ktvInfo";
          if (p0.e0(str) != null && p2.c(p0.e0(str), KtvInfo.class).getKaraokeType() == 2) {
             objArray1 = new Object[0];
             a.D().s("PostWorkInfoCacheHelper", "AtlasSourceInfoDeserializer deserializeAtlasUploadSource ktv song", objArray1);
             str = a.a.c(p0, x.class);
          }else {
             str = null;
          }
       }
       return p1;
    }
}
