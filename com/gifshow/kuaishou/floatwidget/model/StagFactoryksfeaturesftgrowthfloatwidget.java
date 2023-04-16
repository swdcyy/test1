package com.gifshow.kuaishou.floatwidget.model.StagFactoryksfeaturesftgrowthfloatwidget;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.gifshow.kuaishou.floatwidget.model.ClientExtraParams;
import com.gifshow.kuaishou.floatwidget.model.ClientExtraParams$TypeAdapter;

public final class StagFactoryksfeaturesftgrowthfloatwidget implements j	// class@0015d0
{

    public void StagFactoryksfeaturesftgrowthfloatwidget(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactoryksfeaturesftgrowthfloatwidget.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1.getRawType() == ClientExtraParams.class) {
          return new ClientExtraParams$TypeAdapter(p0);
       }
       return null;
    }
}
