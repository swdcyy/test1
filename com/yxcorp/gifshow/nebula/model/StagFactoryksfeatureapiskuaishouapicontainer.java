package com.yxcorp.gifshow.nebula.model.StagFactoryksfeatureapiskuaishouapicontainer;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.nebula.model.SideBarButton;
import com.yxcorp.gifshow.nebula.model.SideBarButton$TypeAdapter;

public final class StagFactoryksfeatureapiskuaishouapicontainer implements j	// class@002156
{

    public void StagFactoryksfeatureapiskuaishouapicontainer(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactoryksfeatureapiskuaishouapicontainer.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1.getRawType() == SideBarButton.class) {
          return new SideBarButton$TypeAdapter(p0);
       }
       return null;
    }
}
