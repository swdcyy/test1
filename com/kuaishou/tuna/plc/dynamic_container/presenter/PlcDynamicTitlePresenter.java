package com.kuaishou.tuna.plc.dynamic_container.presenter.PlcDynamicTitlePresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.tuna.plc.dynamic_container.presenter.PlcDynamicTitlePresenter$mDragBarHeight$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.tuna.plc.dynamic_container.presenter.PlcDynamicTitlePresenter$mContainerRadius$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import com.kuaishou.tuna.plc.dynamic_container.presenter.PlcDynamicTitlePresenter$onBind$1;
import androidx.lifecycle.LifecycleObserver;
import com.kuaishou.tuna.plc.dynamic_container_api.PlcDynamicContainerConfig;
import com.kuaishou.tuna.plc.dynamic_container.view.navigate.PlcDynamicNavigationBar;
import java.lang.Integer;
import com.kuaishou.tuna.plc.dynamic_container.logger.PlcDynamicLogger;
import ly4.d;
import com.kuaishou.tuna.plc.dynamic_container.view.navigate.PlcDynamicNavigationBar$b;
import android.app.Activity;
import lnc.a1;
import android.widget.LinearLayout;
import ly4.e;
import com.kuaishou.tuna.plc.dynamic_container.view.a$a;
import com.kuaishou.tuna.plc.dynamic_container.view.PlcDynamicContainerLayout;
import com.kuaishou.tuna.plc.dynamic_container.presenter.PlcDynamicCommunicator;
import java.lang.Boolean;
import com.kuaishou.tuna.plc.dynamic_container.model.PlcDynamicSearchInfo;
import com.yxcorp.utility.TextUtils;
import kotlin.jvm.internal.a;
import java.util.List;
import com.kuaishou.tuna.plc.dynamic_container_api.PlcDynamicTitleConfig;
import hy4.a;
import java.lang.CharSequence;
import java.lang.StringBuilder;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.View;
import com.kuaishou.tuna.plc.dynamic_container.PlcDynamicContainerFragment;
import android.view.Window;

public final class PlcDynamicTitlePresenter extends PresenterV2	// class@000ff4
{
    public final p A;
    public final p B;
    public PlcDynamicContainerLayout p;
    public PlcDynamicNavigationBar q;
    public View r;
    public PlcDynamicContainerFragment s;
    public PlcDynamicContainerConfig t;
    public PlcDynamicTitleConfig u;
    public PlcDynamicCommunicator v;
    public Window w;
    public boolean x;
    public View y;
    public boolean z;

