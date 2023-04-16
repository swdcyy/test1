package com.kuaishou.merchant.home2.dynamic.atmosphere.MallAtmospherePresenter$onUnbind$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kuaishou.merchant.home2.dynamic.atmosphere.MallAtmospherePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.google.gson.JsonElement;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.CallableReference;

public final class MallAtmospherePresenter$onUnbind$1 extends FunctionReferenceImpl implements l	// class@00171d
{

    public void MallAtmospherePresenter$onUnbind$1(MallAtmospherePresenter p0){
       super(1, p0, MallAtmospherePresenter.class, "onGetGlobalBiz", "onGetGlobalBiz\(Lcom/google/gson/JsonElement;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(JsonElement p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MallAtmospherePresenter$onUnbind$1.class, "1")) {
          return;
       }
       this.receiver.X8(p0);
       return;
    }
}
