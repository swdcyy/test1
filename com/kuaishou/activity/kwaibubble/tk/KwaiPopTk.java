package com.kuaishou.activity.kwaibubble.tk.KwaiPopTk;
import rn.a;
import zn.a;
import qn.l;
import zn.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.ref.WeakReference;
import rn.b;
import android.app.Activity;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.c;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.activity.kwaibubble.log.KwaiPopLog;
import java.lang.Throwable;
import com.kuaishou.activity.kwaibubble.tk.KwaiPopTk$d;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qn.h;
import java.lang.Integer;
import com.kuaishou.activity.kwaibubble.tk.KwaiPopTk$dismiss$1;
import msd.a;
import tb7.b;
import sx4.e;
import tx4.h;
import zn.c;
import rx4.a;
import xn.a$g;
import java.lang.Boolean;
import qn.m;
import xn.a;
import java.lang.Long;
import java.lang.StringBuilder;
import zn.c$a;
import tx4.o;
import qrd.l1;
import com.kuaishou.activity.kwaibubble.KwaiPopGlobalConfig;
import rn.c;
import o56.f;
import com.kwai.framework.activitycontext.ActivityContext;
import com.yxcorp.gifshow.activity.GifshowActivity;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import com.trello.rxlifecycle3.android.ActivityEvent;
import gr8.b;
import brd.x;
import com.kuaishou.activity.kwaibubble.tk.KwaiPopTk$b;
import erd.r;
import com.kuaishou.activity.kwaibubble.tk.KwaiPopTk$a;
import com.kuaishou.activity.kwaibubble.tk.KwaiPopTk$c;
import erd.g;
import crd.b;
import com.kuaishou.activity.kwaibubble.tk.KwaiPopTk$release$1;
import android.os.Looper;
import xn.a$d;
import qn.m$c;
import com.yxcorp.utility.SystemUtil;
import o56.a;
import java.lang.IllegalThreadStateException;
import wkd.b;
import qn.c;
import qn.g;
import java.util.Objects;
import kotlin.Pair;
import com.kuaishou.activity.kwaibubble.startup.UserGrowthDialogBlockRules;
import java.lang.reflect.Type;
import zb0.a;
import java.util.Map;
import com.kuaishou.activity.kwaibubble.startup.BlockRuleAvoidConfig;
import java.util.Iterator;
import java.lang.Iterable;
import un.a;
import qn.f;
import xn.a$f;
import xn.a$a;
import android.os.SystemClock;
import sx4.e$a;

public final class KwaiPopTk implements a, a, l	// class@000793
{
    public h a;
    public c b;
    public Activity c;
    public final JsonObject d;
    public e e;
    public final KwaiPopTk$d f;
    public final b g;

