package com.yxcorp.gifshow.growth.freetraffic.GrowthFreeTrafficPresenter$onBind$$inlined$runCatching$lambda$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.growth.freetraffic.GrowthFreeTrafficPresenter;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;

public final class GrowthFreeTrafficPresenter$onBind$$inlined$runCatching$lambda$1 extends Lambda implements a	// class@001381
{
    public final GrowthFreeTrafficPresenter this$0;

    public void GrowthFreeTrafficPresenter$onBind$$inlined$runCatching$lambda$1(GrowthFreeTrafficPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public final Boolean invoke(){
       Object[] objArray = null;
       GrowthFreeTrafficPresenter$onBind$$inlined$runCatching$lambda$1 obj = PatchProxy.applyWithListener(objArray, this, GrowthFreeTrafficPresenter$onBind$$inlined$runCatching$lambda$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0;
       GrowthFreeTrafficPresenter p = obj.p;
       if (p != null) {
          objArray = Boolean.valueOf(p.add(obj.t));
       }
       PatchProxy.onMethodExit(GrowthFreeTrafficPresenter$onBind$$inlined$runCatching$lambda$1.class, "1");
       return objArray;
    }
    public Object invoke(){
       return this.invoke();
    }
}
