package com.kuaishou.activity.kwaibubble.krn.KwaiPopKrn;
import rn.a;
import qn.l;
import vn.d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.os.SystemClock;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.c;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.activity.kwaibubble.log.KwaiPopLog;
import java.lang.Throwable;
import java.lang.ref.WeakReference;
import rn.b;
import android.app.Activity;
import com.kuaishou.activity.kwaibubble.krn.KwaiPopKrn$bundleInfo$2;
import msd.a;
import qrd.p;
import qrd.s;
import xn.a;
import java.lang.Long;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qn.h;
import java.lang.Integer;
import com.kuaishou.activity.kwaibubble.krn.KwaiPopKrn$dismiss$1;
import tb7.b;
import js6.a;
import java.lang.StringBuilder;
import xn.a$g;
import qn.m;
import java.lang.Boolean;
import com.kuaishou.activity.kwaibubble.krn.KwaiPopKrn$release$1;
import xn.a$a;
import rn.c;
import o56.f;
import com.kwai.framework.activitycontext.ActivityContext;
import com.yxcorp.gifshow.activity.GifshowActivity;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import com.trello.rxlifecycle3.android.ActivityEvent;
import gr8.b;
import brd.x;
import vn.b;
import erd.r;
import vn.a;
import vn.c;
import erd.g;
import crd.b;
import com.kwai.kds.krn.api.page.KwaiRnContainerView;
import android.content.Context;
import com.kuaishou.krn.model.LaunchModel$b;
import com.kuaishou.krn.model.LaunchModel;
import com.kuaishou.activity.kwaibubble.krn.KwaiPopKrn$a;
import ik0.a;
import com.kuaishou.activity.kwaibubble.krn.KwaiPopKrn$b;
import androidx.lifecycle.LifecycleOwner;
import zj0.x;
import qrd.l1;

public final class KwaiPopKrn implements a, l	// class@00077c
{
    public h a;
    public KwaiRnContainerView b;
    public final long c;
    public Long d;
    public final JsonObject e;
    public Activity f;
    public final p g;
    public final d h;

