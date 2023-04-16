package com.kuaishou.tuna.plc.dynamic_container.PlcDynamicContainerFragment;
import hy4.a;
import ik0.a;
import com.kuaishou.tuna.plc.dynamic_container.AbsPlcDynamicMVPsFragment;
import com.kuaishou.tuna.plc.dynamic_container.PlcDynamicContainerFragment$a;
import nsd.u;
import java.util.concurrent.ConcurrentHashMap;
import com.kuaishou.tuna.plc.dynamic_container_api.PlcDynamicContainerConfig;
import java.lang.String;
import com.kuaishou.tuna.plc.dynamic_container_api.PlcDynamicTitleConfig;
import com.kuaishou.tuna.plc.dynamic_container_api.PlcDynamicContainerStyle;
import com.kuaishou.tuna.plc.dynamic_container.PlcDynamicContainerFragment$i;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.tuna.plc.dynamic_container.presenter.PlcDynamicTitlePresenter;
import ly4.c;
import java.lang.Number;
import android.view.View;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.kuaishou.tuna.plc.dynamic_container.util.PlcDynamicUtils;
import android.app.Activity;
import com.yxcorp.utility.n;
import android.app.Application;
import o56.a;
import com.kuaishou.tuna.plc.dynamic_container.logger.PlcDynamicLogger;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.tuna.plc.dynamic_container_api.PlcDynamicTitleIconInfo;
import jy4.a;
import androidx.fragment.app.FragmentActivity;
import com.kuaishou.tuna.plc.dynamic_container.PlcDynamicContainerActivity;
import iy4.b;
import hy4.a$a;
import com.yxcorp.utility.TextUtils;
import kotlin.jvm.internal.a;
import com.kuaishou.tuna.plc.dynamic_container.view.navigate.PlcDynamicNavigationBar;
import com.kuaishou.tuna.plc.dynamic_container.view.PlcDynamicContainerLayout;
import java.lang.Boolean;
import java.util.HashMap;
import iy4.c;
import fy4.e;
import iy4.d;
import iy4.i;
import com.yxcorp.gifshow.entity.QPhoto;
import iy4.b$b;
import com.kuaishou.tuna.plc.dynamic_container.presenter.PlcDynamicCommunicator;
import ey4.c;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.ViewGroup;
import com.kuaishou.tuna.plc.dynamic_container.PlcDynamicContainerFragment$b;
import android.view.View$OnClickListener;
import com.kuaishou.tuna.plc.dynamic_container.PlcDynamicContainerFragment$c;
import com.kuaishou.tuna.plc.dynamic_container.PlcDynamicContainerFragment$d;
import android.widget.RelativeLayout;
import com.kuaishou.tuna.plc.dynamic_container.PlcDynamicContainerFragment$e;
import com.kuaishou.tuna.plc.dynamic_container.view.a$a;
import com.kuaishou.tuna.plc.dynamic_container.PlcDynamicContainerFragment$f;
import android.widget.LinearLayout;
import com.kuaishou.tuna.plc.dynamic_container.PlcDynamicContainerFragment$g;
import com.kuaishou.tuna.plc.dynamic_container.test.PlcDynamicTestView;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import java.util.Objects;
import com.kuaishou.tuna.plc.dynamic_container.util.PlcDynamicKeyboardAdapter;
import moc.b;
import android.os.Bundle;
import android.os.Parcelable;
import qrd.l1;
import com.kuaishou.tuna.plc.dynamic_container.PlcDynamicContainerFragment$initInjectObjectsInternal$$inlined$let$lambda$1;
import com.kuaishou.tuna.plc.dynamic_container.exception.PlcDynamicException;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.kwai.framework.model.feed.BaseFeed;
import hy4.a$b;
import java.lang.Integer;
import java.util.Map;
import java.util.ArrayList;
import hy4.b;
import android.view.Window;
import java.lang.StringBuilder;
import ekd.q;
import ey4.g;
import java.lang.Runnable;
import ekd.k1;
import lnc.i3;
import com.kuaishou.tuna.plc.dynamic_container.presenter.PlcDynamicCommunicator$onClose$1;
import msd.a;
import java.lang.CharSequence;
import js6.a;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import com.kwai.yoda.event.d;
import com.kwai.yoda.bridge.YodaBaseWebView;
import hy4.a$c;
import lnc.a1;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import com.kuaishou.tuna.plc.dynamic_container.view.a;
import android.view.KeyEvent;
import ny4.b;
import com.kuaishou.tuna.plc.dynamic_container.PlcDynamicContainerFragment$h;

