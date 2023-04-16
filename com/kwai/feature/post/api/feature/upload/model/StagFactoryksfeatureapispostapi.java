package com.kwai.feature.post.api.feature.upload.model.StagFactoryksfeatureapispostapi;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.post.api.feature.upload.model.UploadResult;
import com.kwai.feature.post.api.feature.upload.model.UploadResult$TypeAdapter;

public final class StagFactoryksfeatureapispostapi implements j	// class@0013e3
{

    public void StagFactoryksfeatureapispostapi(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactoryksfeatureapispostapi.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1.getRawType() == UploadResult.class) {
          return new UploadResult$TypeAdapter(p0);
       }
       return null;
    }
}
