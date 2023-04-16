package com.kuaishou.tuna.plc.dynamic_container.util.PlcDynamicUtils;
import com.kuaishou.tuna.plc.dynamic_container.util.PlcDynamicUtils$NEED_REPORT_PERFORMANCE$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.tuna.plc.dynamic_container.util.PlcDynamicUtils$sCommonErrorPrompt$2;
import java.lang.Object;
import com.kuaishou.tuna.plc.dynamic_container_api.PlcDynamicTitleConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.tuna.plc.dynamic_container_api.PlcDynamicTitleIconInfo;
import com.kuaishou.tuna.plc.dynamic_container_api.PlcDynamicContainerConfig;
import java.lang.Boolean;
import com.kuaishou.tuna.plc.dynamic_container_api.PlcDynamicContainerStyle;
import xf6.l;
import android.content.Context;
import android.app.Activity;
import com.yxcorp.utility.n;
import android.app.Application;
import o56.a;
import com.kuaishou.tuna.plc.dynamic_container.view.PlcDynamicContainerLayout;
import hy4.a;
import kotlin.jvm.internal.a;
import qy4.a;
import usd.q;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.CharSequence;
import tkd.b;
import tkd.d;
import nl9.u;
import com.kwai.framework.model.feed.BaseFeed;
import xh7.b;
import qh7.b;
import qh7.a;
import com.kuaishou.tuna.plc.dynamic_container.exception.PlcDynamicException;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import zf6.k;
import zsd.u;
import com.kwai.sdk.switchconfig.a;
import com.kuaishou.tuna.plc.dynamic_container.bridge.model.PlcDynamicContainerStatusInfo;
import com.kuaishou.tuna.plc.dynamic_container.bridge.model.PlcDynamicContainerStatusInfo$AvailableSize;
import qrd.l1;
import com.kuaishou.tuna.plc.dynamic_container.bridge.model.PlcDynamicContainerStatusInfo$ContainerRect;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout;
import android.view.ViewGroup$MarginLayoutParams;
import com.kuaishou.tuna.plc.dynamic_container.bridge.model.PlcDynamicContainerStatusInfo$SafeArea;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.facebook.drawee.view.SimpleDraweeView;
import com.kuaishou.tuna.plc.dynamic_container.util.PlcDynamicUtils$a;
import java.lang.Runnable;
import ekd.k1;

public final class PlcDynamicUtils	// class@000fff
{
    public static final p a;
    public static final p b;
    public static final PlcDynamicUtils c;

