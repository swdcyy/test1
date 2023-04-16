package com.kuaishou.live.lite.krn.LiveLiteKrnPresenter;
import b93.d;
import com.kuaishou.live.lite.krn.LiveLiteKrnPresenter$a;
import nsd.u;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Class;
import vq5.d;
import xp5.g;
import xp5.i;
import mq5.b;
import o63.a;
import java.lang.Object;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.krn.LiveLiteKrnPresenter$a$a;
import java.util.Map;
import s63.q;
import kotlin.jvm.internal.a;
import lp3.e;
import o56.a;
import w51.a;
import com.kuaishou.live.lite.krn.RouterScanDebugTool;
import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import c93.b;
import java.util.Iterator;
import lp3.c;
import s51.c;
import ub3.b;
import d93.a;
import e93.c;
import rp5.a;
import ub3.a;

public final class LiveLiteKrnPresenter extends d	// class@0009df
{
    public RouterScanDebugTool A;
    public final ConcurrentHashMap v;
    public final List w;
    public q x;
    public d y;
    public g z;
    public static final LiveLiteKrnPresenter$a B;

    static {
       LiveLiteKrnPresenter.B = new LiveLiteKrnPresenter$a(null);
    }
    public void LiveLiteKrnPresenter(){
       super();
       this.v = new ConcurrentHashMap();
       Class[] uClassArray = new Class[]{d.class,g.class,i.class,b.class,a.class};
       this.w = CollectionsKt__CollectionsKt.L(uClassArray);
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, LiveLiteKrnPresenter.class, "7")) {
          return;
       }
       super.F8();
       LiveLiteKrnPresenter$a$a uoa$a = new LiveLiteKrnPresenter$a$a(this.v);
       LiveLiteKrnPresenter ty = this.y;
       String str = "routerManager";
       if (ty == null) {
          a.S(str);
       }
       this.x = new q(uoa$a, ty);
       if (a.d() && a.x()) {
          Activity activity = this.getActivity();
          a.o(activity, "activity");
          Lifecycle lifecycle = this.getLifecycle();
          a.o(lifecycle, "lifecycle");
          LiveLiteKrnPresenter ty1 = this.y;
          if (ty1 == null) {
             a.S(str);
          }
          LiveLiteKrnPresenter tz = this.z;
          if (tz == null) {
             a.S("liveInfoManager");
          }
          this.A = new RouterScanDebugTool(activity, lifecycle, ty1, tz);
       }
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, LiveLiteKrnPresenter.class, "8")) {
          return;
       }
       LiveLiteKrnPresenter tx = this.x;
       if (tx == null) {
          a.S("krnRouterHandler");
       }
       tx.a();
       this.v.clear();
       return;
    }
    public void X8(b p0){
       LiveLiteKrnPresenter liveLiteKrnP = LiveLiteKrnPresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, liveLiteKrnP, "1")) {
          return;
       }
       a.p(p0, "provider");
       Iterator iterator = this.w.iterator();
       while (iterator.hasNext()) {
          Class uClass = iterator.next();
          if (PatchProxy.applyVoidTwoRefs(p0, uClass, this, liveLiteKrnP, "5")) {
             continue ;
          }
          this.v.put(uClass, p0.a(uClass));
       }
       this.y = p0.a(d.class);
       this.z = p0.a(g.class);
       LiveLiteKrnPresenter ty = this.y;
       if (ty == null) {
          a.S("routerManager");
       }
       if (!PatchProxy.applyVoidOneRefs(ty, this, liveLiteKrnP, "6")) {
          this.v.put(c.class, new b(ty));
       }
       return;
    }
    public void Y8(a p0){
       LiveLiteKrnPresenter liveLiteKrnP = LiveLiteKrnPresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, liveLiteKrnP, "2")) {
          return;
       }
       a.p(p0, "provider");
       c uoc = p0.a(c.class);
       if (!PatchProxy.applyVoidOneRefs(uoc, this, liveLiteKrnP, "3")) {
          this.v.put(a.class, new a(this, uoc));
       }
       return;
    }
}
