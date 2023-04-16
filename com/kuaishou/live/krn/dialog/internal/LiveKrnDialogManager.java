package com.kuaishou.live.krn.dialog.internal.LiveKrnDialogManager;
import r63.a;
import com.kuaishou.live.krn.dialog.internal.LiveKrnDialogManager$a;
import nsd.u;
import java.lang.Object;
import java.util.WeakHashMap;
import java.util.LinkedList;
import kotlin.LazyThreadSafetyMode;
import com.kuaishou.live.krn.dialog.internal.LiveKrnDialogManager$mainScope$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.String;
import android.net.Uri;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import o63.d;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import s51.a;
import com.kuaishou.livestream.message.nano.LiveCommonRoutePopupStrategy;
import fg6.a;
import com.google.gson.Gson;
import s63.s;
import com.kuaishou.live.krn.dialog.internal.LiveKrnDialogManager$b;
import java.util.Queue;
import ftd.k0;
import android.os.SystemClock;
import java.util.Map;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.live.krn.dialog.internal.LiveKrnDialogManager$realShowDialog$1;
import androidx.lifecycle.LifecycleObserver;
import lp3.e;
import lp3.c;
import lp3.b;
import ftd.l0;
import java.util.concurrent.CancellationException;
import java.lang.Boolean;
import java.lang.StringBuilder;
import com.kuaishou.live.jsbridge.LiveJsBridgeLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.krn.dialog.internal.LiveKrnDialogManager$tryShowNextDialog$1;
import asd.c;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import msd.p;
import ftd.z1;
import kotlinx.coroutines.a;

public final class LiveKrnDialogManager implements a	// class@001d5d
{
    public boolean b;
    public final WeakHashMap c;
    public final Queue d;
    public long e;
    public boolean f;
    public final p g;
    public static final LiveKrnDialogManager$a h;

    static {
       LiveKrnDialogManager.h = new LiveKrnDialogManager$a(null);
    }
    public void LiveKrnDialogManager(){
       super();
       this.c = new WeakHashMap();
       this.d = new LinkedList();
       this.g = s.b(LazyThreadSafetyMode.NONE, LiveKrnDialogManager$mainScope$2.INSTANCE);
    }
    public static void G(LiveKrnDialogManager p0,String p1,Uri p2,String p3,int p4,Object p5){
       if (p4 & 0x02) {
          p2 = null;
       }
       if (p4 & 0x04) {
          p3 = null;
       }
       p0.w(p1, p2, p3);
       return;
    }
    public void Bm(){
       if (PatchProxy.applyVoid(null, this, LiveKrnDialogManager.class, "3")) {
          return;
       }
       LiveKrnDialogManager.G(this, "disableDialog", null, null, 6, null);
       this.b = true;
       return;
    }
    public d C6(Uri p0,a p1){
       LiveCommonRoutePopupStrategy this;
       Object obj1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "2";
       String obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveKrnDialogManager.class, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       try{
          obj = "uri";
          a.p(p0, obj);
          a.p(p1, "showDialogCallback");
          LiveKrnDialogManager.G(this, "addShowDialogTask", p0, null, 4, null);
          this = null;
          obj1 = PatchProxy.applyOneRefs(p0, this, a.class, str);
          if (obj1 != patchProxyRe) {
          }else {
             a.p(p0, obj);
             String queryParamet = p0.getQueryParameter("_popup_strategy");
             if (queryParamet != null) {
                obj = "uri.getQueryParameter\(po\x20\x02rategyKey\) ?: return null\x00";
                a.o(queryParamet, obj);
                this = a.a.h(queryParamet, LiveCommonRoutePopupStrategy.class);
             }
             obj1 = this;
          }
       }catch(java.lang.Exception e0){
       }
       if (obj1 != null) {
          if (this.r(obj1)) {
             return this.P(p0, p1);
          }else {
             s os = new s();
             this.d.offer(new LiveKrnDialogManager$b(p0, obj1, os, p1));
             return os;
          }
       }else {
          return this.P(p0, p1);
       }
    }
    public final k0 N(){
       Object obj = PatchProxy.apply(null, this, LiveKrnDialogManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.g.getValue();
    }
    public final d P(Uri p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveKrnDialogManager.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       LiveKrnDialogManager.G(this, "realShowDialog", p0, null, 4, null);
       this.e = SystemClock.uptimeMillis();
       d uod = p1.invoke();
       this.c.put(uod, p0);
       uod.getLifecycle().addObserver(super(this, p0, uod));
       return uod;
    }
    public void ao(){
       if (PatchProxy.applyVoid(null, this, LiveKrnDialogManager.class, "4")) {
          return;
       }
       LiveKrnDialogManager.G(this, "enableDialog", null, null, 6, null);
       this.b = false;
       this.y0();
       return;
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       if (PatchProxy.applyVoid(null, this, LiveKrnDialogManager.class, "5")) {
          return;
       }
       if (l0.k(this.N())) {
          l0.f(this.N(), null, 1, null);
       }
       this.c.clear();
       this.d.clear();
       return;
    }
    public final boolean r(LiveCommonRoutePopupStrategy p0){
       LiveCommonRoutePopupStrategy obj = PatchProxy.applyOneRefs(p0, this, LiveKrnDialogManager.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       LiveKrnDialogManager.G(this, "canShow", null, "disabled: "+this.b+' '+p0+" showingDialogs: "+this.c.size(), 2, null);
       boolean b = false;
       if (this.b != null) {
          return b;
       }
       obj = p0.pendingStrategy;
       if (obj != null) {
          if (obj != 1) {
             if (obj == 2 && this.c.size() >= 2) {
             label_0075 :
                return b;
             }
          }else if(this.c.isEmpty() && (SystemClock.uptimeMillis() - this.e) - p0.minIntervalMs >= 0){
          }
       }
       b = true;
       goto label_0075 ;
    }
    public final void w(String p0,Uri p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveKrnDialogManager.class, "10")) {
          return;
       }
       b.e0(LiveJsBridgeLogTag.RN, "LiveKrnDialogManager", "op", p0, "uri", String.valueOf(p1), "msg", String.valueOf(p2));
       return;
    }
    public final void y0(){
       if (PatchProxy.applyVoid(null, this, LiveKrnDialogManager.class, "7")) {
          return;
       }
       LiveKrnDialogManager.G(this, "tryShowNextDialog", null, null, 6, null);
       if (this.b != null) {
          return;
       }
       if (this.f != null) {
          return;
       }
       LiveKrnDialogManager$b uob = this.d.peek();
       if (uob != null) {
          this.f = true;
          a.f(this.N(), null, null, new LiveKrnDialogManager$tryShowNextDialog$1(this, uob, null), 3, null);
       }
       return;
    }
}
