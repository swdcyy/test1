package com.kwai.feature.post.api.componet.prettify.makeup.model.StagFactorykscomponentsprettifymodel;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupSuite;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupSuite$TypeAdapter;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupPart;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupPart$TypeAdapter;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupMaterial;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupMaterial$TypeAdapter;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupGroup;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupGroup$TypeAdapter;

public final class StagFactorykscomponentsprettifymodel implements j	// class@001301
{

    public void StagFactorykscomponentsprettifymodel(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactorykscomponentsprettifymodel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Class rawType = p1.getRawType();
       if (rawType == MakeupSuite.class) {
          return new MakeupSuite$TypeAdapter(p0);
       }
       if (rawType == MakeupPart.class) {
          return new MakeupPart$TypeAdapter(p0);
       }
       if (rawType == MakeupMaterial.class) {
          return new MakeupMaterial$TypeAdapter(p0);
       }
       if (rawType == MakeupGroup.class) {
          return new MakeupGroup$TypeAdapter(p0);
       }
       return null;
    }
}
