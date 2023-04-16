package com.yxcorp.gifshow.activity.info.StagFactorykscomponentsactivityinfo;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.activity.info.ActivityInfoStartupCommonPojo;
import com.yxcorp.gifshow.activity.info.ActivityInfoStartupCommonPojo$TypeAdapter;

public final class StagFactorykscomponentsactivityinfo implements j	// class@001350
{

    public void StagFactorykscomponentsactivityinfo(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactorykscomponentsactivityinfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1.getRawType() == ActivityInfoStartupCommonPojo.class) {
          return new ActivityInfoStartupCommonPojo$TypeAdapter(p0);
       }
       return null;
    }
}
