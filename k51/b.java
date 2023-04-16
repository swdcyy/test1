package k51.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import k51.a;
import msd.a;
import kotlin.jvm.internal.a;
import java.lang.System;
import o56.a;
import android.os.Trace;
import nsd.c0;
import com.yxcorp.utility.SystemUtil;
import com.kuaishou.android.live.log.LiveLogTag;
import nsd.r0;
import java.lang.Float;
import java.util.Arrays;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Runnable;
import n51.a;
import java.lang.Boolean;
import k51.b$a;
import java.util.concurrent.Future;
import t45.c;
import msd.l;
import crd.b;
import brd.t;
import t45.d;
import brd.z;
import k51.b$b;
import erd.o;
import k51.b$c;
import android.content.Context;
import android.view.ViewGroup;
import android.view.View;
import com.kuaishou.ax2c.PreLoader;
import com.kuaishou.ax2c.PreLoader$InflateListener;
import java.util.Objects;
import android.widget.FrameLayout;
import i2b.a;

public final class b	// class@002c8f
{

    public static final int a(int p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), null, uob, "10");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (a.i()) {
          p0 = p1;
       }
       return p0;
    }
    public static final Object b(String p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "name");
       a.p(p1, "action");
       long l = System.nanoTime();
       if (a.d()) {
          Trace.beginSection(p0);
       }
       p1 = p1.invoke();
       c0.d(1);
       if (a.d()) {
          Trace.endSection();
       }
       c0.c(1);
       float f = (float)(System.nanoTime() - l) / 1000000.00f;
       if (a.d() && !SystemUtil.R()) {
          Object[] objArray = new Object[]{p0,Float.valueOf(f)};
          p0 = String.format("%s - %.3fms", Arrays.copyOf(objArray, 2));
          a.o(p0, "java.lang.String.format\(format, *args\)");
          b.Z(LiveLogTag.LIVE_PERFORMANCE, p0);
       }
       return p1;
    }
    public static final Object c(String p0,Runnable p1,boolean p2,a p3,a p4){
       b$a obj1;
       b uob = b.class;
       Object obj = null;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),p3,p4};
          obj1 = PatchProxy.apply(objArray, obj, uob, "8");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       a.p(p0, "taskName");
       a.p(p1, "task");
       obj1 = new b$a(p0, p1, p4);
       if (p2 && p3 != null) {
          obj = p3.c(p0, obj1);
       }else {
          obj1.run();
       }
       return obj;
    }
    public static final Future d(Runnable p0,boolean p1){
       b uob = b.class;
       Future uFuture = null;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), uFuture, uob, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "runnable");
       if (p1) {
          uFuture = c.k(p0);
       }else {
          p0.run();
       }
       return uFuture;
    }
    public static final b e(a p0,l p1,boolean p2){
       b uob;
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, b.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "asyncTask");
       a.p(p1, "mainTask");
       if (p2) {
          uob = t.just(Integer.valueOf(0)).observeOn(d.c).map(new b$b(p0)).observeOn(d.a).map(new b$c(p1)).subscribe();
       }else {
          p1.invoke(p0.invoke());
          uob = null;
       }
       return uob;
    }
    public static final View f(Context p0,int p1,ViewGroup p2,boolean p3,boolean p4){
       View orWait;
       FrameLayout uFrameLayout;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,Boolean.valueOf(p3),Boolean.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, null, uob, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "context");
       if (p4) {
          orWait = PreLoader.getInstance().getOrWait(p0, p1, p2, p3, true, null);
          Objects.requireNonNull(orWait, "null cannot be cast to non-null type T");
       }else if(!p3 && p2 == null){
          uFrameLayout = new FrameLayout(p0);
       }
       orWait = a.d(p0, p1, uFrameLayout, p3);
       Objects.requireNonNull(orWait, "null cannot be cast to non-null type T");
       return orWait;
    }
    public static final View g(Context p0,int p1,boolean p2){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), null, b.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return b.f(p0, p1, null, false, p2);
    }
}
