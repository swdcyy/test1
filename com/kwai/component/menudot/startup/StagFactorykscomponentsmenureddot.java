package com.kwai.component.menudot.startup.StagFactorykscomponentsmenureddot;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.component.menudot.startup.MenuRedDotStartupPojo;
import com.kwai.component.menudot.startup.MenuRedDotStartupPojo$TypeAdapter;

public final class StagFactorykscomponentsmenureddot implements j	// class@0009c2
{

    public void StagFactorykscomponentsmenureddot(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactorykscomponentsmenureddot.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1.getRawType() == MenuRedDotStartupPojo.class) {
          return new MenuRedDotStartupPojo$TypeAdapter(p0);
       }
       return null;
    }
}