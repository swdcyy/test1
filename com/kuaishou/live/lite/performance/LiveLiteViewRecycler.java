package com.kuaishou.live.lite.performance.LiveLiteViewRecycler;
import com.kuaishou.live.lite.performance.LiveLiteViewRecycler$b;
import com.kuaishou.live.lite.performance.LiveLiteViewRecycler$viewCacheMap$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.lite.performance.LiveLiteViewRecycler$reporter$2;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.live.lite.performance.LiveLiteViewRecycler$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Map;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.LinkedList;
import java.util.List;
import trd.y;
import fc3.a;
import android.view.View;
import ec3.s;
import msd.l;
import java.lang.Integer;
import android.view.ViewParent;
import android.view.TouchDelegate;

public final class LiveLiteViewRecycler	// class@000a3d
{
    public static final c a;
    public static final p b;
    public static final p c;
    public static final LiveLiteViewRecycler d;

    static {
       LiveLiteViewRecycler.d = new LiveLiteViewRecycler();
       LiveLiteViewRecycler.a = LiveLiteViewRecycler$b.b;
       LiveLiteViewRecycler.b = s.c(LiveLiteViewRecycler$viewCacheMap$2.INSTANCE);
       LiveLiteViewRecycler.c = s.c(LiveLiteViewRecycler$reporter$2.INSTANCE);
    }
    public void LiveLiteViewRecycler(){
       super();
    }
    public final LiveLiteViewRecycler$a a(String p0,a p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveLiteViewRecycler liveLiteView = LiveLiteViewRecycler.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, liveLiteView, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "viewType");
       a.p(p1, "factory");
       Map map = this.c();
       LinkedList linkedList = map.get(p0);
       if (linkedList == null) {
          b.c0(LiveLiteViewRecycler.a, "getOrCreateView: init viewType", "viewType", p0);
          linkedList = new LinkedList();
          map.put(p0, linkedList);
       }
       LiveLiteViewRecycler$a uoa = y.M0(linkedList);
       if (uoa != null) {
          LiveLiteViewRecycler.d.b().a("GET_VIEW_FROM_CACHE", p0);
       }else {
          Object obj1 = PatchProxy.applyTwoRefs(p0, p1, this, liveLiteView, "6");
          if (obj1 != patchProxyRe) {
             uoa = obj1;
          }else {
             b.c0(LiveLiteViewRecycler.a, "createRecyclableView", "viewType", p0);
             this.b().a("CREATE_VIEW", p0);
             uoa = new s(p0, p1.invoke());
          }
       }
       b.c0(LiveLiteViewRecycler.a, "getOrCreateView", "recyclableView", uoa.a());
       return uoa;
    }
    public final a b(){
       Object obj = PatchProxy.apply(null, this, LiveLiteViewRecycler.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveLiteViewRecycler.c.getValue();
    }
    public final Map c(){
       Object obj = PatchProxy.apply(null, this, LiveLiteViewRecycler.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveLiteViewRecycler.b.getValue();
    }
    public final void d(LiveLiteViewRecycler$a p0,l p1){
       c a;
       boolean b;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteViewRecycler.class, "4")) {
          return;
       }
       String str = "recyclableView";
       a.p(p0, str);
       a.p(p1, "onViewRecycled");
       a = LiveLiteViewRecycler.a;
       b.c0(a, "recycleView", str, p0.a());
       Map map = this.c();
       String viewType = p0.getViewType();
       LinkedList linkedList = map.get(viewType);
       if (linkedList == null) {
          b.c0(a, "recycleView: init viewType", "viewType", p0.getViewType());
          linkedList = new LinkedList();
          map.put(viewType, linkedList);
       }
       b = (linkedList.size() < 5)? true: false;
       if (!b) {
          linkedList = null;
       }
       if (linkedList != null) {
          if (linkedList.contains(p0)) {
             b.c0(a, "recycleView: recycle fail, add duplicate view!", str, p0.a());
             LiveLiteViewRecycler.d.b().a("RECYCLE_FAIL_DUPLICATE_VIEW", p0.getViewType());
          }else {
             p1.invoke(p0.getView());
             p0.b();
             linkedList.add(p0);
             LiveLiteViewRecycler.d.b().a("RECYCLE_SUCCESS", p0.getViewType());
             b.c0(a, "recycleView: recycle success", "cache list size", Integer.valueOf(linkedList.size()));
          }
       }else {
          this.b().a("RECYCLE_FAIL_EXCEED_LIMIT", p0.getViewType());
       }
       return;
    }
    public final void e(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteViewRecycler.class, "7")) {
          return;
       }
       a.p(p0, "$this$resetTouchDelegate");
       ViewParent parent = p0.getParent();
       if (!parent instanceof View) {
          parent = null;
       }
       if (parent != null) {
          parent.setTouchDelegate(null);
       }
       return;
    }
}
