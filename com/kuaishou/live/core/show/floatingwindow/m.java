package com.kuaishou.live.core.show.floatingwindow.m;
import java.lang.Object;
import android.graphics.Rect;
import java.util.LinkedHashMap;
import com.kuaishou.live.core.show.floatingwindow.m$a;
import android.os.Looper;
import com.kuaishou.live.core.show.floatingwindow.m$b;
import com.kuaishou.live.core.show.floatingwindow.m$c;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowCloseType;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import s82.u;
import java.lang.Runnable;
import android.os.Handler;
import com.kuaishou.live.core.show.floatingwindow.i;
import wkd.b;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager;
import wp5.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import wp5.d;
import com.kuaishou.android.live.model.LiveFloatingWindowType;
import s82.o;
import java.lang.ref.WeakReference;
import com.kwai.video.waynelive.LivePlayerController;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import tj3.e;
import java.lang.StringBuilder;
import z12.e;
import com.kwai.framework.model.user.QCurrentUser;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import lnc.i9;
import s82.r0;
import com.kuaishou.live.core.show.floatingwindow.h;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager$m;
import s82.p;
import z1.a;
import java.lang.System;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Integer;
import android.app.Activity;
import java.util.ArrayList;
import java.util.Set;
import java.util.Collection;
import java.util.ListIterator;
import z1.e;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Collections;
import pm8.a;
import android.app.Application$ActivityLifecycleCallbacks;
import android.content.SharedPreferences;
import u07.t$a;
import com.kuaishou.live.core.show.floatingwindow.l;
import u07.u;
import com.kuaishou.live.core.show.floatingwindow.j;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.kuaishou.live.core.show.floatingwindow.k;
import s82.s;
import u07.t;
import u07.j;
import java.util.Objects;
import com.kuaishou.live.core.show.floatingwindow.m$d;
import android.view.Window;
import o07.d$a;
import o07.d;

public class m	// class@000b8f
{
    public boolean a;
    public boolean b;
    public Application c;
    public LiveStreamFeed d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public int i;
    public Rect j;
    public boolean k;
    public boolean l;
    public long m;
    public boolean n;
    public m$d o;
    public Activity p;
    public final LinkedHashMap q;
    public final Handler r;
    public final Application$ActivityLifecycleCallbacks s;
    public final r0 t;

