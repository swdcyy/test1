package com.yxcorp.gifshow.models.StagFactorykscomponentslivecommonmodel;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.models.Gift;
import com.yxcorp.gifshow.models.Gift$TypeAdapter;

public final class StagFactorykscomponentslivecommonmodel implements j	// class@001fbe
{

    public void StagFactorykscomponentslivecommonmodel(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactorykscomponentslivecommonmodel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1.getRawType() == Gift.class) {
          return new Gift$TypeAdapter(p0);
       }
       return null;
    }
}
