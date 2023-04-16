package com.kuaishou.android.model.response.StagFactorykscomponentsresource;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.response.ConfigResponse;
import com.kuaishou.android.model.response.ConfigResponse$TypeAdapter;

public final class StagFactorykscomponentsresource implements j	// class@000e96
{

    public void StagFactorykscomponentsresource(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactorykscomponentsresource.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1.getRawType() == ConfigResponse.class) {
          return new ConfigResponse$TypeAdapter(p0);
       }
       return null;
    }
}
