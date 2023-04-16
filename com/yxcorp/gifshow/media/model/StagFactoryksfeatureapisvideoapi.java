package com.yxcorp.gifshow.media.model.StagFactoryksfeatureapisvideoapi;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.media.model.CameraUnitConfig;
import com.yxcorp.gifshow.media.model.CameraUnitConfig$TypeAdapter;
import com.yxcorp.gifshow.media.model.CameraPageConfig;
import com.yxcorp.gifshow.media.model.CameraPageConfig$TypeAdapter;
import com.yxcorp.gifshow.media.model.CameraConfig;
import com.yxcorp.gifshow.media.model.CameraConfig$TypeAdapter;

public final class StagFactoryksfeatureapisvideoapi implements j	// class@001d18
{

    public void StagFactoryksfeatureapisvideoapi(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactoryksfeatureapisvideoapi.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Class rawType = p1.getRawType();
       if (rawType == CameraUnitConfig.class) {
          return new CameraUnitConfig$TypeAdapter(p0);
       }
       if (rawType == CameraPageConfig.class) {
          return new CameraPageConfig$TypeAdapter(p0);
       }
       if (rawType == CameraConfig.class) {
          return new CameraConfig$TypeAdapter(p0);
       }
       return null;
    }
}
