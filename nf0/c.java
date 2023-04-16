package nf0.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import nf0.c$a;
import nsd.u;
import java.lang.System;
import nf0.c$b;
import nf0.c$c;
import nf0.c$d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.webview.yoda.utils.q;
import com.kuaishou.webkit.extension.KwSdk;
import tkd.b;
import tkd.d;
import p80.m;
import p80.a;
import nyc.e;
import kotlin.jvm.internal.a;
import nf0.c$e;
import java.lang.Runnable;
import t45.c;
import com.kuaishou.growth.pendant.ui.PendantExpHelper;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import java.lang.Number;
import ekd.k1;
import lnc.i3;
import java.lang.Boolean;
import k2b.u1;
import nf0.c$f;
import android.view.View$OnClickListener;
import android.view.View;
import java.util.List;
import java.lang.Long;
import android.content.Context;
import wkd.b;
import nf6.i;
import android.net.Uri;
import android.content.Intent;
import com.yxcorp.gifshow.webview.c;
import android.app.Activity;
import ekd.m1;

public final class c extends PresenterV2	// class@003304
{
    public String p;
    public long q;
    public boolean r;
    public boolean s;
    public boolean t;
    public View u;
    public long v;
    public long w;
    public final c$b x;
    public final e y;
    public final Runnable z;
    public static boolean A;
    public static final c$a B;

    static {
       c.B = new c$a(null);
    }
    public void c(){
       super();
       this.p = "";
       this.q = System.currentTimeMillis();
       this.x = new c$b(this);
       this.y = new c$c(this);
       this.z = new c$d(this);
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "4")) {
          return;
       }
       this.s = q.d();
       this.t = KwSdk.isCoreLoaded();
       this.w = System.currentTimeMillis();
       d.a(-1717725018).Nz(this.x);
       String str = q.a(this.y);
       if (a.g(str, "yoda_init_end")) {
          this.s = true;
       }else {
          a.g(str, "yoda_init_start");
       }
       if (this.t == null) {
          c.a(c$e.b);
       }
       c tz = this.z;
       Number number = PatchProxy.apply(objArray, objArray, PendantExpHelper.class, "2");
       if (number == PatchProxyResult.class) {
          number = PendantExpHelper.c.getValue();
       }
       k1.r(tz, number.longValue());
       if (PendantExpHelper.b()) {
          i3 oi3 = i3.f();
          oi3.a("isYodaLoadSucceed", Boolean.valueOf(this.s));
          oi3.a("isKsWebLoadSucceed", Boolean.valueOf(this.t));
          u1.R("pendant_yoda_loading_show", oi3.e(), 9);
       }
       if (this.s != null && this.t != null) {
          this.P8();
       }
       tz = this.u;
       if (tz != null) {
          tz.setOnClickListener(new c$f(this));
       }
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       c.A = false;
       this.v = System.currentTimeMillis();
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "5")) {
          return;
       }
       d.a(-1717725018).d7(this.x);
       c ty = this.y;
       if (!PatchProxy.applyVoidOneRefs(ty, objArray, q.class, "7") && ty != null) {
          q.d.remove(ty);
       }
       k1.m(this.z);
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, c.class, "6")) {
          return;
       }
       if (c.A) {
          return;
       }
       if (PendantExpHelper.b()) {
          i3 oi3 = i3.f();
          oi3.a("isTimeOut", Boolean.valueOf(this.r));
          oi3.c("loadingTime", Long.valueOf((System.currentTimeMillis() - this.v)));
          u1.R("pendant_yoda_loading_succeed", oi3.e(), 9);
       }
       c.A = true;
       if (this.getContext() != null) {
          Intent intent = b.a(0x66dce92a).a(this.getContext(), Uri.parse(this.p));
          if (intent != null) {
             i3 oi31 = i3.f();
             oi31.c("clickPendantTime", Long.valueOf(this.q));
             oi31.c("loadingStartTime", Long.valueOf(this.v));
             oi31.c("loadingShowTime", Long.valueOf(this.w));
             oi31.c("loadingEndTime", Long.valueOf(System.currentTimeMillis()));
             String str = (this.r != null)? "timeOut": "loadingSucceed";
             oi31.d("loadingEndReason", str);
             intent.putExtra("loading_wait_info", oi31.e());
             c.i(this.getContext(), intent);
          }
       }
       Activity activity = this.getActivity();
       if (activity != null) {
          activity.finish();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       this.u = m1.f(p0, 0x7f0a1716);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       Object obj = this.r8("PENDANT_LOAD_URL");
       a.o(obj, "inject\(PENDANT_LOAD_URL\)");
       this.p = obj;
       obj = this.r8("PENDANT_CLICK_TIME_STAMP");
       a.o(obj, "inject\(PENDANT_CLICK_TIME_STAMP\)");
       this.q = obj.longValue();
       return;
    }
}