    public void PlcDynamicTitlePresenter(){
       super();
       this.A = s.c(PlcDynamicTitlePresenter$mDragBarHeight$2.INSTANCE);
       this.B = s.c(PlcDynamicTitlePresenter$mContainerRadius$2.INSTANCE);
    }
    public void E8(){
       PlcDynamicTitlePresenter plcDynamicTi = PlcDynamicTitlePresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, plcDynamicTi, "4")) {
          return;
       }
       PlcDynamicTitlePresenter ts = this.s;
       if (ts != null) {
          Lifecycle lifecycle = ts.getLifecycle();
          if (lifecycle != null) {
             lifecycle.addObserver(new PlcDynamicTitlePresenter$onBind$1(this));
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, plcDynamicTi, "6")) {
          ts = this.q;
          Integer integer = (ts != null)? Integer.valueOf(ts.a(this.t)): objArray;
          String str = 1;
          if (integer == null || integer.intValue() != str) {
             PlcDynamicLogger.f(this.u, "title presenter bind => title params invalid!");
          }
          ts = this.q;
          if (ts != null) {
             ts.setOnNavigateClickListener(new d(this));
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, plcDynamicTi, "9") && a1.i(this.getActivity())) {
          plcDynamicTi = this.q;
          if (plcDynamicTi != null) {
             plcDynamicTi.setAlpha(0);
          }
          plcDynamicTi = this.p;
          if (plcDynamicTi != null) {
             plcDynamicTi.a(new e(this));
          }
       }
    label_007b :
       return;
    }
    public void J8(){
       PatchProxy.applyVoid(null, this, PlcDynamicTitlePresenter.class, "10");
    }
    public final void P8(String p0,String p1,boolean p2){
       String this;
       PlcDynamicTitlePresenter this1;
       PlcDynamicSearchInfo plcDynamicSe;
       PlcDynamicCommunicator b;
       PlcDynamicContainerConfig plcDynamicCo;
       PlcDynamicTitleConfig titleConfig;
       if (PatchProxy.isSupport(PlcDynamicTitlePresenter.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, PlcDynamicTitlePresenter.class, "8")) {
          return;
       }
       if (!this.Y8()) {
          return;
       }
       PlcDynamicTitlePresenter tq = this.q;
       if (tq != null && tq.b() == true) {
          tq = this.v;
          if (tq == null) {
             return;
          }else {
             List list = null;
             this = "TextUtils.sanityCheckNull\(searchText\)";
             if (p2) {
                p0 = TextUtils.I(p0);
                a.o(p0, this);
                this1 = this.u;
                if (this1 != null) {
                   list = this1.getSearchWords();
                }
                plcDynamicSe = new PlcDynamicSearchInfo(p0, list, p1);
                if (!PatchProxy.applyVoidOneRefs(plcDynamicSe, tq, PlcDynamicCommunicator.class, "5")) {
                   a.p(plcDynamicSe, "searchInfo");
                   b = tq.b;
                   if (b != null) {
                      plcDynamicCo = b.yg();
                      if (plcDynamicCo != null) {
                         titleConfig = plcDynamicCo.getTitleConfig();
                         if (titleConfig == null || (titleConfig.getUseSearchBar() == true && !TextUtils.x(plcDynamicSe.getText()))) {
                            PlcDynamicLogger.a("callback status onSearchShow:"+plcDynamicSe.getText());
                            tq.e(plcDynamicSe, "tuna_cod_on_search_text_show");
                         }
                      }
                   }
                }
             }else {
                p0 = TextUtils.I(p0);
                a.o(p0, this);
                this1 = this.u;
                if (this1 != null) {
                   list = this1.getSearchWords();
                }
                plcDynamicSe = new PlcDynamicSearchInfo(p0, list, p1);
                if (!PatchProxy.applyVoidOneRefs(plcDynamicSe, tq, PlcDynamicCommunicator.class, "4")) {
                   a.p(plcDynamicSe, "searchInfo");
                   b = tq.b;
                   if (b != null) {
                      plcDynamicCo = b.yg();
                      if (plcDynamicCo != null) {
                         titleConfig = plcDynamicCo.getTitleConfig();
                         if (titleConfig != null && titleConfig.getUseSearchBar() == true) {
                            tq.e(plcDynamicSe, "tuna_cod_on_search_click");
                         }
                      }
                   }
                }
             }
          }
       }
    label_00d8 :
       return;
    }
    public final PlcDynamicContainerConfig R8(){
       return this.t;
    }
    public final int S8(){
       Object obj = PatchProxy.apply(null, this, PlcDynamicTitlePresenter.class, "2");
       if (obj == PatchProxyResult.class) {
          obj = this.B.getValue();
       }
       return obj.intValue();
    }
    public final View V8(){
       return this.r;
    }
    public final PlcDynamicContainerLayout W8(){
       return this.p;
    }
    public final PlcDynamicNavigationBar X8(){
       return this.q;
    }
    public final boolean Y8(){
       PlcDynamicTitlePresenter obj = PatchProxy.apply(null, this, PlcDynamicTitlePresenter.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.p;
       boolean b = true;
       if (obj == null || obj.d() != b) {
          b = false;
       }
       return b;
    }
    public final void Z8(boolean p0){
       PlcDynamicTitlePresenter plcDynamicTi = PlcDynamicTitlePresenter.class;
       if (PatchProxy.isSupport(plcDynamicTi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, plcDynamicTi, "5")) {
          return;
       }
       plcDynamicTi = this.q;
       if (plcDynamicTi != null && plcDynamicTi.b() == true) {
          plcDynamicTi = this.q;
          if (plcDynamicTi != null) {
             if (!p0) {
                plcDynamicTi.e();
                return;
             }else if(this.Y8() && this.z != null){
                plcDynamicTi.d();
             }
          }
       }
       return;
    }
    public void j8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PlcDynamicTitlePresenter.class, "3")) {
          return;
       }
       this.s = this.t8("FRAGMENT");
       this.p = this.t8("DYNAMIC_CONTAINER_ROOT_VIEW");
       this.q = this.t8("DYNAMIC_CONTAINER_TITLE");
       this.t = this.t8("DIALOG_CONFIG");
       this.v = this.t8("DYNAMIC_CONTAINER_COMMUNICATOR");
       this.r = this.t8("DYNAMIC_CONTAINER_DRAG_BAR_VIEW");
       this.w = this.t8("DYNAMIC_CONTAINER_WINDOW");
       this.y = this.t8("DYNAMIC_CONTAINER_CLOSE_VIEW");
       PlcDynamicTitlePresenter tt = this.t;
       if (tt != null) {
          objArray = tt.getTitleConfig();
       }
       this.u = objArray;
       return;
    }
}