public final class PlcDynamicContainerFragment extends AbsPlcDynamicMVPsFragment implements a, a	// class@000fd5
{
    public KwaiImageView A;
    public ViewGroup B;
    public PlcDynamicCommunicator C;
    public b D;
    public QPhoto E;
    public PlcDynamicKeyboardAdapter F;
    public PlcDynamicContainerFragment$i G;
    public HashMap H;
    public a$c q;
    public final ConcurrentHashMap r;
    public int s;
    public PlcDynamicContainerConfig t;
    public int u;
    public PlcDynamicContainerLayout v;
    public View w;
    public PlcDynamicNavigationBar x;
    public View y;
    public ViewGroup z;
    public static final PlcDynamicContainerFragment$a I;

    static {
       PlcDynamicContainerFragment.I = new PlcDynamicContainerFragment$a(null);
    }
    public void PlcDynamicContainerFragment(){
       super();
       this.r = new ConcurrentHashMap();
       this.s = -2;
       PlcDynamicContainerConfig plcDynamicCo = new PlcDynamicContainerConfig(0, null, null, 0, null, null, null, null, null, false, 1023, null);
       this.t = v0;
       this.u = -1;
       this.G = new PlcDynamicContainerFragment$i(this);
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, PlcDynamicContainerFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       PlcDynamicContainerStyle containerSty = this.t.getContainerStyle();
       if (containerSty != null && containerSty.getDragStyle() == 2) {
          obj.U7(new PlcDynamicTitlePresenter());
       }
       obj.U7(new c());
       PatchProxy.onMethodExit(PlcDynamicContainerFragment.class, "12");
       return obj;
    }
    public int C4(){
       int width;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       PlcDynamicContainerFragment obj = PatchProxy.apply(objArray, this, PlcDynamicContainerFragment.class, "21");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = this.y;
       if (obj != null) {
          width = obj.getWidth();
       }else {
          Context context = this.getContext();
          Object obj1 = PatchProxy.applyOneRefs(context, objArray, PlcDynamicUtils.class, "16");
          if (obj1 != patchProxyRe) {
             width = obj1.intValue();
          }else if(context instanceof Activity){
             width = n.k(context);
          }else {
             width = n.z(a.b());
          }
       }
       return width;
    }
    public int D9(PlcDynamicTitleConfig p0){
       int i;
       int i2;
       int i3;
       int i4;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PlcDynamicTitleConfig obj = PatchProxy.applyOneRefs(p0, this, PlcDynamicContainerFragment.class, "19");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       PlcDynamicLogger.b(p0, "addNavigationBar");
       obj = this.t.getTitleConfig();
       List obj1 = PatchProxy.applyTwoRefs(obj, p0, null, PlcDynamicUtils.class, "14");
       if (obj1 != patchProxyRe) {
          i = obj1.intValue();
       }else {
          int i1 = 0;
          if (obj != null) {
             obj1 = obj.getLeftIcons();
             if (obj1 != null) {
                i2 = obj1.size();
             label_0042 :
                if (obj != null) {
                   List rightIcons = obj.getRightIcons();
                   if (rightIcons != null) {
                      i3 = rightIcons.size();
                   label_0050 :
                      if (p0 != null) {
                         List leftIcons = p0.getLeftIcons();
                         if (leftIcons != null) {
                            i4 = leftIcons.size();
                         label_005e :
                            if (p0 != null) {
                               List rightIcons1 = p0.getRightIcons();
                               if (rightIcons1 != null) {
                                  i1 = rightIcons1.size();
                               }
                            }
                            i3 = i3 + i1;
                            if ((i2 + i4) > 2 || i3 > 3) {
                               i = -1002;
                            }else {
                               i1 = PlcDynamicUtils.b(p0);
                               if (PlcDynamicUtils.i(i1)) {
                                  if (p0 != null) {
                                     obj1 = p0.getLeftIcons();
                                     if (obj1 != null) {
                                        Iterator iterator = obj1.iterator();
                                        while (iterator.hasNext()) {
                                           PlcDynamicTitleIconInfo plcDynamicTi = iterator.next();
                                           if (obj != null) {
                                              leftIcons = obj.getLeftIcons();
                                              if (leftIcons != null) {
                                                 leftIcons.add(plcDynamicTi);
                                              }
                                           }
                                        }
                                     }
                                  }
                                  if (p0 != null) {
                                     List rightIcons2 = p0.getRightIcons();
                                     if (rightIcons2 != null) {
                                        Iterator iterator1 = rightIcons2.iterator();
                                        while (iterator1.hasNext()) {
                                           PlcDynamicTitleIconInfo plcDynamicTi1 = iterator1.next();
                                           if (obj != null) {
                                              rightIcons = obj.getRightIcons();
                                              if (rightIcons != null) {
                                                 rightIcons.add(plcDynamicTi1);
                                              }
                                           }
                                        }
                                     }
                                  }
                               }
                               i = i1;
                            }
                         }
                      }
                      i4 = 0;
                      goto label_005e ;
                   }
                }
                i3 = 0;
                goto label_0050 ;
             }
          }
          i2 = 0;
          goto label_0042 ;
       }
       if (PlcDynamicUtils.i(i)) {
          i = this.Na(this.t.getTitleConfig());
       }
       return i;
    }
    public a Fg(){
       Object[] objArray1;
       Object[] objArray = null;
       FragmentActivity obj = PatchProxy.apply(objArray, this, PlcDynamicContainerFragment.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getActivity();
       if (!obj instanceof PlcDynamicContainerActivity) {
          objArray1 = objArray;
       }
       if (objArray1 != null) {
          objArray = objArray1.A3();
       }
       return objArray;
    }
    public b Ge(){
       return this.D;
    }
    public int J4(){
       return this.s;
    }
    public void K2(){
       if (PatchProxy.applyVoid(null, this, PlcDynamicContainerFragment.class, "40")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(this, null, a$a.class, "1")) {
          this.t0(0);
       }
       return;
    }
    public String M0(){
       Object[] objArray = null;
       b obj = PatchProxy.apply(objArray, this, PlcDynamicContainerFragment.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.Ge();
       if (obj != null) {
          objArray = obj.M0();
       }
       String str = TextUtils.I(objArray);
       a.o(str, "TextUtils.sanityCheckNul\x20\x02ge\(\)?.getCurRNNativeId\(\)\)\x00");
       return str;
    }
    public int Na(PlcDynamicTitleConfig p0){
       PlcDynamicContainerFragment obj = PatchProxy.applyOneRefs(p0, this, PlcDynamicContainerFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       PlcDynamicLogger.b(p0, "updateNavigationBar");
       this.t.setTitleConfig(p0);
       PlcDynamicContainerFragment tx = this.x;
       int i = (tx != null)? tx.a(this.t): -1;
       int i1 = 1;
       if (PlcDynamicUtils.i(i)) {
          obj = this.x;
          if (obj != null && obj.b() == i1) {
             obj = this.v;
             if (obj != null && obj.d() == i1) {
             label_0046 :
                if (i1) {
                   obj = this.x;
                   if (obj != null) {
                      obj.d();
                   }
                }
                return i;
             }
          }
       }
       i1 = 0;
       goto label_0046 ;
    }
    public boolean Wc(boolean p0){
       if (PatchProxy.isSupport(PlcDynamicContainerFragment.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, PlcDynamicContainerFragment.class, "39");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       this.K2();
       return true;
    }
    public PlcDynamicContainerLayout Za(){
       return this.v;
    }
    public void ch(){
       if (PatchProxy.applyVoid(null, this, PlcDynamicContainerFragment.class, "42")) {
          return;
       }
       PlcDynamicContainerFragment tH = this.H;
       if (tH != null) {
          tH.clear();
       }
       return;
    }
    public void dh(){
       e uoe;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PlcDynamicContainerFragment.class, "9")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, PlcDynamicContainerFragment.class, "10")) {
          PlcDynamicContainerFragment tt = this.t;
          Object[] objArray1 = PatchProxy.applyOneRefs(tt, objArray, c.class, "1");
          if (objArray1 != PatchProxyResult.class) {
          }else {
             a.p(tt, "config");
             int type = tt.getType();
             if (type != 1) {
                if (type != 2) {
                   if (type != 3) {
                      objArray1 = objArray;
                   label_004f :
                      if (objArray1 == null) {
                         objArray1 = objArray;
                      }
                   }else {
                      uoe = new e();
                   }
                }else {
                   uoe = new d();
                }
             }else {
                uoe = new i();
             }
             objArray1 = uoe;
             goto label_004f ;
          }
          if (objArray1 != null) {
             objArray1.a(this.E);
          }else {
             objArray1 = objArray;
          }
          if (objArray1 != null) {
             objArray = objArray1.c(this.t, this, this.G);
          }
          if (objArray != null) {
             this.D = objArray1;
             this.C = new PlcDynamicCommunicator(this);
             this.k = new c(objArray, this, objArray1);
          }else {
             this.t0(-1);
          }
       }
       return;
    }
    public int e7(){
       PlcDynamicContainerFragment obj = PatchProxy.apply(null, this, PlcDynamicContainerFragment.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.v;
       int fixedDragSta = (obj != null)? obj.getFixedDragStatus(): 0;
       return fixedDragSta;
    }
    public void eh(){
       Object[] objArray1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PlcDynamicContainerFragment.class, "8")) {
          return;
       }
       View view = this.getView();
       PlcDynamicContainerLayout plcDynamicCo = (view != null)? view.findViewById(R.id.fl_dynamic_content): objArray;
       this.v = plcDynamicCo;
       view = this.getView();
       KwaiImageView kwaiImageVie = (view != null)? view.findViewById(R.id.iv_dynamic_container_close): objArray;
       this.A = kwaiImageVie;
       view = this.getView();
       ViewGroup viewGroup = (view != null)? view.findViewById(R.id.fl_container_close_area): objArray;
       this.B = viewGroup;
       if (viewGroup != null) {
          viewGroup.setOnClickListener(new PlcDynamicContainerFragment$b(this));
       }
       view = this.getView();
       view = (view != null)? view.findViewById(R.id.fl_dynamic_drag_bar): objArray;
       this.w = view;
       if (view != null) {
          view.setOnClickListener(PlcDynamicContainerFragment$c.b);
       }
       PlcDynamicContainerFragment tv = this.v;
       if (tv != null) {
          tv.setOnClickListener(PlcDynamicContainerFragment$d.b);
       }
       tv = this.v;
       if (tv != null) {
          tv.a(new PlcDynamicContainerFragment$e(this));
       }
       view = this.getView();
       PlcDynamicNavigationBar plcDynamicNa = (view != null)? view.findViewById(R.id.tv_plc_dynamic_container_title): objArray;
       this.x = plcDynamicNa;
       if (plcDynamicNa != null) {
          plcDynamicNa.setOnClickListener(PlcDynamicContainerFragment$f.b);
       }
       view = this.getView();
       view = (view != null)? view.findViewById(R.id.fl_dynamic_root_view): objArray;
       this.y = view;
       view = this.getView();
       viewGroup = (view != null)? view.findViewById(R.id.fl_dynamic_content_fragment): objArray;
       this.z = viewGroup;
       tv = this.y;
       if (tv != null) {
          tv.setOnClickListener(new PlcDynamicContainerFragment$g(this));
       }
       if (!PatchProxy.applyVoid(objArray, this, PlcDynamicContainerFragment.class, "11") && PlcDynamicUtils.k()) {
          Context context = this.getContext();
          a.m(context);
          a.o(context, "context!!");
          PlcDynamicTestView plcDynamicTe = new PlcDynamicTestView(context);
          PlcDynamicContainerFragment tt = this.t;
          if (!PatchProxy.applyVoidOneRefs(tt, plcDynamicTe, PlcDynamicTestView.class, "1")) {
             a.p(tt, "config");
             plcDynamicTe.b = tt;
          }
          FragmentActivity activity = this.getActivity();
          if (activity instanceof PlcDynamicContainerActivity) {
             FragmentActivity uFragmentAct = activity;
          }
          plcDynamicTe.setLayoutParams(new ViewGroup$MarginLayoutParams(-2, -2));
          PlcDynamicContainerFragment ty = this.y;
          Objects.requireNonNull(ty, "null cannot be cast to non-null type android.view.ViewGroup");
          ty.addView(plcDynamicTe);
          plcDynamicTe.setY(200.00f);
       }
       return;
    }
    public boolean fe(){
       PlcDynamicContainerFragment obj = PatchProxy.apply(null, this, PlcDynamicContainerFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.F;
       boolean b = true;
       if (obj == null || obj.f() != b) {
          b = false;
       }
       return b;
    }
    public void fh(){
       PlcDynamicContainerConfig parcelable;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PlcDynamicContainerFragment.class, "6")) {
          return;
       }
       Object[] objArray1 = b.b(this.u);
       if (!objArray1 instanceof QPhoto) {
          objArray1 = objArray;
       }
       if (objArray1 != null) {
          this.E = objArray1;
       }
       try{
          if (!PatchProxy.applyVoid(objArray, this, PlcDynamicContainerFragment.class, "7")) {
             Bundle arguments = this.getArguments();
             if (arguments != null) {
                parcelable = arguments.getParcelable("DIALOG_CONFIG");
                if (parcelable != null) {
                   this.t = parcelable;
                   l1 a = l1.a;
                }else {
                   PlcDynamicContainerFragment$initInjectObjectsInternal$$inlined$let$lambda$1 oinitInjectO = new PlcDynamicContainerFragment$initInjectObjectsInternal$$inlined$let$lambda$1(this);
                }
             }
             PlcDynamicLogger.b(this.t, "»›∆˜fragment ’µΩµƒ≈‰÷√");
          }
       }catch(java.lang.Exception e0){
          ExceptionHandler.handleCaughtException(new PlcDynamicException("container fragment parse config for parcelable error!", e0));
       }
       return;
    }
    public BaseFeed getBaseFeed(){
       Object[] objArray = null;
       PlcDynamicContainerFragment obj = PatchProxy.apply(objArray, this, PlcDynamicContainerFragment.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.E;
       if (obj != null) {
          objArray = obj.getEntity();
       }
       return objArray;
    }
    public String getToken(){
       Object obj = PatchProxy.apply(null, this, PlcDynamicContainerFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.t.getToken();
    }
    public void he(a$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcDynamicContainerFragment.class, "14")) {
          return;
       }
       a.p(p0, "listener");
       this.r.put(Integer.valueOf(p0.hashCode()), p0);
       return;
    }
    public void hh(){
       if (PatchProxy.applyVoid(null, this, PlcDynamicContainerFragment.class, "37")) {
          return;
       }
       this.t0(-1);
       return;
    }
    public ArrayList ih(){
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, this, PlcDynamicContainerFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       b uob = new b();
       uob.b = this;
       uob.c = this.t;
       uob.d = this.l;
       uob.e = this.v;
       uob.h = this.w;
       uob.g = this.x;
       uob.i = this.z;
       uob.f = this.C;
       FragmentActivity activity = this.getActivity();
       if (activity != null) {
          objArray = activity.getWindow();
       }
       uob.m = objArray;
       uob.j = this.A;
       uob.k = this.B;
       uob.l = this.y;
       obj.add(uob);
       return obj;
    }
    public View j0(){
       return this.z;
    }
    public void jh(){
       if (PatchProxy.applyVoid(null, this, PlcDynamicContainerFragment.class, "36")) {
          return;
       }
       this.K2();
       return;
    }
    public final void kh(int p0){
       PlcDynamicContainerFragment tC;
       String str;
       if (PatchProxy.isSupport(PlcDynamicContainerFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PlcDynamicContainerFragment.class, "31")) {
          return;
       }
       PlcDynamicLogger.c("callbackCloseOperateAndDismiss:"+p0);
       if (!PatchProxy.isSupport(PlcDynamicContainerFragment.class) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PlcDynamicContainerFragment.class, "33") && !q.h(this.r))) {
          k1.o(new g(this, p0));
       }
       if (p0 != -1 || p0 != -2) {
          tC = this.C;
          if (tC != null) {
             PlcDynamicCommunicator plcDynamicCo = PlcDynamicCommunicator.class;
             if (!PatchProxy.isSupport(plcDynamicCo) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), tC, plcDynamicCo, "2")) {
                plcDynamicCo = tC.b;
                if (plcDynamicCo != null) {
                   b uob = plcDynamicCo.Ge();
                   if (uob != null) {
                      PlcDynamicCommunicator b = tC.b;
                      if (b != null) {
                         PlcDynamicContainerConfig plcDynamicCo1 = b.yg();
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
             }
          }
       }
       tC = this.q;
       if (tC != null) {
          tC.b(p0);
       }
       return;
    }
    public final PlcDynamicCommunicator lh(){
       return this.C;
    }
    public final PlcDynamicContainerConfig mh(){
       return this.t;
    }
    public final PlcDynamicContainerLayout nh(){
       return this.v;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcDynamicContainerFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       if (!PatchProxy.applyVoid(null, this, PlcDynamicContainerFragment.class, "3") && (this.F == null && a1.i(this.getActivity()))) {
          this.F = new PlcDynamicKeyboardAdapter();
          PlcDynamicContainerFragment tF = this.F;
          if (tF != null && !PatchProxy.applyVoidOneRefs(this, tF, PlcDynamicKeyboardAdapter.class, "3")) {
             a.p(this, "containerFragment");
             tF.b = this;
             this.getLifecycle().addObserver(tF);
          }
       }
    label_004a :
       if (p0 != null) {
          PlcDynamicLogger.c("PlcDynamicContainerFragment reCreate!");
       }
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, PlcDynamicContainerFragment.class, "5")) {
          return;
       }
       super.onDestroy();
       PlcDynamicContainerFragment tv = this.v;
       if (tv != null && !PatchProxy.applyVoid(null, tv, PlcDynamicContainerLayout.class, "19")) {
          tv.f.destroy();
       }
       tv = this.C;
       if (tv != null) {
          tv.b = null;
       }
       this.r.clear();
       return;
    }
    public void onDestroyView(){
       super.onDestroyView();
       this.ch();
    }
    public boolean onKeyDown(int p0,KeyEvent p1){
       if (PatchProxy.isSupport(PlcDynamicContainerFragment.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, PlcDynamicContainerFragment.class, "38");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p0 == 4 && (p1 != null && !p1.getAction())) {
          this.t0(4);
          return true;
       }else {
          return false;
       }
    }
    public void onSaveInstanceState(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcDynamicContainerFragment.class, "24")) {
          return;
       }
       a.p(p0, "outState");
       super.onSaveInstanceState(p0);
       PlcDynamicLogger.c("PlcDynamicContainerFragment onSaveInstanceState");
       return;
    }
    public void p2(){
       if (PatchProxy.applyVoid(null, this, PlcDynamicContainerFragment.class, "17")) {
          return;
       }
       PlcDynamicContainerFragment tF = this.F;
       if (tF != null) {
          tF.e();
       }
       return;
    }
    public int pa(int p0){
       PlcDynamicContainerStyle obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(PlcDynamicContainerFragment.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, PlcDynamicContainerFragment.class, "25");
          if (obj != patchProxyRe) {
             return obj.intValue();
          }
       }
       if (this.fe()) {
          return -1003;
       }else {
          obj = this.t.getContainerStyle();
          int i = 0;
          int dragStyle = (obj != null)? obj.getDragStyle(): 0;
          int i1 = 1;
          if (dragStyle == 2) {
             i = 1;
          }
          if (!i && p0 == 5) {
             return -1002;
          }else {
             PlcDynamicContainerFragment tv = this.v;
             i = -1;
             if (tv != null) {
                if (PatchProxy.isSupport(PlcDynamicContainerLayout.class)) {
                   Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), tv, PlcDynamicContainerLayout.class, "11");
                   if (obj1 != patchProxyRe) {
                      i1 = obj1.intValue();
                   }else if(tv.getDragStatus2() == 3){
                      i1 = -1001;
                   }else {
                      try{
                         tv.f.g(p0);
                      }catch(java.lang.Exception e0){
                         String str = "anim status:"+p0+" failed!";
                         PlcDynamicLogger.i(str, e0);
                         ExceptionHandler.handleCaughtException(new PlcDynamicException(str, e0));
                         i1 = -1;
                      }
                   }
                }else {
                   goto label_0066 ;
                }
             }
             return i;
          }
       }
    }
    public int r7(){
       PlcDynamicContainerFragment obj = PatchProxy.apply(null, this, PlcDynamicContainerFragment.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.v;
       int dragStatus2 = (obj != null)? obj.getDragStatus2(): 0;
       return dragStatus2;
    }
    public boolean rf(String p0,boolean p1){
       b obj;
       PlcDynamicContainerFragment tv;
       if (PatchProxy.isSupport(PlcDynamicContainerFragment.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, PlcDynamicContainerFragment.class, "28");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "nativeId");
       if (this.v == null) {
          PlcDynamicLogger.g("updateGestureStatus ß∞‹£¨Œ¥’“µΩScrollContainer");
          return false;
       }else {
          obj = this.Ge();
          if (obj != null && obj.f(p0) == true) {
             tv = this.v;
             if (tv != null && !PatchProxy.applyVoid(null, tv, PlcDynamicContainerLayout.class, "17")) {
                PlcDynamicContainerLayout e1 = tv.e;
                if (e1 != null) {
                   e1.d();
                }
             }
          }else {
             PlcDynamicLogger.g("updateGestureStatus ÃÊªªnativeId ß∞‹£°»›∆˜type£∫"+this.t.getType());
          }
          tv = this.v;
          if (tv != null && (!PatchProxy.isSupport(PlcDynamicContainerLayout.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p1), tv, PlcDynamicContainerLayout.class, "18"))) {
             PlcDynamicContainerLayout e = tv.e;
             if (e != null) {
                e.c(p1);
                tv.e();
             }
          }
          return true;
       }
    }
    public int sa(){
       PlcDynamicContainerFragment obj = PatchProxy.apply(null, this, PlcDynamicContainerFragment.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.y;
       int height = (obj != null)? obj.getHeight(): PlcDynamicUtils.e(this.getContext());
       return height;
    }
    public void t0(int p0){
       if (PatchProxy.isSupport(PlcDynamicContainerFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PlcDynamicContainerFragment.class, "15")) {
          return;
       }
       k1.o(new PlcDynamicContainerFragment$h(this, p0));
       return;
    }
    public void ue(boolean p0){
       if (PatchProxy.isSupport(PlcDynamicContainerFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PlcDynamicContainerFragment.class, "30")) {
          return;
       }
       PlcDynamicContainerFragment tq = this.q;
       if (tq != null) {
          tq.a(p0);
       }
       return;
    }
    public PlcDynamicContainerConfig yg(){
       return this.t;
    }
}
