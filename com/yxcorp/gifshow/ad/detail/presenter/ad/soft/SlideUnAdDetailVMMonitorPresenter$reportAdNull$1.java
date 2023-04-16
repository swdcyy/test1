package com.yxcorp.gifshow.ad.detail.presenter.ad.soft.SlideUnAdDetailVMMonitorPresenter$reportAdNull$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.google.gson.JsonObject;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class SlideUnAdDetailVMMonitorPresenter$reportAdNull$1 extends Lambda implements l	// class@001617
{
    public static final SlideUnAdDetailVMMonitorPresenter$reportAdNull$1 INSTANCE;

    static {
       SlideUnAdDetailVMMonitorPresenter$reportAdNull$1.INSTANCE = new SlideUnAdDetailVMMonitorPresenter$reportAdNull$1();
    }
    public void SlideUnAdDetailVMMonitorPresenter$reportAdNull$1(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(JsonObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlideUnAdDetailVMMonitorPresenter$reportAdNull$1.class, "1")) {
          return;
       }
       a.p(p0, "jsonObject");
       p0.c0("error_type", "1");
       return;
    }
}
