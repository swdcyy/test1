package com.kwai.component.kcube.model.model.StagFactorykscomponentskcubekcubemodel;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.component.kcube.model.model.BarInfo$Invalid;
import com.kwai.component.kcube.model.model.BarInfo$Invalid$TypeAdapter;
import com.kwai.component.kcube.model.model.BarInfo$Bubble;
import com.kwai.component.kcube.model.model.BarInfo$Bubble$TypeAdapter;
import com.kwai.component.kcube.model.model.BarInfo$Background;
import com.kwai.component.kcube.model.model.BarInfo$Background$TypeAdapter;
import com.kwai.component.kcube.model.model.BarInfo;
import com.kwai.component.kcube.model.model.BarInfo$TypeAdapter;

public final class StagFactorykscomponentskcubekcubemodel implements j	// class@000993
{

    public void StagFactorykscomponentskcubekcubemodel(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactorykscomponentskcubekcubemodel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Class rawType = p1.getRawType();
       if (rawType == BarInfo$Invalid.class) {
          return new BarInfo$Invalid$TypeAdapter(p0);
       }
       if (rawType == BarInfo$Bubble.class) {
          return new BarInfo$Bubble$TypeAdapter(p0);
       }
       if (rawType == BarInfo$Background.class) {
          return new BarInfo$Background$TypeAdapter(p0);
       }
       if (rawType == BarInfo.class) {
          return new BarInfo$TypeAdapter(p0);
       }
       return null;
    }
}
