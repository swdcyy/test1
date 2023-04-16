package com.kuaishou.growth.taskcenter.model.StagFactoryksfeaturesftgrowthtaskcenter;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.growth.taskcenter.model.TaskPendantCommonParams;
import com.kuaishou.growth.taskcenter.model.TaskPendantCommonParams$TypeAdapter;

public final class StagFactoryksfeaturesftgrowthtaskcenter implements j	// class@000745
{

    public void StagFactoryksfeaturesftgrowthtaskcenter(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactoryksfeaturesftgrowthtaskcenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1.getRawType() == TaskPendantCommonParams.class) {
          return new TaskPendantCommonParams$TypeAdapter(p0);
       }
       return null;
    }
}
