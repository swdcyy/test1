package com.kuaishou.live.common.course.model.StagFactoryksfeaturesftliveliveshell;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.course.model.LiveCourseConfig;
import com.kuaishou.live.common.course.model.LiveCourseConfig$TypeAdapter;

public final class StagFactoryksfeaturesftliveliveshell implements j	// class@0017d8
{

    public void StagFactoryksfeaturesftliveliveshell(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactoryksfeaturesftliveliveshell.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1.getRawType() == LiveCourseConfig.class) {
          return new LiveCourseConfig$TypeAdapter(p0);
       }
       return null;
    }
}
