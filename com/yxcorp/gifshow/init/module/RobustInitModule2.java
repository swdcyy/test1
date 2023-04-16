package com.yxcorp.gifshow.init.module.RobustInitModule2;
import com.kwai.framework.init.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust2.patchmanager.c;
import com.yxcorp.gifshow.init.module.RobustInitModule2$RobustLogger;
import com.yxcorp.gifshow.init.module.RobustInitModule2$1;
import pm7.e;
import com.yxcorp.gifshow.init.module.RobustInitModule2$PatchEventReporter;
import java.util.Objects;
import android.content.Context;
import pm7.c;
import pm7.h;
import com.yxcorp.utility.SystemUtil;
import pm7.k;
import java.lang.Runnable;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.network.RetrofitInitModule;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import sxa.f0;
import com.kwai.framework.init.c;
import com.yxcorp.gifshow.w;
import com.yxcorp.gifshow.w$b;
import com.kwai.chat.sdk.signal.f;
import sxa.e0;
import j85.e;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ob6.p;
import pb6.b;
import pb6.l;

public class RobustInitModule2 extends a	// class@0011d1
{
    public static String q;

    public void RobustInitModule2(){
       super();
    }
    public static void l0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, objArray, RobustInitModule2.class, "7")) {
          return;
       }
       c.a().k(new RobustInitModule2$RobustLogger(objArray));
       c uoc = c.a();
       Objects.requireNonNull(uoc);
       uoc.c = new RobustInitModule2$PatchEventReporter(objArray);
       c.a().e = false;
       PatchProxy.onMethodExit(RobustInitModule2.class, "7");
       return;
    }
    public static void o0(Context p0){
       Object obj = null;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, obj, RobustInitModule2.class, "6")) {
          return;
       }
       c.a().e(p0, new RobustInitModule2$PatchEventReporter(obj), new RobustInitModule2$RobustLogger(obj));
       RobustInitModule2.q = c.a().a.f();
       if (SystemUtil.L(p0)) {
          c.a().g();
       }else {
          c uoc = c.a();
          uoc.a.a(new k(uoc));
       }
       PatchProxy.onMethodExit(RobustInitModule2.class, "6");
       return;
    }
    public static void onEvent(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, null, RobustInitModule2.class, "9")) {
          return;
       }
       b.a(0x4b316083).logCustomEvent(p0, p1);
       PatchProxy.onMethodExit(RobustInitModule2.class, "9");
       return;
    }
    public int f0(){
       return 19;
    }
    public List g(){
       Class[] obj = PatchProxy.applyWithListener(null, this, RobustInitModule2.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{RetrofitInitModule.class};
       PatchProxy.onMethodExit(RobustInitModule2.class, "5");
       return Lists.e(obj);
    }
    public void i0(){
       if (PatchProxy.applyVoidWithListener(null, this, RobustInitModule2.class, "4")) {
          return;
       }
       c.c(new f0(this));
       PatchProxy.onMethodExit(RobustInitModule2.class, "4");
       return;
    }
    public void n(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, RobustInitModule2.class, "1")) {
          return;
       }
       b.a(-1343064608).W(new RobustInitModule2$1(this));
       if (!PatchProxy.applyVoidWithListener(objArray, this, RobustInitModule2.class, "2")) {
          String[] stringArray = new String[]{"Push.Webserver.client.hotfix"};
          f.e().o(new e0(this), stringArray);
          PatchProxy.onMethodExit(RobustInitModule2.class, "2");
       }
       PatchProxy.onMethodExit(RobustInitModule2.class, "1");
       return;
    }
    public boolean n0(String p0,RequestTiming p1){
       Object obj = PatchProxy.applyTwoRefsWithListener(p0, p1, this, RobustInitModule2.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (TextUtils.x(p0) || p1 == null) {
          PatchProxy.onMethodExit(RobustInitModule2.class, "10");
          return false;
       }else {
          PatchProxy.onMethodExit(RobustInitModule2.class, "10");
          return b.a(0x36463d96).d().b(p0, p1).a();
       }
    }
}
