package com.kwai.component.kcube.model.startup.StagFactorykscomponentskcubekcubemodel;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.component.kcube.model.startup.StartupPojo;
import com.kwai.component.kcube.model.startup.StartupPojo$TypeAdapter;

public final class StagFactorykscomponentskcubekcubemodel implements j	// class@00099c
{

    public void StagFactorykscomponentskcubekcubemodel(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactorykscomponentskcubekcubemodel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1.getRawType() == StartupPojo.class) {
          return new StartupPojo$TypeAdapter(p0);
       }
       return null;
    }
}