    public void KwaiPopKrn(d p0){
       JsonObject jsonObject;
       JsonElement jsonElement;
       a.p(p0, "builder");
       super();
       this.h = p0;
       long l = SystemClock.uptimeMillis();
       try{
          this.c = l;
          p0 = this.a().n();
          if (p0 instanceof JsonObject) {
             jsonObject = this.a().n();
          }else if(p0 instanceof String){
             jsonElement = c.d(this.a().n());
             a.o(jsonElement, "JsonParser.parseString\(builder.data\)");
             jsonObject = jsonElement.r();
          }else {
             jsonElement = a.a.x(this.a().n());
             a.o(jsonElement, "Gsons.KWAI_GSON.toJsonTree\(builder.data\)");
             jsonObject = jsonElement.r();
          }
       }catch(java.lang.Exception e3){
          KwaiPopLog.e.C("tkÈÝÆ÷ data½âÎöÊ§°Ü", e3);
          jsonObject = new JsonObject();
       }
       this.e = jsonObject;
       WeakReference weakReferenc = this.a().a();
       Activity uActivity = (weakReferenc != null)? weakReferenc.get(): null;
       this.f = uActivity;
       this.g = s.c(new KwaiPopKrn$bundleInfo$2(this));
       return;
    }
    public static void i(KwaiPopKrn p0,KwaiPopLog p1,a p2,Long p3,Long p4,int p5,Object p6){
       p0.h(p1, p2, null, null);
    }
    public View I(){
       Object[] objArray = null;
       KwaiPopKrn obj = PatchProxy.apply(objArray, this, KwaiPopKrn.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj != null) {
          objArray = obj.c();
       }
       return objArray;
    }
    public d a(){
       return this.h;
    }
    public void b(Integer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiPopKrn.class, "2")) {
          return;
       }
       b.j(new KwaiPopKrn$dismiss$1(this, p0));
       return;
    }
    public a build(){
       return this;
    }
    public void c(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiPopKrn.class, "6")) {
          return;
       }
       a.p(p0, "pop");
       a.b.mN(this.b, "kwai_pop_show_evnet", null);
       l ol = this.a().d();
       if (ol != null) {
          ol.c(this);
       }
       KwaiPopLog e = KwaiPopLog.e;
       Object[] objArray = new Object[0];
       e.F("realShow@"+this.g(), objArray);
       KwaiPopKrn.i(this, e, a$g.b, null, null, 6, null);
       return;
    }
    public void d(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiPopKrn.class, "8")) {
          return;
       }
       l ol = this.a().d();
       if (ol != null) {
          ol.d(this);
       }
       Object[] objArray = new Object[0];
       KwaiPopLog.e.F("onDiscard@"+this.g(), objArray);
       return;
    }
    public void e(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiPopKrn.class, "9")) {
          return;
       }
       a.p(p0, "pop");
       l ol = this.a().d();
       if (ol != null) {
          ol.e(this);
       }
       Object[] objArray = new Object[0];
       KwaiPopLog.e.F("onPending@"+this.g(), objArray);
       return;
    }
    public void f(a p0,int p1){
       KwaiPopKrn kwaiPopKrn = KwaiPopKrn.class;
       if (PatchProxy.isSupport(kwaiPopKrn) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, kwaiPopKrn, "7")) {
          return;
       }
       a.p(p0, "pop");
       l ol = this.a().d();
       if (ol != null) {
          ol.f(this, p1);
       }
       Object[] objArray = new Object[0];
       KwaiPopLog.e.F("onDismiss@"+this.g(), objArray);
       return;
    }
    public final String g(){
       Object obj = PatchProxy.apply(null, this, KwaiPopKrn.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.g.getValue();
    }
    public Activity getActivity(){
       return this.f;
    }
    public b getBuilder(){
       return this.a();
    }
    public final void h(KwaiPopLog p0,a p1,Long p2,Long p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, KwaiPopKrn.class, "11")) {
          return;
       }
       KwaiPopLog.G(p0, this.a().l(), p1, null, null, p2, p3, null, this.a().m(), this.a().b(), null, 588, null);
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, KwaiPopKrn.class, "3")) {
          return;
       }
       b.j(new KwaiPopKrn$release$1(this));
       return;
    }
    public boolean show(){
       boolean obj1;
       Object[] objArray1;
       Activity uActivity;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       KwaiPopKrn kwaiPopKrn = KwaiPopKrn.class;
       LaunchModel$b obj = PatchProxy.apply(null, this, kwaiPopKrn, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       KwaiPopLog e = KwaiPopLog.e;
       KwaiPopKrn.i(this, e, a$a.b, null, null, 6, null);
       this.d = Long.valueOf(SystemClock.uptimeMillis());
       Object[] objArray = PatchProxy.apply(null, this, kwaiPopKrn, "5");
       obj = null;
       if (objArray != patchProxyRe) {
       }else if(!c.c.b()){
          objArray1 = new Object[obj];
          e.D("tk kswitch is close", objArray1);
       }else if(this.a().q != null){
          uActivity = f.a();
       }else {
          ActivityContext uActivityCon = ActivityContext.g();
          a.o(uActivityCon, "ActivityContext.getInstance\(\)");
          uActivity = uActivityCon.e();
       }
       this.f = uActivity;
       if (this.getActivity() != null) {
          uActivity = this.getActivity();
          a.m(uActivity);
          if (!uActivity.isFinishing()) {
             uActivity = this.getActivity();
             if (!uActivity instanceof GifshowActivity) {
                objArray1 = null;
             }
             if (objArray1 != null) {
                objArray1.m().compose(objArray1.E2(ActivityEvent.DESTROY)).filter(new b(objArray1)).subscribe(new a(this), c.b);
             }
             objArray = this.getActivity();
          }
       }
       objArray1 = new Object[obj];
       e.D("activity is dead", objArray1);
       objArray = null;
       if (objArray != null) {
          KwaiRnContainerView kwaiRnContai = new KwaiRnContainerView(objArray);
          obj = new LaunchModel$b();
          obj.i(this.a().l());
          obj.j(this.a().m());
          kwaiRnContai.setCloseHandler(new KwaiPopKrn$a(objArray, this));
          kwaiRnContai.e(objArray, null, obj.l(this.a().r).k(this.a().o()).f("forceShareEngine", this.a().o()).e("kwaiPopData", this.e.toString()).h(), new KwaiPopKrn$b(objArray, this));
          this.b = kwaiRnContai;
          obj1 = true;
       }
       return obj1;
    }
}
