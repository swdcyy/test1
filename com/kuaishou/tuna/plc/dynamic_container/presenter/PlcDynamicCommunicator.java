package com.kuaishou.tuna.plc.dynamic_container.presenter.PlcDynamicCommunicator;
import ly4.a;
import hy4.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.tuna.plc.dynamic_container.bridge.model.PlcDynamicContainerStatusInfo;
import com.kuaishou.tuna.plc.dynamic_container.util.PlcDynamicUtils;
import java.lang.StringBuilder;
import com.kuaishou.tuna.plc.dynamic_container.logger.PlcDynamicLogger;
import com.kuaishou.tuna.plc.dynamic_container.model.PlcDynamicSearchInfo;
import com.kuaishou.tuna.plc.dynamic_container_api.PlcDynamicContainerConfig;
import com.kuaishou.tuna.plc.dynamic_container_api.PlcDynamicTitleConfig;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.tuna.plc.dynamic_container_api.PlcDynamicTitleIconInfo;
import iy4.b;
import js6.a;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import fg6.a;
import com.google.gson.Gson;
import java.lang.Throwable;
import com.kwai.yoda.event.d;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.Integer;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.tuna.plc.dynamic_container.presenter.PlcDynamicCommunicator$onClose$1;
import msd.a;

public final class PlcDynamicCommunicator implements a	// class@000ff0
{
    public int a;
    public a b;

    public void PlcDynamicCommunicator(a p0){
       super();
       this.b = p0;
    }
    public void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcDynamicCommunicator.class, "3")) {
          return;
       }
       a.p(p0, "container");
       PlcDynamicContainerStatusInfo plcDynamicCo = PlcDynamicUtils.q(p0);
       PlcDynamicContainerStatusInfo mStatus = plcDynamicCo.mStatus;
       if (mStatus == 3 || this.a != mStatus) {
          this.a = mStatus;
          PlcDynamicLogger.a("callback status change:"+plcDynamicCo.mStatus);
          this.e(plcDynamicCo, "tuna_cod_on_sliding_status_change");
       }
       return;
    }
    public void b(PlcDynamicSearchInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcDynamicCommunicator.class, "4")) {
          return;
       }
       a.p(p0, "searchInfo");
       PlcDynamicCommunicator tb = this.b;
       if (tb != null) {
          PlcDynamicContainerConfig plcDynamicCo = tb.yg();
          if (plcDynamicCo != null) {
             PlcDynamicTitleConfig titleConfig = plcDynamicCo.getTitleConfig();
             if (titleConfig != null && titleConfig.getUseSearchBar() == true) {
                this.e(p0, "tuna_cod_on_search_click");
             }
          }
       }
       return;
    }
    public void c(PlcDynamicSearchInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcDynamicCommunicator.class, "5")) {
          return;
       }
       a.p(p0, "searchInfo");
       PlcDynamicCommunicator tb = this.b;
       if (tb != null) {
          PlcDynamicContainerConfig plcDynamicCo = tb.yg();
          if (plcDynamicCo != null) {
             PlcDynamicTitleConfig titleConfig = plcDynamicCo.getTitleConfig();
             if (titleConfig == null || (titleConfig.getUseSearchBar() == true && !TextUtils.x(p0.getText()))) {
                PlcDynamicLogger.a("callback status onSearchShow:"+p0.getText());
                this.e(p0, "tuna_cod_on_search_text_show");
             }
          }
       }
       return;
    }
    public void d(PlcDynamicTitleIconInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcDynamicCommunicator.class, "1")) {
          return;
       }
       if (p0 != null) {
          this.e(p0, "tuna_cod_on_icon_click");
       }
       return;
    }
    public final void e(Object p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PlcDynamicCommunicator.class, "6")) {
          return;
       }
       PlcDynamicCommunicator tb = this.b;
       if (tb != null) {
          b uob = tb.Ge();
          if (uob != null) {
             PlcDynamicCommunicator tb1 = this.b;
             if (tb1 != null) {
                PlcDynamicContainerConfig plcDynamicCo = tb1.yg();
                if (plcDynamicCo != null) {
                   PlcDynamicLogger.b(p0, "dispatch "+p1+" for biz container");
                   if (PlcDynamicUtils.l(plcDynamicCo)) {
                      a.b.X8(uob.getPage(), p1, p0);
                   }else if(!PlcDynamicUtils.o(plcDynamicCo) || PatchProxy.applyVoidThreeRefs(p0, uob, p1, this, PlcDynamicCommunicator.class, "7")){
                      Fragment page = uob.getPage();
                      if (!page instanceof KwaiYodaWebViewFragment) {
                         page = null;
                      }
                      if (page != null) {
                         try{
                            if (p0 != null) {
                               p0 = a.a.q(p0);
                            label_007c :
                               d.f().c(page.r, p1, p0);
                            }
                         }catch(java.lang.Exception e8){
                            PlcDynamicLogger.j("convert json to web failed!", e8);
                         }
                         p0 = "";
                         goto label_007c ;
                      }
                   }
                }
             }
          }
       }
       return;
    }
    public void f2(int p0){
       String str;
       PlcDynamicCommunicator plcDynamicCo = PlcDynamicCommunicator.class;
       if (PatchProxy.isSupport(plcDynamicCo) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, plcDynamicCo, "2")) {
          return;
       }
       plcDynamicCo = this.b;
       if (plcDynamicCo != null) {
          b uob = plcDynamicCo.Ge();
          if (uob != null) {
             PlcDynamicCommunicator tb = this.b;
             if (tb != null) {
                PlcDynamicContainerConfig plcDynamicCo1 = tb.yg();
                if (plcDynamicCo1 != null) {
                   i3 oi3 = i3.f();
                   oi3.c("reason", Integer.valueOf(p0));
                   PlcDynamicCommunicator$onClose$1 oonClose$1 = new PlcDynamicCommunicator$onClose$1(oi3);
                   Fragment uFragment = null;
                   if (!PatchProxy.applyVoidOneRefs(oonClose$1, uFragment, PlcDynamicLogger.class, "7")) {
                      a.p(oonClose$1, "msgBlock");
                      if (PlcDynamicUtils.k()) {
                         PlcDynamicLogger.e("PlcDynamicLogger", oonClose$1.invoke(), false, 4, uFragment);
                      }else {
                         try{
                            str = oonClose$1.invoke();
                         }catch(java.lang.Exception e0){
                            str = "";
                         }
                         if (!TextUtils.x(str)) {
                            PlcDynamicLogger.e("PlcDynamicLogger", str, false, 4, uFragment);
                         }
                      }
                   }
                   if (PlcDynamicUtils.l(plcDynamicCo1)) {
                      a.b.X8(uob.getPage(), "tuna_cod_on_close", oi3.toString());
                   }else if(PlcDynamicUtils.o(plcDynamicCo1)){
                      Fragment page = uob.getPage();
                      if (page != null) {
                         if (page instanceof KwaiYodaWebViewFragment) {
                            uFragment = page;
                         }
                         if (uFragment != null) {
                            d.f().c(uFragment.r, "tuna_cod_on_close", oi3.toString());
                         }
                      }
                   }
                }
             }
          }
       }
       return;
    }
    public void onDestroy(){
       this.b = null;
    }
}