    public void KwaiPopTk(b p0){
       JsonObject jsonObject;
       JsonElement jsonElement;
       a.p(p0, "builder");
       super();
       this.g = p0;
       WeakReference weakReferenc = this.h().a();
       Activity uActivity = (weakReferenc != null)? weakReferenc.get(): null;
       this.c = uActivity;
       try{
          uActivity = this.h().m();
          if (uActivity instanceof JsonObject) {
             jsonObject = this.h().m();
          }else if(uActivity instanceof String){
             jsonElement = c.d(this.h().m());
             a.o(jsonElement, "JsonParser.parseString\(builder.data\)");
             jsonObject = jsonElement.r();
          }else {
             jsonElement = a.a.x(this.h().m());
             a.o(jsonElement, "Gsons.KWAI_GSON.toJsonTree\(builder.data\)");
             jsonObject = jsonElement.r();
          }
       }catch(java.lang.Exception e3){
          KwaiPopLog.e.C("tk容器 data解析失败", e3);
          jsonObject = new JsonObject();
       }
       this.d = jsonObject;
       this.f = new KwaiPopTk$d(this);
       return;
    }
    public View I(){
       Object[] objArray = null;
       KwaiPopTk obj = PatchProxy.apply(objArray, this, KwaiPopTk.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj != null) {
          objArray = obj.c();
       }
       return objArray;
    }
    public void a(int p0,Throwable p1){
       if (PatchProxy.isSupport(KwaiPopTk.class)) {
          PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, KwaiPopTk.class, "13");
       }
       return;
    }
    public void b(Integer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiPopTk.class, "2")) {
          return;
       }
       b.j(new KwaiPopTk$dismiss$1(this, p0));
       return;
    }
    public a build(){
       return this;
    }
    public void c(a p0){
       a$g b;
       c a;
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiPopTk.class, "8")) {
          return;
       }
       a.p(p0, "pop");
       KwaiPopTk te = this.e;
       if (te != null) {
          b.a(te, "onShow", null, null, 6, null);
       }
       KwaiPopTk tb = this.b;
       if (tb != null && !PatchProxy.applyVoid(null, tb, c.class, "5")) {
          a = tb.a;
          if (a != null) {
             a.onResume();
          }
       }
       l ol = this.h().d();
       if (ol != null) {
          ol.c(this);
       }
       KwaiPopLog e = KwaiPopLog.e;
       String str = this.h().l();
       b = a$g.b;
       KwaiPopTk tb1 = this.b;
       boolean b1 = true;
       if (tb1 == null || tb1.b() != b1) {
          b1 = false;
       }
       KwaiPopLog.G(e, str, b, Boolean.valueOf(b1), null, null, null, null, null, this.h().b(), null, 760, null);
       Object[] objArray = new Object[0];
       e.F("realShow@"+this.h().l(), objArray);
       return;
    }
    public void d(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiPopTk.class, "10")) {
          return;
       }
       l ol = this.h().d();
       if (ol != null) {
          ol.d(this);
       }
       return;
    }
    public void e(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiPopTk.class, "11")) {
          return;
       }
       a.p(p0, "pop");
       l ol = this.h().d();
       if (ol != null) {
          ol.e(this);
       }
       return;
    }
    public void f(a p0,int p1){
       KwaiPopTk kwaiPopTk = KwaiPopTk.class;
       if (PatchProxy.isSupport(kwaiPopTk) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, kwaiPopTk, "9")) {
          return;
       }
       a.p(p0, "pop");
       l ol = this.h().d();
       if (ol != null) {
          ol.f(this, p1);
       }
       return;
    }
    public final void g(){
       c$a uoa = c$a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KwaiPopTk.class, "6")) {
          return;
       }
       c$a uoa1 = new c$a(this.h().l(), this.h().q, this, this.f, this.h().u);
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("action", "initData");
       jsonObject.G("data", this.d);
       String str = jsonObject.toString();
       a.o(str, "JsonObject\(\).apply {\n   … data\)\n      }.toString\(\)");
       if (!PatchProxy.applyVoidOneRefs(str, v1, uoa, "1")) {
          a.p(str, "<set-?>");
          v1.a = str;
       }
       str = KwaiPopGlobalConfig.c.a(v1.a());
       if (str != null && !PatchProxy.applyVoidOneRefs(str, v1, uoa, "2")) {
          a.p(str, "<set-?>");
          v1.b = str;
       }
       c uoc = PatchProxy.apply(objArray, v1, uoa, "3");
       if (uoc != PatchProxyResult.class) {
       }else {
          uoc = new c(v1);
       }
       this.b = uoc;
       return;
    }
    public Activity getActivity(){
       return this.c;
    }
    public b getBuilder(){
       return this.h();
    }
    public b h(){
       return this.g;
    }
    public final Activity i(){
       Object[] objArray1;
       Object[] objArray2;
       Object[] objArray = null;
       Activity obj = PatchProxy.apply(objArray, this, KwaiPopTk.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       if (!c.c.b()) {
          objArray1 = new Object[i];
          KwaiPopLog.e.D("tk kswitch is close", objArray1);
          return objArray;
       }else if(this.h().r != null){
          obj = f.a();
       }else {
          WeakReference weakReferenc = this.h().a();
          obj = (weakReferenc != null)? weakReferenc.get(): objArray;
          if (obj != null) {
             weakReferenc = this.h().a();
             if (weakReferenc != null) {
                obj = weakReferenc.get();
             }else {
                objArray2 = objArray;
             }
          }else {
             ActivityContext uActivityCon = ActivityContext.g();
             a.o(uActivityCon, "ActivityContext.getInstance\(\)");
             objArray2 = uActivityCon.e();
          }
       }
       this.c = obj;
       if (this.getActivity() != null) {
          obj = this.getActivity();
          a.m(obj);
          if (!obj.isFinishing()) {
             obj = this.getActivity();
             if (obj instanceof GifshowActivity) {
                objArray = obj;
             }
             if (objArray != null) {
                objArray.m().compose(objArray.E2(ActivityEvent.DESTROY)).filter(new KwaiPopTk$b(objArray)).subscribe(new KwaiPopTk$a(this), KwaiPopTk$c.b);
             }
             return this.getActivity();
          }
       }
       objArray1 = new Object[i];
       KwaiPopLog.e.D("activity is dead", objArray1);
       return objArray;
    }
    public void onSuccess(){
       PatchProxy.applyVoid(null, this, KwaiPopTk.class, "12");
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, KwaiPopTk.class, "3")) {
          return;
       }
       b.j(new KwaiPopTk$release$1(this));
       return;
    }
    public boolean show(){
       boolean b;
       Activity uActivity;
       boolean b2;
       Object[] objArray1;
       Object obj = this;
       c uoc = c.class;
       KwaiPopTk kwaiPopTk = KwaiPopTk.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String str = "1";
       String obj1 = PatchProxy.apply(objArray, obj, kwaiPopTk, str);
       if (obj1 != patchProxyRe) {
          return obj1.booleanValue();
       }
       g obj2 = PatchProxy.apply(objArray, obj, kwaiPopTk, "7");
       boolean i = 1;
       if (obj2 != patchProxyRe) {
          b = obj2.booleanValue();
       }else if(a.g(Looper.getMainLooper(), Looper.myLooper()) ^ i){
          KwaiPopLog e = KwaiPopLog.e;
          Object[] objArray2 = new Object[false];
          e.D("KwaiPopTk show 必须在主线程调用!!!", objArray2);
          obj1 = "KwaiPopTk show 必须在主线程调用!!!";
          KwaiPopLog.G(e, this.h().l(), a$d.b, Boolean.valueOf(this.h().o()), null, null, null, false, null, m$c.b, null, 760, null);
          if (!SystemUtil.K() || !a.d()) {
             b = true;
          }else {
             throw new IllegalThreadStateException(obj1);
          }
       }else {
          b = false;
       }
       if (b) {
          obj.d(objArray);
          return false;
       }else {
          i = -1442571954;
          if (!this.h().e()) {
             b.a(i).b(this.h().l());
          }
          obj2 = g.c;
          String str1 = this.h().l();
          b uob = this.h();
          Objects.requireNonNull(obj2);
          String str2 = "2";
          Pair pair = PatchProxy.applyTwoRefs(str1, uob, obj2, g.class, str2);
          if (pair != patchProxyRe) {
          }else {
             a.p(uob, "builder");
             pair = (str1 == null || !str1.length())? 1: null;
             int i1 = -1;
             if (pair) {
                pair = new Pair(Boolean.FALSE, Integer.valueOf(i1));
             }else {
                UserGrowthDialogBlockRules userGrowthDi = a.a(UserGrowthDialogBlockRules.class);
                Map avoidConfigs = (userGrowthDi != null)? userGrowthDi.getAvoidConfigs(): objArray;
                BlockRuleAvoidConfig uBlockRuleAv = (avoidConfigs != null)? avoidConfigs.get(str1): objArray;
                int i2 = -36665;
                Iterator iterator = g.a.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      if (iterator.next().a(g.b, uBlockRuleAv)) {
                         b.a(i).a(str1, uBlockRuleAv, uob);
                         pair = new Pair(Boolean.TRUE, Integer.valueOf(i2));
                      }else {
                         i2 = i2 - 1;
                      }
                   }else {
                      pair = new Pair(Boolean.FALSE, Integer.valueOf(i1));
                   }
                }
                return i;
             }
          }
          if (pair.getFirst().booleanValue()) {
             KwaiPopLog.G(KwaiPopLog.e, this.h().l(), a$f.b, Boolean.valueOf(this.h().o()), Boolean.valueOf(this.h().e()), null, null, pair.getSecond(), null, this.h().b(), null, 688, null);
             return false;
          }else {
             b.a(i).c(this.h().l());
             obj1 = "activity";
             if (this.h().o()) {
                uActivity = this.i();
                if (uActivity != null) {
                   this.g();
                   KwaiPopTk b1 = obj.b;
                   if (b1 != null) {
                      a obj3 = PatchProxy.applyOneRefs(uActivity, b1, uoc, str2);
                      if (obj3 != patchProxyRe) {
                         b2 = obj3.booleanValue();
                      }else {
                         a.p(uActivity, obj1);
                         b1.d = true;
                         KwaiPopLog.G(KwaiPopLog.e, b1.f, a$a.b, Boolean.TRUE, null, null, null, null, null, m$c.b, null, 760, null);
                         b1.c = SystemClock.uptimeMillis();
                         obj3 = b1.a(uActivity);
                         b1.a = obj3;
                         if (obj3 != null) {
                            objArray1 = new Object[]{b1.j};
                            objArray = obj3.f(objArray, b1.e, b1.g, objArray1);
                         }
                         if (objArray != null) {
                            b2 = true;
                         }else {
                            b2 = false;
                         }
                      }
                      if (b2 == true) {
                         i = true;
                         goto label_0209 ;
                      }
                   }
                   i = false;
                   goto label_0209 ;
                }else {
                   return false;
                }
             }else {
                uActivity = this.i();
                if (uActivity != null) {
                   this.g();
                   KwaiPopTk b3 = obj.b;
                   if (b3 != null && !PatchProxy.applyVoidOneRefs(uActivity, b3, uoc, str)) {
                      a.p(uActivity, obj1);
                      b3.d = false;
                      KwaiPopLog.G(KwaiPopLog.e, b3.f, a$a.b, Boolean.FALSE, null, null, null, null, null, m$c.b, null, 760, null);
                      b3.c = SystemClock.uptimeMillis();
                      a uoa = b3.a(uActivity);
                      objArray1 = new Object[]{b3.j};
                      uoa.n(c.c.a(), null, b3.e, b3.g, objArray1);
                      b3.a = uoa;
                   }
                }
                return true;
             }
          }
       }
    }
}