    public void m(){
       super();
       this.a = true;
       this.b = false;
       this.f = -1;
       this.g = -1;
       this.j = new Rect();
       this.q = new LinkedHashMap(4);
       this.r = new m$a(this, Looper.myLooper());
       this.s = new m$b(this);
       this.t = new m$c(this);
    }
    public void a(LiveFloatingWindowCloseType p0,boolean p1){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, om, "7")) {
          return;
       }
       if (Looper.getMainLooper() != Looper.myLooper()) {
          this.r.post(new u(this, p0, p1));
          return;
       }else if(this.e != null){
          i oi = i.class;
          if (!PatchProxy.isSupport(oi) || !PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, oi, "1")) {
             b.a(0x432c5e03).d(p0, p1);
          }
       }
       return;
    }
    public int b(c p0){
       int i;
       boolean b1;
       Object obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d obj1 = PatchProxy.applyOneRefs(p0, obj, m.class, "9");
       if (obj1 != patchProxyRe) {
          return obj1.intValue();
       }
       obj1 = p0.l();
       m t = obj.t;
       boolean b = p0.e();
       LiveFloatingWindowType liveFloating = p0.m();
       String str = p0.b();
       i oi = i.class;
       Object obj2 = null;
       i = 0;
       int i1 = 1;
       if (PatchProxy.isSupport(oi)) {
          Object[] objArray = new Object[]{obj1,t,Boolean.valueOf(b),liveFloating,str};
          o obj3 = PatchProxy.apply(objArray, obj2, oi, "2");
          if (obj3 != patchProxyRe) {
             i = obj3.intValue();
          label_0058 :
             b1 = true;
          }else {
          label_005b :
             LiveFloatingWindowManager liveFloating1 = b.a(0x432c5e03);
             o oo = liveFloating1.e();
             obj3 = oo.b;
             LivePlayerController livePlayerCo = (obj3 != null)? obj3.get(): obj2;
             o d = oo.d;
             LiveStreamFeedWrapper liveStreamFe = (d != null)? d.get(): obj2;
             d = oo.a;
             LivePlayFragment livePlayFrag = (d != null)? d.get(): obj2;
             d = oo.c;
             e uoe = (d != null)? d.get(): obj2;
             String[] stringArray = new String[i1];
             stringArray[i] = "livePlayerControllerTemp: "+livePlayerCo+" mLiveStreamFeedWrapper: "+liveStreamFe+" LivePlayFragment: "+livePlayFrag;
             e.c("LiveFloatingWindowExternalHelper", "showLiveExternalFloatWindow", stringArray);
             if (livePlayerCo != null && (liveStreamFe == null || livePlayFrag == null)) {
                b1 = true;
                i = -4;
             }else if(QCurrentUser.me().isLogined()){
                if (livePlayerCo.getVideoWidth() <= 0 || livePlayerCo.getVideoHeight() <= 0) {
                   b1 = true;
                   i = -5;
                }else if(!i9.a(a.a().a())){
                   i = -3;
                   goto label_0058 ;
                }else if(liveFloating1.n()){
                   liveFloating1.y();
                   goto label_0058 ;
                }else {
                   int[] ointArray = i.a(obj1);
                   liveFloating1.F(ointArray[i], ointArray[i1]);
                   if (obj1 != null) {
                      liveFloating1.E(obj1);
                   }
                   liveFloating1.a(t);
                   h oh = new h(liveFloating1, liveStreamFe, str, t, oo, livePlayFrag);
                   liveFloating1.A(i);
                   b1 = true;
                   h oh1 = obj1;
                   if (liveFloating1.B(livePlayerCo, uoe, liveStreamFe, oh1, null, b, liveFloating, str)) {
                      i = 0;
                   }
                }
             }else {
                b1 = true;
             }
             i = -1;
          }
       }else {
          goto label_005b ;
       }
       if (!i) {
          obj.d(new p(obj));
          obj.m = System.currentTimeMillis();
          obj.e = b1;
          b.c0(LiveLogTag.FLOATING_WINDOW, "show floating window success", "delegateType", p0.m().mType);
       }else {
          b.d0(LiveLogTag.FLOATING_WINDOW, "show floating window failed", " code: ", Integer.valueOf(i), "delegateType", p0.m().mType);
       }
       return i;
    }
    public c c(Activity p0){
       e uoe;
       ListIterator obj = PatchProxy.applyOneRefs(p0, this, m.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String simpleName = p0.getClass().getSimpleName();
       obj = new ArrayList(this.q.keySet()).listIterator(this.q.size());
       while (true) {
          if (!obj.hasPrevious()) {
             return null;
          }
          uoe = this.q.get(obj.previous());
          if (uoe != null && uoe.a != null) {
             e b = uoe.b;
             if (b != null && b.contains(simpleName)) {
                break ;
             }
          }
       }
       return uoe.a;
    }
    public void d(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "17")) {
          return;
       }
       Iterator iterator = this.q.entrySet().iterator();
       while (iterator.hasNext()) {
          e a = iterator.next().getValue().a;
          if (a != null) {
             p0.accept(a);
          }
       }
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, m.class, "11")) {
          return;
       }
       this.j = new Rect();
       this.k = false;
       this.l = false;
       return;
    }
    public void f(Activity p0,LiveStreamFeed p1,String p2,c p3,Collection p4,boolean p5){
       m om = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       if (PatchProxy.isSupport(m.class)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,oobject3,p4,Boolean.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, m.class, "3")) {
             return;
          }
       }
       if (oobject == null || (oobject3 != null && !TextUtils.isEmpty(p2))) {
          Set set = (p4 == null)? Collections.emptySet(): p4;
          if (!PatchProxy.applyVoidThreeRefs(p2, p3, set, this, m.class, "15")) {
             om.q.put(oobject2, e.a(oobject3, set));
          }
          if (!i9.a(p0.getApplicationContext()) && !a.n0()) {
             b.Z(LiveLogTag.FLOATING_WINDOW, "show failed because of not remind");
             return;
          }else if(om.e != null){
             b.Z(LiveLogTag.FLOATING_WINDOW, "ignore because of already shown");
             return;
          }else {
             om.c = p0.getApplication();
             om.d = oobject1;
             om.n = false;
             this.e();
             if (!p5) {
                om.c.unregisterActivityLifecycleCallbacks(om.s);
                om.c.registerActivityLifecycleCallbacks(om.s);
             }else if(PatchProxy.applyVoidTwoRefs(oobject, oobject3, this, m.class, "1")){
                if (om.e != null) {
                   om.r.removeMessages(0);
                }else if(this.b(oobject3) == -3 && (om.n == null && a.n0())){
                   this.g(oobject, oobject3);
                   om.n = true;
                }
             }
          }
       }
    label_00ce :
       return;
    }
    public void g(Activity p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, m.class, "16")) {
          return;
       }
       SharedPreferences a = a.a;
       int i = a.getBoolean("merchant_float_window_permission_guide_once", false) ^ 1;
       t$a uoa = new t$a(p0);
       uoa.X0(p1.h());
       uoa.z0(p1.a());
       uoa.S0(R.string.arg_RES_7f103298);
       uoa.u0(new l(this, p0, i));
       if (i) {
          uoa.Q0(R.string.arg_RES_7f103296);
          uoa.t0(new j(this));
          SharedPreferences$Editor uEditor = a.edit();
          uEditor.putBoolean("merchant_float_window_permission_guide_once", 1);
          g.a(uEditor);
       }else {
          uoa.Q0(R.string.arg_RES_7f103297);
          uoa.t0(new k(this));
       }
       this.d(new s(this, i));
       j.d(uoa);
       return;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, m.class, "14")) {
          return;
       }
       m to = this.o;
       if (to != null) {
          Objects.requireNonNull(to);
          if (!PatchProxy.applyVoid(null, to, m$d.class, "4")) {
             d.c(to.b, to);
          }
          this.o = null;
       }
       return;
    }
}