    static {
       PlcDynamicUtils.c = new PlcDynamicUtils();
       PlcDynamicUtils.a = s.c(PlcDynamicUtils$NEED_REPORT_PERFORMANCE$2.INSTANCE);
       PlcDynamicUtils.b = s.c(PlcDynamicUtils$sCommonErrorPrompt$2.INSTANCE);
    }
    public void PlcDynamicUtils(){
       super();
    }
    public static final float a(float p0){
       float f = 0;
       if (p0 - f < 0) {
          return f;
       }
       if (p0 - 0x3f800000 > 0) {
          return 0x3f800000;
       }
       return p0;
    }
    public static final int b(PlcDynamicTitleConfig p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PlcDynamicUtils.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = -1001;
       if (p0 == null) {
          return i;
       }
       Iterator iterator = p0.getLeftIcons().iterator();
       boolean b = true;
       while (true) {
          if (iterator.hasNext()) {
             PlcDynamicTitleIconInfo plcDynamicTi = iterator.next();
             if (!b) {
                break ;
             }else {
                b = plcDynamicTi.isValid();
             }
          }else {
             iterator = 0;
             if (b) {
                b = (p0.getLeftIcons().size() <= 2)? true: false;
             }
          label_0047 :
             if (!b) {
                return -1002;
             }else {
                Iterator iterator1 = p0.getRightIcons().iterator();
                boolean b1 = true;
                while (true) {
                   if (iterator1.hasNext()) {
                      PlcDynamicTitleIconInfo plcDynamicTi1 = iterator1.next();
                      if (!b1) {
                      }else {
                         b1 = plcDynamicTi1.isValid();
                      }
                   }else if(b1){
                      if (p0.getRightIcons().size() <= 3) {
                         iterator = 1;
                      }
                      b1 = iterator;
                   }
                   if (!b1) {
                      return -1002;
                   }else {
                      return 1;
                   }
                }
                return i;
             }
          }
       }
       return i;
    }
    public static final boolean c(PlcDynamicContainerConfig p0){
       boolean disableDarkM;
       Object obj = PatchProxy.applyOneRefs(p0, null, PlcDynamicUtils.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (p0 != null) {
          PlcDynamicContainerStyle containerSty = p0.getContainerStyle();
          if (containerSty != null) {
             disableDarkM = containerSty.getDisableDarkMode();
          label_0023 :
             boolean b1 = l.c("test_switch_tuna_plc_dynamic_disable_title_dark", false);
             if (!disableDarkM && !b1) {
                b = false;
             }
             return b;
          }
       }
       disableDarkM = true;
       goto label_0023 ;
    }
    public static final boolean d(PlcDynamicTitleConfig p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PlcDynamicUtils.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       boolean disableDarkM = (p0 != null)? p0.getDisableDarkMode(): true;
       boolean b1 = l.c("test_switch_tuna_plc_dynamic_disable_container_dark", false);
       if (!disableDarkM && !b1) {
          b = false;
       }
       return b;
    }
    public static final int e(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PlcDynamicUtils.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (p0 instanceof Activity)? n.j(p0): n.v(a.b());
       return i;
    }
    public static final float f(PlcDynamicContainerLayout p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PlcDynamicUtils.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       a.p(p0, "containerView");
       a.p(p1, "container");
       return q.t((p0.getAnchorTranslationY() - (float)a.a), (((float)p1.sa() - p0.getAnchorTranslationY()) * 0.20f));
    }
    public static final boolean g(Context p0,PlcDynamicContainerConfig p1,QPhoto p2,String p3,String p4){
       Object[] objArray;
       String obj;
       PlcDynamicUtils plcDynamicUt = PlcDynamicUtils.class;
       int i = 1;
       BaseFeed uBaseFeed = null;
       if (PatchProxy.isSupport(plcDynamicUt)) {
          objArray = new Object[]{p0,p1,p2,p3,p4};
          obj = PatchProxy.apply(objArray, uBaseFeed, plcDynamicUt, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "context");
       a.p(p4, "downgradeFailLog");
       if (p1 != null) {
          obj = p1.getDowngradeUrl();
          if (obj != null) {
             objArray = (obj.length() > 0)? 1: 0;
             if (!objArray) {
                obj = uBaseFeed;
             }
             if (obj != null) {
                if (p1.getType() == 3) {
                   u ou = d.a(-1694791652);
                   if (p2 != null) {
                      uBaseFeed = p2.getEntity();
                   }
                   ou.RQ(p0, uBaseFeed, obj);
                }else {
                   a.b(b.j(p0, obj), uBaseFeed);
                }
                ExceptionHandler.handleCaughtException(new PlcDynamicException(p3));
             label_0082 :
                return i;
             }
          }
       }
       PlcDynamicUtils.s();
       ExceptionHandler.handleCaughtException(new PlcDynamicException(p4));
       i = false;
       goto label_0082 ;
    }
    public static boolean h(Context p0,PlcDynamicContainerConfig p1,QPhoto p2,String p3,String p4,int p5,Object p6){
       p4 = null;
       if (p5 & 0x04) {
          p2 = p4;
       }
       p3 = (p5 & 0x08)? "创建动态化容器失败，直接走内部降级": p4;
       if (p5 & 0x10) {
          p4 = "创建动态化容器失败，降级url为空，提示用户异常";
       }
       return PlcDynamicUtils.g(p0, p1, p2, p3, p4);
    }
    public static final boolean i(int p0){
       int i = 1;
       if (p0 == i) {
       }else {
          i = false;
       }
       return i;
    }
    public static final boolean j(PlcDynamicContainerConfig p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PlcDynamicUtils.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!PlcDynamicUtils.c(p0) && k.d())? true: false;
       return b;
    }
    public static final boolean k(){
       String obj = PatchProxy.apply(null, null, PlcDynamicUtils.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (a.d()) {
          obj = a.m;
          a.o(obj, "AppEnv.VERSION");
          if (u.H1(obj, ".99999", b, 2, null)) {
             b = true;
          }
       }
       return b;
    }
    public static final boolean l(PlcDynamicContainerConfig p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PlcDynamicUtils.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0.getType() == 2)? true: false;
       return b;
    }
    public static final boolean m(PlcDynamicContainerConfig p0){
       boolean b;
       PlcDynamicUtils plcDynamicUt = PlcDynamicUtils.class;
       PlcDynamicTitleConfig plcDynamicTi = null;
       Object obj = PatchProxy.applyOneRefs(p0, plcDynamicTi, plcDynamicUt, "25");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Object obj1 = PatchProxy.applyOneRefs(p0, plcDynamicTi, plcDynamicUt, "22");
       if (obj1 != PatchProxyResult.class) {
          b = obj1.booleanValue();
       }else if(p0 != null){
          plcDynamicTi = p0.getTitleConfig();
       }
       b = PlcDynamicUtils.d(plcDynamicTi);
       b = (!b && k.d())? true: false;
       return b;
    }
    public static final boolean n(PlcDynamicTitleConfig p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PlcDynamicUtils.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!PlcDynamicUtils.d(p0) && k.d())? true: false;
       return b;
    }
    public static final boolean o(PlcDynamicContainerConfig p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PlcDynamicUtils.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (p0.getType() != b && p0.getType() != 3) {
          b = false;
       }
       return b;
    }
    public static final boolean p(boolean p0){
       PlcDynamicUtils plcDynamicUt = PlcDynamicUtils.class;
       if (PatchProxy.isSupport(plcDynamicUt)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), null, plcDynamicUt, "34");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       if (!p0) {
          return b;
       }else if(!a.t().a("TunaCodKeyboardAdapter", b)){
          b = true;
       }
       return b;
    }
    public static final PlcDynamicContainerStatusInfo q(a p0){
       ViewGroup$LayoutParams layoutParams = null;
       PlcDynamicContainerStatusInfo obj = PatchProxy.applyOneRefs(p0, layoutParams, PlcDynamicUtils.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "container");
       obj = new PlcDynamicContainerStatusInfo();
       obj.mStatus = p0.r7();
       PlcDynamicContainerStatusInfo$AvailableSize uAvailableSi = new PlcDynamicContainerStatusInfo$AvailableSize();
       uAvailableSi.mHeight = n.P(a.b(), (float)p0.sa());
       uAvailableSi.mWidth = n.P(a.b(), (float)p0.C4());
       obj.mAvailableSize = uAvailableSi;
       PlcDynamicContainerStatusInfo$ContainerRect uContainerRe = new PlcDynamicContainerStatusInfo$ContainerRect();
       View view = p0.j0();
       if (view != null) {
          PlcDynamicContainerLayout plcDynamicCo = p0.Za();
          ViewGroup$LayoutParams layoutParams1 = (plcDynamicCo != null)? plcDynamicCo.getLayoutParams(): layoutParams;
          if (layoutParams1 instanceof ViewGroup$MarginLayoutParams) {
             layoutParams = layoutParams1;
          }
          float f = 0;
          float f1 = (layoutParams != null)? (float)layoutParams.topMargin: 0;
          uContainerRe.mHeight = n.P(a.b(), (float)view.getHeight());
          uContainerRe.mWidth = n.P(a.b(), (float)view.getWidth());
          uContainerRe.mX = n.P(a.b(), view.getTranslationX());
          Application uApplication = a.b();
          float f2 = (float)view.getTop() + f1;
          PlcDynamicContainerLayout plcDynamicCo1 = p0.Za();
          if (plcDynamicCo1 != null) {
             f = plcDynamicCo1.getTranslationY();
          }
          uContainerRe.mY = n.P(uApplication, (f2 + f));
       }
       obj.mContainerRect = uContainerRe;
       PlcDynamicContainerStatusInfo$SafeArea safeArea = new PlcDynamicContainerStatusInfo$SafeArea();
       safeArea.mLeft = 0;
       safeArea.mLop = 0;
       safeArea.mRight = 0;
       safeArea.mBottom = 0;
       obj.mSafeArea = safeArea;
       return obj;
    }
    public static final void r(String p0,KwaiImageView p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, PlcDynamicUtils.class, "35")) {
          return;
       }
       a$a uoa = (p0 == null || !p0.length())? 1: null;
       if (!uoa && p1 != null) {
          uoa = a.d();
          uoa.b(":ks-features:ft-x:tuna-plc-dynamic-container");
          p1.u(p0, uoa);
       }
       return;
    }
    public static final void s(){
       if (PatchProxy.applyVoid(null, null, PlcDynamicUtils.class, "5")) {
          return;
       }
       k1.o(PlcDynamicUtils$a.b);
       return;
    }
}
