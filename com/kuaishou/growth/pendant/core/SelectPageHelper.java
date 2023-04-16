package com.kuaishou.growth.pendant.core.SelectPageHelper;
import com.kuaishou.growth.pendant.core.SelectPageHelper$mTryTaskOnPageEnterOrResume$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.app.Activity;
import ce0.b;
import tkd.b;
import tkd.d;
import yt5.g;
import java.lang.StringBuilder;
import vt5.a;
import au5.b;
import k2b.k2;
import k2b.u1;
import pt5.a;
import m56.e;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class SelectPageHelper	// class@000630
{
    public static String a;
    public static int b;
    public static String c;
    public static boolean d;
    public static boolean e;
    public static boolean f;
    public static String g;
    public static final p h;
    public static final SelectPageHelper i;

    static {
       SelectPageHelper.i = new SelectPageHelper();
       SelectPageHelper.h = s.c(SelectPageHelper$mTryTaskOnPageEnterOrResume$2.INSTANCE);
    }
    public void SelectPageHelper(){
       super();
    }
    public static final boolean a(SelectPageHelper p0){
       return SelectPageHelper.e;
    }
    public static final String b(SelectPageHelper p0){
       return SelectPageHelper.a;
    }
    public static final void c(SelectPageHelper p0,String p1){
       SelectPageHelper.a = p1;
    }
    public final boolean d(){
       Object obj = PatchProxy.apply(null, this, SelectPageHelper.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = SelectPageHelper.h.getValue();
       }
       return obj.booleanValue();
    }
    public final void e(GifshowActivity p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SelectPageHelper.class, "3")) {
          return;
       }
       if (p0.isFinishing() || p0.isDestroyed()) {
          Object[] objArray = new Object[0];
          b.C().D("trigOnPageChange activity get is destroy because ILogManager resume before ActivityContext currentActivity", objArray);
          SelectPageHelper.d = true;
          SelectPageHelper.c = p1;
       }else {
          this.g(p0, p1);
       }
       return;
    }
    public final boolean f(GifshowActivity p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, SelectPageHelper.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Object[] objArray = new Object[0];
       b.C().D("tryTask", objArray);
       return d.a(-626371061).d2(p0, 0, p1);
    }
    public final void g(GifshowActivity p0,String p1){
       boolean b;
       int i1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SelectPageHelper.class, "13")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       b.C().D("tryToShowPendant page2:"+p1, objArray);
       b = this.f(p0, p1);
       a uoa = b.a();
       k2 ok2 = u1.j();
       ok2 = (ok2 != null)? ok2.c: 0;
       Object[] objArray1 = new Object[i];
       b.C().D("result: "+b+", newPendantHasShowed: "+uoa.aC(p0, ok2, p1), objArray1);
       if (b) {
          return;
       }else {
          a uoa1 = d.a(0x60b9226c);
          if (p1 == null) {
             p1 = "";
          }
          uoa1.G60(p0, p1, "“≥√Ê«–ªª");
          return;
       }
    }
    public final void onActivityResumeEvent(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SelectPageHelper.class, "7")) {
          return;
       }
       a.p(p0, "event");
       String name = p0.a.getClass().getName();
       if (!TextUtils.n(name, SelectPageHelper.g)) {
          SelectPageHelper.g = name;
          SelectPageHelper.e = true;
       }
       return;
    }
}
