package be9.d;
import oc9.d0;
import be9.d$a;
import nsd.u;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import usd.q;
import com.yxcorp.gifshow.camera.record.base.d;
import java.lang.Integer;
import android.os.Handler;
import qi9.c;
import com.yxcorp.gifshow.camerasdk.q;
import java.lang.System;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.JsonArray;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.google.gson.Gson;
import j8c.a;
import java.lang.Throwable;
import w46.b;
import ekd.k1;
import java.lang.Long;
import k2b.u1;
import q87.c;
import ekd.y0;
import be9.d$d;
import com.yxcorp.gifshow.camerasdk.j$p;
import android.view.View;
import android.os.HandlerThread;
import android.os.Looper;
import be9.d$c;
import java.lang.Runnable;
import yh9.j;
import be9.d$b;

public final class d extends d0	// class@00047d
{
    public y0 o;
    public long p;
    public HandlerThread q;
    public static final d$a r;

    static {
       d.r = new d$a(null);
    }
    public void d(CameraPageType p0,b p1){
       long l;
       a.p(p0, "pageType");
       a.p(p1, "callerContext");
       super(p0, p1);
       p0 = PatchProxy.apply(null, this, d.class, "1");
       if (p0 != PatchProxyResult.class) {
          l = p0.longValue();
       }else {
          long l1 = 0;
          l = (long)((float)a.t().b("postReportSDKPerDataIntervals", l1) * 1000.00f);
          if (l - l1 > 0) {
             l = q.o(1000, l);
          }
       }
       this.p = l;
       return;
    }
    public void G(){
       if (PatchProxy.applyVoid(null, this, d.class, "6")) {
          return;
       }
       if (this.p > 0) {
          this.i2();
       }
       return;
    }
    public void I7(){
       if (PatchProxy.applyVoid(null, this, d.class, "12")) {
          return;
       }
       if (!this.a2()) {
          this.g2();
       }
       return;
    }
    public void d5(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "7")) {
          return;
       }
       d0 tn = this.n;
       tn = (p0 == tn || (p0 != 5 && tn != 5))? 1: 0;
       if (!tn) {
          this.g2();
       }
       super.d5(p0);
       return;
    }
    public final void g2(){
       if (PatchProxy.applyVoid(null, this, d.class, "14")) {
          return;
       }
       d to = this.o;
       if (to != null) {
          to.removeMessages(0);
          this.h2();
          to.sendEmptyMessageDelayed(0, this.p);
       }
       return;
    }
    public final void h2(){
       String str2;
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "11")) {
          return;
       }
       d th = this.h;
       String str = "EffectPerformanceLogger";
       if (th == null || th.n() == null) {
          objArray = new Object[0];
          a.D().w(str, "cameraSDK is not initialize", objArray);
          return;
       }else {
          long l = System.currentTimeMillis();
          JsonObject jsonObject = new JsonObject();
          JsonObject jsonObject1 = this.k2(th.J());
          if (jsonObject1 != null) {
             jsonObject.G("YcnnPluginInfo", jsonObject1);
          }
          String str1 = th.p();
          JsonObject obj = PatchProxy.applyOneRefs(str1, this, uod, "16");
          if (obj != PatchProxyResult.class) {
             objArray = obj;
          }else if(!TextUtils.x(str1)){
             try{
                Object obj1 = new Gson().h(str1, JsonArray.class);
                a.o(obj1, "Gson\(\).fromJson\(jsonStr, JsonArray::class.java\)");
                objArray = obj1.q();
             }catch(java.lang.Exception e0){
                a.D().e(str, "transToJson", e0);
             }
          }
       }
    }
    public final void i2(){
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "10")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uod, "9")) {
          uod = this.o;
          if (uod != null) {
             if (uod.c()) {
                this.h2();
             }
             uod.e();
          }
       }
       uod = this.h;
       if (uod != null) {
          uod.f(new d$d(this));
       }
       return;
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       a.p(p0, "view");
       super.k(p0);
       if (this.p > 0) {
          HandlerThread handlerThrea = new HandlerThread("EffectPerformanceLogger");
          this.q = handlerThrea;
          a.m(handlerThrea);
          handlerThrea.start();
          d tq = this.q;
          a.m(tq);
          this.o = new y0(tq.getLooper(), this.p, new d$c(this));
       }
       return;
    }
    public final JsonObject k2(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.x(p0)) {
          try{
             p0 = new Gson().h(p0, JsonElement.class);
             a.o(p0, "Gson\(\).fromJson\(jsonStr, JsonElement::class.java\)");
             return p0.r();
          }catch(java.lang.Exception e4){
             a.D().e("EffectPerformanceLogger", "transToJson", e4);
          }
          return null;
       }else {
          goto label_0038 ;
       }
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       if (this.p > 0) {
          this.i2();
          this.o = null;
       }
       super.onDestroy();
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       super.onDestroyView();
       d to = this.o;
       if (to != null) {
          to.e();
       }
       to = this.q;
       if (to != null) {
          to.quit();
       }
       return;
    }
    public void s0(){
       if (PatchProxy.applyVoid(null, this, d.class, "13")) {
          return;
       }
       Object obj = this.d.d(j.i);
       a.o(obj, "mCallerContext.getData\(ProgressData.sDefaultValue\)");
       if (!obj.b()) {
          this.g2();
       }
       return;
    }
    public void w(){
       if (PatchProxy.applyVoid(null, this, d.class, "5")) {
          return;
       }
       if (this.p > 0) {
          d th = this.h;
          if (th != null) {
             th.f(new d$b(this));
          }
       }
       return;
    }
}
