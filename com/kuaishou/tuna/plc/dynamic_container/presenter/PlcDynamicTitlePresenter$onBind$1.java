package com.kuaishou.tuna.plc.dynamic_container.presenter.PlcDynamicTitlePresenter$onBind$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.kuaishou.tuna.plc.dynamic_container.presenter.PlcDynamicTitlePresenter;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.tuna.plc.dynamic_container.view.navigate.PlcDynamicNavigationBar;
import py4.b;

public final class PlcDynamicTitlePresenter$onBind$1 implements DefaultLifecycleObserver	// class@000ff3
{
    public final PlcDynamicTitlePresenter b;

    public void PlcDynamicTitlePresenter$onBind$1(PlcDynamicTitlePresenter p0){
       this.b = p0;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       a.b(this, p0);
    }
    public void onPause(LifecycleOwner p0){
       a.c(this, p0);
    }
    public void onResume(LifecycleOwner p0){
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcDynamicTitlePresenter$onBind$1.class, "1")) {
          return;
       }
       a.p(p0, "owner");
       PlcDynamicTitlePresenter$onBind$1 tb = this.b;
       PlcDynamicNavigationBar plcDynamicNa = tb.X8();
       if (plcDynamicNa != null) {
          b searchInfo = plcDynamicNa.getSearchInfo();
          if (searchInfo != null) {
             str = searchInfo.a();
          label_0024 :
             tb.P8(str, "unknown", true);
             tb = this.b;
             tb.z = true;
             tb.Z8(true);
             return;
          }
       }
       str = null;
       goto label_0024 ;
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcDynamicTitlePresenter$onBind$1.class, "2")) {
          return;
       }
       a.p(p0, "owner");
       PlcDynamicTitlePresenter$onBind$1 tb = this.b;
       tb.z = false;
       tb.Z8(false);
       return;
    }
}
