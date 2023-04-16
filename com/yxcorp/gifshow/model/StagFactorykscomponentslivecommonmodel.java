package com.yxcorp.gifshow.model.StagFactorykscomponentslivecommonmodel;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.NotifySubCount;
import com.yxcorp.gifshow.model.NotifySubCount$TypeAdapter;
import com.yxcorp.gifshow.model.NotifyCount;
import com.yxcorp.gifshow.model.NotifyCount$TypeAdapter;

public final class StagFactorykscomponentslivecommonmodel implements j	// class@001e94
{

    public void StagFactorykscomponentslivecommonmodel(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactorykscomponentslivecommonmodel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Class rawType = p1.getRawType();
       if (rawType == NotifySubCount.class) {
          return new NotifySubCount$TypeAdapter(p0);
       }
       if (rawType == NotifyCount.class) {
          return new NotifyCount$TypeAdapter(p0);
       }
       return null;
    }
}
