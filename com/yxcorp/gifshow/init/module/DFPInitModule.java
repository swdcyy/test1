package com.yxcorp.gifshow.init.module.DFPInitModule;
import com.kwai.framework.init.a;
import o56.a;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.LinkedList;
import wkd.b;
import c0d.a;
import java.util.Iterator;
import c0d.d;
import com.yxcorp.gifshow.init.module.e;
import xfd.a$a;
import xfd.b;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import java.lang.Boolean;
import c76.b;
import com.kwai.framework.initmodule.FoundationInfoInitModule;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import com.yxcorp.gifshow.w;
import com.kuaishou.android.security.KSecurity;
import com.yxcorp.gifshow.init.module.DFPInitModule$2;
import com.kuaishou.android.security.base.util.KSecurityTrack$IKSecurityTrackCallback;
import com.kuaishou.android.security.base.util.KSecurityTrack;
import com.kuaishou.android.security.internal.common.KSecurityContext;
import java.lang.Integer;
import com.kuaishou.android.security.internal.common.KSecurityContext$Feature;
import com.yxcorp.gifshow.init.module.DFPInitModule$1;
import java.lang.Thread;
import i30.t;
import h30.a;
import oe6.b;
import android.content.SharedPreferences;
import android.app.Application;
import java.util.Objects;
import java.lang.CharSequence;
import android.text.TextUtils;
import qe6.b;
import tkd.b;
import tkd.d;
import ayb.m;
import android.content.Context;
import com.kwai.framework.deviceid.b;
import com.kwai.framework.deviceid.c;
import com.kwai.framework.deviceid.d;
import com.kuaishou.dfp.hostproxy.DfpDidProxy;
import com.kuaishou.dfp.hostproxy.DfpDidTagProxy;
import com.kuaishou.dfp.hostproxy.DfpODidProxy;
import com.yxcorp.gifshow.init.module.DFPInitModule$3;
import java.util.concurrent.atomic.AtomicBoolean;
import r30.d;
import i30.v;
import h30.b;
import r30.a;
import com.kuaishou.dfp.c.d;
import sxa.d;
import java.lang.Runnable;
import com.kwai.framework.init.e;
import oe6.a;
import com.yxcorp.utility.TextUtils;

public class DFPInitModule extends a	// class@00196d
{
    public static final String q;
    public static boolean r;
    public static String s;

    static {
       DFPInitModule.q = a.x;
       DFPInitModule.r = false;
    }
    public void DFPInitModule(){
       super();
    }
    public static List bbxwe_xx(String p0){
       LinkedList obj = PatchProxy.applyOneRefsWithListener(p0, null, DFPInitModule.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LinkedList();
       List list = b.a(0x1a7467ca).a(p0);
       if (list == null) {
          PatchProxy.onMethodExit(DFPInitModule.class, "11");
          return obj;
       }else if(list.isEmpty()){
          PatchProxy.onMethodExit(DFPInitModule.class, "11");
          return obj;
       }else {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             obj.add(iterator.next().c);
          }
          PatchProxy.onMethodExit(DFPInitModule.class, "11");
          return obj;
       }
    }
    public static void l0(){
       if (PatchProxy.applyVoidWithListener(null, null, DFPInitModule.class, "8")) {
          return;
       }
       b.a(e.a);
       PatchProxy.onMethodExit(DFPInitModule.class, "8");
       return;
    }
    public boolean C(){
       return true;
    }
    public boolean H7(){
       Object obj = PatchProxy.applyWithListener(null, this, DFPInitModule.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       PatchProxy.onMethodExit(DFPInitModule.class, "4");
       return (b.b() ^ 0x01);
    }
    public int f0(){
       return 24;
    }
    public List g(){
       Class[] obj = PatchProxy.applyWithListener(null, this, DFPInitModule.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{FoundationInfoInitModule.class};
       PatchProxy.onMethodExit(DFPInitModule.class, "9");
       return Lists.e(obj);
    }
    public void n(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, DFPInitModule.class, "1")) {
          return;
       }
       if (DFPInitModule.r) {
          PatchProxy.onMethodExit(DFPInitModule.class, "1");
          return;
       }else {
          DFPInitModule.r = true;
          if (!PatchProxy.applyVoidWithListener(objArray, this, DFPInitModule.class, "6")) {
             w ow = b.a(-1343064608);
             if (ow != null) {
                KSecurity.setAppStartTime(ow.getAppStartTime());
             }
             KSecurityTrack.setDelegate(new DFPInitModule$2(this, ow));
             PatchProxy.onMethodExit(DFPInitModule.class, "6");
          }
          KSecurity.getkSecurityParameterContext().setDid(a.a);
          KSecurity.getkSecurityParameterContext().setProductName(DFPInitModule.q);
          KSecurity.getkSecurityParameterContext().setRdid(a.f);
          KSecurity.getkSecurityParameterContext().setRdidtag(Integer.toString(a.g));
          KSecurity.getkSecurityParameterContext().setWithFeature(KSecurityContext$Feature.ALL);
          new DFPInitModule$1(this, "dfp_init_t").start();
          PatchProxy.onMethodExit(DFPInitModule.class, "1");
          return;
       }
    }
    public final void n0(){
       boolean b;
       t ot = t.class;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, DFPInitModule.class, "7")) {
          return;
       }
       if (b.a.getBoolean("DisableInitDFP", false)) {
          PatchProxy.onMethodExit(DFPInitModule.class, "7");
          return;
       }else {
          String packageName = a.B.getPackageName();
          if (!PatchProxy.applyVoidOneRefs(packageName, objArray, uoa, "19")) {
             t ot2 = t.c();
             Objects.requireNonNull(ot2);
             if (!PatchProxy.applyVoidOneRefs(packageName, ot2, ot, "6") && !TextUtils.isEmpty(packageName)) {
                ot2.g = packageName;
             }
          }
          b = b.a();
          d.a(-1199738315).di(a.b());
          a.e(a.b(), DFPInitModule.q, b.a, c.a, d.a, a.f, b);
          DFPInitModule$3 u3 = new DFPInitModule$3(this);
          if (!PatchProxy.applyVoidOneRefs(u3, objArray, uoa, "5")) {
             t ot1 = t.c();
             Objects.requireNonNull(ot1);
             if (!PatchProxy.applyVoidOneRefs(u3, ot1, ot, "3") && ot1.c.compareAndSet(false, true)) {
                d.a().b(new v(ot1, u3));
             }
          }
          e.g(new d(this), "DFPInitModule");
          if (TextUtils.x(a.j()) && TextUtils.x(a.u())) {
             a.Y(a.c(a.b(), b));
          }
          PatchProxy.onMethodExit(DFPInitModule.class, "7");
          return;
       }
    }
}
