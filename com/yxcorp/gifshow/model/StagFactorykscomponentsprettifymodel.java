package com.yxcorp.gifshow.model.StagFactorykscomponentsprettifymodel;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.OperationMaskTag;
import com.yxcorp.gifshow.model.OperationMaskTag$TypeAdapter;

public final class StagFactorykscomponentsprettifymodel implements j	// class@001e95
{

    public void StagFactorykscomponentsprettifymodel(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactorykscomponentsprettifymodel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1.getRawType() == OperationMaskTag.class) {
          return new OperationMaskTag$TypeAdapter(p0);
       }
       return null;
    }
}
