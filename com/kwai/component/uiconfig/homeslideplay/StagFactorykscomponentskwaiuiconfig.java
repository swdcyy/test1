package com.kwai.component.uiconfig.homeslideplay.StagFactorykscomponentskwaiuiconfig;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.component.uiconfig.homeslideplay.HomeSlidePlayStartupPojo;
import com.kwai.component.uiconfig.homeslideplay.HomeSlidePlayStartupPojo$TypeAdapter;

public final class StagFactorykscomponentskwaiuiconfig implements j	// class@000be9
{

    public void StagFactorykscomponentskwaiuiconfig(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactorykscomponentskwaiuiconfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1.getRawType() == HomeSlidePlayStartupPojo.class) {
          return new HomeSlidePlayStartupPojo$TypeAdapter(p0);
       }
       return null;
    }
}
